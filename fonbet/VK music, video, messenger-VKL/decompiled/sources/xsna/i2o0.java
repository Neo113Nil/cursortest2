package xsna;

import androidx.compose.runtime.a;
import xsna.dt1;

/* compiled from: TagsListView.kt */
/* loaded from: classes18.dex */
public final class i2o0 {
    public static final void a(final j2o0 j2o0Var, final long j, final izs izsVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(552030646);
        int i2 = i | (M.J(j2o0Var) ? 4 : 2) | (M.p(j) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(552030646, i2, -1, "com.vk.dialogtags.impl.list.ui.TagsListScreen (TagsListView.kt:30)");
            }
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.d;
            q630 E = ahn.E(q630Var, "tags_list");
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new f74(izsVar, 7);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            boolean z2 = ((i2 & 14) == 4) | (i3 == 256);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new wze0(4, j2o0Var, izsVar);
                M.R(x2);
            }
            aou0.g(true, gzsVar, E, ty6Var, j, null, null, (izs) x2, M, ((i2 << 9) & 57344) | 3078, 224);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(j, izsVar, q630Var, i) { // from class: xsna.g2o0
                public final /* synthetic */ long c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ q630 e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    i2o0.a(j2o0.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
