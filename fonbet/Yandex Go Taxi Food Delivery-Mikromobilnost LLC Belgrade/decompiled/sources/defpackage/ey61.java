package defpackage;

import android.content.Context;
import com.monetization.ads.mediation.banner.MediatedBannerAdapter;
import com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter;

/* loaded from: classes7.dex */
public final class ey61 implements gm81 {
    public final /* synthetic */ int a;
    public final s1n b;

    public /* synthetic */ ey61(s1n s1nVar, int i) {
        this.a = i;
        this.b = s1nVar;
    }

    @Override // defpackage.gm81
    public final cr71 a(Context context) {
        int i = this.a;
        s1n s1nVar = this.b;
        switch (i) {
            case 0:
                return s1nVar.h(context, MediatedInterstitialAdapter.class);
            default:
                return s1nVar.h(context, MediatedBannerAdapter.class);
        }
    }
}
