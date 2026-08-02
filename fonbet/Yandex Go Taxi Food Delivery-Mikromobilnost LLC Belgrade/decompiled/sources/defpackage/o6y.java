package defpackage;

import androidx.compose.foundation.lazy.b;
import androidx.compose.foundation.lazy.layout.h;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public final class o6y implements q5y {
    public final b a;
    public final m6y b;
    public final u4y c;
    public final h d;

    public o6y(b bVar, m6y m6yVar, u4y u4yVar, h hVar) {
        this.a = bVar;
        this.b = m6yVar;
        this.c = u4yVar;
        this.d = hVar;
    }

    @Override // defpackage.q5y
    public final Object a(int i) {
        return this.b.c(i);
    }

    @Override // defpackage.q5y
    public final int b(Object obj) {
        return this.d.a(obj);
    }

    @Override // defpackage.q5y
    public final Object c(int i) {
        Object b = this.d.b(i);
        return b == null ? this.b.e(i) : b;
    }

    @Override // defpackage.q5y
    public final void d(Object obj, int i, fid fidVar, int i2) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-462424778);
        int i3 = (btsVar.c(i) ? 4 : 2) | i2 | (btsVar.e(obj) ? 32 : 16) | (btsVar.k(this) ? 256 : 128);
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            ldb1.a(obj, i, this.a.s, wwg.S(-824725566, true, new z4(this, i, 22), btsVar), btsVar, ((i3 >> 3) & 14) | HProv.ALG_TYPE_SECURECHANNEL | ((i3 << 3) & 112));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nxu(i, i2, 5, this, obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6y)) {
            return false;
        }
        return jl40.l(this.b, ((o6y) obj).b);
    }

    @Override // defpackage.q5y
    public final int getItemCount() {
        return this.b.d().b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
