package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.vk.auth.ui.VkOAuthServiceInfo;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockActionDnDEdit;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.VideoUrlInfo;
import com.vk.libvideo.api.di.VideoNotificationsPermissionComponent;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.screen.VideoFragment;
import com.vk.libvideo.ui.dialog.single.VideoDialog;
import com.vk.messagetemplates.impl.details.TemplateDetailsState;
import com.vk.newsfeed.posting.mediapicker.photovk.albums_list.VkAlbumsFragment;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.superapp.ui.VkRoundedTopFrameLayout;
import com.vk.video.ui.edit.fragments.VideoAlbumEditorFragment;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.l9s0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class icn0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ icn0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Context context;
        WebViewEvent sendOfferwallEvent$lambda$13;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                jcn0 jcn0Var = (jcn0) obj;
                kto0 h6 = jcn0Var.h6();
                Context context2 = jcn0Var.itemView.getContext();
                h6.getClass();
                return dhr0.M() ? context2.getDrawable(R.drawable.vk_icon_verified_dark_48) : context2.getDrawable(R.drawable.vk_icon_verified_light_48);
            case 1:
                ((kq2) obj).g = false;
                return s3q0.a;
            case 2:
                return new TemplateDetailsState((Integer) obj, null, null, false, 14, null);
            case 3:
                return Boolean.valueOf(((UIBlock) obj).i.containsKey(UIBlockActionDnDEdit.class));
            case 4:
                ((mxq0) obj).n.s = null;
                return s3q0.a;
            case 5:
                int i2 = VideoAlbumEditorFragment.l0;
                h3p0.b((VideoAlbumEditorFragment) obj);
                return s3q0.a;
            case 6:
                VideoCatalogRootVh videoCatalogRootVh = (VideoCatalogRootVh) obj;
                View view = videoCatalogRootVh.b0;
                if (view == null || (context = view.getContext()) == null) {
                    return s3q0.a;
                }
                if (videoCatalogRootVh.k0().b()) {
                    l9s0.a.a(context, null);
                } else {
                    videoCatalogRootVh.k0().getClass();
                }
                return s3q0.a;
            case 7:
                return (xwr0) ((xcs0) obj).findViewById(R.id.video_action_complete_view);
            case 8:
                int i3 = VideoDialog.P0;
                ((VideoDialog) obj).yo();
                return s3q0.a;
            case 9:
                int i4 = VideoFragment.c0;
                return ((VideoNotificationsPermissionComponent) m7m.d((VideoFragment) obj).a(fpf0.a(VideoNotificationsPermissionComponent.class))).V();
            case 10:
                fxc0.B().d((VideoFile) obj);
                return s3q0.a;
            case 11:
                com.vk.video.ui.discovery.minimizable.m mVar = (com.vk.video.ui.discovery.minimizable.m) obj;
                return Boolean.valueOf((mVar.r || mVar.x || mVar.v) ? false : true);
            case 12:
                Object v = s200.v(((edt0) obj).a);
                e7s e7sVar = v instanceof e7s ? (e7s) v : null;
                if (e7sVar != null) {
                    e7sVar.a();
                }
                return Boolean.TRUE;
            case 13:
                Boolean bool = ((kkt0) obj).b.b;
                if (epx.f(bool, Boolean.TRUE)) {
                    return MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.CREATE_CLIP_CUT_CROP;
                }
                if (epx.f(bool, Boolean.FALSE)) {
                    return MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.CREATE_CLIP_CUT;
                }
                if (bool == null) {
                    return MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.VIDEO_AS_CLIP;
                }
                throw new NoWhenBranchMatchedException();
            case 14:
                String str = ((VideoUrlInfo) obj).b;
                if (drm0.D(str, ".vkvideo.", false)) {
                    return z23.c("(?:video|live)([-0-9]+)_([0-9]+)", str, "");
                }
                return null;
            case 15:
                qcy<Object>[] qcyVarArr = VideoView.T0;
                return ((View) obj).findViewById(R.id.seek_bar_thumb);
            case 16:
                b5u0 b5u0Var = (b5u0) obj;
                ValueAnimator valueAnimator = b5u0Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                b5u0Var.d = null;
                return s3q0.a;
            case 17:
                ro1 ro1Var = ((VkAlbumsFragment) obj).X;
                if (ro1Var != null) {
                    ro1Var.b(true);
                }
                return s3q0.a;
            case 18:
                GradientDrawable a = ful0.a(0);
                a.setCornerRadius(iah0.a(8));
                ((mmu0) obj).getClass();
                return a;
            case 19:
                return VkOAuthServiceInfo.a((VkOAuthServiceInfo) obj);
            case 20:
                int i5 = VkRoundedTopFrameLayout.c;
                return Integer.valueOf(((VkRoundedTopFrameLayout) obj).getWidth());
            case 21:
                ((com.vk.voip.ui.hint.a) obj).c();
                return s3q0.a;
            case 22:
                return new m3x0(((tnw0) obj).a);
            case 23:
                return Boolean.valueOf(((r4x0) obj).i());
            case 24:
                sendOfferwallEvent$lambda$13 = WebViewAdPlayer.sendOfferwallEvent$lambda$13((OfferwallEvent) obj);
                return sendOfferwallEvent$lambda$13;
            default:
                return new vsu(((knx0) obj).a);
        }
    }

    public /* synthetic */ icn0(mmu0 mmu0Var, Context context) {
        this.b = 18;
        this.c = mmu0Var;
    }
}
