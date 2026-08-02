package xsna;

import xsna.dak0;

/* compiled from: DerivedState.kt */
/* loaded from: classes11.dex */
public final class f1m<T> extends nuk0 implements g1m<T> {
    public final gzs<T> c;
    public final abk0<T> d;
    public a<T> e = new a<>(qak0.j().g());

    /* compiled from: DerivedState.kt */
    public static final class a<T> extends puk0 {
        public static final Object h = new Object();
        public long c;
        public int d;
        public op70<muk0> e;
        public Object f;
        public int g;

        public a(long j) {
            super(j);
            this.e = pp70.a;
            this.f = h;
        }

        @Override // xsna.puk0
        public final void a(puk0 puk0Var) {
            a aVar = (a) puk0Var;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
        }

        @Override // xsna.puk0
        public final puk0 b() {
            return new a(qak0.j().g());
        }

        @Override // xsna.puk0
        public final puk0 c(long j) {
            return new a(j);
        }

        public final boolean d(f1m f1mVar, dak0 dak0Var) {
            boolean z;
            boolean z2;
            Object obj = qak0.c;
            synchronized (obj) {
                z = true;
                if (this.c == dak0Var.g()) {
                    if (this.d == dak0Var.h()) {
                        z2 = false;
                    }
                }
                z2 = true;
            }
            if (this.f == h || (z2 && this.g != e(f1mVar, dak0Var))) {
                z = false;
            }
            if (!z || !z2) {
                return z;
            }
            synchronized (obj) {
                this.c = dak0Var.g();
                this.d = dak0Var.h();
                s3q0 s3q0Var = s3q0.a;
            }
            return z;
        }

