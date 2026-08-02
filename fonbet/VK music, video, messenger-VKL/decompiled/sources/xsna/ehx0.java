package xsna;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.c;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: WebOnlineBadgeShape.kt */
/* loaded from: classes17.dex */
public final class ehx0 implements r5j0 {
    public final long a;
    public final long b;

    public ehx0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // xsna.r5j0
    public final androidx.compose.ui.graphics.c a(long j, LayoutDirection layoutDirection, azl azlVar) {
        long b;
        androidx.compose.ui.graphics.a a = androidx.compose.ui.graphics.b.a();
        a.g(p490.e(0L, j), Path.Direction.CounterClockwise);
        androidx.compose.ui.graphics.a a2 = androidx.compose.ui.graphics.b.a();
        long j2 = this.a;
        if (pco.a(uco.c(j2), 12) > 0) {
            float f = 5;
            b = byc0.b(uco.c(j2) + f, uco.b(j2) + f);
        } else {
            float f2 = 4;
            b = byc0.b(uco.c(j2) + f2, uco.b(j2) + f2);
        }
        long p1 = azlVar.p1(b);
        float intBitsToFloat = Float.intBitsToFloat((int) (egi.j(j) >> 32));
        long j3 = this.b;
        float I0 = (azlVar.I0(rco.a(j3)) + intBitsToFloat) - Float.intBitsToFloat((int) (egi.j(p1) >> 32));
        float I02 = (azlVar.I0(rco.b(j3)) + Float.intBitsToFloat((int) (egi.j(j) & 4294967295L))) - Float.intBitsToFloat((int) (egi.j(p1) & 4294967295L));
        Path.u(a2, p490.e((Float.floatToRawIntBits(I02) & 4294967295L) | (Float.floatToRawIntBits(I0) << 32), p1));
        androidx.compose.ui.graphics.a a3 = androidx.compose.ui.graphics.b.a();
        if (a3.x(a, a2, 0)) {
            return new c.a(a3);
        }
        throw new IllegalArgumentException("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
    }
}
