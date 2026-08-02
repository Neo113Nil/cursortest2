package xsna;

import java.util.ArrayList;
import java.util.Arrays;
import xsna.q630;
import xsna.rty;

/* compiled from: LazyLayoutItemAnimator.kt */
/* loaded from: classes11.dex */
public final class bty<T extends rty> {
    public jty b;
    public int c;
    public b j;
    public final ph50<Object, bty<T>.c> a = h5h0.b();
    public final qh50<Object> d = k5h0.a();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final q630 k = new a(this);

    /* compiled from: LazyLayoutItemAnimator.kt */
    public static final class a extends d730<b> {
        public final bty<?> a;

        public a(bty<?> btyVar) {
            this.a = btyVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // xsna.d730
        public final b r() {
            b bVar = new b();
            bVar.p = this.a;
            return bVar;
        }

        @Override // xsna.d730
        public final void s(b bVar) {
            b bVar2 = bVar;
            bty<?> btyVar = bVar2.p;
            bty<?> btyVar2 = this.a;
            if (epx.f(btyVar, btyVar2) || !bVar2.b.o) {
                return;
            }
            bty<?> btyVar3 = bVar2.p;
            btyVar3.e();
            btyVar3.b = null;
            btyVar3.c = -1;
            btyVar2.j = bVar2;
            bVar2.p = btyVar2;
        }

        public final String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.a + ')';
        }
    }

    /* compiled from: LazyLayoutItemAnimator.kt */
    public static final class b extends q630.c implements lio {
        public bty<?> p;

        public b() {
            throw null;
        }

        @Override // xsna.q630.c
        public final void a2() {
            this.p.j = this;
        }

        @Override // xsna.q630.c
        public final void b2() {
            bty<?> btyVar = this.p;
            btyVar.e();
            btyVar.b = null;
            btyVar.c = -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.p, ((b) obj).p);
        }

        public final int hashCode() {
            return this.p.hashCode();
        }

