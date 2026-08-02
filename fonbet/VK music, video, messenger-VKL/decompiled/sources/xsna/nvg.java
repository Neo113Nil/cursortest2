package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.soloader.MinElf;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsCatalogListDto;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.friends.dto.FriendsGetFollowersResponseDto;
import com.vk.api.generated.market.dto.MarketGetItemsForReviewResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.auth.enterphone.EnterPhonePresenterInfo;
import com.vk.auth.restore.RestoreReason;
import com.vk.bridges.ImageViewer;
import com.vk.common.links.LaunchContext;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.core.view.components.formitem.VkTextArea;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.music.Playlist;
import com.vk.ecomm.reviews.api.model.CommunityRepliesArgs;
import com.vk.ecomm.reviews.api.model.friendsreview.ReviewFriendsDialogArgs;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.ecomm.reviews.impl.subscriptionpayment.presentation.CommunityReviewsPinSubscriptionVKPayFragment;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.games.presentation.detail.GamesCatalogDetailFragment;
import com.vk.games.presentation.fragments.GameUnavailableFragment;
import com.vk.im.engine.models.users.User;
import com.vk.photo.editor.views.ToolButton;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.search.ui.api.SearchQuery;
import com.vk.sharing.api.dto.GroupPickerInfo;
import com.vk.sharing.core.picker.PickingImpl;
import com.vk.subscription.api.SubscribeStatus;
import com.vk.subscription.impl.RxUsersSubscriptionBusImpl;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.toggle.features.ImFeatures;
import com.vk.video.ui.upload.impl.coverchoose.presentation.fragment.CoverChooseArguments;
import com.vk.video.ui.upload.impl.coverchoose.presentation.fragment.CoverChooseFragment;
import com.vk.video.ui.upload.impl.coverchoose.presentation.fragment.CoverChooseFragmentInternalComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.chu;
import xsna.djc;
import xsna.drz;
import xsna.e3m;
import xsna.esh;
import xsna.gbt;
import xsna.iem;
import xsna.ikv0;
import xsna.izh;
import xsna.ktt;
import xsna.l4s;
import xsna.o0r0;
import xsna.pin0;
import xsna.t0d;
import xsna.tlo0;
import xsna.u6h;
import xsna.vrh0;
import xsna.xqu;
import xsna.xym0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class nvg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nvg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v138, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v36, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Drawable drawable;
        int i = this.b;
        int i2 = 0;
        int i3 = 2;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ovg ovgVar = (ovg) obj2;
                return new xvg((ViewGroup) obj, new RecyclerView.u(), ovgVar.i, ovgVar.j, ovgVar.k);
            case 1:
                ((vvr) obj2).h(1);
                return s3q0.a;
            case 2:
                k4h k4hVar = (k4h) obj2;
                AdminLeaveAction adminLeaveAction = ((u6h.b) obj).a;
                if (adminLeaveAction != null) {
                    k4hVar.invoke(adminLeaveAction);
                }
                return s3q0.a;
            case 3:
                px0 px0Var = (px0) obj2;
                if (!((MarketGetItemsForReviewResponseDto) obj).e().isEmpty()) {
                    px0Var.invoke();
                }
                return s3q0.a;
            case 4:
                tw4 tw4Var = ((aeh) obj2).f;
                it80 it80Var = (it80) obj;
                if (it80Var.a()) {
                    T t = it80Var.a;
                    if (t != 0) {
                        tw4Var.invoke(new d.b.C1610b((spg) t));
                    }
                } else {
                    tw4Var.invoke(new d.b.C1610b(null));
                }
                return s3q0.a;
            case 5:
                ((esh.a) obj2).c = true;
                return s3q0.a;
            case 6:
                izh izhVar = (izh) obj;
                tzh tzhVar = ((CommunityReviewsFragment) obj2).Z;
                if (tzhVar == null) {
                    tzhVar = null;
                }
                ajg0 ajg0Var = tzhVar.c;
                CommunityReviewsFragment communityReviewsFragment = tzhVar.a;
                if (izhVar instanceof izh.h) {
                    tzhVar.e.m(communityReviewsFragment.requireContext(), ((izh.h) izhVar).a, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                } else if (izhVar instanceof izh.e) {
                    izh.e eVar = (izh.e) izhVar;
                    tzhVar.b.d(eVar.a, communityReviewsFragment.requireContext(), eVar.b);
                } else if (izhVar instanceof izh.f) {
                    izh.f fVar = (izh.f) izhVar;
                    ImageViewer.b(myc0.d(), fVar.b, fVar.a, communityReviewsFragment.requireContext(), new szh(), false, null, 496);
                } else if (izhVar instanceof izh.b) {
                    ajg0Var.m(communityReviewsFragment.requireContext(), new ReviewFriendsDialogArgs(((izh.b) izhVar).a));
                } else if (izhVar instanceof izh.g) {
                    PickingImpl.a a = tzhVar.d.a(communityReviewsFragment.requireContext());
                    GroupPickerInfo groupPickerInfo = a.b;
                    groupPickerInfo.k = 1;
                    groupPickerInfo.j = R.string.review_reply_author;
                    izh.g gVar = (izh.g) izhVar;
                    groupPickerInfo.h = fkq0.a(gVar.a);
                    groupPickerInfo.g = gVar.b;
                    groupPickerInfo.b = true;
                    a.a(4332, communityReviewsFragment);
                } else if (izhVar instanceof izh.d) {
                    izh.d dVar = (izh.d) izhVar;
                    ajg0Var.b(communityReviewsFragment, new CommunityRepliesArgs(dVar.a, dVar.b));
                } else if (izhVar instanceof izh.c) {
                    maz.c(tzhVar.f, communityReviewsFragment.requireContext(), ((izh.c) izhVar).a, LaunchContext.A, null, null, 24);
                } else {
                    if (!(izhVar instanceof izh.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str = ((izh.a) izhVar).a;
                    CommunityReviewsPinSubscriptionVKPayFragment.a aVar = new CommunityReviewsPinSubscriptionVKPayFragment.a(CommunityReviewsPinSubscriptionVKPayFragment.class, null, null);
                    aVar.j.putString("COMMUNITY_REVIEWS_PIN_VKPAY_URL", str);
                    aVar.g(1998, communityReviewsFragment);
                }
                return s3q0.a;
            case 7:
                ((u1j) obj2).v.invoke((v1j) obj);
                return s3q0.a;
            case 8:
                x2j x2jVar = (x2j) obj2;
                x2jVar.f.invoke();
                x2jVar.dismiss();
                return s3q0.a;
            case 9:
                qcy<Object>[] qcyVarArr = CoverChooseFragment.P;
                final CoverChooseFragmentInternalComponent coverChooseFragmentInternalComponent = (CoverChooseFragmentInternalComponent) ((CoverChooseFragment) obj2).N.getValue();
                final CoverChooseArguments coverChooseArguments = coverChooseFragmentInternalComponent.a.a;
                return new cn50(up2.d(new tx(9, (gzs) obj, coverChooseArguments), new wb0() { // from class: xsna.u0k
                    @Override // xsna.izs
                    /* renamed from: j */
                    public final qj50 invoke(sj50 sj50Var) {
                        nwy nwyVar = coverChooseFragmentInternalComponent.c;
                        qcy<Object> qcyVar = CoverChooseFragmentInternalComponent.f[1];
                        return new z0k(CoverChooseArguments.this, (a1k) nwyVar.c(), sj50Var);
                    }
                }, new tti(new u05(coverChooseArguments, i3))));
            case 10:
                gzs gzsVar = (gzs) obj2;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 11:
                ((iw3) obj2).a(zns.a);
                return s3q0.a;
            case 12:
                t4m t4mVar = (t4m) obj2;
                k4m k4mVar = t4mVar.d;
                String j1 = t4mVar.b.j1();
                k4mVar.setDescription(j1 != null ? drm0.p0(j1).toString() : null);
                return s3q0.a;
            case 13:
                iem.a aVar2 = ((kem) obj2).e;
                if (aVar2 != null) {
                    iem iemVar = iem.this;
                    chu chuVar = iemVar.o;
                    chu.b bVar = chuVar instanceof chu.b ? (chu.b) chuVar : null;
                    if (bVar != null) {
                        iemVar.i.D(iemVar, new jem(bVar.a));
                    }
                }
                return s3q0.a;
            case 14:
                w7o w7oVar = (w7o) obj2;
                w7oVar.d.X(w7oVar.a, (Playlist) obj);
                return s3q0.a;
            case 15:
                qgi0.h((tgi0) obj, ((DonutVideoUiModel.DescriptionChip) obj2).d);
                return s3q0.a;
            case 16:
                ((kzo) obj2).n.t.setEnabled(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 17:
                com.vk.attachpicker.screen.h hVar = (com.vk.attachpicker.screen.h) obj2;
                ToolButton toolButton = (ToolButton) obj;
                if (hVar.p.f) {
                    ImFeatures imFeatures = ImFeatures.BLUR_POST;
                    imFeatures.getClass();
                    if (com.vk.toggle.b.A.a(imFeatures)) {
                        toolButton.post(new wv4(6, hVar, toolButton));
                    }
                }
                return s3q0.a;
            case 18:
                com.vk.auth.enterphone.a aVar3 = (com.vk.auth.enterphone.a) obj2;
                String str2 = (String) obj;
                EnterPhonePresenterInfo enterPhonePresenterInfo = aVar3.x;
                if (enterPhonePresenterInfo instanceof EnterPhonePresenterInfo.Validate) {
                    com.vk.auth.main.b bVar2 = aVar3.d;
                    (bVar2 != null ? bVar2 : null).X0(new pin0.a(((EnterPhonePresenterInfo.Validate) enterPhonePresenterInfo).c));
                } else {
                    com.vk.auth.main.b bVar3 = aVar3.d;
                    (bVar3 != null ? bVar3 : null).S0(new RestoreReason.AlreadyUsedPhone(str2));
                }
                return s3q0.a;
            case 19:
                ((g2q) obj2).g6();
                return Boolean.TRUE;
            case 20:
                zuq zuqVar = (zuq) obj2;
                SearchQuery searchQuery = (SearchQuery) obj;
                vrh0.a aVar4 = zuqVar.i;
                if (aVar4 == null) {
                    return s3q0.a;
                }
                zuqVar.k.addLast(searchQuery);
                aVar4.b(searchQuery);
                return s3q0.a;
            case 21:
                drz.a aVar5 = (drz.a) obj2;
                LinkedHashMap linkedHashMap = new LinkedHashMap((Map) aVar5.a);
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    linkedHashMap.remove(Integer.valueOf(((rpm) it.next()).a));
                }
                return drz.a.a(aVar5, linkedHashMap);
            case 22:
                l4s l4sVar = (l4s) obj2;
                List<UsersUserFullDto> e = ((FriendsGetFollowersResponseDto) obj).e();
                return ((zi50) l4sVar.f.getValue()).a(e != null ? cj50.a(e, new l4s.a(1, l4sVar.e, j2r0.class, "map", "map(Lcom/vk/api/generated/users/dto/UsersUserFullDto;)Lcom/vk/dto/user/UserProfile;", 0)) : EmptyList.b).l(new l7(new wh6(25), 23));
            case 23:
                fxt0 fxt0Var = (fxt0) obj2;
                VkFormField vkFormField = (VkFormField) obj;
                FrameLayout frameLayout = (FrameLayout) vkFormField.findViewById(R.id.vk_form_item_layout_container);
                View childAt = frameLayout != null ? frameLayout.getChildAt(1) : null;
                VkTextArea vkTextArea = childAt instanceof VkTextArea ? (VkTextArea) childAt : null;
                if (vkTextArea != null) {
                    vkTextArea.setMiddle(new VkTextArea.d(12, oq.d(tlo0.Companion, (String) ((zak0) fxt0Var.h).getValue()), new tlo0.h("Placeholder")));
                }
                if (vkTextArea != null) {
                    vkTextArea.setBefore(((Boolean) ((zak0) fxt0Var.g).getValue()).booleanValue() ? new VkTextArea.b.a(new gko(R.drawable.vk_icon_search_outline_24)) : null);
                }
                if (fxt0Var.a()) {
                    Context context = vkFormField.getContext();
                    e3m.a aVar6 = e3m.a;
                    drawable = m33.a(R.drawable.vk_icon_cross_large_outline_28, context);
                } else {
                    drawable = null;
                }
                x5i x5iVar = fxt0Var.a() ? new x5i(fxt0Var, 18) : null;
                vkFormField.setAfterIconButtonDrawable(drawable);
                vkFormField.setAfterIconButtonContentDescription("Clear");
                if (x5iVar != null) {
                    vkFormField.setOnAfterIconButtonClickListener(new z95(1, x5iVar));
                }
                vkFormField.setAfterIconButtonVisible(drawable != null);
                if (((Boolean) ((zak0) fxt0Var.a).getValue()).booleanValue()) {
                    vkFormField.setLabel("Label");
                    vkFormField.setRequired(((Boolean) ((zak0) fxt0Var.c).getValue()).booleanValue());
                } else {
                    vkFormField.setLabel("");
                    vkFormField.setRequired(false);
                }
                if (!((Boolean) ((zak0) fxt0Var.b).getValue()).booleanValue()) {
                    vkFormField.setError("");
                    vkFormField.setCaption("");
                } else if (fxt0Var.b()) {
                    vkFormField.setError("Error message");
                    vkFormField.setCaption("");
                } else {
                    vkFormField.setError("");
                    vkFormField.setCaption("Caption");
                }
                vkFormField.setAfterText(((Boolean) ((zak0) fxt0Var.f).getValue()).booleanValue() ? ((String) ((zak0) fxt0Var.h).getValue()).length() + "/25" : "");
                vkFormField.setError(fxt0Var.b());
                if (vkTextArea != null) {
                    vkTextArea.setError(fxt0Var.b());
                }
                return s3q0.a;
            case 24:
                wjs wjsVar = (wjs) obj2;
                qtd0 qtd0Var = (qtd0) obj;
                if (qtd0Var instanceof User) {
                    User user = (User) qtd0Var;
                    int i4 = user.z;
                    xym0 xym0Var = wjsVar.f;
                    long j = user.b;
                    xym0Var.getClass();
                    xym0.a.Companion.getClass();
                    int i5 = xym0.b.$EnumSwitchMapping$0[(i4 != 1 ? i4 != 2 ? xym0.a.UNKNOWN : xym0.a.FRIENDSHIP : xym0.a.NO_FRIENDSHIP).ordinal()];
                    if (i5 == 1) {
                        i2 = 1;
                    } else if (i5 == 2) {
                        i2 = 3;
                    }
                    RxUsersSubscriptionBusImpl m = xwk.e().T().m();
                    SubscribeStatus.Companion.getClass();
                    m.b(new kym0(SubscribeStatus.a.a(i2), new UserId(j), null, null, 12));
                }
                wjsVar.b.d0(qtd0Var);
                wjsVar.d = null;
                return s3q0.a;
            case 25:
                ((rws) obj2).a.b(t0d.k.c.a);
                return s3q0.a;
            case 26:
                com.vk.attachpicker.fragment.gallery.c cVar = (com.vk.attachpicker.fragment.gallery.c) obj2;
                Intent intent = (Intent) obj;
                if (intent != null) {
                    cVar.b(intent);
                }
                return s3q0.a;
            case 27:
                GameUnavailableFragment gameUnavailableFragment = (GameUnavailableFragment) obj2;
                qcy<Object>[] qcyVarArr2 = GameUnavailableFragment.W;
                List<AppsAppDto> e2 = ((AppsCatalogListDto) obj).e();
                ArrayList arrayList = new ArrayList(c5g.u(e2, 10));
                for (AppsAppDto appsAppDto : e2) {
                    ((re3) gameUnavailableFragment.V.getValue()).getClass();
                    arrayList.add(re3.b(appsAppDto));
                }
                return arrayList;
            case 28:
                GamesCatalogDetailFragment gamesCatalogDetailFragment = (GamesCatalogDetailFragment) obj2;
                gbt gbtVar = (gbt) obj;
                int i6 = GamesCatalogDetailFragment.d0;
                if (gbtVar.equals(gbt.a.a)) {
                    gamesCatalogDetailFragment.finish();
                } else if (gbtVar instanceof gbt.c) {
                    djc djcVar = ((gbt.c) gbtVar).a;
                    if (djcVar instanceof djc.b) {
                        djc.b bVar4 = (djc.b) djcVar;
                        w9t.b(gamesCatalogDetailFragment.fo(), bVar4.a.d, bVar4.b);
                        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                        SuperappUiRouterBridge superappUiRouterBridge2 = superappUiRouterBridge != null ? superappUiRouterBridge : null;
                        Context requireContext = gamesCatalogDetailFragment.requireContext();
                        sbt sbtVar = bVar4.a;
                        WebApiApplication webApiApplication = sbtVar.a;
                        String str3 = sbtVar.b;
                        String str4 = str3 != null ? str3 : "";
                        SuperappUiRouterBridge.b.b(superappUiRouterBridge2, requireContext, webApiApplication, new nex0(str4, str4), (String) gamesCatalogDetailFragment.S.getValue(), sbtVar.c, bVar4.c, bVar4.d, 128);
                    } else if (djcVar instanceof djc.e) {
                        djc.e eVar2 = (djc.e) djcVar;
                        String str5 = eVar2.b;
                        String str6 = eVar2.a;
                        w9t.b(gamesCatalogDetailFragment.fo(), str5 != null ? str5 : "", null);
                        rex0 rex0Var = e370.j;
                        (rex0Var != null ? rex0Var : null).c(gamesCatalogDetailFragment.requireContext(), str6);
                    } else if (djcVar instanceof djc.f) {
                        UserId userId = ((djc.f) djcVar).a;
                        SuperappUiRouterBridge superappUiRouterBridge3 = e370.d;
                        (superappUiRouterBridge3 != null ? superappUiRouterBridge3 : null).i0(gamesCatalogDetailFragment.requireContext(), userId);
                    } else if (djcVar instanceof djc.a) {
                        w9t.b(gamesCatalogDetailFragment.fo(), ((djc.a) djcVar).a, null);
                        ((zd3) gamesCatalogDetailFragment.U.getValue()).f(gamesCatalogDetailFragment.requireContext(), null);
                    }
                } else {
                    if (!(gbtVar instanceof gbt.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    boolean z = ((gbt.b) gbtVar).a;
                    int i7 = z ? R.string.vk_games_deletion_done_snackbar : R.string.vk_games_error_snackbar;
                    int i8 = z ? R.drawable.vk_icon_check_circle_outline_28 : R.drawable.vk_icon_error_circle_outline_28;
                    int i9 = z ? R.attr.vk_ui_icon_positive : R.attr.vk_ui_background_negative;
                    Context mo2getContext = gamesCatalogDetailFragment.mo2getContext();
                    if (mo2getContext != null) {
                        ikv0.a aVar7 = new ikv0.a(mo2getContext);
                        aVar7.t = new ikv0.c.C3058c(i8, Integer.valueOf(i9), (Size) null, 12);
                        aVar7.u = new ikv0.d(mo2getContext.getString(i7), (String) null, (ikv0.d.a) null, 6);
                        aVar7.n();
                    }
                }
                return s3q0.a;
            default:
                ktt kttVar = (ktt) obj2;
                ktt.a aVar8 = (ktt.a) obj;
                AudioAudioDto audioAudioDto = aVar8.a;
                if (audioAudioDto == null || !fkq0.b(audioAudioDto.q())) {
                    return io.reactivex.rxjava3.core.x.k(aVar8);
                }
                List singletonList = Collections.singletonList(fkq0.e(audioAudioDto.q()));
                String str7 = kttVar.v;
                if ((2 & 4) != 0) {
                    str7 = null;
                }
                return rsg0.w0(yfb.x(xqu.a.a(str7, singletonList, null))).l(new l7(new n6f(aVar8, 29), 27));
        }
    }
}
