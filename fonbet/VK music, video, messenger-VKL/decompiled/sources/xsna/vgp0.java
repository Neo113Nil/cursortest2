package xsna;

import io.requery.android.database.sqlite.SQLiteDatabase;

/* compiled from: TrackSampleTable.java */
/* loaded from: classes12.dex */
public final class vgp0 {
    public final vep0 a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final int[] h;
    public final long i;
    public final boolean j;

    public vgp0(vep0 vep0Var, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, int[] iArr3, boolean z, long j, int i2) {
        fxc0.p(iArr.length == jArr2.length);
        fxc0.p(jArr.length == jArr2.length);
        fxc0.p(iArr2.length == jArr2.length);
        this.a = vep0Var;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = iArr3;
        this.j = z;
        this.i = j;
        this.b = i2;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
        }
    }

    public final int a(long j) {
        boolean z = this.j;
        int i = 0;
        long[] jArr = this.f;
        if (z) {
            return y2r0.f(jArr, j, false);
        }
        int[] iArr = this.h;
        int length = iArr.length - 1;
        int i2 = -1;
        while (i <= length) {
            int b = x9.b(length, i, 2, i);
            if (jArr[iArr[b]] <= j) {
                i = b + 1;
                i2 = b;
            } else {
                length = b - 1;
            }
        }
        if (i2 == -1) {
            return -1;
        }
        long j2 = jArr[iArr[i2]];
        if (j2 == j) {
            while (i2 > 0 && jArr[iArr[i2 - 1]] == j2) {
                i2--;
            }
        }
        return iArr[i2];
    }

    public final int b(long j) {
        boolean z = this.j;
        long[] jArr = this.f;
        if (z) {
            return y2r0.b(jArr, j, true);
        }
        int[] iArr = this.h;
        int length = iArr.length - 1;
        int i = 0;
        int i2 = -1;
        while (i <= length) {
            int b = x9.b(length, i, 2, i);
            if (jArr[iArr[b]] >= j) {
                length = b - 1;
                i2 = b;
            } else {
                i = b + 1;
            }
        }
        if (i2 == -1) {
            return -1;
        }
        long j2 = jArr[iArr[i2]];
        if (j2 == j) {
            while (i2 < iArr.length - 1) {
                int i3 = i2 + 1;
                if (jArr[iArr[i3]] != j2) {
                    break;
                }
                i2 = i3;
            }
        }
        return iArr[i2];
    }
}
