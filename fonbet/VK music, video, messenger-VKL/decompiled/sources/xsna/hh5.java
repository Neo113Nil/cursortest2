package xsna;

import com.vk.dto.common.VideoFile;

/* compiled from: AutoPlayDelegate.kt */
/* loaded from: classes2.dex */
public final class hh5 implements emz {
    public final /* synthetic */ fh5 a;

    public hh5(fh5 fh5Var) {
        this.a = fh5Var;
    }

    @Override // xsna.emz
    public final void a() {
        fh5 fh5Var = this.a;
        fh5Var.L0();
        if (fh5Var.G0.c) {
            yg5 yg5Var = fh5Var.j;
            if (yg5Var == null) {
                yg5Var = null;
            }
            yg5Var.z0(fh5Var.v, fh5Var.r, null);
            yg5 yg5Var2 = fh5Var.j;
            (yg5Var2 != null ? yg5Var2 : null).S(true);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [xsna.fh5$b, xsna.qi6] */
    @Override // xsna.emz
    public final void b(VideoFile videoFile) {
        fh5 fh5Var = this.a;
        fh5Var.v(videoFile);
        fh5Var.J0();
        fh5Var.M0();
        fh5Var.E0(null);
        ?? r2 = fh5Var.z0;
        if (r2 != 0) {
            r2.U1(fh5Var.u0);
        }
    }

    @Override // xsna.emz
    public final void onPause() {
        fh5 fh5Var = this.a;
        if (fh5Var.G0.c) {
            yg5 yg5Var = fh5Var.j;
            if (yg5Var == null) {
                yg5Var = null;
            }
            yg5Var.pause();
        }
    }

    @Override // xsna.emz
    public final void p() {
        fh5 fh5Var = this.a;
        if (fh5Var.G0.c) {
            yg5 yg5Var = fh5Var.j;
            if (yg5Var == null) {
                yg5Var = null;
            }
            if (yg5Var.p0()) {
                fh5Var.m0();
            }
        }
    }
}
