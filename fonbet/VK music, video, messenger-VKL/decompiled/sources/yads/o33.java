package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class o33 extends h03 {
    public final kc2 a = new kc2();
    public final jc2 b = new jc2();
    public c83 c;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
    
        if (r3 != r5) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.h03
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ut1 a(xt1 xt1Var, ByteBuffer byteBuffer) {
        int i;
        tt1 t33Var;
        long j;
        int i2;
        long j2;
        long j3;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        long j4;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i6;
        int i7;
        int i8;
        List list;
        long j5;
        long j6;
        char c;
        long j7;
        boolean z9;
        c83 c83Var = this.c;
        if (c83Var != null) {
            long j8 = xt1Var.j;
            synchronized (c83Var) {
                long j9 = c83Var.b;
            }
        }
        c83 c83Var2 = new c83(xt1Var.f);
        this.c = c83Var2;
        c83Var2.a(xt1Var.f - xt1Var.j);
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        kc2 kc2Var = this.a;
        kc2Var.a = array;
        kc2Var.c = limit;
        int i9 = 0;
        kc2Var.b = 0;
        this.b.a(limit, array);
        this.b.c(39);
        int i10 = 1;
        long a = (this.b.a(1) << 32) | this.b.a(32);
        this.b.c(20);
        int a2 = this.b.a(12);
        int a3 = this.b.a(8);
        kc2 kc2Var2 = this.a;
        kc2Var2.e(kc2Var2.b + 14);
        if (a3 == 0) {
            i = 0;
            t33Var = new t33();
        } else if (a3 != 255) {
            long j10 = 1;
            long j11 = C.TIME_UNSET;
            if (a3 == 4) {
                kc2 kc2Var3 = this.a;
                int m = kc2Var3.m();
                ArrayList arrayList = new ArrayList(m);
                int i11 = 0;
                while (i11 < m) {
                    long n = kc2Var3.n();
                    boolean z10 = (kc2Var3.m() & 128) != 0 ? i10 : i9;
                    ArrayList arrayList2 = new ArrayList();
                    if (z10 == 0) {
                        int m2 = kc2Var3.m();
                        int i12 = (m2 & 128) != 0 ? i10 : i9;
                        int i13 = (m2 & 64) != 0 ? i10 : i9;
                        int i14 = (m2 & 32) != 0 ? i10 : i9;
                        long n2 = i13 != 0 ? kc2Var3.n() : -9223372036854775807L;
                        if (i13 == 0) {
                            int m3 = kc2Var3.m();
                            ArrayList arrayList3 = new ArrayList(m3);
                            int i15 = i9;
                            while (i15 < m3) {
                                arrayList3.add(new v33(kc2Var3.m(), kc2Var3.n()));
                                i15++;
                                m = m;
                                j10 = j10;
                            }
                            arrayList2 = arrayList3;
                        }
                        j = j10;
                        i2 = m;
                        if (i14 != 0) {
                            long m4 = kc2Var3.m();
                            z4 = (m4 & 128) != 0;
                            j4 = ((((m4 & j) << 32) | kc2Var3.n()) * 1000) / 90;
                        } else {
                            j4 = -9223372036854775807L;
                            z4 = false;
                        }
                        j3 = j4;
                        z3 = z4;
                        i3 = kc2Var3.r();
                        z = i12;
                        z2 = i13;
                        j2 = n2;
                        i4 = kc2Var3.m();
                        i5 = kc2Var3.m();
                    } else {
                        j = j10;
                        i2 = m;
                        j2 = -9223372036854775807L;
                        j3 = -9223372036854775807L;
                        z = 0;
                        z2 = 0;
                        z3 = false;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                    }
                    arrayList.add(new w33(n, z10, z, z2, arrayList2, j2, z3, j3, i3, i4, i5));
                    i11++;
                    m = i2;
                    j10 = j;
                    i10 = 1;
                    i9 = 0;
                }
                t33Var = new x33(arrayList);
                i = 0;
            } else if (a3 != 5) {
                if (a3 != 6) {
                    t33Var = null;
                } else {
                    kc2 kc2Var4 = this.a;
                    c83 c83Var3 = this.c;
                    long a4 = q73.a(a, kc2Var4);
                    t33Var = new q73(a4, c83Var3.b(a4));
                }
                i = 0;
            } else {
                kc2 kc2Var5 = this.a;
                c83 c83Var4 = this.c;
                long n3 = kc2Var5.n();
                boolean z11 = (kc2Var5.m() & 128) != 0;
                List list2 = Collections.EMPTY_LIST;
                if (z11) {
                    z5 = false;
                    z6 = false;
                    z7 = false;
                    z8 = false;
                    i6 = 0;
                    i7 = 0;
                    i8 = 0;
                    list = list2;
                    j5 = -9223372036854775807L;
                    j6 = -9223372036854775807L;
                } else {
                    int m5 = kc2Var5.m();
                    boolean z12 = (m5 & 128) != 0;
                    boolean z13 = (m5 & 64) != 0;
                    boolean z14 = (m5 & 32) != 0;
                    boolean z15 = (m5 & 16) != 0;
                    long a5 = (!z13 || z15) ? -9223372036854775807L : q73.a(a, kc2Var5);
                    if (z13) {
                        c = ' ';
                        j7 = 90;
                    } else {
                        int m6 = kc2Var5.m();
                        c = ' ';
                        ArrayList arrayList4 = new ArrayList(m6);
                        j7 = 90;
                        for (int i16 = 0; i16 < m6; i16++) {
                            int m7 = kc2Var5.m();
                            long a6 = !z15 ? q73.a(a, kc2Var5) : -9223372036854775807L;
                            arrayList4.add(new q33(m7, a6, c83Var4.b(a6)));
                        }
                        list2 = arrayList4;
                    }
                    if (z14) {
                        long m8 = kc2Var5.m();
                        z9 = (m8 & 128) != 0;
                        j11 = ((((m8 & 1) << c) | kc2Var5.n()) * 1000) / j7;
                    } else {
                        z9 = false;
                    }
                    int r = kc2Var5.r();
                    int m9 = kc2Var5.m();
                    z8 = z9;
                    i8 = kc2Var5.m();
                    list = list2;
                    i6 = r;
                    i7 = m9;
                    z5 = z12;
                    j6 = j11;
                    long j12 = a5;
                    z7 = z15;
                    z6 = z13;
                    j5 = j12;
                }
                i = 0;
                t33Var = new r33(n3, z11, z5, z6, z7, j5, c83Var4.b(j5), list, z8, j6, i6, i7, i8);
            }
        } else {
            kc2 kc2Var6 = this.a;
            long n4 = kc2Var6.n();
            int i17 = a2 - 4;
            byte[] bArr = new byte[i17];
            i = 0;
            kc2Var6.a(bArr, 0, i17);
            t33Var = new zj2(n4, bArr, a);
        }
        if (t33Var == null) {
            return new ut1(new tt1[i]);
        }
        tt1[] tt1VarArr = new tt1[1];
        tt1VarArr[i] = t33Var;
        return new ut1(tt1VarArr);
    }
}
