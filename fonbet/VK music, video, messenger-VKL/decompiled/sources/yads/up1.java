package yads;

import android.content.Context;
import com.monetization.ads.mediation.base.initialize.MediatedAdapterInitializer;

/* loaded from: classes10.dex */
public final class up1 {
    public final tq1 a;

    public up1(tq1 tq1Var) {
        this.a = tq1Var;
    }

    public final MediatedAdapterInitializer a(Context context, rr1 rr1Var, ov2 ov2Var) {
        e00 a = this.a.a(rr1Var);
        v9 v9Var = null;
        if (a == null) {
            return null;
        }
        Object a2 = new sp1(new yp1(new d4(a), ov2Var, v9Var)).a(context, rr1Var, com.monetization.ads.mediation.base.a.class);
        if (a2 instanceof MediatedAdapterInitializer) {
            return (MediatedAdapterInitializer) a2;
        }
        return null;
    }
}
