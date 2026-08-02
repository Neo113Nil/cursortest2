package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.collections.b;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class goy0 extends e530 implements fud, v0y {
    public final ety0 a;
    public rp11 b;
    public aw40 c;

    public goy0(ety0 ety0Var) {
        this.a = ety0Var;
    }

    public final void E0(ety0 ety0Var, dyr dyrVar) {
        bmt0 bmt0Var = ety0Var.a;
        eyr eyrVar = bmt0Var.f;
        lzr lzrVar = bmt0Var.c;
        if (lzrVar == null) {
            lzrVar = lzr.D;
        }
        hzr hzrVar = bmt0Var.d;
        int i = hzrVar != null ? hzrVar.a : 0;
        izr izrVar = bmt0Var.e;
        this.b = ((gyr) dyrVar).b(eyrVar, lzrVar, i, izrVar != null ? izrVar.a : 65535);
        qje.P(this).C();
    }

    @Override // defpackage.v0y
    public final aa10 e(k kVar, x910 x910Var, long j) {
        long a;
        aw40 aw40Var = this.c;
        if (aw40Var == null) {
            throw nzs.g("Min size state is not set.");
        }
        oz40 oz40Var = (oz40) aw40Var.g;
        rp11 rp11Var = this.b;
        if (rp11Var == null) {
            throw nzs.g("Font resolution state is not set.");
        }
        Object value = rp11Var.getValue();
        if (!jl40.l(value, aw40Var.f)) {
            aw40Var.f = value;
            oz40Var.setValue(Boolean.TRUE);
        }
        if (((Boolean) oz40Var.getValue()).booleanValue()) {
            a = pmy0.a((ety0) aw40Var.e, (fwi) aw40Var.c, (dyr) aw40Var.d, pmy0.a, 1);
            aw40Var.a = a;
            oz40Var.setValue(Boolean.FALSE);
        }
        long j2 = aw40Var.a;
        o l0 = x910Var.l0(p8e.e(j, p8e.b((int) (j2 >> 32), 0, (int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), 0, 10)));
        return kVar.w(l0.a, l0.b, b.f(), new q83(l0, 14));
    }

    @Override // defpackage.e530
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.e530
    public final void onAttach() {
        ety0 I = bb1.I(this.a, qje.P(this).S);
        dyr dyrVar = (dyr) npb1.c(this, j.k);
        E0(I, dyrVar);
        LayoutDirection layoutDirection = qje.P(this).S;
        fwi fwiVar = qje.P(this).R;
        rp11 rp11Var = this.b;
        if (rp11Var == null) {
            throw nzs.g("Font resolution state is not set.");
        }
        this.c = new aw40(layoutDirection, fwiVar, dyrVar, I, rp11Var.getValue());
    }

    @Override // defpackage.cqh, defpackage.gwd0
    public final void onDensityChange() {
        aw40 aw40Var = this.c;
        if (aw40Var != null) {
            aw40.a(aw40Var, null, qje.P(this).R, null, 29);
        }
        qje.P(this).C();
    }

    @Override // defpackage.e530
    public final void onDetach() {
        this.b = null;
        this.c = null;
    }

    @Override // defpackage.cqh
    public final void onLayoutDirectionChange() {
        aw40 aw40Var = this.c;
        if (aw40Var != null) {
            aw40.a(aw40Var, qje.P(this).S, null, null, 30);
        }
        qje.P(this).C();
    }
}
