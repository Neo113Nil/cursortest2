package xsna;

import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import xsna.q5b0;

/* compiled from: Effects.kt */
/* loaded from: classes16.dex */
public final class l5b0 implements kgn {
    public final /* synthetic */ yg5 a;
    public final /* synthetic */ VideoTextureView b;
    public final /* synthetic */ m5b0 c;
    public final /* synthetic */ q5b0.b d;

    public l5b0(VideoTextureView videoTextureView, yg5 yg5Var, m5b0 m5b0Var, q5b0.b bVar) {
        this.a = yg5Var;
        this.b = videoTextureView;
        this.c = m5b0Var;
        this.d = bVar;
    }

    @Override // xsna.kgn
    public final void dispose() {
        VideoTextureView videoTextureView = this.b;
        yg5 yg5Var = this.a;
        yg5Var.b0(videoTextureView);
        yg5Var.T(this.c);
        gzs<? extends s3q0> h = this.d.b().h();
        if (h != null) {
            h.invoke();
        }
    }
}
