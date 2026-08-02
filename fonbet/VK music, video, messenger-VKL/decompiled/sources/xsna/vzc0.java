package xsna;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.cuy;
import xsna.cuy.a;
import xsna.jvo0;
import xsna.ytm0;
import xsna.zno;

/* compiled from: LazyLayoutPrefetchState.kt */
/* loaded from: classes11.dex */
public final class vzc0 {
    public final hty a;
    public final ytm0 b;
    public final g0d0 c;
    public boolean d = true;

    /* compiled from: LazyLayoutPrefetchState.kt */
    public final class a implements cuy.b, e0d0, cuy.c {
        public final int a;
        public final lvc0 b;
        public final bcd0 c;
        public final izs<cuy.c, s3q0> d;
        public o6j e;
        public ytm0.b f;
        public ytm0.a g;
        public boolean h;
        public boolean i;
        public boolean j;
        public Object k;
        public boolean l;
        public C3909a m;
        public boolean n;
        public long o;
        public long p;
        public long q;
        public boolean r;

        /* compiled from: LazyLayoutPrefetchState.kt */
        /* renamed from: xsna.vzc0$a$a, reason: collision with other inner class name */
        public final class C3909a {
            public final List<cuy> a;
            public final List<e0d0>[] b;
            public int c;
            public int d;
            public boolean e;

            public C3909a(List<cuy> list) {
                this.a = list;
                this.b = new List[list.size()];
                if (list.isEmpty()) {
                    xzw.a("NestedPrefetchController shouldn't be created with no states");
                }
            }
        }

        public a() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, lvc0 lvc0Var, bcd0 bcd0Var, izs<? super cuy.c, s3q0> izsVar) {
            this.a = i;
            this.b = lvc0Var;
            this.c = bcd0Var;
            this.d = izsVar;
            this.q = k830.b();
        }

        @Override // xsna.cuy.c
        public final long a(int i) {
            ytm0.b bVar = this.f;
            if (bVar != null) {
                return bVar.a(i);
            }
            return 0L;
        }

        @Override // xsna.cuy.c
        public final int b() {
            ytm0.b bVar = this.f;
            if (bVar != null) {
                return bVar.b();
            }
            return 0;
        }

        @Override // xsna.e0d0
        public final boolean c(f0d0 f0d0Var) {
            boolean f;
            if (!vzc0.this.d) {
                return false;
            }
            if (this.n) {
                Trace.beginSection("compose:lazy:prefetch:execute:urgent");
                try {
                    f = f(f0d0Var);
                } finally {
                    Trace.endSection();
                }
            } else {
                f = f(f0d0Var);
            }
            ld2.a(-1L, "compose:lazy:prefetch:execute:item");
            return f;
        }

        @Override // xsna.cuy.b
        public final void cancel() {
            if (this.i) {
                return;
            }
            this.i = true;
            e();
        }

        @Override // xsna.cuy.b
        public final void d() {
            this.n = true;
        }

