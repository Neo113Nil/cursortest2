package xsna;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.dt5;

/* compiled from: PlaybackStatisticsAggregator.kt */
/* loaded from: classes3.dex */
public final class aza0 implements gwa0 {
    public Long b;
    public boolean j;
    public Long l;
    public Long m;
    public Long n;
    public Long o;
    public final long a = SystemClock.elapsedRealtime();
    public final yo10 c = new yo10();
    public final yo10 d = new yo10();
    public final yo10 e = new yo10();
    public final yo10 f = new yo10();
    public final yo10 g = new yo10();
    public final yo10 h = new yo10();
    public final yo10 i = new yo10();
    public final LinkedHashSet k = new LinkedHashSet();
    public final HashMap<Integer, yx4> p = new HashMap<>();

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(((yx4) t).a), Integer.valueOf(((yx4) t2).a));
        }
    }

    public static long h(Long l) {
        if (l == null) {
            return -1L;
        }
        return SystemClock.elapsedRealtime() - l.longValue();
    }

    public static int i(Number number) {
        if (number != null) {
            return number.intValue();
        }
        return -1;
    }

    @Override // xsna.gwa0
    public final void a(long j) {
        this.i.b(j);
    }

    @Override // xsna.gwa0
    public final void b(long j) {
        this.h.b(j);
    }

    @Override // xsna.gwa0
    public final void c() {
        this.j = true;
    }

    @Override // xsna.gwa0
    public final void d(wfs wfsVar) {
        float f = 100;
        long j = wfsVar.a;
        long j2 = wfsVar.f;
        this.c.b((j * f) / j2);
        this.d.b(((j + wfsVar.b) * f) / j2);
        this.f.b((wfsVar.d * f) / j2);
        this.g.b(((r1 + wfsVar.e) * f) / j2);
        Float valueOf = wfsVar.c != null ? Float.valueOf((f * r9.longValue()) / j2) : null;
        if (valueOf != null) {
            this.e.b(valueOf.floatValue());
        }
    }

    @Override // xsna.gwa0
    public final void e(l8l l8lVar, int i) {
        this.k.add(pq20.d(l8lVar, i));
    }

    @Override // xsna.gwa0
    public final void f(Map<Integer, yx4> map) {
        for (Map.Entry<Integer, yx4> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            yx4 value = entry.getValue();
            Integer valueOf = Integer.valueOf(intValue);
            final uni uniVar = new uni(3);
            this.p.merge(valueOf, value, new BiFunction() { // from class: xsna.yya0
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return (yx4) uni.this.invoke(obj, obj2);
                }
            });
        }
    }

    public final mya0 g() {
        int i;
        Object obj;
        Long l = this.l;
        long longValue = l != null ? l.longValue() : h(this.m);
        Long l2 = this.n;
        long longValue2 = l2 != null ? l2.longValue() : h(this.o);
        int i2 = i(this.b);
        yo10 yo10Var = this.h;
        int i3 = i(yo10Var.a());
        Float f = yo10Var.f;
        if (f == null) {
            f = dt5.b.a.a(yo10Var.e);
            yo10Var.f = f;
        }
        int i4 = i(f);
        int i5 = i(yo10Var.b);
        int i6 = i(this.c.a());
        int i7 = i(this.d.a());
        int i8 = i(this.e.a());
        int i9 = i(this.f.a());
        int i10 = i(this.g.a());
        int i11 = i(this.i.a());
        boolean z = this.j;
        List O0 = j5g.O0(this.k);
        List list = O0;
        List D0 = j5g.D0(new cza0(new di1(3)), list);
        List D02 = j5g.D0(new dza0(new bza0(0)), list);
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        int size = O0.size();
        int i12 = 0;
        boolean z2 = true;
        while (i12 < size) {
            if (z2) {
                i = size;
                while (linkedHashSet.contains(D0.get(ref$IntRef.element))) {
                    ref$IntRef.element++;
                }
                obj = D0.get(ref$IntRef.element);
            } else {
                i = size;
                while (linkedHashSet.contains(D02.get(ref$IntRef2.element))) {
                    ref$IntRef2.element++;
                }
                obj = D02.get(ref$IntRef2.element);
            }
            ems0 ems0Var = (ems0) obj;
            linkedHashSet.add(ems0Var);
            arrayList.add(ems0Var);
            i12++;
            size = i;
            z2 = !z2;
        }
        return new mya0(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, z ? 1 : 0, arrayList, (int) longValue, (int) longValue2, j5g.D0(new a(), this.p.values()));
    }
}
