package yads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class ka3 implements vx2 {
    public final jc2 a = new jc2(new byte[5]);
    public final SparseArray b = new SparseArray();
    public final SparseIntArray c = new SparseIntArray();
    public final int d;
    public final /* synthetic */ la3 e;

    public ka3(la3 la3Var, int i) {
        this.e = la3Var;
        this.d = i;
    }

    @Override // yads.vx2
    public final void a(c83 c83Var, qq0 qq0Var, pa3 pa3Var) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x015f, code lost:
    
        if (r25.m() == r15) goto L55;
     */
    @Override // yads.vx2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(kc2 kc2Var) {
        c83 c83Var;
        int i;
        int i2;
        qa3 a;
        int i3;
        if (kc2Var.m() != 2) {
            return;
        }
        la3 la3Var = this.e;
        int i4 = la3Var.a;
        int i5 = 0;
        if (i4 == 1 || i4 == 2 || la3Var.m == 1) {
            c83Var = (c83) la3Var.c.get(0);
        } else {
            c83Var = new c83(((c83) la3Var.c.get(0)).a());
            this.e.c.add(c83Var);
        }
        if ((kc2Var.m() & 128) == 0) {
            return;
        }
        kc2Var.e(kc2Var.b + 1);
        int r = kc2Var.r();
        int i6 = 3;
        kc2Var.e(kc2Var.b + 3);
        jc2 jc2Var = this.a;
        kc2Var.a(jc2Var.a, 0, 2);
        jc2Var.b(0);
        this.a.c(3);
        int i7 = 13;
        this.e.s = this.a.a(13);
        jc2 jc2Var2 = this.a;
        kc2Var.a(jc2Var2.a, 0, 2);
        jc2Var2.b(0);
        int i8 = 4;
        this.a.c(4);
        int i9 = 12;
        kc2Var.e(kc2Var.b + this.a.a(12));
        la3 la3Var2 = this.e;
        int i10 = 21;
        if (la3Var2.a == 2 && la3Var2.q == null) {
            na3 na3Var = new na3(21, null, null, mc3.f);
            la3 la3Var3 = this.e;
            la3Var3.q = ((jf0) la3Var3.f).a(21, na3Var);
            la3 la3Var4 = this.e;
            qa3 qa3Var = la3Var4.q;
            if (qa3Var != null) {
                qa3Var.a(c83Var, la3Var4.l, new pa3(r, 21, 8192));
            }
        }
        this.b.clear();
        this.c.clear();
        int i11 = kc2Var.c - kc2Var.b;
        while (i11 > 0) {
            jc2 jc2Var3 = this.a;
            int i12 = 5;
            kc2Var.a(jc2Var3.a, i5, 5);
            jc2Var3.b(i5);
            int a2 = this.a.a(8);
            this.a.c(i6);
            int a3 = this.a.a(i7);
            this.a.c(i8);
            int a4 = this.a.a(i9);
            int i13 = kc2Var.b;
            int i14 = i13 + a4;
            int i15 = -1;
            String str = null;
            ArrayList arrayList = null;
            while (true) {
                if (kc2Var.b >= i14) {
                    i = i8;
                    break;
                }
                int m = kc2Var.m();
                int m2 = kc2Var.b + kc2Var.m();
                if (m2 > i14) {
                    i = 4;
                    break;
                }
                if (m == i12) {
                    long n = kc2Var.n();
                    if (n != 1094921523) {
                        if (n != 1161904947) {
                            if (n != 1094921524) {
                                if (n == 1212503619) {
                                    i15 = 36;
                                }
                                i3 = 4;
                                int i16 = kc2Var.b;
                                kc2Var.e((m2 - i16) + i16);
                                i8 = i3;
                                i12 = 5;
                                i6 = 3;
                                i10 = 21;
                            }
                            i15 = 172;
                            i3 = 4;
                            int i162 = kc2Var.b;
                            kc2Var.e((m2 - i162) + i162);
                            i8 = i3;
                            i12 = 5;
                            i6 = 3;
                            i10 = 21;
                        }
                        i15 = 135;
                        i3 = 4;
                        int i1622 = kc2Var.b;
                        kc2Var.e((m2 - i1622) + i1622);
                        i8 = i3;
                        i12 = 5;
                        i6 = 3;
                        i10 = 21;
                    }
                    i15 = 129;
                    i3 = 4;
                    int i16222 = kc2Var.b;
                    kc2Var.e((m2 - i16222) + i16222);
                    i8 = i3;
                    i12 = 5;
                    i6 = 3;
                    i10 = 21;
                } else {
                    if (m != 106) {
                        if (m != 122) {
                            if (m != 127) {
                                if (m == 123) {
                                    i15 = 138;
                                } else if (m == 10) {
                                    str = kc2Var.a(i6, bu.c).trim();
                                } else {
                                    if (m == 89) {
                                        ArrayList arrayList2 = new ArrayList();
                                        while (kc2Var.b < m2) {
                                            String trim = kc2Var.a(i6, bu.c).trim();
                                            kc2Var.m();
                                            byte[] bArr = new byte[4];
                                            kc2Var.a(bArr, 0, 4);
                                            arrayList2.add(new ma3(trim, bArr));
                                            i6 = 3;
                                        }
                                        i3 = 4;
                                        arrayList = arrayList2;
                                        i15 = 89;
                                    } else {
                                        i3 = 4;
                                        if (m == 111) {
                                            i15 = 257;
                                        }
                                    }
                                    int i162222 = kc2Var.b;
                                    kc2Var.e((m2 - i162222) + i162222);
                                    i8 = i3;
                                    i12 = 5;
                                    i6 = 3;
                                    i10 = 21;
                                }
                            }
                            i3 = 4;
                            int i1622222 = kc2Var.b;
                            kc2Var.e((m2 - i1622222) + i1622222);
                            i8 = i3;
                            i12 = 5;
                            i6 = 3;
                            i10 = 21;
                        }
                        i15 = 135;
                        i3 = 4;
                        int i16222222 = kc2Var.b;
                        kc2Var.e((m2 - i16222222) + i16222222);
                        i8 = i3;
                        i12 = 5;
                        i6 = 3;
                        i10 = 21;
                    }
                    i15 = 129;
                    i3 = 4;
                    int i162222222 = kc2Var.b;
                    kc2Var.e((m2 - i162222222) + i162222222);
                    i8 = i3;
                    i12 = 5;
                    i6 = 3;
                    i10 = 21;
                }
            }
            kc2Var.e(i14);
            na3 na3Var2 = new na3(i15, str, arrayList, Arrays.copyOfRange(kc2Var.a, i13, i14));
            if (a2 == 6 || a2 == 5) {
                a2 = i15;
            }
            i11 -= a4 + 5;
            la3 la3Var5 = this.e;
            int i17 = la3Var5.a == 2 ? a2 : a3;
            if (la3Var5.h.get(i17)) {
                i2 = 21;
            } else {
                la3 la3Var6 = this.e;
                if (la3Var6.a == 2) {
                    i2 = 21;
                    if (a2 == 21) {
                        a = la3Var6.q;
                        if (this.e.a == 2 || a3 < this.c.get(i17, 8192)) {
                            this.c.put(i17, a3);
                            this.b.put(i17, a);
                        }
                    }
                } else {
                    i2 = 21;
                }
                a = ((jf0) la3Var6.f).a(a2, na3Var2);
                if (this.e.a == 2) {
                }
                this.c.put(i17, a3);
                this.b.put(i17, a);
            }
            i10 = i2;
            i5 = 0;
            i6 = 3;
            i7 = 13;
            i9 = 12;
            i8 = i;
        }
        int size = this.c.size();
        for (int i18 = 0; i18 < size; i18++) {
            int keyAt = this.c.keyAt(i18);
            int valueAt = this.c.valueAt(i18);
            this.e.h.put(keyAt, true);
            this.e.i.put(valueAt, true);
            qa3 qa3Var2 = (qa3) this.b.valueAt(i18);
            if (qa3Var2 != null) {
                la3 la3Var7 = this.e;
                if (qa3Var2 != la3Var7.q) {
                    qa3Var2.a(c83Var, la3Var7.l, new pa3(r, keyAt, 8192));
                }
                this.e.g.put(valueAt, qa3Var2);
            }
        }
        la3 la3Var8 = this.e;
        if (la3Var8.a == 2) {
            if (la3Var8.n) {
                return;
            }
            la3Var8.l.a();
            la3 la3Var9 = this.e;
            la3Var9.m = 0;
            la3Var9.n = true;
            return;
        }
        la3Var8.g.remove(this.d);
        la3 la3Var10 = this.e;
        int i19 = la3Var10.a == 1 ? 0 : la3Var10.m - 1;
        la3Var10.m = i19;
        if (i19 == 0) {
            la3Var10.l.a();
            this.e.n = true;
        }
    }
}
