package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCP.math.BigIntr;
import ru.CryptoPro.JCP.math.EllipticCurve;
import ru.CryptoPro.JCP.math.EllipticPoint;
import ru.CryptoPro.JCP.tools.Array;

/* loaded from: classes4.dex */
public final class gw61 extends EllipticPoint {
    public BigIntr c;
    public BigIntr d;
    public BigIntr e;
    public gw61[] f = null;
    public zu61 g;
    public int h;
    public int i;
    public int j;

    public gw61(zu61 zu61Var, BigIntr bigIntr, BigIntr bigIntr2, BigIntr bigIntr3, boolean z) {
        int intLength = zu61Var.getP().getIntLength();
        this.h = intLength;
        this.i = intLength == 8 ? 4 : 8;
        this.j = intLength == 8 ? 1 : 8;
        if (z) {
            this.c = bigIntr;
            this.d = bigIntr2;
            this.e = bigIntr3;
        } else {
            this.c = new BigIntr(bigIntr, intLength);
            this.d = new BigIntr(bigIntr2, intLength);
            this.e = new BigIntr(bigIntr3, intLength);
        }
        this.g = zu61Var;
    }

    public static void b(zu61 zu61Var, BigIntr bigIntr, BigIntr bigIntr2, BigIntr bigIntr3, BigIntr bigIntr4, BigIntr bigIntr5, BigIntr bigIntr6, BigIntr bigIntr7, BigIntr bigIntr8, BigIntr bigIntr9, BigIntr bigIntr10, BigIntr bigIntr11, BigIntr bigIntr12, BigIntr bigIntr13, long[] jArr, int[] iArr) {
        if (d(bigIntr4, bigIntr6)) {
            bigIntr.setMag(bigIntr7);
            bigIntr2.setMag(bigIntr8);
            bigIntr3.setMag(bigIntr9);
            return;
        }
        if (d(bigIntr7, bigIntr9)) {
            bigIntr.setMag(bigIntr4);
            bigIntr2.setMag(bigIntr5);
            bigIntr3.setMag(bigIntr6);
            return;
        }
        new gw61(zu61Var, bigIntr7, bigIntr8, bigIntr9, false);
        BigIntr p = zu61Var.getP();
        p.getIntLength();
        BigIntr.e(bigIntr4, bigIntr4, bigIntr9, p, zu61Var.getOptFlag(), jArr);
        BigIntr.e(bigIntr5, bigIntr5, bigIntr9, p, zu61Var.getOptFlag(), jArr);
        BigIntr.e(bigIntr7, bigIntr7, bigIntr6, p, zu61Var.getOptFlag(), jArr);
        BigIntr.e(bigIntr8, bigIntr8, bigIntr6, p, zu61Var.getOptFlag(), jArr);
        BigIntr.e(bigIntr6, bigIntr6, bigIntr9, p, zu61Var.getOptFlag(), jArr);
        bigIntr9.setMag(bigIntr6);
        if (bigIntr4.equals(bigIntr7)) {
            if (bigIntr5.equals(bigIntr8)) {
                c(zu61Var, bigIntr, bigIntr2, bigIntr3, bigIntr4, bigIntr5, bigIntr6, bigIntr13, bigIntr10, bigIntr11, bigIntr12, jArr, iArr);
                return;
            }
            gw61 gw61Var = new gw61(zu61Var);
            bigIntr.setMag(gw61Var.c);
            bigIntr2.setMag(gw61Var.d);
            bigIntr3.setMag(gw61Var.e);
            return;
        }
        BigIntr p2 = zu61Var.getP();
        p2.getIntLength();
        BigIntr.d(bigIntr3, bigIntr7, bigIntr4, p2);
        BigIntr.i(bigIntr10, bigIntr7, bigIntr4, p2);
        BigIntr.d(bigIntr11, bigIntr8, bigIntr5, p2);
        BigIntr.c(bigIntr13, bigIntr11, p2, zu61Var.getOptFlag(), jArr);
        BigIntr.e(bigIntr, bigIntr13, bigIntr3, p2, zu61Var.getOptFlag(), jArr);
        BigIntr.e(bigIntr, bigIntr, bigIntr6, p2, zu61Var.getOptFlag(), jArr);
        BigIntr.c(bigIntr12, bigIntr3, p2, zu61Var.getOptFlag(), jArr);
        BigIntr.b(bigIntr2, bigIntr4, p2);
        BigIntr.i(bigIntr2, bigIntr7, bigIntr2, p2);
        BigIntr.e(bigIntr2, bigIntr2, bigIntr12, p2, zu61Var.getOptFlag(), jArr);
        BigIntr.e(bigIntr13, bigIntr6, bigIntr13, p2, zu61Var.getOptFlag(), jArr);
        BigIntr.d(bigIntr2, bigIntr2, bigIntr13, p2);
        BigIntr.e(bigIntr2, bigIntr2, bigIntr11, p2, zu61Var.getOptFlag(), jArr);
        BigIntr.e(bigIntr12, bigIntr3, bigIntr12, p2, zu61Var.getOptFlag(), jArr);
        BigIntr.e(bigIntr13, bigIntr10, bigIntr12, p2, zu61Var.getOptFlag(), jArr);
        BigIntr.d(bigIntr, bigIntr, bigIntr13, p2);
        BigIntr.e(bigIntr3, bigIntr6, bigIntr12, p2, zu61Var.getOptFlag(), jArr);
        BigIntr.e(bigIntr12, bigIntr5, bigIntr12, p2, zu61Var.getOptFlag(), jArr);
        BigIntr.d(bigIntr2, bigIntr2, bigIntr12, p2);
    }

    public static void c(zu61 zu61Var, BigIntr bigIntr, BigIntr bigIntr2, BigIntr bigIntr3, BigIntr bigIntr4, BigIntr bigIntr5, BigIntr bigIntr6, BigIntr bigIntr7, BigIntr bigIntr8, BigIntr bigIntr9, BigIntr bigIntr10, long[] jArr, int[] iArr) {
        if (d(bigIntr4, bigIntr6)) {
            bigIntr.setMag(bigIntr4);
            bigIntr2.setMag(bigIntr5);
            bigIntr3.setMag(bigIntr6);
            return;
        }
        BigIntr p = zu61Var.getP();
        BigIntr.c(bigIntr, bigIntr4, p, zu61Var.getOptFlag(), jArr);
        int[] iArr2 = bigIntr.a;
        int[] iArr3 = p.a;
        r5a1.i(iArr, iArr2, iArr2, iArr3);
        r5a1.i(iArr2, iArr, iArr2, iArr3);
        BigIntr.e(bigIntr2, zu61Var.d, bigIntr6, p, zu61Var.getOptFlag(), jArr);
        BigIntr.e(bigIntr2, bigIntr2, bigIntr6, p, zu61Var.getOptFlag(), jArr);
        BigIntr.i(bigIntr8, bigIntr, bigIntr2, p);
        BigIntr.e(bigIntr10, bigIntr5, bigIntr6, p, zu61Var.getOptFlag(), jArr);
        BigIntr.e(bigIntr, bigIntr4, bigIntr10, p, zu61Var.getOptFlag(), jArr);
        BigIntr.e(bigIntr9, bigIntr, bigIntr5, p, zu61Var.getOptFlag(), jArr);
        BigIntr.c(bigIntr, bigIntr8, p, zu61Var.getOptFlag(), jArr);
        BigIntr.c(bigIntr3, bigIntr10, p, zu61Var.getOptFlag(), jArr);
        int[] iArr4 = bigIntr2.a;
        int[] iArr5 = bigIntr9.a;
        int[] iArr6 = p.a;
        r5a1.i(iArr, iArr5, iArr5, iArr6);
        r5a1.i(iArr, iArr, iArr, iArr6);
        r5a1.i(iArr4, iArr, iArr, iArr6);
        r5a1.i(iArr4, iArr4, iArr, iArr6);
        BigIntr.d(bigIntr2, bigIntr2, bigIntr, p);
        BigIntr.e(bigIntr2, bigIntr8, bigIntr2, p, zu61Var.getOptFlag(), jArr);
        BigIntr.h(bigIntr8, bigIntr3, p);
        BigIntr.c(bigIntr7, bigIntr5, p, zu61Var.getOptFlag(), jArr);
        BigIntr.e(bigIntr8, bigIntr7, bigIntr8, p, zu61Var.getOptFlag(), jArr);
        BigIntr.d(bigIntr2, bigIntr2, bigIntr8, p);
        BigIntr.e(bigIntr8, bigIntr10, bigIntr3, p, zu61Var.getOptFlag(), jArr);
        BigIntr.h(bigIntr3, bigIntr8, p);
        BigIntr.h(bigIntr8, bigIntr9, p);
        BigIntr.d(bigIntr, bigIntr, bigIntr8, p);
        BigIntr.e(bigIntr, bigIntr10, bigIntr, p, zu61Var.getOptFlag(), jArr);
        BigIntr.b(bigIntr, bigIntr, p);
    }

    public static boolean d(BigIntr bigIntr, BigIntr bigIntr2) {
        return bigIntr.isZero() && bigIntr2.isZero();
    }

