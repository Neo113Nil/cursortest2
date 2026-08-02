package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class pr71 implements kq71 {
    public static final dp71 A = new dp71(26);
    public final long a;
    public final int b;
    public final Uri[] c;
    public final int[] w;
    public final long[] x;
    public final long y;
    public final boolean z;

    public pr71(long j, int i, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
        if (iArr.length != uriArr.length) {
            w511.q();
            throw null;
        }
        this.a = j;
        this.b = i;
        this.w = iArr;
        this.c = uriArr;
        this.x = jArr;
        this.y = j2;
        this.z = z;
    }

    public final int a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.w;
            if (i3 >= iArr.length || this.z || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pr71.class != obj.getClass()) {
            return false;
        }
        pr71 pr71Var = (pr71) obj;
        return this.a == pr71Var.a && this.b == pr71Var.b && Arrays.equals(this.c, pr71Var.c) && Arrays.equals(this.w, pr71Var.w) && Arrays.equals(this.x, pr71Var.x) && this.y == pr71Var.y && this.z == pr71Var.z;
    }

    public final int hashCode() {
        int i = this.b * 31;
        long j = this.a;
        int hashCode = (Arrays.hashCode(this.x) + ((Arrays.hashCode(this.w) + ((((i + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.c)) * 31)) * 31)) * 31;
        long j2 = this.y;
        return ((hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.z ? 1 : 0);
    }
}
