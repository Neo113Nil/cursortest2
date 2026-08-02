package yads;

import android.content.Context;
import com.monetization.ads.mediation.banner.MediatedBannerAdapter;

/* loaded from: classes10.dex */
public final class aq1 implements fp1 {
    public final np1 a;

    public aq1(np1 np1Var) {
        this.a = np1Var;
    }

    @Override // yads.fp1
    public final dp1 a(Context context) {
        return this.a.a(context, MediatedBannerAdapter.class);
    }
}
