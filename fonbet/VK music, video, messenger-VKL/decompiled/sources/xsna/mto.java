package xsna;

import com.vk.audience.api.domain.tracking.AudienceResearchTrackerCodes;

/* compiled from: DzenAudienceResearchTrackersFactory.kt */
/* loaded from: classes15.dex */
public final class mto implements ab4 {
    public final wy2 a;

    public mto(wy2 wy2Var) {
        this.a = wy2Var;
    }

    @Override // xsna.ab4
    public final ua4 a() {
        return new za4(this.a, AudienceResearchTrackerCodes.DZEN_NEWS_START, AudienceResearchTrackerCodes.DZEN_NEWS_PING, AudienceResearchTrackerCodes.DZEN_NEWS_STOP);
    }

    @Override // xsna.ab4
    public final ua4 b() {
        return new za4(this.a, AudienceResearchTrackerCodes.DZEN_CAROUSEL_START, AudienceResearchTrackerCodes.DZEN_CAROUSEL_PING, AudienceResearchTrackerCodes.DZEN_CAROUSEL_STOP);
    }

    @Override // xsna.ab4
    public final ua4 c() {
        return new za4(this.a, AudienceResearchTrackerCodes.DZEN_STORY_START, AudienceResearchTrackerCodes.DZEN_STORY_PING, AudienceResearchTrackerCodes.DZEN_STORY_STOP);
    }
}
