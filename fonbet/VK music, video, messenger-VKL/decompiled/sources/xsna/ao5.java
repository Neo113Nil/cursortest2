package xsna;

import android.view.Surface;
import androidx.annotation.NonNull;
import xsna.zjn0;

/* compiled from: AutoValue_SurfaceRequest_Result.java */
/* loaded from: classes11.dex */
public final class ao5 extends zjn0.f {
    public final int a;
    public final Surface b;

    public ao5(int i, Surface surface) {
        this.a = i;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.b = surface;
    }

    @Override // xsna.zjn0.f
    public final int a() {
        return this.a;
    }

    @Override // xsna.zjn0.f
    @NonNull
    public final Surface b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zjn0.f)) {
            return false;
        }
        zjn0.f fVar = (zjn0.f) obj;
        return this.a == fVar.a() && this.b.equals(fVar.b());
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "Result{resultCode=" + this.a + ", surface=" + this.b + "}";
    }
}