    public final gw61 a(BigIntr bigIntr, BigIntr bigIntr2, BigIntr bigIntr3, BigIntr bigIntr4, long[] jArr, int[] iArr) {
        int i = this.h;
        zu61 zu61Var = this.g;
        if (isNull()) {
            return new gw61(zu61Var);
        }
        BigIntr bigIntr5 = BigIntr.ZERO;
        BigIntr bigIntr6 = new BigIntr(bigIntr5, i);
        BigIntr bigIntr7 = new BigIntr(bigIntr5, i);
        BigIntr bigIntr8 = new BigIntr(bigIntr5, i);
        BigIntr p = zu61Var.getP();
        BigIntr.c(bigIntr6, this.c, p, zu61Var.getOptFlag(), jArr);
        int[] iArr2 = bigIntr6.a;
        int[] iArr3 = p.a;
        r5a1.i(iArr, iArr2, iArr2, iArr3);
        r5a1.i(iArr2, iArr, iArr2, iArr3);
        BigIntr.e(bigIntr7, zu61Var.d, this.e, p, zu61Var.getOptFlag(), jArr);
        BigIntr.e(bigIntr7, bigIntr7, this.e, p, zu61Var.getOptFlag(), jArr);
        BigIntr.i(bigIntr2, bigIntr6, bigIntr7, p);
        BigIntr.e(bigIntr4, this.d, this.e, p, zu61Var.getOptFlag(), jArr);
        BigIntr.e(bigIntr6, this.c, bigIntr4, p, zu61Var.getOptFlag(), jArr);
        BigIntr.e(bigIntr3, bigIntr6, this.d, p, zu61Var.getOptFlag(), jArr);
        BigIntr.c(bigIntr6, bigIntr2, p, zu61Var.getOptFlag(), jArr);
        BigIntr.c(bigIntr8, bigIntr4, p, zu61Var.getOptFlag(), jArr);
        int[] iArr4 = bigIntr7.a;
        int[] iArr5 = bigIntr3.a;
        int[] iArr6 = p.a;
        r5a1.i(iArr, iArr5, iArr5, iArr6);
        r5a1.i(iArr, iArr, iArr, iArr6);
        r5a1.i(iArr4, iArr, iArr, iArr6);
        r5a1.i(iArr4, iArr4, iArr, iArr6);
        BigIntr.d(bigIntr7, bigIntr7, bigIntr6, p);
        BigIntr.e(bigIntr7, bigIntr2, bigIntr7, p, zu61Var.getOptFlag(), jArr);
        BigIntr.h(bigIntr2, bigIntr8, p);
        BigIntr.c(bigIntr, this.d, p, zu61Var.getOptFlag(), jArr);
        BigIntr.e(bigIntr2, bigIntr, bigIntr2, p, zu61Var.getOptFlag(), jArr);
        BigIntr.d(bigIntr7, bigIntr7, bigIntr2, p);
        BigIntr.e(bigIntr2, bigIntr4, bigIntr8, p, zu61Var.getOptFlag(), jArr);
        BigIntr.h(bigIntr8, bigIntr2, p);
        BigIntr.h(bigIntr2, bigIntr3, p);
        BigIntr.d(bigIntr6, bigIntr6, bigIntr2, p);
        BigIntr.e(bigIntr6, bigIntr4, bigIntr6, p, zu61Var.getOptFlag(), jArr);
        BigIntr.b(bigIntr6, bigIntr6, p);
        return new gw61(this.g, bigIntr6, bigIntr7, bigIntr8, true);
    }

    @Override // ru.CryptoPro.JCP.math.EllipticPoint
    public final EllipticPoint add(EllipticPoint ellipticPoint) {
        BigIntr bigIntr;
        BigIntr bigIntr2;
        BigIntr bigIntr3;
        BigIntr bigIntr4;
        BigIntr bigIntr5;
        int[] iArr;
        BigIntr bigIntr6;
        BigIntr bigIntr7 = this.d;
        BigIntr bigIntr8 = this.c;
        int i = this.h;
        zu61 zu61Var = this.g;
        if (!(ellipticPoint instanceof gw61)) {
            ny61.g("Wrong point type");
            return null;
        }
        gw61 gw61Var = (gw61) ellipticPoint;
        BigIntr bigIntr9 = gw61Var.d;
        BigIntr bigIntr10 = gw61Var.c;
        if (isNull()) {
            return gw61Var;
        }
        if (ellipticPoint.isNull()) {
            return this;
        }
        long[] jArr = new long[(i * 2) + 1];
        int[] iArr2 = new int[i];
        BigIntr bigIntr11 = BigIntr.ZERO;
        BigIntr bigIntr12 = new BigIntr(bigIntr11, i);
        BigIntr bigIntr13 = new BigIntr(bigIntr11, i);
        BigIntr bigIntr14 = new BigIntr(bigIntr11, i);
        BigIntr bigIntr15 = new BigIntr(bigIntr11, i);
        BigIntr p = zu61Var.getP();
        if (this == gw61Var) {
            bigIntr4 = bigIntr12;
            bigIntr5 = bigIntr11;
            bigIntr3 = bigIntr13;
            bigIntr2 = bigIntr14;
            bigIntr = bigIntr15;
            iArr = iArr2;
            bigIntr6 = p;
        } else {
            bigIntr = bigIntr15;
            BigIntr p2 = zu61Var.getP();
            BigIntr bigIntr16 = this.c;
            bigIntr2 = bigIntr14;
            bigIntr3 = bigIntr13;
            bigIntr4 = bigIntr12;
            bigIntr5 = bigIntr11;
            iArr = iArr2;
            bigIntr6 = p;
            BigIntr.e(bigIntr16, bigIntr16, gw61Var.e, p2, zu61Var.getOptFlag(), jArr);
            BigIntr bigIntr17 = this.d;
            BigIntr.e(bigIntr17, bigIntr17, gw61Var.e, p2, zu61Var.getOptFlag(), jArr);
            BigIntr bigIntr18 = gw61Var.c;
            BigIntr.e(bigIntr18, bigIntr18, this.e, p2, zu61Var.getOptFlag(), jArr);
            BigIntr bigIntr19 = gw61Var.d;
            BigIntr.e(bigIntr19, bigIntr19, this.e, p2, zu61Var.getOptFlag(), jArr);
            BigIntr bigIntr20 = this.e;
            BigIntr.e(bigIntr20, bigIntr20, gw61Var.e, p2, zu61Var.getOptFlag(), jArr);
            gw61Var.e.setMag(this.e);
        }
        if (bigIntr8.equals(bigIntr10)) {
            if (!bigIntr7.equals(bigIntr9)) {
                return new gw61(zu61Var);
            }
            return a(bigIntr4, bigIntr, bigIntr3, bigIntr2, jArr, iArr);
        }
        BigIntr bigIntr21 = bigIntr4;
        BigIntr bigIntr22 = bigIntr;
        BigIntr bigIntr23 = bigIntr2;
        BigIntr bigIntr24 = bigIntr3;
        BigIntr bigIntr25 = new BigIntr(bigIntr5, i);
        BigIntr bigIntr26 = new BigIntr(bigIntr5, i);
        BigIntr subCSP = bigIntr10.subCSP(bigIntr8, bigIntr6);
        BigIntr.i(bigIntr21, bigIntr10, bigIntr8, bigIntr6);
        BigIntr.d(bigIntr24, bigIntr9, bigIntr7, bigIntr6);
        BigIntr.c(bigIntr23, bigIntr24, bigIntr6, zu61Var.getOptFlag(), jArr);
        BigIntr bigIntr27 = bigIntr6;
        BigIntr.e(bigIntr25, bigIntr23, subCSP, bigIntr27, zu61Var.getOptFlag(), jArr);
        BigIntr.e(bigIntr25, bigIntr25, this.e, bigIntr27, zu61Var.getOptFlag(), jArr);
        BigIntr.c(bigIntr22, subCSP, bigIntr27, zu61Var.getOptFlag(), jArr);
        BigIntr.b(bigIntr26, bigIntr8, bigIntr27);
        BigIntr.i(bigIntr26, bigIntr10, bigIntr26, bigIntr27);
        BigIntr.e(bigIntr26, bigIntr26, bigIntr22, bigIntr27, zu61Var.getOptFlag(), jArr);
        BigIntr bigIntr28 = bigIntr2;
        BigIntr.e(bigIntr28, this.e, bigIntr2, bigIntr27, zu61Var.getOptFlag(), jArr);
        BigIntr.d(bigIntr26, bigIntr26, bigIntr28, bigIntr27);
        BigIntr bigIntr29 = bigIntr3;
        BigIntr.e(bigIntr26, bigIntr26, bigIntr29, bigIntr27, zu61Var.getOptFlag(), jArr);
        BigIntr.e(bigIntr22, subCSP, bigIntr22, bigIntr27, zu61Var.getOptFlag(), jArr);
        BigIntr.e(bigIntr28, bigIntr21, bigIntr22, bigIntr27, zu61Var.getOptFlag(), jArr);
        BigIntr.d(bigIntr25, bigIntr25, bigIntr28, bigIntr27);
        BigIntr.e(subCSP, this.e, bigIntr22, bigIntr27, zu61Var.getOptFlag(), jArr);
        BigIntr.e(bigIntr22, this.d, bigIntr22, bigIntr27, zu61Var.getOptFlag(), jArr);
        BigIntr.d(bigIntr26, bigIntr26, bigIntr22, bigIntr27);
        gw61 gw61Var2 = new gw61(this.g, bigIntr25, bigIntr26, subCSP, true);
        bigIntr21.clear();
        bigIntr29.clear();
        bigIntr28.clear();
        bigIntr22.clear();
        Arrays.fill(jArr, 0, (i * 2) + 1, 0L);
        Array.clear(iArr);
        return gw61Var2;
    }

    @Override // ru.CryptoPro.JCP.math.EllipticPoint
    public final boolean equals(EllipticPoint ellipticPoint) {
        int i = this.h;
        zu61 zu61Var = this.g;
        if (!(ellipticPoint instanceof gw61)) {
            ny61.g("Wrong point type");
            return false;
        }
        gw61 gw61Var = (gw61) ellipticPoint;
        if (isNull() || gw61Var.isNull()) {
            return isNull() && gw61Var.isNull();
        }
        BigIntr bigIntr = new BigIntr(i);
        BigIntr bigIntr2 = new BigIntr(i);
        long[] jArr = new long[(i * 2) + 1];
        BigIntr.e(bigIntr, this.c, gw61Var.e, zu61Var.getP(), zu61Var.getOptFlag(), jArr);
        BigIntr.e(bigIntr2, gw61Var.c, this.e, zu61Var.getP(), zu61Var.getOptFlag(), jArr);
        boolean equals = bigIntr.equals(bigIntr2);
        BigIntr.e(bigIntr, this.d, gw61Var.e, zu61Var.getP(), zu61Var.getOptFlag(), jArr);
        BigIntr.e(bigIntr2, gw61Var.d, this.e, zu61Var.getP(), zu61Var.getOptFlag(), jArr);
        return equals && bigIntr.equals(bigIntr2);
    }

