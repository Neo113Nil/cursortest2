package xsna;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.location.Location;
import android.media.ExifInterface;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.friends.FriendsGetRecommendations;
import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.catalog2.common.ui.holders.group.GroupVh;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.WritePermission;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.dto.newsfeed.entries.ProfilesRecommendations;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.market.good.ui.restriction.ProductCardRestrictionViewState;
import com.vk.ecomm.market.good.ui.restriction.c;
import com.vk.ecomm.reviews.impl.communities.replies.CommunityRepliesFragment;
import com.vk.fave.entities.FavePage;
import com.vk.fave.entities.FaveType;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.reaction.FeedAnimatedView;
import com.vk.im.design.view.pagination.pin.ImMultiPinView;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.network.kbh.state.NetworkState;
import com.vk.profile.community.creationonboarding.api.models.OnBoardingTaskType;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.actions.c;
import com.vk.profile.community.impl.ui.profile.f;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vk.search.params.api.City;
import com.vk.search.params.api.domain.model.education.School;
import com.vk.search.params.api.domain.model.education.University;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.c;
import com.vkontakte.android.R;
import com.vkontakte.android.actionlinks.views.fragments.ItemsDialogWrapper;
import com.vkontakte.android.attachments.StickerAttachment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.c8p;
import xsna.dw20;
import xsna.j4q0;
import xsna.l3s;
import xsna.lfc;
import xsna.niu;
import xsna.qn60;
import xsna.s9h0;
import xsna.w1g0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class bhh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bhh(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:245:0x0660, code lost:
    
        if (r2 == null) goto L254;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v65, types: [T, xsna.dw20] */
    /* JADX WARN: Type inference failed for: r3v34, types: [T, xsna.dw20] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object obj2;
        CommunityProfileContent communityProfileContent;
        CommunityProfileContent.InitialPosition initialPosition;
        String str;
        dw20 a;
        dw20 a2;
        dw20 a3;
        cqq cqqVar;
        String str2;
        ProductCardRestrictionViewState productCardRestrictionViewState;
        ProductCardRestrictionViewState.Button button;
        ProductCardRestrictionViewState.Button button2;
        String str3 = "";
        int i = 14;
        int i2 = 1;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(epx.f(((li7) obj).a, fkq0.a(((chh) this.c).a)));
            case 1:
                com.vk.profile.community.impl.ui.profile.actions.c cVar = (com.vk.profile.community.impl.ui.profile.actions.c) this.c;
                switch (c.a.$EnumSwitchMapping$0[((OnBoardingTaskType) obj).ordinal()]) {
                    case 1:
                        obj2 = CommunityProfileAction.e.c.d.b.b;
                        break;
                    case 2:
                        obj2 = CommunityProfileAction.e.c.d.C1579d.b;
                        break;
                    case 3:
                        obj2 = CommunityProfileAction.e.c.d.f.b;
                        break;
                    case 4:
                        obj2 = CommunityProfileAction.e.c.d.C1578c.b;
                        break;
                    case 5:
                        obj2 = CommunityProfileAction.e.c.d.C1580e.b;
                        break;
                    case 6:
                        obj2 = CommunityProfileAction.e.c.d.g.b;
                        break;
                    case 7:
                        obj2 = CommunityProfileAction.e.c.d.h.b;
                        break;
                    case 8:
                        obj2 = CommunityProfileAction.e.c.d.a.b;
                        break;
                    default:
                        return s3q0.a;
                }
                cVar.e.invoke(obj2);
                return s3q0.a;
            case 2:
                com.vk.profile.community.impl.ui.profile.f fVar = (com.vk.profile.community.impl.ui.profile.f) this.c;
                CommunityProfileViewState.Data.b bVar = (CommunityProfileViewState.Data.b) obj;
                wjf0.c(fVar.l, new defpackage.f0(10, fVar, bVar));
                if (bVar != null && (communityProfileContent = bVar.a) != null && (initialPosition = communityProfileContent.g) != null) {
                    int i3 = f.c.$EnumSwitchMapping$0[initialPosition.b.ordinal()];
                    if (i3 == 1) {
                        fVar.d();
                    } else if (i3 == 2) {
                        fVar.d();
                    } else if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return s3q0.a;
            case 3:
                CommunityRepliesFragment communityRepliesFragment = (CommunityRepliesFragment) this.c;
                int i4 = CommunityRepliesFragment.d0;
                w1g0.j jVar = new w1g0.j("", Collections.singletonList((StickerAttachment) obj));
                communityRepliesFragment.getClass();
                xn50.a.c(communityRepliesFragment, jVar);
                return s3q0.a;
            case 4:
                ((lak) this.c).w.setChecked(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 5:
                ((btl) this.c).M0();
                return s3q0.a;
            case 6:
                dfm dfmVar = ((afm) this.c).z;
                if (dfmVar != null) {
                    dfmVar.p();
                }
                return s3q0.a;
            case 7:
                int f = ((kkm) this.c).f(R.attr.vk_ui_text_accent_themed);
                abg0 abg0Var = dhr0.u;
                abg0Var.getClass();
                ((Toolbar) obj).setNavigationIcon(new baf0(abg0Var.d(R.attr.im_ic_cancel), f));
                return s3q0.a;
            case 8:
                DialogsCounters.Type type = (DialogsCounters.Type) this.c;
                xgl0 xgl0Var = (xgl0) obj;
                frn0 system = xgl0Var.system();
                com.vk.im.engine.internal.storage.delegates.dialogs.b a4 = xgl0Var.b().a();
                int d = system.d();
                com.vk.im.engine.models.dialogs.d b = a4.b(type);
                if (b != null) {
                    return new xpp(Integer.valueOf(b.b), b.c != d);
                }
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"CycleRefresh", "loadUnreadByCache: Type " + type + " is missed in cache"});
                }
                return new xpp(null, true);
            case 9:
                return com.vk.im.engine.models.dialogs.b.a((com.vk.im.engine.models.dialogs.b) obj, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, (WritePermission) this.c, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -32769, 2097151);
            case 10:
                ((e4n) this.c).m = null;
                return s3q0.a;
            case 11:
                UserId userId = (UserId) this.c;
                UserProfile userProfile = (UserProfile) j5g.a0((List) obj);
                if (userProfile == null) {
                    return null;
                }
                String str4 = userProfile.h;
                if (str4 != null) {
                    if (!drm0.E(str4, '?')) {
                        str3 = "?";
                    } else if (!drm0.G(str4, '?') && !drm0.G(str4, '&')) {
                        str3 = "&";
                    }
                    str = pzl.b(str4, str3, "cs=200x0");
                    break;
                }
                str = null;
                Bitmap bitmap = str != null ? (Bitmap) itg0.e(mcr0.m(iah0.f().widthPixels / 2, -1L, str)) : null;
                String str5 = userProfile.e;
                StringBuilder sb = new StringBuilder("@");
                String str6 = userProfile.q;
                if (str6 == null) {
                    str6 = b4q.b(userId, "id");
                }
                sb.append(str6);
                pao paoVar = new pao(userId, str5, sb.toString());
                paoVar.d = bitmap;
                return paoVar;
            case 12:
                c8p c8pVar = (c8p) this.c;
                com.vk.search.params.impl.presentation.modal.education.mvi.model.c cVar2 = (com.vk.search.params.impl.presentation.modal.education.mvi.model.c) obj;
                c8p.b bVar2 = c8p.n1;
                Integer valueOf = Integer.valueOf(R.attr.vk_ui_icon_accent);
                if (cVar2 instanceof c.a) {
                    City city = ((c.a) cVar2).a;
                    if (c8pVar.bo()) {
                        lfc.b bVar3 = new lfc.b(c8pVar.requireContext(), false);
                        bVar3.i = city != null ? Integer.valueOf(city.b) : null;
                        bVar3.h = "education_city_request";
                        a3 = bVar3.a();
                    } else {
                        lfc.a aVar = new lfc.a(c8pVar.requireContext());
                        aVar.f = city != null ? Integer.valueOf(city.b) : null;
                        aVar.e = "education_city_request";
                        a3 = aVar.a();
                    }
                    c8pVar.co(a3);
                } else if (cVar2 instanceof c.b) {
                    c.b bVar4 = (c.b) cVar2;
                    School school = bVar4.a;
                    City city2 = bVar4.b;
                    if (c8pVar.bo()) {
                        s9h0.b bVar5 = new s9h0.b(c8pVar.requireContext(), false);
                        bVar5.i = city2.b;
                        bVar5.j = school != null ? Integer.valueOf(school.c) : null;
                        bVar5.h = "education_school_request";
                        a2 = bVar5.a();
                    } else {
                        s9h0.a aVar2 = new s9h0.a(c8pVar.requireContext());
                        aVar2.f = city2.b;
                        aVar2.g = school != null ? Integer.valueOf(school.c) : null;
                        aVar2.e = "education_school_request";
                        a2 = aVar2.a();
                    }
                    c8pVar.co(a2);
                } else if (cVar2 instanceof c.C1770c) {
                    c.C1770c c1770c = (c.C1770c) cVar2;
                    University university = c1770c.a;
                    City city3 = c1770c.b;
                    if (c8pVar.bo()) {
                        j4q0.b bVar6 = new j4q0.b(c8pVar.requireContext(), false);
                        bVar6.i = city3.b;
                        bVar6.j = university != null ? Integer.valueOf(university.c) : null;
                        bVar6.h = "education_university_request";
                        a = bVar6.a();
                    } else {
                        j4q0.a aVar3 = new j4q0.a(c8pVar.requireContext());
                        aVar3.f = city3.b;
                        aVar3.g = university != null ? Integer.valueOf(university.c) : null;
                        aVar3.e = "education_university_request";
                        a = aVar3.a();
                    }
                    c8pVar.co(a);
                } else if (cVar2 instanceof c.g) {
                    c.g gVar = (c.g) cVar2;
                    String string = c8pVar.requireArguments().getString("request_key");
                    if (string == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    c8pVar.getParentFragmentManager().k0(yfb.b(new Pair("database_result", gVar.a)), string);
                    c8pVar.g0 = null;
                    c8pVar.dismiss();
                } else if (cVar2 instanceof c.f) {
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    ?? a5 = ((dw20.b) new dw20.b(c8pVar.requireContext(), null).M(R.drawable.vk_icon_report_outline_56, valueOf).v0(R.string.search_params_confirm_education_change_title).r0(R.string.search_params_confirm_education_change_description).T(R.string.cancel, new nuj(ref$ObjectRef, 6)).h0(R.string.search_params_edit_button, new wf9(ref$ObjectRef, c8pVar, (c.f) cVar2, 4)).F(dhr0.t.b(R.drawable.vk_icon_cancel_20, R.attr.vk_ui_icon_secondary), c8pVar.getString(R.string.close))).b0(new pz(ref$ObjectRef, 29)).a();
                    c8pVar.co(a5);
                    ref$ObjectRef.element = a5;
                } else if (cVar2.equals(c.e.a)) {
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ?? a6 = ((dw20.b) new dw20.b(c8pVar.requireContext(), null).M(R.drawable.vk_icon_report_outline_56, valueOf).v0(R.string.search_params_confirm_cancel_title).r0(R.string.search_params_confirm_cancel_description).T(R.string.save, new com.vk.newsfeed.common.recycler.holders.attachments.a(13, ref$ObjectRef2, c8pVar)).h0(R.string.search_params_confirm_cancel_button, new defpackage.u(i, ref$ObjectRef2, c8pVar)).F(dhr0.t.b(R.drawable.vk_icon_cancel_20, R.attr.vk_ui_icon_secondary), c8pVar.getString(R.string.close))).b0(new ayo(ref$ObjectRef2, i2)).a();
                    c8pVar.co(a6);
                    ref$ObjectRef2.element = a6;
                } else {
                    if (!cVar2.equals(c.d.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c8pVar.dismiss();
                }
                return s3q0.a;
            case 13:
                q6x q6xVar = (q6x) this.c;
                float[] fArr = new float[2];
                ((ExifInterface) obj).getLatLong(fArr);
                if (fArr[0] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[1] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    return null;
                }
                q6xVar.getClass();
                Location location = new Location("EXIF_LOCATION");
                location.setLatitude(fArr[0]);
                location.setLongitude(fArr[1]);
                return location;
            case 14:
                gpq gpqVar = (gpq) this.c;
                crq crqVar = (crq) obj;
                ArrayList arrayList = crqVar.a;
                String str7 = crqVar.c;
                ArrayList a7 = e43.a(new aic());
                nn50<State, TaskId, OutTask, Patch, Event> nn50Var = gpqVar.b;
                cqq cqqVar2 = gpqVar.f;
                pn60 pn60Var = gpqVar.k;
                kpq kpqVar = (kpq) nn50Var.getCurrentState();
                FaveType faveType = kpqVar.b;
                tqq tqqVar = kpqVar.g;
                FaveTag faveTag = kpqVar.c;
                boolean z = kpqVar.e;
                if (faveType == null) {
                    if (!z) {
                        a7.add(new kl0(pn60Var));
                    }
                    a7.add(new jl0(crqVar.b, pn60Var));
                    cqqVar = cqqVar2;
                    a7.add(new xc3(arrayList, null, cqqVar2.d, gpqVar.g, null, true, null));
                    if (arrayList.isEmpty()) {
                        List<FavePage> list = tqqVar != null ? tqqVar.a : null;
                        a7.add(new aij0(new unq(faveType, faveTag, list == null || list.isEmpty()), pn60Var));
                    }
                } else {
                    cqqVar = cqqVar2;
                    if (!z && faveType != FaveType.PRODUCT) {
                        a7.add(new il0(new mnq((arrayList.isEmpty() || faveType == FaveType.POST || faveType == FaveType.PODCAST) ? false : true), pn60Var));
                    }
                    if (faveType == FaveType.PRODUCT && !arrayList.isEmpty()) {
                        a7.add(new hl0(umq.a, pn60Var));
                    }
                    a7.add(new xc3(arrayList, null, cqqVar.d, gpqVar.g, null, true, null));
                    if (arrayList.isEmpty()) {
                        List<FavePage> list2 = tqqVar != null ? tqqVar.a : null;
                        a7.add(new aij0(new unq(faveType, faveTag, list2 == null || list2.isEmpty()), pn60Var));
                    }
                }
                cqqVar.d.a();
                qn60 qn60Var = cqqVar.c;
                qn60.b[] bVarArr = (qn60.b[]) a7.toArray(new qn60.b[0]);
                return odq.c(qn60Var, (qn60.b[]) Arrays.copyOf(bVarArr, bVarArr.length)).l(new d22(new m9(16, arrayList, str7), i));
            case 15:
                FeedAnimatedView feedAnimatedView = (FeedAnimatedView) this.c;
                feedAnimatedView.r = false;
                a780 a780Var = feedAnimatedView.b;
                if (a780Var != null) {
                    a780Var.a();
                }
                if (feedAnimatedView.k.getAndIncrement() < 3 && (str2 = feedAnimatedView.j) != null && str2.length() != 0) {
                    feedAnimatedView.f(str2, false);
                }
                feedAnimatedView.invalidate();
                return s3q0.a;
            case 16:
                q7r q7rVar = (q7r) this.c;
                Float f2 = (Float) obj;
                mkm0 mkm0Var = q7rVar.i0;
                if (mkm0Var.getCurrentStory() != null && mkm0Var.getCurrentStory().Rb()) {
                    mq50 mq50Var = q7rVar.t0;
                    float floatValue = f2.floatValue();
                    mq50Var.getClass();
                    boolean z2 = floatValue > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    cjx cjxVar = mq50Var.a;
                    if (cjxVar != null) {
                        cjxVar.o(z2);
                    }
                }
                return s3q0.a;
            case 17:
                return new vdr(((fer) this.c).c(), ((Integer) obj).intValue());
            case 18:
                ((h3s) this.c).T((l3s.e.b) obj);
                return s3q0.a;
            case 19:
                ProfilesRecommendations profilesRecommendations = (ProfilesRecommendations) this.c;
                FriendsGetRecommendations.Result result = (FriendsGetRecommendations.Result) obj;
                ProfilesRecommendations Eb = ProfilesRecommendations.Eb(profilesRecommendations, result.title, result.i(), result, result.infoCard, NewsEntry.TrackData.zb(profilesRecommendations.q, result.trackCode));
                Eb.c = profilesRecommendations.c;
                Eb.g = profilesRecommendations.g;
                Eb.h = profilesRecommendations.h;
                return Eb;
            case 20:
                rys rysVar = (rys) ((tys) this.c).a;
                if (rysVar != null) {
                    rysVar.J1();
                }
                return s3q0.a;
            case 21:
                com.vk.ecomm.market.good.ui.restriction.a aVar4 = (com.vk.ecomm.market.good.ui.restriction.a) this.c;
                ProductCardRestrictionViewState a8 = aVar4.a();
                if (((a8 == null || (button2 = a8.c) == null) ? null : button2.b) instanceof c.b) {
                    ProductCardRestrictionViewState a9 = aVar4.a();
                    if (a9 != null) {
                        ProductCardRestrictionViewState a10 = aVar4.a();
                        productCardRestrictionViewState = ProductCardRestrictionViewState.a(a9, (a10 == null || (button = a10.c) == null) ? null : ProductCardRestrictionViewState.Button.a(button, true));
                    } else {
                        productCardRestrictionViewState = null;
                    }
                    aVar4.c(productCardRestrictionViewState);
                }
                return s3q0.a;
            case 22:
                ((piu) this.c).b.b.b.onNext(niu.c.a);
                return s3q0.a;
            case 23:
                ((GroupVh) this.c).onClick((View) obj);
                return s3q0.a;
            case 24:
                sxu sxuVar = ((zxu) this.c).j;
                if (sxuVar != null) {
                    sxuVar.G();
                }
                return s3q0.a;
            case 25:
                l4w l4wVar = (l4w) this.c;
                j4w j4wVar = l4wVar.K;
                if (j4wVar == null) {
                    j4wVar = null;
                }
                if (!j4wVar.s()) {
                    AttachVideo attachVideo = l4wVar.J;
                    if (attachVideo == null) {
                        attachVideo = null;
                    }
                    VideoFile videoFile = attachVideo.b;
                    gpt0 gpt0Var = gpt0.a;
                    if (videoFile.d8() || videoFile.z0()) {
                        ConstraintLayout constraintLayout = l4wVar.c;
                        if (constraintLayout == null) {
                            constraintLayout = null;
                        }
                        Activity b2 = enj.b(constraintLayout);
                        if (b2 != null) {
                            if (d6q0.t == NetworkState.UNSTABLE) {
                                cvk.t();
                            } else {
                                fh5 fh5Var = l4wVar.A;
                                uc.o(fh5Var == null ? null : fh5Var, b2, false, null, null, null, 60);
                                s3q0 s3q0Var = s3q0.a;
                            }
                        }
                    }
                }
                return s3q0.a;
            case 26:
                VkBlurView vkBlurView = (VkBlurView) this.c;
                int i5 = ImMultiPinView.o;
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap = Bitmap.createBitmap(1, 1, config);
                createBitmap.eraseColor(352321535);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                vkBlurView.setColorOverlayShader(new BitmapShader(createBitmap, tileMode, tileMode));
                Bitmap createBitmap2 = Bitmap.createBitmap(1, 1, config);
                createBitmap2.eraseColor(352321535);
                vkBlurView.setFallbackColorOverlay(new BitmapShader(createBitmap2, tileMode, tileMode));
                return s3q0.a;
            case 27:
                gi5 gi5Var = (gi5) this.c;
                return VideoLargeListState.a((VideoLargeListState) obj, gi5Var.a, false, false, null, null, null, false, null, null, null, null, gi5Var, null, null, null, null, null, null, 0, 66846715);
            case 28:
                fw20 fw20Var = (fw20) this.c;
                tdu tduVar = (tdu) obj;
                float floatValue2 = ((vak0) fw20Var.e.b.i).getFloatValue();
                float intBitsToFloat = Float.intBitsToFloat((int) (tduVar.d() & 4294967295L));
                if (!Float.isNaN(floatValue2) && !Float.isNaN(intBitsToFloat) && intBitsToFloat != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float floatValue3 = fw20Var.a.d().floatValue();
                    tduVar.A(nix.g(tduVar, floatValue3));
                    tduVar.B(nix.h(tduVar, floatValue3));
                    tduVar.Y0(f370.i(0.5f, (floatValue2 + intBitsToFloat) / intBitsToFloat));
                }
                return s3q0.a;
            default:
                ItemsDialogWrapper itemsDialogWrapper = (ItemsDialogWrapper) this.c;
                tgi0 tgi0Var = (tgi0) obj;
                int i6 = ItemsDialogWrapper.S;
                qgi0.h(tgi0Var, itemsDialogWrapper.getString(R.string.accessibility_toolbar_back));
                qgi0.r(tgi0Var, "items_cancel_button");
                return s3q0.a;
        }
    }

    public /* synthetic */ bhh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
