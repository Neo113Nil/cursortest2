package com.yandex.payment.sdk.ui.view;

import android.content.Context;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.widget.FrameLayout;
import com.yandex.payment.sdk.ui.common.TrustedUrl;
import defpackage.a88;
import defpackage.z78;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&¢\u0006\u0004\b\r\u0010\u0012J-\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000bH&¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\bH&¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020\b2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H&¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/yandex/payment/sdk/ui/view/Card3DSWebView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "isDebug", "Lzy11;", "setDebug", "(Z)V", "", "url", "loadUrl", "(Ljava/lang/String;)V", "", "Lcom/yandex/payment/sdk/ui/common/TrustedUrl;", "trustedUrls", "(Ljava/lang/String;Ljava/util/List;)V", "isRestoring", "(Ljava/lang/String;Ljava/util/List;Z)V", "La88;", "client", "setWebViewClient", "(La88;)V", "Lz78;", "getSettings", "()Lz78;", "", "obj", "interfaceName", "addJavascriptInterface", "(Ljava/lang/Object;Ljava/lang/String;)V", "destroy", "()V", "Landroid/webkit/SslErrorHandler;", "handler", "Landroid/net/http/SslError;", "error", "onSslError", "(Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class Card3DSWebView extends FrameLayout {
    public Card3DSWebView(Context context) {
        super(context);
    }

    public abstract void addJavascriptInterface(Object obj, String interfaceName);

    public abstract void destroy();

    public abstract z78 getSettings();

    public abstract void loadUrl(String url);

    public abstract void loadUrl(String url, List<TrustedUrl> trustedUrls);

    public abstract void loadUrl(String url, List<TrustedUrl> trustedUrls, boolean isRestoring);

    public abstract void onSslError(SslErrorHandler handler, SslError error);

    public abstract void setDebug(boolean isDebug);

    public abstract void setWebViewClient(a88 client);
}
