package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import yads.bs1;
import yads.cs1;
import yads.fh2;
import yads.q03;
import yads.q43;
import yads.s03;
import yads.w03;

/* loaded from: classes7.dex */
public final class fu71 extends eo71 {
    public final dl81 a = new dl81();
    public final uh81 b = new uh81();
    public lo61 c;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
    
        if (r3 != r5) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eo71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cs1 b(u471 u471Var, ByteBuffer byteBuffer) {
        int i;
        bs1 s03Var;
        int i2;
        long j;
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
        lo61 lo61Var = this.c;
        if (lo61Var != null) {
            long j8 = u471Var.A;
            synchronized (lo61Var) {
                long j9 = lo61Var.b;
            }
        }
        lo61 lo61Var2 = new lo61(u471Var.x);
        this.c = lo61Var2;
        lo61Var2.b(u471Var.x - u471Var.A);
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        dl81 dl81Var = this.a;
        dl81Var.a = array;
        dl81Var.c = limit;
        int i9 = 0;
        dl81Var.b = 0;
        uh81 uh81Var = this.b;
        uh81Var.a = array;
        uh81Var.b = 0;
        uh81Var.c = 0;
        uh81Var.d = limit;
        uh81Var.h(39);
        long a = (this.b.a(1) << 32) | this.b.a(32);
        this.b.h(20);
        int a2 = this.b.a(12);
        int a3 = this.b.a(8);
        dl81 dl81Var2 = this.a;
        dl81Var2.m(dl81Var2.b + 14);
        if (a3 == 0) {
            i = 0;
            s03Var = new s03();
        } else if (a3 != 255) {
            long j10 = 1;
            long j11 = -9223372036854775807L;
            if (a3 == 4) {
                dl81 dl81Var3 = this.a;
                int s = dl81Var3.s();
                ArrayList arrayList = new ArrayList(s);
                int i10 = 0;
                while (i10 < s) {
                    long t = dl81Var3.t();
                    boolean z10 = (dl81Var3.s() & 128) != 0 ? 1 : i9;
                    ArrayList arrayList2 = new ArrayList();
                    if (z10 == 0) {
                        int s2 = dl81Var3.s();
                        int i11 = (s2 & 128) != 0 ? 1 : i9;
                        int i12 = (s2 & 64) != 0 ? 1 : i9;
                        int i13 = (s2 & 32) != 0 ? 1 : i9;
                        long t2 = i12 != 0 ? dl81Var3.t() : -9223372036854775807L;
                        if (i12 == 0) {
                            int s3 = dl81Var3.s();
                            ArrayList arrayList3 = new ArrayList(s3);
                            int i14 = i9;
                            while (i14 < s3) {
                                arrayList3.add(new yg81(dl81Var3.s(), dl81Var3.t()));
                                i14++;
                                i10 = i10;
                                j10 = j10;
                            }
                            arrayList2 = arrayList3;
                        }
                        i2 = i10;
                        j = j10;
                        if (i13 != 0) {
                            long s4 = dl81Var3.s();
                            z4 = (s4 & 128) != 0;
                            j4 = ((((s4 & j) << 32) | dl81Var3.t()) * 1000) / 90;
                        } else {
                            j4 = -9223372036854775807L;
                            z4 = false;
                        }
                        j3 = j4;
                        z3 = z4;
                        z = i11;
                        z2 = i12;
                        j2 = t2;
                        i3 = dl81Var3.x();
                        i4 = dl81Var3.s();
                        i5 = dl81Var3.s();
                    } else {
                        i2 = i10;
                        j = j10;
                        j2 = -9223372036854775807L;
                        j3 = -9223372036854775807L;
                        z = 0;
                        z2 = 0;
                        z3 = false;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                    }
                    arrayList.add(new ik81(t, z10, z, z2, arrayList2, j2, z3, j3, i3, i4, i5));
                    i10 = i2 + 1;
                    j10 = j;
                    i9 = 0;
                }
                s03Var = new w03(arrayList);
                i = 0;
            } else if (a3 != 5) {
                if (a3 != 6) {
                    s03Var = null;
                } else {
                    dl81 dl81Var4 = this.a;
                    lo61 lo61Var3 = this.c;
                    long a4 = q43.a(dl81Var4, a);
                    s03Var = new q43(a4, lo61Var3.c(a4));
                }
                i = 0;
            } else {
                dl81 dl81Var5 = this.a;
                lo61 lo61Var4 = this.c;
                long t3 = dl81Var5.t();
                boolean z11 = (dl81Var5.s() & 128) != 0;
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
                    int s5 = dl81Var5.s();
                    boolean z12 = (s5 & 128) != 0;
                    boolean z13 = (s5 & 64) != 0;
                    boolean z14 = (s5 & 32) != 0;
                    boolean z15 = (s5 & 16) != 0;
                    long a5 = (!z13 || z15) ? -9223372036854775807L : q43.a(dl81Var5, a);
                    if (z13) {
                        c = ' ';
                        j7 = 90;
                    } else {
                        int s6 = dl81Var5.s();
                        c = ' ';
                        ArrayList arrayList4 = new ArrayList(s6);
                        j7 = 90;
                        for (int i15 = 0; i15 < s6; i15++) {
                            int s7 = dl81Var5.s();
                            long a6 = !z15 ? q43.a(dl81Var5, a) : -9223372036854775807L;
                            arrayList4.add(new p081(s7, a6, lo61Var4.c(a6)));
                        }
                        list2 = arrayList4;
                    }
                    if (z14) {
                        long s8 = dl81Var5.s();
                        z9 = (s8 & 128) != 0;
                        j11 = ((((s8 & 1) << c) | dl81Var5.t()) * 1000) / j7;
                    } else {
                        z9 = false;
                    }
                    int x = dl81Var5.x();
                    int s9 = dl81Var5.s();
                    z8 = z9;
                    i8 = dl81Var5.s();
                    list = list2;
                    z7 = z15;
                    i6 = x;
                    i7 = s9;
                    j6 = j11;
                    j5 = a5;
                    z5 = z12;
                    z6 = z13;
                }
                i = 0;
                s03Var = new q03(t3, z11, z5, z6, z7, j5, lo61Var4.c(j5), list, z8, j6, i6, i7, i8);
            }
        } else {
            dl81 dl81Var6 = this.a;
            long t4 = dl81Var6.t();
            int i16 = a2 - 4;
            byte[] bArr = new byte[i16];
            i = 0;
            dl81Var6.d(0, i16, bArr);
            s03Var = new fh2(t4, bArr, a);
        }
        if (s03Var == null) {
            return new cs1(new bs1[i]);
        }
        bs1[] bs1VarArr = new bs1[1];
        bs1VarArr[i] = s03Var;
        return new cs1(bs1VarArr);
    }
}