        public final void e() {
            ytm0.a aVar = this.g;
            if (aVar != null) {
                aVar.cancel();
            }
            this.g = null;
            ytm0.b bVar = this.f;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f = null;
            this.m = null;
        }

        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Removed duplicated region for block: B:110:0x01f1 A[Catch: all -> 0x01bb, LOOP:2: B:99:0x01c1->B:110:0x01f1, LOOP_END, TRY_ENTER, TryCatch #3 {all -> 0x01bb, blocks: (B:83:0x017b, B:85:0x0183, B:87:0x0189, B:90:0x0196, B:92:0x01a2, B:93:0x01b8, B:94:0x01a5, B:98:0x01bd, B:99:0x01c1, B:101:0x01c9, B:103:0x01d3, B:105:0x01d7, B:107:0x01de, B:108:0x01e3, B:110:0x01f1, B:117:0x01f8, B:119:0x0205), top: B:82:0x017b }] */
        /* JADX WARN: Removed duplicated region for block: B:111:0x01ed A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean f(f0d0 f0d0Var) {
            long j;
            boolean z;
            List<e0d0> list;
            int i = this.a;
            long j2 = i;
            ld2.a(j2, "compose:lazy:prefetch:execute:item");
            androidx.compose.foundation.lazy.layout.b bVar = (androidx.compose.foundation.lazy.layout.b) vzc0.this.a.b.invoke();
            int i2 = 0;
            if (!this.i) {
                int itemCount = bVar.getItemCount();
                if (i >= 0 && i < itemCount) {
                    Object h = bVar.h(i);
                    Object obj = this.k;
                    if (obj != null && !h.equals(obj)) {
                        e();
                        return false;
                    }
                    Object g = bVar.g(i);
                    lvc0 lvc0Var = this.b;
                    gt5 gt5Var = (gt5) lvc0Var.e;
                    if (lvc0Var.d != g || gt5Var == null) {
                        ph50 ph50Var = (ph50) lvc0Var.c;
                        Object d = ph50Var.d(g);
                        if (d == null) {
                            d = new gt5();
                            ph50Var.p(g, d);
                        }
                        gt5Var = (gt5) d;
                        lvc0Var.d = g;
                        lvc0Var.e = gt5Var;
                    }
                    g();
                    long a = f0d0Var.a();
                    this.o = a;
                    this.q = k830.b();
                    this.p = 0L;
                    ld2.a(a, "compose:lazy:prefetch:available_time_nanos");
                    if (g()) {
                        j = 0;
                    } else {
                        j = 0;
                        if (i(this.o, gt5Var.a + gt5Var.b)) {
                            Trace.beginSection("compose:lazy:prefetch:compose");
                            try {
                                h(h, g, gt5Var);
                                s3q0 s3q0Var = s3q0.a;
                            } finally {
                            }
                        }
                        if (!g()) {
                            return true;
                        }
                    }
                    if (this.g != null) {
                        if (!i(this.o, gt5Var.c)) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:apply");
                        try {
                            ytm0.a aVar = this.g;
                            if (aVar == null) {
                                throw new IllegalArgumentException("Nothing to apply!");
                            }
                            this.f = aVar.apply();
                            this.g = null;
                            this.j = true;
                            s3q0 s3q0Var2 = s3q0.a;
                            Trace.endSection();
                            j();
                            gt5Var.c = gt5.a(this.p, gt5Var.c);
                        } finally {
                        }
                    }
                    if (!this.l) {
                        if (this.o <= j) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                        try {
                            ytm0.b bVar2 = this.f;
                            if (bVar2 == null) {
                                throw jq.f("Should precompose before resolving nested prefetch states");
                            }
                            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                            bVar2.d(new uzc0(ref$ObjectRef, i2));
                            List list2 = (List) ref$ObjectRef.element;
                            this.m = list2 != null ? new C3909a(list2) : null;
                            this.l = true;
                            s3q0 s3q0Var3 = s3q0.a;
                        } finally {
                        }
                    }
                    C3909a c3909a = this.m;
                    if (c3909a != null) {
                        int i3 = gt5Var.e;
                        boolean z2 = this.n;
                        List<e0d0>[] listArr = c3909a.b;
                        int i4 = c3909a.c;
                        List<cuy> list3 = c3909a.a;
                        if (i4 < list3.size()) {
                            if (a.this.i) {
                                xzw.c("Should not execute nested prefetch on canceled request");
                            }
                            Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                            try {
                                int size = list3.size();
                                for (int i5 = 0; i5 < size; i5++) {
                                    list3.get(i5).e = i3;
                                }
                                s3q0 s3q0Var4 = s3q0.a;
                                Trace.endSection();
                                Trace.beginSection("compose:lazy:prefetch:nested");
                                while (c3909a.c < list3.size()) {
                                    try {
                                        if (listArr[c3909a.c] == null) {
                                            if (f0d0Var.a() <= j) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            int i6 = c3909a.c;
                                            cuy cuyVar = list3.get(i6);
                                            izs<? super b160, s3q0> izsVar = cuyVar.b;
                                            if (izsVar == null) {
                                                list = EmptyList.b;
                                            } else {
                                                cuy.a aVar2 = cuyVar.new a(cuyVar.e);
                                                izsVar.invoke(aVar2);
                                                ArrayList arrayList = aVar2.b;
                                                cuyVar.g = arrayList.size();
                                                list = arrayList;
                                            }
                                            listArr[i6] = list;
                                        }
                                        List<e0d0> list4 = listArr[c3909a.c];
                                        while (c3909a.d < list4.size()) {
                                            e0d0 e0d0Var = list4.get(c3909a.d);
                                            if (z2) {
                                                a aVar3 = e0d0Var instanceof a ? (a) e0d0Var : null;
                                                if (aVar3 != null) {
                                                    z = true;
                                                    aVar3.n = true;
                                                    c3909a.e = z;
                                                    if (!e0d0Var.c(f0d0Var)) {
                                                        return z;
                                                    }
                                                    c3909a.d++;
                                                }
                                            }
                                            z = true;
                                            c3909a.e = z;
                                            if (!e0d0Var.c(f0d0Var)) {
                                            }
                                        }
                                        c3909a.d = 0;
                                        c3909a.c++;
                                    } finally {
                                    }
                                }
                                s3q0 s3q0Var5 = s3q0.a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    C3909a c3909a2 = this.m;
                    if (c3909a2 != null && c3909a2.e) {
                        j();
                        ld2.a(j2, "compose:lazy:prefetch:execute:item");
                        C3909a c3909a3 = this.m;
                        if (c3909a3 != null) {
                            c3909a3.e = false;
                        }
                    }
                    o6j o6jVar = this.e;
                    if (!this.h && o6jVar != null) {
                        if (!i(this.o, gt5Var.d)) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:measure");
                        try {
                            long j3 = o6jVar.a;
                            if (this.i) {
                                xzw.a("Callers should check whether the request is still valid before calling performMeasure()");
                            }
                            if (this.h) {
                                xzw.a("Request was already measured!");
                            }
                            this.h = true;
                            ytm0.b bVar3 = this.f;
                            if (bVar3 == null) {
                                throw jq.f("performComposition() must be called before performMeasure()");
                            }
                            int b = bVar3.b();
                            for (int i7 = 0; i7 < b; i7++) {
                                bVar3.c(i7, j3);
                            }
                            s3q0 s3q0Var6 = s3q0.a;
                            Trace.endSection();
                            j();
                            gt5Var.d = gt5.a(this.p, gt5Var.d);
                            izs<cuy.c, s3q0> izsVar2 = this.d;
                            if (izsVar2 != null) {
                                izsVar2.invoke(this);
                            }
                        } finally {
                        }
                    }
                    C3909a c3909a4 = this.m;
                    if (this.h && this.l && c3909a4 != null) {
                        List<cuy> list5 = c3909a4.a;
                        List<cuy> list6 = list5;
                        int size2 = list6.size();
                        int i8 = Integer.MAX_VALUE;
                        for (int i9 = 0; i9 < size2; i9++) {
                            i8 = Math.min(i8, list5.get(i9).f);
                        }
                        if (i8 == Integer.MAX_VALUE) {
                            i8 = 0;
                        }
                        int i10 = gt5Var.e;
                        gt5Var.e = i10 == -1 ? i8 : ((i10 * 3) + i8) / 4;
                        int size3 = list6.size();
                        int i11 = Integer.MAX_VALUE;
                        for (int i12 = 0; i12 < size3; i12++) {
                            i11 = Math.min(i11, list5.get(i12).g);
                        }
                        if (i11 == Integer.MAX_VALUE) {
                            i11 = 0;
                        }
                        if (i11 < i8) {
                            gt5Var.d = j;
                        }
                    }
                    return false;
                }
            }
            e();
            return false;
        }

        public final boolean g() {
            ytm0.a aVar;
            return this.j || ((aVar = this.g) != null && aVar.a());
        }

        @Override // xsna.cuy.c
        public final int getIndex() {
            return this.a;
        }

        public final void h(Object obj, Object obj2, gt5 gt5Var) {
            ytm0.a apyVar;
            ytm0.a aVar = this.g;
            if (aVar == null) {
                vzc0 vzc0Var = vzc0.this;
                wzs<androidx.compose.runtime.a, Integer, s3q0> a = vzc0Var.a.a(this.a, obj, obj2);
                woy a2 = vzc0Var.b.a();
                if (a2.b.e()) {
                    a2.l(obj, a, true);
                    apyVar = new apy(a2, obj);
                } else {
                    apyVar = new zoy(a2, obj);
                }
                aVar = apyVar;
                this.g = aVar;
                this.k = obj;
            }
            this.r = false;
            while (!aVar.a() && !this.r) {
                aVar.b(new eal(this, gt5Var));
            }
            j();
            if (this.r) {
                gt5Var.b = gt5.a(this.p, gt5Var.b);
            } else {
                gt5Var.a = gt5.a(this.p, gt5Var.a);
            }
        }

        public final boolean i(long j, long j2) {
            if (this.n) {
                j2 = 0;
            }
            return j > j2;
        }

        public final void j() {
            long b = k830.b();
            long c = jvo0.a.c(b, this.q);
            long j = c >> 1;
            zno.a aVar = zno.c;
            if ((((int) c) & 1) != 0) {
                j = j > 9223372036854L ? Long.MAX_VALUE : j < -9223372036854L ? Long.MIN_VALUE : j * 1000000;
            }
            this.p = j;
            long j2 = this.o - j;
            this.o = j2;
            this.q = b;
            ld2.a(j2, "compose:lazy:prefetch:available_time_nanos");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
            sb.append(this.a);
            sb.append(", constraints = ");
            sb.append(this.e);
            sb.append(", isComposed = ");
            sb.append(g());
            sb.append(", isMeasured = ");
            sb.append(this.h);
            sb.append(", isCanceled = ");
            return n23.b(sb, this.i, " }");
        }
    }

    public vzc0(hty htyVar, ytm0 ytm0Var, g0d0 g0d0Var) {
        this.a = htyVar;
        this.b = ytm0Var;
        this.c = g0d0Var;
    }
}
