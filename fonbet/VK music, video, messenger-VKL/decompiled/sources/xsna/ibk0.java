package xsna;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import xsna.f1m;

/* compiled from: SnapshotStateObserver.kt */
/* loaded from: classes11.dex */
public final class ibk0 {
    public final izs<gzs<s3q0>, s3q0> a;
    public boolean c;
    public cak0 h;
    public a i;
    public final AtomicReference<Object> b = new AtomicReference<>(null);
    public final wmg d = new wmg(this, 5);
    public final ece0 e = new ece0(this, 8);
    public final ci50<a> f = new ci50<>(new a[16]);
    public final Object g = new Object();
    public long j = -1;

    /* compiled from: SnapshotStateObserver.kt */
    public static final class a {
        public final izs<Object, s3q0> a;
        public Object b;
        public eh50<Object> c;
        public boolean j;
        public int k;
        public int d = -1;
        public final ph50<Object, Object> e = h5h0.b();
        public final ph50<Object, eh50<Object>> f = new ph50<>((Object) null);
        public final qh50<Object> g = new qh50<>((Object) null);
        public final ci50<g1m<?>> h = new ci50<>(new g1m[16]);
        public final C3047a i = new C3047a();
        public final ph50<Object, Object> l = h5h0.b();
        public final HashMap<g1m<?>, Object> m = new HashMap<>();

        /* compiled from: SnapshotStateObserver.kt */
        /* renamed from: xsna.ibk0$a$a, reason: collision with other inner class name */
        public static final class C3047a implements i1m {
            public C3047a() {
            }

            @Override // xsna.i1m
            public final void a() {
                a aVar = a.this;
                aVar.k--;
            }

            @Override // xsna.i1m
            public final void start() {
                a.this.k++;
            }
        }

