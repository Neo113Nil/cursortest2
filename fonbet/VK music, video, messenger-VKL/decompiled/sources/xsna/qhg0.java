package xsna;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.ui.mvp.holder.video.SubcategoryFilterVh;
import com.vk.catalog2.common.ui.mvp.video.VideoPlaylistPlaceHolder;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.DiscoverErrorLoadContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.author.VideoPinType;
import com.vk.stickers.api.models.market.StoryServiceItemInfo;
import com.vk.stickers.keyboard.StickersView;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.e;
import com.vk.storycamera.screen.StoryGalleryActivity;
import com.vk.superapp.api.dto.auth.UserItem;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.js.bridge.events.AddToCommunity$Error;
import com.vk.superapp.js.bridge.events.EventNames;
import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogRepository$Section;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.i;
import com.vk.video.ui.discovery.recommendations.VideoDiscoveryRecommendationsRepository;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import one.video.ad.ux.ShoppableAdView;
import xsna.ect0;
import xsna.fh8;
import xsna.h2s0;
import xsna.ikv0;
import xsna.oem0;
import xsna.qr60;
import xsna.tgv0;
import xsna.tj50;
import xsna.uhg0;
import xsna.x6i0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class qhg0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qhg0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v67, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v83, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        sgv0 sgv0Var;
        vgv0 vgv0Var;
        ugv0 ugv0Var;
        qgv0 qgv0Var;
        gdm0 gdm0Var;
        VkButton vkButton;
        VkButton vkButton2;
        int i;
        int i2 = this.b;
        int i3 = 20;
        int i4 = 25;
        int i5 = 8;
        int i6 = 1;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                tj50.a aVar = (tj50.a) obj;
                rhg0 rhg0Var = new rhg0();
                ao8 ao8Var = ao8.d;
                return new uhg0.a(aVar.a(rhg0Var, ao8Var), aVar.a(new k990(14), ao8Var), aVar.a(new ha40(10), ao8Var), aVar.a(new rvq(i4), ao8Var), aVar.a(new pqz(i3), ao8Var));
            case 1:
                sjg0 sjg0Var = (sjg0) obj2;
                VkRichCell vkRichCell = (VkRichCell) obj;
                ?? r2 = sjg0Var.b;
                ?? r3 = sjg0Var.f;
                sgv0 sgv0Var2 = (sgv0) r2.get((String) ((zak0) sjg0Var.n).getValue());
                if (sgv0Var2 != null) {
                    sgv0Var = new sgv0(sgv0Var2.a, sgv0Var2.b, sgv0Var2.c, sjg0Var.g() ? Integer.MAX_VALUE : 1, sgv0Var2.e);
                } else {
                    sgv0Var = null;
                }
                vgv0 vgv0Var2 = (vgv0) sjg0Var.e.get((String) ((zak0) sjg0Var.m).getValue());
                if (vgv0Var2 != null) {
                    vgv0Var = vgv0.a(vgv0Var2, null, sjg0Var.g() ? Integer.MAX_VALUE : 1, 23);
                } else {
                    vgv0Var = null;
                }
                ugv0 ugv0Var2 = (ugv0) sjg0Var.c.get((String) ((zak0) sjg0Var.p).getValue());
                if (ugv0Var2 != null) {
                    ugv0Var = new ugv0(ugv0Var2.a, ugv0Var2.b, ugv0Var2.c, sjg0Var.g() ? Integer.MAX_VALUE : 1, ugv0Var2.e, ugv0Var2.f);
                } else {
                    ugv0Var = null;
                }
                qgv0 qgv0Var2 = (qgv0) sjg0Var.d.get((String) ((zak0) sjg0Var.q).getValue());
                if (qgv0Var2 != null) {
                    qgv0Var = new qgv0(qgv0Var2.a, qgv0Var2.b, qgv0Var2.c, sjg0Var.g() ? Integer.MAX_VALUE : 1, qgv0Var2.e);
                } else {
                    qgv0Var = null;
                }
                vkRichCell.setMiddle(new pgv0(vgv0Var, ugv0Var, qgv0Var, sgv0Var, (tgv0.a) sjg0Var.h.get((String) ((zak0) sjg0Var.w).getValue()), (rgv0) sjg0Var.i.get((String) ((zak0) sjg0Var.x).getValue()), (ogv0) r3.get((String) ((zak0) sjg0Var.t).getValue()), (ogv0) r3.get((String) ((zak0) sjg0Var.u).getValue()), (ogv0) r3.get((String) ((zak0) sjg0Var.v).getValue())));
                vkRichCell.setLeft((VkCell.Left.b) sjg0Var.j.get((String) ((zak0) sjg0Var.r).getValue()));
                vkRichCell.setRight((VkCell.Right.d) sjg0Var.k.get((String) ((zak0) sjg0Var.s).getValue()));
                return s3q0.a;
            case 2:
                return new x6i0.f(((LayoutInflater) obj2).inflate(R.layout.im_channel_selection_title_vh, (ViewGroup) obj, false));
            case 3:
                ((ShoppableAdView) obj2).f.setAlpha(((Float) obj).floatValue());
                return s3q0.a;
            case 4:
                clj0 clj0Var = (clj0) obj2;
                dfw0 dfw0Var = (dfw0) ((it80) obj).a;
                if (dfw0Var != null) {
                    ((pvw0) clj0Var.c.b().b).H0(dfw0Var.a, dfw0Var.b);
                }
                clj0Var.e.invoke(new fh8.i.c(dfw0Var));
                return s3q0.a;
            case 5:
                ((StickersView) obj2).D.r();
                return s3q0.a;
            case 6:
                ((tdu) obj).b(((vak0) ((ofl0) obj2).h).getFloatValue());
                return s3q0.a;
            case 7:
                iui iuiVar = (iui) obj;
                iuiVar.a = new yf4(i5, iuiVar.a(new rqd0()), iuiVar.a(new pml0((ull0) obj2)));
                return s3q0.a;
            case 8:
                WeakReference<View> weakReference = StoryGalleryActivity.F;
                ((fda0) obj2).invoke(Boolean.valueOf(!((List) obj).isEmpty()));
                return s3q0.a;
            case 9:
                ddm0 ddm0Var = (ddm0) obj2;
                cx7 cx7Var = (cx7) obj;
                String str = cx7Var.a;
                CharSequence charSequence = cx7Var.b;
                UserId userId = cx7Var.d;
                Long l = cx7Var.c;
                StoryServiceItemInfo storyServiceItemInfo = ddm0Var.i;
                StoryServiceItemInfo storyServiceItemInfo2 = new StoryServiceItemInfo(str, charSequence, l, userId, storyServiceItemInfo != null ? storyServiceItemInfo.e : null);
                ddm0Var.i = storyServiceItemInfo2;
                tyl0<?> tyl0Var = ddm0Var.d;
                bdm0 bdm0Var = tyl0Var instanceof bdm0 ? (bdm0) tyl0Var : null;
                if (bdm0Var != null && (gdm0Var = bdm0Var.m) != null) {
                    idm0 a = idm0.a(gdm0Var.e, 0, storyServiceItemInfo2, null, 29);
                    gdm0Var.e = a;
                    gdm0Var.b.h(a);
                }
                if (ddm0Var.d == null) {
                    ddm0Var.h(null);
                }
                return s3q0.a;
            case 10:
                ((com.vk.stories.design.view.stats.tabs.viewers.mvi.b) obj2).T(new e.b.a(((oem0.a.c) obj).a));
                return s3q0.a;
            case 11:
                bmm0 bmm0Var = (bmm0) obj2;
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                bmm0Var.g(false);
                com.vk.story.viewer.impl.presentation.stories.b bVar = bmm0Var.a;
                List<StoriesContainer> storiesContainer = bVar.getStoriesContainer();
                ArrayList<StoriesContainer> arrayList = storiesContainer != null ? new ArrayList<>(i7o0.a(storiesContainer)) : null;
                if (arrayList != null && !arrayList.isEmpty()) {
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((StoriesContainer) it.next()) instanceof DiscoverErrorLoadContainer) {
                            return s3q0.a;
                        }
                    }
                }
                if (arrayList != null) {
                    arrayList.add(new DiscoverErrorLoadContainer(null, null, 3, null));
                }
                bVar.S(arrayList, false);
                return s3q0.a;
            case 12:
                qcy<Object>[] qcyVarArr = SubcategoryFilterVh.f;
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) obj2).element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 13:
                dcp0 dcp0Var = (dcp0) obj2;
                ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                Context context = dcp0Var.d;
                int a2 = e3m.a(dcp0Var.a ? R.dimen.video_topshelf_content_margin_bottom : R.dimen.video_topshelf_content_margin_bottom_without_dots, context);
                boolean z = dcp0Var.e;
                int i7 = R.dimen.video_topshelf_content_margin_horizontal;
                int a3 = e3m.a(z ? R.dimen.video_topshelf_tablet_margins_horizontal : R.dimen.video_topshelf_content_margin_horizontal, context);
                if (z) {
                    i7 = R.dimen.video_topshelf_tablet_margins_horizontal;
                }
                int a4 = e3m.a(i7, context);
                bVar2.t = 0;
                bVar2.l = 0;
                bVar2.v = 0;
                bVar2.setMargins(a3, 0, a4, a2);
                return s3q0.a;
            case 14:
                g7q0 g7q0Var = (g7q0) obj2;
                g7q0Var.f = (VideoFile) obj;
                g7q0Var.Q();
                Boolean P8 = g7q0Var.f.P8();
                g7q0Var.n = P8 != null ? P8.booleanValue() : false;
                g7q0Var.a2();
                return s3q0.a;
            case 15:
                mgq0 mgq0Var = (mgq0) obj2;
                mgq0Var.d.invoke(mgq0Var.f, Integer.valueOf(mgq0Var.x0((UserItem) obj)));
                return s3q0.a;
            case 16:
                rkq0 rkq0Var = (rkq0) obj2;
                dw20 dw20Var2 = rkq0Var.b;
                if (dw20Var2 != null) {
                    rkq0Var.h(dw20Var2, ((foz) rkq0Var.j.getValue()).c());
                }
                return s3q0.a;
            case 17:
                return ((zvq0) obj2).b.e(new awq0((qr60.a) obj));
            case 18:
                h2s0.a aVar2 = (h2s0.a) obj2;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) obj;
                io.reactivex.rxjava3.disposables.c cVar2 = aVar2.n;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                aVar2.n = cVar;
                return s3q0.a;
            case 19:
                ((s2b) obj2).invoke();
                return s3q0.a;
            case 20:
                VideoDiscoveryRecommendationsRepository.a aVar3 = (VideoDiscoveryRecommendationsRepository.a) obj;
                VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section = new VideoDiscoveryCatalogRepository$Section("__discovery_catalog_special_fallback_video_music_stream_mix_section_id__", (String) ((com.vk.video.ui.discovery.catalog.c) obj2).g.invoke(), "", (ArrayList) aVar3.a.b, aVar3.c, aVar3.d, (List) null, 144);
                return new sfs0(videoDiscoveryCatalogRepository$Section, Collections.singletonList(videoDiscoveryCatalogRepository$Section));
            case 21:
                ((io.reactivex.rxjava3.core.y) obj2).onError((Throwable) obj);
                return s3q0.a;
            case 22:
                VideoPlaylistPlaceHolder videoPlaylistPlaceHolder = (VideoPlaylistPlaceHolder) obj2;
                VideoAlbum videoAlbum = videoPlaylistPlaceHolder.t;
                VideoAlbum videoAlbum2 = ((jwr0) obj).a;
                String str2 = videoAlbum2.d;
                videoAlbum.d = str2;
                videoAlbum.l = videoAlbum2.l;
                videoAlbum.j = videoAlbum2.j;
                if (!epx.f(videoPlaylistPlaceHolder.I, str2)) {
                    String str3 = videoAlbum.d;
                    videoPlaylistPlaceHolder.I = str3;
                    VkTopBar vkTopBar = videoPlaylistPlaceHolder.B;
                    if (vkTopBar != null) {
                        if (str3 == null) {
                            str3 = "";
                        }
                        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(str3, (e4) null, (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 14), null, null, null, 14));
                    }
                }
                return s3q0.a;
            case 23:
                ((k6t0) obj2).o1();
                return s3q0.a;
            case 24:
                VideoRelatedVideosFragment videoRelatedVideosFragment = (VideoRelatedVideosFragment) obj2;
                com.vk.video.ui.discovery.minimizable.dialog.related_videos.a aVar4 = videoRelatedVideosFragment.Y;
                com.vk.video.ui.discovery.minimizable.dialog.related_videos.i iVar = (com.vk.video.ui.discovery.minimizable.dialog.related_videos.i) obj;
                int i8 = VideoRelatedVideosFragment.n0;
                if (iVar instanceof i.c) {
                    Context requireContext = videoRelatedVideosFragment.requireContext();
                    dhr0.a.getClass();
                    new ect0.a(new lpj(requireContext, dhr0.u().c), ((i.c) iVar).a, new r9c0(videoRelatedVideosFragment, 21)).I0(null);
                } else {
                    int i9 = 12;
                    if (iVar instanceof i.f) {
                        boolean z2 = ((i.f) iVar).a;
                        Context requireContext2 = videoRelatedVideosFragment.requireContext();
                        gib0 gib0Var = new gib0(videoRelatedVideosFragment, 25);
                        wv2 wv2Var = new wv2(videoRelatedVideosFragment, 12);
                        aVar4.getClass();
                        dhr0.a.getClass();
                        lpj lpjVar = new lpj(requireContext2, dhr0.u().c);
                        ikv0.a aVar5 = new ikv0.a(lpjVar);
                        aVar5.k = 1;
                        aVar5.l = 1;
                        aVar5.o = Integer.valueOf(iah0.a(8));
                        aVar5.h = gib0Var;
                        Integer valueOf = Integer.valueOf(R.attr.vk_ui_icon_accent_themed);
                        if (z2) {
                            aVar5.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, valueOf, (Size) null, 12);
                            aVar5.u = new ikv0.d(lpjVar.getString(R.string.community_subscribed), (String) null, (ikv0.d.a) null, 6);
                        } else {
                            aVar5.t = new ikv0.c.C3058c(R.drawable.vk_icon_minus_square_outline_28, valueOf, (Size) null, 12);
                            aVar5.u = new ikv0.d(lpjVar.getString(R.string.community_unsubscribed), (String) null, (ikv0.d.a) null, 6);
                            aVar5.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, lpjVar.getString(R.string.cancel), new lbt0(wv2Var, false ? 1 : 0));
                        }
                        pkv0.e(aVar5);
                        videoRelatedVideosFragment.Z = pkv0.f(aVar5);
                    } else if (iVar instanceof i.d) {
                        i.d dVar = (i.d) iVar;
                        Context requireContext3 = videoRelatedVideosFragment.requireContext();
                        Object[] objArr = dVar.a != null ? 1 : null;
                        com.vk.movika.sdk.base.logic.processor.actions.e eVar = new com.vk.movika.sdk.base.logic.processor.actions.e(26, dVar, videoRelatedVideosFragment);
                        iyd0 iyd0Var = new iyd0(videoRelatedVideosFragment, i3);
                        aVar4.getClass();
                        dhr0.a.getClass();
                        lpj lpjVar2 = new lpj(requireContext3, dhr0.u().c);
                        ikv0.a aVar6 = new ikv0.a(lpjVar2);
                        aVar6.k = 1;
                        aVar6.l = 1;
                        aVar6.o = Integer.valueOf(iah0.a(8));
                        aVar6.h = iyd0Var;
                        aVar6.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) null, 12);
                        aVar6.u = new ikv0.d(lpjVar2.getString(R.string.video_related_videos_playlist_added_snackbar_middle), (String) null, (ikv0.d.a) null, 6);
                        if (objArr != null) {
                            aVar6.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, lpjVar2.getString(R.string.video_related_videos_playlist_added_snackbar_right), new lxh0(eVar, i9));
                        }
                        pkv0.e(aVar6);
                        videoRelatedVideosFragment.a0 = pkv0.f(aVar6);
                        videoRelatedVideosFragment.so();
                    } else if (iVar.equals(i.e.a)) {
                        Context requireContext4 = videoRelatedVideosFragment.requireContext();
                        xv2 xv2Var = new xv2(videoRelatedVideosFragment, 17);
                        gqq0 gqq0Var = new gqq0(videoRelatedVideosFragment, i6);
                        aVar4.getClass();
                        dhr0.a.getClass();
                        lpj lpjVar3 = new lpj(requireContext4, dhr0.u().c);
                        ikv0.a aVar7 = new ikv0.a(lpjVar3);
                        aVar7.k = 1;
                        aVar7.l = 1;
                        aVar7.o = Integer.valueOf(iah0.a(8));
                        aVar7.h = gqq0Var;
                        aVar7.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_negative), (Size) null, 12);
                        aVar7.u = new ikv0.d(lpjVar3.getString(R.string.video_related_videos_playlist_added_error_snackbar_middle), (String) null, (ikv0.d.a) null, 6);
                        aVar7.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, lpjVar3.getString(R.string.video_related_videos_playlist_adding_error_snackbar_right), new yyl0(xv2Var, 17));
                        pkv0.e(aVar7);
                        videoRelatedVideosFragment.b0 = pkv0.f(aVar7);
                        VideoRelatedVideosFragment.b bVar3 = videoRelatedVideosFragment.Q;
                        if (bVar3 != null && (vkButton2 = bVar3.e) != null) {
                            vkButton2.setLoading(false);
                            vkButton2.a5(true, Integer.valueOf(R.drawable.vk_icon_add_outline_24));
                        }
                    } else if (iVar.equals(i.a.a)) {
                        VideoRelatedVideosFragment.b bVar4 = videoRelatedVideosFragment.Q;
                        if (bVar4 != null && (vkButton = bVar4.e) != null) {
                            int[] iArr = VkButton.W;
                            vkButton.a5(true, null);
                            vkButton.setLoading(true);
                        }
                    } else if (iVar instanceof i.g) {
                        i.g gVar = (i.g) iVar;
                        FragmentActivity activity = videoRelatedVideosFragment.getActivity();
                        if (activity != null) {
                            if (((Boolean) videoRelatedVideosFragment.j0.getValue()).booleanValue()) {
                                new w6s0(videoRelatedVideosFragment.ro(gVar), null).e(activity);
                            } else {
                                new e6s0(activity, videoRelatedVideosFragment.ro(gVar), null).c();
                            }
                        }
                    } else {
                        if (!(iVar instanceof i.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ydt0.e(fxc0.B().Y(), videoRelatedVideosFragment.kn(), ((i.b) iVar).a, null, null, 28);
                    }
                }
                return s3q0.a;
            case 25:
                xqo xqoVar = (xqo) obj2;
                tny tnyVar = (tny) obj;
                long a5 = tnyVar.a();
                wh50 wh50Var = xqoVar.g;
                ulo uloVar = (ulo) ((zak0) wh50Var).getValue();
                if (uloVar == null || !q9x.b(a5, uloVar.a.a())) {
                    long j = ((q9x) ((izs) ((zak0) xqoVar.f).getValue()).invoke(new q9x(a5))).a;
                    int i10 = (int) (j >> 32);
                    if (i10 <= 0 || (i = (int) (j & 4294967295L)) <= 0) {
                        ((zak0) wh50Var).setValue(null);
                    } else {
                        Bitmap createBitmap = Bitmap.createBitmap(i10, i, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Canvas canvas2 = e52.a;
                        d52 d52Var = new d52();
                        d52Var.a = canvas;
                        ulo uloVar2 = new ulo(tnyVar, d52Var, createBitmap);
                        ((zak0) wh50Var).setValue(uloVar2);
                        View value = xqoVar.a.getValue();
                        if (value != null) {
                            but0.b(value, xqoVar, uloVar2);
                            jxs.a(value.getContext(), createBitmap, ((vak0) xqoVar.d).getFloatValue());
                        }
                    }
                }
                return s3q0.a;
            case 26:
                return new yd90((ViewGroup) obj, ((uxt0) obj2).u);
            case 27:
                lkr0 lkr0Var = ((j9u0) obj2).a;
                if (lkr0Var != null) {
                    lkr0Var.d();
                }
                return s3q0.a;
            case 28:
                yuv0 yuv0Var = (yuv0) obj2;
                mfu0 mfu0Var = yuv0Var.b;
                EventNames eventNames = EventNames.AddToCommunity;
                int i11 = uyp.a;
                mfu0Var.x(eventNames, new AddToCommunity$Error(null == true ? 1 : 0, uyp.a(eventNames, mfu0Var, (Throwable) obj), i6, null == true ? 1 : 0));
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                (superappUiRouterBridge != null ? superappUiRouterBridge : null).j(yuv0Var.a.getString(R.string.vk_apps_common_network_error));
                return s3q0.a;
            default:
                i9w0 i9w0Var = (i9w0) obj2;
                ProgressDialog progressDialog = i9w0Var.g;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                i9w0Var.g = null;
                i9w0Var.f.setVisibility(0);
                return s3q0.a;
        }
    }

    public /* synthetic */ qhg0(s2b s2bVar, abs0 abs0Var, Activity activity, VideoPinType videoPinType) {
        this.b = 19;
        this.c = s2bVar;
    }
}