        public final int e(f1m f1mVar, dak0 dak0Var) {
            op70<muk0> op70Var;
            int i;
            long[] jArr;
            int i2;
            Object[] objArr;
            int[] iArr;
            long[] jArr2;
            int i3;
            Object[] objArr2;
            int[] iArr2;
            long j;
            int i4;
            puk0 i5;
            a<T> aVar;
            synchronized (qak0.c) {
                op70Var = this.e;
            }
            int i6 = 7;
            if (op70Var.e == 0) {
                return 7;
            }
            ci50<i1m> a = bbk0.a();
            i1m[] i1mVarArr = a.b;
            int i7 = a.d;
            for (int i8 = 0; i8 < i7; i8++) {
                i1mVarArr[i8].start();
            }
            try {
                Object[] objArr3 = op70Var.b;
                int[] iArr3 = op70Var.c;
                long[] jArr3 = op70Var.a;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    i = 7;
                    int i9 = 0;
                    while (true) {
                        long j2 = jArr3[i9];
                        long j3 = -9187201950435737472L;
                        if ((((~j2) << i6) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8;
                            int i11 = 8 - ((~(i9 - length)) >>> 31);
                            i2 = i6;
                            int i12 = 0;
                            while (i12 < i11) {
                                if ((j2 & 255) < 128) {
                                    int i13 = (i9 << 3) + i12;
                                    j = j3;
                                    int i14 = i10;
                                    muk0 muk0Var = (muk0) objArr3[i13];
                                    if (iArr3[i13] != 1) {
                                        jArr2 = jArr3;
                                        i3 = i12;
                                        objArr2 = objArr3;
                                        iArr2 = iArr3;
                                    } else {
                                        if (muk0Var instanceof f1m) {
                                            f1m f1mVar2 = (f1m) muk0Var;
                                            a<T> a0 = f1mVar2.a0((a) qak0.i(f1mVar2.e, dak0Var), dak0Var, false, f1mVar2.c);
                                            op70<muk0> op70Var2 = a0.e;
                                            Object[] objArr4 = op70Var2.b;
                                            long[] jArr4 = op70Var2.a;
                                            int length2 = jArr4.length - 2;
                                            jArr2 = jArr3;
                                            i3 = i12;
                                            objArr2 = objArr3;
                                            if (length2 >= 0) {
                                                int i15 = 0;
                                                while (true) {
                                                    long j4 = jArr4[i15];
                                                    iArr2 = iArr3;
                                                    aVar = a0;
                                                    if ((((~j4) << i2) & j4 & j) != j) {
                                                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                                        for (int i17 = 0; i17 < i16; i17++) {
                                                            if ((j4 & 255) < 128) {
                                                                i = (i * 31) + System.identityHashCode((muk0) objArr4[(i15 << 3) + i17]);
                                                            }
                                                            j4 >>= i14;
                                                        }
                                                        if (i16 != i14) {
                                                            break;
                                                        }
                                                    }
                                                    if (i15 == length2) {
                                                        break;
                                                    }
                                                    i15++;
                                                    iArr3 = iArr2;
                                                    a0 = aVar;
                                                    i14 = 8;
                                                }
                                            } else {
                                                iArr2 = iArr3;
                                                aVar = a0;
                                            }
                                            i5 = aVar;
                                        } else {
                                            jArr2 = jArr3;
                                            i3 = i12;
                                            objArr2 = objArr3;
                                            iArr2 = iArr3;
                                            i5 = qak0.i(muk0Var.j(), dak0Var);
                                        }
                                        i = (((i * 31) + System.identityHashCode(i5)) * 31) + Long.hashCode(i5.a);
                                    }
                                    i4 = 8;
                                } else {
                                    jArr2 = jArr3;
                                    i3 = i12;
                                    objArr2 = objArr3;
                                    iArr2 = iArr3;
                                    j = j3;
                                    i4 = i10;
                                }
                                j2 >>= i4;
                                i10 = i4;
                                jArr3 = jArr2;
                                j3 = j;
                                objArr3 = objArr2;
                                iArr3 = iArr2;
                                i12 = i3 + 1;
                            }
                            jArr = jArr3;
                            objArr = objArr3;
                            iArr = iArr3;
                            if (i11 != i10) {
                                break;
                            }
                        } else {
                            jArr = jArr3;
                            i2 = i6;
                            objArr = objArr3;
                            iArr = iArr3;
                        }
                        if (i9 == length) {
                            i6 = i;
                            break;
                        }
                        i9++;
                        i6 = i2;
                        jArr3 = jArr;
                        objArr3 = objArr;
                        iArr3 = iArr;
                    }
                }
                i = i6;
                s3q0 s3q0Var = s3q0.a;
                i1m[] i1mVarArr2 = a.b;
                int i18 = a.d;
                for (int i19 = 0; i19 < i18; i19++) {
                    i1mVarArr2[i19].a();
                }
                return i;
            } catch (Throwable th) {
                i1m[] i1mVarArr3 = a.b;
                int i20 = a.d;
                for (int i21 = 0; i21 < i20; i21++) {
                    i1mVarArr3[i21].a();
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f1m(gzs<? extends T> gzsVar, abk0<T> abk0Var) {
        this.c = gzsVar;
        this.d = abk0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [xsna.e1m] */
    public final a<T> a0(a<T> aVar, dak0 dak0Var, boolean z, gzs<? extends T> gzsVar) {
        int i;
        abk0<T> abk0Var;
        int i2;
        a<T> aVar2 = aVar;
        int i3 = 0;
        if (aVar2.d(this, dak0Var)) {
            if (z) {
                ci50<i1m> a2 = bbk0.a();
                i1m[] i1mVarArr = a2.b;
                int i4 = a2.d;
                for (int i5 = 0; i5 < i4; i5++) {
                    i1mVarArr[i5].start();
                }
                try {
                    op70<muk0> op70Var = aVar2.e;
                    jbk0<m9x> jbk0Var = bbk0.a;
                    m9x a3 = jbk0Var.a();
                    if (a3 == null) {
                        a3 = new m9x(0);
                        jbk0Var.b(a3);
                    }
                    int i6 = a3.a;
                    Object[] objArr = op70Var.b;
                    int[] iArr = op70Var.c;
                    long[] jArr = op70Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i7 = 0;
                        while (true) {
                            long j = jArr[i7];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i8 = 8;
                                int i9 = 8 - ((~(i7 - length)) >>> 31);
                                while (i3 < i9) {
                                    if ((j & 255) < 128) {
                                        int i10 = (i7 << 3) + i3;
                                        i2 = i8;
                                        muk0 muk0Var = (muk0) objArr[i10];
                                        a3.a = i6 + iArr[i10];
                                        izs<Object, s3q0> e = dak0Var.e();
                                        if (e != null) {
                                            e.invoke(muk0Var);
                                        }
                                    } else {
                                        i2 = i8;
                                    }
                                    j >>= i2;
                                    i3++;
                                    i8 = i2;
                                }
                                if (i9 != i8) {
                                    break;
                                }
                            }
                            if (i7 == length) {
                                break;
                            }
                            i7++;
                            i3 = 0;
                        }
                    }
                    a3.a = i6;
                    s3q0 s3q0Var = s3q0.a;
                    i1m[] i1mVarArr2 = a2.b;
                    int i11 = a2.d;
                    for (int i12 = 0; i12 < i11; i12++) {
                        i1mVarArr2[i12].a();
                    }
                } catch (Throwable th) {
                    i1m[] i1mVarArr3 = a2.b;
                    int i13 = a2.d;
                    for (int i14 = 0; i14 < i13; i14++) {
                        i1mVarArr3[i14].a();
                    }
                    throw th;
                }
            }
            return aVar2;
        }
        final eh50 eh50Var = new eh50((Object) null);
        jbk0<m9x> jbk0Var2 = bbk0.a;
        final m9x a4 = jbk0Var2.a();
        if (a4 == null) {
            i = 0;
            a4 = new m9x(0);
            jbk0Var2.b(a4);
        } else {
            i = 0;
        }
        final int i15 = a4.a;
        ci50<i1m> a5 = bbk0.a();
        i1m[] i1mVarArr4 = a5.b;
        int i16 = a5.d;
        for (int i17 = i; i17 < i16; i17++) {
            i1mVarArr4[i17].start();
        }
        try {
            a4.a = i15 + 1;
            Object c = dak0.a.c(new izs() { // from class: xsna.e1m
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    if (obj == f1m.this) {
                        throw new IllegalStateException("A derived state calculation cannot read itself");
                    }
                    if (obj instanceof muk0) {
                        int i18 = a4.a - i15;
                        eh50 eh50Var2 = eh50Var;
                        eh50Var2.i(obj, Math.min(i18, eh50Var2.c(Integer.MAX_VALUE, obj)));
                    }
                    return s3q0.a;
                }
            }, gzsVar);
            a4.a = i15;
            i1m[] i1mVarArr5 = a5.b;
            int i18 = a5.d;
            while (i < i18) {
                i1mVarArr5[i].a();
                i++;
            }
            Object obj = qak0.c;
            synchronized (obj) {
                try {
                    dak0 j2 = qak0.j();
                    Object obj2 = aVar2.f;
                    if (obj2 == a.h || (abk0Var = this.d) == 0 || !abk0Var.b(c, obj2)) {
                        a<T> aVar3 = this.e;
                        synchronized (obj) {
                            puk0 m = qak0.m(aVar3, this);
                            m.a(aVar3);
                            m.a = j2.g();
                            aVar2 = (a) m;
                            aVar2.e = eh50Var;
                            aVar2.g = aVar2.e(this, j2);
                            aVar2.f = c;
                        }
                        return aVar2;
                    }
                    aVar2.e = eh50Var;
                    aVar2.g = aVar2.e(this, j2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            m9x a6 = bbk0.a.a();
            if (a6 == null || a6.a != 0) {
                return aVar2;
            }
            qak0.j().m();
            synchronized (obj) {
                dak0 j3 = qak0.j();
                aVar2.c = j3.g();
                aVar2.d = j3.h();
                s3q0 s3q0Var2 = s3q0.a;
                return aVar2;
            }
        } catch (Throwable th3) {
            i1m[] i1mVarArr6 = a5.b;
            int i19 = a5.d;
            for (int i20 = i; i20 < i19; i20++) {
                i1mVarArr6[i20].a();
            }
            throw th3;
        }
    }

    @Override // xsna.g1m
    public final abk0<T> d() {
        return this.d;
    }

    @Override // xsna.mtk0
    public final T getValue() {
        izs<Object, s3q0> e = qak0.j().e();
        if (e != null) {
            e.invoke(this);
        }
        dak0 j = qak0.j();
        return (T) a0((a) qak0.i(this.e, j), j, true, this.c).f;
    }

    @Override // xsna.muk0
    public final puk0 j() {
        return this.e;
    }

    @Override // xsna.muk0
    public final void n(puk0 puk0Var) {
        this.e = (a) puk0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        a aVar = (a) qak0.h(this.e);
        sb.append(aVar.d(this, qak0.j()) ? String.valueOf(aVar.f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }

    @Override // xsna.g1m
    public final a u() {
        dak0 j = qak0.j();
        return a0((a) qak0.i(this.e, j), j, false, this.c);
    }
}
