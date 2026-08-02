package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.u;
import androidx.compose.ui.platform.j;
import kotlin.collections.b;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class jfu extends e530 implements fud, v0y, dr60 {
    public rp11 A;
    public ety0 a;
    public int b;
    public int c;
    public boolean w;
    public int x;
    public int y;
    public ety0 z;

    public final ety0 E0() {
        ety0 ety0Var = this.z;
        if (ety0Var != null) {
            return ety0Var;
        }
        throw nzs.g("Resolved style is not set.");
    }

    @Override // defpackage.v0y
    public final aa10 e(k kVar, x910 x910Var, long j) {
        if (this.w) {
            ety0 E0 = E0();
            dyr dyrVar = (dyr) npb1.c(this, j.k);
            String str = pmy0.a;
            int a = (int) (pmy0.a(E0, kVar, dyrVar, str, 1) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            int a2 = ((int) (pmy0.a(E0, kVar, dyrVar, oyr.f('\n', str, str), 2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - a;
            int i = this.b;
            this.x = i == 1 ? -1 : g8e.d(i, 1, a2, a);
            int i2 = this.c;
            this.y = i2 == Integer.MAX_VALUE ? -1 : g8e.d(i2, 1, a2, a);
            this.w = false;
        }
        int i3 = this.x;
        int d = i3 != -1 ? y6i0.d(i3, n8e.j(j), n8e.h(j)) : n8e.j(j);
        int i4 = this.y;
        o l0 = x910Var.l0(n8e.b(0, j, 0, d, i4 != -1 ? y6i0.d(i4, n8e.j(j), n8e.h(j)) : n8e.h(j), 3));
        return kVar.w(l0.a, l0.b, b.f(), new q83(l0, 5));
    }

    @Override // defpackage.dr60
    public final void e0() {
        if (this.A != null) {
            u.e(this, new ifu(this, 1));
        }
        this.w = true;
        qje.P(this).C();
    }

    @Override // defpackage.e530
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.e530
    public final void onAttach() {
        dyr dyrVar = (dyr) npb1.c(this, j.k);
        this.z = bb1.I(this.a, qje.P(this).S);
        eyr eyrVar = E0().a.f;
        lzr lzrVar = E0().a.c;
        if (lzrVar == null) {
            lzrVar = lzr.D;
        }
        hzr hzrVar = E0().a.d;
        int i = hzrVar != null ? hzrVar.a : 0;
        izr izrVar = E0().a.e;
        this.A = ((gyr) dyrVar).b(eyrVar, lzrVar, i, izrVar != null ? izrVar.a : 65535);
        u.e(this, new ifu(this, 0));
        this.w = true;
    }

    @Override // defpackage.cqh, defpackage.gwd0
    public final void onDensityChange() {
        this.w = true;
        qje.P(this).C();
    }

    @Override // defpackage.e530
    public final void onDetach() {
        this.z = null;
        this.A = null;
        this.w = false;
    }

    @Override // defpackage.cqh
    public final void onLayoutDirectionChange() {
        this.z = bb1.I(this.a, qje.P(this).S);
        this.w = true;
        qje.P(this).C();
    }
}
