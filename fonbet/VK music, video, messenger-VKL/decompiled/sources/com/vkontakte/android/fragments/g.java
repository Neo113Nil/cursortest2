package com.vkontakte.android.fragments;

import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.os.Parcelable;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.FragmentActivity;
import com.vk.log.L;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import me.zhanghai.android.materialprogressbar.MaterialProgressBar;
import xsna.bir0;
import xsna.gzs;
import xsna.h7u0;
import xsna.izs;
import xsna.j6r0;
import xsna.kjx0;
import xsna.s3q0;
import xsna.xwk;

/* compiled from: WebViewFragment.java */
/* loaded from: classes7.dex */
public final class g extends bir0 {
    public final /* synthetic */ WebViewFragment e;

    /* compiled from: WebViewFragment.java */
    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return kjx0.a(webView) || super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            xwk.d().e().a(g.this.e.getActivity(), str);
            webView.destroy();
            return true;
        }
    }

    /* compiled from: WebViewFragment.java */
    public class b implements DialogInterface.OnClickListener {
        public final /* synthetic */ GeolocationPermissions.Callback b;
        public final /* synthetic */ String c;

        public b(String str, GeolocationPermissions.Callback callback) {
            this.b = callback;
            this.c = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            this.b.invoke(this.c, false, false);
        }
    }

    /* compiled from: WebViewFragment.java */
    public class c implements DialogInterface.OnClickListener {
        public final /* synthetic */ GeolocationPermissions.Callback b;
        public final /* synthetic */ String c;

        public c(String str, GeolocationPermissions.Callback callback) {
            this.b = callback;
            this.c = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            this.b.invoke(this.c, true, true);
        }
    }

    /* compiled from: WebViewFragment.java */
    public class d implements gzs<s3q0> {
        public final /* synthetic */ WebChromeClient.FileChooserParams b;

        public d(WebChromeClient.FileChooserParams fileChooserParams) {
            this.b = fileChooserParams;
        }

        @Override // xsna.gzs
        @TargetApi(21)
        public final s3q0 invoke() {
            WebViewFragment webViewFragment = g.this.e;
            WebChromeClient.FileChooserParams fileChooserParams = this.b;
            Intent createIntent = fileChooserParams.createIntent();
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            boolean z2 = false;
            for (String str : fileChooserParams.getAcceptTypes()) {
                z = z || str.contains("image");
                z2 = z2 || str.contains("video");
            }
            Intent intent = null;
            if (z) {
                Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
                if (intent2.resolveActivity(webViewFragment.getActivity().getPackageManager()) != null) {
                    Uri N = com.vk.core.files.a.N(com.vk.core.files.a.s());
                    webViewFragment.I0 = N;
                    intent2.putExtra("output", N);
                } else {
                    intent2 = null;
                }
                if (intent2 != null) {
                    arrayList.add(intent2);
                }
            }
            if (z2) {
                Intent intent3 = new Intent("android.media.action.VIDEO_CAPTURE");
                if (intent3.resolveActivity(webViewFragment.getActivity().getPackageManager()) != null) {
                    Uri N2 = com.vk.core.files.a.N(com.vk.core.files.a.u());
                    webViewFragment.J0 = N2;
                    intent3.putExtra("output", N2);
                    intent = intent3;
                }
                if (intent != null) {
                    arrayList.add(intent);
                }
            }
            Intent intent4 = new Intent("android.intent.action.CHOOSER");
            intent4.putExtra("android.intent.extra.INTENT", createIntent);
            intent4.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Intent[arrayList.size()]));
            webViewFragment.startActivityForResult(intent4, 9999);
            return s3q0.a;
        }
    }

    /* compiled from: WebViewFragment.java */
    public class e implements izs<List<String>, s3q0> {
        public e() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(List<String> list) {
            g gVar = g.this;
            ValueCallback<Uri[]> valueCallback = gVar.e.H0;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
            WebViewFragment webViewFragment = gVar.e;
            webViewFragment.H0 = null;
            webViewFragment.I0 = null;
            webViewFragment.J0 = null;
            return s3q0.a;
        }
    }

    public g(WebViewFragment webViewFragment) {
        this.e = webViewFragment;
    }

    @Override // xsna.bir0, android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        L.l("WebChromeClient", consoleMessage.message(), String.valueOf(consoleMessage.lineNumber()), consoleMessage.sourceId());
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // xsna.bir0, android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(new a());
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // xsna.bir0, android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        h7u0.a aVar = new h7u0.a(this.e.mo2getContext());
        aVar.g0(R.string.community_app_location_request_title);
        aVar.U(R.string.community_app_location_request_text);
        aVar.c0(R.string.yes, new c(str, callback));
        aVar.W(R.string.no, new b(str, callback));
        aVar.m();
    }

    @Override // xsna.bir0, android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        WebViewFragment webViewFragment = this.e;
        MaterialProgressBar materialProgressBar = webViewFragment.q0;
        if (materialProgressBar != null) {
            materialProgressBar.setProgress(i * 100);
            j6r0.c(i == 100 ? 8 : 0, webViewFragment.q0);
        }
    }

    @Override // xsna.bir0, android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        int i = WebViewFragment.O0;
        WebViewFragment webViewFragment = this.e;
        if (webViewFragment.getArguments().getString("screen_title") == null) {
            webViewFragment.setTitle(str);
        }
    }

    @Override // xsna.bir0, android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        WebViewFragment webViewFragment = this.e;
        ValueCallback<Uri[]> valueCallback2 = webViewFragment.H0;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        webViewFragment.H0 = valueCallback;
        PermissionHelper permissionHelper = PermissionHelper.a;
        FragmentActivity activity = webViewFragment.getActivity();
        permissionHelper.getClass();
        PermissionHelper.h(permissionHelper, activity, PermissionHelper.t, R.string.vk_permissions_vkui_disk_camera, R.string.vk_permissions_vkui_disk_camera_settings, new d(fileChooserParams), new e(), 64);
        return true;
    }
}
