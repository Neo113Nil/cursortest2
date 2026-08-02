package defpackage;

import androidx.media3.common.a;
import java.util.Collections;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes10.dex */
public final class b5u implements tqn, gz71 {
    public String a;
    public boolean b;
    public final boolean[] c;
    public long d;
    public long e;
    public final Object f;
    public Object g;
    public Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;

    public b5u(n971 n971Var) {
        this.f = n971Var;
        this.c = new boolean[3];
        this.i = new c150(32, 1);
        this.j = new c150(33, 1);
        this.k = new c150(34, 1);
        this.l = new c150(39, 1);
        this.m = new c150(40, 1);
        this.e = -9223372036854775807L;
        this.n = new dl81();
    }

    @Override // defpackage.gz71
    public void a() {
        this.d = 0L;
        this.e = -9223372036854775807L;
        sba1.e(this.c);
        c150 c150Var = (c150) this.i;
        c150Var.b = false;
        c150Var.c = false;
        c150 c150Var2 = (c150) this.j;
        c150Var2.b = false;
        c150Var2.c = false;
        c150 c150Var3 = (c150) this.k;
        c150Var3.b = false;
        c150Var3.c = false;
        c150 c150Var4 = (c150) this.l;
        c150Var4.b = false;
        c150Var4.c = false;
        c150 c150Var5 = (c150) this.m;
        c150Var5.b = false;
        c150Var5.c = false;
        a5u a5uVar = (a5u) this.h;
        if (a5uVar != null) {
            a5uVar.e = false;
            a5uVar.f = false;
            a5uVar.g = false;
            a5uVar.h = false;
            a5uVar.i = false;
        }
    }

    @Override // defpackage.tqn
    public void b(ef90 ef90Var) {
        int i;
        d6z.z((g001) this.g);
        int i2 = tw21.a;
        while (ef90Var.a() > 0) {
            int i3 = ef90Var.b;
            int i4 = ef90Var.c;
            byte[] bArr = ef90Var.a;
            this.d += ef90Var.a();
            ((g001) this.g).a(ef90Var, ef90Var.a(), 0);
            while (i3 < i4) {
                int b = l150.b(bArr, i3, i4, this.c);
                if (b == i4) {
                    k(i3, i4, bArr);
                    return;
                }
                int i5 = (bArr[b + 3] & 126) >> 1;
                if (b <= 0 || bArr[b - 1] != 0) {
                    i = 3;
                } else {
                    b--;
                    i = 4;
                }
                int i6 = b;
                int i7 = i;
                int i8 = i6 - i3;
                if (i8 > 0) {
                    k(i3, i6, bArr);
                }
                int i9 = i4 - i6;
                long j = this.d - i9;
                j(i9, i8 < 0 ? -i8 : 0, j, this.e);
                l(i9, i5, j, this.e);
                i3 = i6 + i7;
            }
        }
    }

    @Override // defpackage.gz71
    public void c(int i, long j) {
        if (j != -9223372036854775807L) {
            this.e = j;
        }
    }

    @Override // defpackage.tqn
    public void d() {
        this.d = 0L;
        this.e = -9223372036854775807L;
        l150.a(this.c);
        ((c150) this.i).f();
        ((c150) this.j).f();
        ((c150) this.k).f();
        ((c150) this.l).f();
        ((c150) this.m).f();
        ((zp1) ((amp0) this.f).c).g(0);
        a5u a5uVar = (a5u) this.h;
        if (a5uVar != null) {
            a5uVar.e = false;
            a5uVar.f = false;
            a5uVar.g = false;
            a5uVar.h = false;
            a5uVar.i = false;
        }
    }

