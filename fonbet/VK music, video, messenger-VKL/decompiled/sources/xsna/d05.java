package xsna;

import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.base.Document;
import com.vk.auth.api.models.AuthResult;
import com.vk.catalog.mvi.domain.CatalogExtraDo;
import com.vk.catalog.mvi.section.domain.CatalogBlockReplacementListDo;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.friend.FriendsSliderItemVh;
import com.vk.catalog2.common.ui.holders.sticker.BaseStickerPackWithBuyVh;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerFragment;
import com.vk.clips.playlists.ui.picker.f;
import com.vk.clips.uploader.api.model.ClipUploaderParams;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import com.vk.core.view.components.text.VkText;
import com.vk.documents.impl.list.DocumentsListFragment;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupChannelInfo;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.VisibleStatus;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.e;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.log.L;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import com.vk.stat.scheme.CommonCommunitiesStat$ClickEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$TypeGroupsEventItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stickers.views.sticker.StickerPackPreview;
import com.vk.superapp.auth.js.bridge.api.events.AuthRestore$Response;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.voip.ui.asr.ui.list.PastAsrListFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import ru.ok.gleffects.EffectRegistry;
import xsna.c22;
import xsna.cwb0;
import xsna.cxi;
import xsna.f0r;
import xsna.g05;
import xsna.g1i;
import xsna.gm50;
import xsna.ij20;
import xsna.ikv0;
import xsna.l1h;
import xsna.n7b;
import xsna.ne20;
import xsna.p8a0;
import xsna.q8a0;
import xsna.qav;
import xsna.rlf;
import xsna.tso;
import xsna.vav;
import xsna.wk50;
import xsna.y0h;
import xsna.ybb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class d05 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d05(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object failure;
        Object obj2;
        String str;
        String str2;
        gk9 gk9Var;
        oj00 oj00Var;
        EffectRegistry.EffectId effectId;
        int i = this.b;
        int i2 = 2;
        VkAvatarBadge vkAvatarBadge = null;
        r5 = false;
        boolean z = false;
        int i3 = 1;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                String str3 = (String) obj4;
                Log.e("AudioWaveFromFileController", "error loading for path=" + str3);
                ((g05) obj3).b.put(str3, new g05.c((Throwable) obj));
                return s3q0.a;
            case 1:
                spx0 spx0Var = (spx0) obj4;
                wh50 wh50Var = (wh50) obj3;
                tny tnyVar = (tny) obj;
                if (!tnyVar.e()) {
                    return s3q0.a;
                }
                zhf0 j = jgz.j(tnyVar, true);
                float f = j.a;
                float f2 = j.c;
                float f3 = j.b;
                float f4 = j.d;
                if (f4 - f3 <= 1.0f || f2 - f <= 1.0f) {
                    return s3q0.a;
                }
                float c = (int) (spx0Var.c() & 4294967295L);
                float c2 = (int) (spx0Var.c() >> 32);
                if (c <= 1.0f || c2 <= 1.0f) {
                    return s3q0.a;
                }
                wh50Var.setValue(Boolean.valueOf(!(f4 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f3 >= c || f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f >= c2)));
                return s3q0.a;
            case 2:
                BaseStickerPackWithBuyVh baseStickerPackWithBuyVh = (BaseStickerPackWithBuyVh) obj4;
                StickerPackPreview stickerPackPreview = (StickerPackPreview) obj3;
                f9l0 f9l0Var = baseStickerPackWithBuyVh.c;
                Context context = baseStickerPackWithBuyVh.i;
                f9l0Var.d(context != null ? context : null, stickerPackPreview, baseStickerPackWithBuyVh.d);
                return s3q0.a;
            case 3:
                g3a g3aVar = (g3a) obj3;
                String str4 = (String) obj4;
                hda hdaVar = (hda) obj;
                Map<String, VideoFile> map = hdaVar.b.e;
                if (!map.isEmpty()) {
                    Iterator<Map.Entry<String, VideoFile>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        if (!gpt0.y(it.next().getValue())) {
                            g3aVar.o.a(str4);
                            return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                        }
                    }
                }
                return io.reactivex.rxjava3.core.q.T(hdaVar);
            case 4:
                com.vk.catalog2.common.ui.mvp.auto.d dVar = (com.vk.catalog2.common.ui.mvp.auto.d) obj3;
                hda hdaVar2 = (hda) obj;
                if (((c22.a) obj4).a != null) {
                    try {
                        CatalogCatalog catalogCatalog = (CatalogCatalog) hdaVar2.a;
                        Iterator<T> it2 = catalogCatalog.b.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj2 = it2.next();
                                if (epx.f(((CatalogSection) obj2).b, catalogCatalog.c)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        failure = (CatalogSection) obj2;
                        if (failure == null) {
                            failure = (CatalogSection) j5g.Y(catalogCatalog.b);
                        }
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    if (Result.a(failure) != null) {
                        failure = hdaVar2.a;
                    }
                } else {
                    failure = hdaVar2.a;
                }
                Object obj5 = failure;
                return new Pair(jda.a(dVar.g, obj5, hdaVar2.b, false, false, 12), obj5 instanceof CatalogSection ? (CatalogSection) obj5 : null);
            case 5:
                ArrayList<UIBlock> arrayList = ((UIBlockList) obj).y;
                ((fha) obj4).getClass();
                com.vk.movika.sdk.base.hooks.p pVar = new com.vk.movika.sdk.base.hooks.p((UserId) obj3, 23);
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator<T> it3 = arrayList.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (((Boolean) pVar.invoke(it3.next())).booleanValue()) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 6:
                ((t5b) obj4).l.x(((n5b) obj3).b);
                return s3q0.a;
            case 7:
                izs izsVar = (izs) obj3;
                UserId userId = ((i8b) obj4).m;
                if (userId != null) {
                    izsVar.invoke(new n7b.g(userId));
                }
                return s3q0.a;
            case 8:
                return new ccb(((ccb) obj).a, ((ybb.j) ((ybb) obj4)).b.l() != null || ((ubb) obj3).m.b);
            case 9:
                ClipsPlaylistPickerFragment.a aVar = (ClipsPlaylistPickerFragment.a) obj4;
                ClipsPlaylistPickerFragment clipsPlaylistPickerFragment = (ClipsPlaylistPickerFragment) obj3;
                int i4 = ClipsPlaylistPickerFragment.V;
                aVar.c.setVisibility(8);
                aVar.e.setVisibility(0);
                aVar.f.setVisibility(8);
                gm50.a.a(clipsPlaylistPickerFragment, ((f.c) obj).a, new wd3(6, clipsPlaylistPickerFragment, aVar));
                return s3q0.a;
            case 10:
                tlf tlfVar = (tlf) obj4;
                ClipVideoFile clipVideoFile = (ClipVideoFile) obj;
                ClipUploaderParams clipUploaderParams = ((rlf.a) obj3).a;
                if (clipUploaderParams != null && clipVideoFile.v0 != null) {
                    dhr0.a.getClass();
                    final Context E = dhr0.E();
                    final boolean f5 = epx.f(clipUploaderParams.g, Boolean.TRUE);
                    final svd svdVar = new svd(clipVideoFile, tlfVar, E, i3);
                    i0q0.f(new gzs() { // from class: xsna.vdq0
                        @Override // xsna.gzs
                        public final Object invoke() {
                            Context context2 = E;
                            ikv0.a aVar2 = new ikv0.a(context2);
                            aVar2.t = ikv0.c.f.a;
                            aVar2.u = new ikv0.d(f5 ? new ikv0.d.c(context2.getString(R.string.clips_upload_community_main_tab_snackbar), 3) : new ikv0.d.c(context2.getString(R.string.clips_upload_community_clips_tab_snackbar), 2), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                            aVar2.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context2.getString(R.string.clips_upload_community_button_text), new lxh0(svdVar, 6));
                            aVar2.o = Integer.valueOf(context2.getResources().getDimensionPixelSize(R.dimen.vk_bottom_navigation_height));
                            pkv0.f(aVar2);
                            return s3q0.a;
                        }
                    });
                }
                wjs0.a(new fyr0(clipVideoFile));
                return s3q0.a;
            case 11:
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) obj3;
                ExtendedCommunityProfile.Section section = (ExtendedCommunityProfile.Section) obj;
                g1i g1iVar = ((vmh) obj4).a.k;
                if (g1iVar != null) {
                    UserId i5 = bwd0.i(extendedCommunityProfile);
                    ExtendedCommunityProfile.Section.Type type = section.b;
                    MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.GROUP;
                    SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
                    long abs = Math.abs(i5.b);
                    CommonCommunitiesStat$ClickEvent.ClickEventType clickEventType = CommonCommunitiesStat$ClickEvent.ClickEventType.CLICK_TO_SECTION;
                    switch (y0h.a.$EnumSwitchMapping$0[type.ordinal()]) {
                        case 1:
                            str = "photos";
                            break;
                        case 2:
                            str = "market";
                            break;
                        case 3:
                            str = "discussions";
                            break;
                        case 4:
                            str = "services";
                            break;
                        case 5:
                            str = "channel";
                            break;
                        case 6:
                            str = "narratives";
                            break;
                        case 7:
                            str = "music";
                            break;
                        case 8:
                            str = "podcasts";
                            break;
                        case 9:
                            str = "articles";
                            break;
                        case 10:
                            str = "chats";
                            break;
                        case 11:
                            str = "files";
                            break;
                        case 12:
                            str = "events";
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    new bjc(mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeClick.a.b(schemeStat$EventItem, MobileOfficialAppsGroupsStat$TypeGroupsEventItem.a.a(abs, null, null, new CommonCommunitiesStat$ClickEvent(clickEventType, null, str, 2, null), 30), 2)).q();
                    f4z<l1h> f4zVar = g1iVar.e;
                    switch (g1i.a.$EnumSwitchMapping$0[type.ordinal()]) {
                        case 1:
                            f4zVar.b(new l1h.j(extendedCommunityProfile));
                            break;
                        case 2:
                            f4zVar.b(new l1h.h(i5));
                            break;
                        case 3:
                            f4zVar.b(new l1h.e(i5));
                            break;
                        case 4:
                            f4zVar.b(new l1h.l(i5));
                            break;
                        case 5:
                            UserId i6 = bwd0.i(extendedCommunityProfile);
                            GroupChannelInfo groupChannelInfo = extendedCommunityProfile.Y2;
                            String str5 = groupChannelInfo != null ? groupChannelInfo.d : null;
                            if (str5 != null && !drm0.N(str5)) {
                                GroupChannelInfo groupChannelInfo2 = extendedCommunityProfile.Y2;
                                if (groupChannelInfo2 != null && (str2 = groupChannelInfo2.d) != null) {
                                    f4zVar.b(new l1h.c(i6, str2));
                                    break;
                                }
                            } else {
                                g1iVar.d = ((ExtendedProfilesRepository) g1iVar.b.getValue()).L(bwd0.i(extendedCommunityProfile)).subscribe(new defpackage.x(new nm1(7, g1iVar, i6), 15), new defpackage.z(new vr0(25), 16));
                                break;
                            }
                            break;
                        case 6:
                            f4zVar.b(new l1h.i(i5));
                            break;
                        case 7:
                            f4zVar.b(new l1h.b(i5));
                            break;
                        case 8:
                            f4zVar.b(new l1h.k(i5));
                            break;
                        case 9:
                            f4zVar.b(new l1h.a(i5));
                            break;
                        case 10:
                            f4zVar.b(new l1h.d(i5, extendedCommunityProfile.a0));
                            break;
                        case 11:
                            f4zVar.b(new l1h.g(i5));
                            break;
                        case 12:
                            f4zVar.b(new l1h.f(i5));
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                return s3q0.a;
            case 12:
                Group group = (Group) obj;
                ((com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d) obj4).T(new e.l(group.e(), group.d()));
                ((ha) obj3).invoke(Boolean.valueOf(group.d()));
                return s3q0.a;
            case 13:
                ((uvj) obj4).n().c(((cwj) obj3).a);
                return s3q0.a;
            case 14:
                wh50 wh50Var2 = (wh50) obj4;
                qm00 qm00Var = (qm00) obj3;
                oj00 oj00Var2 = (oj00) wh50Var2.getValue();
                if (!epx.f(oj00Var2 != null ? sua.v(oj00Var2.h()) : null, qm00Var.a) && (gk9Var = qm00Var.a) != null && (oj00Var = (oj00) wh50Var2.getValue()) != null) {
                    vj00 vj00Var = ofx.a;
                    (vj00Var != null ? vj00Var : null).getClass();
                    Coordinates coordinates = gk9Var.a;
                    double d = coordinates.b;
                    double d2 = coordinates.c;
                    float f6 = gk9Var.b.a;
                    CameraPosition.a i7 = CameraPosition.i();
                    i7.b(new LatLng(d, d2));
                    i7.c(f6);
                    oj00Var.c(new tar0(xa4.C(i7.a())));
                }
                return s3q0.a;
            case 15:
                ((wzs) obj4).invoke((Long) obj, (Long) obj3);
                return s3q0.a;
            case 16:
                ((asm) obj4).e().c(new cwb0.w(((DialogExt) obj3).getTitle()), new zrm((io.reactivex.rxjava3.disposables.c) obj, 0));
                return s3q0.a;
            case 17:
                DocumentsListFragment documentsListFragment = (DocumentsListFragment) obj4;
                Document document = (Document) obj3;
                wun wunVar = documentsListFragment.S;
                if (wunVar != null) {
                    wunVar.B0(document);
                }
                wun wunVar2 = documentsListFragment.S;
                if ((wunVar2 != null ? wunVar2.l : 0) > 0) {
                    documentsListFragment.io((wunVar2 != null ? wunVar2.l : 0) - 1);
                }
                ysg0.b.a(new bun(document.b, document.h, document.i));
                return s3q0.a;
            case 18:
                WebView webView = new WebView((Context) obj);
                webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                webView.setWebViewClient(new tso.b((izs) obj4));
                webView.setWebChromeClient(new tso.c((wxs) obj3));
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setDomStorageEnabled(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
                return webView;
            case 19:
                ((f0r.d) obj4).h((wk50.a) obj3, (Throwable) obj);
                return s3q0.a;
            case 20:
                UIBlock uIBlock = (UIBlock) obj4;
                FriendsSliderItemVh friendsSliderItemVh = (FriendsSliderItemVh) obj3;
                UIBlockProfile uIBlockProfile = uIBlock instanceof UIBlockProfile ? (UIBlockProfile) uIBlock : null;
                if (uIBlockProfile == null) {
                    return s3q0.a;
                }
                UserProfile userProfile = uIBlockProfile.A;
                VkText vkText = friendsSliderItemVh.e;
                if (vkText == null) {
                    vkText = null;
                }
                vkText.setText(userProfile.d);
                VkAvatar vkAvatar = friendsSliderItemVh.f;
                if (vkAvatar == null) {
                    vkAvatar = null;
                }
                vkAvatar.setBorder(userProfile.T ? new odu0() : null);
                vkAvatar.setPlaceholderColor(dhr0.t.c(R.attr.vk_ui_image_placeholder));
                vkAvatar.o0(userProfile.g, null);
                vkAvatar.S0();
                OnlineInfo onlineInfo = userProfile.n;
                if (onlineInfo instanceof VisibleStatus) {
                    VisibleStatus visibleStatus = (VisibleStatus) onlineInfo;
                    if (visibleStatus.Bb()) {
                        Context context2 = vkAvatar.getContext();
                        int i8 = pts.$EnumSwitchMapping$0[visibleStatus.e.ordinal()];
                        if (i8 != 1) {
                            if (i8 == 2) {
                                vkAvatarBadge = new com.vk.core.view.components.avatar.badge.e(context2, VkAvatarBadge.Alignment.BottomRight, null);
                            } else {
                                if (i8 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                vkAvatarBadge = new com.vk.core.view.components.avatar.badge.c(context2, VkAvatarBadge.Alignment.BottomRight);
                            }
                        }
                        if (vkAvatarBadge != null) {
                            vkAvatar.Q0(vkAvatarBadge);
                        }
                    }
                }
                friendsSliderItemVh.h = uIBlockProfile;
                return s3q0.a;
            case 21:
                cxi.b bVar = (cxi.b) obj4;
                File file = (File) obj;
                L.e("effect resource loaded");
                ((qav) obj3).getClass();
                String str6 = bVar.x;
                if (epx.f(str6, "video_background")) {
                    effectId = EffectRegistry.EffectId.BACKGROUND;
                } else {
                    if (!epx.f(str6, "picture_background")) {
                        throw new IllegalArgumentException("Unknown action type");
                    }
                    effectId = EffectRegistry.EffectId.PICTURE_BACKGROUND;
                }
                return new qav.b(bVar, new vav.a(effectId, file), new vav.g(bVar.w));
            case 22:
                l2y l2yVar = (l2y) obj3;
                String str7 = (String) obj4;
                AuthResult authResult = (AuthResult) obj;
                com.vk.superapp.base.js.bridge.b.p(l2yVar.L0().a, new JsMethod("VKWebAppAuthRestore"), new AuthRestore$Response(null, new AuthRestore$Response.Data(true, str7), str7, 1, null), null, null, false, null, 60);
                q55 q55Var = q55.a;
                q55.d(authResult);
                l2yVar.f.b.invoke(authResult, Boolean.FALSE);
                return s3q0.a;
            case 23:
                CatalogSectionState catalogSectionState = (CatalogSectionState) obj;
                ArrayList arrayList2 = (ArrayList) ((wxm) obj4).b;
                CatalogExtraDo catalogExtraDo = catalogSectionState.m;
                CatalogExtraDo catalogExtraDo2 = ((CatalogBlockReplacementListDo) obj3).c;
                catalogExtraDo.getClass();
                return CatalogSectionState.a(catalogSectionState, arrayList2, false, false, null, null, false, null, null, new CatalogExtraDo(catalogExtraDo2.b, CatalogExtraDo.a(catalogExtraDo.c, catalogExtraDo2.c), izi0.j(catalogExtraDo.d, catalogExtraDo2.d)), null, 6139);
            case 24:
                l7r0 l7r0Var = (l7r0) obj4;
                ne20 ne20Var = (ne20) obj3;
                ij20.a aVar2 = new ij20.a();
                aVar2.d = l7r0Var.a.g;
                aVar2.i = ne20Var.d;
                aVar2.c = "messages.getContactsById";
                aVar2.b("device_id", ne20Var.c);
                aVar2.b("contact_ids", j5g.g0((List) obj, StringUtils.COMMA, null, null, 0, null, 62));
                ij20 ij20Var = new ij20(aVar2);
                ne20.a aVar3 = new ne20.a();
                return (Map) bz2.k(ij20Var, aVar3, new tbb(l7r0Var, ij20Var, aVar3, i2));
            case 25:
                bn40.f(vhb0.class.getSimpleName(), (Boolean) obj);
                ((com.vk.music.track.a) obj4).d.b(new ehb0((MusicTrack) obj3));
                return s3q0.a;
            case 26:
                pk30 pk30Var = (pk30) obj4;
                lt30 lt30Var = (lt30) obj3;
                if (pk30Var != null) {
                    pk30Var.w(lt30Var.b);
                }
                return s3q0.a;
            case 27:
                nk40 nk40Var = (nk40) obj4;
                nk40Var.getClass();
                return Boolean.valueOf(k5a.b((UIBlockList) obj, new l22(19, (Map) obj3, nk40Var)));
            case 28:
                int i9 = PastAsrListFragment.U;
                ((PastAsrListFragment.b) obj4).e.setText(j03.g(((PastAsrListFragment) obj3).mo2getContext(), (Throwable) obj, R.string.error));
                return s3q0.a;
            default:
                ((izs) obj4).invoke((q8a0.a.b) ((p8a0.d) obj3).m);
                return s3q0.a;
        }
    }

    public /* synthetic */ d05(int i, String str, Object obj) {
        this.b = i;
        this.d = obj;
        this.c = str;
    }
}
