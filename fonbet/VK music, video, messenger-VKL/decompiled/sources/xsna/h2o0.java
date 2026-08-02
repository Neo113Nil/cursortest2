package xsna;

import androidx.compose.runtime.a;
import xsna.j2o0;
import xsna.q630;

/* compiled from: TagsListView.kt */
/* loaded from: classes18.dex */
public final class h2o0 implements znj {
    public final /* synthetic */ j2o0.a b;
    public final /* synthetic */ izs<com.vk.dialogtags.impl.list.a, s3q0> c;

    /* JADX WARN: Multi-variable type inference failed */
    public h2o0(j2o0.a aVar, izs<? super com.vk.dialogtags.impl.list.a, s3q0> izsVar) {
        this.b = aVar;
        this.c = izsVar;
    }

    @Override // xsna.znj
    public final void g(znj znjVar, androidx.compose.runtime.a aVar, int i) {
        znj znjVar2;
        lg90 o;
        androidx.compose.runtime.a M = aVar.M(48390484);
        int i2 = (M.J(znjVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(48390484, i2, -1, "com.vk.dialogtags.impl.list.ui.TagsListScreen.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (TagsListView.kt:42)");
            }
            j2o0.a aVar2 = this.b;
            q630 E = ahn.E(q630.a.a, "dialog_tag_".concat(aVar2.b));
            float f = 20;
            lqv B = znk0.B(new ycc(aVar2.c, 3), 0L, byc0.b(f, f), M, 197000, 26);
            lzo0 d = nzo.d(3072, 6, M, aVar2.b, false);
            if (aVar2.d) {
                M.K(-741359264);
                qzu0.a.getClass();
                o = qzu0.p(M);
            } else {
                M.K(-741358431);
                qzu0.a.getClass();
                o = qzu0.o(M);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            lqv m = fto0.m(o, ylu0Var.getIcon().a, M, 28);
            izs<com.vk.dialogtags.impl.list.a, s3q0> izsVar = this.c;
            boolean J = M.J(izsVar) | M.J(aVar2);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new qg1(21, izsVar, aVar2);
                M.R(x);
            }
            znjVar2 = znjVar;
            aou0.d(znjVar2, (gzs) x, E, null, false, B, d, m, M, i2 & 14, 12);
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
            s.d = new cx(this, znjVar2, i, 16);
        }
    }
}
