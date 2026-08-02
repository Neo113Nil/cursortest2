package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.aww0;
import xsna.kne0;

/* compiled from: VoipQrCodeScannerReducer.kt */
/* loaded from: classes7.dex */
public final class zvw0 extends dm50<com.vk.voip.ui.qr.ui.a, kne0, aww0> {
    @Override // xsna.dm50
    public final aww0 c(aww0 aww0Var, kne0 kne0Var) {
        aww0 aww0Var2 = aww0Var;
        kne0 kne0Var2 = kne0Var;
        if (kne0Var2 instanceof kne0.a) {
            kne0.a aVar = (kne0.a) kne0Var2;
            if (!(aww0Var2 instanceof aww0.c)) {
                return aww0Var2;
            }
            if (!(aVar instanceof kne0.a.b)) {
                if (aVar instanceof kne0.a.c) {
                    return new aww0.f.b(((kne0.a.c) aVar).b);
                }
                if (aVar instanceof kne0.a.C3189a) {
                    return new aww0.d(((kne0.a.C3189a) aVar).b);
                }
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (kne0Var2 instanceof kne0.d) {
                String str = ((kne0.d) kne0Var2).b;
                return aww0Var2 instanceof aww0.f.a ? new aww0.e.b(str) : aww0Var2 instanceof aww0.f.b ? new aww0.e.a(((aww0.f.b) aww0Var2).b, str) : aww0Var2;
            }
            if (kne0Var2 instanceof kne0.c) {
                Throwable th = ((kne0.c) kne0Var2).b;
                return aww0Var2 instanceof aww0.e.b ? new aww0.b.a(th) : aww0Var2 instanceof aww0.e.a ? new aww0.b.C2578b(((aww0.e.a) aww0Var2).b, th) : aww0Var2;
            }
            if (!(kne0Var2 instanceof kne0.e)) {
                if (kne0Var2 instanceof kne0.b) {
                    return aww0Var2 instanceof aww0.e ? aww0.a.b : aww0Var2;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (!(aww0Var2 instanceof aww0.b.a)) {
                return aww0Var2 instanceof aww0.b.C2578b ? new aww0.f.b(((aww0.b.C2578b) aww0Var2).b) : aww0Var2;
            }
        }
        return aww0.f.a.b;
    }

    @Override // xsna.dm50
    public final com.vk.voip.ui.qr.ui.a d() {
        return new com.vk.voip.ui.qr.ui.a(e(new wvw0(0)), e(new m0m0(10)), e(new j6e0(23)), e(new t9o0(9)), e(new lcq0(8)), e(new pmp0(8)));
    }

    @Override // xsna.dm50
    public final void h(aww0 aww0Var, com.vk.voip.ui.qr.ui.a aVar) {
        aww0 aww0Var2 = aww0Var;
        com.vk.voip.ui.qr.ui.a aVar2 = aVar;
        if (aww0Var2 instanceof aww0.c) {
            f(aVar2.a, aww0Var2);
            return;
        }
        if (aww0Var2 instanceof aww0.f) {
            f(aVar2.b, aww0Var2);
            return;
        }
        if (aww0Var2 instanceof aww0.e) {
            f(aVar2.c, aww0Var2);
            return;
        }
        if (aww0Var2 instanceof aww0.a) {
            f(aVar2.d, aww0Var2);
        } else if (aww0Var2 instanceof aww0.b) {
            f(aVar2.e, aww0Var2);
        } else {
            if (!(aww0Var2 instanceof aww0.d)) {
                throw new NoWhenBranchMatchedException();
            }
            f(aVar2.f, aww0Var2);
        }
    }
}
