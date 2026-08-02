package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.dto.common.VideoDownloadDto;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.pushes.receivers.c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class o770 implements izs {
    public final /* synthetic */ Context b;
    public final /* synthetic */ Intent c;
    public final /* synthetic */ int d;

    public /* synthetic */ o770(Context context, Intent intent, int i) {
        this.b = context;
        this.c = intent;
        this.d = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VideoFile videoFile = (VideoFile) obj;
        VideoDownloadDto N5 = videoFile.N5();
        boolean z = N5 != null ? N5.b : false;
        Context context = this.b;
        Intent intent = this.c;
        if (z) {
            c.a aVar = com.vk.pushes.receivers.c.b;
            c.a.f(context, intent, true);
            g7s0.e(fxc0.B(), context, videoFile, VideoScreenMode.INVISIBLE, false, null, 88);
        } else {
            c.a aVar2 = com.vk.pushes.receivers.c.b;
            c.a.e(context, intent, new Exception(tgw.b(this.d, "Video ", " download error")));
        }
        return s3q0.a;
    }
}
