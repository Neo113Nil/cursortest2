package xsna;

import android.text.SpannedString;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.vk.api.generated.friends.dto.FriendsGetFollowersResponseDto;
import com.vk.api.generated.stories.dto.StoriesGetInterestingBlockResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.auth.enterpassword.EnterPasswordPresenter;
import com.vk.auth.main.AuthModel;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SignUpRouter;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.mvp.holder.group.CommunitiesCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesSearchTopBarVh;
import com.vk.clips.tool.view.viewer.feed.wrapper.fragment.FragmentContainerFrameLayout;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.core.compose.component.group.footer.GroupFooter;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.group.footer.VkGroupFooter;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.dto.common.Source;
import com.vk.dto.narratives.HighlightLocalStoryCover;
import com.vk.dto.stories.model.DiscoverBlockType;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.ecomm.reviews.impl.communities.replies.CommunityRepliesFragment;
import com.vk.ecomm.reviews.impl.replies.presentation.view.RepliesView;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.reporters.ReporterType;
import com.vk.music.notifications.inapp.InAppNotification;
import com.vk.narratives.impl.highlights.HighlightChooseCoverFragment;
import com.vk.photogallery.LocalGalleryProvider;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.core.api.models.SignUpField;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.video.ui.upload.impl.coverchoose.presentation.fragment.CoverChooseResult;
import com.vk.video.ui.upload.impl.publish.domain.model.CoverDo;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.RandomAccess;
import java.util.UUID;
import kotlin.collections.EmptyList;
import xsna.aex;
import xsna.bfx;
import xsna.dr00;
import xsna.p66;
import xsna.tj50;
import xsna.xrh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class arf implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ arf(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.RectF, xsna.zcl] */
    /* JADX WARN: Type inference failed for: r3v36, types: [xsna.xrh$d$g] */
    /* JADX WARN: Type inference failed for: r3v80 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List localAlbums;
        int i = 2;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        VkGroupFooter.a aVar = null;
        r4 = false;
        boolean z = false;
        boolean z2 = true;
        switch (this.b) {
            case 0:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.c;
                int i2 = ClipsWrapperFragment.Q0;
                FragmentContainerFrameLayout r = ((wuf) obj).r();
                if (r == null) {
                    r = null;
                }
                if (r != null && clipsWrapperFragment.C0.d) {
                    UiTracker.i.l(null, r, true);
                }
                return s3q0.a;
            case 1:
                mdg mdgVar = (mdg) this.c;
                int i3 = ((cbg) obj).c;
                mdgVar.getClass();
                return Boolean.valueOf(i3 == 424);
            case 2:
                CommunitiesCatalogRootVh communitiesCatalogRootVh = (CommunitiesCatalogRootVh) this.c;
                SwitchCatalogVh switchCatalogVh = communitiesCatalogRootVh.T;
                eru0 eru0Var = (eru0) obj;
                VkGroupsSearchParams vkGroupsSearchParams = communitiesCatalogRootVh.C;
                CommunitiesSearchTopBarVh communitiesSearchTopBarVh = communitiesCatalogRootVh.Q;
                if (!epx.f(vkGroupsSearchParams, eru0Var.a)) {
                    vkGroupsSearchParams.h5(eru0Var.a);
                    ((zak0) communitiesSearchTopBarVh.i).setValue(Boolean.valueOf(!vkGroupsSearchParams.I()));
                    String str = ((tho0) ((zak0) communitiesSearchTopBarVh.g).getValue()).a.c;
                    SearchResultsVh.cb(communitiesCatalogRootVh.R, str, null, communitiesCatalogRootVh.C, false, SearchInputMethod.Keyboard, false, 42);
                    if (!((Boolean) communitiesCatalogRootVh.r.invoke()).booleanValue()) {
                        if (drm0.N(str) && vkGroupsSearchParams.I()) {
                            alj aljVar = alj.a;
                            if (!epx.f(aljVar, switchCatalogVh.s)) {
                                communitiesCatalogRootVh.i8(aljVar);
                            }
                        } else {
                            vyh0 vyh0Var = vyh0.a;
                            if (!epx.f(vyh0Var, switchCatalogVh.s)) {
                                communitiesCatalogRootVh.i8(vyh0Var);
                            }
                        }
                    }
                }
                return s3q0.a;
            case 3:
                qgi0.r((tgi0) obj, "priority_block_community_album_item_".concat(String.valueOf(((o7d0) this.c).a)));
                return s3q0.a;
            case 4:
                return kn00.a((kn00) obj, null, null, null, 0, ((d.e) this.c).b, null, null, 1983);
            case 5:
                com.vk.profile.community.impl.ui.profile.e eVar = (com.vk.profile.community.impl.ui.profile.e) this.c;
                heh hehVar = eVar.m;
                CommunityProfileState communityProfileState = (CommunityProfileState) obj;
                boolean z3 = communityProfileState.f;
                boolean z4 = communityProfileState.g;
                ExtendedCommunityProfile extendedCommunityProfile = communityProfileState.b;
                if (extendedCommunityProfile == null) {
                    if (eVar.e) {
                        return CommunityProfileViewState.Data.e.b.a(CommunityProfileViewState.Data.e.b.i, false, z3 && !z4, z4, 63);
                    }
                    return null;
                }
                a8p0 a8p0Var = new a8p0(hehVar.c(communityProfileState.v), communityProfileState.q);
                duh duhVar = eVar.f;
                CommunityProfileState.d dVar = communityProfileState.o;
                xrh xrhVar = communityProfileState.i;
                xrh.d dVar2 = xrhVar instanceof xrh.d ? (xrh.d) xrhVar : null;
                duhVar.getClass();
                ArrayList arrayList = new ArrayList();
                if (extendedCommunityProfile.a0 > 0 && !extendedCommunityProfile.g()) {
                    arrayList.add(new CommunityProfileViewState.Data.d.e(dVar2 instanceof xrh.d.g ? (xrh.d.g) dVar2 : 0));
                }
                if (!extendedCommunityProfile.g() && !bwd0.a(extendedCommunityProfile) && ((extendedCommunityProfile.Y != 0 || extendedCommunityProfile.Z != 0 || !bwd0.b(extendedCommunityProfile) || extendedCommunityProfile.j1) && ((extendedCommunityProfile.Y != 2 || !bwd0.b(extendedCommunityProfile) || extendedCommunityProfile.j1) && !bwd0.f(extendedCommunityProfile) && !bwd0.c(extendedCommunityProfile)))) {
                    arrayList.add(new CommunityProfileViewState.Data.d.g(extendedCommunityProfile.j1));
                }
                if (bwd0.h(extendedCommunityProfile) && (dVar instanceof CommunityProfileState.d.C1624d)) {
                    arrayList.add(CommunityProfileViewState.Data.d.a.a);
                }
                if (dVar instanceof CommunityProfileState.d.e) {
                    arrayList.add(CommunityProfileViewState.Data.d.b.a);
                }
                if (!w2h.c(extendedCommunityProfile)) {
                    if (w2h.d(extendedCommunityProfile)) {
                        arrayList.add(CommunityProfileViewState.Data.d.h.a);
                    }
                    arrayList.add(CommunityProfileViewState.Data.d.f.a);
                }
                if (dVar instanceof CommunityProfileState.d.b) {
                    arrayList.add(new CommunityProfileViewState.Data.d.C1627d(((CommunityProfileState.d.b) dVar).a));
                }
                if (dVar instanceof CommunityProfileState.d.a) {
                    arrayList.add(CommunityProfileViewState.Data.d.c.a);
                }
                CommunityProfileViewState.Data.e e = hehVar.e(extendedCommunityProfile, communityProfileState.l, arrayList, a8p0Var);
                if (!(e instanceof CommunityProfileViewState.Data.e.b)) {
                    return e;
                }
                CommunityProfileViewState.Data.e.b bVar = (CommunityProfileViewState.Data.e.b) e;
                boolean z5 = (communityProfileState.d == null || z4) ? false : true;
                if (z3 && !z4) {
                    z = true;
                }
                return CommunityProfileViewState.Data.e.b.a(bVar, z5, z, z4, 31);
            case 6:
                CommunityRepliesFragment communityRepliesFragment = (CommunityRepliesFragment) this.c;
                RepliesView repliesView = communityRepliesFragment.S;
                if (repliesView != null) {
                    repliesView.d();
                }
                RepliesView repliesView2 = communityRepliesFragment.S;
                if (repliesView2 != null) {
                    repliesView2.b();
                }
                RepliesView repliesView3 = communityRepliesFragment.S;
                if (repliesView3 != null) {
                    repliesView3.setVisibility(8);
                }
                NestedScrollView nestedScrollView = communityRepliesFragment.R;
                if (nestedScrollView != null) {
                    nestedScrollView.setVisibility(0);
                }
                WriteBar writeBar = communityRepliesFragment.U;
                if (writeBar != null) {
                    writeBar.setVisibility(8);
                }
                NestedScrollView nestedScrollView2 = communityRepliesFragment.R;
                if (nestedScrollView2 != null) {
                    nestedScrollView2.setVisibility(0);
                }
                VkSpinner vkSpinner = communityRepliesFragment.T;
                if (vkSpinner != null) {
                    vkSpinner.setVisibility(8);
                }
                return s3q0.a;
            case 7:
                return PublishState.a((PublishState) obj, null, null, new CoverDo.Local(((CoverChooseResult.Saved) ((hbe0) this.c).b).b), null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, null, false, false, false, false, -5, 2047);
            case 8:
                w2w w2wVar = (w2w) this.c;
                return w2wVar.K().n().k(UUID.randomUUID().toString(), k9q0.p(w2wVar) ? ReporterType.GROUP_CHAT : ReporterType.CHAT);
            case 9:
                ((awq) this.c).j((Throwable) obj);
                return s3q0.a;
            case 10:
                return SpannedString.valueOf(((pdn) this.c).d.m(((jen) obj).c.d));
            case 11:
                ((rdo) this.c).t();
                return s3q0.a;
            case 12:
                Object obj2 = ((zop) this.c).o;
                Object obj3 = obj2;
                if (obj2 == null) {
                    obj3 = null;
                }
                EnterPasswordPresenter enterPasswordPresenter = (EnterPasswordPresenter) obj3;
                p66.c cVar = enterPasswordPresenter.w;
                AuthModel authModel = enterPasswordPresenter.c;
                AuthStatSender authStatSender = enterPasswordPresenter.e;
                if (SakFeatures.Type.FEATURE_STRONG_PASSWORD.h()) {
                    com.vk.auth.main.e eVar2 = enterPasswordPresenter.o;
                    com.vk.auth.main.e eVar3 = eVar2 != null ? eVar2 : null;
                    String str2 = enterPasswordPresenter.x;
                    SignUpDataHolder signUpDataHolder = eVar3.b;
                    signUpDataHolder.n = str2;
                    signUpDataHolder.t.add(SignUpField.PASSWORD);
                    eVar3.j(SignUpRouter.DataScreen.PASSWORD, cVar);
                    authStatSender.d(AuthStatSender.Screen.PASSWORD);
                } else if (enterPasswordPresenter.x.length() < authModel.j()) {
                    yop yopVar = (yop) enterPasswordPresenter.a;
                    if (yopVar != null) {
                        yopVar.Oj(authModel.j());
                    }
                    com.vk.registration.funnels.b.a.getClass();
                    RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                    frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.INCORRECT_PASSWORD, null, null, null, null, null, null, 238);
                    AuthStatSender.Screen screen = AuthStatSender.Screen.PASSWORD;
                    new EnterPasswordPresenter.PasswordIsTooShortException(authModel.j());
                    authStatSender.e(screen);
                } else if (epx.f(enterPasswordPresenter.x, enterPasswordPresenter.y)) {
                    com.vk.auth.main.e eVar4 = enterPasswordPresenter.o;
                    com.vk.auth.main.e eVar5 = eVar4 != null ? eVar4 : null;
                    String str3 = enterPasswordPresenter.x;
                    SignUpDataHolder signUpDataHolder2 = eVar5.b;
                    signUpDataHolder2.n = str3;
                    signUpDataHolder2.t.add(SignUpField.PASSWORD);
                    eVar5.j(SignUpRouter.DataScreen.PASSWORD, cVar);
                    authStatSender.d(AuthStatSender.Screen.PASSWORD);
                } else {
                    yop yopVar2 = (yop) enterPasswordPresenter.a;
                    if (yopVar2 != null) {
                        yopVar2.X8();
                    }
                    com.vk.registration.funnels.b.a.getClass();
                    RegistrationFunnelScreenStack registrationFunnelScreenStack2 = frf0.a;
                    frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.INCORRECT_PASSWORD, null, null, null, null, null, null, 238);
                    AuthStatSender.Screen screen2 = AuthStatSender.Screen.PASSWORD;
                    new EnterPasswordPresenter.PasswordEqualityException();
                    authStatSender.e(screen2);
                }
                return s3q0.a;
            case 13:
                String str4 = (String) obj;
                y4q y4qVar = (y4q) ((w4q) this.c).a;
                if (y4qVar != null) {
                    y4qVar.Fk(str4);
                }
                return s3q0.a;
            case 14:
                p3s p3sVar = (p3s) this.c;
                FriendsGetFollowersResponseDto friendsGetFollowersResponseDto = (FriendsGetFollowersResponseDto) obj;
                List<UsersUserFullDto> e2 = friendsGetFollowersResponseDto.e();
                List<zxq0> a = e2 != null ? cj50.a(e2, new odg(p3sVar.d, 2)) : EmptyList.b;
                Integer d = friendsGetFollowersResponseDto.d();
                return p3sVar.c.a(a).l(new com.vk.movika.sdk.base.ui.j(new rnm(d != null ? d.intValue() : 0, i), 13));
            case 15:
                ((evs) this.c).y().bk(sms0.a);
                return s3q0.a;
            case 16:
                ah7 ah7Var = ((fws) this.c).i;
                Boolean bool = Boolean.FALSE;
                ah7Var.invoke(bool, bool);
                return s3q0.a;
            case 17:
                yju yjuVar = (yju) this.c;
                wh50 wh50Var = yjuVar.e;
                VkGroupFooter vkGroupFooter = (VkGroupFooter) obj;
                String str5 = (String) ((zak0) yjuVar.d).getValue();
                LinkedHashMap linkedHashMap = yjuVar.c;
                switch (str5.hashCode()) {
                    case -1272595700:
                        if (str5.equals("loader spinner")) {
                            aVar = new com.vk.core.view.components.group.footer.c(yju.c((GroupFooter.Loader.Size) linkedHashMap.get((String) ((zak0) wh50Var).getValue())));
                            break;
                        }
                        break;
                    case 8855389:
                        if (str5.equals("list footer")) {
                            aVar = new VkGroupFooter.a.b(oq.d(tlo0.Companion, "4 видео"));
                            break;
                        }
                        break;
                    case 9068507:
                        if (str5.equals("group description")) {
                            aVar = new VkGroupFooter.a.C0839a(oq.d(tlo0.Companion, "Вы будете получать только важные уведомления."));
                            break;
                        }
                        break;
                    case 562630758:
                        if (str5.equals("loader icon")) {
                            aVar = new com.vk.core.view.components.group.footer.b(new gko(R.drawable.vk_icon_logo_vkid_20), yju.c((GroupFooter.Loader.Size) linkedHashMap.get((String) ((zak0) wh50Var).getValue())));
                            break;
                        }
                        break;
                }
                vkGroupFooter.setContent(aVar);
                return s3q0.a;
            case 18:
                HighlightChooseCoverFragment.c cVar2 = (HighlightChooseCoverFragment.c) this.c;
                cVar2.f.setValue(cVar2, HighlightChooseCoverFragment.c.g[1], new HighlightLocalStoryCover((StoryEntry) obj, r3, i, r3));
                return s3q0.a;
            case 19:
                ((pav) this.c).b = (cxi) obj;
                return s3q0.a;
            case 20:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.h(tgi0Var, (String) this.c);
                qgi0.n(tgi0Var, 5);
                return s3q0.a;
            case 21:
                return quv.m((quv) this.c, (v3e0) obj);
            case 22:
                q5w q5wVar = (q5w) this.c;
                m5w m5wVar = (m5w) obj;
                f1e0 a2 = s7w.a(m5wVar.a.a);
                Collection<Msg> values = m5wVar.a.b.values();
                f1e0 f1e0Var = new f1e0();
                if ((values instanceof List) && (values instanceof RandomAccess)) {
                    List list = (List) values;
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        lv30.b((Msg) list.get(i4), f1e0Var);
                    }
                } else {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        lv30.b((Msg) it.next(), f1e0Var);
                    }
                }
                a2.e(f1e0Var);
                return ((lzv) q5wVar.b).b(q5wVar, ((mjg) q5wVar.c).d(new e1e0(a2.h(), Source.CACHE, false))).l(new p5w(new xgv(m5wVar, i), r4 ? 1 : 0));
            case 23:
                return Boolean.valueOf(((InAppNotification.NotificationType) this.c) == ((wqw) obj).b.I());
            case 24:
                StoriesGetInterestingBlockResponseDto storiesGetInterestingBlockResponseDto = (StoriesGetInterestingBlockResponseDto) obj;
                lsl0 lsl0Var = (lsl0) ((bfx) this.c).b.getValue();
                lsl0Var.getClass();
                new j2r0();
                LinkedHashMap b = j2r0.b(storiesGetInterestingBlockResponseDto.i());
                new dqu();
                ArrayList b2 = esl0.b((esl0) lsl0Var.a.getValue(), storiesGetInterestingBlockResponseDto.f(), b590.a(new b590(), null, storiesGetInterestingBlockResponseDto.i(), storiesGetInterestingBlockResponseDto.e(), 3), b, dqu.b(storiesGetInterestingBlockResponseDto.e()));
                StoriesGetInterestingBlockResponseDto.BlockTypeDto d2 = storiesGetInterestingBlockResponseDto.d();
                int i5 = d2 == null ? -1 : lf7.$EnumSwitchMapping$0[d2.ordinal()];
                DiscoverBlockType discoverBlockType = i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? DiscoverBlockType.DISCOVER : DiscoverBlockType.PHONE_BOOK_STORIES : DiscoverBlockType.SOCIAL : DiscoverBlockType.FEED : DiscoverBlockType.DISCOVER;
                String title = storiesGetInterestingBlockResponseDto.getTitle();
                int size2 = b2.size();
                String r2 = storiesGetInterestingBlockResponseDto.r();
                String g = storiesGetInterestingBlockResponseDto.g();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = b2.iterator();
                while (it2.hasNext()) {
                    StoriesContainer storiesContainer = (StoriesContainer) it2.next();
                    aex.a a3 = eex.a(storiesContainer);
                    if (a3 != null) {
                        arrayList2.add(a3);
                        arrayList3.add(storiesContainer);
                    }
                }
                if (arrayList2.size() > 0) {
                    arrayList2.add(new aex.b(discoverBlockType));
                }
                return new bfx.a.b(new tdx(title, size2, arrayList2, arrayList3, discoverBlockType, r2, g));
            case 25:
                localAlbums = ((LocalGalleryProvider) this.c).toLocalAlbums((List) obj);
                return localAlbums;
            case 26:
                ((com.vk.clips.sdk.shared.item.market_ads.c) this.c).d.getClass();
                return new dr00.a(((tj50.a) obj).a(new xmz((int) (z2 ? 1 : 0)), ao8.d));
            case 27:
                ((z010) this.c).n.a();
                return s3q0.a;
            case 28:
                i810 i810Var = (i810) this.c;
                return new j810((ViewGroup) obj, i810Var.i, i810Var.j);
            default:
                com.vk.newsfeed.posting.market_picker.presentation.base.view.e eVar6 = (com.vk.newsfeed.posting.market_picker.presentation.base.view.e) this.c;
                tgi0 tgi0Var2 = (tgi0) obj;
                qgi0.r(tgi0Var2, "PostingSaveButtonMarket");
                qgi0.h(tgi0Var2, eVar6.q.getContext().getString(R.string.market_picker_done));
                return s3q0.a;
        }
    }
}
