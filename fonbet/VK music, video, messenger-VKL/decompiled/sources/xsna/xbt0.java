package xsna;

import android.widget.TextView;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.superapp.vkworkout.widget.api.di.VkWorkoutWidgetComponent;
import com.vk.superapp.vkworkout.widget.impl.infrastructure.receivers.VkWorkoutWidgetSmallProvider;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class xbt0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xbt0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = VideoRelatedVideosFragment.n0;
                return ((VideoMinimizablePlayerComponent) m7m.d((VideoRelatedVideosFragment) obj).a(fpf0.a(VideoMinimizablePlayerComponent.class))).P7();
            case 1:
                return ((ggu0) obj).b;
            case 2:
                int i3 = VkWorkoutWidgetSmallProvider.c;
                return (VkWorkoutWidgetComponent) ((k7m) m7m.f((VkWorkoutWidgetSmallProvider) obj)).a(fpf0.a(VkWorkoutWidgetComponent.class));
            default:
                return (TextView) ((oxw0) obj).findViewById(R.id.error_retry);
        }
    }
}
