package yads;

import android.media.MediaFormat;

/* loaded from: classes10.dex */
public final class yn0 implements ri3, at, bg2 {
    public ri3 b;
    public at c;

    @Override // yads.ri3
    public final void a(long j, long j2, nx0 nx0Var, MediaFormat mediaFormat) {
        ri3 ri3Var = this.b;
        if (ri3Var != null) {
            ri3Var.a(j, j2, nx0Var, mediaFormat);
        }
    }

    @Override // yads.bg2
    public final void handleMessage(int i, Object obj) {
        if (i == 7) {
            this.b = (ri3) obj;
        } else if (i == 8) {
            this.c = (at) obj;
        } else {
            if (i != 10000) {
                return;
            }
        }
    }

    @Override // yads.at
    public final void onCameraMotion(long j, float[] fArr) {
        at atVar = this.c;
        if (atVar != null) {
            atVar.onCameraMotion(j, fArr);
        }
    }

    @Override // yads.at
    public final void onCameraMotionReset() {
        at atVar = this.c;
        if (atVar != null) {
            atVar.onCameraMotionReset();
        }
    }
}
