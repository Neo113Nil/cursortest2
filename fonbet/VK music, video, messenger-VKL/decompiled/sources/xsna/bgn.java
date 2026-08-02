package xsna;

import android.content.Context;
import com.vk.catalog2.common.ui.mvp.holder.video.showcase.ShowcaseVideoAutoPlayViewHolder;
import com.vk.libvideo.autoplay.VideoAutoPlay;

/* compiled from: DisplayOutput.kt */
/* loaded from: classes4.dex */
public final class bgn implements jly, a3s0 {
    public final Object a;
    public Object b;

    public bgn(w0d0 w0d0Var) {
        this.a = w0d0Var;
    }

    @Override // xsna.jly
    public String a(Context context) {
        return ((ShowcaseVideoAutoPlayViewHolder) this.a).e(context, ((fh5) this.b).o);
    }

    @Override // xsna.a3s0
    public void c() {
        ((VideoAutoPlay) this.a).c();
    }

    @Override // xsna.a3s0
    public com.vk.libvideo.autoplay.a getConfig() {
        return ((VideoAutoPlay) this.a).Z0();
    }

    @Override // xsna.a3s0
    public String getId() {
        return ((VideoAutoPlay) this.a).u.r1();
    }

    @Override // xsna.a3s0
    public float getVolume() {
        return ((VideoAutoPlay) this.a).getVolume();
    }

    @Override // xsna.a3s0
    public boolean isPlaying() {
        ye0 ye0Var;
        return ((VideoAutoPlay) this.a).isPlaying() || ((ye0Var = ((VideoAutoPlay) this.b).N) != null && ye0Var.y);
    }

    @Override // xsna.a3s0
    public void l(x2s0 x2s0Var) {
        ((VideoAutoPlay) this.b).y.l(x2s0Var);
    }

    @Override // xsna.a3s0
    public boolean m() {
        return ((VideoAutoPlay) this.a).u.Sa();
    }

    @Override // xsna.a3s0
    public void pause() {
        ((VideoAutoPlay) this.a).C(false);
    }

    @Override // xsna.a3s0
    public void play() {
        ((VideoAutoPlay) this.a).play();
    }

    @Override // xsna.a3s0
    public void setVolume(float f) {
        ((VideoAutoPlay) this.a).setVolume(f);
    }

    @Override // xsna.a3s0
    public boolean v() {
        return ((VideoAutoPlay) this.a).u.q0();
    }

    public bgn(p0u p0uVar) {
        this.a = p0uVar;
        this.b = new bpn0(new ldl(this, 6));
    }

    public bgn(ShowcaseVideoAutoPlayViewHolder showcaseVideoAutoPlayViewHolder, fh5 fh5Var) {
        this.a = showcaseVideoAutoPlayViewHolder;
        this.b = fh5Var;
    }

    public bgn(VideoAutoPlay videoAutoPlay) {
        this.b = videoAutoPlay;
        this.a = videoAutoPlay;
    }
}
