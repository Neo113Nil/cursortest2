package xsna;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;
import xsna.a1n0;
import xsna.rkk;

/* compiled from: PgsParser.java */
/* loaded from: classes12.dex */
public final class a2a0 implements a1n0 {
    public final xi90 a = new xi90();
    public final xi90 b = new xi90();
    public final a c = new a();

    @Nullable
    public Inflater d;

    /* compiled from: PgsParser.java */
    public static final class a {
        public final xi90 a = new xi90();
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
    @Override // xsna.a1n0
    public final void a(byte[] bArr, int i, int i2, a1n0.b bVar, j7j<wkk> j7jVar) {
        xi90 xi90Var;
        ArrayList arrayList;
        rkk rkkVar;
        int i3;
        int i4;
        int i5;
        xi90 xi90Var2;
        int F;
        xi90 xi90Var3 = this.a;
        xi90Var3.N(bArr, i + i2);
        xi90Var3.P(i);
        if (this.d == null) {
            this.d = new Inflater();
        }
        Inflater inflater = this.d;
        String str = y2r0.a;
        if (xi90Var3.a() > 0 && xi90Var3.m() == 120) {
            xi90 xi90Var4 = this.b;
            if (y2r0.K(xi90Var3, xi90Var4, inflater)) {
                xi90Var3.N(xi90Var4.a, xi90Var4.c);
            }
        }
        a aVar = this.c;
        int i6 = 0;
        aVar.d = 0;
        int[] iArr = aVar.b;
        xi90 xi90Var5 = aVar.a;
        aVar.e = 0;
        aVar.f = 0;
        aVar.g = 0;
        aVar.h = 0;
        aVar.i = 0;
        xi90Var5.M(0);
        aVar.c = false;
        ArrayList arrayList2 = new ArrayList();
        while (xi90Var3.a() >= 3) {
            int i7 = xi90Var3.c;
            int C = xi90Var3.C();
            int J = xi90Var3.J();
            int i8 = xi90Var3.b + J;
            if (i8 > i7) {
                xi90Var3.P(i7);
                arrayList = arrayList2;
                rkkVar = null;
                i3 = i6;
                xi90Var2 = xi90Var3;
            } else {
                char c = 128;
                if (C != 128) {
                    switch (C) {
                        case 20:
                            if (J % 5 == 2) {
                                xi90Var3.Q(2);
                                Arrays.fill(iArr, i6);
                                int i9 = J / 5;
                                int i10 = i6;
                                while (i10 < i9) {
                                    int C2 = xi90Var3.C();
                                    char c2 = c;
                                    double C3 = xi90Var3.C();
                                    double C4 = xi90Var3.C() - 128;
                                    double C5 = xi90Var3.C() - 128;
                                    iArr[C2] = y2r0.j((int) ((C5 * 1.772d) + C3), 0, 255) | (xi90Var3.C() << 24) | (y2r0.j((int) ((1.402d * C4) + C3), 0, 255) << 16) | (y2r0.j((int) ((C3 - (0.34414d * C5)) - (C4 * 0.71414d)), 0, 255) << 8);
                                    i10++;
                                    arrayList2 = arrayList2;
                                    c = c2;
                                    xi90Var3 = xi90Var3;
                                }
                                xi90Var = xi90Var3;
                                arrayList = arrayList2;
                                aVar.c = true;
                                break;
                            }
                            xi90Var = xi90Var3;
                            arrayList = arrayList2;
                            break;
                        case 21:
                            if (J >= 4) {
                                xi90Var3.Q(3);
                                int i11 = J - 4;
                                if (((128 & xi90Var3.C()) != 0 ? 1 : i6) != 0) {
                                    if (i11 >= 7 && (F = xi90Var3.F()) >= 4) {
                                        aVar.h = xi90Var3.J();
                                        aVar.i = xi90Var3.J();
                                        xi90Var5.M(F - 4);
                                        i11 = J - 11;
                                    }
                                }
                                int i12 = xi90Var5.b;
                                int i13 = xi90Var5.c;
                                if (i12 < i13 && i11 > 0) {
                                    int min = Math.min(i11, i13 - i12);
                                    xi90Var3.n(xi90Var5.a, i12, min);
                                    xi90Var5.P(i12 + min);
                                }
                            }
                            xi90Var = xi90Var3;
                            arrayList = arrayList2;
                            break;
                        case 22:
                            if (J >= 19) {
                                aVar.d = xi90Var3.J();
                                aVar.e = xi90Var3.J();
                                xi90Var3.Q(11);
                                aVar.f = xi90Var3.J();
                                aVar.g = xi90Var3.J();
                            }
                            xi90Var = xi90Var3;
                            arrayList = arrayList2;
                            break;
                        default:
                            xi90Var = xi90Var3;
                            arrayList = arrayList2;
                            break;
                    }
                    i3 = 0;
                    rkkVar = null;
                } else {
                    xi90Var = xi90Var3;
                    arrayList = arrayList2;
                    if (aVar.d == 0 || aVar.e == 0 || aVar.h == 0 || aVar.i == 0 || (i4 = xi90Var5.c) == 0 || xi90Var5.b != i4 || !aVar.c) {
                        rkkVar = null;
                    } else {
                        xi90Var5.P(0);
                        int i14 = aVar.h * aVar.i;
                        int[] iArr2 = new int[i14];
                        int i15 = 0;
                        while (i15 < i14) {
                            int C6 = xi90Var5.C();
                            if (C6 != 0) {
                                i5 = i15 + 1;
                                iArr2[i15] = iArr[C6];
                            } else {
                                int C7 = xi90Var5.C();
                                if (C7 != 0) {
                                    i5 = ((C7 & 64) == 0 ? C7 & 63 : ((C7 & 63) << 8) | xi90Var5.C()) + i15;
                                    Arrays.fill(iArr2, i15, i5, (C7 & 128) == 0 ? iArr[0] : iArr[xi90Var5.C()]);
                                }
                            }
                            i15 = i5;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, aVar.h, aVar.i, Bitmap.Config.ARGB_8888);
                        rkk.a aVar2 = new rkk.a();
                        aVar2.b = createBitmap;
                        aVar2.a = null;
                        float f = aVar.f;
                        float f2 = aVar.d;
                        aVar2.h = f / f2;
                        aVar2.i = 0;
                        float f3 = aVar.g;
                        float f4 = aVar.e;
                        aVar2.e = f3 / f4;
                        aVar2.f = 0;
                        aVar2.g = 0;
                        aVar2.l = aVar.h / f2;
                        aVar2.m = aVar.i / f4;
                        rkkVar = aVar2.a();
                    }
                    i3 = 0;
                    aVar.d = 0;
                    aVar.e = 0;
                    aVar.f = 0;
                    aVar.g = 0;
                    aVar.h = 0;
                    aVar.i = 0;
                    xi90Var5.M(0);
                    aVar.c = false;
                }
                xi90Var2 = xi90Var;
                xi90Var2.P(i8);
            }
            ArrayList arrayList3 = arrayList;
            if (rkkVar != null) {
                arrayList3.add(rkkVar);
            }
            xi90Var3 = xi90Var2;
            i6 = i3;
            arrayList2 = arrayList3;
        }
        j7jVar.accept(new wkk(arrayList2, C.TIME_UNSET, C.TIME_UNSET));
    }

    @Override // xsna.a1n0
    public final int b() {
        return 2;
    }
}
