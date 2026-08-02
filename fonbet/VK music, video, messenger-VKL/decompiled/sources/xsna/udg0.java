package xsna;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.TemporalAmount;
import java.time.zone.ZoneRules;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.zef0;

/* compiled from: ResultGroupByDurationAggregator.kt */
/* loaded from: classes12.dex */
public final class udg0<T extends zef0> implements qb1<T, List<? extends mb1>> {
    public final cvo0<?> a;
    public final Duration b;
    public final izs<u7x, jb1<T>> c;
    public final u7x d;
    public final LinkedHashMap e;

    /* JADX WARN: Multi-variable type inference failed */
    public udg0(cvo0<?> cvo0Var, Duration duration, izs<? super u7x, ? extends jb1<T>> izsVar) {
        u7x u7xVar;
        this.a = cvo0Var;
        this.b = duration;
        this.c = izsVar;
        if (cvo0Var instanceof u7x) {
            u7xVar = (u7x) cvo0Var;
        } else {
            if (!(cvo0Var instanceof zvz)) {
                throw new NoWhenBranchMatchedException();
            }
            zvz zvzVar = (zvz) cvo0Var;
            u7xVar = new u7x(zvzVar.a.toInstant(ZoneOffset.MAX), zvzVar.b.toInstant(ZoneOffset.MIN));
        }
        this.d = u7xVar;
        this.e = new LinkedHashMap();
    }

    @Override // xsna.qb1
    public final void a(T t) {
        Instant b;
        Instant b2;
        if (!tb1.a(t, this.a)) {
            return;
        }
        u7x u7xVar = this.d;
        Instant instant = u7xVar.a;
        boolean z = t instanceof w7x;
        if (z) {
            b = b(((w7x) t).C());
        } else {
            if (!(t instanceof oox)) {
                throw new IllegalStateException(("Unsupported value for aggregation: " + t).toString());
            }
            b = b(((oox) t).a());
        }
        Object v = jw5.v(instant, b);
        if (z) {
            b2 = (Instant) v;
        } else {
            if (!(t instanceof oox)) {
                throw new IllegalStateException(("Unsupported value for aggregation: " + t).toString());
            }
            b2 = b(((oox) t).b());
        }
        while (true) {
            Instant instant2 = (Instant) v;
            if (instant2.compareTo(b2) > 0 || instant2.compareTo(u7xVar.b) >= 0) {
                return;
            }
            Duration duration = this.b;
            u7x u7xVar2 = new u7x(instant2, (Instant) jw5.w(instant2.plus((TemporalAmount) duration), u7xVar.b));
            if (tb1.a(t, u7xVar2)) {
                LinkedHashMap linkedHashMap = this.e;
                Object obj = linkedHashMap.get(v);
                if (obj == null) {
                    obj = new kb1(this.c.invoke(u7xVar2), instant2);
                    linkedHashMap.put(v, obj);
                }
                ((kb1) obj).b(t);
            }
            v = instant2.plus((TemporalAmount) duration);
        }
    }

    public final Instant b(Instant instant) {
        long dividedBy;
        Instant instant2 = this.d.a;
        Duration between = Duration.between(instant2, instant);
        Duration duration = this.b;
        dividedBy = between.dividedBy(duration);
        return instant2.plus((TemporalAmount) duration.multipliedBy(dividedBy));
    }

    @Override // xsna.qb1
    public final List<? extends mb1> getResult() {
        Collection<kb1> values = this.e.values();
        ArrayList arrayList = new ArrayList(c5g.u(values, 10));
        for (kb1 kb1Var : values) {
            Instant instant = kb1Var.b;
            Instant instant2 = (Instant) jw5.w(instant.plus((TemporalAmount) this.b), this.d.b);
            ZoneOffset zoneOffset = kb1Var.c;
            if (zoneOffset == null) {
                ZoneRules rules = ZoneId.systemDefault().getRules();
                Instant instant3 = kb1Var.d;
                if (instant3 == null) {
                    instant3 = Instant.now();
                }
                zoneOffset = rules.getOffset(instant3);
            }
            lb1 lb1Var = new lb1(kb1Var.a.a(), instant, instant2, zoneOffset, false);
            Instant instant4 = kb1Var.d;
            if (instant4 == null) {
                instant4 = Instant.MAX;
            }
            arrayList.add(new mb1(lb1Var, instant4));
        }
        return arrayList;
    }
}
