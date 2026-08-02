package xsna;

import com.vk.camera.clips.impl.di.CameraClipsComponentBase;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponentImpl;
import com.vk.donut.video.impl.di.DonutVideoComponentImpl;
import com.vk.libvideo.adfree.impl.di.VideoAdFreeSubscriptionComponentImpl;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.multiaccount.impl.di.VkClientMultiAccountComponentImpl;
import com.vk.music.bottomsheets.audiobook.di.PodcastBottomSheetHeaderComponentAppImpl;
import com.vk.network.di.NetworkComponentImpl;
import com.vk.toggle.features.FeedFeatures;
import com.vkontakte.android.VKApplication;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class vg9 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ vg9(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = CameraClipsComponentBase.i;
                return new oid();
            case 1:
                return new ClipsEntryPointsComponentImpl.a();
            case 2:
                qcy<Object>[] qcyVarArr2 = DonutVideoComponentImpl.j;
                return new bzn();
            case 3:
                return new PodcastBottomSheetHeaderComponentAppImpl.a();
            case 4:
                FeedFeatures feedFeatures = FeedFeatures.FEED_DS_ACTION_CELL_BUTTON;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 5:
                return Long.valueOf(o25.a().c().b);
            case 6:
                VKApplication.a aVar = VKApplication.c;
                return ((VideoMinimizablePlayerComponent) m7m.e().a(fpf0.a(VideoMinimizablePlayerComponent.class))).P7();
            case 7:
                qcy<Object>[] qcyVarArr3 = VideoAdFreeSubscriptionComponentImpl.g;
                return new uyr0();
            case 8:
                return new VkClientMultiAccountComponentImpl.a();
            case 9:
                return new NetworkComponentImpl.a();
            case 10:
                VKApplication vKApplication = com.vk.core.apps.a.a;
                Boolean bool = (Boolean) com.vk.core.apps.a.c(Boolean.FALSE, "com.vk.is_design_inspector_enabled");
                bool.getClass();
                return bool;
            case 11:
                return new bcn0();
            case 12:
                return new ovw0(new zui(new z2i0(new fr6(24))));
            default:
                return new qit();
        }
    }

    public /* synthetic */ vg9(VKApplication vKApplication) {
        this.b = 6;
    }
}
