package defpackage;

import android.content.Context;
import com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;

/* loaded from: classes7.dex */
public final class j171 implements gm81 {
    public final /* synthetic */ int a;
    public final s1n b;

    public /* synthetic */ j171(s1n s1nVar, int i) {
        this.a = i;
        this.b = s1nVar;
    }

    @Override // defpackage.gm81
    public final cr71 a(Context context) {
        int i = this.a;
        s1n s1nVar = this.b;
        switch (i) {
            case 0:
                return s1nVar.h(context, MediatedRewardedAdapter.class);
            default:
                return s1nVar.h(context, MediatedAppOpenAdAdapter.class);
        }
    }
}
