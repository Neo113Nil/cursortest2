package defpackage;

import android.media.MediaParser;
import android.util.Pair;
import java.math.BigInteger;

/* loaded from: classes10.dex */
public final class cgh implements f7q0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ cgh(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.f7q0
    public final e7q0 b(long j) {
        Pair seekPoints;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                dgh dghVar = (dgh) obj;
                long j8 = dghVar.a;
                BigInteger valueOf = BigInteger.valueOf((((gru0) dghVar.E).i * j) / 1000000);
                long j9 = dghVar.b;
                h7q0 h7q0Var = new h7q0(j, tw21.j((valueOf.multiply(BigInteger.valueOf(j9 - j8)).divide(BigInteger.valueOf(dghVar.w)).longValue() + j8) - 30000, dghVar.a, j9 - 1));
                return new e7q0(h7q0Var, h7q0Var);
            default:
                seekPoints = ((MediaParser.SeekMap) obj).getSeekPoints(j);
                Object obj2 = seekPoints.first;
                if (obj2 == seekPoints.second) {
                    MediaParser.SeekPoint l = iy80.l(obj2);
                    j6 = l.timeMicros;
                    j7 = l.position;
                    h7q0 h7q0Var2 = new h7q0(j6, j7);
                    return new e7q0(h7q0Var2, h7q0Var2);
                }
                MediaParser.SeekPoint l2 = iy80.l(obj2);
                j2 = l2.timeMicros;
                j3 = l2.position;
                h7q0 h7q0Var3 = new h7q0(j2, j3);
                MediaParser.SeekPoint l3 = iy80.l(seekPoints.second);
                j4 = l3.timeMicros;
                j5 = l3.position;
                return new e7q0(h7q0Var3, new h7q0(j4, j5));
        }
    }

    @Override // defpackage.f7q0
    public final boolean c() {
        boolean isSeekable;
        switch (this.a) {
            case 0:
                return true;
            default:
                isSeekable = ((MediaParser.SeekMap) this.b).isSeekable();
                return isSeekable;
        }
    }

    @Override // defpackage.f7q0
    public final long k() {
        long durationMicros;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (((dgh) obj).w * 1000000) / ((gru0) r5.E).i;
            default:
                durationMicros = ((MediaParser.SeekMap) obj).getDurationMicros();
                if (durationMicros != -2147483648L) {
                    return durationMicros;
                }
                return -9223372036854775807L;
        }
    }
}
