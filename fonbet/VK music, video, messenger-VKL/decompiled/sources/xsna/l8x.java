package xsna;

import io.opentelemetry.sdk.metrics.InstrumentType;
import io.opentelemetry.sdk.metrics.InstrumentValueType;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import java.util.logging.Logger;
import xsna.dkh0;
import xsna.nk5;
import xsna.rnl;
import xsna.x41;

/* compiled from: InstrumentBuilder.java */
/* loaded from: classes8.dex */
public final class l8x {
    public final String a;
    public final dkh0 b;
    public final InstrumentValueType c;
    public InstrumentType d;
    public x41.a e;
    public String f;
    public String g;

    /* compiled from: InstrumentBuilder.java */
    @FunctionalInterface
    public interface a<I extends te> {
        te c(ym5 ym5Var, dkh0 dkh0Var, n3y0 n3y0Var);
    }

    public l8x(String str, InstrumentType instrumentType, InstrumentValueType instrumentValueType, dkh0 dkh0Var) {
        nk5 nk5Var = x41.a;
        this.e = new nk5.a();
        this.f = "";
        this.g = "";
        this.a = str;
        this.d = instrumentType;
        this.c = instrumentValueType;
        this.b = dkh0Var;
    }

    public final ikh0 a(InstrumentType instrumentType, Consumer<lq70> consumer) {
        jkh0 c = c(instrumentType);
        tb9 tb9Var = new tb9(Collections.singletonList(c), new si0(5, consumer, c));
        dkh0 dkh0Var = this.b;
        dkh0Var.b(tb9Var);
        return new ikh0(dkh0Var, tb9Var);
    }

    public final ikh0 b(InstrumentType instrumentType, Consumer<qq70> consumer) {
        jkh0 c = c(instrumentType);
        tb9 tb9Var = new tb9(Collections.singletonList(c), new h12(6, consumer, c));
        dkh0 dkh0Var = this.b;
        dkh0Var.b(tb9Var);
        return new ikh0(dkh0Var, tb9Var);
    }

    public final jkh0 c(InstrumentType instrumentType) {
        this.d = instrumentType;
        ym5 e = e();
        dkh0 dkh0Var = this.b;
        dkh0Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<lqf0, gl20> entry : dkh0Var.f.entrySet()) {
            lqf0 key = entry.getKey();
            gl20 value = entry.getValue();
            for (mqf0 mqf0Var : key.c.a(e, dkh0Var.e)) {
                if (zlo.a != mqf0Var.c().b()) {
                    boolean z = dkh0Var.g;
                    Logger logger = m04.v;
                    ttt0 c = mqf0Var.c();
                    arrayList.add((m04) value.a(new m04(key, zk20.a(c, mqf0Var.e(), e), ((rb1) c.b()).a(e, sv1.c, key.b.getMemoryMode()), mqf0Var.d(), mqf0Var.a(), z)));
                }
            }
        }
        return new jkh0(dkh0Var.e, e, arrayList);
    }

    public final <I extends te> I d(a<I> aVar) {
        fl20 bVar;
        ym5 e = e();
        dkh0 dkh0Var = this.b;
        dkh0Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<lqf0, gl20> entry : dkh0Var.f.entrySet()) {
            lqf0 key = entry.getKey();
            gl20 value = entry.getValue();
            for (mqf0 mqf0Var : key.c.a(e, dkh0Var.e)) {
                if (zlo.a != mqf0Var.c().b()) {
                    d4q b = dkh0Var.d.b();
                    boolean z = dkh0Var.g;
                    ttt0 c = mqf0Var.c();
                    mn5 a2 = zk20.a(c, mqf0Var.e(), e);
                    rb1 rb1Var = (rb1) c.b();
                    dl20 dl20Var = key.b;
                    pb1 a3 = rb1Var.a(e, b, dl20Var.getMemoryMode());
                    if (amo.b == a3) {
                        bVar = ngp.c;
                    } else {
                        s770 d = mqf0Var.d();
                        int a4 = mqf0Var.a();
                        Logger logger = rnl.h;
                        bVar = dl20Var.getAggregationTemporality(a2.f.f) == AggregationTemporality.CUMULATIVE ? new rnl.b(a2, a3, d, a4, z, dl20Var.getMemoryMode()) : new rnl.c(key, a2, a3, d, a4, z);
                    }
                    arrayList.add((gpn0) value.a(bVar));
                }
            }
        }
        return (I) aVar.c(e, this.b, arrayList.size() == 1 ? (n3y0) arrayList.get(0) : new dkh0.a(arrayList));
    }

    public final ym5 e() {
        String str = this.f;
        String str2 = this.g;
        InstrumentType instrumentType = this.d;
        nk5.a aVar = (nk5.a) this.e;
        aVar.getClass();
        return new ym5(this.a, str, str2, instrumentType, this.c, new nk5(aVar.a));
    }

    public final String f(String str) {
        StringBuilder b = ho8.b(str, "{descriptor=");
        b.append(e());
        b.append("}");
        return b.toString();
    }

    public final String toString() {
        return f(l8x.class.getSimpleName());
    }
}
