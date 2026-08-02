package xsna;

import android.app.Activity;
import android.content.Context;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAd;
import com.vk.dto.common.Good;
import com.vk.ecomm.market.analytics.GoodFragmentAnalyticsParams;
import com.vk.ecomm.market.api.marketlinkedcontent.router.LinkedContentAnalyticsParams;
import com.vk.ecomm.market.good.ui.holder.contentholder.MediaContentItem;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import java.util.List;

/* compiled from: ClipFloatingButtonSetup.kt */
/* loaded from: classes17.dex */
public final class w6e implements u940, f4q0 {
    public Object b;
    public Object c;

    @Override // xsna.f4q0
    public void a(n2z n2zVar) {
        this.c = n2zVar;
        ((LevelPlayRewardedAd) this.b).setListener(new m0g0(n2zVar));
    }

    @Override // xsna.u940
    public List e(s940 s940Var) {
        return j(((q940) this.b).e(s940Var), s940Var, null);
    }

    @Override // xsna.u940
    public List f(s940 s940Var) {
        return j(((q940) this.b).f(s940Var), s940Var, new drg(this, 7));
    }

    @Override // xsna.f4q0
    public void g() {
        this.c = null;
        ((LevelPlayRewardedAd) this.b).setListener(null);
    }

    @Override // xsna.f4q0
    public boolean isReady() {
        return ((LevelPlayRewardedAd) this.b).isAdReady();
    }

    public List j(List list, s940 s940Var, drg drgVar) {
        ykk ykkVar;
        com.vk.music.analytics.api.collector.strategy.a aVar = (com.vk.music.analytics.api.collector.strategy.a) this.c;
        ykk ykkVar2 = aVar.h;
        boolean z = false;
        if (ykkVar2 != null) {
            i7z i7zVar = s940Var.a;
            boolean z2 = ((int) (i7zVar.a - ykkVar2.b())) >= 0;
            if (i7zVar.d || !i7zVar.e) {
                z = z2;
            } else if (list.size() < i7zVar.b && z2) {
                z = true;
            }
        }
        if (!z || (ykkVar = aVar.h) == null) {
            return list;
        }
        if (drgVar != null) {
            drgVar.invoke();
        }
        return j5g.v0(ykkVar, list);
    }

    public void k(Context context, MediaContentItem mediaContentItem) {
        cxo cxoVar = (cxo) this.b;
        hc10 c = cxoVar.a.c();
        Good good = cxoVar.r;
        LinkedContentAnalyticsParams linkedContentAnalyticsParams = null;
        if (good != null) {
            long j = good.b;
            long j2 = good.c.b;
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = (CommonMarketStat$TypeRefSource) this.c;
            GoodFragmentAnalyticsParams goodFragmentAnalyticsParams = cxoVar.g;
            linkedContentAnalyticsParams = new LinkedContentAnalyticsParams(j, j2, commonMarketStat$TypeRefSource, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.f : null, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.h : null);
        }
        c.d(context, mediaContentItem, linkedContentAnalyticsParams);
    }

    @Override // xsna.f4q0
    public void load() {
        ((LevelPlayRewardedAd) this.b).loadAd();
    }

    @Override // xsna.f4q0
    public void show(Activity activity) {
        LevelPlayRewardedAd levelPlayRewardedAd = (LevelPlayRewardedAd) this.b;
        if (levelPlayRewardedAd.isAdReady()) {
            levelPlayRewardedAd.showAd(activity);
            return;
        }
        n2z n2zVar = (n2z) this.c;
        if (n2zVar != null) {
            n2zVar.d();
        }
    }
}
