package xsna;

import android.os.Trace;
import androidx.compose.runtime.InvalidationResult;
import androidx.compose.runtime.PausedCompositionState;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import xsna.f1m;

/* compiled from: Composition.kt */
/* loaded from: classes11.dex */
public final class ivi implements hqj, qfg0, wef0, fr90 {
    public final cvi b;
    public final oc c;
    public final AtomicReference<Object> d = new AtomicReference<>(null);
    public final Object e = new Object();
    public final rh50 f;
    public final v2k0 g;
    public final ph50<Object, Object> h;
    public final qh50<androidx.compose.runtime.f> i;
    public final qh50<androidx.compose.runtime.f> j;
    public final ph50<Object, Object> k;
    public final csa l;
    public final csa m;
    public final ph50<Object, Object> n;
    public ph50<Object, Object> o;
    public boolean p;
    public ghj0 q;
    public kr90 r;
    public ivi s;
    public int t;
    public final jxb0 u;
    public final ytf0 v;
    public final androidx.compose.runtime.c w;
    public int x;
    public wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> y;

    public ivi(cvi cviVar, oc ocVar) {
        this.b = cviVar;
        this.c = ocVar;
        rh50 rh50Var = new rh50(new qh50((Object) null));
        this.f = rh50Var;
        v2k0 v2k0Var = new v2k0();
        if (cviVar.e()) {
            v2k0Var.b0();
        }
        if (cviVar.g()) {
            v2k0Var.c0();
        }
        this.g = v2k0Var;
        this.h = h5h0.b();
        this.i = new qh50<>((Object) null);
        this.j = new qh50<>((Object) null);
        this.k = h5h0.b();
        csa csaVar = new csa();
        this.l = csaVar;
        csa csaVar2 = new csa();
        this.m = csaVar2;
        this.n = h5h0.b();
        this.o = h5h0.b();
        jxb0 jxb0Var = new jxb0(cviVar);
        this.u = jxb0Var;
        this.v = new ytf0();
        androidx.compose.runtime.c cVar = new androidx.compose.runtime.c(ocVar, cviVar, x2k0.e(v2k0Var), rh50Var, csaVar, csaVar2, jxb0Var, this);
        cviVar.s(cVar);
        this.w = cVar;
        this.y = pq20.b;
    }

