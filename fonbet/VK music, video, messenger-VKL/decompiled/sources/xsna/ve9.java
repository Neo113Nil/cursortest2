package xsna;

import android.hardware.camera2.CameraDevice;
import androidx.annotation.Nullable;
import xsna.we9;

/* compiled from: Camera2CameraImpl.java */
/* loaded from: classes11.dex */
public final class ve9 implements o0t<Void> {
    public final /* synthetic */ gs9 b;
    public final /* synthetic */ we9 c;

    public ve9(we9 we9Var, gs9 gs9Var) {
        this.c = we9Var;
        this.b = gs9Var;
    }

    @Override // xsna.o0t
    public final void onSuccess(@Nullable Void r2) {
        CameraDevice cameraDevice;
        this.c.q.remove(this.b);
        int i = we9.b.a[this.c.e.ordinal()];
        if (i != 3) {
            if (i != 6) {
                if (i != 7) {
                    return;
                }
            } else if (this.c.k == 0) {
                return;
            }
        }
        if (!this.c.p() || (cameraDevice = this.c.j) == null) {
            return;
        }
        cameraDevice.close();
        this.c.j = null;
    }

    @Override // xsna.o0t
    public final void onFailure(Throwable th) {
    }
}
