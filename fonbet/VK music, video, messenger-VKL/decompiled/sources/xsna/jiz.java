package xsna;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.c;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: LiveBadgeShape.kt */
/* loaded from: classes17.dex */
public final class jiz implements r5j0 {
    public final long a;
    public final long b;

    public jiz(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // xsna.r5j0
    public final androidx.compose.ui.graphics.c a(long j, LayoutDirection layoutDirection, azl azlVar) {
        float f;
        long j2 = this.a;
        if (pco.a(uco.c(j2), 24) < 0) {
            f = (float) 4.5d;
        } else {
            f = pco.a(uco.c(j2), (float) 36) < 0 ? 5 : 6;
        }
        float I0 = azlVar.I0(f);
        androidx.compose.ui.graphics.a a = androidx.compose.ui.graphics.b.a();
        a.g(p490.e(0L, j), Path.Direction.CounterClockwise);
        androidx.compose.ui.graphics.a a2 = androidx.compose.ui.graphics.b.a();
        float f2 = 4;
        long p1 = azlVar.p1(byc0.b(uco.c(j2) + f2, uco.b(j2) + f2));
        float intBitsToFloat = Float.intBitsToFloat((int) (egi.j(j) >> 32));
        long j3 = this.b;
        zhf0 e = p490.e((Float.floatToRawIntBits((azlVar.I0(rco.a(j3)) + intBitsToFloat) - (Float.intBitsToFloat((int) (p1 >> 32)) / 2.0f)) << 32) | (Float.floatToRawIntBits((azlVar.I0(rco.b(j3)) + Float.intBitsToFloat((int) (egi.j(j) & 4294967295L))) - (Float.intBitsToFloat((int) (p1 & 4294967295L)) / 2.0f)) & 4294967295L), p1);
        long floatToRawIntBits = (Float.floatToRawIntBits(I0) << 32) | (Float.floatToRawIntBits(I0) & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
        long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
        a2.q(new aog0(e.a, e.b, e.c, e.d, floatToRawIntBits2, floatToRawIntBits2, floatToRawIntBits2, floatToRawIntBits2), Path.Direction.CounterClockwise);
        androidx.compose.ui.graphics.a a3 = androidx.compose.ui.graphics.b.a();
        if (a3.x(a, a2, 0)) {
            return new c.a(a3);
        }
        throw new IllegalArgumentException("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
    }
}
