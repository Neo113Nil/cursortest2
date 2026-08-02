package xsna;

import com.vk.audience.api.domain.tracking.AudienceResearchTrackerCodes;

/* compiled from: AudienceResearchTrackerImpl.kt */
/* loaded from: classes15.dex */
public final class za4 implements ua4 {
    public final wy2 a;
    public final AudienceResearchTrackerCodes b;
    public final AudienceResearchTrackerCodes c;
    public final AudienceResearchTrackerCodes d;

    public za4(wy2 wy2Var, AudienceResearchTrackerCodes audienceResearchTrackerCodes, AudienceResearchTrackerCodes audienceResearchTrackerCodes2, AudienceResearchTrackerCodes audienceResearchTrackerCodes3) {
        this.a = wy2Var;
        this.b = audienceResearchTrackerCodes;
        this.c = audienceResearchTrackerCodes2;
        this.d = audienceResearchTrackerCodes3;
    }

    @Override // xsna.ua4
    public final io.reactivex.rxjava3.core.a a() {
        return io.reactivex.rxjava3.core.a.l(new ya4(0, this, this.d));
    }

    @Override // xsna.ua4
    public final io.reactivex.rxjava3.core.a b() {
        return io.reactivex.rxjava3.core.a.l(new ya4(0, this, this.c));
    }

    @Override // xsna.ua4
    public final io.reactivex.rxjava3.core.a c() {
        return io.reactivex.rxjava3.core.a.l(new ya4(0, this, this.b));
    }
}