    @Override // defpackage.tqn
    public void e(int i, long j) {
        this.e = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x048d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ee  */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v19 */
    @Override // defpackage.gz71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(dl81 dl81Var) {
        int i;
        int i2;
        c150 c150Var;
        long j;
        fb81[] fb81VarArr;
        c150 c150Var2;
        ?? r10;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        float f;
        int i6;
        int i7;
        int i8;
        dl81 dl81Var2 = dl81Var;
        fb81[] fb81VarArr2 = ((n971) this.f).c;
        c150 c150Var3 = (c150) this.k;
        c150 c150Var4 = (c150) this.j;
        c150 c150Var5 = (c150) this.i;
        c150 c150Var6 = (c150) this.m;
        dl81 dl81Var3 = (dl81) this.n;
        c150 c150Var7 = (c150) this.l;
        if (((fb81) this.g) == null) {
            ny61.k();
            return;
        }
        int i9 = rf71.a;
        while (true) {
            int i10 = dl81Var2.c;
            int i11 = dl81Var2.b;
            int i12 = i10 - i11;
            if (i12 <= 0) {
                return;
            }
            byte[] bArr = dl81Var2.a;
            this.d = i12 + this.d;
            ((fb81) this.g).a(i12, dl81Var2);
            while (i11 < i10) {
                int b = sba1.b(bArr, i11, i10, this.c);
                if (b == i10) {
                    i(i11, i10, bArr);
                    return;
                }
                int i13 = b + 3;
                int i14 = (bArr[i13] & 126) >> 1;
                int i15 = b - i11;
                if (i15 > 0) {
                    i(i11, b, bArr);
                }
                int i16 = i10 - b;
                byte[] bArr2 = bArr;
                long j2 = this.d - i16;
                int i17 = i15 < 0 ? -i15 : 0;
                fb81[] fb81VarArr3 = fb81VarArr2;
                long j3 = this.e;
                int i18 = i10;
                a5u a5uVar = (a5u) this.h;
                boolean z3 = this.b;
                if (a5uVar.i && a5uVar.f) {
                    a5uVar.l = a5uVar.b;
                    a5uVar.i = false;
                } else if (a5uVar.g || a5uVar.f) {
                    if (z3 && a5uVar.h) {
                        i2 = i14;
                        long j4 = a5uVar.a;
                        int i19 = i16 + ((int) (j2 - j4));
                        long j5 = a5uVar.k;
                        if (j5 == -9223372036854775807L) {
                            i = i13;
                        } else {
                            i = i13;
                            ((fb81) a5uVar.m).b(j5, a5uVar.l ? 1 : 0, (int) (j4 - a5uVar.j), i19, null);
                        }
                    } else {
                        i = i13;
                        i2 = i14;
                    }
                    a5uVar.j = a5uVar.a;
                    a5uVar.k = a5uVar.d;
                    a5uVar.l = a5uVar.b;
                    a5uVar.h = true;
                    if (!this.b) {
                        c150Var5.b(i17);
                        c150Var4.b(i17);
                        c150Var3.b(i17);
                        if (c150Var5.c && c150Var4.c && c150Var3.c) {
                            fb81 fb81Var = (fb81) this.g;
                            String str = this.a;
                            int i20 = c150Var5.e;
                            byte[] bArr3 = new byte[c150Var4.e + i20 + c150Var3.e];
                            j = j2;
                            System.arraycopy(c150Var5.d, 0, bArr3, 0, i20);
                            c150Var = c150Var6;
                            System.arraycopy(c150Var4.d, 0, bArr3, c150Var5.e, c150Var4.e);
                            System.arraycopy(c150Var3.d, 0, bArr3, c150Var5.e + c150Var4.e, c150Var3.e);
                            a69 a69Var = new a69(0, c150Var4.e, 5, c150Var4.d);
                            a69Var.l(44);
                            int e = a69Var.e(3);
                            a69Var.n();
                            int e2 = a69Var.e(2);
                            boolean g = a69Var.g();
                            int e3 = a69Var.e(5);
                            int i21 = 0;
                            for (int i22 = 0; i22 < 32; i22++) {
                                if (a69Var.g()) {
                                    i21 |= 1 << i22;
                                }
                            }
                            int[] iArr = new int[6];
                            for (int i23 = 0; i23 < 6; i23++) {
                                iArr[i23] = a69Var.e(8);
                            }
                            int e4 = a69Var.e(8);
                            int i24 = 0;
                            for (int i25 = 0; i25 < e; i25++) {
                                if (a69Var.g()) {
                                    i24 += 89;
                                }
                                if (a69Var.g()) {
                                    i24 += 8;
                                }
                            }
                            a69Var.l(i24);
                            if (e > 0) {
                                a69Var.l((8 - e) * 2);
                            }
                            a69Var.k();
                            int k = a69Var.k();
                            if (k == 3) {
                                a69Var.n();
                            }
                            int k2 = a69Var.k();
                            int k3 = a69Var.k();
                            if (a69Var.g()) {
                                int k4 = a69Var.k();
                                int k5 = a69Var.k();
                                int k6 = a69Var.k();
                                int k7 = a69Var.k();
                                k2 -= (k4 + k5) * ((k == 1 || k == 2) ? 2 : 1);
                                k3 -= (k6 + k7) * (k == 1 ? 2 : 1);
                            }
                            a69Var.k();
                            a69Var.k();
                            int k8 = a69Var.k();
                            for (int i26 = a69Var.g() ? 0 : e; i26 <= e; i26++) {
                                a69Var.k();
                                a69Var.k();
                                a69Var.k();
                            }
                            a69Var.k();
                            a69Var.k();
                            a69Var.k();
                            a69Var.k();
                            a69Var.k();
                            a69Var.k();
                            int i27 = 4;
                            if (a69Var.g() && a69Var.g()) {
                                int i28 = 0;
                                while (i28 < i27) {
                                    int i29 = k8;
                                    int i30 = i27;
                                    for (int i31 = 0; i31 < 6; i31 = i8 + (i28 == 3 ? 3 : 1)) {
                                        if (a69Var.g()) {
                                            i8 = i31;
                                            int min = Math.min(64, 1 << ((i28 << 1) + 4));
                                            if (i28 > 1) {
                                                a69Var.m();
                                            }
                                            for (int i32 = 0; i32 < min; i32++) {
                                                a69Var.m();
                                            }
                                        } else {
                                            a69Var.k();
                                            i8 = i31;
                                        }
                                    }
                                    i28++;
                                    i27 = i30;
                                    k8 = i29;
                                }
                            }
                            int i33 = k8;
                            int i34 = i27;
                            a69Var.l(2);
                            if (a69Var.g()) {
                                a69Var.l(8);
                                a69Var.k();
                                a69Var.k();
                                a69Var.n();
                            }
                            int k9 = a69Var.k();
                            int i35 = 0;
                            int i36 = 0;
                            boolean z4 = false;
                            while (i35 < k9) {
                                if (i35 != 0) {
                                    z4 = a69Var.g();
                                }
                                if (z4) {
                                    a69Var.n();
                                    a69Var.k();
                                    i6 = k9;
                                    for (int i37 = 0; i37 <= i36; i37++) {
                                        if (a69Var.g()) {
                                            a69Var.n();
                                        }
                                    }
                                    i7 = i35;
                                } else {
                                    i6 = k9;
                                    int k10 = a69Var.k();
                                    int k11 = a69Var.k();
                                    int i38 = k10 + k11;
                                    i7 = i35;
                                    for (int i39 = 0; i39 < k10; i39++) {
                                        a69Var.k();
                                        a69Var.n();
                                    }
                                    for (int i40 = 0; i40 < k11; i40++) {
                                        a69Var.k();
                                        a69Var.n();
                                    }
                                    i36 = i38;
                                }
                                i35 = i7 + 1;
                                k9 = i6;
                            }
                            if (a69Var.g()) {
                                for (int i41 = 0; i41 < a69Var.k(); i41++) {
                                    a69Var.l(i33 + 5);
                                }
                            }
                            a69Var.l(2);
                            if (a69Var.g()) {
                                if (a69Var.g()) {
                                    int e5 = a69Var.e(8);
                                    if (e5 == 255) {
                                        int e6 = a69Var.e(16);
                                        int e7 = a69Var.e(16);
                                        if (e6 != 0 && e7 != 0) {
                                            f = e6 / e7;
                                            if (a69Var.g()) {
                                                a69Var.n();
                                            }
                                            if (a69Var.g()) {
                                                a69Var.l(i34);
                                                if (a69Var.g()) {
                                                    a69Var.l(24);
                                                }
                                            }
                                            if (a69Var.g()) {
                                                a69Var.k();
                                                a69Var.k();
                                            }
                                            a69Var.n();
                                            if (a69Var.g()) {
                                                k3 *= 2;
                                            }
                                            i5 = k3;
                                        }
                                    } else if (e5 < 17) {
                                        f = sba1.b[e5];
                                        if (a69Var.g()) {
                                        }
                                        if (a69Var.g()) {
                                        }
                                        if (a69Var.g()) {
                                        }
                                        a69Var.n();
                                        if (a69Var.g()) {
                                        }
                                        i5 = k3;
                                    } else {
                                        nba1.e();
                                    }
                                    if (c150Var7.b(i17)) {
                                        fb81VarArr = fb81VarArr3;
                                    } else {
                                        int a = sba1.a(c150Var7.e, c150Var7.d);
                                        dl81Var3.a = c150Var7.d;
                                        dl81Var3.c = a;
                                        dl81Var3.b = 0;
                                        dl81Var3.m(5);
                                        fb81VarArr = fb81VarArr3;
                                        aba1.b(j3, dl81Var3, fb81VarArr);
                                    }
                                    c150Var2 = c150Var;
                                    if (c150Var2.b(i17)) {
                                        r10 = 0;
                                    } else {
                                        int a2 = sba1.a(c150Var2.e, c150Var2.d);
                                        dl81Var3.a = c150Var2.d;
                                        dl81Var3.c = a2;
                                        r10 = 0;
                                        dl81Var3.b = 0;
                                        dl81Var3.m(5);
                                        aba1.b(j3, dl81Var3, fb81VarArr);
                                    }
                                    long j6 = this.e;
                                    a5u a5uVar2 = (a5u) this.h;
                                    boolean z5 = this.b;
                                    a5uVar2.f = r10;
                                    a5uVar2.g = r10;
                                    a5uVar2.d = j6;
                                    a5uVar2.c = r10;
                                    long j7 = j;
                                    a5uVar2.a = j7;
                                    i3 = i2;
                                    if (i3 >= 32) {
                                        z = false;
                                    } else if (i3 == 40) {
                                        i4 = 16;
                                        z = false;
                                        z2 = true;
                                        boolean z6 = (i3 >= i4 || i3 > 21) ? z : z2;
                                        a5uVar2.b = z6;
                                        a5uVar2.e = (!z6 || i3 <= 9) ? z2 : z;
                                        if (this.b) {
                                            c150Var5.d(i3);
                                            c150Var4.d(i3);
                                            c150Var3.d(i3);
                                        }
                                        c150Var7.d(i3);
                                        c150Var2.d(i3);
                                        fb81VarArr2 = fb81VarArr;
                                        c150Var6 = c150Var2;
                                        bArr = bArr2;
                                        i10 = i18;
                                        i11 = i;
                                    } else {
                                        if (!a5uVar2.h || a5uVar2.i) {
                                            z = false;
                                        } else {
                                            if (z5) {
                                                long j8 = a5uVar2.k;
                                                if (j8 != -9223372036854775807L) {
                                                    ((fb81) a5uVar2.m).b(j8, a5uVar2.l ? 1 : 0, (int) (j7 - a5uVar2.j), i16, null);
                                                }
                                            }
                                            z = false;
                                            a5uVar2.h = false;
                                        }
                                        if ((32 <= i3 && i3 <= 35) || i3 == 39) {
                                            z2 = true;
                                            a5uVar2.g = !a5uVar2.i;
                                            a5uVar2.i = true;
                                            i4 = 16;
                                            if (i3 >= i4) {
                                            }
                                            a5uVar2.b = z6;
                                            a5uVar2.e = (!z6 || i3 <= 9) ? z2 : z;
                                            if (this.b) {
                                            }
                                            c150Var7.d(i3);
                                            c150Var2.d(i3);
                                            fb81VarArr2 = fb81VarArr;
                                            c150Var6 = c150Var2;
                                            bArr = bArr2;
                                            i10 = i18;
                                            i11 = i;
                                        }
                                    }
                                    z2 = true;
                                    i4 = 16;
                                    if (i3 >= i4) {
                                    }
                                    a5uVar2.b = z6;
                                    a5uVar2.e = (!z6 || i3 <= 9) ? z2 : z;
                                    if (this.b) {
                                    }
                                    c150Var7.d(i3);
                                    c150Var2.d(i3);
                                    fb81VarArr2 = fb81VarArr;
                                    c150Var6 = c150Var2;
                                    bArr = bArr2;
                                    i10 = i18;
                                    i11 = i;
                                }
                                f = 1.0f;
                                if (a69Var.g()) {
                                }
                                if (a69Var.g()) {
                                }
                                if (a69Var.g()) {
                                }
                                a69Var.n();
                                if (a69Var.g()) {
                                }
                                i5 = k3;
                            } else {
                                i5 = k3;
                                f = 1.0f;
                            }
                            String a3 = qfa1.a(e2, g, e3, i21, iArr, e4);
                            da81 da81Var = new da81();
                            da81Var.a = str;
                            da81Var.k = "video/hevc";
                            da81Var.h = a3;
                            da81Var.p = k2;
                            da81Var.q = i5;
                            da81Var.t = f;
                            da81Var.m = Collections.singletonList(bArr3);
                            fb81Var.k(new qd81(da81Var));
                            this.b = true;
                            if (c150Var7.b(i17)) {
                            }
                            c150Var2 = c150Var;
                            if (c150Var2.b(i17)) {
                            }
                            long j62 = this.e;
                            a5u a5uVar22 = (a5u) this.h;
                            boolean z52 = this.b;
                            a5uVar22.f = r10;
                            a5uVar22.g = r10;
                            a5uVar22.d = j62;
                            a5uVar22.c = r10;
                            long j72 = j;
                            a5uVar22.a = j72;
                            i3 = i2;
                            if (i3 >= 32) {
                            }
                            z2 = true;
                            i4 = 16;
                            if (i3 >= i4) {
                            }
                            a5uVar22.b = z6;
                            a5uVar22.e = (!z6 || i3 <= 9) ? z2 : z;
                            if (this.b) {
                            }
                            c150Var7.d(i3);
                            c150Var2.d(i3);
                            fb81VarArr2 = fb81VarArr;
                            c150Var6 = c150Var2;
                            bArr = bArr2;
                            i10 = i18;
                            i11 = i;
                        }
                    }
                    c150Var = c150Var6;
                    j = j2;
                    if (c150Var7.b(i17)) {
                    }
                    c150Var2 = c150Var;
                    if (c150Var2.b(i17)) {
                    }
                    long j622 = this.e;
                    a5u a5uVar222 = (a5u) this.h;
                    boolean z522 = this.b;
                    a5uVar222.f = r10;
                    a5uVar222.g = r10;
                    a5uVar222.d = j622;
                    a5uVar222.c = r10;
                    long j722 = j;
                    a5uVar222.a = j722;
                    i3 = i2;
                    if (i3 >= 32) {
                    }
                    z2 = true;
                    i4 = 16;
                    if (i3 >= i4) {
                    }
                    a5uVar222.b = z6;
                    a5uVar222.e = (!z6 || i3 <= 9) ? z2 : z;
                    if (this.b) {
                    }
                    c150Var7.d(i3);
                    c150Var2.d(i3);
                    fb81VarArr2 = fb81VarArr;
                    c150Var6 = c150Var2;
                    bArr = bArr2;
                    i10 = i18;
                    i11 = i;
                }
                i = i13;
                i2 = i14;
                if (!this.b) {
                }
                c150Var = c150Var6;
                j = j2;
                if (c150Var7.b(i17)) {
                }
                c150Var2 = c150Var;
                if (c150Var2.b(i17)) {
                }
                long j6222 = this.e;
                a5u a5uVar2222 = (a5u) this.h;
                boolean z5222 = this.b;
                a5uVar2222.f = r10;
                a5uVar2222.g = r10;
                a5uVar2222.d = j6222;
                a5uVar2222.c = r10;
                long j7222 = j;
                a5uVar2222.a = j7222;
                i3 = i2;
                if (i3 >= 32) {
                }
                z2 = true;
                i4 = 16;
                if (i3 >= i4) {
                }
                a5uVar2222.b = z6;
                a5uVar2222.e = (!z6 || i3 <= 9) ? z2 : z;
                if (this.b) {
                }
                c150Var7.d(i3);
                c150Var2.d(i3);
                fb81VarArr2 = fb81VarArr;
                c150Var6 = c150Var2;
                bArr = bArr2;
                i10 = i18;
                i11 = i;
            }
            dl81Var2 = dl81Var;
        }
    }

