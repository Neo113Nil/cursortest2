package xsna;

import com.vk.music.analytics.api.collector.strategy.CollectorStrategy;
import java.util.LinkedHashSet;
import java.util.List;
import xsna.g7z;
import xsna.p940;
import xsna.t940;

/* compiled from: SingleMusicAnalyticsCollector.kt */
/* loaded from: classes3.dex */
public final class vuj0<T extends t940> extends ih6<Object> implements bhz {
    public final LinkedHashSet c;
    public final com.vk.music.analytics.api.collector.strategy.b d;
    public final u940 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vuj0(p940.a aVar, CollectorStrategy collectorStrategy, q940 q940Var) {
        super(aVar);
        com.vk.music.analytics.api.collector.strategy.b bVar;
        q940 q940Var2;
        g7z.a aVar2 = aVar.a;
        this.c = new LinkedHashSet();
        boolean z = aVar.b;
        if (z) {
            bVar = collectorStrategy instanceof com.vk.music.analytics.api.collector.strategy.a ? (com.vk.music.analytics.api.collector.strategy.a) collectorStrategy : null;
            if (bVar == null) {
                bVar = new com.vk.music.analytics.api.collector.strategy.a(aVar2, collectorStrategy, new jx40(0, this, vuj0.class, "getAnalyticsListeners", "getAnalyticsListeners()Ljava/util/Set;", 0, 1), q940Var);
            }
        } else {
            bVar = collectorStrategy instanceof com.vk.music.analytics.api.collector.strategy.b ? (com.vk.music.analytics.api.collector.strategy.b) collectorStrategy : null;
            if (bVar == null) {
                bVar = new com.vk.music.analytics.api.collector.strategy.b(aVar2, collectorStrategy, new uuj0(0, this, vuj0.class, "getAnalyticsListeners", "getAnalyticsListeners()Ljava/util/Set;", 0), q940Var);
            }
        }
        this.d = bVar;
        if (z) {
            w6e w6eVar = new w6e();
            w6eVar.b = q940Var;
            w6eVar.c = (com.vk.music.analytics.api.collector.strategy.a) bVar;
            q940Var2 = w6eVar;
        } else {
            q940Var2 = q940Var;
        }
        this.e = q940Var2;
    }

    @Override // xsna.bhz
    public final void d(ub4 ub4Var) {
        this.c.add(ub4Var);
    }

    @Override // xsna.u940
    public final List<ax1> e(s940 s940Var) {
        return this.e.e(s940Var);
    }

    @Override // xsna.u940
    public final List<ax1> f(s940 s940Var) {
        return this.e.f(s940Var);
    }

    @Override // com.vk.music.analytics.api.collector.strategy.CollectorStrategy
    public final ax1 g(iwa0 iwa0Var) {
        return this.d.g(iwa0Var);
    }

    @Override // com.vk.music.analytics.api.collector.strategy.CollectorStrategy
    public final boolean j(iwa0 iwa0Var) {
        return this.d.c.j(iwa0Var);
    }
}
