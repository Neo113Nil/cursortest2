package defpackage;

import androidx.compose.foundation.lazy.grid.b;
import androidx.compose.foundation.lazy.layout.h;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public final class b4y implements q5y {
    public final b a;
    public final z3y b;
    public final h c;

    public b4y(b bVar, z3y z3yVar, h hVar) {
        this.a = bVar;
        this.b = z3yVar;
        this.c = hVar;
    }

    @Override // defpackage.q5y
    public final Object a(int i) {
        return this.b.c(i);
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
        btsVar.g0(1493551140);
        int i3 = (btsVar.c(i) ? 4 : 2) | i2 | (btsVar.e(obj) ? 32 : 16) | (btsVar.k(this) ? 256 : 128);
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            ldb1.a(obj, i, this.a.q, wwg.S(726189336, true, new z4(this, i, 21), btsVar), btsVar, ((i3 >> 3) & 14) | HProv.ALG_TYPE_SECURECHANNEL | ((i3 << 3) & 112));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nxu(i, i2, 3, this, obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4y)) {
            return false;
        }
        return jl40.l(this.b, ((b4y) obj).b);
    }

    @Override // defpackage.q5y
    public final int getItemCount() {
        return this.b.d().b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
