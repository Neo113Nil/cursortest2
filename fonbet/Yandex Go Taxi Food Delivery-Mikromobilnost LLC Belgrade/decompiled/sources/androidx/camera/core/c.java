package androidx.camera.core;

import android.graphics.Matrix;
import defpackage.ny61;
import defpackage.oiv;
import defpackage.oyr;
import defpackage.q6x0;

/* loaded from: classes10.dex */
public final class c extends oiv {
    public final q6x0 a;
    public final long b;
    public final int c;
    public final Matrix d;
    public final int e;

    public c(q6x0 q6x0Var, long j, int i, Matrix matrix, int i2) {
        if (q6x0Var == null) {
            ny61.t("Null tagBundle");
            throw null;
        }
        this.a = q6x0Var;
        this.b = j;
        this.c = i;
        if (matrix == null) {
            ny61.t("Null sensorToBufferTransformMatrix");
            throw null;
        }
        this.d = matrix;
        this.e = i2;
    }

    @Override // defpackage.dav
    public final q6x0 b() {
        return this.a;
    }

    @Override // defpackage.dav
    public final Matrix c() {
        return this.d;
    }

    @Override // defpackage.dav
    public final int d() {
        return this.e;
    }

    @Override // defpackage.dav
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oiv)) {
            return false;
        }
        oiv oivVar = (oiv) obj;
        c cVar = (c) oivVar;
        return this.a.equals(cVar.a) && this.b == cVar.b && this.c == cVar.c && this.d.equals(cVar.d) && this.e == oivVar.d();
    }

    @Override // defpackage.dav
    public final long getTimestamp() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return this.e ^ ((((((hashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableImageInfo{tagBundle=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", rotationDegrees=");
        sb.append(this.c);
        sb.append(", sensorToBufferTransformMatrix=");
        sb.append(this.d);
        sb.append(", flashState=");
        return oyr.m(this.e, "}", sb);
    }
}
