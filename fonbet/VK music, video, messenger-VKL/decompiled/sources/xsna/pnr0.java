package xsna;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.video.offline.di.component.api.VideoCatalogComponent;
import com.vk.ecomm.verifiedseller.impl.screens.verificationstub.VerificationStubFragment;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.video.kidsprofile.restricteduseractions.VideoRestrictedUserActionsComponent;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.WebViewFragment;
import xsna.rhw0;
import xsna.shw0;
import xsna.utj;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class pnr0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pnr0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        yg5 yg5Var;
        yg5 yg5Var2;
        int i = this.b;
        boolean z = false;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = VerificationStubFragment.O;
                return ((BridgeComponent) ((k7m) m7m.f((VerificationStubFragment) obj)).a(fpf0.a(BridgeComponent.class))).p().e();
            case 1:
                dz20 dz20Var = (dz20) obj;
                if (dz20Var != null) {
                    dz20Var.Qc("menu_video_albums_dialog");
                }
                return s3q0.a;
            case 2:
                ((c2s0) obj).d.Ff("video_archival_content");
                return s3q0.a;
            case 3:
                int i3 = VideoCatalogFragment.l0;
                ((VideoCatalogComponent) m7m.d((VideoCatalogFragment) obj).mo408a(fpf0.a(VideoCatalogComponent.class))).getClass();
                return null;
            case 4:
                int i4 = VideoRelatedVideosFragment.n0;
                return ((VideoRestrictedUserActionsComponent) m7m.d((VideoRelatedVideosFragment) obj).a(fpf0.a(VideoRestrictedUserActionsComponent.class))).e2();
            case 5:
                VideoView videoView = (VideoView) obj;
                qcy<Object>[] qcyVarArr = VideoView.T0;
                VideoTextureView videoTextureView = videoView.getViewBinding().c;
                if (videoView.M && (yg5Var = videoView.I) != null && !yg5Var.a() && (yg5Var2 = videoView.I) != null && !yg5Var2.P0()) {
                    z = true;
                }
                videoTextureView.j(new yp1(videoView, 13), new gqt0(1, videoView, VideoView.class, "onResizeListener", "onResizeListener(Lone/video/transform/TransformController$ScaleType;)V", 0), z);
                return s3q0.a;
            case 6:
                ihu0 ihu0Var = (ihu0) obj;
                Context context = ((ggu0) ihu0Var.h.c).b;
                utj.a aVar = new utj.a(gnj.b(context));
                aVar.j(R.string.vk_apps_pip_mode_error);
                aVar.g(R.drawable.vk_icon_error_circle_outline_28);
                aVar.l = Integer.valueOf(e3m.f(R.attr.vk_ui_icon_negative, context));
                aVar.q = 4000L;
                aVar.d(R.string.vk_common_retry, new waf0(ihu0Var, 25));
                utj a = aVar.a();
                bpn0 bpn0Var = g2v.b;
                ((c7k0) (bpn0Var != null ? bpn0Var : null).getValue()).a(a);
                return s3q0.a;
            case 7:
                return new jbw0(((s8w0) obj).a);
            case 8:
                VoipCallServiceFragment voipCallServiceFragment = (VoipCallServiceFragment) obj;
                int i5 = VoipCallServiceFragment.Y;
                rhw0.z zVar = new rhw0.z(shw0.a.a);
                voipCallServiceFragment.getClass();
                xn50.a.c(voipCallServiceFragment, zVar);
                return s3q0.a;
            case 9:
                WebViewFragment webViewFragment = (WebViewFragment) obj;
                int i6 = WebViewFragment.O0;
                String string = webViewFragment.getArguments().getString("url_to_copy");
                if (webViewFragment.t0 && string.indexOf("?") > 0) {
                    string = string.substring(0, string.lastIndexOf("?"));
                }
                ((ClipboardManager) webViewFragment.kn().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(string, string));
                cvk.u(R.string.sharing_toast_link_copied, false);
                return null;
            default:
                return WriteBar.h((WriteBar) obj);
        }
    }
}
