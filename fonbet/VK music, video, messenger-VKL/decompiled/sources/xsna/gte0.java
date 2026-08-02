package xsna;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Brush.kt */
/* loaded from: classes11.dex */
public final class gte0 extends n4j0 {
    public final List<l5g> d;
    public final List<Float> e;
    public final long f;
    public final float g;

    public gte0() {
        throw null;
    }

    public gte0(List list, ArrayList arrayList, long j, float f) {
        this.d = list;
        this.e = arrayList;
        this.f = j;
        this.g = f;
    }

    @Override // xsna.yk8
    public final long b() {
        float f = this.g;
        if ((Float.floatToRawIntBits(f) & Integer.MAX_VALUE) >= 2139095040) {
            return 9205357640488583168L;
        }
        float f2 = 2;
        float f3 = f * f2;
        float f4 = f * f2;
        return (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
    }

    @Override // xsna.n4j0
    public final Shader c(long j) {
        float intBitsToFloat;
        float intBitsToFloat2;
        long j2 = this.f;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long j3 = egi.j(j);
            intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
            intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            intBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            intBitsToFloat2 = Float.intBitsToFloat(i2);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        float f = this.g;
        if (f == Float.POSITIVE_INFINITY) {
            f = mxj0.c(j) / 2;
        }
        float f2 = f;
        List<l5g> list = this.d;
        List<Float> list2 = this.e;
        oc2.b(list, list2);
        float intBitsToFloat3 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
        int size = list.size();
        int[] iArr = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = f870.H(list.get(i3).a);
        }
        return new RadialGradient(intBitsToFloat3, intBitsToFloat4, f2, iArr, oc2.a(list2, list), kd2.a(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gte0)) {
            return false;
        }
        gte0 gte0Var = (gte0) obj;
        return epx.f(this.d, gte0Var.d) && epx.f(this.e, gte0Var.e) && ov70.c(this.f, gte0Var.f) && this.g == gte0Var.g;
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode() * 31;
        List<Float> list = this.e;
        return Integer.hashCode(0) + io.reactivex.rxjava3.subjects.b.a(this.g, bh10.a((hashCode + (list != null ? list.hashCode() : 0)) * 31, 31, this.f), 31);
    }

    public final String toString() {
        String str;
        long j = this.f;
        String str2 = "";
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            str = "center=" + ((Object) ov70.h(j)) + ", ";
        } else {
            str = "";
        }
        float f = this.g;
        if ((Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + f + ", ";
        }
        StringBuilder sb = new StringBuilder("RadialGradient(colors=");
        sb.append(this.d);
        sb.append(", stops=");
        vr.c(", ", str, str2, sb, this.e);
        sb.append("tileMode=");
        sb.append((Object) fto0.v(0));
        sb.append(')');
        return sb.toString();
    }
}
