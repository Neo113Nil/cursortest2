package xsna;

import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import kotlin.NoWhenBranchMatchedException;
import xsna.smc;

/* compiled from: ProductAttachRefSourceMapper.kt */
/* loaded from: classes18.dex */
public final class kid0 {
    public static final CommonMarketStat$TypeRefSource a(smc smcVar) {
        if (smcVar.equals(smc.a.a)) {
            return CommonMarketStat$TypeRefSource.CLIPS_FULLSCREEN;
        }
        if (smcVar.equals(smc.h.a)) {
            return CommonMarketStat$TypeRefSource.CLIPS_FEED;
        }
        if (smcVar.equals(smc.i.a)) {
            return CommonMarketStat$TypeRefSource.CLIP_FINISHED;
        }
        if (smcVar.equals(smc.b.a)) {
            return CommonMarketStat$TypeRefSource.CLIPS_FEED_BLOCK;
        }
        if (smcVar.equals(smc.f.a)) {
            return CommonMarketStat$TypeRefSource.CLIPS_SHOPS_PARTNER;
        }
        if (smcVar.equals(smc.d.a)) {
            return CommonMarketStat$TypeRefSource.CLIPS_SHOPS_DEEPLINK;
        }
        if (smcVar.equals(smc.e.a)) {
            return CommonMarketStat$TypeRefSource.CLIPS_CONTEXT_MECHANISM;
        }
        if (smcVar.equals(smc.c.a)) {
            return CommonMarketStat$TypeRefSource.CLIPS_SHOPS_BLOCK;
        }
        if (smcVar.equals(smc.g.a)) {
            return CommonMarketStat$TypeRefSource.CLIPS_TAB;
        }
        throw new NoWhenBranchMatchedException();
    }
}
