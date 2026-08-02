package xsna;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import xsna.dqk;
import xsna.gkk0;
import xsna.r0l0;
import xsna.zef0;

/* compiled from: ResultGroupByDurationAggregator.kt */
/* loaded from: classes12.dex */
public final class kb1<T extends zef0> implements jb1<T> {
    public final jb1<T> a;
    public final Instant b;
    public ZoneOffset c;
    public Instant d;

    public kb1(jb1<T> jb1Var, Instant instant) {
        this.a = jb1Var;
        this.b = instant;
    }

    @Override // xsna.jb1
    public final androidx.health.connect.client.aggregate.c a() {
        return this.a.a();
    }

    @Override // xsna.jb1
    public final void b(T t) {
        Instant a;
        Instant instant;
        Instant instant2;
        Instant instant3;
        ZoneOffset d;
        boolean z = t instanceof w7x;
        if (z) {
            a = ((w7x) t).C();
        } else if (t instanceof lni0) {
            List K = ((lni0) t).K();
            ArrayList arrayList = new ArrayList();
            for (Object obj : K) {
                if (obj instanceof dqk.a) {
                    instant3 = ((dqk.a) obj).a;
                } else if (obj instanceof gkk0.d) {
                    instant3 = ((gkk0.d) obj).a;
                } else {
                    if (!(obj instanceof r0l0.a)) {
                        throw new IllegalStateException(rqi.c(obj, "Unsupported type for time: "));
                    }
                    instant3 = ((r0l0.a) obj).a;
                }
                if (instant3.compareTo(this.b) >= 0) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it.next();
            if (next instanceof dqk.a) {
                instant = ((dqk.a) next).a;
            } else if (next instanceof gkk0.d) {
                instant = ((gkk0.d) next).a;
            } else {
                if (!(next instanceof r0l0.a)) {
                    throw new IllegalStateException(rqi.c(next, "Unsupported type for time: "));
                }
                instant = ((r0l0.a) next).a;
            }
            while (it.hasNext()) {
                Object next2 = it.next();
                if (next2 instanceof dqk.a) {
                    instant2 = ((dqk.a) next2).a;
                } else if (next2 instanceof gkk0.d) {
                    instant2 = ((gkk0.d) next2).a;
                } else {
                    if (!(next2 instanceof r0l0.a)) {
                        throw new IllegalStateException(rqi.c(next2, "Unsupported type for time: "));
                    }
                    instant2 = ((r0l0.a) next2).a;
                }
                if (instant.compareTo(instant2) > 0) {
                    instant = instant2;
                }
            }
            a = instant;
        } else {
            if (!(t instanceof oox)) {
                throw new IllegalStateException(("Unsupported record " + t).toString());
            }
            a = ((oox) t).a();
        }
        if (z) {
            d = ((w7x) t).e();
        } else {
            if (!(t instanceof oox)) {
                throw new IllegalStateException(("Unsupported record " + t).toString());
            }
            d = ((oox) t).d();
        }
        Instant instant4 = this.d;
        if (instant4 == null || a.compareTo(instant4) < 0) {
            this.d = a;
            this.c = d;
        }
        this.a.b(t);
    }
}