    @Override // defpackage.tqn
    public void g(boolean z) {
        d6z.z((g001) this.g);
        int i = tw21.a;
        if (z) {
            ((zp1) ((amp0) this.f).c).g(0);
            j(0, 0, this.d, this.e);
            l(0, 48, this.d, this.e);
        }
    }

    @Override // defpackage.tqn
    public void h(d5p d5pVar, xi11 xi11Var) {
        xi11Var.c();
        xi11Var.d();
        this.a = xi11Var.e;
        xi11Var.d();
        g001 B = d5pVar.B(xi11Var.d, 2);
        this.g = B;
        this.h = new a5u(B);
        ((amp0) this.f).H(d5pVar, xi11Var);
    }

    public void i(int i, int i2, byte[] bArr) {
        a5u a5uVar = (a5u) this.h;
        if (a5uVar.e) {
            int i3 = a5uVar.c;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                a5uVar.f = (bArr[i4] & DerValue.TAG_CONTEXT) != 0;
                a5uVar.e = false;
            } else {
                a5uVar.c = (i2 - i) + i3;
            }
        }
        if (!this.b) {
            ((c150) this.i).a(i, i2, bArr);
            ((c150) this.j).a(i, i2, bArr);
            ((c150) this.k).a(i, i2, bArr);
        }
        ((c150) this.l).a(i, i2, bArr);
        ((c150) this.m).a(i, i2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(int i, int i2, long j, long j2) {
        c150 c150Var;
        c150 c150Var2;
        c150 c150Var3 = (c150) this.k;
        c150 c150Var4 = (c150) this.j;
        c150 c150Var5 = (c150) this.i;
        c150 c150Var6 = (c150) this.m;
        c150 c150Var7 = (c150) this.l;
        zp1 zp1Var = (zp1) ((amp0) this.f).c;
        ef90 ef90Var = (ef90) this.n;
        a5u a5uVar = (a5u) this.h;
        boolean z = this.b;
        if (a5uVar.i && a5uVar.f) {
            a5uVar.l = a5uVar.b;
            a5uVar.i = false;
        } else if (a5uVar.g || a5uVar.f) {
            if (z && a5uVar.h) {
                a5uVar.a(i + ((int) (j - a5uVar.a)));
            }
            a5uVar.j = a5uVar.a;
            a5uVar.k = a5uVar.d;
            a5uVar.l = a5uVar.b;
            a5uVar.h = true;
        }
        if (!this.b) {
            c150Var5.e(i2);
            c150Var4.e(i2);
            c150Var3.e(i2);
            if (c150Var5.c && c150Var4.c && c150Var3.c) {
                String str = this.a;
                int i3 = c150Var5.e;
                byte[] bArr = new byte[c150Var4.e + i3 + c150Var3.e];
                System.arraycopy(c150Var5.d, 0, bArr, 0, i3);
                c150Var = c150Var6;
                System.arraycopy(c150Var4.d, 0, bArr, c150Var5.e, c150Var4.e);
                System.arraycopy(c150Var3.d, 0, bArr, c150Var5.e + c150Var4.e, c150Var3.e);
                h150 h = l150.h(c150Var4.d, 3, c150Var4.e, null);
                e150 e150Var = h.b;
                String b = e150Var != null ? bac.b(e150Var.a, e150Var.b, e150Var.c, e150Var.d, e150Var.e, e150Var.f) : null;
                f7s f7sVar = new f7s();
                f7sVar.a = str;
                f7sVar.l = eh20.q("video/mp2t");
                f7sVar.m = eh20.q("video/hevc");
                f7sVar.j = b;
                f7sVar.t = h.e;
                f7sVar.u = h.f;
                jfc jfcVar = new jfc();
                jfcVar.a = h.i;
                jfcVar.b = h.j;
                jfcVar.c = h.k;
                jfcVar.e = h.c + 8;
                jfcVar.f = h.d + 8;
                f7sVar.A = jfcVar.a();
                f7sVar.x = h.g;
                f7sVar.o = h.h;
                f7sVar.B = h.a + 1;
                f7sVar.p = Collections.singletonList(bArr);
                a aVar = new a(f7sVar);
                ((g001) this.g).d(aVar);
                int i4 = aVar.p;
                if (i4 == -1) {
                    ny61.k();
                    return;
                }
                zp1Var.getClass();
                d6z.x(i4 >= 0);
                zp1Var.a = i4;
                zp1Var.g(i4);
                this.b = true;
                if (c150Var7.e(i2)) {
                    ef90Var.I(l150.l(c150Var7.e, c150Var7.d), c150Var7.d);
                    ef90Var.L(5);
                    zp1Var.b(j2, ef90Var);
                }
                c150Var2 = c150Var;
                if (c150Var2.e(i2)) {
                    return;
                }
                ef90Var.I(l150.l(c150Var2.e, c150Var2.d), c150Var2.d);
                ef90Var.L(5);
                zp1Var.b(j2, ef90Var);
                return;
            }
        }
        c150Var = c150Var6;
        if (c150Var7.e(i2)) {
        }
        c150Var2 = c150Var;
        if (c150Var2.e(i2)) {
        }
    }

    public void k(int i, int i2, byte[] bArr) {
        a5u a5uVar = (a5u) this.h;
        if (a5uVar.e) {
            int i3 = a5uVar.c;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                a5uVar.f = (bArr[i4] & DerValue.TAG_CONTEXT) != 0;
                a5uVar.e = false;
            } else {
                a5uVar.c = (i2 - i) + i3;
            }
        }
        if (!this.b) {
            ((c150) this.i).c(i, i2, bArr);
            ((c150) this.j).c(i, i2, bArr);
            ((c150) this.k).c(i, i2, bArr);
        }
        ((c150) this.l).c(i, i2, bArr);
        ((c150) this.m).c(i, i2, bArr);
    }

