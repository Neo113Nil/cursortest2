package xsna;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import xsna.ahx0;
import xsna.mix0;
import xsna.vix0;

/* compiled from: ApiHelperForM.java */
/* loaded from: classes12.dex */
public final class my2 {

    /* compiled from: ApiHelperForM.java */
    public class a extends WebMessagePort.WebMessageCallback {
        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public final void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            my2.d(webMessage);
            throw null;
        }
    }

    /* compiled from: ApiHelperForM.java */
    public class b extends WebMessagePort.WebMessageCallback {
        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public final void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            my2.d(webMessage);
            throw null;
        }
    }

    /* compiled from: ApiHelperForM.java */
    public class c extends WebView.VisualStateCallback {
        public final /* synthetic */ mix0.a a;

        public c(mix0.a aVar) {
            this.a = aVar;
        }

        @Override // android.webkit.WebView.VisualStateCallback
        public final void onComplete(long j) {
            this.a.onComplete(j);
        }
    }

    public static void a(@NonNull WebMessagePort webMessagePort) {
        webMessagePort.close();
    }

    @NonNull
    public static WebMessage b(@NonNull ygx0 ygx0Var) {
        WebMessagePort[] webMessagePortArr;
        String a2 = ygx0Var.a();
        ahx0[] ahx0VarArr = ygx0Var.a;
        if (ahx0VarArr == null) {
            webMessagePortArr = null;
        } else {
            int length = ahx0VarArr.length;
            WebMessagePort[] webMessagePortArr2 = new WebMessagePort[length];
            for (int i = 0; i < length; i++) {
                bhx0 bhx0Var = (bhx0) ahx0VarArr[i];
                if (bhx0Var.a == null) {
                    mjx0 mjx0Var = vix0.a.a;
                    bhx0Var.a = (WebMessagePort) ((WebkitToCompatConverterBoundaryInterface) mjx0Var.a).convertWebMessagePort(Proxy.getInvocationHandler(bhx0Var.b));
                }
                webMessagePortArr2[i] = bhx0Var.a;
            }
            webMessagePortArr = webMessagePortArr2;
        }
        return new WebMessage(a2, webMessagePortArr);
    }

    @NonNull
    public static WebMessagePort[] c(@NonNull WebView webView) {
        return webView.createWebMessageChannel();
    }

    @NonNull
    public static ygx0 d(@NonNull WebMessage webMessage) {
        ahx0[] ahx0VarArr;
        String data = webMessage.getData();
        WebMessagePort[] ports = webMessage.getPorts();
        if (ports == null) {
            ahx0VarArr = null;
        } else {
            ahx0[] ahx0VarArr2 = new ahx0[ports.length];
            for (int i = 0; i < ports.length; i++) {
                WebMessagePort webMessagePort = ports[i];
                bhx0 bhx0Var = new bhx0();
                bhx0Var.a = webMessagePort;
                ahx0VarArr2[i] = bhx0Var;
            }
            ahx0VarArr = ahx0VarArr2;
        }
        return new ygx0(data, ahx0VarArr);
    }

    @NonNull
    public static CharSequence e(@NonNull WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    public static int f(@NonNull WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }

    public static boolean g(@NonNull WebSettings webSettings) {
        return webSettings.getOffscreenPreRaster();
    }

    public static void h(@NonNull WebMessagePort webMessagePort, @NonNull WebMessage webMessage) {
        webMessagePort.postMessage(webMessage);
    }

    public static void i(@NonNull WebView webView, long j, @NonNull mix0.a aVar) {
        webView.postVisualStateCallback(j, new c(aVar));
    }

    public static void j(@NonNull WebView webView, @NonNull WebMessage webMessage, @NonNull Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }

    public static void k(@NonNull WebSettings webSettings, boolean z) {
        webSettings.setOffscreenPreRaster(z);
    }

    public static void l(@NonNull WebMessagePort webMessagePort, @NonNull ahx0.a aVar) {
        webMessagePort.setWebMessageCallback(new a());
    }

    public static void m(@NonNull WebMessagePort webMessagePort, @NonNull ahx0.a aVar, @Nullable Handler handler) {
        webMessagePort.setWebMessageCallback(new b(), handler);
    }
}
