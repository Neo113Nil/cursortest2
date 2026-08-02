package xsna;

import android.content.ComponentCallbacks2;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.vk.auth.main.SignUpRouter;
import com.vk.bridges.di.BridgeComponent;
import com.vk.cameraui.impl.a.b;
import com.vk.channels.api.ChannelEntryPoint;
import com.vk.channels.impl.channel_screen.AppChannelFragment;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.clips.edit.di.ClipEditComponent;
import com.vk.clips.interests.api.di.ClipsInterestsComponent;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridUploadListFragment;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridOwnerClipsListFragment;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.Source;
import com.vk.im.reporters.api.di.ImReportersComponent;
import com.vk.musc.kidsmode.api.di.MusicKidsModeComponent;
import com.vk.newsfeed.impl.fragments.ClipsBottomSheetCommentsFragment;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.albums.presentation.AlbumsFragment;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.stories.design.view.editor.StickerDeleteAreaView;
import com.vk.voip.ui.menu.ui.MainMenuView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.Call;
import xsna.auf;
import xsna.b4;
import xsna.eyd.a;
import xsna.n7b;
import xsna.pin0;
import xsna.qfa0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class h6 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Object obj;
        Object parcelable;
        int i = this.b;
        int i2 = 4;
        r5 = null;
        r5 = null;
        r5 = null;
        String e = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((k6) obj2).a.d(b4.t.a);
                return s3q0.a;
            case 1:
                int i3 = AbstractClipsGridUploadListFragment.i0;
                return ((ClipsUploadSdkUploaderComponent) m7m.d((AbstractClipsGridUploadListFragment) obj2).a(fpf0.a(ClipsUploadSdkUploaderComponent.class))).Zb();
            case 2:
                int i4 = AlbumDetailsFragment.p0;
                return ((AlbumDetailsFragment) obj2).ho().z8();
            case 3:
                AlbumsFragment albumsFragment = (AlbumsFragment) obj2;
                int i5 = AlbumsFragment.j0;
                return (qfa0.j) ((PhotosComponent) albumsFragment.T.getValue()).F4().c(albumsFragment.ho()).e.getValue();
            case 4:
                ((SignUpRouter) ((rv1) obj2).a.b).X0(new pin0.a(true));
                return s3q0.a;
            case 5:
                int i6 = AppChannelFragment.l1;
                return ((ImReportersComponent) m7m.d((AppChannelFragment) obj2).a(fpf0.a(ImReportersComponent.class))).K().m();
            case 6:
                ((fu3) obj2).c(true);
                return s3q0.a;
            case 7:
                int i7 = nh4.n1;
                return ((MusicKidsModeComponent) m7m.d((nh4) obj2).a(fpf0.a(MusicKidsModeComponent.class))).n();
            case 8:
                return (StickerDeleteAreaView) ((View) ((j96) obj2).g.invoke()).findViewById(R.id.stickers_delete_area);
            case 9:
                return (androidx.lifecycle.j) obj2;
            case 10:
                return (MainMenuView) ((ze00) obj2).b.a.invoke();
            case 11:
                com.vk.cameraui.impl.a aVar = (com.vk.cameraui.impl.a) obj2;
                CameraUIView cameraUIView = aVar.b;
                zd9 camera1View = cameraUIView.getCamera1View();
                if (camera1View != null) {
                    camera1View.setOnCameraResultListener(aVar.new b(new y6(aVar, 9)));
                }
                cameraUIView.w();
                cameraUIView.u();
                aVar.T0();
                return s3q0.a;
            case 12:
                float f = CameraUIView.w1;
                ((CameraUIView) obj2).v0();
                return s3q0.a;
            case 13:
                int i8 = ChannelFragment.a1;
                Bundle arguments = ((ChannelFragment) obj2).getArguments();
                if (arguments == null) {
                    return null;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = arguments.getParcelable("entry_point", ChannelEntryPoint.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = arguments.getParcelable("entry_point");
                    obj = (ChannelEntryPoint) (parcelable2 instanceof ChannelEntryPoint ? parcelable2 : null);
                }
                return (ChannelEntryPoint) obj;
            case 14:
                ((r5b) obj2).a.S();
                return s3q0.a;
            case 15:
                ((f8b) obj2).d.invoke(n7b.e.b);
                return s3q0.a;
            case 16:
                int i9 = sgc.n1;
                rgc rgcVar = (rgc) ((sgc) obj2).f1;
                if (rgcVar != null) {
                    rgcVar.z6();
                }
                return s3q0.a;
            case 17:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) obj2;
                int i10 = ClipFeedListFragment.a2;
                v6e v6eVar = (v6e) clipFeedListFragment.m1.getValue();
                boolean g = clipFeedListFragment.vo().g();
                ClipFeedTab Ka = clipFeedListFragment.Ka();
                if ((Ka instanceof ClipFeedTab.CatalogClip.TrendingMusicCatalogClip) || (Ka instanceof ClipFeedTab.CatalogClip.TrendingHashtagCatalogClip)) {
                    e = y8g0.e(R.string.clip_grid_toolbar_title_trend);
                } else if (Ka instanceof ClipFeedTab.ClipsFromShopsSource) {
                    e = y8g0.e(R.string.clips_shops_title);
                } else if (Ka instanceof ClipFeedTab.ClipsFromTrendsSource) {
                    e = y8g0.e(R.string.clip_tab_trends);
                } else if (Ka instanceof ClipFeedTab.NewsMonotheme) {
                    e = ((ClipFeedTab.NewsMonotheme) Ka).c;
                } else if (Ka instanceof ClipFeedTab.SingleClipFromBlock) {
                    int i11 = auf.a.$EnumSwitchMapping$0[((ClipFeedTab.SingleClipFromBlock) Ka).d.ordinal()];
                    if (i11 != 1 && i11 != 2 && i11 != 3) {
                        if (i11 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        e = y8g0.e(R.string.clips_shops_title);
                    }
                }
                return new p7e(v6eVar, g, e, ((l8e) clipFeedListFragment.O0.getValue()).a());
            case 18:
                int i12 = ClipsBottomSheetCommentsFragment.i1;
                return ((BridgeComponent) m7m.d((ClipsBottomSheetCommentsFragment) obj2).a(fpf0.a(BridgeComponent.class))).s();
            case 19:
                eyd eydVar = (eyd) obj2;
                return new twd(eydVar.e, eydVar.b, eydVar.c, eydVar.new a(), false, true);
            case 20:
                qcy<Object>[] qcyVarArr = ClipsGridFragment.H0;
                return (ClipsInterestsComponent) m7m.d((ClipsGridFragment) obj2).a(fpf0.a(ClipsInterestsComponent.class));
            case 21:
                int i13 = ClipsGridOwnerClipsListFragment.o0;
                return ((ClipsConfigViewersComponent) m7m.d((ClipsGridOwnerClipsListFragment) obj2).a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments();
            case 22:
                return ((ClipEditComponent) ((k7m) m7m.f((xre) obj2)).a(fpf0.a(ClipEditComponent.class))).d6();
            case 23:
                return new yod(new sxy(new z420(new y420(((ClipsViewerComponentImpl) obj2).b.getExperiments()))), new u04(2));
            case 24:
                return ((k3g) obj2).getImageFactoryProvider().invoke();
            case 25:
                return (VkImage) ((cxg) obj2).findViewById(R.id.image);
            case 26:
                return ((BridgeComponent) m7m.d(((o1i) obj2).b).a(fpf0.a(BridgeComponent.class))).id();
            case 27:
                com.vk.im.ui.components.contacts.a aVar2 = (com.vk.im.ui.components.contacts.a) obj2;
                com.vk.im.ui.components.contacts.b b1 = aVar2.b1();
                b1.getClass();
                com.vk.im.ui.components.contacts.b.c(new k5h(b1, i2));
                aVar2.e1(Source.CACHE, false);
                return s3q0.a;
            case 28:
                tij tijVar = (tij) obj2;
                tijVar.g1();
                ComponentCallbacks2 h = e3m.h(tijVar.c);
                aeg0 aeg0Var = h instanceof aeg0 ? (aeg0) h : null;
                if (aeg0Var != null) {
                    aeg0Var.yk(tijVar.t);
                }
                gzs<s3q0> gzsVar = tijVar.g;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            default:
                return ((Call) obj2).getCallEventualStatSender();
        }
    }
}
