package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.GestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.di.BridgeComponent;
import com.vk.camera.editor.stories.api.di.StoryEditorComponent;
import com.vk.clips.coauthors.di.ClipsCoauthorsComponent;
import com.vk.clips.design.view.component.button.ClipActionButton;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.clips.precache.api.di.ClipsPrecacheComponent;
import com.vk.clips.sdk.shared.api.utils.ClipFeedScreenType;
import com.vk.clips.upload.vk.ui.api.ClipsUploadScreenStaticConfig;
import com.vk.clips.upload.vk.ui.impl.ClipsUploadUiVkComponentBase;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.di.ClipsViewersSdkComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridLikedClipsListFragment;
import com.vk.clips.viewer.impl.utils.performance.ClipsScreenPerformanceReporter;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.ecomm.onlinebooking.impl.masters.presentation.BookingMastersScreenFragmentMvi2;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.common.recycler.holders.attachments.BaseVideoAutoPlayHolderUiDtoBindDelegate;
import com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.photos.ui.album_list.AlbumsListFragment;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.video.ui.upload.impl.publish.presentation.author.fragment.AuthorModalInternalComponent;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashSet;
import ru.ok.android.webrtc.Call;
import xsna.b4;
import xsna.nzl;
import xsna.qvq;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class s4 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r13v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Parcelable parcelable;
        Object parcelable2;
        int i;
        int i2 = this.b;
        int i3 = 0;
        Object obj = this.c;
        switch (i2) {
            case 0:
                ((c4) obj).d(b4.i.a);
                return s3q0.a;
            case 1:
                z21 z21Var = (z21) obj;
                return new GestureDetector(z21Var.m.getContext(), z21Var.q);
            case 2:
                Context context = ((com.vk.photos.root.albumdetails.presentation.c) obj).b;
                HashSet hashSet = iah0.a;
                return Integer.valueOf((fnj.c(context) || iah0.s(context)) ? 3 : 6);
            case 3:
                int i4 = AlbumsListFragment.a0;
                return (PhotosComponent) m7m.d((AlbumsListFragment) obj).a(fpf0.a(PhotosComponent.class));
            case 4:
                return ((c12) obj).b();
            case 5:
                return ((mui0) obj).d();
            case 6:
                return vtk0.a(Boolean.valueOf(((dn4) obj).b()));
            case 7:
                nwy nwyVar = ((AuthorModalInternalComponent) obj).d;
                qcy<Object> qcyVar = AuthorModalInternalComponent.j[0];
                return ((g7s0) nwyVar.c()).J();
            case 8:
                return new z16(((r16) obj).a.getContext(), false);
            case 9:
                return Boolean.valueOf(((r46) obj).d.r().h.I().a);
            case 10:
                y440 y440Var = (y440) obj;
                return new jpr0(y440Var, y440Var.getRequirePresenter());
            case 11:
                return ((NewsFeedComponent) ((k7m) m7m.c(((BaseVideoAutoPlayHolderUiDtoBindDelegate) obj).e)).a(fpf0.a(NewsFeedComponent.class))).ib();
            case 12:
                qcy<Object>[] qcyVarArr = BookingMastersScreenFragmentMvi2.S;
                Bundle requireArguments = ((BookingMastersScreenFragmentMvi2) obj).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = requireArguments.getParcelable("initParams", BookingScreenParams.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    ?? parcelable3 = requireArguments.getParcelable("initParams");
                    parcelable = (BookingScreenParams) (parcelable3 instanceof BookingScreenParams ? parcelable3 : null);
                }
                if (parcelable != null) {
                    return (BookingScreenParams) parcelable;
                }
                throw new IllegalStateException("Required value was null.");
            case 13:
                BottomSheetCommentsFragment bottomSheetCommentsFragment = (BottomSheetCommentsFragment) obj;
                nzl.a aVar = BottomSheetCommentsFragment.f1;
                k6s0 Y4 = bottomSheetCommentsFragment.Ro().Y4();
                if (Y4 != null) {
                    Y4.d();
                }
                RecyclerPaginatedView recyclerPaginatedView = bottomSheetCommentsFragment.W;
                if (recyclerPaginatedView != null) {
                    ModalBottomSheetBehavior.H(recyclerPaginatedView).O(5);
                }
                return s3q0.a;
            case 14:
                return ((NewsFeedComponent) ((k7m) m7m.f((ds8) obj)).a(fpf0.a(NewsFeedComponent.class))).w();
            case 15:
                return ((Call) obj).i();
            case 16:
                CameraUIView cameraUIView = (CameraUIView) obj;
                float f = CameraUIView.w1;
                float G = cameraUIView.G(cameraUIView.Q(false));
                FrameLayout frameLayout = cameraUIView.z0;
                if (frameLayout != null) {
                    f4m.q((int) G, frameLayout);
                }
                return s3q0.a;
            case 17:
                return ((StoryEditorComponent) ((k7m) m7m.f((gta) obj)).a(fpf0.a(StoryEditorComponent.class))).G3();
            case 18:
                ChatFragment chatFragment = (ChatFragment) obj;
                com.vk.im.ui.components.msg_list.a aVar2 = chatFragment.H0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                View view = aVar2.g;
                if (view == null) {
                    return null;
                }
                Rect C = bwt0.C(view);
                int i5 = C.top;
                b26 b26Var = chatFragment.L0;
                C.top = (b26Var != null ? b26Var : null).e() + i5;
                return C;
            case 19:
                uwb uwbVar = (uwb) obj;
                if (!uwbVar.Z0()) {
                    uwbVar.X0();
                }
                return s3q0.a;
            case 20:
                Drawable drawable = ((ClipActionButton) obj).h.getDrawable(0);
                if (drawable instanceof GradientDrawable) {
                    return (GradientDrawable) drawable;
                }
                return null;
            case 21:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) obj;
                ?? r1 = clipFeedListFragment.t0;
                int i6 = ClipFeedListFragment.a2;
                pb pbVar = new pb(clipFeedListFragment, 7);
                if (((ClipFeedScreenType) clipFeedListFragment.n0.getValue()).i() && !clipFeedListFragment.vo().h()) {
                    Context requireContext = clipFeedListFragment.requireContext();
                    HashSet hashSet2 = iah0.a;
                    if (!fnj.d(requireContext)) {
                        i = ((Number) clipFeedListFragment.o0.getValue()).intValue();
                        BridgeComponent no = clipFeedListFragment.no();
                        lyc lycVar = new lyc(clipFeedListFragment.Ka(), ((z5e) r1.getValue()).a());
                        hme hmeVar = (hme) clipFeedListFragment.x0.getValue();
                        gxp0 gxp0Var = clipFeedListFragment.y1;
                        yux yuxVar = clipFeedListFragment.w1;
                        yux yuxVar2 = clipFeedListFragment.x1;
                        yjc Wd = ((StoryViewerComponent) m7m.d(clipFeedListFragment).a(fpf0.a(StoryViewerComponent.class))).Wd();
                        hfq hfqVar = (hfq) clipFeedListFragment.r0.getValue();
                        ClipsViewerComponentImpl qo = clipFeedListFragment.qo();
                        ClipsViewersSdkComponentImpl clipsViewersSdkComponentImpl = (ClipsViewersSdkComponentImpl) clipFeedListFragment.V.getValue();
                        pi0 pi0Var = new pi0(clipFeedListFragment, 10);
                        zof Eo = clipFeedListFragment.Eo();
                        njd njdVar = (njd) clipFeedListFragment.n1.getValue();
                        RecyclerView.u uVar = (RecyclerView.u) clipFeedListFragment.T0.getValue();
                        sz00 sz00Var = (sz00) clipFeedListFragment.h0.getValue();
                        ntd0 ntd0Var = (ntd0) clipFeedListFragment.i0.getValue();
                        ClipsScreenPerformanceReporter Ao = clipFeedListFragment.Ao();
                        pke pkeVar = (pke) clipFeedListFragment.Z0.getValue();
                        pke pkeVar2 = (pke) clipFeedListFragment.a1.getValue();
                        nwy nwyVar2 = clipFeedListFragment.qo().c0;
                        qcy<Object> qcyVar2 = ClipsViewerComponentImpl.o0[41];
                        int i7 = 0;
                        return new uxt0(new defpackage.h(clipFeedListFragment, 14), pbVar, i, clipFeedListFragment, clipFeedListFragment, lycVar, no, clipFeedListFragment, hmeVar, new kxc(clipFeedListFragment, i3), gxp0Var, yuxVar, yuxVar2, Wd, hfqVar, qo, clipsViewersSdkComponentImpl, (ki0) clipFeedListFragment.k0.getValue(), pi0Var, Eo, new w8(clipFeedListFragment, 21), njdVar, uVar, new e5(clipFeedListFragment, 25), sz00Var, ntd0Var, Ao, pkeVar, pkeVar2, (enf) nwyVar2.c(), new lxc(clipFeedListFragment, i7), new mxc(clipFeedListFragment, i7), new nxc(clipFeedListFragment, i7), new h5(clipFeedListFragment, 26), new com.vk.movika.sdk.base.observable.p(clipFeedListFragment, 22), (s16) clipFeedListFragment.J0.getValue(), (p16) clipFeedListFragment.K0.getValue(), (p8e) clipFeedListFragment.N0.getValue(), (z5e) r1.getValue(), clipFeedListFragment.lo(), ((ClipsPrecacheComponent) clipFeedListFragment.Z.getValue()).W1(), (v5e) clipFeedListFragment.z0.getValue());
                    }
                }
                i = 0;
                BridgeComponent no2 = clipFeedListFragment.no();
                lyc lycVar2 = new lyc(clipFeedListFragment.Ka(), ((z5e) r1.getValue()).a());
                hme hmeVar2 = (hme) clipFeedListFragment.x0.getValue();
                gxp0 gxp0Var2 = clipFeedListFragment.y1;
                yux yuxVar3 = clipFeedListFragment.w1;
                yux yuxVar22 = clipFeedListFragment.x1;
                yjc Wd2 = ((StoryViewerComponent) m7m.d(clipFeedListFragment).a(fpf0.a(StoryViewerComponent.class))).Wd();
                hfq hfqVar2 = (hfq) clipFeedListFragment.r0.getValue();
                ClipsViewerComponentImpl qo2 = clipFeedListFragment.qo();
                ClipsViewersSdkComponentImpl clipsViewersSdkComponentImpl2 = (ClipsViewersSdkComponentImpl) clipFeedListFragment.V.getValue();
                pi0 pi0Var2 = new pi0(clipFeedListFragment, 10);
                zof Eo2 = clipFeedListFragment.Eo();
                njd njdVar2 = (njd) clipFeedListFragment.n1.getValue();
                RecyclerView.u uVar2 = (RecyclerView.u) clipFeedListFragment.T0.getValue();
                sz00 sz00Var2 = (sz00) clipFeedListFragment.h0.getValue();
                ntd0 ntd0Var2 = (ntd0) clipFeedListFragment.i0.getValue();
                ClipsScreenPerformanceReporter Ao2 = clipFeedListFragment.Ao();
                pke pkeVar3 = (pke) clipFeedListFragment.Z0.getValue();
                pke pkeVar22 = (pke) clipFeedListFragment.a1.getValue();
                nwy nwyVar22 = clipFeedListFragment.qo().c0;
                qcy<Object> qcyVar22 = ClipsViewerComponentImpl.o0[41];
                int i72 = 0;
                return new uxt0(new defpackage.h(clipFeedListFragment, 14), pbVar, i, clipFeedListFragment, clipFeedListFragment, lycVar2, no2, clipFeedListFragment, hmeVar2, new kxc(clipFeedListFragment, i3), gxp0Var2, yuxVar3, yuxVar22, Wd2, hfqVar2, qo2, clipsViewersSdkComponentImpl2, (ki0) clipFeedListFragment.k0.getValue(), pi0Var2, Eo2, new w8(clipFeedListFragment, 21), njdVar2, uVar2, new e5(clipFeedListFragment, 25), sz00Var2, ntd0Var2, Ao2, pkeVar3, pkeVar22, (enf) nwyVar22.c(), new lxc(clipFeedListFragment, i72), new mxc(clipFeedListFragment, i72), new nxc(clipFeedListFragment, i72), new h5(clipFeedListFragment, 26), new com.vk.movika.sdk.base.observable.p(clipFeedListFragment, 22), (s16) clipFeedListFragment.J0.getValue(), (p16) clipFeedListFragment.K0.getValue(), (p8e) clipFeedListFragment.N0.getValue(), (z5e) r1.getValue(), clipFeedListFragment.lo(), ((ClipsPrecacheComponent) clipFeedListFragment.Z.getValue()).W1(), (v5e) clipFeedListFragment.z0.getValue());
            case 22:
                View findViewById = ((q8d) obj).b().findViewById(R.id.video_single_clip_bottom_container);
                if (findViewById == null) {
                    return null;
                }
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{n8g.l(-16777216, 0), n8g.l(-16777216, 22), n8g.l(-16777216, 48), n8g.l(-16777216, 72), n8g.l(-16777216, 96), n8g.l(-16777216, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), n8g.l(-16777216, 144), n8g.l(-16777216, 168), n8g.l(-16777216, 188), n8g.l(-16777216, 206), n8g.l(-16777216, 224), n8g.l(-16777216, 236), n8g.l(-16777216, 246), n8g.l(-16777216, 252), n8g.l(-16777216, 255)});
                gradientDrawable.setAlpha(100);
                gradientDrawable.setCornerRadius(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                findViewById.setBackground(gradientDrawable);
                return findViewById;
            case 23:
                ((s7e) obj).getFeature().a(qvq.n.b);
                return s3q0.a;
            case 24:
                int i8 = ClipsGridLikedClipsListFragment.i0;
                return (ClipsPlaylistsComponent) m7m.d((ClipsGridLikedClipsListFragment) obj).mo408a(fpf0.a(ClipsPlaylistsComponent.class));
            case 25:
                m8f m8fVar = (m8f) obj;
                m8fVar.u7();
                m8fVar.d++;
                return s3q0.a;
            case 26:
                xhf xhfVar = (xhf) obj;
                return new cbe0(xhfVar.i, xhfVar.f, xhfVar.b);
            case 27:
                nwy nwyVar3 = ((ClipsUploadUiVkComponentBase) obj).a;
                qcy<Object> qcyVar3 = ClipsUploadUiVkComponentBase.d[0];
                return new tkf((ClipsUploadScreenStaticConfig) nwyVar3.c());
            case 28:
                int i9 = ClipsWrapperFragment.Q0;
                return (ClipsViewerComponentImpl) m7m.d((ClipsWrapperFragment) obj).a(fpf0.a(ClipsViewerComponent.class));
            default:
                return (ClipsCoauthorsComponent) ((k7m) m7m.f((nyf) obj)).mo408a(fpf0.a(ClipsCoauthorsComponent.class));
        }
    }
}
