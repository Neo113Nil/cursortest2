package xsna;

import androidx.annotation.NonNull;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import xsna.e4z;

/* compiled from: AutoValue_LifecycleCameraRepository_Key.java */
/* loaded from: classes11.dex */
public final class en5 extends e4z.a {
    public final f5z a;
    public final CameraUseCaseAdapter.a b;

    public en5(f5z f5zVar, CameraUseCaseAdapter.a aVar) {
        if (f5zVar == null) {
            throw new NullPointerException("Null lifecycleOwner");
        }
        this.a = f5zVar;
        if (aVar == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.b = aVar;
    }

    @Override // xsna.e4z.a
    @NonNull
    public final CameraUseCaseAdapter.a a() {
        return this.b;
    }

    @Override // xsna.e4z.a
    @NonNull
    public final f5z b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e4z.a)) {
            return false;
        }
        e4z.a aVar = (e4z.a) obj;
        return this.a.equals(aVar.b()) && this.b.equals(aVar.a());
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "Key{lifecycleOwner=" + this.a + ", cameraId=" + this.b + "}";
    }
}
