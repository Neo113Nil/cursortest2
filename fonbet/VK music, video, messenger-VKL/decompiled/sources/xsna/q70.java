package xsna;

import androidx.compose.runtime.a;
import com.vkontakte.android.R;
import xsna.dt1;
import xsna.q630;

/* compiled from: ActionsPopup.kt */
/* loaded from: classes3.dex */
public final class q70 {

    /* compiled from: ActionsPopup.kt */
    public static final class a implements znj {
        public final /* synthetic */ gzs<s3q0> b;
        public final /* synthetic */ izs<j9o0, s3q0> c;
        public final /* synthetic */ int d;

        public a(int i, gzs gzsVar, izs izsVar) {
            this.b = gzsVar;
            this.c = izsVar;
            this.d = i;
        }

        @Override // xsna.znj
        public final void g(znj znjVar, androidx.compose.runtime.a aVar, int i) {
            znj znjVar2;
            androidx.compose.runtime.a M = aVar.M(-1994368284);
            int i2 = (M.J(znjVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1994368284, i2, -1, "com.vk.messagetemplates.impl.keyboard.ui.ActionsPopup.<anonymous>.<anonymous>.<no name provided>.Content (ActionsPopup.kt:28)");
                }
                qzu0.a.getClass();
                lg90 X0 = qzu0.X0(M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                lqv B = znk0.B(X0, ylu0Var.getIcon().a, 0L, M, 196616, 28);
                lzo0 d = nzo.d(3072, 6, M, d370.N(R.string.templates_action_edit, 0, M), false);
                q630 E = ahn.E(q630.a.a, "template_action_edit");
                gzs<s3q0> gzsVar = this.b;
                boolean J = M.J(gzsVar);
                izs<j9o0, s3q0> izsVar = this.c;
                boolean J2 = J | M.J(izsVar);
                int i3 = this.d;
                boolean o = J2 | M.o(i3);
                Object x = M.x();
                if (o || x == a.C0011a.a) {
                    x = new o70(gzsVar, izsVar, i3, 0);
                    M.R(x);
                }
                znjVar2 = znjVar;
                aou0.d(znjVar2, (gzs) x, E, null, false, B, d, null, M, (i2 & 14) | 384, 76);
                M = M;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                znjVar2 = znjVar;
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new p70(this, znjVar2, i, 0);
            }
        }
    }

    /* compiled from: ActionsPopup.kt */
    public static final class b implements znj {
        public final /* synthetic */ gzs<s3q0> b;
        public final /* synthetic */ izs<j9o0, s3q0> c;
        public final /* synthetic */ int d;

        public b(int i, gzs gzsVar, izs izsVar) {
            this.b = gzsVar;
            this.c = izsVar;
            this.d = i;
        }

        @Override // xsna.znj
        public final void g(znj znjVar, androidx.compose.runtime.a aVar, int i) {
            znj znjVar2;
            androidx.compose.runtime.a M = aVar.M(-1760077285);
            int i2 = (M.J(znjVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1760077285, i2, -1, "com.vk.messagetemplates.impl.keyboard.ui.ActionsPopup.<anonymous>.<anonymous>.<no name provided>.Content (ActionsPopup.kt:39)");
                }
                qzu0.a.getClass();
                lg90 B = qzu0.B(M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                lqv B2 = znk0.B(B, ylu0Var.getIcon().h, 0L, M, 196616, 28);
                lzo0 d = nzo.d(3072, 6, M, d370.N(R.string.templates_action_delete, 0, M), false);
                q630 E = ahn.E(q630.a.a, "template_action_delete");
                gzs<s3q0> gzsVar = this.b;
                boolean J = M.J(gzsVar);
                izs<j9o0, s3q0> izsVar = this.c;
                boolean J2 = J | M.J(izsVar);
                int i3 = this.d;
                boolean o = J2 | M.o(i3);
                Object x = M.x();
                if (o || x == a.C0011a.a) {
                    x = new r70(i3, gzsVar, izsVar);
                    M.R(x);
                }
                znjVar2 = znjVar;
                aou0.d(znjVar2, (gzs) x, E, null, false, B2, d, null, M, (i2 & 14) | 384, 76);
                M = M;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                znjVar2 = znjVar;
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new s70(this, znjVar2, i, 0);
            }
        }
    }

    public static final void a(final int i, final int i2, androidx.compose.runtime.a aVar, final gzs gzsVar, final izs izsVar) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-1897705719);
        if ((i2 & 6) == 0) {
            i3 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.y(gzsVar) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1897705719, i3, -1, "com.vk.messagetemplates.impl.keyboard.ui.ActionsPopup (ActionsPopup.kt:21)");
            }
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new l70(0, gzsVar);
                M.R(x);
            }
            gzs gzsVar2 = (gzs) x;
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.g;
            boolean z2 = (i4 == 256) | ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new m70(i, gzsVar, izsVar);
                M.R(x2);
            }
            aou0.g(true, gzsVar2, null, ty6Var, 0L, null, null, (izs) x2, M, 3078, 244);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.n70
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i2 | 1);
                    q70.a(i, I, (androidx.compose.runtime.a) obj, gzsVar, izsVar);
                    return s3q0.a;
                }
            };
        }
    }
}
