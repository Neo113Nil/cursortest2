package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import kotlin.collections.b;

/* loaded from: classes10.dex */
public final class f5y extends e530 implements v0y, lo5, ko5 {
    public static final c5y w = new c5y();
    public g5y a;
    public a5y b;
    public Orientation c;

    public final boolean E0(z4y z4yVar, int i) {
        if (i == 5 || i == 6) {
            if (this.c == Orientation.Horizontal) {
                return false;
            }
        } else if (i == 3 || i == 4) {
            if (this.c == Orientation.Vertical) {
                return false;
            }
        } else if (i != 1 && i != 2) {
            ny61.r("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        if (F0(i)) {
            if (z4yVar.b >= this.a.getItemCount() - 1) {
                return false;
            }
        } else if (z4yVar.a <= 0) {
            return false;
        }
        return true;
    }

    public final boolean F0(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int i2 = d5y.a[qje.P(this).S.ordinal()];
            if (i2 == 1) {
                return false;
            }
            if (i2 == 2) {
                return true;
            }
            w511.b();
            return false;
        }
        if (i != 4) {
            ny61.r("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int i3 = d5y.a[qje.P(this).S.ordinal()];
        if (i3 == 1) {
            return true;
        }
        if (i3 == 2) {
            return false;
        }
        w511.b();
        return false;
    }

    @Override // defpackage.v0y
    public final aa10 e(k kVar, x910 x910Var, long j) {
        o l0 = x910Var.l0(j);
        return kVar.w(l0.a, l0.b, b.f(), new q83(l0, 7));
    }
}
