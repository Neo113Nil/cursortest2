package defpackage;

import android.hardware.camera2.params.OutputConfiguration;

/* loaded from: classes10.dex */
public final class hy80 extends gy80 {
    @Override // defpackage.gy80
    public final Object a() {
        Object obj = this.a;
        d6z.n(obj instanceof OutputConfiguration);
        return obj;
    }

    @Override // defpackage.gy80
    public final void b(long j) {
        ((OutputConfiguration) a()).setDynamicRangeProfile(j);
    }

    @Override // defpackage.gy80
    public final void c(int i) {
        ((OutputConfiguration) a()).setMirrorMode(i);
    }

    @Override // defpackage.gy80
    public final void d(long j) {
        if (j == -1) {
            return;
        }
        ((OutputConfiguration) a()).setStreamUseCase(j);
    }
}
