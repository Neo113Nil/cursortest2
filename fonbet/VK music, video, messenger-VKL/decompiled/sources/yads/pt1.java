package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class pt1 extends qx0 {
    public final long[] d;
    public final long[] e;

    public pt1(w73 w73Var, HashMap hashMap) {
        super(w73Var);
        int b = w73Var.b();
        this.e = new long[w73Var.b()];
        v73 v73Var = new v73();
        for (int i = 0; i < b; i++) {
            this.e[i] = w73Var.a(i, v73Var).o;
        }
        int a = w73Var.a();
        this.d = new long[a];
        t73 t73Var = new t73();
        for (int i2 = 0; i2 < a; i2++) {
            w73Var.a(i2, t73Var, true);
            long longValue = ((Long) ni.a((Long) hashMap.get(t73Var.c))).longValue();
            long[] jArr = this.d;
            longValue = longValue == Long.MIN_VALUE ? t73Var.e : longValue;
            jArr[i2] = longValue;
            long j = t73Var.e;
            if (j != C.TIME_UNSET) {
                long[] jArr2 = this.e;
                int i3 = t73Var.d;
                jArr2[i3] = jArr2[i3] - (j - longValue);
            }
        }
    }

    @Override // yads.w73
    public final t73 a(int i, t73 t73Var, boolean z) {
        this.c.a(i, t73Var, z);
        t73Var.e = this.d[i];
        return t73Var;
    }

    @Override // yads.qx0, yads.w73
    public final v73 a(int i, v73 v73Var, long j) {
        long j2;
        super.a(i, v73Var, j);
        long j3 = this.e[i];
        v73Var.o = j3;
        if (j3 != C.TIME_UNSET) {
            long j4 = v73Var.n;
            if (j4 != C.TIME_UNSET) {
                j2 = Math.min(j4, j3);
                v73Var.n = j2;
                return v73Var;
            }
        }
        j2 = v73Var.n;
        v73Var.n = j2;
        return v73Var;
    }
}
