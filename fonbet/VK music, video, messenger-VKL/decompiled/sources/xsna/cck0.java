package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PowerManager;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.catalog.mvi.section.di.CatalogInteractorComponent;
import com.vk.catalog2.common.ui.mvp.holder.sticker.StickerCatalogRootVh;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.di.scope.FeatureScopesKt$createFeatureScope$scope$2;
import com.vk.di.scope.SharedScope;
import com.vk.ecomm.moderation.api.di.ModerationComponent;
import com.vk.ecomm.onlinebooking.api.router.di.OnlineBookingComponent;
import com.vk.im.ui.views.RichEditText;
import com.vk.libvideo.design.view.error.VideoErrorView;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.stickers.keyboard.StickersView;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.upload.impl.videoviewer.presentation.fragment.VideoViewerArguments;
import com.vk.video.ui.upload.impl.videoviewer.presentation.fragment.VideoViewerFragment;
import com.vk.video.ui.upload.impl.videoviewer.presentation.fragment.VideoViewerFragmentInternalComponent;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import xsna.bcp0;
import xsna.c9p0;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class cck0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cck0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        AppCompatActivity appCompatActivity;
        boolean z;
        Parcelable parcelable;
        Object parcelable2;
        int i = this.b;
        int i2 = 14;
        Object obj = this.c;
        switch (i) {
            case 0:
                eck0 eck0Var = (eck0) obj;
                eck0Var.r().d(eck0Var.d);
                return s3q0.a;
            case 1:
                return new p8u0(((pjk0) obj).b, false, 14);
            case 2:
                return Boolean.valueOf(((StickerCatalogRootVh) obj).m.b.b.c(false));
            case 3:
                return (spl0) ((sbl0) obj).k.invoke();
            case 4:
                return Integer.valueOf(StickersView.b((StickersView) obj));
            case 5:
                return ((OnlineBookingComponent) m7m.a(((ddm0) obj).f).a(fpf0.a(OnlineBookingComponent.class))).M4();
            case 6:
                int i3 = SuperAppFragment.o0;
                return ((ModerationComponent) m7m.d((SuperAppFragment) obj).mo408a(fpf0.a(ModerationComponent.class))).pa();
            case 7:
                ((izs) ((zak0) ((c9p0.a) obj).b).getValue()).invoke(new sx40.a.d(PlayerContext.TOP));
                return s3q0.a;
            case 8:
                bcp0.a aVar = bcp0.w;
                return ((VkClientMultiAccountComponent) m7m.d((bcp0) obj).a(fpf0.a(VkClientMultiAccountComponent.class))).a();
            case 9:
                gqe0 gqe0Var = new gqe0((Bundle) obj, i2);
                c63 c63Var = c63.a;
                Context b = c63.b();
                if (b != null) {
                    while (true) {
                        z = b instanceof AppCompatActivity;
                        if (!z && (b instanceof ContextWrapper)) {
                            b = ((ContextWrapper) b).getBaseContext();
                        }
                    }
                    appCompatActivity = (AppCompatActivity) (z ? (Activity) b : null);
                } else {
                    appCompatActivity = null;
                }
                Object v = appCompatActivity != null ? s200.v(appCompatActivity) : null;
                if (appCompatActivity == null || v == null || !appCompatActivity.getLifecycle().getCurrentState().a(Lifecycle.State.RESUMED)) {
                    c63 c63Var2 = c63.a;
                    c63.a(new dxp0(gqe0Var));
                } else {
                    gqe0Var.invoke(v);
                }
                return s3q0.a;
            case 10:
                ((g7q0) obj).t(false);
                return s3q0.a;
            case 11:
                ((ioq0) obj).w.b();
                return s3q0.a;
            case 12:
                return ((InfoBridgeComponent) ((k7m) m7m.f((lsq0) obj)).a(fpf0.a(InfoBridgeComponent.class))).t().b();
            case 13:
                int i4 = VideoEditTimelineView.H;
                return (VkImageSimple) ((VideoEditTimelineView) obj).findViewById(R.id.undo_btn);
            case 14:
                int i5 = VideoErrorView.g;
                return (VkButton) ((VideoErrorView) obj).findViewById(R.id.retry);
            case 15:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj;
                int i6 = VideoMinimizableDiscoveryFragment.p1;
                return new coj0(new oqh0(videoMinimizableDiscoveryFragment, 15), new ghn0(videoMinimizableDiscoveryFragment, 11), new pai(4));
            case 16:
                int i7 = VideoProfileFragmentOld.p0;
                return ((CatalogInteractorComponent) m7m.d((VideoProfileFragmentOld) obj).a(fpf0.a(CatalogInteractorComponent.class))).z0();
            case 17:
                qcy<Object>[] qcyVarArr = VideoView.T0;
                return (PowerManager) ((VideoView) obj).getContext().getSystemService("power");
            case 18:
                VideoViewerFragment videoViewerFragment = (VideoViewerFragment) obj;
                qcy<Object>[] qcyVarArr2 = VideoViewerFragment.P;
                Bundle requireArguments = videoViewerFragment.requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = requireArguments.getParcelable("arguments", VideoViewerArguments.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Object parcelable3 = requireArguments.getParcelable("arguments");
                    parcelable = (VideoViewerArguments) (parcelable3 instanceof VideoViewerArguments ? parcelable3 : null);
                }
                nrt0 nrt0Var = new nrt0((VideoViewerArguments) parcelable);
                l7m d = m7m.d(videoViewerFragment);
                VideoViewerFragmentInternalComponent.e.getClass();
                return (VideoViewerFragmentInternalComponent) d.d(new FeatureScopesKt$createFeatureScope$scope$2(SharedScope.a, nrt0Var, fpf0.a(VideoViewerFragmentInternalComponent.class), new i60(13))).a(fpf0.a(VideoViewerFragmentInternalComponent.class));
            case 19:
                ((ihu0) obj).a.d.t(true);
                return s3q0.a;
            case 20:
                ((uxv0) obj).e("cancel", null);
                return s3q0.a;
            case 21:
                return ((hgw0) obj).a().findViewById(R.id.call_by_link_media_setting_save_button);
            case 22:
                VkButton vkButton = (VkButton) ((sow0) obj).d().findViewById(R.id.call_group_selector_error_state_retry_button);
                vkButton.setMode(VkButton.Mode.Tertiary);
                return vkButton;
            case 23:
                return (TextView) ((View) ((uxw0) obj).e.getValue()).findViewById(R.id.call_by_link_media_setting_disabled_permanent_view);
            default:
                int i8 = WriteBar.h0;
                return (RichEditText) ((WriteBar) obj).findViewById(R.id.writebar_edit);
        }
    }
}
