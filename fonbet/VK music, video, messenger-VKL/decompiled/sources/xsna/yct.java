package xsna;

import android.content.Context;
import androidx.compose.runtime.a;

/* compiled from: GamesCatalogPWAModalBottomSheetView.kt */
/* loaded from: classes17.dex */
public final class yct extends jmu0 {
    public final zct h1;
    public final gzs<s3q0> i1;
    public final gzs<s3q0> j1;

    /* compiled from: GamesCatalogPWAModalBottomSheetView.kt */
    public static final class a extends kmu0 {
        public final zct h;
        public final n0 i;
        public final p3h j;

        public a(Context context, zct zctVar, n0 n0Var, p3h p3hVar) {
            super(context, new xct());
            this.h = zctVar;
            this.i = n0Var;
            this.j = p3hVar;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            return new yct(this.h, this.i, this.j);
        }
    }

    public yct(zct zctVar, n0 n0Var, p3h p3hVar) {
        this.h1 = zctVar;
        this.i1 = n0Var;
        this.j1 = p3hVar;
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1307938513);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1307938513, i2, -1, "com.vk.games.presentation.catalog.view.GamesCatalogPWAModalBottomSheetView.ThemedContent (GamesCatalogPWAModalBottomSheetView.kt:17)");
            }
            int i3 = i2 & 14;
            boolean z = i3 == 4 || M.y(this);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new dgm(this, 10);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            boolean z2 = i3 == 4 || M.y(this);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new cfl(this, 11);
                M.R(x2);
            }
            vct.a(this.h1, gzsVar, (gzs) x2, null, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new f9h(this, i, 7);
        }
    }
}
