package defpackage;

import androidx.compose.foundation.layout.Direction;
import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import kotlin.collections.b;

/* loaded from: classes10.dex */
public final class db51 extends e530 implements v0y {
    public Direction a;
    public boolean b;
    public wls c;

    public db51(Direction direction, boolean z, wls wlsVar) {
        this.a = direction;
        this.b = z;
        this.c = wlsVar;
    }

    public final void E0(wls wlsVar) {
        this.c = wlsVar;
    }

    public final void F0(Direction direction) {
        this.a = direction;
    }

    public final void G0(boolean z) {
        this.b = z;
    }

    @Override // defpackage.v0y
    public final aa10 e(k kVar, x910 x910Var, long j) {
        Direction direction = this.a;
        Direction direction2 = Direction.Vertical;
        int k = direction != direction2 ? 0 : n8e.k(j);
        Direction direction3 = this.a;
        Direction direction4 = Direction.Horizontal;
        o l0 = x910Var.l0(p8e.a(k, (this.a == direction2 || !this.b) ? n8e.i(j) : Integer.MAX_VALUE, direction3 == direction4 ? n8e.j(j) : 0, (this.a == direction4 || !this.b) ? n8e.h(j) : Integer.MAX_VALUE));
        int d = y6i0.d(l0.a, n8e.k(j), n8e.i(j));
        int d2 = y6i0.d(l0.b, n8e.j(j), n8e.h(j));
        return kVar.w(d, d2, b.f(), new hi0(this, d, l0, d2, kVar));
    }
}