    public final void A(Set<? extends Object> set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean a;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        int i;
        long j6;
        boolean z2;
        int i2;
        long j7;
        long[] jArr6;
        long[] jArr7;
        char c2;
        long j8;
        int i3;
        int i4;
        long[] jArr8;
        boolean z3 = set instanceof l5h0;
        ph50<Object, Object> ph50Var = this.k;
        Object obj = null;
        int i5 = 8;
        if (z3) {
            j5h0<T> j5h0Var = ((l5h0) set).b;
            Object[] objArr = j5h0Var.b;
            long[] jArr9 = j5h0Var.a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr9[i6];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i6 << 3) + i8];
                                c2 = c3;
                                if (obj2 instanceof androidx.compose.runtime.f) {
                                    ((androidx.compose.runtime.f) obj2).c(obj);
                                    jArr7 = jArr9;
                                    j8 = j9;
                                    i3 = length;
                                } else {
                                    z(obj2, z);
                                    Object d = ph50Var.d(obj2);
                                    if (d != null) {
                                        if (d instanceof qh50) {
                                            qh50 qh50Var = (qh50) d;
                                            Object[] objArr2 = qh50Var.b;
                                            long[] jArr10 = qh50Var.a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i9 = i5;
                                                i3 = length;
                                                int i10 = 0;
                                                while (true) {
                                                    long j10 = jArr10[i10];
                                                    j8 = j9;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                        int i12 = 0;
                                                        while (i12 < i11) {
                                                            if ((j10 & 255) < 128) {
                                                                jArr8 = jArr9;
                                                                z((g1m) objArr2[(i10 << 3) + i12], z);
                                                            } else {
                                                                jArr8 = jArr9;
                                                            }
                                                            j10 >>= i9;
                                                            i12++;
                                                            jArr9 = jArr8;
                                                        }
                                                        jArr7 = jArr9;
                                                        if (i11 != i9) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr7 = jArr9;
                                                    }
                                                    if (i10 == length2) {
                                                        break;
                                                    }
                                                    i10++;
                                                    jArr10 = jArr11;
                                                    j9 = j8;
                                                    jArr9 = jArr7;
                                                    i9 = 8;
                                                }
                                            }
                                        } else {
                                            jArr7 = jArr9;
                                            j8 = j9;
                                            i3 = length;
                                            z((g1m) d, z);
                                        }
                                        s3q0 s3q0Var = s3q0.a;
                                    }
                                    jArr7 = jArr9;
                                    j8 = j9;
                                    i3 = length;
                                    s3q0 s3q0Var2 = s3q0.a;
                                }
                                i4 = 8;
                            } else {
                                jArr7 = jArr9;
                                c2 = c3;
                                j8 = j9;
                                i3 = length;
                                i4 = i5;
                            }
                            j9 = j8 >> i4;
                            i8++;
                            length = i3;
                            i5 = i4;
                            c3 = c2;
                            jArr9 = jArr7;
                            obj = null;
                        }
                        jArr6 = jArr9;
                        c = c3;
                        int i13 = length;
                        if (i7 != i5) {
                            break;
                        } else {
                            length = i13;
                        }
                    } else {
                        jArr6 = jArr9;
                        c = 7;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    jArr9 = jArr6;
                    obj = null;
                    i5 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof androidx.compose.runtime.f) {
                    ((androidx.compose.runtime.f) obj3).c(null);
                } else {
                    z(obj3, z);
                    Object d2 = ph50Var.d(obj3);
                    if (d2 != null) {
                        if (d2 instanceof qh50) {
                            qh50 qh50Var2 = (qh50) d2;
                            Object[] objArr3 = qh50Var2.b;
                            long[] jArr12 = qh50Var2.a;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                int i14 = 0;
                                while (true) {
                                    long j11 = jArr12[i14];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i15 = 8 - ((~(i14 - length3)) >>> 31);
                                        for (int i16 = 0; i16 < i15; i16++) {
                                            if ((j11 & 255) < 128) {
                                                z((g1m) objArr3[(i14 << 3) + i16], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i15 != 8) {
                                            break;
                                        }
                                    }
                                    if (i14 == length3) {
                                        break;
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        } else {
                            z((g1m) d2, z);
                        }
                    }
                    s3q0 s3q0Var3 = s3q0.a;
                }
            }
        }
        ph50<Object, Object> ph50Var2 = this.h;
        qh50<androidx.compose.runtime.f> qh50Var3 = this.i;
        if (z) {
            qh50<androidx.compose.runtime.f> qh50Var4 = this.j;
            if (qh50Var4.d()) {
                long[] jArr13 = ph50Var2.a;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j12 = jArr13[i17];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i18 = 8 - ((~(i17 - length4)) >>> 31);
                            int i19 = 0;
                            while (i19 < i18) {
                                if ((j12 & j2) < j) {
                                    int i20 = (i17 << 3) + i19;
                                    Object obj4 = ph50Var2.b[i20];
                                    Object obj5 = ph50Var2.c[i20];
                                    if (obj5 instanceof qh50) {
                                        qh50 qh50Var5 = (qh50) obj5;
                                        Object[] objArr4 = qh50Var5.b;
                                        long[] jArr14 = qh50Var5.a;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i21 = 0;
                                            while (true) {
                                                long j13 = jArr14[i21];
                                                jArr5 = jArr13;
                                                i = length4;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i22 = 8 - ((~(i21 - length5)) >>> 31);
                                                    for (int i23 = 0; i23 < i22; i23 = i2 + 1) {
                                                        if ((j13 & j2) < j) {
                                                            i2 = i23;
                                                            int i24 = (i21 << 3) + i2;
                                                            j7 = j13;
                                                            androidx.compose.runtime.f fVar = (androidx.compose.runtime.f) objArr4[i24];
                                                            if (qh50Var4.a(fVar) || qh50Var3.a(fVar)) {
                                                                qh50Var5.n(i24);
                                                            }
                                                        } else {
                                                            i2 = i23;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                    }
                                                    if (i22 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i21 == length5) {
                                                    break;
                                                }
                                                i21++;
                                                length4 = i;
                                                jArr13 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            i = length4;
                                            j6 = j12;
                                        }
                                        z2 = qh50Var5.c();
                                    } else {
                                        jArr5 = jArr13;
                                        i = length4;
                                        j6 = j12;
                                        androidx.compose.runtime.f fVar2 = (androidx.compose.runtime.f) obj5;
                                        z2 = qh50Var4.a(fVar2) || qh50Var3.a(fVar2);
                                    }
                                    if (z2) {
                                        ph50Var2.o(i20);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    i = length4;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i19++;
                                length4 = i;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            int i25 = length4;
                            if (i18 != 8) {
                                break;
                            } else {
                                length4 = i25;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i17 == length4) {
                            break;
                        }
                        i17++;
                        jArr13 = jArr4;
                    }
                }
                qh50Var4.f();
                C();
                return;
            }
        }
        if (qh50Var3.d()) {
            long[] jArr15 = ph50Var2.a;
            int length6 = jArr15.length - 2;
            if (length6 >= 0) {
                int i26 = 0;
                while (true) {
                    long j14 = jArr15[i26];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i27 = 8 - ((~(i26 - length6)) >>> 31);
                        int i28 = 0;
                        while (i28 < i27) {
                            if ((j14 & j2) < j) {
                                int i29 = (i26 << 3) + i28;
                                Object obj6 = ph50Var2.b[i29];
                                Object obj7 = ph50Var2.c[i29];
                                if (obj7 instanceof qh50) {
                                    qh50 qh50Var6 = (qh50) obj7;
                                    Object[] objArr5 = qh50Var6.b;
                                    long[] jArr16 = qh50Var6.a;
                                    int length7 = jArr16.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i30 = 0;
                                        Object[] objArr6 = objArr5;
                                        while (true) {
                                            long j15 = jArr16[i30];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr17 = jArr16;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i31 = 8 - ((~(i30 - length7)) >>> 31);
                                                int i32 = 0;
                                                while (i32 < i31) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr15;
                                                        int i33 = (i30 << 3) + i32;
                                                        j5 = j15;
                                                        if (qh50Var3.a((androidx.compose.runtime.f) objArr7[i33])) {
                                                            qh50Var6.n(i33);
                                                        }
                                                    } else {
                                                        jArr3 = jArr15;
                                                        j5 = j15;
                                                    }
                                                    i32++;
                                                    jArr15 = jArr3;
                                                    j15 = j5 >> 8;
                                                }
                                                jArr2 = jArr15;
                                                if (i31 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr15;
                                            }
                                            if (i30 == length7) {
                                                break;
                                            }
                                            i30++;
                                            objArr6 = objArr7;
                                            jArr16 = jArr17;
                                            jArr15 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr15;
                                        j4 = j14;
                                    }
                                    a = qh50Var6.c();
                                } else {
                                    jArr2 = jArr15;
                                    j4 = j14;
                                    a = qh50Var3.a((androidx.compose.runtime.f) obj7);
                                }
                                if (a) {
                                    ph50Var2.o(i29);
                                }
                            } else {
                                jArr2 = jArr15;
                                j4 = j14;
                            }
                            i28++;
                            j14 = j4 >> 8;
                            jArr15 = jArr2;
                        }
                        jArr = jArr15;
                        if (i27 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr15;
                    }
                    if (i26 == length6) {
                        break;
                    }
                    i26++;
                    jArr15 = jArr;
                }
            }
            C();
            qh50Var3.f();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090 A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #9 {all -> 0x003e, blocks: (B:3:0x0013, B:5:0x0035, B:7:0x0039, B:11:0x0047, B:12:0x004b, B:16:0x0056, B:29:0x0083, B:31:0x0090, B:148:0x0043), top: B:2:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(csa csaVar) {
        fd3<?> fd3Var;
        ytf0 ytf0Var;
        y2k0 f0;
        ytf0 ytf0Var2;
        long[] jArr;
        int i;
        long[] jArr2;
        ytf0 ytf0Var3;
        long j;
        char c;
        long j2;
        int i2;
        boolean z;
        long j3;
        csa csaVar2 = this.m;
        androidx.compose.runtime.c cVar = this.w;
        gvi q0 = cVar.q0();
        ytf0 ytf0Var4 = this.v;
        ytf0Var4.g(this.f, q0);
        try {
            if (csaVar.b.isEmpty()) {
                try {
                    if (csaVar2.b.isEmpty() && this.r == null) {
                        ytf0Var4.b();
                    }
                    return;
                } finally {
                }
            }
            kr90 kr90Var = this.r;
            if (kr90Var == null || (fd3Var = kr90Var.l) == null) {
                fd3Var = this.c;
            }
            try {
                Trace.beginSection(fd3Var.equals(kr90Var != null ? kr90Var.l : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    kr90 kr90Var2 = this.r;
                    try {
                        try {
                            if (kr90Var2 != null) {
                                ytf0Var = kr90Var2.k;
                                if (ytf0Var == null) {
                                }
                                v2k0 v2k0Var = this.g;
                                gvi q02 = cVar.q0();
                                f0 = x2k0.e(v2k0Var).f0();
                                int i3 = 0;
                                csaVar.r0(fd3Var, f0, ytf0Var, q02);
                                s3q0 s3q0Var = s3q0.a;
                                f0.e(true);
                                fd3Var.c();
                                Trace.endSection();
                                ytf0Var4.c();
                                ytf0Var4.d();
                                if (this.p) {
                                    ytf0Var2 = ytf0Var4;
                                } else {
                                    Trace.beginSection("Compose:unobserve");
                                    try {
                                        this.p = false;
                                        ph50<Object, Object> ph50Var = this.h;
                                        long[] jArr3 = ph50Var.a;
                                        int length = jArr3.length - 2;
                                        if (length >= 0) {
                                            int i4 = 0;
                                            while (true) {
                                                long j4 = jArr3[i4];
                                                char c2 = 7;
                                                long j5 = -9187201950435737472L;
                                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i5 = 8;
                                                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                                                    int i7 = i3;
                                                    while (i7 < i6) {
                                                        if ((j4 & 255) < 128) {
                                                            c = c2;
                                                            int i8 = (i4 << 3) + i7;
                                                            j2 = j5;
                                                            Object obj = ph50Var.b[i8];
                                                            Object obj2 = ph50Var.c[i8];
                                                            if (obj2 instanceof qh50) {
                                                                qh50 qh50Var = (qh50) obj2;
                                                                Object[] objArr = qh50Var.b;
                                                                long[] jArr4 = qh50Var.a;
                                                                int i9 = i5;
                                                                int length2 = jArr4.length - 2;
                                                                i = i7;
                                                                jArr2 = jArr3;
                                                                ytf0Var3 = ytf0Var4;
                                                                if (length2 >= 0) {
                                                                    int i10 = 0;
                                                                    while (true) {
                                                                        try {
                                                                            long j6 = jArr4[i10];
                                                                            j = j4;
                                                                            long[] jArr5 = jArr4;
                                                                            if ((((~j6) << c) & j6 & j2) != j2) {
                                                                                int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                                for (int i12 = 0; i12 < i11; i12++) {
                                                                                    if ((j6 & 255) < 128) {
                                                                                        j3 = j6;
                                                                                        int i13 = (i10 << 3) + i12;
                                                                                        if (!((androidx.compose.runtime.f) objArr[i13]).b()) {
                                                                                            qh50Var.n(i13);
                                                                                        }
                                                                                    } else {
                                                                                        j3 = j6;
                                                                                    }
                                                                                    j6 = j3 >> i9;
                                                                                }
                                                                                if (i11 != i9) {
                                                                                    break;
                                                                                }
                                                                            }
                                                                            if (i10 == length2) {
                                                                                break;
                                                                            }
                                                                            i10++;
                                                                            jArr4 = jArr5;
                                                                            j4 = j;
                                                                            i9 = 8;
                                                                        } catch (Throwable th) {
                                                                            th = th;
                                                                            Trace.endSection();
                                                                            throw th;
                                                                        }
                                                                    }
                                                                } else {
                                                                    j = j4;
                                                                }
                                                                z = qh50Var.c();
                                                            } else {
                                                                i = i7;
                                                                jArr2 = jArr3;
                                                                ytf0Var3 = ytf0Var4;
                                                                j = j4;
                                                                z = !((androidx.compose.runtime.f) obj2).b();
                                                            }
                                                            if (z) {
                                                                ph50Var.o(i8);
                                                            }
                                                            i2 = 8;
                                                        } else {
                                                            i = i7;
                                                            jArr2 = jArr3;
                                                            ytf0Var3 = ytf0Var4;
                                                            j = j4;
                                                            c = c2;
                                                            j2 = j5;
                                                            i2 = i5;
                                                        }
                                                        j4 = j >> i2;
                                                        i7 = i + 1;
                                                        i5 = i2;
                                                        c2 = c;
                                                        j5 = j2;
                                                        ytf0Var4 = ytf0Var3;
                                                        jArr3 = jArr2;
                                                    }
                                                    jArr = jArr3;
                                                    ytf0Var2 = ytf0Var4;
                                                    if (i6 != i5) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr = jArr3;
                                                    ytf0Var2 = ytf0Var4;
                                                }
                                                if (i4 == length) {
                                                    break;
                                                }
                                                i4++;
                                                ytf0Var4 = ytf0Var2;
                                                jArr3 = jArr;
                                                i3 = 0;
                                            }
                                        } else {
                                            ytf0Var2 = ytf0Var4;
                                        }
                                        C();
                                        s3q0 s3q0Var2 = s3q0.a;
                                        Trace.endSection();
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                                if (csaVar2.b.isEmpty() && this.r == null) {
                                    ytf0Var2.b();
                                }
                                return;
                            }
                            if (csaVar2.b.isEmpty()) {
                                ytf0Var2.b();
                            }
                            return;
                        } finally {
                            ytf0Var2.a();
                        }
                        csaVar.r0(fd3Var, f0, ytf0Var, q02);
                        s3q0 s3q0Var3 = s3q0.a;
                        f0.e(true);
                        fd3Var.c();
                        Trace.endSection();
                        ytf0Var4.c();
                        ytf0Var4.d();
                        if (this.p) {
                        }
                    } catch (Throwable th3) {
                        try {
                            f0.e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                    ytf0Var = ytf0Var4;
                    v2k0 v2k0Var2 = this.g;
                    gvi q022 = cVar.q0();
                    f0 = x2k0.e(v2k0Var2).f0();
                    int i32 = 0;
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                try {
                    if (csaVar2.b.isEmpty() && this.r == null) {
                        ytf0Var4.b();
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public final void C() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        char c2;
        long j5;
        long j6;
        int i2;
        boolean z;
        int i3;
        long j7;
        ph50<Object, Object> ph50Var = this.k;
        long[] jArr3 = ph50Var.a;
        int length = jArr3.length - 2;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            long j9 = 128;
            while (true) {
                long j10 = jArr3[i5];
                j2 = 255;
                if ((((~j10) << c3) & j10 & j8) != j8) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j10 & 255) < j9) {
                            c2 = c3;
                            int i8 = (i5 << 3) + i7;
                            j5 = j8;
                            Object obj = ph50Var.b[i8];
                            Object obj2 = ph50Var.c[i8];
                            boolean z2 = obj2 instanceof qh50;
                            ph50<Object, Object> ph50Var2 = this.h;
                            if (z2) {
                                qh50 qh50Var = (qh50) obj2;
                                Object[] objArr = qh50Var.b;
                                long[] jArr4 = qh50Var.a;
                                j6 = j9;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j4 = j10;
                                    int i9 = i4;
                                    int i10 = 0;
                                    while (true) {
                                        long j11 = jArr4[i10];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j11) << c2) & j11 & j5) != j5) {
                                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                            int i12 = 0;
                                            while (i12 < i11) {
                                                if ((j11 & 255) < j6) {
                                                    i3 = i12;
                                                    int i13 = (i10 << 3) + i3;
                                                    j7 = j11;
                                                    if (!ph50Var2.b((g1m) objArr[i13])) {
                                                        qh50Var.n(i13);
                                                    }
                                                } else {
                                                    i3 = i12;
                                                    j7 = j11;
                                                }
                                                j11 = j7 >> i9;
                                                i12 = i3 + 1;
                                            }
                                            if (i11 != i9) {
                                                break;
                                            }
                                        }
                                        if (i10 == length2) {
                                            break;
                                        }
                                        i10++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    j4 = j10;
                                }
                                z = qh50Var.c();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                j4 = j10;
                                j6 = j9;
                                z = !ph50Var2.b((g1m) obj2);
                            }
                            if (z) {
                                ph50Var.o(i8);
                            }
                            i2 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            j4 = j10;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i2 = i4;
                        }
                        j10 = j4 >> i2;
                        i7++;
                        i4 = i2;
                        c3 = c2;
                        j8 = j5;
                        j9 = j6;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i14 = length;
                    c = c3;
                    j = j8;
                    j3 = j9;
                    if (i6 != i4) {
                        break;
                    } else {
                        length = i14;
                    }
                } else {
                    jArr = jArr3;
                    c = c3;
                    j = j8;
                    j3 = j9;
                }
                if (i5 == length) {
                    break;
                }
                i5++;
                c3 = c;
                j8 = j;
                j9 = j3;
                jArr3 = jArr;
                i4 = 8;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        qh50<androidx.compose.runtime.f> qh50Var2 = this.j;
        if (!qh50Var2.d()) {
            return;
        }
        Object[] objArr2 = qh50Var2.b;
        long[] jArr5 = qh50Var2.a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j12 = jArr5[i15];
            if ((((~j12) << c) & j12 & j) != j) {
                int i16 = 8 - ((~(i15 - length3)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((j12 & j2) < j3) {
                        int i18 = (i15 << 3) + i17;
                        if (!(((androidx.compose.runtime.f) objArr2[i18]).g != null)) {
                            qh50Var2.n(i18);
                        }
                    }
                    j12 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length3) {
                return;
            } else {
                i15++;
            }
        }
    }

    public final boolean D() {
        boolean z;
        synchronized (this.e) {
            z = true;
            if (this.x != 1) {
                z = false;
            }
            if (z) {
                this.x = 0;
            }
        }
        return z;
    }

    public final kr90 E(boolean z, wzs wzsVar) {
        if (this.r != null) {
            gxc0.b("A pausable composition is in progress");
        }
        kr90 kr90Var = new kr90(this, this.b, this.w, this.f, wzsVar, z, this.c, this.e);
        this.r = kr90Var;
        return kr90Var;
    }

    public final void F() {
        Object obj = jvi.b;
        AtomicReference<Object> atomicReference = this.d;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                throw at.b("pending composition has not been applied");
            }
            if (andSet instanceof Set) {
                A((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                androidx.compose.runtime.b.b("corrupt pendingModifications drain: " + atomicReference);
                throw new KotlinNothingValueException();
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                A(set, true);
            }
        }
    }

    public final void G() {
        AtomicReference<Object> atomicReference = this.d;
        Object andSet = atomicReference.getAndSet(null);
        if (epx.f(andSet, jvi.b)) {
            return;
        }
        if (andSet instanceof Set) {
            A((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                A(set, false);
            }
            return;
        }
        if (andSet != null) {
            androidx.compose.runtime.b.b("corrupt pendingModifications drain: " + atomicReference);
            throw new KotlinNothingValueException();
        }
        if (this.r == null) {
            androidx.compose.runtime.b.a("calling recordModificationsOf and applyChanges concurrently is not supported");
        }
    }

    public final void H() {
        EmptySet emptySet = EmptySet.b;
        AtomicReference<Object> atomicReference = this.d;
        Object andSet = atomicReference.getAndSet(emptySet);
        if (epx.f(andSet, jvi.b) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            A((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            androidx.compose.runtime.b.b("corrupt pendingModifications drain: " + atomicReference);
            throw new KotlinNothingValueException();
        }
        for (Set<? extends Object> set : (Set[]) andSet) {
            A(set, false);
        }
    }

    public final void I() {
        int i = this.x;
        if (i != 0) {
            gxc0.b(i != 1 ? i != 2 ? i != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.r == null) {
            return;
        }
        gxc0.b("A pausable composition is in progress");
    }

    public final InvalidationResult J(androidx.compose.runtime.f fVar, yy1 yy1Var, Object obj) {
        ivi iviVar;
        synchronized (this.e) {
            try {
                ivi iviVar2 = this.s;
                if (iviVar2 != null) {
                    v2k0 v2k0Var = this.g;
                    int i = this.t;
                    if (v2k0Var.h) {
                        androidx.compose.runtime.b.a("Writer is active");
                    }
                    if (i < 0 || i >= v2k0Var.c) {
                        androidx.compose.runtime.b.a("Invalid group index");
                    }
                    rgt d = sdi.d(yy1Var);
                    if (v2k0Var.g0(d)) {
                        int a = x2k0.a(i, v2k0Var.b) + i;
                        int i2 = d.a;
                        iviVar = (i <= i2 && i2 < a) ? iviVar2 : null;
                    }
                    iviVar2 = null;
                }
                if (iviVar == null) {
                    androidx.compose.runtime.c cVar = this.w;
                    if (cVar.F && cVar.L0(fVar, obj)) {
                        return InvalidationResult.IMMINENT;
                    }
                    if (obj == null) {
                        this.o.p(fVar, fto0.k);
                    } else if (obj instanceof g1m) {
                        Object d2 = this.o.d(fVar);
                        if (d2 != null) {
                            if (d2 instanceof qh50) {
                                qh50 qh50Var = (qh50) d2;
                                Object[] objArr = qh50Var.b;
                                long[] jArr = qh50Var.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i3 = 0;
                                    loop0: while (true) {
                                        long j = jArr[i3];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                                            for (int i5 = 0; i5 < i4; i5++) {
                                                if ((255 & j) < 128 && objArr[(i3 << 3) + i5] == fto0.k) {
                                                    break loop0;
                                                }
                                                j >>= 8;
                                            }
                                            if (i4 != 8) {
                                                break;
                                            }
                                        }
                                        if (i3 == length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                            } else if (d2 == fto0.k) {
                            }
                        }
                        s101.f(this.o, fVar, obj);
                    } else {
                        this.o.p(fVar, fto0.k);
                    }
                }
                if (iviVar != null) {
                    return iviVar.J(fVar, yy1Var, obj);
                }
                this.b.n(this);
                return this.w.F ? InvalidationResult.DEFERRED : InvalidationResult.SCHEDULED;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void K(Object obj) {
        Object d = this.h.d(obj);
        if (d == null) {
            return;
        }
        boolean z = d instanceof qh50;
        ph50<Object, Object> ph50Var = this.n;
        if (!z) {
            androidx.compose.runtime.f fVar = (androidx.compose.runtime.f) d;
            if (fVar.c(obj) == InvalidationResult.IMMINENT) {
                s101.f(ph50Var, obj, fVar);
                return;
            }
            return;
        }
        qh50 qh50Var = (qh50) d;
        Object[] objArr = qh50Var.b;
        long[] jArr = qh50Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        androidx.compose.runtime.f fVar2 = (androidx.compose.runtime.f) objArr[(i << 3) + i3];
                        if (fVar2.c(obj) == InvalidationResult.IMMINENT) {
                            s101.f(ph50Var, obj, fVar2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // xsna.hqj
    public final void X() {
        synchronized (this.e) {
            try {
                B(this.l);
                G();
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                try {
                    if (!this.f.b.c()) {
                        ytf0 ytf0Var = this.v;
                        try {
                            ytf0Var.g(this.f, this.w.q0());
                            ytf0Var.b();
                            ytf0Var.a();
                        } catch (Throwable th2) {
                            ytf0Var.a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    x();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // xsna.hqj, xsna.wef0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        androidx.compose.runtime.f p0;
        int i;
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        androidx.compose.runtime.c cVar = this.w;
        if (cVar.A > 0 || (p0 = cVar.p0()) == null) {
            return;
        }
        p0.k();
        boolean z4 = true;
        if ((p0.b & 32) == 0) {
            eh50<Object> eh50Var = p0.f;
            if (eh50Var == null) {
                eh50Var = new eh50<>((Object) null);
                p0.f = eh50Var;
            }
            int i3 = p0.e;
            int f = eh50Var.f(obj);
            if (f < 0) {
                f = ~f;
                i = -1;
            } else {
                i = eh50Var.c[f];
            }
            eh50Var.b[f] = obj;
            eh50Var.c[f] = i3;
            if (i == p0.e) {
                z = true;
                this.u.b();
                if (z) {
                    if (obj instanceof nuk0) {
                        ((nuk0) obj).Z(1);
                    }
                    s101.f(this.h, obj, p0);
                    if (obj instanceof g1m) {
                        g1m<?> g1mVar = (g1m) obj;
                        f1m.a u = g1mVar.u();
                        ph50<Object, Object> ph50Var = this.k;
                        s101.K(ph50Var, obj);
                        op70<muk0> op70Var = u.e;
                        Object[] objArr = op70Var.b;
                        long[] jArr = op70Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j = jArr[i4];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8;
                                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                                    int i7 = 0;
                                    while (i7 < i6) {
                                        if ((j & 255) < 128) {
                                            i2 = i5;
                                            muk0 muk0Var = (muk0) objArr[(i4 << 3) + i7];
                                            if (muk0Var instanceof nuk0) {
                                                z3 = true;
                                                ((nuk0) muk0Var).Z(1);
                                            } else {
                                                z3 = true;
                                            }
                                            s101.f(ph50Var, muk0Var, obj);
                                        } else {
                                            i2 = i5;
                                            z3 = z4;
                                        }
                                        j >>= i2;
                                        i7++;
                                        z4 = z3;
                                        i5 = i2;
                                    }
                                    z2 = z4;
                                    if (i6 != i5) {
                                        break;
                                    }
                                } else {
                                    z2 = z4;
                                }
                                if (i4 == length) {
                                    break;
                                }
                                i4++;
                                z4 = z2;
                            }
                        }
                        Object obj2 = u.f;
                        ph50<g1m<?>, Object> ph50Var2 = p0.g;
                        if (ph50Var2 == null) {
                            ph50Var2 = new ph50<>((Object) null);
                            p0.g = ph50Var2;
                        }
                        ph50Var2.p(g1mVar, obj2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z = false;
        this.u.b();
        if (z) {
        }
    }

    @Override // xsna.hqj
    public final void b(wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar) {
        try {
            synchronized (this.e) {
                F();
                ph50<Object, Object> ph50Var = this.o;
                this.o = h5h0.b();
                try {
                    androidx.compose.runtime.c cVar = this.w;
                    ghj0 ghj0Var = this.q;
                    if (!cVar.e.b.isEmpty()) {
                        androidx.compose.runtime.b.a("Expected applyChanges() to have been called");
                    }
                    cVar.P = ghj0Var;
                    try {
                        cVar.j0(ph50Var, wzsVar);
                        cVar.P = null;
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th) {
                        cVar.P = null;
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.o = ph50Var;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.f.b.c()) {
                    ytf0 ytf0Var = this.v;
                    try {
                        ytf0Var.g(this.f, this.w.q0());
                        ytf0Var.b();
                        ytf0Var.a();
                    } catch (Throwable th4) {
                        ytf0Var.a();
                        throw th4;
                    }
                }
                throw th3;
            } catch (Throwable th5) {
                x();
                throw th5;
            }
        }
    }

    @Override // xsna.hqj
    public final ghj0 c(ghj0 ghj0Var) {
        ghj0 ghj0Var2 = this.q;
        this.q = ghj0Var;
        return ghj0Var2;
    }

    @Override // xsna.bvi
    public final void d(wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar) {
        boolean D = D();
        I();
        cvi cviVar = this.b;
        if (!D) {
            this.y = wzsVar;
            cviVar.a(this, wzsVar);
            return;
        }
        androidx.compose.runtime.c cVar = this.w;
        cVar.d0();
        this.y = wzsVar;
        cviVar.a(this, wzsVar);
        cVar.a();
    }

    @Override // xsna.qfg0
    public final void deactivate() {
        ytf0 ytf0Var;
        synchronized (this.e) {
            try {
                if (this.r != null) {
                    gxc0.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.g.c == 0;
                try {
                    try {
                        if (z) {
                            if (!this.f.b.c()) {
                            }
                            this.h.h();
                            this.k.h();
                            this.o.h();
                            this.l.q0();
                            this.m.q0();
                            androidx.compose.runtime.c cVar = this.w;
                            cVar.E.clear();
                            cVar.s.clear();
                            cVar.e.q0();
                            cVar.v = null;
                            this.x = 1;
                            s3q0 s3q0Var = s3q0.a;
                        }
                        ytf0Var.g(this.f, this.w.q0());
                        if (!z) {
                            v2k0 v2k0Var = this.g;
                            ytf0 ytf0Var2 = this.v;
                            y2k0 f0 = v2k0Var.f0();
                            try {
                                f0.n(f0.t, new x7d(5, ytf0Var2, f0));
                                s3q0 s3q0Var2 = s3q0.a;
                                f0.e(true);
                                this.c.c();
                                ytf0Var.c();
                            } catch (Throwable th) {
                                f0.e(false);
                                throw th;
                            }
                        }
                        ytf0Var.b();
                        ytf0Var.a();
                        s3q0 s3q0Var3 = s3q0.a;
                        this.h.h();
                        this.k.h();
                        this.o.h();
                        this.l.q0();
                        this.m.q0();
                        androidx.compose.runtime.c cVar2 = this.w;
                        cVar2.E.clear();
                        cVar2.s.clear();
                        cVar2.e.q0();
                        cVar2.v = null;
                        this.x = 1;
                        s3q0 s3q0Var4 = s3q0.a;
                    } catch (Throwable th2) {
                        ytf0Var.a();
                        throw th2;
                    }
                    ytf0Var = this.v;
                } finally {
                    Trace.endSection();
                }
                Trace.beginSection("Compose:deactivate");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // xsna.bvi
    public final void dispose() {
        synchronized (this.e) {
            try {
                if (this.w.F) {
                    gxc0.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.x != 3) {
                    this.x = 3;
                    this.y = pq20.c;
                    csa csaVar = this.w.L;
                    if (csaVar != null) {
                        B(csaVar);
                    }
                    int i = 1;
                    boolean z = this.g.c == 0;
                    if (!z || !this.f.b.c()) {
                        ytf0 ytf0Var = this.v;
                        try {
                            ytf0Var.g(this.f, this.w.q0());
                            if (!z) {
                                v2k0 v2k0Var = this.g;
                                ytf0 ytf0Var2 = this.v;
                                y2k0 f0 = v2k0Var.f0();
                                try {
                                    f0.n(f0.r(), new dd4(ytf0Var2, i));
                                    f0.P();
                                    s3q0 s3q0Var = s3q0.a;
                                    f0.e(true);
                                    this.c.p();
                                    this.c.c();
                                    ytf0Var.c();
                                } catch (Throwable th) {
                                    f0.e(false);
                                    throw th;
                                }
                            }
                            ytf0Var.b();
                            ytf0Var.a();
                        } catch (Throwable th2) {
                            ytf0Var.a();
                            throw th2;
                        }
                    }
                    androidx.compose.runtime.c cVar = this.w;
                    cVar.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        cVar.b.x(cVar);
                        cVar.E.clear();
                        cVar.s.clear();
                        cVar.e.q0();
                        cVar.v = null;
                        cVar.a.p();
                        s3q0 s3q0Var2 = s3q0.a;
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                s3q0 s3q0Var3 = s3q0.a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.b.y(this);
    }

    @Override // xsna.hqj
    public final void e(ArrayList arrayList) {
        rh50 rh50Var = this.f;
        androidx.compose.runtime.c cVar = this.w;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!epx.f(((ic30) ((Pair) arrayList.get(i)).i()).c, this)) {
                androidx.compose.runtime.b.a("Check failed");
                break;
            }
        }
        try {
            cVar.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    cVar.r0(arrayList);
                    cVar.f0();
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    cVar.e0();
                    throw th;
                }
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th2) {
            try {
                if (!rh50Var.b.c()) {
                    ytf0 ytf0Var = this.v;
                    try {
                        ytf0Var.g(rh50Var, cVar.q0());
                        ytf0Var.b();
                        ytf0Var.a();
                    } catch (Throwable th3) {
                        ytf0Var.a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                x();
                throw th4;
            }
        }
    }

    @Override // xsna.hqj
    public final void f(hc30 hc30Var) {
        ytf0 ytf0Var = this.v;
        try {
            ytf0Var.g(this.f, this.w.q0());
            hc30Var.a.M(ytf0Var);
            ytf0Var.c();
        } finally {
            ytf0Var.a();
        }
    }

    @Override // xsna.hqj
    public final void g(eg1 eg1Var) {
        androidx.compose.runtime.c cVar = this.w;
        if (cVar.F) {
            androidx.compose.runtime.b.a("Preparing a composition while composing is not supported");
        }
        cVar.F = true;
        try {
            eg1Var.invoke();
        } finally {
            cVar.F = false;
        }
    }

    @Override // xsna.bvi
    public final boolean h() {
        return this.x == 3;
    }

    @Override // xsna.wef0
    public final void i() {
        this.p = true;
        this.u.b();
    }

    @Override // xsna.fr90
    public final kr90 j(wzs wzsVar) {
        D();
        I();
        return E(true, wzsVar);
    }

    @Override // xsna.fr90
    public final kr90 k(wzs wzsVar) {
        return E(D(), wzsVar);
    }

    @Override // xsna.hqj
    public final boolean l() {
        synchronized (this.e) {
            kr90 kr90Var = this.r;
            boolean z = false;
            if (kr90Var != null && (kr90Var.h.get() != PausedCompositionState.Recomposing || kr90Var.i != ey2.f())) {
                AtomicReference<PausedCompositionState> atomicReference = kr90Var.h;
                PausedCompositionState pausedCompositionState = PausedCompositionState.ApplyPending;
                PausedCompositionState pausedCompositionState2 = PausedCompositionState.RecomposePending;
                while (!atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2) && atomicReference.get() == pausedCompositionState) {
                }
                ((ng50) kr90Var.l.a).c(9);
                return false;
            }
            F();
            try {
                ph50<Object, Object> ph50Var = this.o;
                this.o = h5h0.b();
                try {
                    androidx.compose.runtime.c cVar = this.w;
                    ghj0 ghj0Var = this.q;
                    csa csaVar = cVar.e;
                    if (!csaVar.b.isEmpty()) {
                        androidx.compose.runtime.b.a("Expected applyChanges() to have been called");
                    }
                    if (ph50Var.e > 0 || !cVar.s.isEmpty()) {
                        cVar.P = ghj0Var;
                        try {
                            cVar.j0(ph50Var, null);
                            cVar.P = null;
                            z = !csaVar.s0();
                        } catch (Throwable th) {
                            cVar.P = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        G();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.o = ph50Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.f.b.c()) {
                        ytf0 ytf0Var = this.v;
                        try {
                            ytf0Var.g(this.f, this.w.q0());
                            ytf0Var.b();
                            ytf0Var.a();
                        } catch (Throwable th4) {
                            ytf0Var.a();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    x();
                    throw th5;
                }
            }
        }
    }

    @Override // xsna.wef0
    public final InvalidationResult m(androidx.compose.runtime.f fVar, Object obj) {
        ivi iviVar;
        int i = fVar.b;
        if ((i & 2) != 0) {
            fVar.b = i | 4;
        }
        yy1 yy1Var = fVar.c;
        if (yy1Var == null || !yy1Var.a()) {
            return InvalidationResult.IGNORED;
        }
        v2k0 v2k0Var = this.g;
        v2k0Var.getClass();
        yy1 yy1Var2 = fVar.c;
        if (yy1Var2 != null && v2k0Var.g0(sdi.d(yy1Var2))) {
            if (fVar.d == null) {
                return InvalidationResult.IGNORED;
            }
            InvalidationResult J = J(fVar, yy1Var, obj);
            if (J != InvalidationResult.IGNORED) {
                this.u.b();
            }
            return J;
        }
        synchronized (this.e) {
            iviVar = this.s;
        }
        if (iviVar != null) {
            androidx.compose.runtime.c cVar = iviVar.w;
            if (cVar.F && cVar.L0(fVar, obj)) {
                return InvalidationResult.IMMINENT;
            }
        }
        return InvalidationResult.IGNORED;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.Set[]] */
    @Override // xsna.hqj
    public final void n(l5h0 l5h0Var) {
        l5h0 l5h0Var2;
        while (true) {
            Object obj = this.d.get();
            if (obj == null || obj.equals(jvi.b)) {
                l5h0Var2 = l5h0Var;
            } else if (obj instanceof Set) {
                l5h0Var2 = new Set[]{obj, l5h0Var};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.d).toString());
                }
                l5h0Var2 = jw5.y(l5h0Var, (Set[]) obj);
            }
            AtomicReference<Object> atomicReference = this.d;
            while (!atomicReference.compareAndSet(obj, l5h0Var2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.e) {
                    G();
                    s3q0 s3q0Var = s3q0.a;
                }
                return;
            }
            return;
        }
    }

    @Override // xsna.hqj
    public final void o() {
        for (Object obj : this.g.d) {
            vef0 vef0Var = obj instanceof vef0 ? (vef0) obj : null;
            if (vef0Var != null) {
                vef0Var.invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    @Override // xsna.hqj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(Set<? extends Object> set) {
        boolean z = set instanceof l5h0;
        ph50<Object, Object> ph50Var = this.k;
        ph50<Object, Object> ph50Var2 = this.h;
        if (z) {
            j5h0<T> j5h0Var = ((l5h0) set).b;
            Object[] objArr = j5h0Var.b;
            long[] jArr = j5h0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (ph50Var2.b(obj) || ph50Var.b(obj)) {
                                    break loop0;
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
                    }
                    i++;
                }
            }
        } else {
            for (Object obj2 : set) {
                if (ph50Var2.b(obj2) || ph50Var.b(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // xsna.hqj
    public final void q() {
        ytf0 ytf0Var;
        synchronized (this.e) {
            try {
                this.w.v = null;
                if (!this.f.b.c()) {
                    ytf0Var = this.v;
                    try {
                        ytf0Var.g(this.f, this.w.q0());
                        ytf0Var.b();
                        ytf0Var.a();
                    } finally {
                    }
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                try {
                    if (!this.f.b.c()) {
                        ytf0Var = this.v;
                        try {
                            ytf0Var.g(this.f, this.w.q0());
                            ytf0Var.b();
                            ytf0Var.a();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    x();
                    throw th2;
                }
            }
        }
    }

    @Override // xsna.hqj
    public final void r() {
        synchronized (this.e) {
            try {
                if (!this.m.s0()) {
                    B(this.m);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                try {
                    if (!this.f.b.c()) {
                        ytf0 ytf0Var = this.v;
                        try {
                            ytf0Var.g(this.f, this.w.q0());
                            ytf0Var.b();
                            ytf0Var.a();
                        } catch (Throwable th2) {
                            ytf0Var.a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    x();
                    throw th3;
                }
            }
        }
    }

    @Override // xsna.qfg0
    public final void s(wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar) {
        D();
        I();
        androidx.compose.runtime.c cVar = this.w;
        cVar.d0();
        this.y = wzsVar;
        this.b.a(this, wzsVar);
        cVar.a();
    }

    @Override // xsna.hqj
    public final <R> R t(hqj hqjVar, int i, gzs<? extends R> gzsVar) {
        if (hqjVar == null || hqjVar.equals(this) || i < 0) {
            return gzsVar.invoke();
        }
        this.s = (ivi) hqjVar;
        this.t = i;
        try {
            return gzsVar.invoke();
        } finally {
            this.s = null;
            this.t = 0;
        }
    }

    @Override // xsna.hqj
    public final boolean u() {
        return this.w.F;
    }

    @Override // xsna.hqj
    public final void v(Object obj) {
        synchronized (this.e) {
            try {
                K(obj);
                Object d = this.k.d(obj);
                if (d != null) {
                    if (d instanceof qh50) {
                        qh50 qh50Var = (qh50) d;
                        Object[] objArr = qh50Var.b;
                        long[] jArr = qh50Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            K((g1m) objArr[(i << 3) + i3]);
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
                    } else {
                        K((g1m) d);
                    }
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.bvi
    public final boolean w() {
        boolean z;
        synchronized (this.e) {
            z = this.o.e > 0;
        }
        return z;
    }

    @Override // xsna.hqj
    public final void x() {
        this.d.set(null);
        this.l.q0();
        this.m.q0();
        rh50 rh50Var = this.f;
        if (rh50Var.b.c()) {
            return;
        }
        ytf0 ytf0Var = this.v;
        try {
            ytf0Var.g(rh50Var, this.w.q0());
            ytf0Var.b();
        } finally {
            ytf0Var.a();
        }
    }

    public final void z(Object obj, boolean z) {
        int i;
        Object d = this.h.d(obj);
        if (d == null) {
            return;
        }
        boolean z2 = d instanceof qh50;
        qh50<androidx.compose.runtime.f> qh50Var = this.i;
        qh50<androidx.compose.runtime.f> qh50Var2 = this.j;
        ph50<Object, Object> ph50Var = this.n;
        if (!z2) {
            androidx.compose.runtime.f fVar = (androidx.compose.runtime.f) d;
            if (s101.J(ph50Var, obj, fVar) || fVar.c(obj) == InvalidationResult.IGNORED) {
                return;
            }
            if (fVar.g == null || z) {
                qh50Var.e(fVar);
                return;
            } else {
                qh50Var2.e(fVar);
                return;
            }
        }
        qh50 qh50Var3 = (qh50) d;
        Object[] objArr = qh50Var3.b;
        long[] jArr = qh50Var3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((255 & j) < 128) {
                        androidx.compose.runtime.f fVar2 = (androidx.compose.runtime.f) objArr[(i2 << 3) + i5];
                        if (!s101.J(ph50Var, obj, fVar2)) {
                            i = i3;
                            if (fVar2.c(obj) != InvalidationResult.IGNORED) {
                                if (fVar2.g == null || z) {
                                    qh50Var.e(fVar2);
                                } else {
                                    qh50Var2.e(fVar2);
                                }
                            }
                            j >>= i;
                            i5++;
                            i3 = i;
                        }
                    }
                    i = i3;
                    j >>= i;
                    i5++;
                    i3 = i;
                }
                if (i4 != i3) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }
}
