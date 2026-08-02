package xsna;

import com.vk.libvideo.design.view.videotexture.VideoTextureView;

/* compiled from: Effects.kt */
/* loaded from: classes17.dex */
public final class edu0 implements kgn {
    public final /* synthetic */ yg5 a;
    public final /* synthetic */ VideoTextureView b;
    public final /* synthetic */ fdu0 c;

    public edu0(yg5 yg5Var, VideoTextureView videoTextureView, fdu0 fdu0Var) {
        this.a = yg5Var;
        this.b = videoTextureView;
        this.c = fdu0Var;
    }

    @Override // xsna.kgn
    public final void dispose() {
        VideoTextureView videoTextureView = this.b;
        yg5 yg5Var = this.a;
        yg5Var.b0(videoTextureView);
        yg5Var.T(this.c);
        yg5Var.pause();
        yg5Var.B0().stop();
    }
}
