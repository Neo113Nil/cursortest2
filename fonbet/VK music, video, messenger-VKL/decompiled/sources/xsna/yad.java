package xsna;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.vk.api.generated.superApp.dto.SuperAppAnimationDto;
import com.vk.api.generated.superApp.dto.SuperAppGetAnimationsResponseDto;
import com.vk.attachpicker.widget.CustomSpinner;
import com.vk.clips.entrypoints.ui.ClipsEntryPointDraftsFragment;
import com.vk.clips.favorites.impl.ui.folders.picker.ClipsFavoritesFoldersPickerFragment;
import com.vk.clips.favorites.impl.ui.folders.picker.f;
import com.vk.clips.sdk.shared.api.recom.ShortVideoMyTargetMapperTracker;
import com.vk.clips.sdk.shared.feed.controller.mvi.state.spinner.ScreenSpinnerViewState;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridDraftsListFragment;
import com.vk.dto.clips.model.ClipsEditorSessionParams;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.cart.impl.common.models.exception.MapServicesNotSuppoertedException;
import com.vk.ecomm.cart.impl.courier_map.ui.fragment.CourierMapFragment;
import com.vk.feed.settings.impl.base.fragment.FilterListFragment;
import com.vk.geo.impl.model.VisibleStyle;
import com.vk.geo.impl.model.id.StringId;
import com.vk.geo.impl.presentation.GeoFragment;
import com.vk.im.design.view.listitem.infobar.FriendsBirthdayInfoBarView;
import com.vk.location.common.LocationCommon;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.money.createtransfer.chat.CreateChatTransferFragment;
import com.vk.money.createtransfer.chat.CreateChatTransferPresenter;
import com.vk.permission.PermissionHelper;
import com.vk.profile.community.details.impl.contacts.CommunityAddContactsState;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vk.superapp.api.dto.menu.Action;
import com.vk.superapp.api.dto.menu.Animation;
import com.vk.superapp.api.dto.menu.SuperAppAnimationConfig;
import com.vk.video.profile.presentation.a;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import xsna.acx;
import xsna.c2r;
import xsna.ezj;
import xsna.gm50;
import xsna.izj;
import xsna.pwh;
import xsna.rcx;
import xsna.uuf;
import xsna.vyd;
import xsna.wk50;
import xsna.xyj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class yad implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yad(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Action action;
        Iterator<do00> it;
        boolean z;
        aw50 aw50Var;
        int i = this.b;
        int i2 = 12;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                zad zadVar = (zad) obj2;
                return new cbd((ViewGroup) obj, zadVar.i, zadVar.j, zadVar.k);
            case 1:
                zld zldVar = ((cmd) obj2).C;
                if (zldVar != null) {
                    zldVar.j = true;
                    zldVar.d();
                }
                return s3q0.a;
            case 2:
                ClipsEntryPointDraftsFragment clipsEntryPointDraftsFragment = (ClipsEntryPointDraftsFragment) obj2;
                String str = (String) obj;
                Integer valueOf = Integer.valueOf(clipsEntryPointDraftsFragment.T);
                Bundle arguments = clipsEntryPointDraftsFragment.getArguments();
                vyd.a aVar = new vyd.a(str, valueOf, arguments != null ? arguments.getBoolean("do_not_open_clips_tab_on_finish", false) : false);
                dhr0.a.getClass();
                ((vyd) clipsEntryPointDraftsFragment.W.getValue()).b(clipsEntryPointDraftsFragment.kn(), aVar, new vyd.c(dhr0.u().c, 12, 13), new ClipsEditorSessionParams(null, false, false, false, null, false, 63, null));
                return s3q0.a;
            case 3:
                ClipsFavoritesFoldersPickerFragment clipsFavoritesFoldersPickerFragment = (ClipsFavoritesFoldersPickerFragment) obj2;
                ClipsFavoritesFoldersPickerFragment.a aVar2 = ClipsFavoritesFoldersPickerFragment.V;
                gm50.a.a(clipsFavoritesFoldersPickerFragment, ((f.c) obj).a, new iz0(clipsFavoritesFoldersPickerFragment, i2));
                return s3q0.a;
            case 4:
                return d8e.h((d8e) obj2, (ScreenSpinnerViewState) obj);
            case 5:
                ((ClipsGridDraftsListFragment) obj2).k0.setItems((List) obj);
                return s3q0.a;
            case 6:
                CustomSpinner customSpinner = (CustomSpinner) obj2;
                customSpinner.setDropDownVerticalOffset(((CustomSpinner) obj).getMeasuredHeight());
                customSpinner.setDropDownHorizontalOffset(cn70.b(-48));
                customSpinner.setDropDownWidth((int) (iah0.v() * 0.6666667f));
                return s3q0.a;
            case 7:
                ShortVideoMyTargetMapperTracker shortVideoMyTargetMapperTracker = (ShortVideoMyTargetMapperTracker) obj2;
                Throwable th = (Throwable) obj;
                com.vk.metrics.eventtracking.b.a.a(th);
                if (shortVideoMyTargetMapperTracker != null) {
                    shortVideoMyTargetMapperTracker.a(ShortVideoMyTargetMapperTracker.MyTargetType.PROMO_CLIP, th);
                }
                return s3q0.a;
            case 8:
                Throwable th2 = (Throwable) obj;
                ((a9f) obj2).b = null;
                L.g("ClipsTemplatesEditorProviderImpl", th2);
                h03.b(th2);
                return s3q0.a;
            case 9:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) obj2;
                uuf.b bVar = (uuf.b) obj;
                int i3 = ClipsWrapperFragment.Q0;
                gm50.a.a(clipsWrapperFragment, bVar.a, new frf(1, clipsWrapperFragment, ClipsWrapperFragment.class, "renderItems", "renderItems(Lcom/vk/clips/viewer/impl/feed/wrapper/ui/state/ClipsWrapperViewState$ItemsData;)V", 0));
                gm50.a.a(clipsWrapperFragment, bVar.b, new grf(1, clipsWrapperFragment, ClipsWrapperFragment.class, "renderTitle", "renderTitle(Lcom/vk/clips/viewer/impl/feed/wrapper/ui/state/ClipsWrapperViewState$TitleData;)V", 0));
                gm50.a.a(clipsWrapperFragment, bVar.c, new hrf(1, clipsWrapperFragment, ClipsWrapperFragment.class, "renderTooltip", "renderTooltip(Lcom/vk/clips/viewer/impl/feed/wrapper/ui/state/ClipsWrapperViewState$TooltipData;)V", 0));
                gm50.a.a(clipsWrapperFragment, bVar.d, new irf(1, clipsWrapperFragment, ClipsWrapperFragment.class, "renderOnboarding", "renderOnboarding(Lcom/vk/clips/viewer/impl/feed/wrapper/ui/state/ClipsWrapperViewState$OnboardingData;)V", 0));
                gm50.a.a(clipsWrapperFragment, bVar.e, new jrf(1, clipsWrapperFragment, ClipsWrapperFragment.class, "renderStatistics", "renderStatistics(Lcom/vk/clips/viewer/impl/feed/wrapper/ui/state/ClipsWrapperViewState$StatisticsData;)V", 0));
                gm50.a.a(clipsWrapperFragment, bVar.f, new krf(1, clipsWrapperFragment, ClipsWrapperFragment.class, "renderDecoration", "renderDecoration(Lcom/vk/clips/viewer/impl/feed/wrapper/ui/state/ClipsWrapperViewState$DecorationData;)V", 0));
                return s3q0.a;
            case 10:
                int i4 = ((cbg) obj).c;
                ((mdg) obj2).getClass();
                return Boolean.valueOf(i4 == 442);
            case 11:
                ((wlg) obj2).c.invoke(new a.f(true));
                return s3q0.a;
            case 12:
                qgi0.r((tgi0) obj, "ContactsField" + ((CommunityAddContactsState.ContactField) obj2).d.ordinal());
                return s3q0.a;
            case 13:
                jwh jwhVar = (jwh) obj2;
                ayh ayhVar = (ayh) obj;
                mzp0 mzp0Var = jwhVar.h;
                if (mzp0Var != null) {
                    mzp0Var.c(false);
                }
                txh txhVar = ayhVar.a;
                int i5 = txhVar.p;
                List<k4g0> list = txhVar.q;
                List<k4g0> list2 = list;
                int e = on00.e(c5g.u(list2, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (Object obj3 : list2) {
                    linkedHashMap.put(Integer.valueOf(((k4g0) obj3).a), obj3);
                }
                jwhVar.T(new pwh.d(i5, txhVar, linkedHashMap, list.size(), ayhVar.b));
                return s3q0.a;
            case 14:
                return ((f1i) obj2).getResources().getString(((VkGroupsSearchParams.SortType) obj).j());
            case 15:
                CourierMapFragment courierMapFragment = (CourierMapFragment) obj2;
                ezj ezjVar = (ezj) obj;
                izj izjVar = courierMapFragment.S;
                Context requireContext = courierMapFragment.requireContext();
                CourierMapFragment.b bVar2 = izjVar.a;
                if (ezjVar instanceof ezj.c) {
                    AtomicReference<Location> atomicReference = oxz.a;
                    if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(requireContext) != 0) {
                        bVar2.a(new xyj.c.a(new MapServicesNotSuppoertedException()));
                    }
                } else if (ezjVar instanceof ezj.a) {
                    LocationCommon.a.getClass();
                    if (!LocationCommon.a(requireContext)) {
                        bVar2.a(xyj.j.c.b);
                    }
                    PermissionHelper permissionHelper = PermissionHelper.a;
                    permissionHelper.getClass();
                    PermissionHelper.g(permissionHelper, requireContext, PermissionHelper.h, PermissionHelper.i, 0, -1, new fg1(8, requireContext, izjVar), new lz0(izjVar, 24), null, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
                } else if (ezjVar instanceof ezj.b) {
                    LocationCommon.a.getClass();
                    if (LocationCommon.a(requireContext) && LocationCommon.b(requireContext)) {
                        AtomicReference<Location> atomicReference2 = oxz.a;
                        izjVar.b = oxz.c(5000L, requireContext).subscribe(new izj.a(new gzj(izjVar, 0)), new izj.a(new hzj(izjVar)));
                    } else {
                        bVar2.a(xyj.c.b.a.b);
                    }
                }
                return s3q0.a;
            case 16:
                Throwable th3 = (Throwable) obj;
                int i6 = kwg0.a;
                CreateChatTransferFragment createChatTransferFragment = ((CreateChatTransferPresenter) obj2).o;
                Exception exc = th3 instanceof Exception ? (Exception) th3 : null;
                createChatTransferFragment.d0();
                createChatTransferFragment.onError(exc);
                return s3q0.a;
            case 17:
                lak lakVar = (lak) obj2;
                int intValue = ((Integer) obj).intValue();
                if (intValue > 0) {
                    lakVar.w.setSubtitle(enj.f(R.plurals.voip_session_room_admin_spread_participants_randomly_count, intValue, lakVar.getContext()));
                } else {
                    lakVar.w.setSubtitle(R.string.voip_session_room_admin_spread_participants_randomly_description);
                }
                return s3q0.a;
            case 18:
                return Boolean.valueOf(((i2l) obj2).a.contains(((t200) obj).a));
            case 19:
                z9m z9mVar = (z9m) obj2;
                w9m w9mVar = (w9m) obj;
                String str2 = w9mVar.a;
                return Boolean.valueOf(z9mVar.a(w9mVar.b, str2) || z9mVar.j(str2));
            case 20:
                ((hpm) obj2).Z((com.vk.im.engine.models.dialogs.b) obj);
                return s3q0.a;
            case 21:
                y9n y9nVar = (y9n) obj2;
                if (!y9nVar.f) {
                    elm0 elm0Var = y9nVar.c;
                    if (elm0Var != null) {
                        elm0Var.finish();
                    }
                    y9nVar.f1(StoryViewAction.CLOSE_TAP, null);
                    y9nVar.s1();
                }
                return s3q0.a;
            case 22:
                vop vopVar = (vop) obj2;
                cop copVar = (cop) vopVar.a;
                if (copVar != null) {
                    copVar.wa(vopVar.b.getString(R.string.vk_auth_internal_server_error_text), null, null);
                }
                return s3q0.a;
            case 23:
                gpq gpqVar = (gpq) obj2;
                crq crqVar = (crq) obj;
                ArrayList arrayList = crqVar.a;
                String str3 = crqVar.c;
                cqq cqqVar = gpqVar.f;
                return odq.c(cqqVar.c, new xc3(arrayList, null, cqqVar.d, gpqVar.g, null, false, null)).l(new jo3(new o9(21, arrayList, str3), 11));
            case 24:
                ((wk50.a) obj2).b(new c2r.a.C2634a((Map) obj));
                return s3q0.a;
            case 25:
                int i7 = FilterListFragment.R0;
                ((FilterListFragment) obj2).No((UserProfile) obj);
                return s3q0.a;
            case 26:
                int i8 = FriendsBirthdayInfoBarView.B;
                ((defpackage.u) obj2).invoke();
                return s3q0.a;
            case 27:
                evs evsVar = (evs) obj2;
                evsVar.C(new rcx.d.f(!evsVar.l.a.a));
                evsVar.a(new acx.g(!evsVar.l.a.a, true, false));
                return s3q0.a;
            case 28:
                SuperAppGetAnimationsResponseDto superAppGetAnimationsResponseDto = (SuperAppGetAnimationsResponseDto) obj;
                ((ykg) ((yit) obj2).a.getValue()).getClass();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : superAppGetAnimationsResponseDto.d()) {
                    if (obj4 != null) {
                        SuperAppAnimationDto superAppAnimationDto = (SuperAppAnimationDto) obj4;
                        String id = superAppAnimationDto.getId();
                        String url = superAppAnimationDto.getUrl();
                        Action[] values = Action.values();
                        int length = values.length;
                        int i9 = 0;
                        while (true) {
                            if (i9 < length) {
                                action = values[i9];
                                if (!epx.f(action.h(), superAppAnimationDto.d().i())) {
                                    i9++;
                                }
                            } else {
                                action = null;
                            }
                        }
                        if (action == null) {
                            action = Action.OPEN;
                        }
                        arrayList2.add(new Animation(id, url, action, superAppAnimationDto.e(), superAppAnimationDto.f(), null, null, 96, null));
                    }
                }
                return new SuperAppAnimationConfig(arrayList2, superAppGetAnimationsResponseDto.e());
            default:
                jo00 jo00Var = (jo00) obj;
                qcy<Object>[] qcyVarArr = GeoFragment.c0;
                yv50 fo = ((GeoFragment) obj2).fo();
                zk3<StringId, VisibleStyle> zk3Var = fo.u;
                zk3<StringId, VisibleStyle> zk3Var2 = fo.u;
                rpv rpvVar = fo.f;
                boolean z2 = jo00Var.i;
                boolean z3 = jo00Var.f;
                if (!z2) {
                    zk3Var.m(jo00Var.a);
                    Set l = bis.l(jo00Var.h);
                    do00 do00Var = fo.d.v.get();
                    String str4 = do00Var != null ? do00Var.b : null;
                    L.d(new hgq(str4, jo00Var, fo, 2));
                    if (str4 != null) {
                        l.add(new StringId(str4));
                    }
                    L.d(new xsw(jo00Var, 4));
                    for (do00 do00Var2 : jo00Var.b) {
                        String str5 = do00Var2.b;
                        l.add(new StringId(str5));
                        if (fo.l(str5) == null) {
                            L l2 = L.a;
                            l2.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l2, L.LogType.w, new Object[]{"updateMarkers: rendered for #" + ((Object) StringId.a(str5)) + " is null"});
                            }
                        } else if (str4 == null ? false : str5.equals(str4)) {
                            L l3 = L.a;
                            l3.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l3, L.LogType.w, new Object[]{"updateMarkers: try to remove selectedMarker! ignore it"});
                            }
                        } else {
                            mm00.r(fo, do00Var2.b, z3, 4);
                        }
                    }
                    zk3<StringId, VisibleStyle> zk3Var3 = jo00Var.e;
                    Iterator<do00> it2 = jo00Var.c.iterator();
                    while (it2.hasNext()) {
                        do00 next = it2.next();
                        String str6 = next.b;
                        String str7 = next.b;
                        l.add(new StringId(str6));
                        VisibleStyle a = qqm0.a(zk3Var3, str6);
                        if (a != null) {
                            int i10 = a.b;
                            zv50 g = fo.g(next);
                            if (!VisibleStyle.D(i10)) {
                                it = it2;
                                z = z3;
                                if (str4 == null ? false : str4.equals(str6)) {
                                    L l4 = L.a;
                                    l4.getClass();
                                    if (!L.m(LoggerOutputTarget.NONE)) {
                                        L.u(l4, L.LogType.d, new Object[]{"updateMarkers step 2"});
                                    }
                                    i10 = VisibleStyle.G(i10);
                                }
                            } else if (str4 == null ? false : str6.equals(str4)) {
                                it = it2;
                                z = z3;
                            } else {
                                L l5 = L.a;
                                l5.getClass();
                                if (L.m(LoggerOutputTarget.NONE)) {
                                    it = it2;
                                    z = z3;
                                } else {
                                    it = it2;
                                    z = z3;
                                    L.u(l5, L.LogType.d, new Object[]{"updateMarkers step 1"});
                                }
                                i10 = VisibleStyle.a(i10);
                            }
                            boolean containsKey = zk3Var.containsKey(new StringId(str6));
                            int h = rpvVar.h(i10);
                            qqm0.b(zk3Var2, str7, h);
                            fo.h(next, h);
                            aw50 l6 = fo.l(str6);
                            if (l6 == null) {
                                aw50Var = fo.c(g, !containsKey && z);
                            } else {
                                int h2 = rpvVar.h(i10);
                                qqm0.b(zk3Var2, str7, h2);
                                fo.i(next, h2);
                                aw50Var = l6;
                            }
                            if (aw50Var == null) {
                                L.G("map could not add marker!");
                            } else {
                                fo.t.put(new StringId(str6), aw50Var);
                            }
                            it2 = it;
                            z3 = z;
                        }
                    }
                    for (do00 do00Var3 : jo00Var.d) {
                        String str8 = do00Var3.b;
                        l.add(new StringId(str8));
                        VisibleStyle a2 = qqm0.a(zk3Var3, str8);
                        if (a2 != null) {
                            int i11 = a2.b;
                            if (VisibleStyle.D(i11)) {
                                if (!(str4 == null ? false : str8.equals(str4))) {
                                    L l7 = L.a;
                                    l7.getClass();
                                    if (!L.m(LoggerOutputTarget.NONE)) {
                                        L.u(l7, L.LogType.d, new Object[]{"updateMarkers step 3"});
                                    }
                                    i11 = VisibleStyle.a(i11);
                                }
                            } else if (str4 == null ? false : str4.equals(str8)) {
                                L l8 = L.a;
                                l8.getClass();
                                if (!L.m(LoggerOutputTarget.NONE)) {
                                    L.u(l8, L.LogType.d, new Object[]{"updateMarkers step 4"});
                                }
                                i11 = VisibleStyle.G(i11);
                            }
                            if (!(str4 == null ? false : str4.equals(str8))) {
                                fo.w(do00Var3, i11, true);
                            }
                        }
                    }
                }
                return s3q0.a;
        }
    }
}
