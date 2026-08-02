package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.dto.common.VideoFileOld;
import xsna.dis0;
import xsna.fys0;

/* compiled from: VideoOfflineViewProviderImpl.kt */
/* loaded from: classes3.dex */
public final class p0t0 implements o0t0 {
    @Override // xsna.o0t0
    public final void a(Context context, svd svdVar) {
        new fys0.a(context, svdVar).I0(null);
    }

    @Override // xsna.o0t0
    public final uys0 b(Context context) {
        return new dis0(context);
    }

    @Override // xsna.o0t0
    public final void c(VideoFileOld videoFileOld, Activity activity, boolean z, boolean z2) {
        Object obj = dis0.t;
        dis0.a.a(videoFileOld, activity, z, false, z2, false);
    }
}
