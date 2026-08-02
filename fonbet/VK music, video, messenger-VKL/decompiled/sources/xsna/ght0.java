package xsna;

import com.vk.dto.common.VideoFile;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ght0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ VideoFile c;

    public /* synthetic */ ght0(int i, VideoFile videoFile) {
        this.b = i;
        this.c = videoFile;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.P2(((Integer) obj).intValue());
                break;
            default:
                cvk.u(R.string.remove_action_link_successed, false);
                VideoFile videoFile = this.c;
                videoFile.u7(null);
                wjs0.a(new fyr0(videoFile));
                break;
        }
        return s3q0.a;
    }
}
