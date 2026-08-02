package yads;

import android.content.Context;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;

/* loaded from: classes10.dex */
public final class ar1 implements fp1 {
    public final np1 a;

    public ar1(np1 np1Var) {
        this.a = np1Var;
    }

    @Override // yads.fp1
    public final dp1 a(Context context) {
        return this.a.a(context, MediatedRewardedAdapter.class);
    }
}
