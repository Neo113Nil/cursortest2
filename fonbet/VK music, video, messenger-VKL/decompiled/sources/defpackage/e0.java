package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.catalog2.feature.music.holders.search.SearchHistoryItemVh;
import com.vk.catalog2.feature.music.ui.holder.MusicHistoryRemoveAllVh;
import com.vk.catalog2.feature.music.ui.holder.MusicVerticalListVh;
import com.vk.catalog2.feature.music.ui.holder.MusicVerticalListVh$createDefaultOfflineBlock$1;
import com.vk.channels.impl.list.e;
import com.vk.channels.impl.list.f;
import com.vk.channels.impl.list.g;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.fragments.e;
import com.vk.core.fragments.internal.stack.FStack;
import com.vk.core.tips.Tooltip;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.dto.user.UserProfile;
import com.vk.libvideo.b;
import com.vk.libvideo.design.view.video.a;
import com.vk.movika.sdk.base.ui.l0;
import com.vk.movika.sdk.base.ui.y;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.photos.root.archive.presentation.ArchiveFragment;
import com.vk.photoviewer.PhotoViewer;
import com.vk.photoviewer.PickPositionOverlayView;
import com.vk.profile.community.catalog.impl.communities.CommunitiesCatalogFragment;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.community.impl.ui.profile.c;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonInvalidParams;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnknownError;
import com.vk.superapp.common.js.bridge.api.events.ConversionHit$Parameters;
import com.vk.video.bugreport.api.dto.VideoTechBugreportData;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import io.reactivex.rxjava3.internal.operators.observable.k;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import one.video.player.OneVideoPlayer;
import xsna.a2e0;
import xsna.a960;
import xsna.azl;
import xsna.b5a;
import xsna.b7q;
import xsna.b8j0;
import xsna.bqu0;
import xsna.bwt0;
import xsna.cfp0;
import xsna.cqa0;
import xsna.dac0;
import xsna.e370;
import xsna.ebs0;
import xsna.evq0;
import xsna.eyw;
import xsna.f1m;
import xsna.fdi;
import xsna.gzs;
import xsna.h0c0;
import xsna.h7v;
import xsna.i9g0;
import xsna.ig3;
import xsna.itl;
import xsna.izs;
import xsna.jjc;
import xsna.ko50;
import xsna.kxa0;
import xsna.lbs;
import xsna.lyd;
import xsna.m5y;
import xsna.mat;
import xsna.mr;
import xsna.pp40;
import xsna.q76;
import xsna.qcy;
import xsna.qjj0;
import xsna.r4p0;
import xsna.s3q0;
import xsna.s53;
import xsna.slq0;
import xsna.sqt0;
import xsna.svp;
import xsna.swy;
import xsna.t10;
import xsna.tho0;
import xsna.u2b0;
import xsna.uxy;
import xsna.vbs;
import xsna.vdx0;
import xsna.w7o0;
import xsna.wak0;
import xsna.wh50;
import xsna.wsk0;
import xsna.xas;
import xsna.xn50;
import xsna.xwv0;
import xsna.yen0;
import xsna.yf10;
import xsna.ynh;
import xsna.yrj0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class e0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v75, types: [com.vk.search.communities.map.impl.ui.map.d$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        FragmentEntry Cb;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ConversionHit$Parameters conversionHit$Parameters = (ConversionHit$Parameters) obj;
                cqa0 cqa0Var = (cqa0) ((l0) obj2).n.getValue();
                svp svpVar = cqa0Var.c;
                xwv0 xwv0Var = (xwv0) cqa0Var.a.invoke();
                if ((xwv0Var != null ? xwv0Var.getView() : null) == null) {
                    svpVar.d(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), conversionHit$Parameters.f(), 1, null));
                } else {
                    try {
                        String e = conversionHit$Parameters.e();
                        String b = cqa0Var.b();
                        xwv0 xwv0Var2 = (xwv0) cqa0Var.a.invoke();
                        yen0.b bVar = new yen0.b(new yen0.a(e, b, xwv0Var2 != null ? Long.valueOf(xwv0Var2.getAppId()) : null), conversionHit$Parameters.c(), Float.valueOf(conversionHit$Parameters.d()));
                        vdx0 vdx0Var = e370.e;
                        if (vdx0Var == null) {
                            vdx0Var = null;
                        }
                        xwv0Var.X(vdx0Var.c().a(bVar).subscribe(new m5y(new b(28, cqa0Var, conversionHit$Parameters), 15), new a960(new a(24, cqa0Var, conversionHit$Parameters), 6)));
                    } catch (Throwable unused) {
                        svpVar.d(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), conversionHit$Parameters.f(), 1, null));
                    }
                }
                break;
            case 1:
                ((y) obj2).d.y.b(((l0) obj).h);
                break;
            case 2:
                ((izs) obj2).invoke(((t10) obj).a);
                break;
            case 3:
                int i2 = ArchiveFragment.e0;
                xn50.a.c((ArchiveFragment) obj2, new ig3.e.b((List) obj));
                break;
            case 4:
                ((f) obj2).O(new e.p(((g.h.a.C0540a) ((g.h.a) obj)).a));
                break;
            case 5:
                CommunitiesCatalogFragment communitiesCatalogFragment = (CommunitiesCatalogFragment) obj2;
                Bundle bundle = (Bundle) obj;
                fdi fdiVar = communitiesCatalogFragment.S;
                boolean q = lbs.q(communitiesCatalogFragment);
                fdiVar.getClass();
                if (bundle != null) {
                    q = bundle.getBoolean("need_show_profile_in_header");
                }
                break;
            case 6:
                d.j.a aVar = (d.j.a) obj2;
                c cVar = (c) obj;
                if (aVar.b) {
                    cVar.f(aVar.a);
                }
                break;
            case 7:
                com.vk.profile.community.impl.ui.profile.f fVar = (com.vk.profile.community.impl.ui.profile.f) obj;
                String id = HintId.GROUP_COMMUNITY_ADBLOGGER_OZON_BANNER.getId();
                h7v d = ((ynh) obj2).d();
                Hint p = d.p(id);
                if (p == null || !d.a(id)) {
                    p = null;
                }
                if (p != null) {
                    break;
                }
                break;
            case 8:
                gzs gzsVar = (gzs) obj2;
                b7q b7qVar = (b7q) obj;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                b7qVar.f = false;
                b7qVar.k();
                break;
            case 9:
                com.vk.core.fragments.e eVar = (com.vk.core.fragments.e) obj2;
                FragmentEntry fragmentEntry = (FragmentEntry) obj;
                vbs vbsVar = eVar.a;
                vbsVar.c();
                FStack Cb2 = eVar.e.c.Cb(fragmentEntry, new e.h(2, eVar.d, xas.class, "areFragmentsEquals", "areFragmentsEquals(Lcom/vk/core/fragments/FragmentEntry;Lcom/vk/core/fragments/FragmentEntry;)Z", 0));
                if (Cb2 != null && Cb2.c.isEmpty()) {
                    FragmentEntry fragmentEntry2 = Cb2.b;
                    fragmentEntry2.c.clear();
                    fragmentEntry2.c.putAll(new Bundle(fragmentEntry.c));
                    Cb2.Bb(fragmentEntry2);
                }
                if (Cb2 != null && (Cb = Cb2.Cb()) != null) {
                    fragmentEntry = Cb;
                }
                String str = fragmentEntry.d;
                FragmentImpl b2 = vbsVar.b(str);
                if (b2 == null) {
                    FragmentImpl Ab = fragmentEntry.Ab();
                    vbsVar.a(eVar.c.a(Ab), Ab, str, true);
                } else {
                    vbsVar.n(b2, null, true);
                }
                vbsVar.d();
                break;
            case 10:
                ((u2b0) obj2).n0((eyw.a) obj);
                break;
            case 11:
                ((s53) obj2).invoke(((tho0) ((wh50) obj).getValue()).a.c);
                break;
            case 12:
                uxy uxyVar = (uxy) obj;
                swy swyVar = (swy) ((f1m) obj2).getValue();
                break;
            case 13:
                yf10 yf10Var = (yf10) obj;
                azl azlVar = itl.f(yf10Var).z;
                ((wak0) yf10Var.t).getIntValue();
                int intValue = ((wak0) yf10Var.u).getIntValue();
                ((mr) obj2).getClass();
                break;
            case 14:
                qcy<Object>[] qcyVarArr = MusicHistoryRemoveAllVh.h;
                jjc.a(new f0(17, (MusicHistoryRemoveAllVh) obj2, (UIBlock) obj));
                break;
            case 15:
                MusicVerticalListVh musicVerticalListVh = (MusicVerticalListVh) obj2;
                View view = (View) obj;
                b5a b5aVar = musicVerticalListVh.e.b.f;
                UIBlock uIBlock = musicVerticalListVh.K;
                if (uIBlock == null) {
                    uIBlock = new MusicVerticalListVh$createDefaultOfflineBlock$1("", CatalogViewType.UNKNOWN, CatalogDataType.DATA_TYPE_NONE, "", UserId.d, EmptyList.b, EmptySet.b, null, null, null, null, null, null, null, null, 32512, null);
                }
                b5aVar.a(new cfp0(uIBlock, new pp40()));
                Activity w = bwt0.w(view);
                if (w != null) {
                    lyd.g().N(w);
                }
                break;
            case 16:
                ((izs) obj2).invoke(new mat.a(((ko50) obj).b));
                break;
            case 17:
                break;
            case 18:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                PickPositionOverlayView pickPositionOverlayView = photoViewer.F;
                float markerXAsFraction = pickPositionOverlayView.getMarkerXAsFraction();
                float markerYAsFraction = pickPositionOverlayView.getMarkerYAsFraction();
                photoViewer.i();
                ((yrj0) ((b8j0) obj).c).invoke(Double.valueOf(markerXAsFraction), Double.valueOf(markerYAsFraction));
                s3q0 s3q0Var = s3q0.a;
                break;
            case 19:
                ((h0c0) obj2).b.invoke(new PostingAction.Navigation.OpenCropPhotoEditor(com.vk.newsfeed.posting.impl.presentation.model.a.a((PhotoAttachment) ((Attachment) obj))));
                break;
            case 20:
                ((a2e0) obj2).b = (bqu0) ((gzs) obj).invoke();
                break;
            case 21:
                UserProfile userProfile = (UserProfile) obj;
                q76.d((com.vk.qrcode.c) obj2, userProfile, new dac0(userProfile, 5), 2);
                userProfile.k = true;
                break;
            case 22:
                i9g0 i9g0Var = (i9g0) obj2;
                i9g0Var.e = false;
                i9g0Var.c = null;
                i9g0.g(R.string.vkim_snackbar_reset_fail_title, (NavigationDelegateActivity) obj, false);
                break;
            case 23:
                k kVar = (k) obj;
                ?? r1 = ((com.vk.search.communities.map.impl.ui.map.d) obj2).d;
                if (r1 != 0) {
                    r1.a(kVar);
                }
                break;
            case 24:
                SearchHistoryItemVh searchHistoryItemVh = (SearchHistoryItemVh) obj2;
                UIBlockSearchHistory<?> uIBlockSearchHistory = searchHistoryItemVh.d;
                Context context = ((ComposeView) obj).getContext();
                if (uIBlockSearchHistory != null && context != null) {
                    searchHistoryItemVh.c.z(0, uIBlockSearchHistory);
                    searchHistoryItemVh.b(uIBlockSearchHistory, context);
                }
                break;
            case 25:
                ((Tooltip) obj2).g((r4p0) obj);
                break;
            case 26:
                ((izs) obj2).invoke(((tho0) obj).a.c);
                break;
            case 27:
                ((slq0) obj2).a(new UserProfileAction.s.c.a.f(new kxa0((VkButton) obj, 9)));
                break;
            case 28:
                ((ClipboardManager) ((evq0) obj2).a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("VK link", (String) obj));
                break;
            default:
                sqt0.l lVar = (sqt0.l) obj2;
                sqt0 sqt0Var = (sqt0) obj;
                VideoFile videoFile = lVar.a;
                String str2 = lVar.b;
                OneVideoPlayer player = sqt0Var.C.getPlayer();
                ebs0 videoClickActionCallback = sqt0Var.getVideoClickActionCallback();
                if (videoFile != null && str2 != null && player != null && videoClickActionCallback != null) {
                    videoClickActionCallback.bk(new qjj0(w7o0.a(player, VideoTechBugreportData.VideoType.VIDEO, new wsk0(videoFile.o0(), str2, videoFile.r(), videoFile.I0().b))));
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ e0(Tooltip tooltip, Tooltip.g gVar, r4p0 r4p0Var) {
        this.b = 25;
        this.c = tooltip;
        this.d = r4p0Var;
    }
}
