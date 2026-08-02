package xsna;

import androidx.compose.runtime.a;
import xsna.o4q0;

/* compiled from: ResultUnlinkedBidProfileModal.kt */
/* loaded from: classes18.dex */
public final class zdg0 {
    public static final void a(final o4q0.a aVar, final boolean z, final gzs<s3q0> gzsVar, final gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar2, final int i) {
        androidx.compose.runtime.a M = aVar2.M(811846033);
        int i2 = (M.J(aVar) ? 4 : 2) | i | (M.y(gzsVar) ? 256 : 128) | (M.y(gzsVar2) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(811846033, i2, -1, "com.vk.ecomm.verifiedseller.impl.screens.obtainverification.ui.modal.ResultUnlinkedBidProfileModal (ResultUnlinkedBidProfileModal.kt:26)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new xdg0(aVar, z, gzsVar, gzsVar2);
                M.R(x);
            }
            xdg0 xdg0Var = (xdg0) x;
            ((zak0) xdg0Var.a).setValue(aVar);
            ((zak0) xdg0Var.b).setValue(Boolean.valueOf(z));
            ((zak0) xdg0Var.c).setValue(gzsVar);
            ((zak0) xdg0Var.d).setValue(gzsVar2);
            xdg0Var.a(0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, gzsVar, gzsVar2, i) { // from class: xsna.ydg0
                public final /* synthetic */ boolean c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ gzs e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(49);
                    zdg0.a(o4q0.a.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
