package xsna;

import com.ironsource.O6;
import com.vk.core.apps.BuildInfo;
import com.vk.stat.scheme.SchemeStat$TypeAppStarts;

/* compiled from: AppConcentrator.kt */
/* loaded from: classes11.dex */
public final class w33 implements dyp<SchemeStat$TypeAppStarts> {
    public final kw90 a;

    public w33(kw90 kw90Var, l93 l93Var) {
        this.a = kw90Var;
    }

    @Override // xsna.dyp
    public final SchemeStat$TypeAppStarts a(SchemeStat$TypeAppStarts schemeStat$TypeAppStarts) {
        kw90 kw90Var = this.a;
        jw90 jw90Var = kw90Var.e;
        String a = ply.a();
        if (epx.f(a, O6.d0)) {
            a = "uk";
        } else if (epx.f(a, "kz")) {
            a = "kk";
        }
        String str = a;
        int i = BuildInfo.e;
        String str2 = dhr0.C().d;
        Long l = jw90Var.a;
        String l2 = l != null ? l.toString() : null;
        Long l3 = jw90Var.b;
        return SchemeStat$TypeAppStarts.a(schemeStat$TypeAppStarts, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(i), str, null, null, null, null, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, l2, l3 != null ? l3.toString() : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, kw90Var.m, null, null, null, null, null, null, -35127297, -50339841, 1044479);
    }
}