        public a(izs<Object, s3q0> izsVar) {
            this.a = izsVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
        
            if (((xsna.nuk0) r15).W(2) == false) goto L138;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:305:0x054c  */
        /* JADX WARN: Type inference failed for: r29v10, types: [xsna.abk0] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean a(Set<? extends Object> set) {
            char c;
            long j;
            boolean z;
            Iterator it;
            Object obj;
            int i;
            Object d;
            boolean z2;
            Object[] objArr;
            Iterator it2;
            Object obj2;
            ph50<Object, Object> ph50Var;
            int i2;
            Object[] objArr2;
            long j2;
            boolean z3;
            long[] jArr;
            int i3;
            int i4;
            boolean z4;
            g1m<?> g1mVar;
            int i5;
            g1m<?> g1mVar2;
            long[] jArr2;
            k0x k0xVar;
            Object[] objArr3;
            ph50<Object, Object> ph50Var2;
            HashMap<g1m<?>, Object> hashMap;
            long[] jArr3;
            k0x k0xVar2;
            Object[] objArr4;
            ph50<Object, Object> ph50Var3;
            HashMap<g1m<?>, Object> hashMap2;
            int i6;
            int i7;
            int i8;
            long j3;
            HashMap<g1m<?>, Object> hashMap3;
            Object[] objArr5;
            ph50<Object, Object> ph50Var4;
            HashMap<g1m<?>, Object> hashMap4;
            int i9;
            int i10;
            long j4;
            int i11;
            long[] jArr4;
            long[] jArr5;
            k0x k0xVar3 = k0x.c;
            boolean z5 = set instanceof l5h0;
            ci50<g1m<?>> ci50Var = this.h;
            ph50<Object, Object> ph50Var5 = this.l;
            HashMap<g1m<?>, Object> hashMap5 = this.m;
            ph50<Object, Object> ph50Var6 = this.e;
            qh50<Object> qh50Var = this.g;
            if (z5) {
                j5h0 j5h0Var = ((l5h0) set).b;
                Object[] objArr6 = j5h0Var.b;
                long[] jArr6 = j5h0Var.a;
                c = 7;
                int length = jArr6.length - 2;
                if (length >= 0) {
                    int i12 = 0;
                    z = false;
                    j = -9187201950435737472L;
                    while (true) {
                        int i13 = 8;
                        long j5 = jArr6[i12];
                        int i14 = i12;
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i15 = 8 - ((~(i14 - length)) >>> 31);
                            int i16 = 0;
                            while (i16 < i15) {
                                if ((j5 & 255) < 128) {
                                    Object obj3 = objArr6[(i14 << 3) + i16];
                                    jArr3 = jArr6;
                                    if (obj3 instanceof nuk0) {
                                        k0xVar2 = k0xVar3;
                                    } else {
                                        k0xVar2 = k0xVar3;
                                    }
                                    if (this.j || !ph50Var5.b(obj3)) {
                                        objArr4 = objArr6;
                                        ph50Var3 = ph50Var5;
                                        hashMap2 = hashMap5;
                                        i6 = length;
                                        i7 = i15;
                                        i8 = i16;
                                        j3 = j5;
                                    } else {
                                        this.j = true;
                                        try {
                                            Object d2 = ph50Var5.d(obj3);
                                            if (d2 == null) {
                                                objArr4 = objArr6;
                                                ph50Var3 = ph50Var5;
                                                hashMap2 = hashMap5;
                                                i6 = length;
                                                i7 = i15;
                                                i8 = i16;
                                                j3 = j5;
                                            } else if (d2 instanceof qh50) {
                                                qh50 qh50Var2 = (qh50) d2;
                                                Object[] objArr7 = qh50Var2.b;
                                                long[] jArr7 = qh50Var2.a;
                                                int length2 = jArr7.length - 2;
                                                if (length2 >= 0) {
                                                    i8 = i16;
                                                    boolean z6 = z;
                                                    int i17 = 0;
                                                    while (true) {
                                                        long j6 = jArr7[i17];
                                                        j3 = j5;
                                                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                                            int i19 = 0;
                                                            while (i19 < i18) {
                                                                if ((j6 & 255) < 128) {
                                                                    objArr5 = objArr6;
                                                                    g1m g1mVar3 = (g1m) objArr7[(i17 << 3) + i19];
                                                                    j4 = j6;
                                                                    Object obj4 = hashMap5.get(g1mVar3);
                                                                    abk0 d3 = g1mVar3.d();
                                                                    if (d3 == null) {
                                                                        d3 = k0xVar2;
                                                                    }
                                                                    i11 = i19;
                                                                    if (d3.b(g1mVar3.u().f, obj4)) {
                                                                        ph50Var4 = ph50Var5;
                                                                        hashMap4 = hashMap5;
                                                                        i9 = length;
                                                                        i10 = i15;
                                                                        ci50Var.b(g1mVar3);
                                                                    } else {
                                                                        Object d4 = ph50Var6.d(g1mVar3);
                                                                        if (d4 != null) {
                                                                            if (d4 instanceof qh50) {
                                                                                qh50 qh50Var3 = (qh50) d4;
                                                                                Object[] objArr8 = qh50Var3.b;
                                                                                long[] jArr8 = qh50Var3.a;
                                                                                int length3 = jArr8.length - 2;
                                                                                if (length3 >= 0) {
                                                                                    i9 = length;
                                                                                    i10 = i15;
                                                                                    int i20 = 0;
                                                                                    while (true) {
                                                                                        long j7 = jArr8[i20];
                                                                                        ph50Var4 = ph50Var5;
                                                                                        hashMap4 = hashMap5;
                                                                                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                            int i21 = 8 - ((~(i20 - length3)) >>> 31);
                                                                                            int i22 = 0;
                                                                                            while (i22 < i21) {
                                                                                                if ((j7 & 255) < 128) {
                                                                                                    jArr5 = jArr8;
                                                                                                    qh50Var.e(objArr8[(i20 << 3) + i22]);
                                                                                                    z6 = true;
                                                                                                } else {
                                                                                                    jArr5 = jArr8;
                                                                                                }
                                                                                                j7 >>= i13;
                                                                                                i22++;
                                                                                                jArr8 = jArr5;
                                                                                            }
                                                                                            jArr4 = jArr8;
                                                                                            if (i21 != i13) {
                                                                                                break;
                                                                                            }
                                                                                        } else {
                                                                                            jArr4 = jArr8;
                                                                                        }
                                                                                        if (i20 == length3) {
                                                                                            break;
                                                                                        }
                                                                                        i20++;
                                                                                        ph50Var5 = ph50Var4;
                                                                                        hashMap5 = hashMap4;
                                                                                        jArr8 = jArr4;
                                                                                        i13 = 8;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                ph50Var4 = ph50Var5;
                                                                                hashMap4 = hashMap5;
                                                                                i9 = length;
                                                                                i10 = i15;
                                                                                qh50Var.e(d4);
                                                                                z6 = true;
                                                                            }
                                                                            s3q0 s3q0Var = s3q0.a;
                                                                        }
                                                                        ph50Var4 = ph50Var5;
                                                                        hashMap4 = hashMap5;
                                                                        i9 = length;
                                                                        i10 = i15;
                                                                        s3q0 s3q0Var2 = s3q0.a;
                                                                    }
                                                                } else {
                                                                    objArr5 = objArr6;
                                                                    ph50Var4 = ph50Var5;
                                                                    hashMap4 = hashMap5;
                                                                    i9 = length;
                                                                    i10 = i15;
                                                                    j4 = j6;
                                                                    i11 = i19;
                                                                }
                                                                j6 = j4 >> 8;
                                                                i19 = i11 + 1;
                                                                i13 = 8;
                                                                objArr6 = objArr5;
                                                                length = i9;
                                                                i15 = i10;
                                                                ph50Var5 = ph50Var4;
                                                                hashMap5 = hashMap4;
                                                            }
                                                            objArr4 = objArr6;
                                                            ph50Var3 = ph50Var5;
                                                            hashMap3 = hashMap5;
                                                            i6 = length;
                                                            i7 = i15;
                                                            if (i18 != i13) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr4 = objArr6;
                                                            ph50Var3 = ph50Var5;
                                                            hashMap3 = hashMap5;
                                                            i6 = length;
                                                            i7 = i15;
                                                        }
                                                        if (i17 == length2) {
                                                            break;
                                                        }
                                                        i17++;
                                                        j5 = j3;
                                                        objArr6 = objArr4;
                                                        length = i6;
                                                        i15 = i7;
                                                        ph50Var5 = ph50Var3;
                                                        hashMap5 = hashMap3;
                                                        i13 = 8;
                                                    }
                                                    z = z6;
                                                } else {
                                                    objArr4 = objArr6;
                                                    ph50Var3 = ph50Var5;
                                                    hashMap3 = hashMap5;
                                                    i6 = length;
                                                    i7 = i15;
                                                    i8 = i16;
                                                    j3 = j5;
                                                }
                                                hashMap2 = hashMap3;
                                            } else {
                                                objArr4 = objArr6;
                                                ph50Var3 = ph50Var5;
                                                i6 = length;
                                                i7 = i15;
                                                i8 = i16;
                                                j3 = j5;
                                                g1m g1mVar4 = (g1m) d2;
                                                hashMap2 = hashMap5;
                                                Object obj5 = hashMap2.get(g1mVar4);
                                                abk0 d5 = g1mVar4.d();
                                                if (d5 == null) {
                                                    d5 = k0xVar2;
                                                }
                                                if (d5.b(g1mVar4.u().f, obj5)) {
                                                    ci50Var.b(g1mVar4);
                                                } else {
                                                    Object d6 = ph50Var6.d(g1mVar4);
                                                    if (d6 != null) {
                                                        if (d6 instanceof qh50) {
                                                            qh50 qh50Var4 = (qh50) d6;
                                                            Object[] objArr9 = qh50Var4.b;
                                                            long[] jArr9 = qh50Var4.a;
                                                            int length4 = jArr9.length - 2;
                                                            if (length4 >= 0) {
                                                                int i23 = 0;
                                                                while (true) {
                                                                    long j8 = jArr9[i23];
                                                                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i24 = 8 - ((~(i23 - length4)) >>> 31);
                                                                        for (int i25 = 0; i25 < i24; i25++) {
                                                                            if ((j8 & 255) < 128) {
                                                                                qh50Var.e(objArr9[(i23 << 3) + i25]);
                                                                                z = true;
                                                                            }
                                                                            j8 >>= 8;
                                                                        }
                                                                        if (i24 != 8) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (i23 == length4) {
                                                                        break;
                                                                    }
                                                                    i23++;
                                                                }
                                                            }
                                                        } else {
                                                            qh50Var.e(d6);
                                                            z = true;
                                                        }
                                                    }
                                                    s3q0 s3q0Var3 = s3q0.a;
                                                }
                                            }
                                            this.j = false;
                                        } finally {
                                        }
                                    }
                                    Object d7 = ph50Var6.d(obj3);
                                    if (d7 != null) {
                                        if (d7 instanceof qh50) {
                                            qh50 qh50Var5 = (qh50) d7;
                                            Object[] objArr10 = qh50Var5.b;
                                            long[] jArr10 = qh50Var5.a;
                                            int length5 = jArr10.length - 2;
                                            if (length5 >= 0) {
                                                int i26 = 0;
                                                while (true) {
                                                    long j9 = jArr10[i26];
                                                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i27 = 8 - ((~(i26 - length5)) >>> 31);
                                                        long j10 = j9;
                                                        for (int i28 = 0; i28 < i27; i28++) {
                                                            if ((j10 & 255) < 128) {
                                                                qh50Var.e(objArr10[(i26 << 3) + i28]);
                                                                z = true;
                                                            }
                                                            j10 >>= 8;
                                                        }
                                                        if (i27 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i26 == length5) {
                                                        break;
                                                    }
                                                    i26++;
                                                }
                                            }
                                        } else {
                                            qh50Var.e(d7);
                                            z = true;
                                        }
                                    }
                                    i16 = i8 + 1;
                                    i13 = 8;
                                    jArr6 = jArr3;
                                    objArr6 = objArr4;
                                    length = i6;
                                    i15 = i7;
                                    j5 = j3 >> 8;
                                    ph50Var5 = ph50Var3;
                                    hashMap5 = hashMap2;
                                    k0xVar3 = k0xVar2;
                                } else {
                                    jArr3 = jArr6;
                                    k0xVar2 = k0xVar3;
                                }
                                objArr4 = objArr6;
                                ph50Var3 = ph50Var5;
                                hashMap2 = hashMap5;
                                i6 = length;
                                i7 = i15;
                                i8 = i16;
                                j3 = j5;
                                i16 = i8 + 1;
                                i13 = 8;
                                jArr6 = jArr3;
                                objArr6 = objArr4;
                                length = i6;
                                i15 = i7;
                                j5 = j3 >> 8;
                                ph50Var5 = ph50Var3;
                                hashMap5 = hashMap2;
                                k0xVar3 = k0xVar2;
                            }
                            jArr2 = jArr6;
                            k0xVar = k0xVar3;
                            objArr3 = objArr6;
                            ph50Var2 = ph50Var5;
                            hashMap = hashMap5;
                            int i29 = length;
                            if (i15 != i13) {
                                break;
                            }
                            length = i29;
                        } else {
                            jArr2 = jArr6;
                            k0xVar = k0xVar3;
                            objArr3 = objArr6;
                            ph50Var2 = ph50Var5;
                            hashMap = hashMap5;
                        }
                        if (i14 == length) {
                            break;
                        }
                        i12 = i14 + 1;
                        hashMap5 = hashMap;
                        jArr6 = jArr2;
                        k0xVar3 = k0xVar;
                        objArr6 = objArr3;
                        ph50Var5 = ph50Var2;
                    }
                } else {
                    j = -9187201950435737472L;
                    z = false;
                }
            } else {
                ph50<Object, Object> ph50Var7 = ph50Var5;
                c = 7;
                j = -9187201950435737472L;
                Iterator it3 = set.iterator();
                boolean z7 = false;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (!(next instanceof nuk0) || ((nuk0) next).W(2)) {
                        if (!this.j) {
                            ph50<Object, Object> ph50Var8 = ph50Var7;
                            if (ph50Var8.b(next)) {
                                this.j = true;
                                try {
                                    Object d8 = ph50Var8.d(next);
                                    if (d8 != null) {
                                        if (d8 instanceof qh50) {
                                            qh50 qh50Var6 = (qh50) d8;
                                            Object[] objArr11 = qh50Var6.b;
                                            long[] jArr11 = qh50Var6.a;
                                            int length6 = jArr11.length - 2;
                                            if (length6 >= 0) {
                                                boolean z8 = z7;
                                                int i30 = 0;
                                                while (true) {
                                                    long j11 = jArr11[i30];
                                                    long[] jArr12 = jArr11;
                                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i31 = 8 - ((~(i30 - length6)) >>> 31);
                                                        int i32 = 0;
                                                        while (i32 < i31) {
                                                            if ((j11 & 255) < 128) {
                                                                it2 = it3;
                                                                g1m g1mVar5 = (g1m) objArr11[(i30 << 3) + i32];
                                                                ph50Var = ph50Var8;
                                                                Object obj6 = hashMap5.get(g1mVar5);
                                                                ?? d9 = g1mVar5.d();
                                                                i2 = i32;
                                                                k0x k0xVar4 = d9 == 0 ? k0xVar3 : d9;
                                                                objArr2 = objArr11;
                                                                if (k0xVar4.b(g1mVar5.u().f, obj6)) {
                                                                    obj2 = next;
                                                                    j2 = j11;
                                                                    ci50Var.b(g1mVar5);
                                                                } else {
                                                                    Object d10 = ph50Var6.d(g1mVar5);
                                                                    if (d10 != null) {
                                                                        if (d10 instanceof qh50) {
                                                                            qh50 qh50Var7 = (qh50) d10;
                                                                            Object[] objArr12 = qh50Var7.b;
                                                                            long[] jArr13 = qh50Var7.a;
                                                                            int length7 = jArr13.length - 2;
                                                                            if (length7 >= 0) {
                                                                                j2 = j11;
                                                                                int i33 = 0;
                                                                                boolean z9 = z8;
                                                                                while (true) {
                                                                                    long j12 = jArr13[i33];
                                                                                    obj2 = next;
                                                                                    Object[] objArr13 = objArr12;
                                                                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                        int i34 = 8 - ((~(i33 - length7)) >>> 31);
                                                                                        int i35 = 0;
                                                                                        while (i35 < i34) {
                                                                                            if ((j12 & 255) < 128) {
                                                                                                qh50Var.e(objArr13[(i33 << 3) + i35]);
                                                                                                z9 = true;
                                                                                            }
                                                                                            j12 >>= 8;
                                                                                            i35++;
                                                                                            jArr13 = jArr13;
                                                                                        }
                                                                                        jArr = jArr13;
                                                                                        if (i34 != 8) {
                                                                                            z3 = z9;
                                                                                            break;
                                                                                        }
                                                                                    } else {
                                                                                        jArr = jArr13;
                                                                                    }
                                                                                    if (i33 == length7) {
                                                                                        z8 = z9;
                                                                                        break;
                                                                                    }
                                                                                    i33++;
                                                                                    next = obj2;
                                                                                    objArr12 = objArr13;
                                                                                    jArr13 = jArr;
                                                                                }
                                                                                z3 = z8;
                                                                            }
                                                                        } else {
                                                                            obj2 = next;
                                                                            j2 = j11;
                                                                            qh50Var.e(d10);
                                                                            z3 = true;
                                                                        }
                                                                        s3q0 s3q0Var4 = s3q0.a;
                                                                        z8 = z3;
                                                                    }
                                                                    obj2 = next;
                                                                    j2 = j11;
                                                                    z3 = z8;
                                                                    s3q0 s3q0Var42 = s3q0.a;
                                                                    z8 = z3;
                                                                }
                                                            } else {
                                                                it2 = it3;
                                                                obj2 = next;
                                                                ph50Var = ph50Var8;
                                                                i2 = i32;
                                                                objArr2 = objArr11;
                                                                j2 = j11;
                                                            }
                                                            i32 = i2 + 1;
                                                            it3 = it2;
                                                            j11 = j2 >> 8;
                                                            objArr11 = objArr2;
                                                            next = obj2;
                                                            ph50Var8 = ph50Var;
                                                        }
                                                        it = it3;
                                                        obj = next;
                                                        ph50Var7 = ph50Var8;
                                                        objArr = objArr11;
                                                        if (i31 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        it = it3;
                                                        obj = next;
                                                        ph50Var7 = ph50Var8;
                                                        objArr = objArr11;
                                                    }
                                                    if (i30 == length6) {
                                                        break;
                                                    }
                                                    i30++;
                                                    it3 = it;
                                                    jArr11 = jArr12;
                                                    objArr11 = objArr;
                                                    next = obj;
                                                    ph50Var8 = ph50Var7;
                                                }
                                                z7 = z8;
                                            }
                                        } else {
                                            it = it3;
                                            obj = next;
                                            ph50Var7 = ph50Var8;
                                            g1m g1mVar6 = (g1m) d8;
                                            Object obj7 = hashMap5.get(g1mVar6);
                                            abk0 d11 = g1mVar6.d();
                                            if (d11 == null) {
                                                d11 = k0xVar3;
                                            }
                                            if (d11.b(g1mVar6.u().f, obj7)) {
                                                ci50Var.b(g1mVar6);
                                            } else {
                                                Object d12 = ph50Var6.d(g1mVar6);
                                                if (d12 != null) {
                                                    if (d12 instanceof qh50) {
                                                        qh50 qh50Var8 = (qh50) d12;
                                                        Object[] objArr14 = qh50Var8.b;
                                                        long[] jArr14 = qh50Var8.a;
                                                        int length8 = jArr14.length - 2;
                                                        if (length8 >= 0) {
                                                            boolean z10 = z7;
                                                            int i36 = 0;
                                                            while (true) {
                                                                long j13 = jArr14[i36];
                                                                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i37 = 8 - ((~(i36 - length8)) >>> 31);
                                                                    long j14 = j13;
                                                                    for (int i38 = 0; i38 < i37; i38++) {
                                                                        if ((j14 & 255) < 128) {
                                                                            qh50Var.e(objArr14[(i36 << 3) + i38]);
                                                                            z10 = true;
                                                                        }
                                                                        j14 >>= 8;
                                                                    }
                                                                    if (i37 != 8) {
                                                                        z2 = z10;
                                                                        break;
                                                                    }
                                                                }
                                                                if (i36 == length8) {
                                                                    z7 = z10;
                                                                    break;
                                                                }
                                                                i36++;
                                                            }
                                                        }
                                                    } else {
                                                        qh50Var.e(d12);
                                                        z2 = true;
                                                    }
                                                    s3q0 s3q0Var5 = s3q0.a;
                                                    z7 = z2;
                                                }
                                                z2 = z7;
                                                s3q0 s3q0Var52 = s3q0.a;
                                                z7 = z2;
                                            }
                                        }
                                        i = 0;
                                        this.j = false;
                                        boolean z11 = z7;
                                        d = ph50Var6.d(obj);
                                        if (d != null) {
                                            if (d instanceof qh50) {
                                                qh50 qh50Var9 = (qh50) d;
                                                Object[] objArr15 = qh50Var9.b;
                                                long[] jArr15 = qh50Var9.a;
                                                int length9 = jArr15.length - 2;
                                                if (length9 >= 0) {
                                                    int i39 = i;
                                                    while (true) {
                                                        long j15 = jArr15[i39];
                                                        if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i40 = 8 - ((~(i39 - length9)) >>> 31);
                                                            long j16 = j15;
                                                            for (int i41 = i; i41 < i40; i41++) {
                                                                if ((j16 & 255) < 128) {
                                                                    qh50Var.e(objArr15[(i39 << 3) + i41]);
                                                                    z11 = true;
                                                                }
                                                                j16 >>= 8;
                                                            }
                                                            if (i40 != 8) {
                                                                break;
                                                            }
                                                        }
                                                        if (i39 == length9) {
                                                            break;
                                                        }
                                                        i39++;
                                                    }
                                                }
                                            } else {
                                                qh50Var.e(d);
                                                z11 = true;
                                            }
                                        }
                                        z7 = z11;
                                    }
                                    it = it3;
                                    obj = next;
                                    ph50Var7 = ph50Var8;
                                    i = 0;
                                    this.j = false;
                                    boolean z112 = z7;
                                    d = ph50Var6.d(obj);
                                    if (d != null) {
                                    }
                                    z7 = z112;
                                } finally {
                                }
                            } else {
                                ph50Var7 = ph50Var8;
                            }
                        }
                        it = it3;
                        obj = next;
                        i = 0;
                        boolean z1122 = z7;
                        d = ph50Var6.d(obj);
                        if (d != null) {
                        }
                        z7 = z1122;
                    } else {
                        it = it3;
                    }
                    it3 = it;
                }
                z = z7;
            }
            int i42 = 0;
            if (this.j || (i3 = ci50Var.d) == 0) {
                return z;
            }
            g1m<?>[] g1mVarArr = ci50Var.b;
            int i43 = 0;
            while (i43 < i3) {
                g1m<?> g1mVar7 = g1mVarArr[i43];
                int hashCode = Long.hashCode(qak0.j().g());
                Object d13 = ph50Var6.d(g1mVar7);
                if (d13 != null) {
                    boolean z12 = d13 instanceof qh50;
                    ph50<Object, eh50<Object>> ph50Var9 = this.f;
                    if (z12) {
                        qh50 qh50Var10 = (qh50) d13;
                        Object[] objArr16 = qh50Var10.b;
                        long[] jArr16 = qh50Var10.a;
                        int length10 = jArr16.length - 2;
                        if (length10 >= 0) {
                            int i44 = i42;
                            g1m<?> g1mVar8 = g1mVar7;
                            while (true) {
                                long j17 = jArr16[i44];
                                z4 = z;
                                if ((((~j17) << c) & j17 & j) != j) {
                                    int i45 = 8 - ((~(i44 - length10)) >>> 31);
                                    long j18 = j17;
                                    int i46 = 0;
                                    while (i46 < i45) {
                                        if ((j18 & 255) < 128) {
                                            Object obj8 = objArr16[(i44 << 3) + i46];
                                            eh50<Object> d14 = ph50Var9.d(obj8);
                                            if (d14 == null) {
                                                i5 = i3;
                                                d14 = new eh50<>((Object) null);
                                                ph50Var9.p(obj8, d14);
                                                s3q0 s3q0Var6 = s3q0.a;
                                            } else {
                                                i5 = i3;
                                            }
                                            g1mVar2 = g1mVar8;
                                            b(g1mVar2, hashCode, obj8, d14);
                                        } else {
                                            i5 = i3;
                                            g1mVar2 = g1mVar8;
                                        }
                                        j18 >>= 8;
                                        i46++;
                                        g1mVar8 = g1mVar2;
                                        i3 = i5;
                                    }
                                    i4 = i3;
                                    g1mVar = g1mVar8;
                                    if (i45 != 8) {
                                        break;
                                    }
                                } else {
                                    i4 = i3;
                                    g1mVar = g1mVar8;
                                }
                                if (i44 != length10) {
                                    i44++;
                                    g1mVar8 = g1mVar;
                                    z = z4;
                                    i3 = i4;
                                }
                            }
                        } else {
                            i4 = i3;
                            z4 = z;
                        }
                    } else {
                        i4 = i3;
                        z4 = z;
                        eh50<Object> d15 = ph50Var9.d(d13);
                        if (d15 == null) {
                            d15 = new eh50<>((Object) null);
                            ph50Var9.p(d13, d15);
                            s3q0 s3q0Var7 = s3q0.a;
                        }
                        b(g1mVar7, hashCode, d13, d15);
                    }
                } else {
                    i4 = i3;
                    z4 = z;
                }
                i43++;
                z = z4;
                i3 = i4;
                i42 = 0;
            }
            boolean z13 = z;
            ci50Var.g();
            return z13;
        }

        public final void b(Object obj, int i, Object obj2, eh50<Object> eh50Var) {
            int i2;
            if (this.k > 0) {
                return;
            }
            int f = eh50Var.f(obj);
            if (f < 0) {
                f = ~f;
                i2 = -1;
            } else {
                i2 = eh50Var.c[f];
            }
            eh50Var.b[f] = obj;
            eh50Var.c[f] = i;
            if ((obj instanceof g1m) && i2 != i) {
                f1m.a u = ((g1m) obj).u();
                this.m.put(obj, u.f);
                op70<muk0> op70Var = u.e;
                ph50<Object, Object> ph50Var = this.l;
                s101.K(ph50Var, obj);
                Object[] objArr = op70Var.b;
                long[] jArr = op70Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((j & 255) < 128) {
                                    muk0 muk0Var = (muk0) objArr[(i3 << 3) + i5];
                                    if (muk0Var instanceof nuk0) {
                                        ((nuk0) muk0Var).Z(2);
                                    }
                                    s101.f(ph50Var, muk0Var, obj);
                                }
                                j >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
            if (i2 == -1) {
                if (obj instanceof nuk0) {
                    ((nuk0) obj).Z(2);
                }
                s101.f(this.e, obj, obj2);
            }
        }

        public final void c(Object obj, Object obj2) {
            ph50<Object, Object> ph50Var = this.e;
            s101.J(ph50Var, obj2, obj);
            if (!(obj2 instanceof g1m) || ph50Var.b(obj2)) {
                return;
            }
            s101.K(this.l, obj2);
            this.m.remove(obj2);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void d(izs<Object, Boolean> izsVar) {
            long[] jArr;
            long[] jArr2;
            long j;
            char c;
            long j2;
            int i;
            long j3;
            ph50<Object, eh50<Object>> ph50Var = this.f;
            long[] jArr3 = ph50Var.a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j4 = jArr3[i2];
                char c2 = 7;
                long j5 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j4 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            c = c2;
                            Object obj = ph50Var.b[i6];
                            j2 = j5;
                            eh50 eh50Var = (eh50) ph50Var.c[i6];
                            Boolean invoke = izsVar.invoke(obj);
                            if (invoke.booleanValue()) {
                                Object[] objArr = eh50Var.b;
                                int[] iArr = eh50Var.c;
                                long[] jArr4 = eh50Var.a;
                                int i7 = i3;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    jArr2 = jArr3;
                                    j = j4;
                                    int i8 = 0;
                                    while (true) {
                                        long j6 = jArr4[i8];
                                        long[] jArr5 = jArr4;
                                        if ((((~j6) << c) & j6 & j2) != j2) {
                                            int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                            for (int i10 = 0; i10 < i9; i10++) {
                                                if ((j6 & 255) < 128) {
                                                    int i11 = (i8 << 3) + i10;
                                                    j3 = j6;
                                                    Object obj2 = objArr[i11];
                                                    int i12 = iArr[i11];
                                                    c(obj, obj2);
                                                } else {
                                                    j3 = j6;
                                                }
                                                j6 = j3 >> i7;
                                            }
                                            if (i9 != i7) {
                                                break;
                                            }
                                        }
                                        if (i8 == length2) {
                                            break;
                                        }
                                        i8++;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    }
                                    if (invoke.booleanValue()) {
                                        ph50Var.o(i6);
                                    }
                                    i = 8;
                                }
                            }
                            jArr2 = jArr3;
                            j = j4;
                            if (invoke.booleanValue()) {
                            }
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            j = j4;
                            c = c2;
                            j2 = j5;
                            i = i3;
                        }
                        i5++;
                        i3 = i;
                        j4 = j >> i;
                        c2 = c;
                        j5 = j2;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i4 != i3) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i2 == length) {
                    return;
                }
                i2++;
                jArr3 = jArr;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ibk0(izs<? super gzs<s3q0>, s3q0> izsVar) {
        this.a = izsVar;
    }

    public final void a() {
        synchronized (this.g) {
            try {
                ci50<a> ci50Var = this.f;
                a[] aVarArr = ci50Var.b;
                int i = ci50Var.d;
                for (int i2 = 0; i2 < i; i2++) {
                    a aVar = aVarArr[i2];
                    aVar.e.h();
                    aVar.f.h();
                    aVar.l.h();
                    aVar.m.clear();
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0082 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x007a, B:11:0x0082, B:13:0x0092, B:15:0x0087, B:18:0x0022, B:21:0x002e, B:23:0x0043, B:25:0x0051, B:27:0x005b, B:29:0x0066, B:36:0x0073, B:39:0x0098), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Object obj) {
        int i;
        synchronized (this.g) {
            try {
                ci50<a> ci50Var = this.f;
                int i2 = ci50Var.d;
                int i3 = 0;
                int i4 = 0;
                while (i3 < i2) {
                    a aVar = ci50Var.b[i3];
                    eh50<Object> n = aVar.f.n(obj);
                    if (n != null) {
                        Object[] objArr = n.b;
                        int[] iArr = n.c;
                        long[] jArr = n.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i5 = 0;
                            while (true) {
                                long j = jArr[i5];
                                i = i3;
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                                    for (int i7 = 0; i7 < i6; i7++) {
                                        if ((j & 255) < 128) {
                                            int i8 = (i5 << 3) + i7;
                                            Object obj2 = objArr[i8];
                                            int i9 = iArr[i8];
                                            aVar.c(obj, obj2);
                                        }
                                        j >>= 8;
                                    }
                                    if (i6 != 8) {
                                        break;
                                    }
                                }
                                if (i5 == length) {
                                    break;
                                }
                                i5++;
                                i3 = i;
                            }
                            if (aVar.f.g()) {
                                i4++;
                            } else if (i4 > 0) {
                                a[] aVarArr = ci50Var.b;
                                aVarArr[i - i4] = aVarArr[i];
                            }
                            i3 = i + 1;
                        }
                    }
                    i = i3;
                    if (aVar.f.g()) {
                    }
                    i3 = i + 1;
                }
                int i10 = i2 - i4;
                Arrays.fill(ci50Var.b, i10, i2, (Object) null);
                ci50Var.d = i10;
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z;
        Set<? extends Object> set;
        Set<? extends Object> set2;
        synchronized (this.g) {
            z = this.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference<Object> atomicReference = this.b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                r4 = null;
                Object subList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        throw at.b("Unexpected notification");
                    }
                    List list = (List) obj;
                    Set<? extends Object> set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        subList = list.get(1);
                    } else if (list.size() > 2) {
                        subList = list.subList(1, list.size());
                    }
                    set2 = set3;
                }
                while (!atomicReference.compareAndSet(obj, subList)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.g) {
                try {
                    ci50<a> ci50Var = this.f;
                    a[] aVarArr = ci50Var.b;
                    int i = ci50Var.d;
                    for (int i2 = 0; i2 < i; i2++) {
                        if (!aVarArr[i2].a(set) && !z2) {
                            z2 = false;
                        }
                        z2 = true;
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x021a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v1, types: [xsna.s3q0] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> void d(T t, izs<? super T, s3q0> izsVar, gzs<s3q0> gzsVar) {
        a aVar;
        a aVar2;
        boolean z;
        a aVar3;
        long j;
        ?? r6;
        long j2;
        a aVar4;
        dak0 mop0Var;
        long j3;
        eh50<Object> eh50Var;
        int i;
        long j4;
        eh50<Object> eh50Var2;
        long f = ey2.f();
        synchronized (this.g) {
            ci50<a> ci50Var = this.f;
            a[] aVarArr = ci50Var.b;
            int i2 = ci50Var.d;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    aVar = null;
                    break;
                }
                aVar = aVarArr[i3];
                if (aVar.a == izsVar) {
                    break;
                } else {
                    i3++;
                }
            }
            aVar2 = aVar;
            z = true;
            if (aVar2 == null) {
                ttp0.d(1, izsVar);
                aVar2 = new a(izsVar);
                ci50Var.b(aVar2);
            }
            aVar3 = this.i;
            j = this.j;
            r6 = s3q0.a;
        }
        long j5 = r6;
        if (j != -1) {
            j5 = r6;
            if (j != f) {
                StringBuilder b = fp.b(j, "Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=");
                b.append(f);
                b.append(", name=");
                b.append(Thread.currentThread().getName());
                b.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
                gxc0.a(b.toString());
                j5 = "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.";
            }
        }
        try {
            synchronized (this.g) {
                try {
                    this.i = aVar2;
                    this.j = f;
                } catch (Throwable th) {
                    th = th;
                    j2 = j5;
                }
            }
            ece0 ece0Var = this.e;
            Object obj = aVar2.b;
            eh50<Object> eh50Var3 = aVar2.c;
            int i4 = aVar2.d;
            aVar2.b = t;
            aVar2.c = aVar2.f.d(t);
            if (aVar2.d == -1) {
                aVar2.d = Long.hashCode(qak0.j().g());
            }
            a.C3047a c3047a = aVar2.i;
            ci50<i1m> a2 = bbk0.a();
            try {
                a2.b(c3047a);
                if (ece0Var == null) {
                    gzsVar.invoke();
                    aVar4 = aVar2;
                } else {
                    dak0 a3 = qak0.b.a();
                    if (a3 instanceof mop0) {
                        aVar4 = aVar2;
                        if (((mop0) a3).t == ey2.f()) {
                            izs<Object, s3q0> izsVar2 = ((mop0) a3).r;
                            izs<Object, s3q0> izsVar3 = ((mop0) a3).s;
                            try {
                                ((mop0) a3).r = qak0.k(ece0Var, izsVar2, true);
                                ((mop0) a3).s = izsVar3;
                                gzsVar.invoke();
                                ((mop0) a3).r = izsVar2;
                                ((mop0) a3).s = izsVar3;
                            } catch (Throwable th2) {
                                ((mop0) a3).r = izsVar2;
                                ((mop0) a3).s = izsVar3;
                                throw th2;
                            }
                        }
                    } else {
                        aVar4 = aVar2;
                    }
                    if (a3 == null || (a3 instanceof uh50)) {
                        mop0Var = new mop0(a3 instanceof uh50 ? (uh50) a3 : null, ece0Var, null, true, false);
                    } else {
                        mop0Var = a3.u(ece0Var);
                    }
                    try {
                        dak0 j6 = mop0Var.j();
                        try {
                            gzsVar.invoke();
                            dak0.q(j6);
                            mop0Var.c();
                        } catch (Throwable th3) {
                            try {
                                dak0.q(j6);
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    mop0Var.c();
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                    a2.k(a2.d - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                a2.k(a2.d - 1);
                a aVar5 = aVar4;
                Object obj2 = aVar5.b;
                int i5 = aVar5.d;
                eh50<Object> eh50Var4 = aVar5.c;
                if (eh50Var4 != null) {
                    try {
                        long[] jArr = eh50Var4.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j7 = jArr[i6];
                                boolean z2 = z;
                                eh50<Object> eh50Var5 = eh50Var4;
                                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j7 & 255) < 128) {
                                            i = i8;
                                            int i9 = (i6 << 3) + i;
                                            j4 = j7;
                                            eh50Var2 = eh50Var5;
                                            Object obj3 = eh50Var2.b[i9];
                                            j3 = j;
                                            try {
                                                boolean z3 = eh50Var2.c[i9] != i5 ? z2 : false;
                                                if (z3) {
                                                    aVar5.c(obj2, obj3);
                                                }
                                                if (z3) {
                                                    eh50Var2.h(i9);
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                j2 = j3;
                                                synchronized (this.g) {
                                                    this.i = aVar3;
                                                    this.j = j2;
                                                    s3q0 s3q0Var = s3q0.a;
                                                }
                                                throw th;
                                            }
                                        } else {
                                            i = i8;
                                            j4 = j7;
                                            eh50Var2 = eh50Var5;
                                            j3 = j;
                                        }
                                        i8 = i + 1;
                                        long j8 = j3;
                                        eh50Var5 = eh50Var2;
                                        j7 = j4 >> 8;
                                        j = j8;
                                    }
                                    eh50Var = eh50Var5;
                                    j3 = j;
                                    if (i7 != 8) {
                                        break;
                                    }
                                } else {
                                    eh50Var = eh50Var5;
                                    j3 = j;
                                }
                                if (i6 == length) {
                                    break;
                                }
                                i6++;
                                eh50Var4 = eh50Var;
                                z = z2;
                                j = j3;
                            }
                            aVar5.b = obj;
                            aVar5.c = eh50Var3;
                            aVar5.d = i4;
                            synchronized (this.g) {
                                this.i = aVar3;
                                this.j = j3;
                                s3q0 s3q0Var2 = s3q0.a;
                            }
                            return;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        j3 = j;
                        j2 = j3;
                        synchronized (this.g) {
                        }
                    }
                }
                j3 = j;
                aVar5.b = obj;
                aVar5.c = eh50Var3;
                aVar5.d = i4;
                synchronized (this.g) {
                }
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Throwable th10) {
            th = th10;
            j2 = j;
        }
    }

    public final void e() {
        wmg wmgVar = this.d;
        qak0.e(qak0.a);
        synchronized (qak0.c) {
            qak0.h = j5g.v0(wmgVar, qak0.h);
            s3q0 s3q0Var = s3q0.a;
        }
        this.h = new cak0(wmgVar);
    }
}
