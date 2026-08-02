package defpackage;

import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.PfmFunFactGradientConfig;

/* loaded from: classes3.dex */
public final class bab0 implements ecb0 {
    public final /* synthetic */ b a;

    public bab0(b bVar) {
        this.a = bVar;
    }

    public final dcb0 a() {
        PfmFunFactGradientConfig pfmFunFactGradientConfig = (PfmFunFactGradientConfig) this.a.d(sbb0.a).getData();
        return new dcb0(pfmFunFactGradientConfig.getCenterXMultiplier(), pfmFunFactGradientConfig.getCenterYMultiplier(), pfmFunFactGradientConfig.getRadiusMultiplier());
    }
}