    @Override // ru.CryptoPro.JCP.math.EllipticPoint
    public final EllipticPoint generateTable() {
        gw61 gw61Var = this;
        int i = gw61Var.h;
        long[] jArr = new long[(i * 2) + 1];
        BigIntr bigIntr = BigIntr.ZERO;
        BigIntr bigIntr2 = new BigIntr(bigIntr, i);
        BigIntr bigIntr3 = new BigIntr(bigIntr, i);
        BigIntr bigIntr4 = new BigIntr(bigIntr, i);
        BigIntr bigIntr5 = new BigIntr(bigIntr, i);
        int[] iArr = new int[i];
        int i2 = gw61Var.i;
        int i3 = ((i << 5) / i2) + 1;
        BigIntr bigIntr6 = new BigIntr(i);
        gw61[] gw61VarArr = new gw61[i3 << 1];
        gw61Var.f = gw61VarArr;
        gw61VarArr[0] = new gw61(gw61Var.g, gw61Var.c, gw61Var.d, gw61Var.e, false);
        zu61 zu61Var = gw61Var.g;
        BigIntr.d(bigIntr6, zu61Var.getP(), gw61Var.d, zu61Var.getP());
        gw61Var.f[i3] = new gw61(gw61Var.g, gw61Var.c, bigIntr6, gw61Var.e, false);
        int i4 = 1;
        while (i4 < i3) {
            gw61[] gw61VarArr2 = gw61Var.f;
            zu61 zu61Var2 = gw61Var.g;
            gw61 gw61Var2 = gw61VarArr2[i4 - 1];
            zu61 zu61Var3 = zu61Var;
            gw61VarArr2[i4] = new gw61(zu61Var2, gw61Var2.c, gw61Var2.d, gw61Var2.e, false);
            for (int i5 = 0; i5 < i2; i5++) {
                gw61[] gw61VarArr3 = gw61Var.f;
                gw61VarArr3[i4] = gw61VarArr3[i4].a(bigIntr2, bigIntr4, bigIntr3, bigIntr5, jArr, iArr);
            }
            BigIntr.d(bigIntr6, zu61Var3.getP(), gw61Var.f[i4].d, zu61Var3.getP());
            gw61[] gw61VarArr4 = gw61Var.f;
            zu61 zu61Var4 = gw61Var.g;
            gw61 gw61Var3 = gw61VarArr4[i4];
            gw61VarArr4[i4 + i3] = new gw61(zu61Var4, gw61Var3.c, bigIntr6, gw61Var3.e, false);
            i4++;
            gw61Var = this;
            zu61Var = zu61Var3;
        }
        bigIntr6.clear();
        return this;
    }

    @Override // ru.CryptoPro.JCP.math.EllipticPoint
    public final int getCurveType() {
        return 0;
    }

