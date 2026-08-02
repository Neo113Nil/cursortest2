package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import xsna.o4q0;

/* compiled from: ResultUnlinkedBidProfileModal.kt */
/* loaded from: classes18.dex */
public final class xdg0 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e = androidx.compose.runtime.k.b(null);

    /* compiled from: Effects.kt */
    public static final class a implements kgn {
        public a() {
        }

        @Override // xsna.kgn
        public final void dispose() {
            dw20 dw20Var = (dw20) ((zak0) xdg0.this.e).getValue();
            if (dw20Var != null) {
                dw20Var.dismiss();
            }
        }
    }

    public xdg0(o4q0.a aVar, boolean z, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        this.a = androidx.compose.runtime.k.b(aVar);
        this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.c = androidx.compose.runtime.k.b(gzsVar);
        this.d = androidx.compose.runtime.k.b(gzsVar2);
    }

    public final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(816759555);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(816759555, i2, -1, "com.vk.ecomm.verifiedseller.impl.screens.obtainverification.ui.modal.ResultUnlinkedBidProfileModalImpl.Content (ResultUnlinkedBidProfileModal.kt:56)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            o4q0.a aVar2 = (o4q0.a) ((zak0) this.a).getValue();
            Boolean bool = (Boolean) ((zak0) this.b).getValue();
            bool.booleanValue();
            boolean y = M.y(context) | ((i2 & 14) == 4);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new k22(20, this, context);
                M.R(x);
            }
            bap.b(aVar2, bool, (izs) x, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zu3(this, i, 15);
        }
    }
}
