package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.user.UserProfile;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.profile.user.impl.ui.b;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$PublishingEvent;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.stat.scheme.SchemeStat$PostDraftItemEventType;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.Collections;
import xsna.nyd0;
import xsna.rgc0;

/* compiled from: PostingItemPresenterFactoryImpl.kt */
/* loaded from: classes4.dex */
public final class tgc0 extends pgc0 {
    public final /* synthetic */ ape0 K;
    public final /* synthetic */ rgc0.a L;
    public final /* synthetic */ ktq0 M;
    public final /* synthetic */ qq40 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgc0(ape0 ape0Var, rgc0.a aVar, ugc0 ugc0Var, ktq0 ktq0Var, qq40 qq40Var, sjg sjgVar, UserId userId) {
        super(sjgVar, userId);
        this.K = ape0Var;
        this.L = aVar;
        this.M = ktq0Var;
        this.N = qq40Var;
    }

    @Override // xsna.pgc0, xsna.kgc0
    public final void F5(PostingCreationEntryPoint postingCreationEntryPoint, boolean z, UserId userId, ExtendedUserProfile extendedUserProfile) {
        super.F5(postingCreationEntryPoint, z, userId, extendedUserProfile);
        nyd0.j c = this.M.a.g.c();
        c.getClass();
        c.a(MobileOfficialAppsProfileStat$PublishingEvent.PublishingEventType.POST_PUBLISH);
    }

    @Override // xsna.pgc0, xsna.kgc0
    public final void I0(UserId userId, PostingCreationEntryPoint postingCreationEntryPoint, boolean z) {
        super.I0(userId, postingCreationEntryPoint, z);
        nyd0.j c = this.M.a.g.c();
        c.getClass();
        c.a(MobileOfficialAppsProfileStat$PublishingEvent.PublishingEventType.CLIP_PUBLISH);
    }

    @Override // xsna.pgc0
    public final Context b() {
        return this.N.c;
    }

    @Override // xsna.pgc0, xsna.kgc0
    public final void d2(boolean z, dic0 dic0Var, PostingCreationEntryPoint postingCreationEntryPoint) {
        ExtendedUserProfile invoke;
        UserProfile userProfile;
        this.L.c.a().b(hhc0.a(postingCreationEntryPoint));
        p0(SchemeStat$PostDraftItemEventType.CLICK_TO_STORY);
        MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint creationEntryPoint = MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.PROFILE_PLUS;
        ktq0 ktq0Var = this.M;
        jtq0 jtq0Var = ktq0Var.a;
        nyd0.j c = jtq0Var.g.c();
        c.getClass();
        c.a(MobileOfficialAppsProfileStat$PublishingEvent.PublishingEventType.STORY_PUBLISH);
        gzs<? extends ExtendedUserProfile> gzsVar = jtq0Var.n;
        if (gzsVar == null || (invoke = gzsVar.invoke()) == null || (userProfile = invoke.a) == null) {
            return;
        }
        com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a(MobileOfficialAppsCoreNavStat$EventScreen.PROFILE, creationEntryPoint);
        aVar.E0 = true;
        aVar.q(userProfile.c, userProfile.e, userProfile.h);
        if (!jtq0Var.d.m()) {
            aVar.h = Collections.singletonList(StoryCameraMode.CLIPS);
        }
        aVar.C(ktq0Var.b);
    }

    @Override // xsna.pgc0, xsna.kgc0
    public final void d7(UserId userId, PostingCreationEntryPoint postingCreationEntryPoint) {
        super.d7(userId, postingCreationEntryPoint);
        nyd0.j c = this.M.a.g.c();
        c.getClass();
        c.a(MobileOfficialAppsProfileStat$PublishingEvent.PublishingEventType.VIDEO_PUBLISH);
    }

    @Override // xsna.pgc0
    public final void h0() {
        jtq0 jtq0Var = this.M.a;
        izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = jtq0Var.j;
        if (izsVar == null) {
            izsVar = null;
        }
        egc0 egc0Var = jtq0Var.m;
        izsVar.invoke(new b.n.a((egc0Var != null ? egc0Var : null).q4()));
    }

    @Override // xsna.pgc0, xsna.kgc0
    public final void w5(boolean z, PostingCreationEntryPoint postingCreationEntryPoint) {
        super.w5(z, postingCreationEntryPoint);
        nyd0.j c = this.M.a.g.c();
        c.getClass();
        c.a(MobileOfficialAppsProfileStat$PublishingEvent.PublishingEventType.LIVE_PUBLISH);
    }

    @Override // xsna.pgc0
    public final String x() {
        return this.L.b;
    }

    @Override // xsna.pgc0, xsna.kgc0
    public final void x1(boolean z, PostingCreationEntryPoint postingCreationEntryPoint) {
        super.x1(z, postingCreationEntryPoint);
        nyd0.j c = this.M.a.g.c();
        c.getClass();
        c.a(MobileOfficialAppsProfileStat$PublishingEvent.PublishingEventType.PHOTO_PUBLISH);
    }

    @Override // xsna.pgc0
    public final kk6 z() {
        return (kk6) this.K.invoke(super.z());
    }
}
