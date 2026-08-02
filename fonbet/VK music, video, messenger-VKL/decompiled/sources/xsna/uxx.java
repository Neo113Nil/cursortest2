package xsna;

import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* compiled from: JavaScriptReplyProxyImpl.java */
/* loaded from: classes12.dex */
public final class uxx implements Callable<Object> {
    public final /* synthetic */ JsReplyProxyBoundaryInterface b;

    public uxx(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.b = jsReplyProxyBoundaryInterface;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        vxx vxxVar = new vxx();
        vxxVar.a = this.b;
        return vxxVar;
    }
}
