package yads;

import android.net.Uri;
import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import xsna.hbn0;

/* loaded from: classes10.dex */
public final class d6 implements xq {
    public static final wq i = new hbn0(5);
    public final long b;
    public final int c;
    public final Uri[] d;
    public final int[] e;
    public final long[] f;
    public final long g;
    public final boolean h;

    public d6(long j, int i2, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
        ni.a(iArr.length == uriArr.length);
        this.b = j;
        this.c = i2;
        this.e = iArr;
        this.d = uriArr;
        this.f = jArr;
        this.g = j2;
        this.h = z;
    }

    public static d6 a(Bundle bundle) {
        long j = bundle.getLong(Integer.toString(0, 36));
        int i2 = bundle.getInt(Integer.toString(1, 36), -1);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(2, 36));
        int[] intArray = bundle.getIntArray(Integer.toString(3, 36));
        long[] longArray = bundle.getLongArray(Integer.toString(4, 36));
        long j2 = bundle.getLong(Integer.toString(5, 36));
        boolean z = bundle.getBoolean(Integer.toString(6, 36));
        int[] iArr = intArray;
        if (iArr == null) {
            iArr = new int[0];
        }
        Uri[] uriArr = parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]);
        if (longArray == null) {
            longArray = new long[0];
        }
        return new d6(j, i2, iArr, uriArr, longArray, j2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d6.class == obj.getClass()) {
            d6 d6Var = (d6) obj;
            if (this.b == d6Var.b && this.c == d6Var.c && Arrays.equals(this.d, d6Var.d) && Arrays.equals(this.e, d6Var.e) && Arrays.equals(this.f, d6Var.f) && this.g == d6Var.g && this.h == d6Var.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.c * 31;
        long j = this.b;
        int hashCode = (Arrays.hashCode(this.f) + xsna.dq.d((((i2 + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.d)) * 31, 31, this.e)) * 31;
        long j2 = this.g;
        return ((hashCode + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.h ? 1 : 0);
    }

    public final int a(int i2) {
        int i3;
        int i4 = i2 + 1;
        while (true) {
            int[] iArr = this.e;
            if (i4 >= iArr.length || this.h || (i3 = iArr[i4]) == 0 || i3 == 1) {
                break;
            }
            i4++;
        }
        return i4;
    }

    public final d6 a() {
        int[] iArr = this.e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = this.f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, C.TIME_UNSET);
        return new d6(this.b, 0, copyOf, (Uri[]) Arrays.copyOf(this.d, 0), copyOf2, this.g, this.h);
    }
}
