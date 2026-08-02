package xsna;

import android.app.Activity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesSearchTopBarVh;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.a;
import com.vk.channels.impl.channel_screen.AppChannelFragment;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.clips.interests.impl.ui.ClipsInterestsFragment;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerFragment;
import com.vk.clips.playlists.ui.picker.a;
import com.vk.clips.precache.api.di.ClipsPrecacheComponent;
import com.vk.clips.sdk.screens.feed.decorator.api.di.ClipsDecorationComponent;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.decoration.ClipsDecorationKey;
import com.vk.clips.upload.edit.api.ClipsUploadSdkEditComponent;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment.d;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment.i;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridOwnerClipsListFragment;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.product_list.di.ProductListComponent;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.fragments.ClipsBottomSheetCommentsFragment;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.albums.presentation.AlbumsFragment;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.jvm.internal.PropertyReference0Impl;
import xsna.kpe;
import xsna.q7e;
import xsna.xn50;
import xsna.ye0;
import xsna.ye0.a.C4096a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class we0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ we0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        tih0 tih0Var;
        ClipsDecorationKey clipsDecorationKey;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((ye0.a) obj).new C4096a();
            case 1:
                int i2 = AlbumDetailsFragment.p0;
                return ((AlbumDetailsFragment) obj).ho().G6();
            case 2:
                int i3 = AlbumsFragment.j0;
                return ((NewsFeedComponent) m7m.d((AlbumsFragment) obj).a(fpf0.a(NewsFeedComponent.class))).G2();
            case 3:
                return (ArrayList) obj;
            case 4:
                AppChannelFragment appChannelFragment = (AppChannelFragment) obj;
                int i4 = AppChannelFragment.l1;
                return new wxa(new lxa(appChannelFragment.mo(), appChannelFragment.V), appChannelFragment.no(), new dy2(), appChannelFragment.V, appChannelFragment.p0);
            case 5:
                ((ee3) obj).e.invoke();
                return s3q0.a;
            case 6:
                ((fu3) obj).c(false);
                return s3q0.a;
            case 7:
                j96 j96Var = (j96) obj;
                return new x0m0((Activity) j96Var.c.invoke(), j96Var.getStickersDrawingView(), (u76) j96Var.e.invoke(), (b96) j96Var.f.invoke(), j96Var.d.b);
            case 8:
                return (b2t) obj;
            case 9:
                ((d98) obj).g.X(4);
                return s3q0.a;
            case 10:
                dt8 dt8Var = (dt8) obj;
                u750 u750Var = dt8Var.o;
                String str = dt8Var.n;
                u750Var.D(str, dt8Var.r, false);
                u750Var.X(str, CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
                return s3q0.a;
            case 11:
                float f = CameraUIView.w1;
                ((CameraUIView) obj).M(true);
                return s3q0.a;
            case 12:
                return (StoryViewerRouter) ((PropertyReference0Impl) obj).get();
            case 13:
                ChannelFragment channelFragment = (ChannelFragment) obj;
                int i5 = ChannelFragment.a1;
                return new ya20(((ProductListComponent) m7m.d(channelFragment).mo408a(fpf0.a(ProductListComponent.class))).a(), ((MarketComponent) m7m.d(channelFragment).a(fpf0.a(MarketComponent.class))).Ob());
            case 14:
                xyb xybVar = (xyb) obj;
                io.reactivex.rxjava3.disposables.c cVar = xybVar.w;
                if (cVar != null) {
                    cVar.dispose();
                }
                xybVar.w = null;
                return s3q0.a;
            case 15:
                return aqc.a(((qpc) obj).getCurrentState());
            case 16:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) obj;
                int i6 = ClipFeedListFragment.a2;
                v6e v6eVar = (v6e) clipFeedListFragment.m1.getValue();
                oie A2 = ((ClipsPrecacheComponent) clipFeedListFragment.Z.getValue()).A2();
                zof Eo = clipFeedListFragment.Eo();
                ClipFeedTab Ka = clipFeedListFragment.Ka();
                ClipFeedTab.SingleClipWithDecoration singleClipWithDecoration = Ka instanceof ClipFeedTab.SingleClipWithDecoration ? (ClipFeedTab.SingleClipWithDecoration) Ka : null;
                i4r i4rVar = new i4r(v6eVar, A2, Eo, (singleClipWithDecoration == null || (clipsDecorationKey = singleClipWithDecoration.e) == null) ? kpe.a.a.getSTUB() : ((ClipsDecorationComponent) clipFeedListFragment.q1.getValue()).j8(clipsDecorationKey), (ime) clipFeedListFragment.y0.getValue(), clipFeedListFragment.qo().Ef());
                hwc hwcVar = (hwc) clipFeedListFragment.s0.getValue();
                nwy nwyVar = clipFeedListFragment.qo().b0;
                qcy<Object>[] qcyVarArr = ClipsViewerComponentImpl.o0;
                qcy<Object> qcyVar = qcyVarArr[40];
                q7e.c cVar2 = new q7e.c(hwcVar, (vjx) nwyVar.c(), clipFeedListFragment.qo().Hf());
                ckf0 ckf0Var = ckf0.a;
                asu0.a.getClass();
                q7e.e eVar = new q7e.e(new bkw(), asu0.o());
                int i7 = 6;
                q7e.a aVar = new q7e.a((ki0) clipFeedListFragment.k0.getValue(), (z5e) clipFeedListFragment.t0.getValue(), clipFeedListFragment.lo(), clipFeedListFragment.Ao(), new te0(i7));
                q7e.d dVar = new q7e.d((fqe) clipFeedListFragment.e0.getValue());
                q7e.b bVar = new q7e.b(new ClipFeedListFragment.h(), clipFeedListFragment.y1, new b1r(clipFeedListFragment.no().p(), clipFeedListFragment.no().F()));
                ClipFeedListFragment.d dVar2 = clipFeedListFragment.new d();
                uxt0 uxt0Var = (uxt0) clipFeedListFragment.b1.getValue();
                nwy nwyVar2 = clipFeedListFragment.qo().t;
                qcy<Object> qcyVar2 = qcyVarArr[6];
                aje ajeVar = (aje) nwyVar2.c();
                o40 o40Var = new o40(clipFeedListFragment, i7);
                p8e p8eVar = (p8e) clipFeedListFragment.N0.getValue();
                ibr0 pe = clipFeedListFragment.qo().pe();
                c9e c9eVar = new c9e();
                zof Eo2 = clipFeedListFragment.Eo();
                fbq fbqVar = (fbq) clipFeedListFragment.o1.getValue();
                e25 e25Var = new e25((b25) clipFeedListFragment.Q1.getValue());
                bpn0 bpn0Var = new bpn0(new z34(4));
                ClipFeedListFragment.i iVar = clipFeedListFragment.new i();
                w8l w8lVar = (w8l) clipFeedListFragment.p1.getValue();
                if (clipFeedListFragment.Eo().Q() || clipFeedListFragment.Eo().Z()) {
                    nwy nwyVar3 = clipFeedListFragment.qo().J;
                    qcy<Object> qcyVar3 = qcyVarArr[22];
                    tih0Var = (tih0) nwyVar3.c();
                } else {
                    tih0Var = null;
                }
                return new q7e(dVar2, i4rVar, uxt0Var, ajeVar, new xxc(clipFeedListFragment, 0), o40Var, p8eVar, pe, c9eVar, Eo2, fbqVar, e25Var, bpn0Var, iVar, w8lVar, bVar, cVar2, aVar, eVar, dVar, tih0Var, (v5e) clipFeedListFragment.z0.getValue());
            case 17:
                int i8 = ClipsBottomSheetCommentsFragment.i1;
                return ((AttachmentMappersComponent) m7m.d((ClipsBottomSheetCommentsFragment) obj).mo408a(fpf0.a(AttachmentMappersComponent.class))).f3();
            case 18:
                return ((ClipsUploadSdkEditComponent) obj).F5();
            case 19:
                eyd eydVar = (eyd) obj;
                hyd hydVar = eydVar.f;
                return new ezd(hydVar == null ? null : hydVar, eydVar.e.g, true);
            case 20:
                qcy<Object>[] qcyVarArr2 = ClipsGridFragment.H0;
                return ((ClipsViewerComponent) ((ClipsGridFragment) obj).a0.getValue()).gb();
            case 21:
                int i9 = ClipsGridOwnerClipsListFragment.o0;
                return (ClipsPlaylistsComponent) m7m.d((ClipsGridOwnerClipsListFragment) obj).mo408a(fpf0.a(ClipsPlaylistsComponent.class));
            case 22:
                int i10 = ClipsInterestsFragment.Y;
                return Integer.valueOf(((ClipsInterestsFragment.b) obj).f().getNextButtonArea());
            case 23:
                ClipsPlaylistPickerFragment clipsPlaylistPickerFragment = (ClipsPlaylistPickerFragment) obj;
                int i11 = ClipsPlaylistPickerFragment.V;
                clipsPlaylistPickerFragment.getClass();
                xn50.a.c(clipsPlaylistPickerFragment, a.C0631a.b);
                return s3q0.a;
            case 24:
                return ((ClipsConfigAuthorsComponent) ((k7m) m7m.f((xre) obj)).a(fpf0.a(ClipsConfigAuthorsComponent.class))).getExperiments();
            case 25:
                return new wdd(((ClipsViewerComponentImpl) obj).b.getExperiments());
            case 26:
                return Boolean.valueOf(p8l.b.a() && !((Boolean) ((pzf) obj).c.getValue()).booleanValue());
            case 27:
                return ((k3g) obj).getCoroutineScopeProvider().invoke();
            case 28:
                ((CommunitiesSearchTopBarVh) obj).b.invoke(a.d.a);
                return s3q0.a;
            default:
                return (VkSimpleButton) ((cxg) obj).findViewById(R.id.open_checklist_button);
        }
    }
}
