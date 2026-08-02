package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* loaded from: classes10.dex */
public final class iy2 extends gy2 {
    public final zb3 j;
    public final zb3 k;
    public final long l;

    public iy2(qm2 qm2Var, long j, long j2, long j3, long j4, long j5, List list, long j6, zb3 zb3Var, zb3 zb3Var2, long j7, long j8) {
        super(qm2Var, j, j2, j3, j5, list, j6, j7, j8);
        this.j = zb3Var;
        this.k = zb3Var2;
        this.l = j4;
    }

    @Override // yads.ly2
    public final qm2 a(mp2 mp2Var) {
        zb3 zb3Var = this.j;
        if (zb3Var == null) {
            return this.a;
        }
        nx0 nx0Var = mp2Var.a;
        return new qm2(zb3Var.a(nx0Var.b, 0L, nx0Var.i, 0L), 0L, -1L);
    }

    @Override // yads.gy2
    public final long a(long j) {
        if (this.f != null) {
            return r0.size();
        }
        long j2 = this.l;
        if (j2 != -1) {
            return (j2 - this.d) + 1;
        }
        if (j == C.TIME_UNSET) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.b));
        BigInteger multiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i = kp.a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // yads.gy2
    public final qm2 a(long j, mp2 mp2Var) {
        long j2;
        List list = this.f;
        if (list != null) {
            j2 = ((jy2) list.get((int) (j - this.d))).a;
        } else {
            j2 = (j - this.d) * this.e;
        }
        long j3 = j2;
        zb3 zb3Var = this.k;
        nx0 nx0Var = mp2Var.a;
        return new qm2(zb3Var.a(nx0Var.b, j, nx0Var.i, j3), 0L, -1L);
    }
}
