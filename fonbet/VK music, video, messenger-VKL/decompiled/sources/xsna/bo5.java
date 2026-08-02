package xsna;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import xsna.zjn0;

/* compiled from: AutoValue_SurfaceRequest_TransformationInfo.java */
/* loaded from: classes11.dex */
public final class bo5 extends zjn0.g {
    public final Rect a;
    public final int b;
    public final int c;

    public bo5(Rect rect, int i, int i2) {
        this.a = rect;
        this.b = i;
        this.c = i2;
    }

    @Override // xsna.zjn0.g
    @NonNull
    public final Rect a() {
        return this.a;
    }

    @Override // xsna.zjn0.g
    public final int b() {
        return this.b;
    }

    @Override // xsna.zjn0.g
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zjn0.g)) {
            return false;
        }
        zjn0.g gVar = (zjn0.g) obj;
        return this.a.equals(gVar.a()) && this.b == gVar.b() && this.c == gVar.c();
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformationInfo{cropRect=");
        sb.append(this.a);
        sb.append(", rotationDegrees=");
        sb.append(this.b);
        sb.append(", targetRotation=");
        return h5s.c(this.c, "}", sb);
    }
}
