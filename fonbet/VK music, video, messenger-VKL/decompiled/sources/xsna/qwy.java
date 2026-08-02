package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import ru.ok.gl.tf.Tensorflow;
import xsna.tok0;

/* compiled from: LazyStaggeredGridDsl.kt */
/* loaded from: classes11.dex */
public final class qwy {
    public static final void a(final tok0.a aVar, final q630 q630Var, uxy uxyVar, final u890 u890Var, float f, a.e eVar, tpr tprVar, boolean z, e490 e490Var, final izs izsVar, androidx.compose.runtime.a aVar2, final int i, final int i2) {
        int i3;
        final uxy uxyVar2;
        final float f2;
        final a.e eVar2;
        final tpr tprVar2;
        final boolean z2;
        final e490 e490Var2;
        int i4;
        tpr f3;
        e490 a;
        int i5;
        uxy uxyVar3;
        a.e eVar3;
        float f4;
        boolean z3;
        Orientation orientation;
        u890 u890Var2;
        androidx.compose.runtime.a M = aVar2.M(-578931208);
        int i6 = i | (M.J(aVar) ? 4 : 2) | (M.J(q630Var) ? 32 : 16) | 375087232;
        if ((i2 & 6) == 0) {
            i3 = i2 | (M.y(izsVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (M.t(i6 & 1, ((306783379 & i6) == 306783378 && (i3 & 3) == 2) ? false : true)) {
            M.V();
            int i7 = i & 1;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (i7 == 0 || M.i()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(161145796, 0, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState (LazyStaggeredGridState.kt:84)");
                }
                Object[] objArr = new Object[0];
                fh9 fh9Var = uxy.x;
                boolean o = M.o(0) | M.o(0);
                Object x = M.x();
                if (o || x == c0012a) {
                    i4 = -1908409217;
                    x = new ek(15);
                    M.R(x);
                } else {
                    i4 = -1908409217;
                }
                uxy uxyVar4 = (uxy) crx0.D(objArr, fh9Var, (gzs) x, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                a.j g = androidx.compose.foundation.layout.a.g(0);
                f3 = k7b0.f(6, M);
                a = g490.a(M);
                i5 = i6 & i4;
                uxyVar3 = uxyVar4;
                eVar3 = g;
                f4 = 0;
                z3 = true;
            } else {
                M.h();
                f4 = f;
                eVar3 = eVar;
                f3 = tprVar;
                z3 = z;
                a = e490Var;
                i5 = i6 & (-1908409217);
                uxyVar3 = uxyVar;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-578931208, i5, i3, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:81)");
            }
            Orientation orientation2 = Orientation.Vertical;
            float a2 = eVar3.a();
            int i8 = (i5 & 14) | Tensorflow.FRAME_WIDTH;
            if (androidx.compose.runtime.b.d()) {
                orientation = orientation2;
                androidx.compose.runtime.b.f(-1267076841, i8, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:134)");
            } else {
                orientation = orientation2;
            }
            boolean z4 = (((i8 & 14) ^ 6) > 4 && M.J(aVar)) || (i8 & 6) == 4;
            Object x2 = M.x();
            if (z4 || x2 == c0012a) {
                u890Var2 = u890Var;
                x2 = new rxy(new xce(u890Var2, aVar, eVar3, 4));
                M.R(x2);
            } else {
                u890Var2 = u890Var;
            }
            yry yryVar = (yry) x2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i9 = (i3 << 3) & 112;
            u890 u890Var3 = u890Var2;
            z2 = z3;
            tprVar2 = f3;
            e490Var2 = a;
            a.e eVar4 = eVar3;
            axy.a(uxyVar3, orientation, yryVar, q630Var, u890Var3, tprVar2, z2, e490Var2, f4, a2, izsVar, M, ((i5 << 6) & 7168) | 818110512, i9);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            eVar2 = eVar4;
            uxyVar2 = uxyVar3;
            f2 = f4;
        } else {
            M.h();
            uxyVar2 = uxyVar;
            f2 = f;
            eVar2 = eVar;
            tprVar2 = tprVar;
            z2 = z;
            e490Var2 = e490Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(q630Var, uxyVar2, u890Var, f2, eVar2, tprVar2, z2, e490Var2, izsVar, i, i2) { // from class: xsna.pwy
                public final /* synthetic */ q630 c;
                public final /* synthetic */ uxy d;
                public final /* synthetic */ u890 e;
                public final /* synthetic */ float f;
                public final /* synthetic */ a.e g;
                public final /* synthetic */ tpr h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ e490 j;
                public final /* synthetic */ izs k;
                public final /* synthetic */ int l;

                {
                    this.l = i2;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qwy.a(tok0.a.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (androidx.compose.runtime.a) obj, ne7.I(3073), ne7.I(this.l));
                    return s3q0.a;
                }
            };
        }
    }
}
