package defpackage;

import android.os.Trace;
import androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler;
import androidx.compose.ui.layout.i;
import androidx.compose.ui.layout.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.time.DurationUnit;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class pne0 implements b6y, zne0 {
    public final int a;
    public final vne0 b;
    public final tls c;
    public n8e d;
    public syu0 e;
    public ryu0 f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Object j;
    public boolean k;
    public one0 l;
    public boolean m;
    public long n;
    public long o;
    public long p = s630.a();
    public boolean q;
    public final /* synthetic */ kzo r;

    public pne0(kzo kzoVar, int i, vne0 vne0Var, tls tlsVar) {
        this.r = kzoVar;
        this.a = i;
        this.b = vne0Var;
        this.c = tlsVar;
    }

    @Override // defpackage.b6y
    public final void a() {
        this.m = true;
    }

    public final void b() {
        ryu0 ryu0Var = this.f;
        if (ryu0Var != null) {
            ryu0Var.cancel();
        }
        this.f = null;
        syu0 syu0Var = this.e;
        if (syu0Var != null) {
            syu0Var.dispose();
        }
        this.e = null;
        this.l = null;
    }

    public final boolean c(aoe0 aoe0Var) {
        boolean d;
        if (!this.r.b) {
            return false;
        }
        if (this.m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                d = d(aoe0Var);
            } finally {
                Trace.endSection();
            }
        } else {
            d = d(aoe0Var);
        }
        Trace.setCounter("compose:lazy:prefetch:execute:item", -1L);
        return d;
    }

    @Override // defpackage.b6y
    public final void cancel() {
        if (this.h) {
            return;
        }
        this.h = true;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01f0 A[Catch: all -> 0x0206, LOOP:2: B:100:0x01c0->B:111:0x01f0, LOOP_END, TRY_ENTER, TryCatch #2 {all -> 0x0206, blocks: (B:84:0x017d, B:86:0x0185, B:88:0x018b, B:91:0x0198, B:93:0x01a4, B:94:0x01ba, B:95:0x01a7, B:99:0x01bc, B:100:0x01c0, B:102:0x01c8, B:104:0x01d2, B:106:0x01d6, B:108:0x01dd, B:109:0x01e2, B:111:0x01f0, B:118:0x01f6), top: B:83:0x017d }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a5 A[LOOP:4: B:164:0x02a3->B:165:0x02a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02cd A[LOOP:5: B:173:0x02cb->B:174:0x02cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02be  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(aoe0 aoe0Var) {
        long j;
        one0 one0Var;
        one0 one0Var2;
        int size;
        int i;
        int i2;
        int size2;
        int i3;
        int i4;
        one0 one0Var3;
        ?? r13;
        List list;
        int i5 = this.a;
        long j2 = i5;
        Trace.setCounter("compose:lazy:prefetch:execute:item", j2);
        q5y q5yVar = (q5y) ((p5y) this.r.c).b.invoke();
        if (!this.h) {
            int itemCount = q5yVar.getItemCount();
            if (i5 >= 0 && i5 < itemCount) {
                Object c = q5yVar.c(i5);
                Object obj = this.j;
                if (obj != null && !c.equals(obj)) {
                    b();
                    return false;
                }
                Object a = q5yVar.a(i5);
                vne0 vne0Var = this.b;
                ob4 ob4Var = vne0Var.c;
                if (vne0Var.b != a || ob4Var == null) {
                    hz40 hz40Var = vne0Var.a;
                    Object d = hz40Var.d(a);
                    if (d == null) {
                        d = new ob4();
                        hz40Var.o(a, d);
                    }
                    ob4Var = (ob4) d;
                    vne0Var.b = a;
                    vne0Var.c = ob4Var;
                }
                e();
                AndroidPrefetchScheduler.a aVar = (AndroidPrefetchScheduler.a) aoe0Var;
                long a2 = aVar.a();
                this.n = a2;
                this.p = s630.a();
                this.o = 0L;
                Trace.setCounter("compose:lazy:prefetch:available_time_nanos", a2);
                if (e()) {
                    j = 0;
                } else {
                    j = 0;
                    if (g(this.n, ob4Var.a + ob4Var.b)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            f(c, a, ob4Var);
                        } finally {
                        }
                    }
                    if (!e()) {
                        return true;
                    }
                }
                if (this.f != null) {
                    if (!g(this.n, ob4Var.c)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        ryu0 ryu0Var = this.f;
                        if (ryu0Var == null) {
                            throw new IllegalArgumentException("Nothing to apply!");
                        }
                        this.e = ryu0Var.apply();
                        this.f = null;
                        this.i = true;
                        Trace.endSection();
                        h();
                        ob4Var.c = ob4.a(this.o, ob4Var.c);
                    } finally {
                    }
                }
                int i6 = 4;
                if (!this.k) {
                    if (this.n <= j) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        syu0 syu0Var = this.e;
                        if (syu0Var == null) {
                            throw nzs.g("Should precompose before resolving nested prefetch states");
                        }
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        syu0Var.c(new h12(i6, ref$ObjectRef));
                        List list2 = (List) ref$ObjectRef.element;
                        this.l = list2 != null ? new one0(this, list2) : null;
                        this.k = true;
                    } finally {
                    }
                }
                one0 one0Var4 = this.l;
                if (one0Var4 != null) {
                    int i7 = ob4Var.e;
                    boolean z = this.m;
                    List[] listArr = one0Var4.b;
                    int i8 = one0Var4.c;
                    List list3 = one0Var4.a;
                    if (i8 < list3.size()) {
                        if (one0Var4.f.h) {
                            lxv.c("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size3 = list3.size();
                            int i9 = 0;
                            while (i9 < size3) {
                                int i10 = i6;
                                ((c6y) list3.get(i9)).d = i7;
                                i9++;
                                i6 = i10;
                            }
                            Trace.endSection();
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (one0Var4.c < list3.size()) {
                                try {
                                    if (listArr[one0Var4.c] == null) {
                                        if (aVar.a() <= j) {
                                            Trace.endSection();
                                            return true;
                                        }
                                        int i11 = one0Var4.c;
                                        c6y c6yVar = (c6y) list3.get(i11);
                                        tls tlsVar = c6yVar.a;
                                        if (tlsVar == null) {
                                            list = EmptyList.a;
                                        } else {
                                            a6y a6yVar = new a6y(c6yVar, c6yVar.d);
                                            tlsVar.invoke(a6yVar);
                                            ArrayList arrayList = a6yVar.b;
                                            c6yVar.f = arrayList.size();
                                            list = arrayList;
                                        }
                                        listArr[i11] = list;
                                    }
                                    List list4 = listArr[one0Var4.c];
                                    while (one0Var4.d < list4.size()) {
                                        zne0 zne0Var = (zne0) list4.get(one0Var4.d);
                                        if (z) {
                                            pne0 pne0Var = zne0Var instanceof pne0 ? (pne0) zne0Var : null;
                                            if (pne0Var != null) {
                                                r13 = 1;
                                                pne0Var.m = true;
                                                one0Var4.e = r13;
                                                if (!((pne0) zne0Var).c(aVar)) {
                                                    return r13;
                                                }
                                                one0Var4.d += r13;
                                            }
                                        }
                                        r13 = 1;
                                        one0Var4.e = r13;
                                        if (!((pne0) zne0Var).c(aVar)) {
                                        }
                                    }
                                    one0Var4.d = 0;
                                    one0Var4.c++;
                                    j = 0;
                                } finally {
                                }
                            }
                            one0Var = this.l;
                            if (one0Var != null && one0Var.e) {
                                h();
                                Trace.setCounter("compose:lazy:prefetch:execute:item", j2);
                                one0Var3 = this.l;
                                if (one0Var3 != null) {
                                    one0Var3.e = false;
                                }
                            }
                            n8e n8eVar = this.d;
                            if (!this.g && n8eVar != null) {
                                if (g(this.n, ob4Var.d)) {
                                    return true;
                                }
                                Trace.beginSection("compose:lazy:prefetch:measure");
                                try {
                                    long j3 = n8eVar.a;
                                    if (this.h) {
                                        lxv.a("Callers should check whether the request is still valid before calling performMeasure()");
                                    }
                                    if (this.g) {
                                        lxv.a("Request was already measured!");
                                    }
                                    this.g = true;
                                    syu0 syu0Var2 = this.e;
                                    if (syu0Var2 == null) {
                                        throw nzs.g("performComposition() must be called before performMeasure()");
                                    }
                                    int d2 = syu0Var2.d();
                                    for (int i12 = 0; i12 < d2; i12++) {
                                        syu0Var2.b(i12, j3);
                                    }
                                    Trace.endSection();
                                    h();
                                    ob4Var.d = ob4.a(this.o, ob4Var.d);
                                    tls tlsVar2 = this.c;
                                    if (tlsVar2 != null) {
                                        tlsVar2.invoke(this);
                                    }
                                } finally {
                                }
                            }
                            one0Var2 = this.l;
                            if (this.g && this.k && one0Var2 != null) {
                                List list5 = one0Var2.a;
                                List list6 = list5;
                                size = list6.size();
                                i = Integer.MAX_VALUE;
                                for (i2 = 0; i2 < size; i2++) {
                                    i = Math.min(i, ((c6y) list5.get(i2)).e);
                                }
                                if (i == Integer.MAX_VALUE) {
                                    i = 0;
                                }
                                int i13 = ob4Var.e;
                                ob4Var.e = i13 != -1 ? i : ((i13 * 3) + i) / 4;
                                size2 = list6.size();
                                i3 = Integer.MAX_VALUE;
                                for (i4 = 0; i4 < size2; i4++) {
                                    i3 = Math.min(i3, ((c6y) list5.get(i4)).f);
                                }
                                if (i3 == Integer.MAX_VALUE) {
                                    i3 = 0;
                                }
                                if (i3 < i) {
                                    ob4Var.d = 0L;
                                }
                            }
                            return false;
                        } finally {
                        }
                    }
                }
                one0Var = this.l;
                if (one0Var != null) {
                    h();
                    Trace.setCounter("compose:lazy:prefetch:execute:item", j2);
                    one0Var3 = this.l;
                    if (one0Var3 != null) {
                    }
                }
                n8e n8eVar2 = this.d;
                if (!this.g) {
                    if (g(this.n, ob4Var.d)) {
                    }
                }
                one0Var2 = this.l;
                if (this.g) {
                    List list52 = one0Var2.a;
                    List list62 = list52;
                    size = list62.size();
                    i = Integer.MAX_VALUE;
                    while (i2 < size) {
                    }
                    if (i == Integer.MAX_VALUE) {
                    }
                    int i132 = ob4Var.e;
                    ob4Var.e = i132 != -1 ? i : ((i132 * 3) + i) / 4;
                    size2 = list62.size();
                    i3 = Integer.MAX_VALUE;
                    while (i4 < size2) {
                    }
                    if (i3 == Integer.MAX_VALUE) {
                    }
                    if (i3 < i) {
                    }
                }
                return false;
            }
        }
        b();
        return false;
    }

    public final boolean e() {
        ryu0 ryu0Var;
        return this.i || ((ryu0Var = this.f) != null && ryu0Var.b());
    }

    public final void f(Object obj, Object obj2, ob4 ob4Var) {
        ryu0 c9vVar;
        ryu0 ryu0Var = this.f;
        if (ryu0Var == null) {
            kzo kzoVar = this.r;
            wls a = ((p5y) kzoVar.c).a(this.a, obj, obj2);
            i a2 = ((t) kzoVar.w).a();
            if (a2.a.F()) {
                a2.j(a, obj, true);
                c9vVar = new c9v(8, a2, obj);
            } else {
                c9vVar = new hdu(a2, obj);
            }
            ryu0Var = c9vVar;
            this.f = ryu0Var;
            this.j = obj;
        }
        this.q = false;
        while (!ryu0Var.b() && !this.q) {
            ryu0Var.a(new h2r(27, this, ob4Var));
        }
        h();
        boolean z = this.q;
        long j = this.o;
        if (z) {
            ob4Var.b = ob4.a(j, ob4Var.b);
        } else {
            ob4Var.a = ob4.a(j, ob4Var.a);
        }
    }

    public final boolean g(long j, long j2) {
        if (this.m) {
            j2 = 0;
        }
        return j > j2;
    }

    public final void h() {
        long M;
        long a = s630.a();
        long j = this.p;
        DurationUnit durationUnit = DurationUnit.NANOSECONDS;
        long j2 = (j - 1) | 1;
        long j3 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        if (j2 != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            M = (1 | (a - 1)) == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED ? cvw.M(a) : cvw.Z(a, j, durationUnit);
        } else if (a == j) {
            o430 o430Var = e3n.b;
            M = 0;
        } else {
            M = e3n.q(cvw.M(j));
        }
        long j4 = M >> 1;
        o430 o430Var2 = e3n.b;
        if ((((int) M) & 1) == 0) {
            j3 = j4;
        } else if (j4 <= 9223372036854L) {
            j3 = j4 < -9223372036854L ? Long.MIN_VALUE : j4 * 1000000;
        }
        this.o = j3;
        long j5 = this.n - j3;
        this.n = j5;
        this.p = a;
        Trace.setCounter("compose:lazy:prefetch:available_time_nanos", j5);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.a);
        sb.append(", constraints = ");
        sb.append(this.d);
        sb.append(", isComposed = ");
        sb.append(e());
        sb.append(", isMeasured = ");
        sb.append(this.g);
        sb.append(", isCanceled = ");
        return x4e.i(sb, this.h, " }");
    }
}
