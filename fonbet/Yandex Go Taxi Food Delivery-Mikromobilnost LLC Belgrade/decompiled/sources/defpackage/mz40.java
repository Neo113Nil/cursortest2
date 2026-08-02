package defpackage;

import androidx.compose.runtime.snapshots.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public class mz40 extends i2t0 {
    public static final int[] n = new int[0];
    public final tls e;
    public final tls f;
    public int g;
    public iz40 h;
    public ArrayList i;
    public a j;
    public int[] k;
    public int l;
    public boolean m;

    public mz40(long j, a aVar, tls tlsVar, tls tlsVar2) {
        super(j, aVar);
        this.e = tlsVar;
        this.f = tlsVar2;
        this.j = a.x;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (q2t0.c) {
            this.j = this.j.f(j);
        }
    }

    public void B(iz40 iz40Var) {
        this.h = iz40Var;
    }

    public mz40 C(tls tlsVar, tls tlsVar2) {
        en50 en50Var;
        if (this.c) {
            khe0.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            khe0.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = q2t0.c;
        synchronized (obj) {
            long j = q2t0.e;
            q2t0.e = j + 1;
            q2t0.d = q2t0.d.f(j);
            a d = d();
            r(d.f(j));
            en50Var = new en50(j, q2t0.d(d, g() + 1, j), q2t0.k(tlsVar, e(), true), q2t0.l(tlsVar2, i()), this);
        }
        if (this.m || this.c) {
            return en50Var;
        }
        long g = g();
        synchronized (obj) {
            long j2 = q2t0.e;
            q2t0.e = j2 + 1;
            s(j2);
            q2t0.d = q2t0.d.f(g());
        }
        r(q2t0.d(d(), g + 1, g()));
        return en50Var;
    }

    @Override // defpackage.i2t0
    public final void b() {
        q2t0.d = q2t0.d.b(g()).a(this.j);
    }

    @Override // defpackage.i2t0
    public void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        synchronized (q2t0.c) {
            o();
        }
        l();
    }

    @Override // defpackage.i2t0
    public boolean f() {
        return false;
    }

    @Override // defpackage.i2t0
    public int h() {
        return this.g;
    }

    @Override // defpackage.i2t0
    public tls i() {
        return this.f;
    }

    @Override // defpackage.i2t0
    public void k() {
        this.l++;
    }

    @Override // defpackage.i2t0
    public void l() {
        if (this.l <= 0) {
            khe0.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i != 0 || this.m) {
            return;
        }
        iz40 x = x();
        if (x != null) {
            if (this.m) {
                khe0.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long g = g();
            Object[] objArr = x.b;
            long[] jArr = x.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (j5u0 firstStateRecord = ((g5u0) objArr[(i2 << 3) + i4]).getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.b) {
                                    long j2 = firstStateRecord.a;
                                    if (j2 == g || kotlin.collections.a.G(this.j, Long.valueOf(j2))) {
                                        q2m0 q2m0Var = q2t0.a;
                                        firstStateRecord.a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        a();
    }

    @Override // defpackage.i2t0
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // defpackage.i2t0
    public void n(g5u0 g5u0Var) {
        iz40 x = x();
        if (x == null) {
            x = dmm0.a();
            B(x);
        }
        x.a(g5u0Var);
    }

    @Override // defpackage.i2t0
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            q2t0.u(this.k[i]);
        }
        o();
    }

    @Override // defpackage.i2t0
    public void t(int i) {
        this.g = i;
    }

    @Override // defpackage.i2t0
    public i2t0 u(tls tlsVar) {
        fn50 fn50Var;
        if (this.c) {
            khe0.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            khe0.b("Unsupported operation on a disposed or applied snapshot");
        }
        long g = g();
        A(g());
        Object obj = q2t0.c;
        synchronized (obj) {
            long j = q2t0.e;
            q2t0.e = j + 1;
            q2t0.d = q2t0.d.f(j);
            fn50Var = new fn50(j, q2t0.d(d(), g + 1, j), q2t0.k(tlsVar, e(), true), this);
        }
        if (this.m || this.c) {
            return fn50Var;
        }
        long g2 = g();
        synchronized (obj) {
            long j2 = q2t0.e;
            q2t0.e = j2 + 1;
            s(j2);
            q2t0.d = q2t0.d.f(g());
        }
        r(q2t0.d(d(), g2 + 1, g()));
        return fn50Var;
    }

    public final void v() {
        A(g());
        if (this.m || this.c) {
            return;
        }
        long g = g();
        synchronized (q2t0.c) {
            long j = q2t0.e;
            q2t0.e = j + 1;
            s(j);
            q2t0.d = q2t0.d.f(g());
        }
        r(q2t0.d(d(), g + 1, g()));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1 A[LOOP:1: B:31:0x00af->B:32:0x00b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0117 A[Catch: all -> 0x0104, TryCatch #0 {all -> 0x0104, blocks: (B:37:0x00c0, B:39:0x00d0, B:42:0x00dc, B:44:0x00e8, B:46:0x00f2, B:48:0x00f8, B:50:0x0106, B:56:0x0117, B:59:0x0121, B:61:0x012b, B:63:0x0135, B:65:0x013b, B:67:0x0145, B:73:0x014d, B:75:0x0150, B:77:0x0154, B:79:0x015b, B:81:0x0167, B:87:0x010e), top: B:36:0x00c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0154 A[Catch: all -> 0x0104, TryCatch #0 {all -> 0x0104, blocks: (B:37:0x00c0, B:39:0x00d0, B:42:0x00dc, B:44:0x00e8, B:46:0x00f2, B:48:0x00f8, B:50:0x0106, B:56:0x0117, B:59:0x0121, B:61:0x012b, B:63:0x0135, B:65:0x013b, B:67:0x0145, B:73:0x014d, B:75:0x0150, B:77:0x0154, B:79:0x015b, B:81:0x0167, B:87:0x010e), top: B:36:0x00c0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qke w() {
        HashMap hashMap;
        List list;
        iz40 iz40Var;
        long j;
        long j2;
        ArrayList arrayList;
        int size;
        int i;
        iz40 x = x();
        if (x != null) {
            long j3 = q2t0.j.b;
            hashMap = q2t0.b(j3, this, q2t0.d.b(j3));
        } else {
            hashMap = null;
        }
        EmptyList emptyList = EmptyList.a;
        synchronized (q2t0.c) {
            try {
                q2t0.c(this);
                if (x != null && x.d != 0) {
                    akt aktVar = q2t0.j;
                    qke z = z(q2t0.e, x, hashMap, q2t0.d.b(aktVar.b));
                    if (!z.equals(k2t0.t)) {
                        return z;
                    }
                    b();
                    iz40Var = aktVar.h;
                    q2t0.v(aktVar, q2t0.a);
                    B(null);
                    aktVar.h = null;
                    list = q2t0.h;
                    this.m = true;
                    if (iz40Var != null) {
                        androidx.compose.runtime.collection.a aVar = new androidx.compose.runtime.collection.a(iz40Var);
                        if (!iz40Var.g()) {
                            int size2 = list.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                ((wls) list.get(i2)).invoke(aVar, this);
                            }
                        }
                    }
                    if (x != null && x.h()) {
                        androidx.compose.runtime.collection.a aVar2 = new androidx.compose.runtime.collection.a(x);
                        size = list.size();
                        for (i = 0; i < size; i++) {
                            ((wls) list.get(i)).invoke(aVar2, this);
                        }
                    }
                    synchronized (q2t0.c) {
                        try {
                            p();
                            q2t0.f();
                            if (iz40Var != null) {
                                Object[] objArr = iz40Var.b;
                                long[] jArr = iz40Var.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i3 = 0;
                                    j = 128;
                                    while (true) {
                                        long j4 = jArr[i3];
                                        j2 = 255;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                                            for (int i5 = 0; i5 < i4; i5++) {
                                                if ((j4 & 255) < 128) {
                                                    q2t0.q((g5u0) objArr[(i3 << 3) + i5]);
                                                }
                                                j4 >>= 8;
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
                                    if (x != null) {
                                        Object[] objArr2 = x.b;
                                        long[] jArr2 = x.a;
                                        int length2 = jArr2.length - 2;
                                        if (length2 >= 0) {
                                            int i6 = 0;
                                            while (true) {
                                                long j5 = jArr2[i6];
                                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                                    for (int i8 = 0; i8 < i7; i8++) {
                                                        if ((j5 & j2) < j) {
                                                            q2t0.q((g5u0) objArr2[(i6 << 3) + i8]);
                                                        }
                                                        j5 >>= 8;
                                                    }
                                                    if (i7 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i6 == length2) {
                                                    break;
                                                }
                                                i6++;
                                            }
                                        }
                                    }
                                    arrayList = this.i;
                                    if (arrayList != null) {
                                        int size3 = arrayList.size();
                                        for (int i9 = 0; i9 < size3; i9++) {
                                            q2t0.q((g5u0) arrayList.get(i9));
                                        }
                                    }
                                    this.i = null;
                                }
                            }
                            j = 128;
                            j2 = 255;
                            if (x != null) {
                            }
                            arrayList = this.i;
                            if (arrayList != null) {
                            }
                            this.i = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return k2t0.t;
                }
                b();
                akt aktVar2 = q2t0.j;
                iz40 iz40Var2 = aktVar2.h;
                q2t0.v(aktVar2, q2t0.a);
                if (iz40Var2 == null || !iz40Var2.h()) {
                    list = emptyList;
                    iz40Var = null;
                } else {
                    list = q2t0.h;
                    iz40Var = iz40Var2;
                }
                this.m = true;
                if (iz40Var != null) {
                }
                if (x != null) {
                    androidx.compose.runtime.collection.a aVar22 = new androidx.compose.runtime.collection.a(x);
                    size = list.size();
                    while (i < size) {
                    }
                }
                synchronized (q2t0.c) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public iz40 x() {
        return this.h;
    }

    @Override // defpackage.i2t0
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public tls e() {
        return this.e;
    }

    public final qke z(long j, iz40 iz40Var, HashMap hashMap, a aVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        a aVar2;
        Object[] objArr;
        long[] jArr;
        a aVar3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList4;
        j5u0 mergeRecords;
        a e = d().f(g()).e(this.j);
        Object[] objArr3 = iz40Var.b;
        long[] jArr3 = iz40Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            g5u0 g5u0Var = (g5u0) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            j5u0 firstStateRecord = g5u0Var.getFirstStateRecord();
                            i = i4;
                            ArrayList arrayList5 = arrayList3;
                            j5u0 s = q2t0.s(firstStateRecord, j, aVar);
                            if (s == null) {
                                arrayList4 = arrayList2;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayList2;
                                j2 = j3;
                                j5u0 s2 = q2t0.s(firstStateRecord, g(), e);
                                if (s2 != null && s2.a != 1 && !s.equals(s2)) {
                                    aVar3 = e;
                                    j5u0 s3 = q2t0.s(firstStateRecord, g(), d());
                                    if (s3 == null) {
                                        q2t0.r();
                                        throw null;
                                    }
                                    if (hashMap == null || (mergeRecords = (j5u0) hashMap.get(s)) == null) {
                                        mergeRecords = g5u0Var.mergeRecords(s2, s, s3);
                                    }
                                    if (mergeRecords == null) {
                                        return new j2t0(this);
                                    }
                                    if (!mergeRecords.equals(s3)) {
                                        if (mergeRecords.equals(s)) {
                                            ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList6.add(new Pair(g5u0Var, s.c(g())));
                                            arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList2.add(g5u0Var);
                                            arrayList3 = arrayList6;
                                        } else {
                                            arrayList3 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList3.add(!mergeRecords.equals(s2) ? new Pair(g5u0Var, mergeRecords) : new Pair(g5u0Var, s2.c(g())));
                                            arrayList2 = arrayList4;
                                        }
                                    }
                                    arrayList3 = arrayList5;
                                    arrayList2 = arrayList4;
                                }
                            }
                            aVar3 = e;
                            arrayList3 = arrayList5;
                            arrayList2 = arrayList4;
                        } else {
                            aVar3 = e;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        e = aVar3;
                    }
                    aVar2 = e;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    aVar2 = e;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 == length) {
                    arrayList = arrayList3;
                    break;
                }
                i2++;
                jArr3 = jArr;
                objArr3 = objArr;
                e = aVar2;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            v();
            int size = arrayList3.size();
            for (int i5 = 0; i5 < size; i5++) {
                Pair pair = (Pair) arrayList3.get(i5);
                g5u0 g5u0Var2 = (g5u0) pair.getFirst();
                j5u0 j5u0Var = (j5u0) pair.getSecond();
                j5u0Var.a = j;
                synchronized (q2t0.c) {
                    j5u0Var.b = g5u0Var2.getFirstStateRecord();
                    g5u0Var2.prependStateRecord(j5u0Var);
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                iz40Var.l((g5u0) arrayList2.get(i6));
            }
            ArrayList arrayList7 = this.i;
            if (arrayList7 != null) {
                arrayList2 = kotlin.collections.a.m0(arrayList2, arrayList7);
            }
            this.i = arrayList2;
        }
        return k2t0.t;
    }
}
