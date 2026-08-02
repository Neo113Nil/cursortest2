package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import xsna.us2;
import xsna.v4s;

/* compiled from: TextDelegate.kt */
/* loaded from: classes11.dex */
public final class sdo0 {
    public final us2 a;
    public final nmo0 b;
    public final boolean e;
    public final azl g;
    public final v4s.a h;
    public final List<us2.d<esa0>> i;
    public n540 j;
    public LayoutDirection k;
    public final int c = Integer.MAX_VALUE;
    public final int d = 1;
    public final int f = 1;

    public sdo0(us2 us2Var, nmo0 nmo0Var, boolean z, azl azlVar, v4s.a aVar, List list) {
        this.a = us2Var;
        this.b = nmo0Var;
        this.e = z;
        this.g = azlVar;
        this.h = aVar;
        this.i = list;
    }

    public final void a(LayoutDirection layoutDirection) {
        n540 n540Var = this.j;
        if (n540Var == null || layoutDirection != this.k || n540Var.b()) {
            this.k = layoutDirection;
            n540Var = new n540(this.a, tmo0.a(this.b, layoutDirection), this.i, this.g, this.h);
        }
        this.j = n540Var;
    }
}
