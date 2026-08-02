package xsna;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Size;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* compiled from: VKCacheKeyFactory.java */
/* loaded from: classes.dex */
public final class qar0 extends ecl {
    public static qar0 e;
    public final Pattern c = Pattern.compile("^https://[a-z0-9\\-.]+\\.userapi.com.?");
    public final m900<String, Uri> d = new m900<>(384);

    public static synchronized qar0 g() {
        qar0 qar0Var;
        synchronized (qar0.class) {
            try {
                if (e == null) {
                    e = new qar0();
                }
                qar0Var = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qar0Var;
    }

    @Nullable
    public static Size h(@Nullable String str) {
        int indexOf;
        if (TextUtils.isEmpty(str) || (indexOf = str.indexOf(120)) == -1) {
            return null;
        }
        try {
            return new Size(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.a(th);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
    
        if (r1.startsWith("http://" + xsna.a0a.d + "/doc") != false) goto L25;
     */
    @Override // xsna.ecl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Uri b(Uri uri) {
        String str = null;
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        Uri uri3 = this.d.get(uri2);
        if (uri3 != null) {
            return uri3;
        }
        if (this.c.matcher(uri2).lookingAt()) {
            String path = uri.getPath();
            String query = uri.getQuery();
            String queryParameter = uri.getQueryParameter("c_uniq_tag");
            String queryParameter2 = uri.getQueryParameter("u");
            Size h = h(uri.getQueryParameter(MLFeatureConfigProviderBase.CHECKSUM_KEY));
            StringBuilder sb = new StringBuilder("vk-image-cache");
            if (queryParameter != null) {
                sb.append("?c_uniq_tag=");
                sb.append(queryParameter);
            } else if (queryParameter2 == null || h == null) {
                if (path != null) {
                    sb.append(path);
                }
                if (query != null) {
                    sb.append('?');
                    sb.append(query);
                }
            } else {
                sb.append("?u=");
                sb.append(queryParameter2);
                sb.append("&cs=");
                sb.append(h.getWidth());
                sb.append("x0");
            }
            uri = Uri.parse(sb.toString());
        } else {
            if (!uri2.startsWith("https://" + a0a.d + "/doc")) {
            }
            if (uri2.contains("?")) {
                uri = Uri.parse(uri2.substring(0, uri2.indexOf("?")));
            }
        }
        try {
            str = uri.getQueryParameter("client_cache_source");
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb2 = new StringBuilder();
            Locale locale = Locale.US;
            sb2.append("[cachesource-" + str + X3.j.e);
            sb2.append(jeq0.e(uri, "client_cache_source"));
            try {
                uri = Uri.parse(sb2.toString());
            } catch (Throwable th) {
                com.vk.metrics.eventtracking.b.a.q(new IllegalArgumentException("Can't parse uri for the cache key", th));
            }
        }
        this.d.put(uri2, uri);
        return uri;
    }

    @Override // xsna.ecl
    public final ww8 c(Uri uri) {
        return f(uri);
    }

    public final ww8 f(Uri uri) {
        Size h;
        clw clwVar = null;
        if (uri.getQueryParameter("c_uniq_tag") == null && uri.getQueryParameter("u") == null) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.contains("impg") || pathSegments.contains("impc") || pathSegments.contains("impf")) {
                String queryParameter = uri.getQueryParameter("size");
                if (!TextUtils.isEmpty(queryParameter) && (h = h(queryParameter)) != null) {
                    try {
                        String query = jeq0.e(uri, "size").getQuery();
                        String uri2 = b(uri).toString();
                        int width = h.getWidth();
                        int height = h.getHeight();
                        String path = uri.getPath();
                        if (query == null) {
                            query = "";
                        }
                        clwVar = new clw(uri2, width, height, path, query);
                    } catch (Throwable th) {
                        com.vk.metrics.eventtracking.b.a.a(th);
                    }
                }
            }
        }
        return clwVar == null ? new ppj0(b(uri).toString()) : clwVar;
    }
}
