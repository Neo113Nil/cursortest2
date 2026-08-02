package xsna;

import com.vk.core.performance.score.PerformanceScoreProduct;
import kotlin.Pair;

/* compiled from: SuperappPerformanceSessionHolderImpl.kt */
/* loaded from: classes6.dex */
public final class khn0 implements bhn0 {
    public final PerformanceScoreProduct a;

    public khn0(PerformanceScoreProduct performanceScoreProduct) {
        this.a = performanceScoreProduct;
    }

    @Override // xsna.bhn0
    public final ahn0 a() {
        zrd0 zrd0Var = zrd0.a;
        Pair a = zrd0.a(this.a);
        return new zw90((yw90) a.g());
    }
}
