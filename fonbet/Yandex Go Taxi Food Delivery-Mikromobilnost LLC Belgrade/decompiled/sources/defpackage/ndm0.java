package defpackage;

import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.rconfig.configs.SavingsAccountBalanceAnimation;

/* loaded from: classes3.dex */
public final class ndm0 implements mdm0 {
    public final b a;

    public ndm0(b bVar) {
        this.a = bVar;
    }

    public final int a() {
        return ((SavingsAccountBalanceAnimation) this.a.d(n4m0.c).getData()).getAmountThreshold();
    }

    public final boolean b() {
        return ((CommonFeatureFlag) this.a.d(wlp.o0).getData()).isEnabled();
    }

    public final boolean c() {
        return ((CommonFeatureFlag) this.a.d(wlp.z).getData()).isEnabled();
    }

    public final boolean d() {
        return ((CommonFeatureFlag) this.a.d(wlp.a).getData()).isEnabled();
    }
}