    @Override // ru.CryptoPro.JCP.math.EllipticPoint
    public final BigIntr getU() {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.math.EllipticPoint
    public final BigIntr getV() {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.math.EllipticPoint
    public final BigIntr getX() {
        return this.c;
    }

    @Override // ru.CryptoPro.JCP.math.EllipticPoint
    public final BigIntr getY() {
        return this.d;
    }

    @Override // ru.CryptoPro.JCP.math.EllipticPoint
    public final boolean isNull() {
        return this.c.isZero() && this.e.isZero();
    }

    @Override // ru.CryptoPro.JCP.math.EllipticPoint
    public final boolean onCurve(EllipticCurve ellipticCurve) {
        BigIntr bigIntr;
        BigIntr bigIntr2;
        BigIntr bigIntr3 = this.d;
        BigIntr bigIntr4 = this.c;
        BigIntr bigIntr5 = this.e;
        int i = this.h;
        long[] jArr = new long[(i * 2) + 1];
        BigIntr bigIntr6 = BigIntr.ONE;
        BigIntr bigIntr7 = new BigIntr(bigIntr6, i);
        BigIntr bigIntr8 = new BigIntr(bigIntr6, i);
        BigIntr bigIntr9 = new BigIntr(bigIntr6, i);
        if (!(ellipticCurve instanceof zu61)) {
            ny61.g("Wrong curve type");
            return false;
        }
        zu61 zu61Var = (zu61) ellipticCurve;
        if (isNull()) {
            return true;
        }
        BigIntr p = zu61Var.getP();
        if (bigIntr5.equals(i == 8 ? EllipticPoint.a : EllipticPoint.b)) {
            BigIntr.e(bigIntr7, zu61Var.d, this.c, p, zu61Var.getOptFlag(), jArr);
            bigIntr = bigIntr7;
            BigIntr.i(bigIntr, bigIntr, zu61Var.e, p);
            BigIntr.c(bigIntr8, bigIntr4, p, zu61Var.getOptFlag(), jArr);
            bigIntr2 = bigIntr8;
            BigIntr.e(bigIntr2, bigIntr8, this.c, p, zu61Var.getOptFlag(), jArr);
            BigIntr.i(bigIntr, bigIntr2, bigIntr, p);
            BigIntr.c(bigIntr2, bigIntr3, p, zu61Var.getOptFlag(), jArr);
        } else {
            bigIntr = bigIntr7;
            BigIntr.c(bigIntr9, bigIntr5, p, zu61Var.getOptFlag(), jArr);
            BigIntr.e(bigIntr8, bigIntr9, zu61Var.e, p, zu61Var.getOptFlag(), jArr);
            BigIntr.c(bigIntr, bigIntr3, p, zu61Var.getOptFlag(), jArr);
            BigIntr.d(bigIntr, bigIntr, bigIntr8, p);
            BigIntr.e(bigIntr, bigIntr, this.e, p, zu61Var.getOptFlag(), jArr);
            BigIntr.e(bigIntr9, bigIntr9, zu61Var.d, p, zu61Var.getOptFlag(), jArr);
            BigIntr.c(bigIntr8, bigIntr4, p, zu61Var.getOptFlag(), jArr);
            BigIntr.i(bigIntr8, bigIntr8, bigIntr9, p);
            bigIntr2 = bigIntr8;
            BigIntr.e(bigIntr2, bigIntr8, this.c, p, zu61Var.getOptFlag(), jArr);
        }
        return bigIntr.equals(bigIntr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x01d8 A[LOOP:2: B:22:0x01d6->B:23:0x01d8, LOOP_END] */
    @Override // ru.CryptoPro.JCP.math.EllipticPoint
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final EllipticPoint powerHEX(BigIntr bigIntr, boolean z) {
        int[] iArr;
        int[] iArr2;
        gw61[] gw61VarArr;
        BigIntr bigIntr2;
        long[] jArr;
        int i;
        int i2 = this.h;
        long[] jArr2 = new long[(i2 * 2) + 1];
        BigIntr bigIntr3 = BigIntr.ZERO;
        BigIntr bigIntr4 = new BigIntr(bigIntr3, i2);
        BigIntr bigIntr5 = new BigIntr(bigIntr3, i2);
        BigIntr bigIntr6 = new BigIntr(bigIntr3, i2);
        BigIntr bigIntr7 = new BigIntr(bigIntr3, i2);
        int[] iArr3 = new int[i2];
        BigIntr bigIntr8 = new BigIntr(bigIntr3, i2);
        BigIntr bigIntr9 = new BigIntr(bigIntr3, i2);
        BigIntr bigIntr10 = new BigIntr(bigIntr3, i2);
        BigIntr bigIntr11 = new BigIntr(bigIntr3, i2);
        BigIntr bigIntr12 = new BigIntr(bigIntr3, i2);
        BigIntr bigIntr13 = new BigIntr(bigIntr3, i2);
        boolean isNull = isNull();
        zu61 zu61Var = this.g;
        if (isNull) {
            return new gw61(zu61Var);
        }
        gw61[] gw61VarArr2 = new gw61[32];
        gw61VarArr2[0] = new gw61(zu61Var, this.c, this.d, this.e, false);
        BigIntr bigIntr14 = bigIntr8;
        BigIntr bigIntr15 = bigIntr9;
        c(this.g, bigIntr11, bigIntr12, bigIntr13, this.c, this.d, this.e, bigIntr6, bigIntr7, bigIntr5, bigIntr4, jArr2, iArr3);
        BigIntr bigIntr16 = bigIntr13;
        BigIntr bigIntr17 = bigIntr10;
        BigIntr bigIntr18 = bigIntr5;
        int i3 = 1;
        for (int i4 = 32; i3 < i4; i4 = i4) {
            int i5 = i3;
            zu61 zu61Var2 = this.g;
            gw61 gw61Var = gw61VarArr2[i5 - 1];
            BigIntr bigIntr19 = bigIntr6;
            BigIntr bigIntr20 = bigIntr11;
            BigIntr bigIntr21 = bigIntr14;
            BigIntr bigIntr22 = bigIntr4;
            BigIntr bigIntr23 = bigIntr7;
            BigIntr bigIntr24 = bigIntr12;
            BigIntr bigIntr25 = bigIntr15;
            long[] jArr3 = jArr2;
            b(zu61Var2, bigIntr21, bigIntr25, bigIntr17, gw61Var.c, gw61Var.d, gw61Var.e, bigIntr20, bigIntr24, bigIntr16, bigIntr19, bigIntr23, bigIntr18, bigIntr22, jArr3, iArr3);
            bigIntr6 = bigIntr19;
            bigIntr4 = bigIntr22;
            bigIntr14 = bigIntr21;
            bigIntr7 = bigIntr23;
            jArr2 = jArr3;
            bigIntr15 = bigIntr25;
            BigIntr bigIntr26 = bigIntr17;
            bigIntr17 = bigIntr26;
            gw61VarArr2[i5] = new gw61(this.g, bigIntr14, bigIntr15, bigIntr26, false);
            bigIntr11 = bigIntr20;
            i3 = i5 + 1;
            bigIntr12 = bigIntr24;
            bigIntr16 = bigIntr16;
        }
        int[] iArr4 = new int[1];
        int[] iArr5 = new int[80];
        int[] iArr6 = new int[80];
        BigIntr.f(bigIntr, iArr5, iArr6, iArr4);
        int i6 = iArr4[0];
        BigIntr bigIntr27 = BigIntr.ZERO;
        BigIntr bigIntr28 = new BigIntr(bigIntr27, i2);
        BigIntr bigIntr29 = new BigIntr(BigIntr.ONE, i2);
        BigIntr bigIntr30 = new BigIntr(bigIntr27, i2);
        BigIntr bigIntr31 = bigIntr14;
        int[] iArr7 = iArr6;
        BigIntr bigIntr32 = bigIntr31;
        BigIntr bigIntr33 = bigIntr29;
        BigIntr bigIntr34 = bigIntr30;
        int[] iArr8 = iArr5;
        BigIntr bigIntr35 = bigIntr15;
        while (i6 > 0) {
            int i7 = i6 - 1;
            int i8 = iArr8[i7];
            int i9 = i2;
            int i10 = iArr7[i7];
            int i11 = i6 - 1;
            gw61 gw61Var2 = gw61VarArr2[(i10 > 0 ? i10 - 1 : (-i10) - 1) / 2];
            if (i10 > 0) {
                int[] iArr9 = iArr7;
                bigIntr2 = bigIntr4;
                BigIntr bigIntr36 = bigIntr6;
                iArr2 = iArr9;
                jArr = jArr2;
                BigIntr bigIntr37 = bigIntr7;
                iArr = iArr8;
                b(this.g, bigIntr32, bigIntr35, bigIntr17, bigIntr28, bigIntr33, bigIntr34, gw61Var2.c, gw61Var2.d, gw61Var2.e, bigIntr36, bigIntr37, bigIntr18, bigIntr2, jArr, iArr3);
                bigIntr6 = bigIntr36;
                bigIntr7 = bigIntr37;
                gw61VarArr = gw61VarArr2;
            } else {
                iArr = iArr8;
                iArr2 = iArr7;
                if (i10 < 0) {
                    zu61 zu61Var3 = this.g;
                    BigIntr bigIntr38 = gw61Var2.c;
                    BigIntr bigIntr39 = gw61Var2.d;
                    BigIntr bigIntr40 = gw61Var2.e;
                    if (d(bigIntr38, bigIntr40)) {
                        bigIntr32.setMag(bigIntr28);
                        bigIntr35.setMag(bigIntr33);
                        bigIntr17.setMag(bigIntr34);
                        gw61VarArr = gw61VarArr2;
                    } else {
                        gw61VarArr = gw61VarArr2;
                        int intLength = zu61Var3.getP().getIntLength();
                        BigIntr bigIntr41 = bigIntr33;
                        BigIntr bigIntr42 = bigIntr7;
                        BigIntr.d(bigIntr6, zu61Var3.getP(), bigIntr39, zu61Var3.getP());
                        if (d(bigIntr28, bigIntr34)) {
                            bigIntr32.setMag(bigIntr38);
                            bigIntr35.setMag(bigIntr6);
                            bigIntr17.setMag(bigIntr40);
                            bigIntr7 = bigIntr42;
                            bigIntr33 = bigIntr41;
                        } else {
                            bigIntr33 = bigIntr41;
                            bigIntr2 = bigIntr4;
                            jArr = jArr2;
                            BigIntr bigIntr43 = bigIntr6;
                            b(zu61Var3, bigIntr32, bigIntr35, bigIntr17, bigIntr28, bigIntr33, bigIntr34, new BigIntr(bigIntr38, intLength), new BigIntr(bigIntr6, intLength), new BigIntr(bigIntr40, intLength), bigIntr43, bigIntr42, bigIntr18, bigIntr2, jArr, iArr3);
                            bigIntr6 = bigIntr43;
                            bigIntr7 = bigIntr42;
                        }
                    }
                    BigIntr bigIntr44 = bigIntr28;
                    bigIntr28 = bigIntr32;
                    bigIntr32 = bigIntr44;
                    BigIntr bigIntr45 = bigIntr33;
                    bigIntr33 = bigIntr35;
                    bigIntr35 = bigIntr45;
                    BigIntr bigIntr46 = bigIntr34;
                    bigIntr34 = bigIntr17;
                    bigIntr17 = bigIntr46;
                    i = 0;
                    while (i < i8) {
                        BigIntr bigIntr47 = bigIntr18;
                        c(this.g, bigIntr32, bigIntr35, bigIntr17, bigIntr28, bigIntr33, bigIntr34, bigIntr6, bigIntr7, bigIntr47, bigIntr4, jArr2, iArr3);
                        bigIntr18 = bigIntr47;
                        i++;
                        BigIntr bigIntr48 = bigIntr28;
                        bigIntr28 = bigIntr32;
                        bigIntr32 = bigIntr48;
                        BigIntr bigIntr49 = bigIntr33;
                        bigIntr33 = bigIntr35;
                        bigIntr35 = bigIntr49;
                        BigIntr bigIntr50 = bigIntr34;
                        bigIntr34 = bigIntr17;
                        bigIntr17 = bigIntr50;
                    }
                    i2 = i9;
                    i6 = i11;
                    iArr7 = iArr2;
                    iArr8 = iArr;
                    gw61VarArr2 = gw61VarArr;
                } else {
                    gw61VarArr = gw61VarArr2;
                    i = 0;
                    while (i < i8) {
                    }
                    i2 = i9;
                    i6 = i11;
                    iArr7 = iArr2;
                    iArr8 = iArr;
                    gw61VarArr2 = gw61VarArr;
                }
            }
            bigIntr4 = bigIntr2;
            jArr2 = jArr;
            BigIntr bigIntr442 = bigIntr28;
            bigIntr28 = bigIntr32;
            bigIntr32 = bigIntr442;
            BigIntr bigIntr452 = bigIntr33;
            bigIntr33 = bigIntr35;
            bigIntr35 = bigIntr452;
            BigIntr bigIntr462 = bigIntr34;
            bigIntr34 = bigIntr17;
            bigIntr17 = bigIntr462;
            i = 0;
            while (i < i8) {
            }
            i2 = i9;
            i6 = i11;
            iArr7 = iArr2;
            iArr8 = iArr;
            gw61VarArr2 = gw61VarArr;
        }
        int i12 = i2;
        gw61 gw61Var3 = new gw61(this.g, bigIntr28, bigIntr33, bigIntr34, true);
        if (z) {
            gw61Var3.toZ1();
        }
        Arrays.fill(jArr2, 0, (i12 * 2) + 1, 0L);
        Array.clear(iArr3);
        bigIntr4.clear();
        bigIntr18.clear();
        bigIntr6.clear();
        bigIntr7.clear();
        bigIntr32.clear();
        bigIntr35.clear();
        bigIntr17.clear();
        return gw61Var3;
    }

    @Override // ru.CryptoPro.JCP.math.EllipticPoint
    public final EllipticPoint powerTAB(BigIntr bigIntr, boolean z) {
        int[] iArr;
        int i;
        int[] iArr2;
        int[] iArr3;
        BigIntr bigIntr2;
        BigIntr bigIntr3;
        BigIntr bigIntr4;
        BigIntr bigIntr5;
        BigIntr bigIntr6;
        long[] jArr;
        BigIntr bigIntr7;
        long[] jArr2;
        BigIntr bigIntr8;
        BigIntr bigIntr9;
        BigIntr bigIntr10;
        BigIntr bigIntr11;
        BigIntr bigIntr12;
        long[] jArr3;
        BigIntr bigIntr13;
        BigIntr bigIntr14;
        BigIntr bigIntr15;
        BigIntr bigIntr16;
        BigIntr bigIntr17;
        BigIntr bigIntr18;
        int i2;
        int i3;
        BigIntr bigIntr19;
        BigIntr bigIntr20;
        BigIntr bigIntr21;
        int i4;
        BigIntr bigIntr22;
        BigIntr bigIntr23;
        BigIntr bigIntr24;
        BigIntr bigIntr25;
        BigIntr bigIntr26;
        BigIntr bigIntr27;
        BigIntr bigIntr28;
        BigIntr bigIntr29;
        BigIntr bigIntr30;
        BigIntr bigIntr31;
        BigIntr bigIntr32;
        BigIntr bigIntr33;
        BigIntr bigIntr34;
        BigIntr bigIntr35;
        long[] jArr4;
        BigIntr bigIntr36;
        int i5;
        BigIntr bigIntr37;
        int i6;
        BigIntr bigIntr38;
        int i7;
        BigIntr bigIntr39;
        BigIntr bigIntr40;
        BigIntr bigIntr41;
        BigIntr bigIntr42;
        BigIntr bigIntr43;
        BigIntr bigIntr44;
        BigIntr bigIntr45;
        int i8 = this.j;
        int i9 = this.h;
        long[] jArr5 = new long[(i9 * 2) + 1];
        BigIntr bigIntr46 = BigIntr.ZERO;
        BigIntr bigIntr47 = new BigIntr(bigIntr46, i9);
        BigIntr bigIntr48 = new BigIntr(bigIntr46, i9);
        BigIntr bigIntr49 = new BigIntr(bigIntr46, i9);
        BigIntr bigIntr50 = new BigIntr(bigIntr46, i9);
        int[] iArr4 = new int[i9];
        BigIntr bigIntr51 = new BigIntr(bigIntr46, i9);
        BigIntr bigIntr52 = new BigIntr(bigIntr46, i9);
        BigIntr bigIntr53 = new BigIntr(bigIntr46, i9);
        BigIntr bigIntr54 = new BigIntr(bigIntr46, i9);
        BigIntr bigIntr55 = BigIntr.ONE;
        BigIntr bigIntr56 = new BigIntr(bigIntr55, i9);
        BigIntr bigIntr57 = new BigIntr(bigIntr46, i9);
        BigIntr bigIntr58 = bigIntr47;
        BigIntr bigIntr59 = bigIntr49;
        BigIntr bigIntr60 = new BigIntr(i9);
        BigIntr bigIntr61 = bigIntr50;
        BigIntr bigIntr62 = new BigIntr(i9);
        BigIntr bigIntr63 = bigIntr48;
        BigIntr bigIntr64 = new BigIntr(i9);
        if (isNull()) {
            return new gw61(this.g);
        }
        gw61[] gw61VarArr = this.f;
        if (gw61VarArr == null) {
            return (gw61) powerHEX(bigIntr, z);
        }
        int length = gw61VarArr.length / 2;
        BigIntr bigIntr65 = new BigIntr(bigIntr46, i9);
        BigIntr bigIntr66 = new BigIntr(bigIntr55, i9);
        BigIntr bigIntr67 = new BigIntr(bigIntr46, i9);
        BigIntr bigIntr68 = new BigIntr(bigIntr46, i9);
        BigIntr bigIntr69 = new BigIntr(bigIntr55, i9);
        BigIntr bigIntr70 = new BigIntr(bigIntr46, i9);
        BigIntr bigIntr71 = bigIntr69;
        int[] iArr5 = new int[1];
        int[] g = BigIntr.g(bigIntr, iArr5, i9);
        long[] jArr6 = jArr5;
        BigIntr bigIntr72 = bigIntr70;
        int i10 = 0;
        try {
            int i11 = iArr5[0];
            BigIntr bigIntr73 = bigIntr54;
            BigIntr bigIntr74 = bigIntr56;
            BigIntr bigIntr75 = bigIntr66;
            BigIntr bigIntr76 = bigIntr53;
            bigIntr7 = bigIntr57;
            BigIntr bigIntr77 = bigIntr52;
            BigIntr bigIntr78 = bigIntr51;
            int i12 = i11 - (i11 % i8);
            BigIntr bigIntr79 = bigIntr65;
            while (i12 > 0) {
                int i13 = i12 + i8;
                iArr = iArr5;
                int i14 = i10;
                while (i10 < g.length) {
                    try {
                        try {
                            int i15 = g[i10];
                            if (i12 > i15 || i15 >= i13) {
                                iArr2 = g;
                                iArr3 = iArr4;
                                bigIntr32 = bigIntr78;
                                bigIntr33 = bigIntr76;
                                bigIntr34 = bigIntr62;
                                bigIntr35 = bigIntr64;
                                BigIntr bigIntr80 = bigIntr7;
                                jArr4 = jArr6;
                                bigIntr36 = bigIntr74;
                                i5 = i10;
                                bigIntr37 = bigIntr79;
                                i6 = i12;
                                bigIntr38 = bigIntr77;
                                i7 = i13;
                                bigIntr39 = bigIntr73;
                                bigIntr40 = bigIntr80;
                            } else {
                                try {
                                    bigIntr60.setMag(this.f[i14].c);
                                    bigIntr62.setMag(this.f[i14].d);
                                    bigIntr64.setMag(this.f[i14].e);
                                    iArr2 = g;
                                    try {
                                        iArr3 = iArr4;
                                        bigIntr11 = bigIntr78;
                                        bigIntr10 = bigIntr76;
                                        jArr4 = jArr6;
                                        bigIntr44 = bigIntr74;
                                        bigIntr37 = bigIntr79;
                                        i7 = i13;
                                        bigIntr45 = bigIntr7;
                                        i5 = i10;
                                        i6 = i12;
                                        bigIntr9 = bigIntr77;
                                        bigIntr43 = bigIntr73;
                                    } catch (Throwable th) {
                                        th = th;
                                        iArr3 = iArr4;
                                        bigIntr11 = bigIntr78;
                                        bigIntr9 = bigIntr77;
                                        bigIntr10 = bigIntr76;
                                        jArr4 = jArr6;
                                        bigIntr43 = bigIntr73;
                                        i = i9;
                                        bigIntr3 = bigIntr62;
                                        bigIntr4 = bigIntr64;
                                        bigIntr2 = bigIntr60;
                                        bigIntr56 = bigIntr74;
                                        bigIntr5 = bigIntr59;
                                        bigIntr6 = bigIntr58;
                                        jArr = jArr4;
                                        bigIntr54 = bigIntr43;
                                        bigIntr53 = bigIntr10;
                                        bigIntr52 = bigIntr9;
                                        bigIntr51 = bigIntr11;
                                        Arrays.fill(jArr, 0, (i * 2) + 1, 0L);
                                        Array.clear(iArr3);
                                        bigIntr6.clear();
                                        bigIntr63.clear();
                                        bigIntr5.clear();
                                        bigIntr61.clear();
                                        bigIntr51.clear();
                                        bigIntr52.clear();
                                        bigIntr53.clear();
                                        bigIntr54.clear();
                                        bigIntr56.clear();
                                        bigIntr7.clear();
                                        bigIntr68.clear();
                                        bigIntr71.clear();
                                        bigIntr72.clear();
                                        bigIntr2.clear();
                                        bigIntr3.clear();
                                        bigIntr4.clear();
                                        Arrays.fill(iArr2, 0);
                                        iArr[0] = 0;
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    iArr2 = g;
                                }
                                try {
                                    b(this.g, bigIntr11, bigIntr9, bigIntr10, bigIntr43, bigIntr44, bigIntr45, bigIntr60, bigIntr62, bigIntr64, bigIntr59, bigIntr61, bigIntr63, bigIntr58, jArr4, iArr3);
                                    bigIntr34 = bigIntr62;
                                    bigIntr35 = bigIntr64;
                                    bigIntr39 = bigIntr11;
                                    bigIntr32 = bigIntr43;
                                    bigIntr36 = bigIntr9;
                                    bigIntr38 = bigIntr44;
                                    bigIntr40 = bigIntr10;
                                    bigIntr33 = bigIntr45;
                                } catch (Throwable th3) {
                                    th = th3;
                                    i = i9;
                                    bigIntr3 = bigIntr62;
                                    bigIntr4 = bigIntr64;
                                    bigIntr2 = bigIntr60;
                                    bigIntr56 = bigIntr44;
                                    bigIntr7 = bigIntr45;
                                    bigIntr5 = bigIntr59;
                                    bigIntr6 = bigIntr58;
                                    jArr = jArr4;
                                    bigIntr54 = bigIntr43;
                                    bigIntr53 = bigIntr10;
                                    bigIntr52 = bigIntr9;
                                    bigIntr51 = bigIntr11;
                                    Arrays.fill(jArr, 0, (i * 2) + 1, 0L);
                                    Array.clear(iArr3);
                                    bigIntr6.clear();
                                    bigIntr63.clear();
                                    bigIntr5.clear();
                                    bigIntr61.clear();
                                    bigIntr51.clear();
                                    bigIntr52.clear();
                                    bigIntr53.clear();
                                    bigIntr54.clear();
                                    bigIntr56.clear();
                                    bigIntr7.clear();
                                    bigIntr68.clear();
                                    bigIntr71.clear();
                                    bigIntr72.clear();
                                    bigIntr2.clear();
                                    bigIntr3.clear();
                                    bigIntr4.clear();
                                    Arrays.fill(iArr2, 0);
                                    iArr[0] = 0;
                                    throw th;
                                }
                            }
                            try {
                                int i16 = iArr2[i5];
                                bigIntr41 = bigIntr32;
                                if (i6 > (-i16) || (-i16) >= i7) {
                                    bigIntr64 = bigIntr35;
                                    bigIntr74 = bigIntr36;
                                    bigIntr76 = bigIntr33;
                                    bigIntr78 = bigIntr41;
                                    bigIntr73 = bigIntr39;
                                    bigIntr77 = bigIntr38;
                                } else {
                                    try {
                                        int i17 = i14 + length;
                                        bigIntr60.setMag(this.f[i17].c);
                                        bigIntr34.setMag(this.f[i17].d);
                                        bigIntr35.setMag(this.f[i17].e);
                                        bigIntr64 = bigIntr35;
                                        bigIntr42 = bigIntr36;
                                        BigIntr bigIntr81 = bigIntr34;
                                        try {
                                            try {
                                                b(this.g, bigIntr41, bigIntr38, bigIntr33, bigIntr39, bigIntr42, bigIntr40, bigIntr60, bigIntr81, bigIntr64, bigIntr59, bigIntr61, bigIntr63, bigIntr58, jArr4, iArr3);
                                                bigIntr73 = bigIntr41;
                                                bigIntr34 = bigIntr81;
                                                BigIntr bigIntr82 = bigIntr40;
                                                bigIntr40 = bigIntr33;
                                                bigIntr78 = bigIntr39;
                                                bigIntr77 = bigIntr42;
                                                bigIntr76 = bigIntr82;
                                                bigIntr74 = bigIntr38;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                bigIntr41 = bigIntr41;
                                                bigIntr34 = bigIntr81;
                                                i = i9;
                                                bigIntr3 = bigIntr34;
                                                bigIntr7 = bigIntr40;
                                                bigIntr2 = bigIntr60;
                                                bigIntr4 = bigIntr64;
                                                bigIntr5 = bigIntr59;
                                                bigIntr6 = bigIntr58;
                                                jArr = jArr4;
                                                bigIntr56 = bigIntr42;
                                                bigIntr54 = bigIntr39;
                                                bigIntr53 = bigIntr33;
                                                bigIntr52 = bigIntr38;
                                                bigIntr51 = bigIntr41;
                                                Arrays.fill(jArr, 0, (i * 2) + 1, 0L);
                                                Array.clear(iArr3);
                                                bigIntr6.clear();
                                                bigIntr63.clear();
                                                bigIntr5.clear();
                                                bigIntr61.clear();
                                                bigIntr51.clear();
                                                bigIntr52.clear();
                                                bigIntr53.clear();
                                                bigIntr54.clear();
                                                bigIntr56.clear();
                                                bigIntr7.clear();
                                                bigIntr68.clear();
                                                bigIntr71.clear();
                                                bigIntr72.clear();
                                                bigIntr2.clear();
                                                bigIntr3.clear();
                                                bigIntr4.clear();
                                                Arrays.fill(iArr2, 0);
                                                iArr[0] = 0;
                                                throw th;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        bigIntr64 = bigIntr35;
                                        bigIntr42 = bigIntr36;
                                        i = i9;
                                        bigIntr3 = bigIntr34;
                                        bigIntr7 = bigIntr40;
                                        bigIntr2 = bigIntr60;
                                        bigIntr4 = bigIntr64;
                                        bigIntr5 = bigIntr59;
                                        bigIntr6 = bigIntr58;
                                        jArr = jArr4;
                                        bigIntr56 = bigIntr42;
                                        bigIntr54 = bigIntr39;
                                        bigIntr53 = bigIntr33;
                                        bigIntr52 = bigIntr38;
                                        bigIntr51 = bigIntr41;
                                        Arrays.fill(jArr, 0, (i * 2) + 1, 0L);
                                        Array.clear(iArr3);
                                        bigIntr6.clear();
                                        bigIntr63.clear();
                                        bigIntr5.clear();
                                        bigIntr61.clear();
                                        bigIntr51.clear();
                                        bigIntr52.clear();
                                        bigIntr53.clear();
                                        bigIntr54.clear();
                                        bigIntr56.clear();
                                        bigIntr7.clear();
                                        bigIntr68.clear();
                                        bigIntr71.clear();
                                        bigIntr72.clear();
                                        bigIntr2.clear();
                                        bigIntr3.clear();
                                        bigIntr4.clear();
                                        Arrays.fill(iArr2, 0);
                                        iArr[0] = 0;
                                        throw th;
                                    }
                                }
                                i14++;
                                i12 = i6;
                                bigIntr62 = bigIntr34;
                                i10 = i5 + 1;
                                bigIntr7 = bigIntr40;
                                iArr4 = iArr3;
                                g = iArr2;
                                i13 = i7;
                                bigIntr79 = bigIntr37;
                                jArr6 = jArr4;
                            } catch (Throwable th7) {
                                th = th7;
                                bigIntr41 = bigIntr32;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            iArr2 = g;
                            iArr3 = iArr4;
                            bigIntr11 = bigIntr78;
                            bigIntr9 = bigIntr77;
                            bigIntr10 = bigIntr76;
                            i = i9;
                            bigIntr4 = bigIntr64;
                            bigIntr3 = bigIntr62;
                            bigIntr54 = bigIntr73;
                            bigIntr2 = bigIntr60;
                            bigIntr56 = bigIntr74;
                            bigIntr5 = bigIntr59;
                            bigIntr6 = bigIntr58;
                            jArr = jArr6;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        iArr2 = g;
                        iArr3 = iArr4;
                        BigIntr bigIntr83 = bigIntr78;
                        bigIntr25 = bigIntr77;
                        bigIntr26 = bigIntr76;
                        bigIntr27 = bigIntr60;
                        bigIntr28 = bigIntr62;
                        bigIntr29 = bigIntr64;
                        jArr2 = jArr6;
                        i = i9;
                        bigIntr51 = bigIntr83;
                        bigIntr54 = bigIntr73;
                        bigIntr56 = bigIntr74;
                    }
                }
                iArr2 = g;
                iArr3 = iArr4;
                int i18 = i12;
                BigIntr bigIntr84 = bigIntr78;
                BigIntr bigIntr85 = bigIntr77;
                bigIntr26 = bigIntr76;
                BigIntr bigIntr86 = bigIntr62;
                jArr2 = jArr6;
                BigIntr bigIntr87 = bigIntr73;
                BigIntr bigIntr88 = bigIntr74;
                BigIntr bigIntr89 = bigIntr79;
                BigIntr bigIntr90 = bigIntr64;
                BigIntr bigIntr91 = bigIntr7;
                try {
                    bigIntr27 = bigIntr60;
                    bigIntr30 = bigIntr67;
                    bigIntr29 = bigIntr90;
                    bigIntr28 = bigIntr86;
                    bigIntr31 = bigIntr75;
                } catch (Throwable th10) {
                    th = th10;
                    bigIntr29 = bigIntr90;
                    bigIntr25 = bigIntr85;
                    bigIntr28 = bigIntr86;
                    bigIntr27 = bigIntr60;
                }
                try {
                    b(this.g, bigIntr84, bigIntr85, bigIntr26, bigIntr89, bigIntr31, bigIntr30, bigIntr87, bigIntr88, bigIntr91, bigIntr59, bigIntr61, bigIntr63, bigIntr58, jArr2, iArr3);
                    bigIntr75 = bigIntr85;
                    int i19 = i18 - i8;
                    bigIntr60 = bigIntr27;
                    bigIntr73 = bigIntr87;
                    bigIntr74 = bigIntr88;
                    bigIntr7 = bigIntr91;
                    jArr6 = jArr2;
                    bigIntr64 = bigIntr29;
                    i10 = 0;
                    bigIntr62 = bigIntr28;
                    bigIntr77 = bigIntr31;
                    bigIntr79 = bigIntr84;
                    bigIntr67 = bigIntr26;
                    iArr4 = iArr3;
                    g = iArr2;
                    bigIntr78 = bigIntr89;
                    i12 = i19;
                    bigIntr76 = bigIntr30;
                    iArr5 = iArr;
                } catch (Throwable th11) {
                    th = th11;
                    bigIntr25 = bigIntr85;
                    bigIntr87 = bigIntr87;
                    i = i9;
                    bigIntr51 = bigIntr84;
                    bigIntr54 = bigIntr87;
                    bigIntr56 = bigIntr88;
                    bigIntr7 = bigIntr91;
                    bigIntr5 = bigIntr59;
                    bigIntr6 = bigIntr58;
                    bigIntr4 = bigIntr29;
                    bigIntr3 = bigIntr28;
                    bigIntr53 = bigIntr26;
                    bigIntr52 = bigIntr25;
                    bigIntr2 = bigIntr27;
                    jArr = jArr2;
                    Arrays.fill(jArr, 0, (i * 2) + 1, 0L);
                    Array.clear(iArr3);
                    bigIntr6.clear();
                    bigIntr63.clear();
                    bigIntr5.clear();
                    bigIntr61.clear();
                    bigIntr51.clear();
                    bigIntr52.clear();
                    bigIntr53.clear();
                    bigIntr54.clear();
                    bigIntr56.clear();
                    bigIntr7.clear();
                    bigIntr68.clear();
                    bigIntr71.clear();
                    bigIntr72.clear();
                    bigIntr2.clear();
                    bigIntr3.clear();
                    bigIntr4.clear();
                    Arrays.fill(iArr2, 0);
                    iArr[0] = 0;
                    throw th;
                }
            }
            iArr = iArr5;
            BigIntr bigIntr92 = bigIntr79;
            iArr2 = g;
            iArr3 = iArr4;
            BigIntr bigIntr93 = bigIntr60;
            BigIntr bigIntr94 = bigIntr62;
            BigIntr bigIntr95 = bigIntr67;
            jArr2 = jArr6;
            BigIntr bigIntr96 = bigIntr75;
            BigIntr bigIntr97 = bigIntr64;
            try {
                if (d(bigIntr92, bigIntr95)) {
                    bigIntr8 = bigIntr96;
                } else {
                    BigIntr bigIntr98 = bigIntr77;
                    BigIntr bigIntr99 = bigIntr92;
                    BigIntr bigIntr100 = bigIntr98;
                    BigIntr bigIntr101 = bigIntr78;
                    BigIntr bigIntr102 = bigIntr76;
                    BigIntr bigIntr103 = bigIntr96;
                    int i20 = 0;
                    while (true) {
                        if (i20 >= (i9 == 16 ? 3 : 0)) {
                            break;
                        }
                        int i21 = i20;
                        try {
                            bigIntr5 = bigIntr59;
                            bigIntr6 = bigIntr58;
                            BigIntr bigIntr104 = bigIntr61;
                            BigIntr bigIntr105 = bigIntr63;
                            long[] jArr7 = jArr2;
                            int[] iArr6 = iArr3;
                            try {
                                c(this.g, bigIntr101, bigIntr100, bigIntr102, bigIntr99, bigIntr103, bigIntr95, bigIntr5, bigIntr104, bigIntr105, bigIntr6, jArr7, iArr6);
                                jArr2 = jArr7;
                                iArr3 = iArr6;
                                bigIntr61 = bigIntr104;
                                bigIntr63 = bigIntr105;
                                i20 = i21 + 1;
                                BigIntr bigIntr106 = bigIntr99;
                                bigIntr99 = bigIntr101;
                                bigIntr101 = bigIntr106;
                                BigIntr bigIntr107 = bigIntr103;
                                bigIntr103 = bigIntr100;
                                bigIntr100 = bigIntr107;
                                BigIntr bigIntr108 = bigIntr95;
                                bigIntr95 = bigIntr102;
                                bigIntr102 = bigIntr108;
                                bigIntr58 = bigIntr6;
                                bigIntr59 = bigIntr5;
                            } catch (Throwable th12) {
                                th = th12;
                                jArr2 = jArr7;
                                iArr3 = iArr6;
                                bigIntr61 = bigIntr104;
                                bigIntr63 = bigIntr105;
                                i = i9;
                                bigIntr53 = bigIntr102;
                                bigIntr4 = bigIntr97;
                                bigIntr54 = bigIntr73;
                                bigIntr56 = bigIntr74;
                                bigIntr3 = bigIntr94;
                                bigIntr52 = bigIntr100;
                                bigIntr2 = bigIntr93;
                                bigIntr51 = bigIntr101;
                                jArr = jArr2;
                                Arrays.fill(jArr, 0, (i * 2) + 1, 0L);
                                Array.clear(iArr3);
                                bigIntr6.clear();
                                bigIntr63.clear();
                                bigIntr5.clear();
                                bigIntr61.clear();
                                bigIntr51.clear();
                                bigIntr52.clear();
                                bigIntr53.clear();
                                bigIntr54.clear();
                                bigIntr56.clear();
                                bigIntr7.clear();
                                bigIntr68.clear();
                                bigIntr71.clear();
                                bigIntr72.clear();
                                bigIntr2.clear();
                                bigIntr3.clear();
                                bigIntr4.clear();
                                Arrays.fill(iArr2, 0);
                                iArr[0] = 0;
                                throw th;
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            bigIntr5 = bigIntr59;
                            bigIntr6 = bigIntr58;
                        }
                    }
                    BigIntr bigIntr109 = bigIntr99;
                    bigIntr77 = bigIntr100;
                    bigIntr92 = bigIntr109;
                    bigIntr8 = bigIntr103;
                    bigIntr76 = bigIntr102;
                    bigIntr78 = bigIntr101;
                }
                bigIntr5 = bigIntr59;
                bigIntr6 = bigIntr58;
                int i22 = i8 - 1;
                BigIntr bigIntr110 = bigIntr92;
                BigIntr bigIntr111 = bigIntr78;
                BigIntr bigIntr112 = bigIntr77;
                BigIntr bigIntr113 = bigIntr76;
                BigIntr bigIntr114 = bigIntr8;
                BigIntr bigIntr115 = bigIntr95;
                while (i22 > 0) {
                    bigIntr9 = bigIntr112;
                    bigIntr10 = bigIntr113;
                    BigIntr bigIntr116 = bigIntr68;
                    BigIntr bigIntr117 = bigIntr71;
                    BigIntr bigIntr118 = bigIntr72;
                    int i23 = 0;
                    int i24 = 0;
                    while (i23 < iArr2.length) {
                        try {
                            try {
                                int i25 = iArr2[i23];
                                try {
                                    if (i25 > 0) {
                                        try {
                                            if (i22 == i25 % i8) {
                                                bigIntr93.setMag(this.f[i24].c);
                                                bigIntr94.setMag(this.f[i24].d);
                                                i = i9;
                                                BigIntr bigIntr119 = bigIntr97;
                                                try {
                                                    bigIntr119.setMag(this.f[i24].e);
                                                    BigIntr bigIntr120 = bigIntr118;
                                                    i2 = i22;
                                                    bigIntr13 = bigIntr6;
                                                    bigIntr17 = bigIntr5;
                                                    bigIntr18 = bigIntr93;
                                                    i3 = i23;
                                                    bigIntr11 = bigIntr111;
                                                    BigIntr bigIntr121 = bigIntr94;
                                                    try {
                                                        b(this.g, bigIntr11, bigIntr9, bigIntr10, bigIntr116, bigIntr117, bigIntr120, bigIntr18, bigIntr121, bigIntr119, bigIntr17, bigIntr61, bigIntr63, bigIntr13, jArr2, iArr3);
                                                        bigIntr19 = bigIntr121;
                                                        bigIntr20 = bigIntr119;
                                                        BigIntr bigIntr122 = bigIntr117;
                                                        BigIntr bigIntr123 = bigIntr116;
                                                        bigIntr116 = bigIntr11;
                                                        bigIntr11 = bigIntr123;
                                                        bigIntr117 = bigIntr9;
                                                        bigIntr21 = bigIntr10;
                                                        bigIntr9 = bigIntr122;
                                                        bigIntr10 = bigIntr120;
                                                        i4 = iArr2[i3];
                                                        if (i4 < 0 || i2 != (-i4) % i8) {
                                                            bigIntr22 = bigIntr20;
                                                            bigIntr23 = bigIntr19;
                                                            bigIntr24 = bigIntr18;
                                                            bigIntr111 = bigIntr11;
                                                            bigIntr118 = bigIntr21;
                                                        } else {
                                                            int i26 = i24 + length;
                                                            bigIntr18.setMag(this.f[i26].c);
                                                            bigIntr19.setMag(this.f[i26].d);
                                                            bigIntr20.setMag(this.f[i26].e);
                                                            BigIntr bigIntr124 = bigIntr19;
                                                            try {
                                                                BigIntr bigIntr125 = bigIntr20;
                                                                try {
                                                                    b(this.g, bigIntr11, bigIntr9, bigIntr10, bigIntr116, bigIntr117, bigIntr21, bigIntr18, bigIntr124, bigIntr125, bigIntr17, bigIntr61, bigIntr63, bigIntr13, jArr2, iArr3);
                                                                    bigIntr24 = bigIntr18;
                                                                    bigIntr23 = bigIntr124;
                                                                    bigIntr22 = bigIntr125;
                                                                    BigIntr bigIntr126 = bigIntr117;
                                                                    bigIntr117 = bigIntr9;
                                                                    bigIntr9 = bigIntr126;
                                                                    bigIntr118 = bigIntr10;
                                                                    bigIntr111 = bigIntr116;
                                                                    bigIntr10 = bigIntr21;
                                                                    bigIntr116 = bigIntr11;
                                                                } catch (Throwable th14) {
                                                                    th = th14;
                                                                    bigIntr2 = bigIntr18;
                                                                    bigIntr3 = bigIntr124;
                                                                    bigIntr4 = bigIntr125;
                                                                    bigIntr68 = bigIntr116;
                                                                    bigIntr71 = bigIntr117;
                                                                    bigIntr72 = bigIntr21;
                                                                    bigIntr5 = bigIntr17;
                                                                    bigIntr6 = bigIntr13;
                                                                    jArr = jArr2;
                                                                    bigIntr54 = bigIntr73;
                                                                    bigIntr56 = bigIntr74;
                                                                    bigIntr53 = bigIntr10;
                                                                    bigIntr52 = bigIntr9;
                                                                    bigIntr51 = bigIntr11;
                                                                    Arrays.fill(jArr, 0, (i * 2) + 1, 0L);
                                                                    Array.clear(iArr3);
                                                                    bigIntr6.clear();
                                                                    bigIntr63.clear();
                                                                    bigIntr5.clear();
                                                                    bigIntr61.clear();
                                                                    bigIntr51.clear();
                                                                    bigIntr52.clear();
                                                                    bigIntr53.clear();
                                                                    bigIntr54.clear();
                                                                    bigIntr56.clear();
                                                                    bigIntr7.clear();
                                                                    bigIntr68.clear();
                                                                    bigIntr71.clear();
                                                                    bigIntr72.clear();
                                                                    bigIntr2.clear();
                                                                    bigIntr3.clear();
                                                                    bigIntr4.clear();
                                                                    Arrays.fill(iArr2, 0);
                                                                    iArr[0] = 0;
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th15) {
                                                                th = th15;
                                                                bigIntr4 = bigIntr20;
                                                                bigIntr2 = bigIntr18;
                                                                bigIntr3 = bigIntr124;
                                                            }
                                                        }
                                                        i24++;
                                                        i23 = i3 + 1;
                                                        i22 = i2;
                                                        bigIntr93 = bigIntr24;
                                                        bigIntr5 = bigIntr17;
                                                        bigIntr6 = bigIntr13;
                                                        bigIntr94 = bigIntr23;
                                                        i9 = i;
                                                        bigIntr97 = bigIntr22;
                                                    } catch (Throwable th16) {
                                                        th = th16;
                                                        bigIntr14 = bigIntr121;
                                                        bigIntr15 = bigIntr119;
                                                        bigIntr16 = bigIntr117;
                                                        bigIntr118 = bigIntr120;
                                                        bigIntr4 = bigIntr15;
                                                        bigIntr3 = bigIntr14;
                                                        bigIntr68 = bigIntr116;
                                                        bigIntr2 = bigIntr18;
                                                        bigIntr71 = bigIntr16;
                                                        bigIntr72 = bigIntr118;
                                                        bigIntr5 = bigIntr17;
                                                        bigIntr6 = bigIntr13;
                                                        jArr = jArr2;
                                                        bigIntr54 = bigIntr73;
                                                        bigIntr56 = bigIntr74;
                                                        bigIntr53 = bigIntr10;
                                                        bigIntr52 = bigIntr9;
                                                        bigIntr51 = bigIntr11;
                                                        Arrays.fill(jArr, 0, (i * 2) + 1, 0L);
                                                        Array.clear(iArr3);
                                                        bigIntr6.clear();
                                                        bigIntr63.clear();
                                                        bigIntr5.clear();
                                                        bigIntr61.clear();
                                                        bigIntr51.clear();
                                                        bigIntr52.clear();
                                                        bigIntr53.clear();
                                                        bigIntr54.clear();
                                                        bigIntr56.clear();
                                                        bigIntr7.clear();
                                                        bigIntr68.clear();
                                                        bigIntr71.clear();
                                                        bigIntr72.clear();
                                                        bigIntr2.clear();
                                                        bigIntr3.clear();
                                                        bigIntr4.clear();
                                                        Arrays.fill(iArr2, 0);
                                                        iArr[0] = 0;
                                                        throw th;
                                                    }
                                                } catch (Throwable th17) {
                                                    th = th17;
                                                    bigIntr14 = bigIntr94;
                                                    bigIntr11 = bigIntr111;
                                                    bigIntr13 = bigIntr6;
                                                    bigIntr15 = bigIntr119;
                                                    bigIntr16 = bigIntr117;
                                                    bigIntr17 = bigIntr5;
                                                    bigIntr18 = bigIntr93;
                                                    bigIntr4 = bigIntr15;
                                                    bigIntr3 = bigIntr14;
                                                    bigIntr68 = bigIntr116;
                                                    bigIntr2 = bigIntr18;
                                                    bigIntr71 = bigIntr16;
                                                    bigIntr72 = bigIntr118;
                                                    bigIntr5 = bigIntr17;
                                                    bigIntr6 = bigIntr13;
                                                    jArr = jArr2;
                                                    bigIntr54 = bigIntr73;
                                                    bigIntr56 = bigIntr74;
                                                    bigIntr53 = bigIntr10;
                                                    bigIntr52 = bigIntr9;
                                                    bigIntr51 = bigIntr11;
                                                    Arrays.fill(jArr, 0, (i * 2) + 1, 0L);
                                                    Array.clear(iArr3);
                                                    bigIntr6.clear();
                                                    bigIntr63.clear();
                                                    bigIntr5.clear();
                                                    bigIntr61.clear();
                                                    bigIntr51.clear();
                                                    bigIntr52.clear();
                                                    bigIntr53.clear();
                                                    bigIntr54.clear();
                                                    bigIntr56.clear();
                                                    bigIntr7.clear();
                                                    bigIntr68.clear();
                                                    bigIntr71.clear();
                                                    bigIntr72.clear();
                                                    bigIntr2.clear();
                                                    bigIntr3.clear();
                                                    bigIntr4.clear();
                                                    Arrays.fill(iArr2, 0);
                                                    iArr[0] = 0;
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th18) {
                                            th = th18;
                                            i = i9;
                                            bigIntr14 = bigIntr94;
                                            bigIntr11 = bigIntr111;
                                            bigIntr13 = bigIntr6;
                                            bigIntr15 = bigIntr97;
                                        }
                                    }
                                    i4 = iArr2[i3];
                                    if (i4 < 0) {
                                    }
                                    bigIntr22 = bigIntr20;
                                    bigIntr23 = bigIntr19;
                                    bigIntr24 = bigIntr18;
                                    bigIntr111 = bigIntr11;
                                    bigIntr118 = bigIntr21;
                                    i24++;
                                    i23 = i3 + 1;
                                    i22 = i2;
                                    bigIntr93 = bigIntr24;
                                    bigIntr5 = bigIntr17;
                                    bigIntr6 = bigIntr13;
                                    bigIntr94 = bigIntr23;
                                    i9 = i;
                                    bigIntr97 = bigIntr22;
                                } catch (Throwable th19) {
                                    th = th19;
                                    bigIntr4 = bigIntr20;
                                    bigIntr3 = bigIntr19;
                                    bigIntr2 = bigIntr18;
                                }
                                i = i9;
                                i2 = i22;
                                bigIntr13 = bigIntr6;
                                bigIntr19 = bigIntr94;
                                bigIntr17 = bigIntr5;
                                bigIntr20 = bigIntr97;
                                bigIntr18 = bigIntr93;
                                i3 = i23;
                                bigIntr11 = bigIntr111;
                                bigIntr117 = bigIntr117;
                                bigIntr21 = bigIntr118;
                            } catch (Throwable th20) {
                                th = th20;
                                i = i9;
                                bigIntr11 = bigIntr111;
                                bigIntr13 = bigIntr6;
                                bigIntr4 = bigIntr97;
                                bigIntr3 = bigIntr94;
                                bigIntr2 = bigIntr93;
                                bigIntr68 = bigIntr116;
                                bigIntr71 = bigIntr117;
                                bigIntr72 = bigIntr118;
                            }
                        } catch (Throwable th21) {
                            th = th21;
                            i = i9;
                            bigIntr11 = bigIntr111;
                            bigIntr4 = bigIntr97;
                            bigIntr3 = bigIntr94;
                            bigIntr12 = bigIntr117;
                            bigIntr2 = bigIntr93;
                        }
                    }
                    i = i9;
                    int i27 = i22;
                    bigIntr11 = bigIntr111;
                    BigIntr bigIntr127 = bigIntr6;
                    bigIntr4 = bigIntr97;
                    bigIntr3 = bigIntr94;
                    bigIntr12 = bigIntr117;
                    BigIntr bigIntr128 = bigIntr5;
                    bigIntr2 = bigIntr93;
                    try {
                        if (d(bigIntr116, bigIntr118)) {
                            bigIntr5 = bigIntr128;
                            bigIntr6 = bigIntr127;
                            jArr3 = jArr2;
                            bigIntr113 = bigIntr10;
                        } else {
                            BigIntr bigIntr129 = bigIntr116;
                            BigIntr bigIntr130 = bigIntr110;
                            BigIntr bigIntr131 = bigIntr115;
                            BigIntr bigIntr132 = bigIntr114;
                            try {
                                b(this.g, bigIntr11, bigIntr9, bigIntr10, bigIntr130, bigIntr132, bigIntr131, bigIntr129, bigIntr12, bigIntr118, bigIntr128, bigIntr61, bigIntr63, bigIntr127, jArr2, iArr3);
                                bigIntr116 = bigIntr129;
                                bigIntr5 = bigIntr128;
                                bigIntr6 = bigIntr127;
                                jArr3 = jArr2;
                                bigIntr110 = bigIntr11;
                                bigIntr11 = bigIntr130;
                                bigIntr114 = bigIntr9;
                                bigIntr115 = bigIntr10;
                                bigIntr9 = bigIntr132;
                                bigIntr113 = bigIntr131;
                            } catch (Throwable th22) {
                                th = th22;
                                bigIntr116 = bigIntr129;
                                bigIntr5 = bigIntr128;
                                bigIntr6 = bigIntr127;
                                jArr = jArr2;
                                bigIntr68 = bigIntr116;
                                bigIntr71 = bigIntr12;
                                bigIntr72 = bigIntr118;
                                bigIntr54 = bigIntr73;
                                bigIntr56 = bigIntr74;
                                bigIntr53 = bigIntr10;
                                bigIntr52 = bigIntr9;
                                bigIntr51 = bigIntr11;
                                Arrays.fill(jArr, 0, (i * 2) + 1, 0L);
                                Array.clear(iArr3);
                                bigIntr6.clear();
                                bigIntr63.clear();
                                bigIntr5.clear();
                                bigIntr61.clear();
                                bigIntr51.clear();
                                bigIntr52.clear();
                                bigIntr53.clear();
                                bigIntr54.clear();
                                bigIntr56.clear();
                                bigIntr7.clear();
                                bigIntr68.clear();
                                bigIntr71.clear();
                                bigIntr72.clear();
                                bigIntr2.clear();
                                bigIntr3.clear();
                                bigIntr4.clear();
                                Arrays.fill(iArr2, 0);
                                iArr[0] = 0;
                                throw th;
                            }
                        }
                        i22 = i27 - 1;
                        jArr2 = jArr3;
                        bigIntr93 = bigIntr2;
                        bigIntr68 = bigIntr116;
                        bigIntr71 = bigIntr12;
                        bigIntr72 = bigIntr118;
                        bigIntr94 = bigIntr3;
                        i9 = i;
                        bigIntr97 = bigIntr4;
                        bigIntr111 = bigIntr11;
                        bigIntr112 = bigIntr9;
                    } catch (Throwable th23) {
                        th = th23;
                    }
                }
                i = i9;
                bigIntr4 = bigIntr97;
                bigIntr3 = bigIntr94;
                bigIntr2 = bigIntr93;
                jArr = jArr2;
                try {
                    gw61 gw61Var = new gw61(this.g, bigIntr110, bigIntr114, bigIntr115, true);
                    if (z) {
                        gw61Var.toZ1();
                    }
                    Arrays.fill(jArr, 0, (i * 2) + 1, 0L);
                    Array.clear(iArr3);
                    bigIntr6.clear();
                    bigIntr63.clear();
                    bigIntr5.clear();
                    bigIntr61.clear();
                    bigIntr111.clear();
                    bigIntr112.clear();
                    bigIntr113.clear();
                    bigIntr73.clear();
                    bigIntr74.clear();
                    bigIntr7.clear();
                    bigIntr68.clear();
                    bigIntr71.clear();
                    bigIntr72.clear();
                    bigIntr2.clear();
                    bigIntr3.clear();
                    bigIntr4.clear();
                    Arrays.fill(iArr2, 0);
                    iArr[0] = 0;
                    return gw61Var;
                } catch (Throwable th24) {
                    th = th24;
                    bigIntr51 = bigIntr111;
                    bigIntr52 = bigIntr112;
                    bigIntr53 = bigIntr113;
                    bigIntr54 = bigIntr73;
                    bigIntr56 = bigIntr74;
                    Arrays.fill(jArr, 0, (i * 2) + 1, 0L);
                    Array.clear(iArr3);
                    bigIntr6.clear();
                    bigIntr63.clear();
                    bigIntr5.clear();
                    bigIntr61.clear();
                    bigIntr51.clear();
                    bigIntr52.clear();
                    bigIntr53.clear();
                    bigIntr54.clear();
                    bigIntr56.clear();
                    bigIntr7.clear();
                    bigIntr68.clear();
                    bigIntr71.clear();
                    bigIntr72.clear();
                    bigIntr2.clear();
                    bigIntr3.clear();
                    bigIntr4.clear();
                    Arrays.fill(iArr2, 0);
                    iArr[0] = 0;
                    throw th;
                }
            } catch (Throwable th25) {
                th = th25;
                i = i9;
                bigIntr5 = bigIntr59;
                bigIntr6 = bigIntr58;
                bigIntr4 = bigIntr97;
                bigIntr3 = bigIntr94;
                bigIntr2 = bigIntr93;
                jArr = jArr2;
                bigIntr51 = bigIntr78;
                bigIntr52 = bigIntr77;
                bigIntr53 = bigIntr76;
            }
        } catch (Throwable th26) {
            th = th26;
            iArr = iArr5;
            i = i9;
            iArr2 = g;
            iArr3 = iArr4;
            bigIntr2 = bigIntr60;
            bigIntr3 = bigIntr62;
            bigIntr4 = bigIntr64;
            bigIntr5 = bigIntr59;
            bigIntr6 = bigIntr58;
            jArr = jArr6;
            bigIntr7 = bigIntr57;
        }
    }

    @Override // ru.CryptoPro.JCP.math.EllipticPoint
    public final String printTable() {
        StringBuilder sb = new StringBuilder("WEIERSTRASS Table. Length: ");
        sb.append(this.f.length);
        sb.append("\n");
        for (int i = 0; i < this.f.length; i++) {
            n.A(sb, "Index: ", i, "\nX: ");
            sb.append(Array.toHexString(this.c.toByteArray()));
            sb.append("\nY: ");
            sb.append(Array.toHexString(this.d.toByteArray()));
            sb.append("\nZ: ");
            sb.append(Array.toHexString(this.e.toByteArray()));
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override // ru.CryptoPro.JCP.math.EllipticPoint
    public final void toZ1() {
        BigIntr bigIntr = this.e;
        zu61 zu61Var = this.g;
        int i = this.h;
        long[] jArr = new long[(i * 2) + 1];
        if (isNull()) {
            return;
        }
        BigIntr p = zu61Var.getP();
        BigIntr bigIntr2 = EllipticPoint.b;
        BigIntr bigIntr3 = EllipticPoint.a;
        if (bigIntr.equals(i == 8 ? bigIntr3 : bigIntr2)) {
            return;
        }
        BigIntr euclidInverse = bigIntr.euclidInverse(p);
        BigIntr bigIntr4 = this.c;
        BigIntr.e(bigIntr4, bigIntr4, euclidInverse, p, zu61Var.getOptFlag(), jArr);
        BigIntr bigIntr5 = this.d;
        BigIntr.e(bigIntr5, bigIntr5, euclidInverse, p, zu61Var.getOptFlag(), jArr);
        if (i == 8) {
            bigIntr2 = bigIntr3;
        }
        bigIntr.setMag(bigIntr2);
    }

    public gw61(zu61 zu61Var, BigIntr bigIntr, BigIntr bigIntr2) {
        int intLength = zu61Var.getP().getIntLength();
        this.h = intLength;
        this.i = intLength == 8 ? 4 : 8;
        this.j = intLength == 8 ? 1 : 8;
        this.c = new BigIntr(bigIntr, intLength);
        this.d = new BigIntr(bigIntr2, intLength);
        this.e = new BigIntr(BigIntr.ONE, intLength);
        this.g = zu61Var;
    }

    public gw61(zu61 zu61Var) {
        int intLength = zu61Var.getP().getIntLength();
        this.h = intLength;
        this.i = intLength == 8 ? 4 : 8;
        this.j = intLength == 8 ? 1 : 8;
        BigIntr bigIntr = BigIntr.ZERO;
        this.c = new BigIntr(bigIntr, intLength);
        this.d = new BigIntr(BigIntr.ONE, intLength);
        this.e = new BigIntr(bigIntr, intLength);
        this.g = zu61Var;
    }
}
