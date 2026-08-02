package xsna;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.location.Location;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.photos.dto.PhotosImageDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.HeaderShowAllVh;
import com.vk.clips.design.view.nps.internal.stars.CatalogStarsFeedbackView;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.core.view.components.button.VkButton;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.Peer;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.dto.user.UserProfileGift;
import com.vk.folders.impl.configure.g;
import com.vk.httpexecutor.core.knet.KnetExecutorType;
import com.vk.im.engine.lifecycle.di.ImEngineLifecycleComponent;
import com.vk.location.common.LocationCommon;
import com.vk.music.bottomsheets.audiobook.AudioBookPersonBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.ui.subscription.BuyMusicSubscriptionComposeButtonKt;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.newsfeed.posting.geo_picker.presentation.PlacePickerState;
import com.vk.newsfeed.posting.geo_picker.presentation.a;
import com.vk.newsfeed.posting.geo_picker.presentation.i;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.permission.PermissionHelper;
import com.vk.photoviewer.PhotoViewer;
import com.vk.stickers.settings.StickerSettingsFeature;
import com.vk.stickers.settings.StickerSettingsRouter;
import com.vk.stickers.settings.b;
import com.vk.superapp.api.dto.story.WebStoryBox;
import com.vk.superapp.auth.js.bridge.api.events.GetSilentToken$Error;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$AuthError;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.update.core.AvailabilityState;
import com.vk.update.core.DownloadState;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.externcalls.sdk.stat.mldownload.MLDownloadStat;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import xsna.d6v0;
import xsna.f0r;
import xsna.gm50;
import xsna.h7u0;
import xsna.hjl0;
import xsna.ir5;
import xsna.k840;
import xsna.m8v0;
import xsna.mp5;
import xsna.n1s;
import xsna.nh4;
import xsna.oap;
import xsna.ph4;
import xsna.s4r;
import xsna.ubx;
import xsna.uuf;
import xsna.wk50;
import xsna.wzr;
import xsna.xh60;
import xsna.xll0;
import xsna.xn50;
import xsna.yo60;
import xsna.ys8;
import xsna.yt90;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class mh4 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mh4(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:401:0x09cd, code lost:
    
        if (r8.size() == 3) goto L387;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String, xsna.zcl] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r12v29, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        String name;
        int i;
        AvailabilityState availabilityState;
        AvailabilityState availabilityState2;
        GetSilentToken$Error.Data data;
        s3q0 error$lambda$0;
        ajx ajxVar;
        ArrayList arrayList2;
        Object obj2;
        int i2 = this.b;
        int i3 = 6;
        int i4 = 5;
        int i5 = 10;
        boolean z = false;
        z = false;
        r10 = null;
        r10 = null;
        r10 = null;
        mp5.a aVar = null;
        int i6 = 1;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i2) {
            case 0:
                nh4 nh4Var = (nh4) obj4;
                ?? r1 = nh4Var.k1;
                ng4 ng4Var = (ng4) obj3;
                ph4 ph4Var = (ph4) obj;
                int i7 = nh4.n1;
                if (ph4Var instanceof ph4.g) {
                    kbj0.c(((BridgeComponent) r1.getValue()).h8(), nh4Var.requireContext(), ((ph4.g) ph4Var).a, true, null, null, false, 120);
                } else if (ph4Var instanceof ph4.j) {
                    if (!((ph4.j) ph4Var).a) {
                        cvk.u(R.string.audio_book_network_error, false);
                    }
                } else if (!(ph4Var instanceof ph4.e)) {
                    if (ph4Var.equals(ph4.k.a)) {
                        com.vk.music.player.d dVar = k840.a.f;
                        r10 = dVar != null ? dVar : 0;
                        List<Long> list = d6v0.d;
                        new e6v0(d6v0.a.a(r10), r10, nh4Var.requireArguments().getBoolean("force_dark_theme", false)).d(nh4Var.kn());
                    } else if (ph4Var.equals(ph4.a.a)) {
                        ClipboardManager clipboardManager = (ClipboardManager) nh4Var.requireContext().getSystemService("clipboard");
                        String str = nh4.b.a(nh4Var.requireArguments()).h;
                        clipboardManager.setPrimaryClip(ClipData.newPlainText(str, str));
                        cvk.u(R.string.link_copied, false);
                    } else if (ph4Var instanceof ph4.d) {
                        ng4Var.f.d(nh4Var.kn(), ((ph4.d) ph4Var).a, AudioBookPersonBottomSheetLaunchPoint.AudioBookScreen.b, MusicPlaybackLaunchContext.Fb(nh4Var.requireArguments().getString("ref", "")).Cb(nh4Var.requireArguments().getString("launch_origin", "unknown")));
                    } else if (ph4Var instanceof ph4.f) {
                        ((BridgeComponent) r1.getValue()).Le().G(nh4Var.requireContext(), 0, MusicPlaybackLaunchContext.Fb(nh4Var.requireArguments().getString("ref", "")).Cb(nh4Var.requireArguments().getString("launch_origin", "unknown")));
                    } else if (ph4Var.equals(ph4.c.a)) {
                        ((BridgeComponent) r1.getValue()).Le().w().b(nh4Var.kn(), nh4Var.requireArguments().getBoolean("force_dark_theme", false));
                    } else if (ph4Var.equals(ph4.h.a)) {
                        i0q0.f(new i3r(nh4Var.kn(), 2));
                    } else {
                        if (!ph4Var.equals(ph4.b.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (((Boolean) nh4Var.m1.getValue()).booleanValue()) {
                            i0q0.f(new hv00(nh4Var.kn(), R.string.music_snack_download_book_unavailable_message, 2));
                        } else {
                            i0q0.f(new hv00(nh4Var.kn(), R.string.music_snack_download_tmp_unavailable_message, 2));
                        }
                    }
                }
                nh4Var.hide();
                return s3q0.a;
            case 1:
                mp5 mp5Var = (mp5) obj4;
                ir5.c cVar = (ir5.c) obj3;
                List list2 = (List) obj;
                if (list2.size() != 2) {
                    return !list2.isEmpty() ? io.reactivex.rxjava3.core.q.T(new ir5.a(j5g.v0(Integer.valueOf(((PhotosPhotoDto) j5g.Y(list2)).getId()), cVar.b))) : io.reactivex.rxjava3.core.q.T(cVar);
                }
                ArrayList v0 = j5g.v0(Integer.valueOf(((PhotosPhotoDto) j5g.Y(list2)).getId()), cVar.b);
                PhotosPhotoDto photosPhotoDto = (PhotosPhotoDto) j5g.i0(list2);
                PhotosImageDto C = photosPhotoDto.C();
                String url = C != null ? C.getUrl() : null;
                Integer f = C != null ? C.f() : null;
                Integer d = C != null ? C.d() : null;
                String T = photosPhotoDto.T();
                if (T != null) {
                    List b0 = drm0.b0(T, new char[]{','}, 3, 2);
                    arrayList = new ArrayList(c5g.u(b0, 10));
                    Iterator it = b0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Float.valueOf(Float.parseFloat((String) it.next())));
                    }
                    break;
                }
                arrayList = null;
                if (url != null && f != null && d != null && arrayList != null) {
                    aVar = new mp5.a(url, f.intValue(), d.intValue(), ((Number) arrayList.get(1)).floatValue(), ((Number) j5g.Y(arrayList)).floatValue(), ((Number) j5g.i0(arrayList)).floatValue());
                }
                if (aVar == null) {
                    return io.reactivex.rxjava3.core.q.H(new Throwable());
                }
                float f2 = aVar.e;
                float f3 = aVar.b;
                float f4 = f2 / f3;
                float f5 = aVar.d;
                float f6 = aVar.c;
                float f7 = f5 / f6;
                float f8 = aVar.f;
                RectF rectF = new RectF(f4, f7, (f8 / f3) + f4, (f8 / f6) + f7);
                return mcr0.h(Uri.parse(aVar.a)).U(new nm3(new kp5(z ? 1 : 0, mp5Var, rectF), i6)).U(new op0(new com.vk.video.ui.discovery.minimizable.related_videos.j(rectF, photosPhotoDto, v0, i6), i6));
            case 2:
                return new q68((com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.b) obj4, (ViewGroup) obj, ((com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.a) obj3).h);
            case 3:
                m68 m68Var = (m68) obj4;
                Photo photo = (Photo) obj3;
                if (m68Var.f(photo)) {
                    c9u0 c9u0Var = m68Var.k;
                    if (c9u0Var != null) {
                        c9u0Var.a(photo.b);
                    }
                    c9u0 c9u0Var2 = m68Var.k;
                    if (c9u0Var2 != null) {
                        z8u0 z8u0Var = c9u0Var2.b;
                        z8u0Var.E = true;
                        PhotoViewer photoViewer = z8u0Var.G;
                        if (photoViewer != null) {
                            photoViewer.h();
                        }
                    }
                }
                return s3q0.a;
            case 4:
                ys8 ys8Var = (ys8) obj4;
                ys8Var.b((ys8.b) obj3);
                return new BuyMusicSubscriptionComposeButtonKt.a(ys8Var);
            case 5:
                String str2 = (String) obj4;
                i9b i9bVar = (i9b) obj3;
                if (str2 != null) {
                    i9bVar.i.f(str2);
                }
                return s3q0.a;
            case 6:
                ((emc) obj4).i.a((mih0) obj3);
                return s3q0.a;
            case 7:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) obj4;
                uuf.i iVar = (uuf.i) obj3;
                wuf wufVar = (wuf) obj;
                ytf ytfVar = (ytf) clipsWrapperFragment.A0.getValue();
                Resources resources = clipsWrapperFragment.getResources();
                lrf lrfVar = new lrf(1, clipsWrapperFragment, ClipsWrapperFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
                boolean z2 = ytfVar.a;
                if (iVar.w0() == null || !iVar.isVisible()) {
                    VkButton l = wufVar.l();
                    VkButton vkButton = l.getVisibility() == 0 ? l : null;
                    if (vkButton != null) {
                        d3m.e(vkButton, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                    }
                    VkButton d2 = wufVar.d();
                    VkButton vkButton2 = d2.getVisibility() == 0 ? d2 : null;
                    if (vkButton2 != null) {
                        d3m.e(vkButton2, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                    }
                    wufVar.l().setOnClickListener(null);
                    wufVar.d().setOnClickListener(null);
                    int color = wufVar.b().getContext().getColor(R.color.vk_black);
                    wufVar.c().setBackgroundColor(color);
                    if (z2) {
                        wufVar.b().setBackgroundColor(color);
                        View b = wufVar.b();
                        d3m.c(b.getVisibility() == 0 ? null : b, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    } else {
                        View b2 = wufVar.b();
                        View view = b2.getVisibility() == 0 ? b2 : null;
                        if (view != null) {
                            d3m.e(view, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                        }
                    }
                } else {
                    jwe jweVar = ytfVar.b;
                    VkButton l2 = wufVar.l();
                    VkButton vkButton3 = l2.getVisibility() == 0 ? null : l2;
                    if (vkButton3 != null) {
                        d3m.c(vkButton3, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    jjc.g(wufVar.l(), new defpackage.b0(11, iVar, lrfVar));
                    boolean n = jweVar.n();
                    boolean d3 = jweVar.b().d();
                    if (((Boolean) ytfVar.c.getValue()).booleanValue() && n && !d3) {
                        String string = wufVar.d().getContext().getString(R.string.clips_viewer_easy_promote_tooltip);
                        int i8 = m8v0.M;
                        m8v0.a.a(wufVar.d(), string, null, VkTooltip$MarkerStyle.Style6, VkTooltip$MarkerSize.Size96, null, VkTooltip$BalloonPosition.TopLeft, VkTooltip$BalloonTilt.Right, new xr0(18), new sd4(13), null, null, null, new on(ytfVar, 25), null, 0, false, null, null, false, null, false, 16768036);
                    }
                    if (iVar.A0()) {
                        f4m.j(wufVar.d());
                    } else {
                        VkButton d4 = wufVar.d();
                        VkButton vkButton4 = d4.getVisibility() == 0 ? null : d4;
                        if (vkButton4 != null) {
                            d3m.c(vkButton4, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                        wufVar.d().setText(iVar.y0() ? resources.getString(R.string.clip_feed_promotion) : resources.getString(R.string.clip_feed_promoted));
                        jjc.g(wufVar.d(), new n9(4, iVar, lrfVar));
                    }
                    wufVar.p(resources.getDimensionPixelSize(R.dimen.clip_feed_promotion_view_height));
                    View b3 = wufVar.b();
                    View view2 = (b3.getVisibility() != 0 || z2) ? b3 : null;
                    if (view2 != null) {
                        d3m.c(view2, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    int color2 = wufVar.b().getContext().getColor(R.color.vk_gray_1000);
                    wufVar.b().setBackgroundColor(color2);
                    wufVar.c().setBackgroundColor(color2);
                }
                return s3q0.a;
            case 8:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) obj4;
                KnetExecutorType knetExecutorType = (KnetExecutorType) obj;
                String[] strArr = DebugDevSettingsFragment.t0;
                String id = knetExecutorType.getId();
                o2l.a.getClass();
                o2l.j("__dbg_network_executor", id);
                ((ImEngineLifecycleComponent) j6i.b(m7m.d(debugDevSettingsFragment), ImEngineLifecycleComponent.class)).N().b();
                enj.r(debugDevSettingsFragment.requireContext(), "Изменения применены", 0);
                ((Preference) obj3).I(knetExecutorType.getId());
                return null;
            case 9:
                pdm pdmVar = (pdm) obj4;
                Map map = (Map) obj3;
                xlm d5 = pdmVar.d();
                d5.b.b().f(d5.a.a, null, new Object[0]);
                pdmVar.d.b(map.keySet());
                for (Map.Entry entry : map.entrySet()) {
                    int intValue = ((Number) entry.getKey()).intValue();
                    Collection<? extends Peer> collection = (Collection) entry.getValue();
                    pdmVar.d().c(intValue, collection);
                    pdmVar.p(intValue, collection);
                }
                return s3q0.a;
            case 10:
                com.vk.lists.c cVar2 = (com.vk.lists.c) obj4;
                rdo rdoVar = (rdo) obj3;
                WallWithCounters wallWithCounters = (WallWithCounters) obj;
                cVar2.l(wallWithCounters.m());
                rdoVar.o(wallWithCounters, null);
                if (wallWithCounters.isEmpty() || rdoVar.d.size() >= wallWithCounters.m()) {
                    cVar2.r(false);
                }
                return s3q0.a;
            case 11:
                WebStoryBox webStoryBox = (WebStoryBox) obj4;
                StoryUploadParams storyUploadParams = (StoryUploadParams) obj3;
                b.d dVar2 = (b.d) obj;
                if (webStoryBox != null && webStoryBox.Db()) {
                    nf9 nf9Var = nf9.b;
                    nf9.n(dVar2, storyUploadParams.x);
                }
                String str3 = storyUploadParams.i;
                if (str3 != null) {
                    dVar2.b(str3, "story_type");
                }
                return s3q0.a;
            case 12:
                f0r.b bVar = (f0r.b) obj4;
                nj50<? super qvq, ? super c2r> nj50Var = (wk50.a) obj3;
                bpd bpdVar = (bpd) obj;
                ArrayList e = bVar.e.e(bpdVar.a);
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = e.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (hashSet.add(((FeedItem.d) next).b1())) {
                        arrayList3.add(next);
                    }
                }
                bVar.i(nj50Var, arrayList3, new f0r.m(bpdVar.b, bpdVar.c), s4r.a.a, ubx.b.a, null, null);
                return s3q0.a;
            case 13:
                com.vk.folders.impl.configure.h hVar = (com.vk.folders.impl.configure.h) obj4;
                wt90 wt90Var = (wt90) obj3;
                if (!(((yt90) obj) instanceof yt90.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                hVar.O(new g.C1069g(wt90Var));
                return s3q0.a;
            case 14:
                m1s m1sVar = (m1s) obj4;
                wzr.b bVar2 = (wzr.b) ((wzr) obj3);
                int id2 = bVar2.a.getId();
                Map<Integer, xyr> map2 = ((v1s) obj).a;
                xyr xyrVar = bVar2.a;
                xyr xyrVar2 = map2.get(Integer.valueOf(xyrVar.getId()));
                if (xyrVar2 == null || (name = xyrVar2.getName()) == null) {
                    name = xyrVar.getName();
                }
                m1sVar.m(new n1s.a(id2, name, xyrVar.getType()));
                return s3q0.a;
            case 15:
                e3u e3uVar = (e3u) obj4;
                io.reactivex.rxjava3.core.y yVar = (io.reactivex.rxjava3.core.y) obj3;
                qa3 qa3Var = (qa3) obj;
                String str4 = qa3Var.a;
                int i9 = qa3Var.c;
                long j = qa3Var.b;
                if (e3uVar.c) {
                    availabilityState2 = AvailabilityState.UPDATE_NOT_AVAILABLE;
                    i = 2;
                } else {
                    i = 2;
                    if (i9 == 2) {
                        byte b4 = (byte) (((byte) 1) | 2);
                        if (b4 != 3) {
                            StringBuilder sb = new StringBuilder();
                            if ((b4 & 1) == 0) {
                                sb.append(" appUpdateType");
                            }
                            if ((b4 & 2) == 0) {
                                sb.append(" allowAssetPackDeletion");
                            }
                            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                        }
                        if (qa3Var.a(new zr01(0)) != null) {
                            availabilityState = AvailabilityState.UPDATE_AVAILABLE;
                            availabilityState2 = availabilityState;
                        }
                    }
                    if (i9 == 3) {
                        byte b5 = (byte) (((byte) 1) | 2);
                        if (b5 != 3) {
                            StringBuilder sb2 = new StringBuilder();
                            if ((b5 & 1) == 0) {
                                sb2.append(" appUpdateType");
                            }
                            if ((b5 & 2) == 0) {
                                sb2.append(" allowAssetPackDeletion");
                            }
                            throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                        }
                        if (qa3Var.a(new zr01(1)) != null) {
                            availabilityState = AvailabilityState.UPDATE_AVAILABLE;
                            availabilityState2 = availabilityState;
                        }
                    }
                    availabilityState = AvailabilityState.UPDATE_NOT_AVAILABLE;
                    availabilityState2 = availabilityState;
                }
                int i10 = qa3Var.d;
                wrw wrwVar = new wrw(str4, j, availabilityState2, i10 != i ? i10 != 11 ? DownloadState.NOT_LOADED : 3 == i9 ? DownloadState.NOT_LOADED : DownloadState.DOWNLOADED : DownloadState.DOWNLOADING, new v8o(qa3Var.e, qa3Var.f), qa3Var);
                e3uVar.d.l("gms update info:" + wrwVar);
                yVar.onSuccess(wrwVar);
                return s3q0.a;
            case 16:
                HeaderShowAllVh headerShowAllVh = (HeaderShowAllVh) obj4;
                io.reactivex.rxjava3.disposables.c c = eda.c(headerShowAllVh.u, (String) obj, new oap.a((Context) obj3), null, 12);
                View view3 = headerShowAllVh.f;
                hg1.b(view3 != null ? view3 : null, c);
                return s3q0.a;
            case 17:
                kjx kjxVar = (kjx) obj4;
                u7a u7aVar = (u7a) obj;
                gm50.a.a(kjxVar, u7aVar.a, new c3b(kjxVar, u7aVar, (CatalogStarsFeedbackView) obj3, i6));
                return s3q0.a;
            case 18:
                String str5 = (String) obj3;
                Throwable th = (Throwable) obj;
                rvp w0 = ((l2y) obj4).w0();
                w0.getClass();
                if (th instanceof VKApiExecutionException) {
                    VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
                    if (vKApiExecutionException.s() == 15) {
                        data = new GetSilentToken$Error.Data(GetSilentToken$Error.Data.Type.AUTH_ERROR, str5, new Responses$AuthError(null, new Responses$AuthError.ErrorData(VkAppsErrors.Client.ACCESS_DENIED.getDescription(), null, vKApiExecutionException.u()), 1, null), null, 8, null);
                        com.vk.superapp.base.js.bridge.b.o(w0.a, new JsMethod("VKWebAppGetSilentToken"), new GetSilentToken$Error(r10, data, i6, r10), null, null, 12);
                        return s3q0.a;
                    }
                }
                data = new GetSilentToken$Error.Data(GetSilentToken$Error.Data.Type.CLIENT_ERROR, null, null, fco0.h(str5 != null ? str5 : "", th), 6, null);
                com.vk.superapp.base.js.bridge.b.o(w0.a, new JsMethod("VKWebAppGetSilentToken"), new GetSilentToken$Error(r10, data, i6, r10), null, null, 12);
                return s3q0.a;
            case 19:
                error$lambda$0 = MLDownloadStat.error$lambda$0((String) obj4, (String) obj3, (CallEventualStatSender) obj);
                return error$lambda$0;
            case 20:
                pq50 pq50Var = (pq50) obj4;
                jr50 jr50Var = (jr50) obj3;
                String str6 = (String) obj;
                pq50Var.D.sa(new NewsfeedExternalAction.c.r(jr50Var.c()));
                egz0 c2 = jr50Var.d().c();
                if (c2 == null || (arrayList2 = c2.b) == null) {
                    ajxVar = null;
                } else {
                    Iterator it3 = arrayList2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj2 = it3.next();
                            if (epx.f(((ajx) obj2).b(), str6)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    ajxVar = (ajx) obj2;
                }
                if (ajxVar != null) {
                    cjx cjxVar = pq50Var.E;
                    (cjxVar != null ? cjxVar : null).b(ajxVar);
                }
                return s3q0.a;
            case 21:
                ((jz50) obj4).b.G.B.m((StoryEntry) obj3, false);
                return s3q0.a;
            case 22:
                ?? r12 = (FunctionReferenceImpl) obj3;
                List<ol60> list3 = ((qz60) ((gzs) obj4).invoke()).b.b.a;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : list3) {
                    if (obj5 instanceof z1c0) {
                        arrayList4.add(obj5);
                    }
                }
                ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(((z1c0) it4.next()).h.h);
                }
                ArrayList arrayList6 = new ArrayList();
                Iterator it5 = arrayList5.iterator();
                while (it5.hasNext()) {
                    Object next2 = it5.next();
                    if (next2 instanceof vt80) {
                        arrayList6.add(next2);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                Iterator it6 = arrayList6.iterator();
                while (it6.hasNext()) {
                    x9v0 x9v0Var = ((vt80) it6.next()).m.m;
                    if (x9v0Var != null) {
                        arrayList7.add(x9v0Var);
                    }
                }
                r12.invoke(new xh60.e(new yo60.i.a(arrayList7)));
                return s3q0.a;
            case 23:
                Context context = (Context) obj4;
                final yp80 yp80Var = (yp80) obj3;
                UserProfileGift userProfileGift = (UserProfileGift) obj;
                if (userProfileGift.h0) {
                    g2v.d().a().f(context, userProfileGift, userProfileGift.i0);
                    if (yp80Var != null) {
                        yp80Var.onSuccess();
                    }
                } else {
                    h7u0.a aVar2 = new h7u0.a(context);
                    aVar2.U(R.string.gifts_privacy_error);
                    aVar2.c0(R.string.ok, new sq80(0));
                    aVar2.a.n = new DialogInterface.OnCancelListener() { // from class: xsna.tq80
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            yp80 yp80Var2 = yp80.this;
                            if (yp80Var2 != null) {
                                yp80Var2.onSuccess();
                            }
                        }
                    };
                    aVar2.m();
                }
                return s3q0.a;
            case 24:
                com.vk.newsfeed.posting.geo_picker.presentation.e eVar = (com.vk.newsfeed.posting.geo_picker.presentation.e) obj4;
                com.vk.newsfeed.posting.geo_picker.presentation.b bVar3 = (com.vk.newsfeed.posting.geo_picker.presentation.b) obj3;
                com.vk.newsfeed.posting.geo_picker.presentation.i iVar2 = (com.vk.newsfeed.posting.geo_picker.presentation.i) obj;
                int i11 = com.vk.newsfeed.posting.geo_picker.presentation.e.t1;
                if (iVar2 instanceof i.a) {
                    com.vk.newsfeed.posting.geo_picker.presentation.f fVar = eVar.l1;
                    i.a aVar3 = (i.a) iVar2;
                    com.vk.newsfeed.posting.geo_picker.presentation.e eVar2 = fVar.a;
                    if (aVar3 instanceof i.a.b) {
                        wqa0 wqa0Var = fVar.b;
                        if (wqa0Var != null) {
                            wqa0Var.b(((i.a.b) aVar3).a);
                        }
                        eVar2.hide();
                    } else {
                        if (!(aVar3 instanceof i.a.C1417a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        eVar2.hide();
                    }
                } else if (iVar2 instanceof i.b) {
                    cra0<yqa0> cra0Var = eVar.m1;
                    i.b bVar4 = (i.b) iVar2;
                    AtomicBoolean atomicBoolean = cra0Var.f;
                    AtomicBoolean atomicBoolean2 = cra0Var.e;
                    if (bVar4 instanceof i.b.a) {
                        i.b.a aVar4 = (i.b.a) bVar4;
                        cra0Var.c.set(aVar4.a);
                        cra0Var.d.set(aVar4.b);
                        atomicBoolean2.set(false);
                        atomicBoolean.set(false);
                    } else if (bVar4 instanceof i.b.C1418b) {
                        atomicBoolean2.set(true);
                        atomicBoolean.set(false);
                    } else {
                        if (!(bVar4 instanceof i.b.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        PlacePickerState.LoadingState loadingState = ((i.b.c) bVar4).a;
                        boolean z3 = loadingState == PlacePickerState.LoadingState.ERROR;
                        if (!z3 && loadingState != PlacePickerState.LoadingState.IDLE) {
                            z = true;
                        }
                        atomicBoolean2.set(z);
                        atomicBoolean.set(z3);
                    }
                } else if (iVar2 instanceof nra0) {
                    FragmentActivity activity = eVar.getActivity();
                    if (activity != null) {
                        AtomicReference<Location> atomicReference = oxz.a;
                        LocationCommon.a.getClass();
                        if (!LocationCommon.b(activity)) {
                            FragmentActivity activity2 = eVar.getActivity();
                            if (activity2 != null) {
                                activity2.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                            }
                        } else if (LocationCommon.a(activity)) {
                            xn50.a.c(eVar, new a.b.C1409b(true, true));
                        } else {
                            FragmentActivity activity3 = eVar.getActivity();
                            if (activity3 != null) {
                                PermissionHelper.a.getClass();
                                if (PermissionHelper.b(activity3, PermissionHelper.h)) {
                                    xn50.a.c(eVar, new a.b.C1409b(!LocationCommon.b(activity3), !LocationCommon.a(activity3)));
                                } else {
                                    String[] strArr2 = PermissionHelper.i;
                                    eVar.requestPermissions((String[]) Arrays.copyOf(strArr2, strArr2.length), 14);
                                }
                            }
                        }
                    }
                } else if (iVar2 instanceof mra0) {
                    eVar.i1.post(new sc2(eVar, i3));
                } else if (iVar2 instanceof ora0) {
                    ora0 ora0Var = (ora0) iVar2;
                    sra0 sra0Var = eVar.n1;
                    if (sra0Var != null) {
                        ora0Var.getClass();
                        kra0 kra0Var = sra0Var.d.e;
                        if (kra0Var != null) {
                            kra0Var.m.setQuery(null);
                        }
                    }
                } else if (iVar2 instanceof pra0) {
                    io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new jm20(eVar, i6));
                    asu0.a.getClass();
                    io.reactivex.rxjava3.internal.operators.single.f0 q = vVar.q(asu0.m());
                    int i12 = kwg0.a;
                    io.reactivex.rxjava3.disposables.c subscribe = q.subscribe(new iwg0(), new zk30(new hx3(com.vk.metrics.eventtracking.b.a, 5), i5));
                    if (subscribe != null) {
                        bVar3.e.b(subscribe);
                    }
                } else {
                    if (!(iVar2 instanceof qra0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wqa0 wqa0Var2 = eVar.j1;
                    if (wqa0Var2 != null) {
                        wqa0Var2.a(((qra0) iVar2).a);
                    }
                }
                return s3q0.a;
            case 25:
                ((com.vk.newsfeed.impl.posting.a) obj4).getClass();
                return rsg0.W(new v9x0(com.vk.newsfeed.impl.posting.a.a((flc0) obj3, null, (List) obj)), 7).w();
            case 26:
                izs izsVar = (izs) obj4;
                brj0 brj0Var = (brj0) obj3;
                if (izsVar != null) {
                    izsVar.invoke(brj0Var);
                }
                return s3q0.a;
            case 27:
                com.vk.stickers.settings.b bVar5 = (com.vk.stickers.settings.b) obj4;
                StickerSettingsFeature stickerSettingsFeature = (StickerSettingsFeature) obj3;
                com.vk.stickers.settings.a aVar5 = stickerSettingsFeature.g;
                io.reactivex.rxjava3.disposables.b bVar6 = stickerSettingsFeature.e;
                int i13 = StickerSettingsFeature.a.$EnumSwitchMapping$0[((StickerSettingsRouter.VmojiMenuButton) obj).ordinal()];
                if (i13 == 1) {
                    String str7 = ((b.n) bVar5).c;
                    if (str7 != null) {
                        StickerSettingsRouter stickerSettingsRouter = stickerSettingsFeature.h;
                        stickerSettingsRouter.getClass();
                        y8w0 y8w0Var = new y8w0(0);
                        y8w0Var.a = str7;
                        d6w0.a(b6m.e(), stickerSettingsRouter.a, "stickers_settings", y8w0Var.a(), 8);
                    }
                } else if (i13 == 2) {
                    bVar6.b(aVar5.a(true).subscribe(new ueb(stickerSettingsFeature, i3)));
                } else {
                    if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar6.b(aVar5.a(false).subscribe(new rg60(stickerSettingsFeature, i4)));
                }
                return s3q0.a;
            case 28:
                AdminLeaveAction adminLeaveAction = (AdminLeaveAction) obj;
                ((ill0) obj4).e.invoke(new hjl0.c(((xll0.a.u) obj3).a, adminLeaveAction != null ? adminLeaveAction.i() : null));
                return s3q0.a;
            default:
                ((Canvas) obj).drawPath((Path) obj4, ((lrm0) obj3).g);
                return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ mh4(gzs gzsVar, izs izsVar) {
        this.b = 22;
        this.c = gzsVar;
        this.d = (FunctionReferenceImpl) izsVar;
    }
}
