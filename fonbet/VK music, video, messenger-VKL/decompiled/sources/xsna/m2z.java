package xsna;

import android.app.Activity;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAd;
import com.vk.superapp.advertisement.api.dto.FullscreenAdFormat;

/* compiled from: LevelPlayFullscreenAdTypeDelegate.kt */
/* loaded from: classes6.dex */
public final class m2z implements bxs {
    public final d4q0 a;

    /* compiled from: LevelPlayFullscreenAdTypeDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FullscreenAdFormat.values().length];
            try {
                iArr[FullscreenAdFormat.REWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FullscreenAdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public m2z(d4q0 d4q0Var) {
        this.a = d4q0Var;
    }

    @Override // xsna.bxs
    public final cxs a(Activity activity, di0 di0Var, df0 df0Var) {
        String str;
        o2z o2zVar;
        if (b(di0Var) && (str = di0Var.c) != null && this.a.d() != null) {
            int i = a.$EnumSwitchMapping$0[di0Var.b.ordinal()];
            if (i == 1) {
                w6e w6eVar = new w6e();
                w6eVar.b = new LevelPlayRewardedAd(str);
                o2zVar = new o2z(w6eVar);
            } else if (i == 2) {
                o2zVar = new o2z(new fch(str));
            }
            return o2zVar;
        }
        return null;
    }

    @Override // xsna.bxs
    public final boolean b(di0 di0Var) {
        return this.a.isInitialized() && di0Var.c != null && e43.l(FullscreenAdFormat.REWARD, FullscreenAdFormat.INTERSTITIAL).contains(di0Var.b);
    }
}
