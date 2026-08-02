package xsna;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.utils.ExifData;

/* compiled from: CameraCaptureResultImageInfo.java */
/* loaded from: classes11.dex */
public final class ig9 implements ojw {
    public final he9 a;

    public ig9(@NonNull he9 he9Var) {
        this.a = he9Var;
    }

    @Override // xsna.ojw
    public final void a(@NonNull ExifData.b bVar) {
        this.a.a(bVar);
    }

    @Override // xsna.ojw
    public final int b() {
        return 0;
    }

    @Override // xsna.ojw
    @NonNull
    public final d0o0 c() {
        return this.a.a;
    }

    @Override // xsna.ojw
    public final long getTimestamp() {
        return this.a.f();
    }
}
