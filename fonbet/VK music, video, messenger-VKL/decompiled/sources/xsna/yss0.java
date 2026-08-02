package xsna;

import com.vk.libvideo.autoplay.VideoAutoPlay;

/* compiled from: VideoMediaPlaybackStateFactory.kt */
/* loaded from: classes3.dex */
public final class yss0 {
    public final z2s0 a = z2s0.b;
    public boolean b;

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xss0 a(yg5 yg5Var) {
        int i;
        int i2 = 2;
        if (yg5Var.P0()) {
            return new xss0(6L, -1L, -1L, 1.0f, (yg5Var.w0() || b(yg5Var)) ? 3 : 2);
        }
        if (yg5Var.v()) {
            fkz c = new gkz(yg5Var.A()).c();
            return new xss0(this.b ? 0L : ((c != null ? c.d : 0L) > 0L ? 1 : ((c != null ? c.d : 0L) == 0L ? 0 : -1)) > 0 ? 76L : 4L, -1L, -1L, 1.0f, (yg5Var.J0() && yg5Var.d()) ? 6 : (yg5Var.J0() || b(yg5Var)) ? 3 : 2);
        }
        long j = this.b ? 0L : 334L;
        if (yg5Var.J()) {
            i2 = 7;
        } else if (!yg5Var.a()) {
            if (yg5Var.J0() && yg5Var.d()) {
                i = 6;
            } else if (yg5Var.J0() || (!yg5Var.isPaused() && b(yg5Var))) {
                i = 3;
            }
            return new xss0(j, yg5Var.getDuration(), !yg5Var.J() ? -1L : yg5Var.getPosition(), yg5Var.b(), i);
        }
        i = i2;
        return new xss0(j, yg5Var.getDuration(), !yg5Var.J() ? -1L : yg5Var.getPosition(), yg5Var.b(), i);
    }

    public final boolean b(yg5 yg5Var) {
        if (!(yg5Var instanceof VideoAutoPlay)) {
            return false;
        }
        bgn bgnVar = ((VideoAutoPlay) yg5Var).s;
        this.a.getClass();
        if (!epx.f(z2s0.k, Boolean.TRUE)) {
            return false;
        }
        String id = bgnVar.getId();
        a3s0 a3s0Var = z2s0.j;
        return epx.f(id, a3s0Var != null ? a3s0Var.getId() : null);
    }
}
