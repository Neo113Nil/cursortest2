package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class jt81 implements a871 {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public jt81(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length <= 0) {
            this.f = 0L;
        } else {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        }
    }

    @Override // defpackage.a871
    public final boolean b() {
        return true;
    }

    @Override // defpackage.a871
    public final long c() {
        return this.f;
    }

    @Override // defpackage.a871
    public final v171 d(long j) {
        long[] jArr = this.e;
        int t = rf71.t(jArr, j, true);
        long j2 = jArr[t];
        long[] jArr2 = this.c;
        oe71 oe71Var = new oe71(j2, jArr2[t]);
        if (j2 >= j || t == this.a - 1) {
            return new v171(oe71Var, oe71Var);
        }
        int i = t + 1;
        return new v171(oe71Var, new oe71(jArr[i], jArr2[i]));
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + Extension.C_BRAKE;
    }
}
