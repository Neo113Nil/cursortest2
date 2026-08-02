package xsna;

import android.graphics.Path;
import com.google.gson.Gson;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListSmallVh;
import com.vk.libvideo.design.view.fullscreen.VideoFullscreenBottomBarView;
import com.vk.libvideo.ui.video2.skippablepart.VideoSkippablePartView;
import com.vk.push.rustore.impl.di.RuStoreComponentImpl;
import com.vk.stories.design.view.avatar.StoryAvatarView;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.toggle.features.SmbAdFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.OKVoipEngine;
import java.util.Calendar;
import xsna.inf0;
import xsna.irt0;
import xsna.xas0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ta50 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ta50(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z = false;
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                SmbAdFeatures smbAdFeatures = SmbAdFeatures.FEATURE_SMB_APP_GALLERY_SEAMLESS_INSTALL;
                smbAdFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(smbAdFeatures));
            case 2:
                OKVoipEngine.L(OKVoipEngine.b, false, 3);
                return s3q0.a;
            case 3:
                return new rru(2);
            case 4:
                return new inf0.a();
            case 5:
                qcy<Object>[] qcyVarArr = RuStoreComponentImpl.f;
                return new cje0(null);
            case 6:
                return new Path();
            case 7:
                int i = StoryAvatarView.G;
                return Boolean.valueOf(com.vk.toggle.d.P());
            case 8:
                return ((StoryViewerComponent) ((k7m) m7m.f(o0m0.b)).a(fpf0.a(StoryViewerComponent.class))).l9();
            case 9:
                return new g3a0();
            case 10:
                return new zzq(false);
            case 11:
                return Calendar.getInstance();
            case 12:
                return s3q0.a;
            case 13:
                o2l.a.getClass();
                return Boolean.valueOf(o2l.b("__dbg_friends_swipe_first_page", false));
            case 14:
                u6g0 u6g0Var = znk0.n;
                return (Gson) (u6g0Var != null ? u6g0Var : null).f.getValue();
            case 15:
                return xas0.a.a();
            case 16:
                int i2 = VideoFullscreenBottomBarView.l;
                return Boolean.valueOf(com.vk.toggle.d.w().a);
            case 17:
                Object obj = VideoItemListSmallVh.c0;
                return new ucg0();
            case 18:
                if (fxc0.B().J().A()) {
                    return new kls0();
                }
                return null;
            case 19:
                int i3 = VideoSkippablePartView.C;
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_NEW_SEEKBAR;
                videoFeatures.getClass();
                com.vk.toggle.b bVar = com.vk.toggle.b.A;
                if (bVar.a(videoFeatures)) {
                    VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_NEW_SEEK_PREVIEW;
                    videoFeatures2.getClass();
                    if (bVar.a(videoFeatures2)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 20:
                return irt0.c.a;
            case 21:
                return new a480();
            case 22:
                return tlo0.Companion.serializer();
            default:
                return new q73(new ykg());
        }
    }
}
