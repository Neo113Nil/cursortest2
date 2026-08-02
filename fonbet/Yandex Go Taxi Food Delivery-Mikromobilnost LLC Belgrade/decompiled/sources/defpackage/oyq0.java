package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class oyq0 {
    public final nyq0 a;

    public oyq0(int i, ArrayList arrayList, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        this.a = new nyq0(i, arrayList, executor, stateCallback);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oyq0)) {
            return false;
        }
        return this.a.equals(((oyq0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
