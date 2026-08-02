package xsna;

import android.view.View;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dialogtags.impl.di.TagsComponentImpl;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.libvideo.ui.preview.VideoSeekPreviewImage;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.SaFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.stereo.stub.room.di.VoipStereoComponentStub;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class yo80 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ yo80(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                OnlineBookingInternalComponent.a aVar = OnlineBookingInternalComponent.n;
                UiTracker uiTracker = UiTracker.a;
                return new lm7();
            case 1:
                return k840.a.g().b();
            case 2:
                ComFeatures comFeatures = ComFeatures.COM_DONUT_PRICE_DISCOUNT;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 3:
                return new esw();
            case 4:
                return Integer.valueOf(View.generateViewId());
            case 5:
                return s3q0.a;
            case 6:
                return new r6e0();
            case 7:
                return new p8m0();
            case 8:
                return s3q0.a;
            case 9:
                qcy<Object>[] qcyVarArr = TagsComponentImpl.b;
                return new w1o0();
            case 10:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_SUBS_ALBUMS_REDESIGN;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 11:
                return com.vk.toggle.d.x();
            case 12:
                return Boolean.valueOf(fxc0.B().J().t0());
            case 13:
                return Boolean.valueOf(fxc0.B().J().X1());
            case 14:
                int i = VideoSeekPreviewImage.G;
                return s3q0.a;
            case 15:
                VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_INLINE_STANDALONE_INSTALL;
                videoFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures2));
            case 16:
                return Boolean.valueOf(epx.f(e370.s != null ? Boolean.valueOf(com.vk.toggle.b.A.a(SaFeatures.SA_FIX_HANDLE_GAME_URL)) : null, Boolean.TRUE));
            case 17:
                return new bsp(VkCell.Right.ExtraAction.Mode.values(), "com.vk.core.view.components.cell.VkCell.Right.ExtraAction.Mode");
            case 18:
                VideoFeatures videoFeatures3 = VideoFeatures.VIDEO_FIX_CLEAR_HISTORY;
                videoFeatures3.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures3));
            case 19:
                rq4.a.getClass();
                rq4.a(true);
                return s3q0.a;
            default:
                qcy<Object>[] qcyVarArr2 = VoipStereoComponentStub.b;
                return new VoipStereoComponentStub.e();
        }
    }
}
