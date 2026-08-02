package xsna;

import android.content.Intent;
import com.vk.media.MediaFilteringStrategy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ykd implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ykd(boolean z, int i) {
        this.b = i;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Intent intent = (Intent) obj;
                intent.putExtra("camera_enabled", false);
                intent.putExtra("long_previews", true);
                intent.putExtra("short_divider", true);
                intent.putExtra("prevent_styling_photo", false);
                intent.putExtra("prevent_styling_video", false);
                intent.putExtra("media_type", 111);
                intent.putExtra("total_selection_limit", 30);
                intent.putExtra("selection_limit", 30);
                intent.putExtra("is_fullhd", this.c);
                intent.putExtra("clips_picker", true);
                intent.putExtra("video_filtering_mode", MediaFilteringStrategy.VIDEO_AVC_HEVC);
                intent.putExtra("video_min_length_ms", 100L);
                intent.putExtra("video_max_length_ms", ynd.a);
                intent.putExtra("prevent_styling", true);
                intent.putExtra("single_mode", false);
                break;
            default:
                ((tdu) obj).b(this.c ? 1.0f : 0.64f);
                break;
        }
        return s3q0.a;
    }
}
