package com.adjust.sdk;

import android.net.Uri;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes10.dex */
public final class AdjustLinkResolution {
    private static volatile ExecutorService executor = null;
    private static final String[] expectedUrlHostSuffixArray = {"adjust.com", "adj.st", "go.link"};
    private static final int maxRecursions = 10;

    public interface AdjustLinkResolutionCallback {
        void resolvedLinkCallback(Uri uri);
    }

    public class a implements Runnable {
        public final /* synthetic */ URL a;
        public final /* synthetic */ AdjustLinkResolutionCallback b;

        public a(URL url, AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
            this.a = url;
            this.b = adjustLinkResolutionCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AdjustLinkResolution.requestAndResolve(this.a, 0, this.b);
        }
    }

    private AdjustLinkResolution() {
    }

    private static URL convertToHttps(URL url) {
        String externalForm;
        if (url != null && (externalForm = url.toExternalForm()) != null && externalForm.startsWith("http:")) {
            try {
                return new URL("https:".concat(externalForm.substring(5)));
            } catch (MalformedURLException unused) {
            }
        }
        return url;
    }

    private static Uri convertToUri(URL url) {
        if (url == null) {
            return null;
        }
        return Uri.parse(url.toString());
    }

    private static boolean isTerminalUrl(String str) {
        return urlMatchesSuffix(str, expectedUrlHostSuffixArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        if (r1 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void requestAndResolve(URL url, int i, AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
        HttpURLConnection httpURLConnection;
        URL convertToHttps = convertToHttps(url);
        URL url2 = null;
        try {
            httpURLConnection = (HttpURLConnection) convertToHttps.openConnection();
            try {
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.connect();
                String headerField = httpURLConnection.getHeaderField("Location");
                if (headerField != null) {
                    url2 = new URL(headerField);
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            httpURLConnection = null;
        }
        httpURLConnection.disconnect();
        resolveLink(url2, convertToHttps, i + 1, adjustLinkResolutionCallback);
    }

    public static void resolveLink(String str, String[] strArr, AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
        URL url;
        if (adjustLinkResolutionCallback == null) {
            return;
        }
        if (str == null) {
            adjustLinkResolutionCallback.resolvedLinkCallback(null);
            return;
        }
        try {
            url = new URL(str);
        } catch (MalformedURLException unused) {
            url = null;
        }
        if (url == null) {
            adjustLinkResolutionCallback.resolvedLinkCallback(null);
            return;
        }
        if (!urlMatchesSuffix(url.getHost(), strArr)) {
            adjustLinkResolutionCallback.resolvedLinkCallback(convertToUri(url));
            return;
        }
        if (executor == null) {
            synchronized (expectedUrlHostSuffixArray) {
                try {
                    if (executor == null) {
                        executor = Executors.newSingleThreadExecutor();
                    }
                } finally {
                }
            }
        }
        executor.execute(new a(url, adjustLinkResolutionCallback));
    }

    private static boolean urlMatchesSuffix(String str, String[] strArr) {
        if (str == null || strArr == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (str.endsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private static void resolveLink(URL url, URL url2, int i, AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
        Uri convertToUri;
        if (url == null) {
            convertToUri = convertToUri(url2);
        } else {
            if (!isTerminalUrl(url.getHost()) && i <= 10) {
                requestAndResolve(url, i, adjustLinkResolutionCallback);
                return;
            }
            convertToUri = convertToUri(url);
        }
        adjustLinkResolutionCallback.resolvedLinkCallback(convertToUri);
    }
}
