package xsna;

import androidx.compose.foundation.text.selection.SelectedTextType;
import androidx.compose.runtime.a;
import kotlin.coroutines.EmptyCoroutineContext;
import xsna.q630;

/* compiled from: SelectionContainer.kt */
/* loaded from: classes11.dex */
public final class ici0 {

    /* compiled from: SelectionContainer.kt */
    public static final class a implements wv70, g0t {
        public final /* synthetic */ gzs b;

        public a(gzs gzsVar) {
            this.b = gzsVar;
        }

        @Override // xsna.wv70
        public final /* synthetic */ long a() {
            return ((ov70) this.b.invoke()).a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof wv70) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return this.b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(q630 q630Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        jai jaiVar2;
        androidx.compose.runtime.a M = aVar.M(1949207773);
        int i2 = i | 6;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1949207773, i2, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:56)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(null);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            obi0 obi0Var = (obi0) wh50Var.getValue();
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new dci0(0, wh50Var);
                M.R(x2);
            }
            q630.a aVar2 = q630.a.a;
            jaiVar2 = jaiVar;
            b(aVar2, obi0Var, (izs) x2, jaiVar2, M, 3462);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            jaiVar2 = jaiVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rv7(q630Var, jaiVar2, i, 7);
        }
    }

    public static final void b(final q630 q630Var, final obi0 obi0Var, izs izsVar, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        izs izsVar2;
        androidx.compose.runtime.a M = aVar.M(-917932944);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = 16;
        int i5 = i2 | (M.J(obi0Var) ? 32 : 16);
        if ((i & 3072) == 0) {
            i5 |= M.y(jaiVar) ? 2048 : 1024;
        }
        int i6 = 0;
        if (M.t(i5 & 1, (i5 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-917932944, i5, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:93)");
            }
            Object[] objArr = new Object[0];
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new l35(26);
                M.R(x);
            }
            oei0 oei0Var = (oei0) crx0.D(objArr, oei0.l, (gzs) x, M, 384);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new bei0(oei0Var);
                M.R(x2);
            }
            bei0 bei0Var = (bei0) x2;
            wfd wfdVar = (wfd) M.r(uvi.f);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = bap.j(EmptyCoroutineContext.b, M);
                M.R(x3);
            }
            yvj yvjVar = (yvj) x3;
            bei0Var.e = (vtu) M.r(uvi.l);
            boolean J = M.J(yvjVar) | M.J(wfdVar);
            Object x4 = M.x();
            if (J || x4 == c0012a) {
                x4 = new eci0(i6, yvjVar, wfdVar);
                M.R(x4);
            }
            bei0Var.f = (izs) x4;
            bei0Var.g = (ymo0) M.r(uvi.r);
            izsVar2 = izsVar;
            bei0Var.d = new fh1(21, bei0Var, izsVar2);
            bei0Var.l(obi0Var);
            M.K(-82280708);
            bei0Var.x = gua0.b(SelectedTextType.StaticText, null, M, 54);
            bei0Var.w = yvjVar;
            M.j();
            bei0Var.h();
            bi80 bi80Var = new bi80(bei0Var, 16);
            s3q0 s3q0Var = s3q0.a;
            zdi0 zdi0Var = new zdi0(bei0Var, bi80Var);
            q630 q630Var2 = q630.a.a;
            q630 o = sdi.o(skn0.b(mxr.b(3, fvr.u(jvi.d(egi.o(skn0.b(q630Var2, s3q0Var, zdi0Var), new iyd0(bei0Var, i3)), bei0Var.i), new v4w(bei0Var, 29)), false), 8675309, new edi0(new e9i0(bei0Var, 1))), new ydi0(bei0Var));
            if (bei0Var.e() != null && bei0Var.g()) {
                obi0 f = bei0Var.f();
                if (!(f == null ? true : epx.f(f.a, f.b))) {
                    sgi0<gzs<ov70>> sgi0Var = oc00.a;
                    q630Var2 = qri.a(q630Var2, a5x.a, new m0r(bei0Var, 1));
                }
            }
            frj0.a(q630Var.g(a020.k(o.g(q630Var2), new com.vk.movika.tools.controls.seekbar.s(bei0Var, i4))), kai.c(-1799563674, new n77(bei0Var, oei0Var, jaiVar), M), M, 48);
            boolean y = M.y(bei0Var);
            Object x5 = M.x();
            if (y || x5 == c0012a) {
                x5 = new ap30(bei0Var, 15);
                M.R(x5);
            }
            bap.c(bei0Var, (izs) x5, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            izsVar2 = izsVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final izs izsVar3 = izsVar2;
            s.d = new wzs() { // from class: xsna.fci0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ici0.b(q630.this, obi0Var, izsVar3, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
