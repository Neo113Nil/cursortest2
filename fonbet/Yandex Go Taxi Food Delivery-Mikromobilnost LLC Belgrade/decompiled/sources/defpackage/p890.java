package defpackage;

import androidx.compose.foundation.lazy.layout.a;
import androidx.compose.foundation.lazy.layout.h;
import androidx.compose.foundation.pager.d;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public final class p890 implements q5y {
    public final d a;
    public final a b;
    public final h c;

    public p890(d dVar, o890 o890Var, h hVar) {
        this.a = dVar;
        this.b = o890Var;
        this.c = hVar;
    }

    @Override // defpackage.q5y
    public final int b(Object obj) {
        return this.c.a(obj);
    }

    @Override // defpackage.q5y
    public final Object c(int i) {
        Object b = this.c.b(i);
        return b == null ? this.b.e(i) : b;
    }

    @Override // defpackage.q5y
    public final void d(Object obj, int i, fid fidVar, int i2) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1201380429);
        int i3 = (btsVar.c(i) ? 4 : 2) | i2 | (btsVar.e(obj) ? 32 : 16) | (btsVar.k(this) ? 256 : 128);
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            ldb1.a(obj, i, this.a.z, wwg.S(1142237095, true, new z4(this, i, 27), btsVar), btsVar, ((i3 >> 3) & 14) | HProv.ALG_TYPE_SECURECHANNEL | ((i3 << 3) & 112));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nxu(i, i2, 28, this, obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p890)) {
            return false;
        }
        return jl40.l(this.b, ((p890) obj).b);
    }

    @Override // defpackage.q5y
    public final int getItemCount() {
        return this.b.d().b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