        public final String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.p + ')';
        }

        @Override // xsna.lio
        public final void v(toy toyVar) {
            er9 er9Var = toyVar.b;
            ArrayList arrayList = this.p.i;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                wsy wsyVar = (wsy) arrayList.get(i);
                mdu mduVar = wsyVar.n;
                if (mduVar != null) {
                    long j = wsyVar.m;
                    long j2 = mduVar.t;
                    float f = ((int) (j >> 32)) - ((int) (j2 >> 32));
                    float f2 = ((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L));
                    er9Var.c.a.l(f, f2);
                    try {
                        qdu.a(toyVar, mduVar);
                    } finally {
                        er9Var.c.a.l(-f, -f2);
                    }
                }
            }
            toyVar.s1();
        }
    }

    /* compiled from: LazyLayoutItemAnimator.kt */
    public final class c {
        public o6j b;
        public int c;
        public int d;
        public int f;
        public int g;
        public wsy[] a = up2.d;
        public int e = 1;

        public c() {
        }

        public static void b(c cVar, rty rtyVar, yvj yvjVar, kdu kduVar, int i, int i2) {
            bty.this.getClass();
            long o = rtyVar.o(0);
            cVar.a(rtyVar, yvjVar, kduVar, i, i2, (int) (!rtyVar.h() ? o & 4294967295L : o >> 32));
        }

        public final void a(T t, yvj yvjVar, kdu kduVar, int i, int i2, int i3) {
            wsy[] wsyVarArr = this.a;
            int length = wsyVarArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    this.f = i;
                    this.g = i2;
                    break;
                } else {
                    wsy wsyVar = wsyVarArr[i4];
                    if (wsyVar != null && wsyVar.g) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            int length2 = this.a.length;
            for (int b = t.b(); b < length2; b++) {
                wsy wsyVar2 = this.a[b];
                if (wsyVar2 != null) {
                    wsyVar2.d();
                }
            }
            if (this.a.length != t.b()) {
                this.a = (wsy[]) Arrays.copyOf(this.a, t.b());
            }
            this.b = new o6j(t.f());
            this.c = i3;
            this.d = t.c();
            this.e = t.l();
            int b2 = t.b();
            for (int i5 = 0; i5 < b2; i5++) {
                Object n = t.n(i5);
                psy psyVar = n instanceof psy ? (psy) n : null;
                if (psyVar == null) {
                    wsy wsyVar3 = this.a[i5];
                    if (wsyVar3 != null) {
                        wsyVar3.d();
                    }
                    this.a[i5] = null;
                } else {
                    wsy wsyVar4 = this.a[i5];
                    if (wsyVar4 == null) {
                        wsyVar4 = new wsy(yvjVar, kduVar, new cty(bty.this, 0));
                        this.a[i5] = wsyVar4;
                    }
                    wsyVar4.d = psyVar.p;
                    wsyVar4.e = psyVar.q;
                    wsyVar4.f = psyVar.r;
                }
            }
        }
    }

    public static void c(rty rtyVar, int i, c cVar) {
        int i2 = 0;
        long o = rtyVar.o(0);
        long a2 = rtyVar.h() ? h9x.a(0, i, 1, o) : h9x.a(i, 0, 2, o);
        wsy[] wsyVarArr = cVar.a;
        int length = wsyVarArr.length;
        int i3 = 0;
        while (i2 < length) {
            wsy wsyVar = wsyVarArr[i2];
            int i4 = i3 + 1;
            if (wsyVar != null) {
                wsyVar.l = h9x.d(a2, h9x.c(rtyVar.o(i3), o));
            }
            i2++;
            i3 = i4;
        }
    }

    public static int h(int[] iArr, rty rtyVar) {
        int c2 = rtyVar.c();
        int l = rtyVar.l() + c2;
        int i = 0;
        while (c2 < l) {
            int j = rtyVar.j() + iArr[c2];
            iArr[c2] = j;
            i = Math.max(i, j);
            c2++;
        }
        return i;
    }

    public final wsy a(int i, Object obj) {
        wsy[] wsyVarArr;
        bty<T>.c d = this.a.d(obj);
        if (d == null || (wsyVarArr = d.a) == null) {
            return null;
        }
        return wsyVarArr[i];
    }

    public final long b() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            wsy wsyVar = (wsy) arrayList.get(i);
            mdu mduVar = wsyVar.n;
            if (mduVar != null) {
                j = (Math.max((int) (j & 4294967295L), ((int) (wsyVar.l & 4294967295L)) + ((int) (mduVar.u & 4294967295L))) & 4294967295L) | (Math.max((int) (j >> 32), ((int) (wsyVar.l >> 32)) + ((int) (mduVar.u >> 32))) << 32);
            }
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d7, code lost:
    
        if (r36 == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d9, code lost:
    
        r1 = r29.a;
        r2 = r1.length;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01dd, code lost:
    
        if (r4 >= r2) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01df, code lost:
    
        r5 = r1[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01e1, code lost:
    
        if (r5 == null) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01e7, code lost:
    
        if (r5.c() == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01e9, code lost:
    
        r3.remove(r5);
        r14 = r48.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01ee, code lost:
    
        if (r14 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01f0, code lost:
    
        xsna.mio.a(r14);
        r14 = xsna.s3q0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01f5, code lost:
    
        r5.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01f8, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01fb, code lost:
    
        g(r11, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01ff, code lost:
    
        r1 = xsna.s3q0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0135, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x012d, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0111, code lost:
    
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x020c, code lost:
    
        f(r11.getKey());
        r1 = xsna.s3q0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x021f, code lost:
    
        r1 = new int[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0222, code lost:
    
        if (r58 == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        r8 = r48.c;
        r9 = (xsna.rty) xsna.j5g.a0(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0224, code lost:
    
        if (r7 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x022a, code lost:
    
        if (r15.isEmpty() != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0231, code lost:
    
        if (r15.size() <= 1) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0233, code lost:
    
        xsna.g5g.L(r15, new xsna.ety(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x023b, code lost:
    
        r4 = r15.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0240, code lost:
    
        if (r5 >= r4) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0242, code lost:
    
        r8 = (xsna.rty) r15.get(r5);
        c(r8, r59 - h(r1, r8), r12.d(r8.getKey()));
        g(r8, false);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        if (r9 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0262, code lost:
    
        xsna.jw5.o(0, 0, 6, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x026a, code lost:
    
        if (r14.isEmpty() != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0271, code lost:
    
        if (r14.size() <= 1) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0273, code lost:
    
        xsna.g5g.L(r14, new xsna.dty(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x027b, code lost:
    
        r4 = r14.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0280, code lost:
    
        if (r5 >= r4) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0282, code lost:
    
        r8 = (xsna.rty) r14.get(r5);
        c(r8, (h(r1, r8) + r60) - r8.j(), r12.d(r8.getKey()));
        g(r8, false);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        r9 = r9.getIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02a7, code lost:
    
        xsna.jw5.o(0, 0, 6, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02ab, code lost:
    
        r4 = r13.b;
        r5 = r13.a;
        r8 = r5.length - 2;
        r9 = r48.h;
        r10 = r48.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02b6, code lost:
    
        if (r8 < 0) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02b8, code lost:
    
        r28 = r3;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02bb, code lost:
    
        r2 = r5[r11];
        r30 = r4;
        r31 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02c9, code lost:
    
        if (((((~r2) << 7) & r2) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02cb, code lost:
    
        r4 = 8 - ((~(r11 - r8)) >>> 31);
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02d5, code lost:
    
        if (r5 >= r4) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02db, code lost:
    
        if ((r2 & 255) >= 128) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        r48.c = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02dd, code lost:
    
        r33 = r2;
        r2 = r30[(r11 << 3) + r5];
        r3 = r12.d(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02eb, code lost:
    
        if (r3 != 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02ed, code lost:
    
        r46 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0467, code lost:
    
        r32 = r5;
        r47 = r12;
        r43 = r13;
        r44 = r14;
        r45 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0472, code lost:
    
        r5 = r32 + 1;
        r6 = r57;
        r2 = r33 >> 8;
        r13 = r43;
        r14 = r44;
        r15 = r45;
        r1 = r46;
        r12 = r47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02f1, code lost:
    
        r32 = r5;
        r43 = r13;
        r13 = r53.b(r2);
        r44 = r14;
        r14 = java.lang.Math.min(r6, r3.e);
        r3.e = r14;
        r6 = java.lang.Math.min(r6 - r14, r3.d);
        r3.d = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0310, code lost:
    
        if (r13 != (-1)) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0312, code lost:
    
        r6 = r3.a;
        r13 = r6.length;
        r14 = 0;
        r35 = false;
        r36 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x031a, code lost:
    
        if (r14 >= r13) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (r55 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x031c, code lost:
    
        r37 = r6;
        r6 = r37[r14];
        r38 = r36 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0322, code lost:
    
        if (r6 == null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0328, code lost:
    
        if (r6.c() == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x032a, code lost:
    
        r6 = xsna.s3q0.a;
        r46 = r1;
        r47 = r12;
        r39 = r13;
        r45 = r15;
        r13 = r28;
        r35 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03cd, code lost:
    
        r28 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x03cf, code lost:
    
        r14 = r28 + 1;
        r28 = r13;
        r6 = r37;
        r36 = r38;
        r13 = r39;
        r15 = r45;
        r1 = r46;
        r12 = r47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x033a, code lost:
    
        r39 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x034a, code lost:
    
        if (((java.lang.Boolean) ((xsna.zak0) r6.k).getValue()).booleanValue() == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        r17 = 4294967295L;
        r9 = (r49 & 4294967295L) | (0 << 32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x034c, code lost:
    
        r6.d();
        r3.a[r36] = r16;
        r13 = r28;
        r13.remove(r6);
        r6 = r48.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x035a, code lost:
    
        if (r6 == null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x035c, code lost:
    
        xsna.mio.a(r6);
        r6 = xsna.s3q0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0361, code lost:
    
        r46 = r1;
        r47 = r12;
        r28 = r14;
        r45 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x036b, code lost:
    
        r13 = r28;
        r28 = r14;
        r14 = r6.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0371, code lost:
    
        if (r14 == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0373, code lost:
    
        r45 = r15;
        r15 = r6.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x037b, code lost:
    
        if (r6.c() != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x037d, code lost:
    
        if (r15 != null) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        if (r56 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0384, code lost:
    
        r46 = r1;
        r6.f(true);
        r47 = r12;
        r5 = r16;
        xsna.myc0.h(r6.a, r5, r5, new xsna.xsy(r6, r15, r14, r5), 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03a4, code lost:
    
        if (r6.c() == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03a6, code lost:
    
        r13.add(r6);
        r1 = r48.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03ab, code lost:
    
        if (r1 == null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x03ad, code lost:
    
        xsna.mio.a(r1);
        r1 = xsna.s3q0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03b2, code lost:
    
        r16 = null;
        r35 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03c0, code lost:
    
        r1 = xsna.s3q0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03b7, code lost:
    
        r6.d();
        r16 = null;
        r3.a[r36] = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        if (r58 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x037f, code lost:
    
        r46 = r1;
        r47 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x039a, code lost:
    
        r46 = r1;
        r47 = r12;
        r45 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03c3, code lost:
    
        r46 = r1;
        r47 = r12;
        r39 = r13;
        r45 = r15;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03e3, code lost:
    
        r46 = r1;
        r47 = r12;
        r45 = r15;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03eb, code lost:
    
        if (r35 != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03ed, code lost:
    
        f(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03f0, code lost:
    
        r1 = xsna.s3q0.a;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03f6, code lost:
    
        r46 = r1;
        r47 = r12;
        r45 = r15;
        r37 = r54.x(r13, r6, r3.e, r3.b.a);
        r37.k();
        r5 = r3.a;
        r6 = r5.length;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0419, code lost:
    
        if (r12 >= r6) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x041b, code lost:
    
        r13 = r5[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x041d, code lost:
    
        if (r13 == null) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x042e, code lost:
    
        if (((java.lang.Boolean) ((xsna.zak0) r13.h).getValue()).booleanValue() != true) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0442, code lost:
    
        r3.a(r37, r61, r62, r59, r60, r3.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0457, code lost:
    
        if (r13 >= r48.c) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0459, code lost:
    
        r10.add(r37);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x045d, code lost:
    
        r9.add(r37);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        r14 = r12.b;
        r15 = r12.a;
        r13 = 2;
        r11 = r15.length - 2;
        r13 = r48.d;
        r58 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0431, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0434, code lost:
    
        if (r7 == null) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x043a, code lost:
    
        if (r13 != r7.b(r2)) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x043c, code lost:
    
        f(r2);
        r1 = xsna.s3q0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0463, code lost:
    
        r46 = r1;
        r33 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0485, code lost:
    
        r46 = r1;
        r47 = r12;
        r43 = r13;
        r44 = r14;
        r45 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009a, code lost:
    
        if (r11 < 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0491, code lost:
    
        if (r4 != 8) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x04a0, code lost:
    
        if (r11 == r8) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x04a2, code lost:
    
        r11 = r11 + 1;
        r6 = r57;
        r4 = r30;
        r5 = r31;
        r13 = r43;
        r14 = r44;
        r15 = r45;
        r1 = r46;
        r12 = r47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x04c4, code lost:
    
        if (r10.isEmpty() != false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x04cb, code lost:
    
        if (r10.size() <= 1) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x04cd, code lost:
    
        r5 = r53;
        xsna.g5g.L(r10, new xsna.fty(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x04da, code lost:
    
        r1 = r10.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x04df, code lost:
    
        if (r2 >= r1) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x04e1, code lost:
    
        r3 = (xsna.rty) r10.get(r2);
        r6 = r47;
        r4 = r6.d(r3.getKey());
        r7 = r46;
        r8 = h(r7, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x04f9, code lost:
    
        if (r56 == false) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x04fb, code lost:
    
        r11 = (xsna.rty) xsna.j5g.Y(r52);
        r14 = r11.o(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x050a, code lost:
    
        if (r11.h() == false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x050c, code lost:
    
        r11 = r14 & r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x050e, code lost:
    
        r11 = (int) r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0515, code lost:
    
        r3.d(r11 - r8, r4.c, r50, r51);
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x051f, code lost:
    
        if (r58 == false) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0521, code lost:
    
        g(r3, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a1, code lost:
    
        r14 = r15[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0525, code lost:
    
        r2 = r2 + 1;
        r47 = r6;
        r46 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0510, code lost:
    
        r11 = r14 >> 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0513, code lost:
    
        r11 = r4.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x052c, code lost:
    
        r8 = r50;
        r12 = r51;
        r7 = r46;
        r6 = r47;
        xsna.jw5.o(0, 0, 6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0548, code lost:
    
        if (r9.isEmpty() != false) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ad, code lost:
    
        if (((((~r14) << 7) & r14) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x054f, code lost:
    
        if (r9.size() <= 1) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0551, code lost:
    
        xsna.g5g.L(r9, new xsna.nw5(r5, r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x055b, code lost:
    
        r1 = r9.size();
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0560, code lost:
    
        if (r13 >= r1) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0562, code lost:
    
        r2 = (xsna.rty) r9.get(r13);
        r3 = r6.d(r2.getKey());
        r2.d((r3.g - r2.j()) + h(r7, r2), r3.c, r8, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0584, code lost:
    
        if (r58 == false) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0586, code lost:
    
        g(r2, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0589, code lost:
    
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00af, code lost:
    
        r2 = 8 - ((~(r1 - r11)) >>> 31);
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x058c, code lost:
    
        java.util.Collections.reverse(r10);
        r1 = xsna.s3q0.a;
        r52.addAll(0, r10);
        r52.addAll(r9);
        r45.clear();
        r44.clear();
        r10.clear();
        r9.clear();
        r43.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x05a9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x04d8, code lost:
    
        r5 = r53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x053a, code lost:
    
        r8 = r50;
        r12 = r51;
        r5 = r53;
        r7 = r46;
        r6 = r47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0494, code lost:
    
        r46 = r1;
        r47 = r12;
        r43 = r13;
        r44 = r14;
        r45 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x04b6, code lost:
    
        r46 = r1;
        r47 = r12;
        r43 = r13;
        r44 = r14;
        r45 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x007f, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b7, code lost:
    
        if (r3 >= r2) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x006c, code lost:
    
        r17 = 4294967295L;
        r9 = (r49 << 32) | (0 & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0058, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bd, code lost:
    
        if ((r14 & 255) >= 128) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bf, code lost:
    
        r31 = r3;
        r13.e(r14[(r1 << 3) + r3]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cd, code lost:
    
        r14 = r14 >> 8;
        r3 = r31 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cb, code lost:
    
        r31 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d4, code lost:
    
        if (r2 != 8) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d6, code lost:
    
        if (r1 == r11) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d8, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00db, code lost:
    
        r1 = r4.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e0, code lost:
    
        r3 = r48.i;
        r14 = r48.f;
        r15 = r48.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e6, code lost:
    
        if (r2 >= r1) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e8, code lost:
    
        r11 = (xsna.rty) r4.get(r2);
        r28 = r1;
        r13.m(r11.getKey());
        r1 = r11.b();
        r35 = r2;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0100, code lost:
    
        if (r2 >= r1) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0102, code lost:
    
        r29 = r1;
        r1 = r11.n(r2);
        r30 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010c, code lost:
    
        if ((r1 instanceof xsna.psy) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010e, code lost:
    
        r1 = (xsna.psy) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0113, code lost:
    
        if (r1 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0202, code lost:
    
        r2 = r30 + 1;
        r1 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0115, code lost:
    
        r29 = r12.d(r11.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0121, code lost:
    
        if (r7 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0123, code lost:
    
        r1 = r7.b(r11.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012f, code lost:
    
        if (r1 != (-1)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0131, code lost:
    
        if (r7 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0133, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0136, code lost:
    
        if (r29 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0138, code lost:
    
        r3 = new xsna.bty.c(r48);
        xsna.bty.c.b(r3, r11, r61, r62, r59, r60);
        r36 = r2;
        r12.p(r11.getKey(), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0159, code lost:
    
        if (r11.getIndex() == r1) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x015c, code lost:
    
        if (r1 == (-1)) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015e, code lost:
    
        if (r1 >= r8) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0160, code lost:
    
        r15.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0215, code lost:
    
        r2 = r35 + 1;
        r4 = r52;
        r1 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0165, code lost:
    
        r14.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016a, code lost:
    
        r14 = r11.o(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0173, code lost:
    
        if (r11.h() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0175, code lost:
    
        r1 = r14 & r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017c, code lost:
    
        c(r11, (int) r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017f, code lost:
    
        if (r36 == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0181, code lost:
    
        r1 = r3.a;
        r2 = r1.length;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0185, code lost:
    
        if (r3 >= r2) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0187, code lost:
    
        r11 = r1[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0189, code lost:
    
        if (r11 == null) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018b, code lost:
    
        r11.a();
        r11 = xsna.s3q0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0190, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0193, code lost:
    
        r1 = xsna.s3q0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0179, code lost:
    
        r1 = r14 >> 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0197, code lost:
    
        r36 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0199, code lost:
    
        if (r58 == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019b, code lost:
    
        xsna.bty.c.b(r29, r11, r61, r62, r59, r60);
        r2 = r29.a;
        r14 = r2.length;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ae, code lost:
    
        if (r15 >= r14) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b0, code lost:
    
        r29 = r2;
        r2 = r29[r15];
        r30 = r14;
        r31 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b8, code lost:
    
        if (r2 == null) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c2, code lost:
    
        if (xsna.h9x.b(r2.l, xsna.wsy.s) != false) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c4, code lost:
    
        r2.l = xsna.h9x.d(r2.l, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01cc, code lost:
    
        r15 = r31 + 1;
        r2 = r29;
        r14 = r30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v21, types: [kotlin.coroutines.d, kotlinx.coroutines.CoroutineStart, xsna.spj] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i, int i2, int i3, ArrayList arrayList, jty jtyVar, z46 z46Var, boolean z, boolean z2, int i4, boolean z3, int i5, int i6, yvj yvjVar, kdu kduVar) {
        Object obj;
        ArrayList arrayList2 = arrayList;
        int i7 = i4;
        jty jtyVar2 = this.b;
        this.b = jtyVar;
        int size = arrayList2.size();
        int i8 = 0;
        loop0: while (true) {
            ph50<Object, bty<T>.c> ph50Var = this.a;
            if (i8 < size) {
                rty rtyVar = (rty) arrayList2.get(i8);
                int b2 = rtyVar.b();
                for (int i9 = 0; i9 < b2; i9++) {
                    obj = null;
                    Object n = rtyVar.n(i9);
                    if ((n instanceof psy ? (psy) n : null) != null) {
                        break loop0;
                    }
                }
                i8++;
            } else {
                obj = null;
                if (ph50Var.f()) {
                    e();
                    return;
                }
            }
        }
    }

    public final void e() {
        ph50<Object, bty<T>.c> ph50Var = this.a;
        if (ph50Var.g()) {
            Object[] objArr = ph50Var.c;
            long[] jArr = ph50Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                for (wsy wsyVar : ((c) objArr[(i << 3) + i3]).a) {
                                    if (wsyVar != null) {
                                        wsyVar.d();
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            ph50Var.h();
        }
    }

    public final void f(Object obj) {
        wsy[] wsyVarArr;
        bty<T>.c n = this.a.n(obj);
        if (n == null || (wsyVarArr = n.a) == null) {
            return;
        }
        for (wsy wsyVar : wsyVarArr) {
            if (wsyVar != null) {
                wsyVar.d();
            }
        }
    }

    public final void g(T t, boolean z) {
        wsy[] wsyVarArr = this.a.d(t.getKey()).a;
        int length = wsyVarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            wsy wsyVar = wsyVarArr[i];
            int i3 = i2 + 1;
            if (wsyVar != null) {
                long o = t.o(i2);
                long j = wsyVar.l;
                if (!h9x.b(j, wsy.s) && !h9x.b(j, o)) {
                    long c2 = h9x.c(o, j);
                    phr<h9x> phrVar = wsyVar.e;
                    if (phrVar != null) {
                        long c3 = h9x.c(((h9x) ((zak0) wsyVar.q).getValue()).a, c2);
                        wsyVar.h(c3);
                        wsyVar.g(true);
                        wsyVar.g = z;
                        myc0.h(wsyVar.a, null, null, new zsy(wsyVar, phrVar, c3, null), 3);
                    }
                }
                wsyVar.l = o;
            }
            i++;
            i2 = i3;
        }
    }
}
