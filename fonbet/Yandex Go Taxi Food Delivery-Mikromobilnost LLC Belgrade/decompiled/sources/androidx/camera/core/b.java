package androidx.camera.core;

import androidx.camera.core.CameraState;

/* loaded from: classes10.dex */
public final class b extends CameraState.a {
    public final int a;
    public final Throwable b;

    public b(int i, Throwable th) {
        this.a = i;
        this.b = th;
    }

    @Override // androidx.camera.core.CameraState.a
    public final Throwable a() {
        return this.b;
    }

    @Override // androidx.camera.core.CameraState.a
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraState.a)) {
            return false;
        }
        CameraState.a aVar = (CameraState.a) obj;
        if (this.a != aVar.b()) {
            return false;
        }
        Throwable th = this.b;
        return th == null ? aVar.a() == null : th.equals(aVar.a());
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        Throwable th = this.b;
        return (th == null ? 0 : th.hashCode()) ^ i;
    }

    public final String toString() {
        return "StateError{code=" + this.a + ", cause=" + this.b + "}";
    }
}
