package xsna;

import android.net.Uri;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;
import org.chromium.support_lib_boundary.util.Features;
import xsna.mix0;

/* compiled from: WebMessageListenerAdapter.java */
/* loaded from: classes12.dex */
public final class zgx0 implements WebMessageListenerBoundaryInterface {
    public mix0.b b;

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @NonNull
    public final String[] getSupportedFeatures() {
        return new String[]{Features.WEB_MESSAGE_LISTENER, Features.WEB_MESSAGE_ARRAY_BUFFER};
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPostMessage(@NonNull WebView webView, @NonNull InvocationHandler invocationHandler, @NonNull Uri uri, boolean z, @NonNull InvocationHandler invocationHandler2) {
        ygx0 ygx0Var;
        ygx0 ygx0Var2;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        ahx0[] ahx0VarArr = new ahx0[ports.length];
        for (int i = 0; i < ports.length; i++) {
            InvocationHandler invocationHandler3 = ports[i];
            bhx0 bhx0Var = new bhx0();
            bhx0Var.b = (WebMessagePortBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebMessagePortBoundaryInterface.class, invocationHandler3);
            ahx0VarArr[i] = bhx0Var;
        }
        if (oix0.e.c()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type == 0) {
                ygx0Var = new ygx0(webMessagePayloadBoundaryInterface.getAsString(), ahx0VarArr);
            } else {
                if (type != 1) {
                    ygx0Var2 = null;
                    if (ygx0Var2 == null) {
                        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                        this.b.onPostMessage(webView, ygx0Var2, uri, z, (vxx) jsReplyProxyBoundaryInterface.getOrCreatePeer(new uxx(jsReplyProxyBoundaryInterface)));
                        return;
                    }
                    return;
                }
                ygx0Var = new ygx0(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), ahx0VarArr);
            }
        } else {
            ygx0Var = new ygx0(webMessageBoundaryInterface.getData(), ahx0VarArr);
        }
        ygx0Var2 = ygx0Var;
        if (ygx0Var2 == null) {
        }
    }
}
