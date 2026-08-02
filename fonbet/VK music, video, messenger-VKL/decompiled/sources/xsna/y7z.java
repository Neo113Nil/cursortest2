package xsna;

import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Brush.kt */
/* loaded from: classes11.dex */
public final class y7z extends n4j0 {
    public final List<l5g> d;
    public final List<Float> e;
    public final long f;
    public final long g;
    public final int h;

    public y7z() {
        throw null;
    }

    public y7z(List list, ArrayList arrayList, long j, long j2, int i) {
        this.d = list;
        this.e = arrayList;
        this.f = j;
        this.g = j2;
        this.h = i;
    }

    @Override // xsna.yk8
    public final long b() {
        long j = this.f;
        float abs = Math.abs(Float.intBitsToFloat((int) (j >> 32)));
        float f = Float.NaN;
        long j2 = this.g;
        float abs2 = (abs > Float.MAX_VALUE || Math.abs(Float.intBitsToFloat((int) (j2 >> 32))) > Float.MAX_VALUE) ? Float.NaN : Math.abs(Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32)));
        if (Math.abs(Float.intBitsToFloat((int) (j & 4294967295L))) <= Float.MAX_VALUE && Math.abs(Float.intBitsToFloat((int) (j2 & 4294967295L))) <= Float.MAX_VALUE) {
            f = Math.abs(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L)));
        }
        return (Float.floatToRawIntBits(abs2) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
    }

    @Override // xsna.n4j0
    public final Shader c(long j) {
        long j2 = this.f;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float intBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.g;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float intBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float intBitsToFloat4 = Float.intBitsToFloat(i4);
        return jcr.a((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L), this.d, this.e, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7z)) {
            return false;
        }
        y7z y7zVar = (y7z) obj;
        return epx.f(this.d, y7zVar.d) && epx.f(this.e, y7zVar.e) && ov70.c(this.f, y7zVar.f) && ov70.c(this.g, y7zVar.g) && this.h == y7zVar.h;
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode() * 31;
        List<Float> list = this.e;
        return Integer.hashCode(this.h) + bh10.a(bh10.a((hashCode + (list != null ? list.hashCode() : 0)) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        String str;
        long j = this.f;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) ov70.h(j)) + ", ";
        } else {
            str = "";
        }
        long j2 = this.g;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) ov70.h(j2)) + ", ";
        }
        StringBuilder sb = new StringBuilder("LinearGradient(colors=");
        sb.append(this.d);
        sb.append(", stops=");
        vr.c(", ", str, str2, sb, this.e);
        sb.append("tileMode=");
        sb.append((Object) fto0.v(this.h));
        sb.append(')');
        return sb.toString();
    }
}
