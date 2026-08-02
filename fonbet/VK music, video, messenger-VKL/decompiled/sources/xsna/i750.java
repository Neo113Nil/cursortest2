package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.compose.ui.node.LayoutNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.tabs.TabLayout;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.account.dto.AccountInfoDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.cameraui.impl.QrScannerUi;
import com.vk.clips.design.view.QRSharingView;
import com.vk.clips.design.view.camera.widgets.TabsRecycler;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.content.design.view.camera.ShutterButton;
import com.vk.core.view.components.tabs.VkTabLayout;
import com.vk.dto.common.AttachmentType;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.uxpolls.Condition;
import com.vk.dto.uxpolls.PollAnswer;
import com.vk.feed.settings.impl.presentation.filtered.NewsfeedFilteredSourcesFragment;
import com.vk.media.player.video.view.PlaylistPlayerVideoView;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.newsfeed.impl.posting.settings.mvi.e;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.newsfeed.posting.geo_picker.presentation.g;
import com.vk.stickers.settings.b;
import com.vk.stickers.views.LongtapRecyclerView;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.voip.ui.sessionrooms.f;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import xsna.fm9;
import xsna.gm50;
import xsna.jd50;
import xsna.l65;
import xsna.lc50;
import xsna.m7a0;
import xsna.nkd0;
import xsna.qn60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class i750 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i750(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04f3  */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int size;
        TabLayout.g b;
        Map<Integer, TextView> viewsTabs;
        QRSharingView qRSharingView;
        ViewPropertyAnimator c;
        int i = this.b;
        int i2 = 2;
        int i3 = 4;
        boolean z = true;
        Object[] objArr = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                kg50 kg50Var = (kg50) obj2;
                kg50Var.g(kg50Var.getFloatValue() + ((Float) obj).floatValue());
                break;
            case 1:
                yc50 yc50Var = (yc50) obj2;
                jd50.a aVar = (jd50.a) obj;
                int i4 = yc50.x1;
                yzt0<jd50.a.b> yzt0Var = aVar.a;
                hd50 hd50Var = yc50Var.i1;
                gm50.a.a(yc50Var, yzt0Var, new zc50(1, hd50Var == null ? null : hd50Var, hd50.class, "renderRemainingTime", "renderRemainingTime(Lcom/vk/music/bottomsheets/track/domain/MusicTrackMenuViewState$MusicTrackMenuRender$RemainingTime;)V", 0));
                yzt0<MusicTrack> yzt0Var2 = aVar.b;
                hd50 hd50Var2 = yc50Var.i1;
                gm50.a.a(yc50Var, yzt0Var2, new wi3(1, hd50Var2 == null ? null : hd50Var2, hd50.class, "renderHeader", "renderHeader(Lcom/vk/dto/music/MusicTrack;)V", 0, 11));
                yzt0<jd50.a.C3117a> yzt0Var3 = aVar.c;
                hd50 hd50Var3 = yc50Var.i1;
                gm50.a.a(yc50Var, yzt0Var3, new ad50(1, hd50Var3 == null ? null : hd50Var3, hd50.class, "renderHeaderActions", "renderHeaderActions(Lcom/vk/music/bottomsheets/track/domain/MusicTrackMenuViewState$MusicTrackMenuRender$MenuHeaderActions;)V", 0));
                yzt0<List<lc50.c>> yzt0Var4 = aVar.d;
                hd50 hd50Var4 = yc50Var.i1;
                gm50.a.a(yc50Var, yzt0Var4, new bd50(1, hd50Var4 == null ? null : hd50Var4, hd50.class, "renderListActions", "renderListActions(Ljava/util/List;)V", 0));
                break;
            case 2:
                break;
            case 3:
                NewsfeedFilteredSourcesFragment newsfeedFilteredSourcesFragment = (NewsfeedFilteredSourcesFragment) obj2;
                List list = (List) obj;
                VkTabLayout vkTabLayout = newsfeedFilteredSourcesFragment.R;
                if (vkTabLayout != null) {
                    vkTabLayout.setVisibility(list.size() > 1 ? 0 : 8);
                }
                yi60 yi60Var = (yi60) newsfeedFilteredSourcesFragment.Y.getValue();
                ArrayList<xer> arrayList = yi60Var.k;
                if (arrayList.size() == list.size()) {
                    int size2 = arrayList.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        if (epx.f(arrayList.get(i5), list.get(i5))) {
                        }
                    }
                    size = list.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        VkTabLayout vkTabLayout2 = newsfeedFilteredSourcesFragment.R;
                        if (vkTabLayout2 != null && (b = vkTabLayout2.b(i6)) != null) {
                            b.n(((xer) list.get(i6)).c);
                        }
                    }
                    break;
                }
                arrayList.clear();
                arrayList.addAll(list);
                yi60Var.notifyDataSetChanged();
                size = list.size();
                while (i6 < size) {
                }
                break;
            case 4:
                cvk.w(j03.g((Context) obj2, (Throwable) obj, R.string.error), false);
                break;
            case 5:
                ((mf70) obj2).f.b((vzi0) obj);
                break;
            case 6:
                break;
            case 7:
                z8a0 z8a0Var = (z8a0) obj2;
                z8a0Var.j.setIsShow(true);
                bwt0.p0(z8a0Var.h, false);
                break;
            case 8:
                com.vk.photos.root.common.b bVar = (com.vk.photos.root.common.b) obj2;
                bVar.b.a(new m7a0.b((List) obj));
                bVar.c.g();
                break;
            case 9:
                ((nma0) obj2).e.vn();
                break;
            case 10:
                dra0.this.a.a(g.a.b);
                break;
            case 11:
                int i7 = PlaylistPlayerVideoView.A;
                ((PlaylistPlayerVideoView) obj2).e();
                break;
            case 12:
                PollAnswer pollAnswer = (PollAnswer) obj;
                List<String> list2 = ((Condition.SimpleWithId.HasWords) ((Condition) obj2)).c;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (String str : list2) {
                        String str2 = pollAnswer.c;
                        if (str2 != null ? drm0.D(str2, str, false) : false) {
                            break;
                        }
                    }
                }
                z = false;
                break;
            case 13:
                wdc0 wdc0Var = (wdc0) obj2;
                wdc0Var.b.invoke((AttachmentType) obj);
                dw20 dw20Var = wdc0Var.c;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                break;
            case 14:
                com.vk.newsfeed.impl.posting.settings.mvi.b bVar2 = (com.vk.newsfeed.impl.posting.settings.mvi.b) obj2;
                BaseBoolIntDto u = ((AccountInfoDto) obj).u();
                if (u != null && u.i() == 0) {
                    i2 = 1;
                }
                bVar2.T(new e.h(-1, Integer.valueOf(i2)));
                break;
            case 15:
                final PostsFromNotificationsFragment postsFromNotificationsFragment = (PostsFromNotificationsFragment) obj2;
                com.vk.mvi.binder.c cVar = (com.vk.mvi.binder.c) obj;
                qcy<Object>[] qcyVarArr = PostsFromNotificationsFragment.p0;
                com.vk.mvi.binder.c.a(cVar, f9t.w(postsFromNotificationsFragment.ho()), new iyp() { // from class: xsna.suc0
                    @Override // xsna.iyp
                    public final void a(pk50 pk50Var) {
                        qcy<Object>[] qcyVarArr2 = PostsFromNotificationsFragment.p0;
                        PostsFromNotificationsFragment postsFromNotificationsFragment2 = PostsFromNotificationsFragment.this;
                        postsFromNotificationsFragment2.eo();
                        quc0.a(postsFromNotificationsFragment2.eo(), postsFromNotificationsFragment2, postsFromNotificationsFragment2.getActivity(), postsFromNotificationsFragment2.Z, (dvc0) pk50Var);
                    }
                });
                com.vk.mvi.binder.c.b(cVar, f9t.F(f9t.z(postsFromNotificationsFragment.ho()), new j5n(20)), new ao90(postsFromNotificationsFragment, z ? 1 : 0));
                break;
            case 16:
                LayoutNode f = itl.f((t2d0) obj2);
                LayoutNode.c cVar2 = LayoutNode.S;
                f.e0(false);
                break;
            case 17:
                ((gzs) obj2).invoke();
                break;
            case 18:
                com.vk.ecomm.market.good.ui.e eVar = (com.vk.ecomm.market.good.ui.e) obj2;
                com.vk.ecomm.market.good.ui.c cVar3 = eVar.l;
                eVar.e(cVar3 != null ? cVar3.f : null, false, eVar.f.getContext());
                break;
            case 19:
                nkd0 nkd0Var = (nkd0) obj2;
                gom0 gom0Var = (gom0) obj;
                gom0.a(gom0Var, nkd0.a.b, new d69(objArr == true ? 1 : 0, i3));
                gom0.a(gom0Var, nkd0.b.b, new uki(i2));
                gom0.a(gom0Var, nkd0.c.b, new whd(4));
                gom0.a(gom0Var, nkd0.d.b, new z2(8));
                gom0.a(gom0Var, nkd0.e.b, new l71(nkd0Var, 7));
                gom0Var.a.add(new scr(new bod(2), new sq(9), new jkg(nkd0Var, 13)));
                break;
            case 20:
                QrScannerUi qrScannerUi = (QrScannerUi) obj2;
                fy2 fy2Var = qrScannerUi.d;
                bm9 bm9Var = qrScannerUi.b;
                StoryCameraParams storyCameraParams = qrScannerUi.r;
                int intValue = ((Integer) obj).intValue();
                if (intValue == 0) {
                    View view = qrScannerUi.m;
                    if (view != null) {
                        bwt0.a(view, false, true, 0L, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    }
                    View view2 = qrScannerUi.j;
                    if (view2 != null) {
                        bwt0.a(view2, true, false, 0L, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                    }
                    QrScannerUi.a aVar2 = qrScannerUi.p;
                    if (aVar2 != null) {
                        aVar2.setPrimaryItem((ViewGroup) qrScannerUi.k, 0, (Object) new QrScannerUi.QrFakeScannerView(qrScannerUi.k.getContext()));
                    }
                    bm9Var.getState().Q = false;
                    CameraUIView cameraUIView = (CameraUIView) fy2Var.b;
                    float f2 = CameraUIView.w1;
                    cameraUIView.y0();
                    TabsRecycler tabs = cameraUIView.getTabs();
                    if (tabs == null || (viewsTabs = tabs.getViewsTabs()) == null || viewsTabs.size() != 1) {
                        View view3 = cameraUIView.L0;
                        if (view3 == null) {
                            view3 = null;
                        }
                        view3.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        View view4 = cameraUIView.L0;
                        bwt0.a(view4 == null ? null : view4, true, true, 0L, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    }
                    StoryCameraParams cameraParams = cameraUIView.getCameraParams();
                    boolean z2 = cameraParams != null ? cameraParams.z : false;
                    StoryCameraParams cameraParams2 = cameraUIView.getCameraParams();
                    cameraUIView.H0(z2, cameraParams2 != null ? cameraParams2.B : false);
                    ShutterButton shutter = cameraUIView.getShutter();
                    if (shutter != null) {
                        shutter.setVisibility(0);
                    }
                    gm9 gm9Var = cameraUIView.B;
                    View photosButtonTop = cameraUIView.getPhotosButtonTop();
                    fm9.a aVar3 = fm9.a;
                    gm9Var.a0(photosButtonTop, true);
                    View photosButtonTop2 = cameraUIView.getPhotosButtonTop();
                    if (photosButtonTop2 != null) {
                        awt0.t(photosButtonTop2, new dn9(cameraUIView, 1));
                    }
                } else if (intValue == 1) {
                    dm9 dm9Var = qrScannerUi.e;
                    ViewStub viewStub = qrScannerUi.l;
                    if ((viewStub != null ? viewStub.getParent() : null) != null) {
                        ViewStub viewStub2 = qrScannerUi.l;
                        qrScannerUi.m = viewStub2 != null ? viewStub2.inflate() : null;
                    }
                    View view5 = qrScannerUi.j;
                    if (view5 != null) {
                        bwt0.a(view5, false, false, 0L, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                    }
                    View view6 = qrScannerUi.m;
                    if (view6 != null) {
                        bwt0.a(view6, true, true, 0L, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    }
                    View view7 = qrScannerUi.m;
                    if (view7 != null && (qRSharingView = (QRSharingView) view7.findViewById(R.id.qr_sharing)) != null) {
                        String f3 = dm9Var.d().d().f();
                        qRSharingView.b = storyCameraParams.b;
                        qRSharingView.c = true;
                        qRSharingView.b("open");
                        qRSharingView.c(f3, dm9Var.a().o().c, true);
                        if (qrScannerUi.p == null) {
                            qrScannerUi.p = new QrScannerUi.a(qRSharingView);
                        }
                        QrScannerUi.a aVar4 = qrScannerUi.p;
                        if (aVar4 != null) {
                            aVar4.setPrimaryItem((ViewGroup) qrScannerUi.k, 0, (Object) qRSharingView);
                        }
                    }
                    bm9Var.getState().Q = true;
                    CameraUIView cameraUIView2 = (CameraUIView) fy2Var.b;
                    gm9 gm9Var2 = cameraUIView2.B;
                    View photosButtonTop3 = cameraUIView2.getPhotosButtonTop();
                    fm9.a aVar5 = fm9.a;
                    gm9Var2.a0(photosButtonTop3, false);
                    StoryCameraParams cameraParams3 = cameraUIView2.getCameraParams();
                    boolean z3 = cameraParams3 != null ? cameraParams3.z : false;
                    StoryCameraParams cameraParams4 = cameraUIView2.getCameraParams();
                    cameraUIView2.H0(z3, cameraParams4 != null ? cameraParams4.B : false);
                    View view8 = cameraUIView2.L0;
                    bwt0.a(view8 == null ? null : view8, false, true, 0L, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    ShutterButton shutter2 = cameraUIView2.getShutter();
                    if (shutter2 != null) {
                        shutter2.setVisibility(4);
                    }
                }
                boolean z4 = intValue == 0;
                b.d a = io.reactivex.rxjava3.processors.b.a("qr_scanner", "action", "switch");
                a.b(z4 ? "qr_scanner" : "my_qr", X3.a.t);
                a.b(storyCameraParams.b, "ref");
                a.e();
                qrScannerUi.c(z4);
                break;
            case 21:
                break;
            case 22:
                ((io.reactivex.rxjava3.core.r) obj2).onNext(obj);
                break;
            case 23:
                krt krtVar = (krt) obj2;
                qn60.c cVar4 = (qn60.c) obj;
                break;
            case 24:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((n6i0) obj2).b.invoke(bool);
                break;
            case 25:
                ((kxi0) obj2).e.onNext(new com.vk.voip.ui.sessionrooms.f((f.a.b) obj, false, false, null, false, false, false, 102));
                break;
            case 26:
                ((lmj0) obj2).a.update(new l65.a("Could not get a signature.", (Throwable) obj));
                break;
            case 27:
                List<StickerItem> list3 = (List) obj;
                i2l0 i2l0Var = ((h2l0) obj2).o;
                ViewGroup viewGroup = i2l0Var.a;
                if (!i2l0Var.h) {
                    View b2 = s3j0.b(viewGroup, R.layout.vkim_stickerbar_container, viewGroup, true);
                    i2l0Var.i = b2;
                    i2l0Var.h = true;
                    int a2 = iah0.a(5);
                    LongtapRecyclerView longtapRecyclerView = (LongtapRecyclerView) b2.findViewById(R.id.stickers_recycler_view);
                    i2l0Var.f = new o8l0(i2l0Var.c, i2l0Var.b);
                    viewGroup.getContext();
                    longtapRecyclerView.setLayoutManager(new LinearLayoutManager(0, false));
                    o8l0 o8l0Var = i2l0Var.f;
                    if (o8l0Var == null) {
                        o8l0Var = null;
                    }
                    longtapRecyclerView.setAdapter(o8l0Var);
                    longtapRecyclerView.addItemDecoration(new j2l0(a2));
                    longtapRecyclerView.setLongtapListener(new k2l0(longtapRecyclerView, i2l0Var));
                }
                if (list3.isEmpty()) {
                    View view9 = i2l0Var.i;
                    bwt0.p0(view9 != null ? view9 : null, false);
                } else {
                    o8l0 o8l0Var2 = i2l0Var.f;
                    if (o8l0Var2 == null) {
                        o8l0Var2 = null;
                    }
                    o8l0Var2.i = list3;
                    List<StickerItem> list4 = list3;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list4, 10));
                    for (StickerItem stickerItem : list4) {
                        arrayList2.add(new d8l0(stickerItem, stickerItem.g.V0() && o8l0Var2.h.A0()));
                    }
                    o8l0Var2.setItems(arrayList2);
                    View view10 = i2l0Var.i;
                    c = d3m.c(view10 == null ? null : view10, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    i2l0Var.e = c;
                }
                break;
            case 28:
                ((com.vk.stickers.settings.g) obj2).a.c.invoke(b.c.b);
                break;
            default:
                jfl0 jfl0Var = (jfl0) obj2;
                jfl0Var.getClass();
                cl40.a(jfl0Var, (MusicHapticEvent) obj);
                break;
        }
        return s3q0.a;
    }
}
