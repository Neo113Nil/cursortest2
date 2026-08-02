package xsna;

import androidx.compose.runtime.a;
import xsna.mno0;
import xsna.pd30;

/* compiled from: MovieHeaderCatalogView.kt */
/* loaded from: classes.dex */
public final class td30 extends m2a<yd30, pd30, smk> {

    /* compiled from: Effects.kt */
    /* loaded from: classes16.dex */
    public static final class a implements kgn {
        public final /* synthetic */ izs a;
        public final /* synthetic */ yd30 b;

        public a(izs izsVar, yd30 yd30Var) {
            this.a = izsVar;
            this.b = yd30Var;
        }

        @Override // xsna.kgn
        public final void dispose() {
            this.a.invoke(new pd30.a(this.b.b, false));
        }
    }

    @Override // xsna.m2a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(final a8a a8aVar, final yd30 yd30Var, final izs izsVar, final ksr ksrVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-888316869);
        if ((i & 48) == 0) {
            i2 = (M.J(yd30Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 8337) != 8336)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-888316869, i2, -1, "com.vk.catalog.mvi.block.video.impl.movies.detail.header.MovieHeaderCatalogView.MovieHeaderView.ContentImpl (MovieHeaderCatalogView.kt:109)");
            }
            s3q0 s3q0Var = s3q0.a;
            int i3 = i2 & 896;
            int i4 = i2 & 112;
            boolean z = (i3 == 256) | (i4 == 32);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new qd1(22, izsVar, yd30Var);
                M.R(x);
            }
            bap.c(s3q0Var, (izs) x, M, 6);
            mno0.i iVar = yd30Var.c;
            mno0 mno0Var = yd30Var.d;
            boolean z2 = (i3 == 256) | (i4 == 32);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new mu1(18, izsVar, yd30Var);
                M.R(x2);
            }
            xd30.a(iVar, mno0Var, (izs) x2, q630Var, M, (i2 >> 3) & 7168);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new wzs() { // from class: xsna.sd30
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    td30.this.b(a8aVar, yd30Var, izsVar, ksrVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            });
        }
    }
}
