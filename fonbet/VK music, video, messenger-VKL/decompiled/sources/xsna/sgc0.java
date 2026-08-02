package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.posting.domain.PostingMetricsCreationEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$NavigationEvent;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.stat.scheme.SchemeStat$PostDraftItemEventType;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import xsna.ghc0;
import xsna.rgc0;

/* compiled from: PostingItemPresenterFactoryImpl.kt */
/* loaded from: classes4.dex */
public final class sgc0 extends pgc0 {
    public final /* synthetic */ izs<kk6, kk6> K;
    public final /* synthetic */ rgc0.a L;
    public final /* synthetic */ gzs<s3q0> M;
    public final /* synthetic */ gzs<s3q0> N;
    public final /* synthetic */ wzs<MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint, dic0, s3q0> O;
    public final /* synthetic */ gzs<Context> P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public sgc0(izs<? super kk6, ? extends kk6> izsVar, rgc0.a aVar, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, ugc0 ugc0Var, wzs<? super MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint, ? super dic0, s3q0> wzsVar, gzs<? extends Context> gzsVar3, sjg sjgVar, UserId userId) {
        super(sjgVar, userId);
        this.K = izsVar;
        this.L = aVar;
        this.M = gzsVar;
        this.N = gzsVar2;
        this.O = wzsVar;
        this.P = gzsVar3;
    }

    @Override // xsna.pgc0, xsna.kgc0
    public final void F5(PostingCreationEntryPoint postingCreationEntryPoint, boolean z, UserId userId, ExtendedUserProfile extendedUserProfile) {
        super.F5(postingCreationEntryPoint, z, userId, extendedUserProfile);
        gzs<s3q0> gzsVar = this.M;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // xsna.pgc0, xsna.kgc0
    public final boolean L3(PostingCreationEntryPoint postingCreationEntryPoint) {
        gzs<s3q0> gzsVar;
        if (super.L3(postingCreationEntryPoint) || (gzsVar = this.N) == null) {
            return true;
        }
        gzsVar.invoke();
        return true;
    }

    @Override // xsna.pgc0
    public final Context b() {
        return this.P.invoke();
    }

    @Override // xsna.pgc0, xsna.kgc0
    public final void d2(boolean z, dic0 dic0Var, PostingCreationEntryPoint postingCreationEntryPoint) {
        UserId userId;
        aq1 aq1Var = this.i;
        if (aq1Var == null || ((Boolean) aq1Var.invoke(ExtendedCommunityProfile.StrikesRestriction.StrikeRestrictionType.POSTS)).booleanValue()) {
            fhc0 fhc0Var = this.L.c;
            if (dic0Var != null && (userId = dic0Var.a) != null) {
                fhc0Var.c(userId);
            }
            if (z) {
                fhc0Var.a().b(hhc0.a(postingCreationEntryPoint));
                p0(SchemeStat$PostDraftItemEventType.CLICK_TO_STORY);
            } else {
                ghc0.f a = fhc0Var.a();
                PostingMetricsCreationEntryPoint a2 = hhc0.a(postingCreationEntryPoint);
                a.getClass();
                a.c(MobileOfficialAppsConPostingStat$NavigationEvent.NavigationEventType.CLICK_TO_STORY_ICON, a2);
                p0(SchemeStat$PostDraftItemEventType.CLICK_TO_STORY_ICON);
            }
            this.O.invoke(z ? postingCreationEntryPoint == PostingCreationEntryPoint.GroupWallButton ? MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.GROUP_WALL_BUTTON : MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.FEED_PLUS : MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.POSTING, dic0Var);
        }
    }

    @Override // xsna.pgc0, xsna.kgc0
    public final void d7(UserId userId, PostingCreationEntryPoint postingCreationEntryPoint) {
        super.d7(userId, postingCreationEntryPoint);
        gzs<s3q0> gzsVar = this.M;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // xsna.pgc0
    public final String x() {
        return this.L.b;
    }

    @Override // xsna.pgc0, xsna.kgc0
    public final void x1(boolean z, PostingCreationEntryPoint postingCreationEntryPoint) {
        super.x1(z, postingCreationEntryPoint);
        gzs<s3q0> gzsVar = this.M;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // xsna.pgc0
    public final kk6 z() {
        return this.K.invoke(super.z());
    }
}