    public void l(int i, int i2, long j, long j2) {
        a5u a5uVar = (a5u) this.h;
        boolean z = this.b;
        a5uVar.f = false;
        a5uVar.g = false;
        a5uVar.d = j2;
        a5uVar.c = 0;
        a5uVar.a = j;
        if (i2 >= 32 && i2 != 40) {
            if (a5uVar.h && !a5uVar.i) {
                if (z) {
                    a5uVar.a(i);
                }
                a5uVar.h = false;
            }
            if ((32 <= i2 && i2 <= 35) || i2 == 39) {
                a5uVar.g = !a5uVar.i;
                a5uVar.i = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        a5uVar.b = z2;
        a5uVar.e = z2 || i2 <= 9;
        if (!this.b) {
            ((c150) this.i).g(i2);
            ((c150) this.j).g(i2);
            ((c150) this.k).g(i2);
        }
        ((c150) this.l).g(i2);
        ((c150) this.m).g(i2);
    }

    public b5u(amp0 amp0Var) {
        this.f = amp0Var;
        this.c = new boolean[3];
        this.i = new c150(32, 0);
        this.j = new c150(33, 0);
        this.k = new c150(34, 0);
        this.l = new c150(39, 0);
        this.m = new c150(40, 0);
        this.e = -9223372036854775807L;
        this.n = new ef90();
    }

    @Override // defpackage.gz71
    public void a(yg71 yg71Var, xi11 xi11Var) {
        xi11Var.a();
        xi11Var.b();
        this.a = xi11Var.e;
        xi11Var.b();
        fb81 l = yg71Var.l(xi11Var.d, 2);
        this.g = l;
        this.h = new a5u(l);
        ((n971) this.f).a(yg71Var, xi11Var);
    }

    @Override // defpackage.gz71
    public void b() {
    }
}
