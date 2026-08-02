package yads;

import android.content.Context;
import com.vungle.ads.internal.protos.Sdk;
import com.yandex.div.core.DivConfiguration;
import com.yandex.mobile.ads.R$layout;
import xsna.bpn0;
import xsna.f5z;

/* loaded from: classes10.dex */
public final class li0 implements wy0 {
    public final hi0 a;
    public final d4 b;
    public final ov2 c;
    public final zf0 d;
    public final f2 e;
    public final qh0 f;
    public final int g;
    public final zg0 h;

    public /* synthetic */ li0(hi0 hi0Var, d4 d4Var, ov2 ov2Var, jy jyVar, f2 f2Var, qh0 qh0Var, int i) {
        this(hi0Var, d4Var, ov2Var, jyVar, f2Var, qh0Var, i, new zg0(((mv3) ov2Var).a()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.wy0
    public final ve1 a(Context context, v9 v9Var, x12 x12Var, kz kzVar, z00 z00Var) {
        DivConfiguration divConfiguration;
        zf0 r02Var;
        hi0 hi0Var = this.a;
        pu puVar = new pu(hi0Var.h);
        ai0 ai0Var = new ai0(puVar);
        zg0 zg0Var = this.h;
        zg0Var.getClass();
        boolean z = x12Var instanceof w32;
        if (z) {
            jp2 jp2Var = zg0Var.a;
            b23 b23Var = new b23(jp2Var);
            w32 w32Var = (w32) x12Var;
            b23Var.e.put(hi0Var.e, new d23(w32Var, jp2Var, hi0Var.h, new lh0(), new kq0(), new mj(y12.a(w32Var, yh0.c))));
            zg0Var.b.getClass();
            divConfiguration = c23.a(context, b23Var, ai0Var);
        } else {
            divConfiguration = (DivConfiguration) new bpn0(new gi0(context, ai0Var)).getValue();
        }
        DivConfiguration divConfiguration2 = divConfiguration;
        ph0 ph0Var = new ph0(context, this.b, this.c, v9Var, kzVar, this.f, ai0Var);
        bu1 a = ((mv3) this.c).a();
        zh0 zh0Var = new zh0(this.a.e, ph0Var, divConfiguration2, a, null, context instanceof f5z ? (f5z) context : null, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE);
        kq2 kq2Var = new kq2(this.e, this.g);
        if (z) {
            w32 w32Var2 = (w32) x12Var;
            r02Var = new y13(w32Var2, kzVar, z00Var, puVar, a, new lz1(), new mj(y12.a(w32Var2, yh0.b)));
        } else {
            r02Var = new r02(x12Var, kzVar, z00Var, puVar, a, new lz1(), new mj(y12.a(x12Var, null)));
        }
        return new ve1(R$layout.monetization_ads_internal_divkit, new jy(kq2Var, zh0Var, new sy0(r02Var), this.d), new ki0(v9Var));
    }

    public li0(hi0 hi0Var, d4 d4Var, ov2 ov2Var, jy jyVar, f2 f2Var, qh0 qh0Var, int i, zg0 zg0Var) {
        this.a = hi0Var;
        this.b = d4Var;
        this.c = ov2Var;
        this.d = jyVar;
        this.e = f2Var;
        this.f = qh0Var;
        this.g = i;
        this.h = zg0Var;
    }
}
