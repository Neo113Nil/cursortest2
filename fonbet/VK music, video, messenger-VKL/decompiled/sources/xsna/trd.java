package xsna;

import android.content.ContextWrapper;
import com.vk.dto.common.ServerEffect;
import com.vk.dto.common.VideoFile;

/* compiled from: ClipsDownloadabilityImpl.kt */
/* loaded from: classes16.dex */
public final class trd implements rrd {
    @Override // xsna.rrd
    public final void a(ContextWrapper contextWrapper, VideoFile videoFile) {
        if (videoFile.O5() == ServerEffect.DEEP_FAKE) {
            i0q0.f(new srd(contextWrapper, 0));
        }
    }

    @Override // xsna.rrd
    public final boolean b(VideoFile videoFile) {
        return g620.f().c(videoFile) && gpt0.x(videoFile) && !egd.c(videoFile) && videoFile.k1() == 0 && !videoFile.Q0();
    }

    @Override // xsna.rrd
    public final boolean c(VideoFile videoFile) {
        return b(videoFile) && !(videoFile.O5() == ServerEffect.DEEP_FAKE);
    }
}
