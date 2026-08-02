package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.market.dto.MarketGetItemReviewResponseDto;
import com.vk.api.generated.market.dto.MarketReviewCommentsDto;
import com.vk.api.generated.vkRun.dto.VkRunStepsListItemDto;
import com.vk.auth.entername.EnterProfilePresenter;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.internal.data.LaunchForResultInfo;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dto.group.GroupMarketInfo;
import com.vk.dto.newsfeed.entries.InterestingStoriesEntry;
import com.vk.ecomm.market.album.editor.cover.presentation.MarketEditAlbumCoverFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.g;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.log.L;
import com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.CommunityCreationOnboardingFinishState;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import one.video.transform.TransformController;
import xsna.bex0;
import xsna.bfx;
import xsna.ht0;
import xsna.it0;
import xsna.it80;
import xsna.jt0;
import xsna.l310;
import xsna.p1s;
import xsna.qn60;
import xsna.qr60;
import xsna.tj50;
import xsna.xcx;
import xsna.xn50;
import xsna.zw00;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class z8f implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z8f(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v60, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        TransformController.ScaleType scaleType;
        int i = this.b;
        int i2 = 12;
        h20 h20Var = null;
        tdx tdxVar = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                ((a9f) obj2).b = null;
                L.g("ClipsTemplatesEditorProviderImpl", th);
                h03.b(th);
                return s3q0.a;
            case 1:
                return CommunityCreationOnboardingFinishState.a((CommunityCreationOnboardingFinishState) ((com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.b) obj2).b.getCurrentState(), CommunityCreationOnboardingFinishState.SubscribeStatus.IN_PROGRESS_SUBSCRIBED);
            case 2:
                vmh vmhVar = (vmh) obj2;
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) obj;
                GroupMarketInfo groupMarketInfo = extendedCommunityProfile.J2;
                GroupMarketInfo.MarketAvitoBadge marketAvitoBadge = groupMarketInfo != null ? groupMarketInfo.g : null;
                if (marketAvitoBadge == null || marketAvitoBadge.d == GroupMarketInfo.MarketAvitoBadge.Status.PENDING) {
                    return null;
                }
                return new s4m(marketAvitoBadge.c, R.drawable.vk_icon_work_outline_20, VkMiniInfoCell.Mode.Link, new com.vk.movika.sdk.base.flow.binding.j(9, vmhVar, marketAvitoBadge), null, null, null, new pw(6, extendedCommunityProfile, marketAvitoBadge), 2020);
            case 3:
                ((d4h) obj2).i.invoke(new CommunityProfileAction.a.C1567a((String) obj));
                return s3q0.a;
            case 4:
                zhf0 zhf0Var = (zhf0) obj;
                iuh iuhVar = ((xph) obj2).b;
                if (zhf0Var != null) {
                    iuhVar.getClass();
                    h20Var = new h20(zhf0Var, 20);
                }
                iuhVar.n = h20Var;
                return s3q0.a;
            case 5:
                ((ush) obj2).f.invoke(new d.n.a(true));
                return s3q0.a;
            case 6:
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.f fVar = (com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.f) obj2;
                tj50.a aVar = (tj50.a) obj;
                f57 f57Var = new f57(14);
                ao8 ao8Var = ao8.d;
                int i3 = 16;
                return new g.a(aVar.a(f57Var, ao8Var), aVar.a(new ns1(fVar, 27), ao8Var), aVar.a(new ak(i3), ao8Var), aVar.a(new c2(22), ao8Var), aVar.a(new io3(i2), ao8Var), aVar.a(new dh5(fVar, 13), ao8Var), aVar.a(new cj1(i3), ao8Var), aVar.a(new dj1(23), ao8Var), aVar.a(new r9(fVar, 26), ao8Var));
            case 7:
                bwt0.p0((View) ((i1j) obj2).q.getValue(), ((Boolean) obj).booleanValue());
                return s3q0.a;
            case 8:
                zyj zyjVar = ((nzj) obj2).d;
                jt0 jt0Var = ((tzj) obj).c;
                zyjVar.getClass();
                if (!(jt0Var instanceof jt0.c)) {
                    return jt0Var instanceof jt0.a ? new it0.a(tq.h(tlo0.Companion, R.string.ecomm_checkout_unable_to_find_address), ht0.a.c, ((jt0.a) jt0Var).a) : jt0Var instanceof jt0.b ? new it0.a(tq.h(tlo0.Companion, R.string.ecomm_checkout_address_out_of_borders), new ht0.b(), ((jt0.b) jt0Var).a) : it0.b.b;
                }
                jt0.c cVar = (jt0.c) jt0Var;
                qow qowVar = cVar.b ? null : new qow(tq.h(tlo0.Companion, R.string.ecomm_checkout_not_full_address_error));
                return new it0.c(cVar.a, qowVar, qowVar == null, cVar.c);
            case 9:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) ((c0l) obj2).g).setValue(bool);
                return s3q0.a;
            case 10:
                androidx.appcompat.app.d dVar = ((vdl) obj2).i;
                if (dVar != null) {
                    dVar.cancel();
                }
                return s3q0.a;
            case 11:
                run runVar = (run) obj2;
                runVar.f.fj(null, null);
                runVar.d.invoke();
                return s3q0.a;
            case 12:
                ((EnterProfilePresenter) obj2).z0();
                return s3q0.a;
            case 13:
                return v1s.a((v1s) obj, null, null, null, null, false, ((p1s.a) ((p1s) obj2)).b, 63);
            case 14:
                return Boolean.valueOf(epx.f(((LaunchForResultInfo) obj).c, ((FragmentEntry) obj2).d));
            case 15:
                evs evsVar = (evs) obj2;
                xcx xcxVar = (xcx) evsVar.T.getValue();
                dvs dvsVar = new dvs(1, (TransformController) evsVar.S.getValue(), TransformController.class, "setScaleType", "setScaleType(Lone/video/transform/TransformController$ScaleType;Z)V", 0);
                TransformController.ScaleType scaleType2 = xcxVar.c;
                c4u0 c4u0Var = xcxVar.a;
                int[] iArr = xcx.a.$EnumSwitchMapping$0;
                int i4 = iArr[scaleType2.ordinal()];
                if (i4 == 1) {
                    scaleType = TransformController.ScaleType.CROP;
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    scaleType = TransformController.ScaleType.FIT;
                }
                xcxVar.c = scaleType;
                c4u0Var.D.i(scaleType, true);
                dvsVar.invoke(scaleType);
                int i5 = iArr[xcxVar.c.ordinal()];
                if (i5 == 1) {
                    Context context = c4u0Var.b.getContext();
                    Drawable a = m33.a(R.drawable.one_video_icon_video_fill_24, context);
                    VkImageSimple vkImageSimple = c4u0Var.v;
                    vkImageSimple.setImageDrawable(a);
                    vkImageSimple.setContentDescription(context.getString(R.string.one_video_accessibility_resize));
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Context context2 = c4u0Var.b.getContext();
                    Drawable a2 = m33.a(R.drawable.one_video_icon_video_fill_none_24, context2);
                    VkImageSimple vkImageSimple2 = c4u0Var.v;
                    vkImageSimple2.setImageDrawable(a2);
                    vkImageSimple2.setContentDescription(context2.getString(R.string.one_video_accessibility_resize_none));
                }
                return s3q0.a;
            case 16:
                ((ehv0) ((fjt) obj2).a.getValue()).getClass();
                List<VkRunStepsListItemDto> list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (VkRunStepsListItemDto vkRunStepsListItemDto : list) {
                    int i6 = vkRunStepsListItemDto.i();
                    SimpleDateFormat simpleDateFormat = ehv0.a;
                    float e = vkRunStepsListItemDto.e() / 1000.0f;
                    Date parse = ehv0.a.parse(vkRunStepsListItemDto.d());
                    long time = parse != null ? parse.getTime() : 0L;
                    Integer g = vkRunStepsListItemDto.g();
                    arrayList.add(new m0l0(i6, e, time, g != null ? g.intValue() : 0, (vkRunStepsListItemDto.f() != null ? r3.intValue() : 0) / 1000.0f, (String) null, 96));
                }
                return arrayList;
            case 17:
                bmt bmtVar = bmt.this;
                vmt vmtVar = bmtVar.f;
                Object b = io.reactivex.rxjava3.internal.operators.mixed.n.b(vmtVar.b.f(new vxf0(), new gjj0(vmtVar.c)));
                if (!(b instanceof Result.Failure)) {
                    qn60.c cVar2 = (qn60.c) b;
                    bmtVar.b.e(new cmt(new qr60.a.c(cVar2.a, cVar2.b, false, null, 24)));
                }
                Throwable a3 = Result.a(b);
                if (a3 != null) {
                    com.vk.metrics.eventtracking.b.a.a(a3);
                }
                return s3q0.a;
            case 18:
                return Boolean.valueOf(((HashSet) obj2).contains(((kiu) obj).a.a));
            case 19:
                ((zak0) ((yju) obj2).e).setValue((String) obj);
                return s3q0.a;
            case 20:
                return new gm20((ViewGroup) obj, (xmm) obj2);
            case 21:
                InterestingStoriesEntry interestingStoriesEntry = (InterestingStoriesEntry) obj2;
                bfx.a aVar2 = (bfx.a) obj;
                if (aVar2 instanceof bfx.a.C2607a) {
                    L.i(((bfx.a.C2607a) aVar2).a);
                } else {
                    if (!(aVar2 instanceof bfx.a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tdxVar = ((bfx.a.b) aVar2).a;
                }
                interestingStoriesEntry.e = false;
                interestingStoriesEntry.k = tdxVar;
                return interestingStoriesEntry;
            case 22:
                bex0.a.b(((p7y) obj2).a, JsApiMethodType.MY_TRACKER_ID, yq.d("id", (String) obj), null, 12);
                return s3q0.a;
            case 23:
                ((l1i) obj2).invoke();
                return s3q0.a;
            case 24:
                ((rgz) obj2).b6();
                return s3q0.a;
            case 25:
                ((l2y0) obj2).u.k();
                return s3q0.a;
            case 26:
                MarketEditAlbumCoverFragment marketEditAlbumCoverFragment = (MarketEditAlbumCoverFragment) obj2;
                int i7 = MarketEditAlbumCoverFragment.c0;
                zw00.c.a aVar3 = zw00.c.a.b;
                marketEditAlbumCoverFragment.getClass();
                xn50.a.c(marketEditAlbumCoverFragment, aVar3);
                return s3q0.a;
            case 27:
                MarketGetItemReviewResponseDto marketGetItemReviewResponseDto = (MarketGetItemReviewResponseDto) obj;
                n210 a4 = ((o210) ((hoz) obj2).b).a(marketGetItemReviewResponseDto.d());
                MarketReviewCommentsDto g2 = marketGetItemReviewResponseDto.d().g();
                List<GroupsGroupFullDto> d = g2 != null ? g2.d() : null;
                MarketReviewCommentsDto g3 = marketGetItemReviewResponseDto.d().g();
                return new b310(a4, pn00.t(d370.o(d, g3 != null ? g3.f() : null)));
            case 28:
                MarketItemReviewsFragment marketItemReviewsFragment = (MarketItemReviewsFragment) obj2;
                int i8 = MarketItemReviewsFragment.w0;
                l310.a aVar4 = l310.a.b;
                marketItemReviewsFragment.getClass();
                xn50.a.c(marketItemReviewsFragment, aVar4);
                return s3q0.a;
            default:
                kiu kiuVar = (kiu) obj;
                it80.a aVar5 = it80.b;
                CallMemberId callMemberId = kiuVar.a.a;
                String str = kiuVar.c;
                sew0 sew0Var = kiuVar.h;
                ((po20) obj2).b.getClass();
                com.vk.voip.ui.c.b.getClass();
                uo20 uo20Var = new uo20(callMemberId, str, sew0Var, callMemberId.equals(com.vk.voip.ui.c.r.a()), po20.d(kiuVar.a.r), kiuVar.a.k);
                aVar5.getClass();
                return new it80(uo20Var);
        }
    }

    public /* synthetic */ z8f(vdl vdlVar, z90 z90Var) {
        this.b = 10;
        this.c = vdlVar;
    }
}
