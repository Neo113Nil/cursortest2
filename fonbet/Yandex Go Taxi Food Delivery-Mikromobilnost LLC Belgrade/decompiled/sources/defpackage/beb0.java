package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

/* loaded from: classes10.dex */
public final class beb0 implements q2v0 {
    public final ef90 a = new ef90();
    public final ef90 b = new ef90();
    public final a c = new a();
    public Inflater w;

    public static final class a {
        public final ef90 a = new ef90();
        public final int[] b = new int[256];
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.q2v0
    public final void b(byte[] bArr, int i, int i2, p2v0 p2v0Var, c9e c9eVar) {
        int[] iArr;
        ArrayList arrayList;
        odf odfVar;
        int i3;
        int i4;
        int i5;
        int B;
        ef90 ef90Var = this.a;
        ef90Var.I(i + i2, bArr);
        ef90Var.K(i);
        if (this.w == null) {
            this.w = new Inflater();
        }
        Inflater inflater = this.w;
        int i6 = tw21.a;
        if (ef90Var.a() > 0 && ef90Var.h() == 120) {
            ef90 ef90Var2 = this.b;
            if (tw21.P(ef90Var, ef90Var2, inflater)) {
                ef90Var.I(ef90Var2.c, ef90Var2.a);
            }
        }
        a aVar = this.c;
        int i7 = 0;
        aVar.d = 0;
        int[] iArr2 = aVar.b;
        ef90 ef90Var3 = aVar.a;
        aVar.e = 0;
        aVar.f = 0;
        aVar.g = 0;
        aVar.h = 0;
        aVar.i = 0;
        ef90Var3.H(0);
        aVar.c = false;
        ArrayList arrayList2 = new ArrayList();
        while (ef90Var.a() >= 3) {
            int i8 = ef90Var.c;
            int y = ef90Var.y();
            int E = ef90Var.E();
            int i9 = ef90Var.b + E;
            if (i9 > i8) {
                ef90Var.K(i8);
                iArr = iArr2;
                arrayList = arrayList2;
                odfVar = null;
                i3 = i7;
            } else {
                char c = 128;
                if (y != 128) {
                    switch (y) {
                        case 20:
                            if (E % 5 == 2) {
                                ef90Var.L(2);
                                Arrays.fill(iArr2, i7);
                                int i10 = E / 5;
                                int i11 = i7;
                                while (i11 < i10) {
                                    int y2 = ef90Var.y();
                                    char c2 = c;
                                    double y3 = ef90Var.y();
                                    double y4 = ef90Var.y() - 128;
                                    int[] iArr3 = iArr2;
                                    double y5 = ef90Var.y() - 128;
                                    iArr3[y2] = tw21.i((int) ((y5 * 1.772d) + y3), 0, 255) | (ef90Var.y() << 24) | (tw21.i((int) ((1.402d * y4) + y3), 0, 255) << 16) | (tw21.i((int) ((y3 - (0.34414d * y5)) - (y4 * 0.71414d)), 0, 255) << 8);
                                    i11++;
                                    arrayList2 = arrayList2;
                                    c = c2;
                                    iArr2 = iArr3;
                                }
                                iArr = iArr2;
                                arrayList = arrayList2;
                                aVar.c = true;
                                break;
                            }
                            iArr = iArr2;
                            arrayList = arrayList2;
                            break;
                        case 21:
                            if (E >= 4) {
                                ef90Var.L(3);
                                int i12 = E - 4;
                                if (((128 & ef90Var.y()) != 0 ? 1 : i7) != 0) {
                                    if (i12 >= 7 && (B = ef90Var.B()) >= 4) {
                                        aVar.h = ef90Var.E();
                                        aVar.i = ef90Var.E();
                                        ef90Var3.H(B - 4);
                                        i12 = E - 11;
                                    }
                                }
                                int i13 = ef90Var3.b;
                                int i14 = ef90Var3.c;
                                if (i13 < i14 && i12 > 0) {
                                    int min = Math.min(i12, i14 - i13);
                                    ef90Var.i(i13, min, ef90Var3.a);
                                    ef90Var3.K(i13 + min);
                                }
                            }
                            iArr = iArr2;
                            arrayList = arrayList2;
                            break;
                        case 22:
                            if (E >= 19) {
                                aVar.d = ef90Var.E();
                                aVar.e = ef90Var.E();
                                ef90Var.L(11);
                                aVar.f = ef90Var.E();
                                aVar.g = ef90Var.E();
                            }
                            iArr = iArr2;
                            arrayList = arrayList2;
                            break;
                        default:
                            iArr = iArr2;
                            arrayList = arrayList2;
                            break;
                    }
                    i3 = 0;
                    odfVar = null;
                } else {
                    iArr = iArr2;
                    arrayList = arrayList2;
                    if (aVar.d == 0 || aVar.e == 0 || aVar.h == 0 || aVar.i == 0 || (i4 = ef90Var3.c) == 0 || ef90Var3.b != i4 || !aVar.c) {
                        odfVar = null;
                    } else {
                        ef90Var3.K(0);
                        int i15 = aVar.h * aVar.i;
                        int[] iArr4 = new int[i15];
                        int i16 = 0;
                        while (i16 < i15) {
                            int y6 = ef90Var3.y();
                            if (y6 != 0) {
                                i5 = i16 + 1;
                                iArr4[i16] = iArr[y6];
                            } else {
                                int y7 = ef90Var3.y();
                                if (y7 != 0) {
                                    i5 = ((y7 & 64) == 0 ? y7 & 63 : ((y7 & 63) << 8) | ef90Var3.y()) + i16;
                                    Arrays.fill(iArr4, i16, i5, (y7 & 128) == 0 ? iArr[0] : iArr[ef90Var3.y()]);
                                }
                            }
                            i16 = i5;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr4, aVar.h, aVar.i, Bitmap.Config.ARGB_8888);
                        ndf ndfVar = new ndf();
                        ndfVar.b = createBitmap;
                        float f = aVar.f;
                        float f2 = aVar.d;
                        ndfVar.h = f / f2;
                        ndfVar.i = 0;
                        float f3 = aVar.g;
                        float f4 = aVar.e;
                        ndfVar.e = f3 / f4;
                        ndfVar.f = 0;
                        ndfVar.g = 0;
                        ndfVar.l = aVar.h / f2;
                        ndfVar.m = aVar.i / f4;
                        odfVar = ndfVar.a();
                    }
                    i3 = 0;
                    aVar.d = 0;
                    aVar.e = 0;
                    aVar.f = 0;
                    aVar.g = 0;
                    aVar.h = 0;
                    aVar.i = 0;
                    ef90Var3.H(0);
                    aVar.c = false;
                }
                ef90Var.K(i9);
            }
            ArrayList arrayList3 = arrayList;
            if (odfVar != null) {
                arrayList3.add(odfVar);
            }
            int i17 = i3;
            arrayList2 = arrayList3;
            i7 = i17;
            iArr2 = iArr;
        }
        c9eVar.accept(new tdf(arrayList2, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // defpackage.q2v0
    public final int f() {
        return 2;
    }
}
