package xsna;

import com.vk.superapp.bridges.SuperappUiRouterBridge;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.sir0;

/* compiled from: ImBridgeOnSpanLongPressListener.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class vxv extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vxv(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((uxv) this.receiver).c();
                break;
            case 1:
                ((io.reactivex.rxjava3.core.r) this.receiver).onComplete();
                break;
            default:
                d3a0 d3a0Var = (d3a0) this.receiver;
                d3a0Var.getClass();
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                if (superappUiRouterBridge == null) {
                    superappUiRouterBridge = null;
                }
                xpu0 xpu0Var = new xpu0(superappUiRouterBridge.u(d3a0Var.z, true));
                xpu0Var.a(new k170(d3a0Var, 5));
                d3a0Var.A = xpu0Var;
                xpu0Var.show();
                d3a0Var.t.b(mnh0.B(sir0.h(sir0.a, new sir0.e(d3a0Var.x, null, d3a0Var.c.n().a(), false, false, false, false, false, false, null, 1018)), d3a0Var.s, new w7u(d3a0Var, 27), new w110(d3a0Var, 13), null));
                break;
        }
        return s3q0.a;
    }
}
