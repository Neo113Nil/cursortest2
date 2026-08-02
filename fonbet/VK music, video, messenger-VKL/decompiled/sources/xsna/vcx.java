package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.VideoFile;
import xsna.acx;

/* compiled from: InteractiveVolumeHandler.kt */
/* loaded from: classes3.dex */
public final class vcx implements a3s0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ wcx b;

    public vcx(String str, wcx wcxVar) {
        this.a = str;
        this.b = wcxVar;
    }

    @Override // xsna.a3s0
    public final void c() {
        this.b.b.a(new acx.g(false, true, false));
    }

    @Override // xsna.a3s0
    public final com.vk.libvideo.autoplay.a getConfig() {
        return this.b.c.r;
    }

    @Override // xsna.a3s0
    public final String getId() {
        return this.a;
    }

    @Override // xsna.a3s0
    public final float getVolume() {
        Float f = this.b.c.o;
        return f != null ? f.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.a3s0
    public final boolean isPlaying() {
        return this.b.c.a.a;
    }

    @Override // xsna.a3s0
    public final boolean m() {
        VideoFile videoFile = this.b.c.s;
        return epx.f(videoFile != null ? Boolean.valueOf(videoFile.Sa()) : null, Boolean.TRUE);
    }

    @Override // xsna.a3s0
    public final void pause() {
        this.b.b.a(new acx.g(false, false, false));
    }

    @Override // xsna.a3s0
    public final void play() {
        this.b.b.a(new acx.g(true, false, false));
    }

    @Override // xsna.a3s0
    public final void setVolume(float f) {
        this.b.b.a(new acx.n(f));
    }

    @Override // xsna.a3s0
    public final boolean v() {
        return false;
    }

    @Override // xsna.a3s0
    public final void l(x2s0 x2s0Var) {
    }
}
