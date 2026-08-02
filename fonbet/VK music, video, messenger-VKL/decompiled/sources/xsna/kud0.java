package xsna;

import android.util.Size;
import com.vk.im.ui.formatters.linkparser.LinkType;
import com.vk.newsfeed.impl.fragments.video.tree.VideoCommentsTreeInPlayerFragment;
import com.vk.profile.user.impl.di.UserProfileParamsComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.share.api.a;
import java.util.Collections;
import kotlinx.serialization.KSerializer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class kud0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ kud0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                return s3q0.a;
            case 2:
                return s3q0.a;
            case 3:
                return Boolean.TRUE;
            case 4:
                qcy<Object>[] qcyVarArr = UserProfileParamsComponentImpl.p;
                return new lzd0(new es(), new ots(), new u1r0(), new dz60(), new jgz(10), new avl0(), new max0(), new uft0(), new wlb0(), new wlb0(), new yf3(), new k15());
            case 5:
                return new baz(Collections.singletonList(LinkType.PHONE));
            case 6:
                return Boolean.valueOf(fxc0.B().J().V0());
            case 7:
                String[] strArr = VideoCommentsTreeInPlayerFragment.c0;
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_NO_VIDEO_COMMENT_ATTACH;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 8:
                return Boolean.valueOf(com.vk.toggle.b.A.a(VideoFeatures.VIDEO_D2D_CLIPS_DISCOVERY));
            case 9:
                return new nqj();
            case 10:
                VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_APP_STABILITY_OFFLINE;
                videoFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures2));
            case 11:
                return new cqs0(null, 3);
            case 12:
                return a.C1997a.a.getSTUB();
            case 13:
                return Integer.valueOf(iah0.a(10.0f));
            case 14:
                return Boolean.valueOf(fxc0.B().J().b());
            default:
                return new rpj(fpf0.a(Size.class), null, new KSerializer[0]);
        }
    }
}
