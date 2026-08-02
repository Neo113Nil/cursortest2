package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* loaded from: classes7.dex */
public final class d081 extends tt71 {
    public final lg j;
    public final lg k;
    public final long l;

    public d081(of81 of81Var, long j, long j2, long j3, long j4, long j5, List list, long j6, lg lgVar, lg lgVar2, long j7, long j8) {
        super(of81Var, j, j2, j3, j5, list, j6, j7, j8);
        this.j = lgVar;
        this.k = lgVar2;
        this.l = j4;
    }

    @Override // defpackage.ea81
    public final of81 a(x281 x281Var) {
        lg lgVar = this.j;
        if (lgVar == null) {
            return this.a;
        }
        qd81 qd81Var = x281Var.a;
        return new of81(lgVar.a(0L, 0L, qd81Var.a, qd81Var.A), 0L, -1L);
    }

    @Override // defpackage.tt71
    public final long b(long j) {
        if (this.f != null) {
            return r0.size();
        }
        long j2 = this.l;
        if (j2 != -1) {
            return (j2 - this.d) + 1;
        }
        if (j == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.b));
        BigInteger multiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i = cn61.a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // defpackage.tt71
    public final of81 d(jw71 jw71Var, long j) {
        List list = this.f;
        long j2 = this.d;
        long j3 = list != null ? ((q381) list.get((int) (j - j2))).a : (j - j2) * this.e;
        qd81 qd81Var = jw71Var.a;
        return new of81(this.k.a(j, j3, qd81Var.a, qd81Var.A), 0L, -1L);
    }
}
