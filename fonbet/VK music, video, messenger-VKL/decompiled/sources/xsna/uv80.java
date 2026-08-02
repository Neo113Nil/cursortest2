package xsna;

import android.graphics.Path;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.core.view.components.formitem.VkTextArea;
import com.vk.libvideo.embedded_players.ui.fragments.VideoEmbedFragment;
import com.vk.log.L;
import com.vk.profile.user.impl.di.UserProfileParamsComponentImpl;
import com.vk.resetcounters.impl.di.ResetCountersComponentImpl;
import com.vk.toggle.features.ContentFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.smartcrop.impl.presentation.fragment.SmartCropFragmentInternalComponent;
import com.vk.voip.VoipService;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class uv80 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ uv80(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new iv80();
            case 1:
                return new b490();
            case 2:
                return s3q0.a;
            case 3:
                qof0.v.getClass();
                return null;
            case 4:
                qcy<Object>[] qcyVarArr = ResetCountersComponentImpl.d;
                return new k9g0();
            case 5:
                return new Path();
            case 6:
                SmartCropFragmentInternalComponent.a aVar = SmartCropFragmentInternalComponent.g;
                bpn0 bpn0Var = fxc0.a;
                return (g7s0) (bpn0Var != null ? bpn0Var : null).getValue();
            case 7:
                return s3q0.a;
            case 8:
                sd9 sd9Var = new sd9();
                new ReentrantReadWriteLock();
                new ArrayList();
                return sd9Var;
            case 9:
                ContentFeatures contentFeatures = ContentFeatures.STORY_VIEWER_SKIP_PREVIEW;
                contentFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(contentFeatures));
            case 10:
                return "createFromAppendFile: append file is empty";
            case 11:
                qcy<Object>[] qcyVarArr2 = UserProfileParamsComponentImpl.p;
                t6g0 t6g0Var = t6g0.b;
                return t6g0.c();
            case 12:
                int i = VideoCatalogRootVh.M0;
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_SPLASH_SCREEN_REDESIGN;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 13:
                int i2 = VideoEmbedFragment.q0;
                return s3q0.a;
            case 14:
                return new a390();
            case 15:
                return new ucg0();
            case 16:
                return Executors.newFixedThreadPool(32, new heu0());
            case 17:
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                return Boolean.valueOf(MusicFeatures.AUDIO_QUICK_ACTIONS.h());
            case 18:
                return tlo0.Companion.serializer();
            case 19:
                int i3 = VkTextArea.r;
                return new int[]{R.attr.formItemStateValid};
            case 20:
                Object obj = VoipService.q;
                L.A("VoipService", "decline");
                com.vk.voip.ui.c.C(com.vk.voip.ui.c.b, null, 0L, false, true, true, null, 207);
                return s3q0.a;
            default:
                return i0q0.a();
        }
    }
}
