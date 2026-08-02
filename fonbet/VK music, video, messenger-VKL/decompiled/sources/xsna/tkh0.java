package xsna;

import io.opentelemetry.api.common.AttributeType;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.sdk.common.internal.AttributesMap;
import io.opentelemetry.sdk.trace.samplers.SamplingDecision;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.logging.Logger;
import xsna.clh0;

/* compiled from: SdkSpanBuilder.java */
/* loaded from: classes8.dex */
public class tkh0 implements phk0 {
    public static final wmj h;
    public final String a;
    public final q8x b;
    public final nep0 c;
    public final zhk0 d;
    public wmj e;
    public SpanKind f = SpanKind.INTERNAL;
    public AttributesMap g;

    static {
        qpw qpwVar = qpw.c[((byte) (qpw.d.b | 2)) & 255];
        qpwVar.getClass();
        u6e0 u6e0Var = new u6e0(kpw.a("00000000000000000000000000000000", "0000000000000000", qpwVar, pk3.a, false));
        yxy.b.getClass();
        h = mk3.b.a(vhk0.a, u6e0Var);
    }

    public tkh0(String str, q8x q8xVar, nep0 nep0Var, zhk0 zhk0Var) {
        this.a = str;
        this.b = q8xVar;
        this.c = nep0Var;
        this.d = zhk0Var;
    }

    @Override // xsna.phk0
    public phk0 a(boolean z) {
        return g(xfx.a(AttributeType.BOOLEAN, "isNetwork"), Boolean.valueOf(z));
    }

    @Override // xsna.phk0
    public phk0 b() {
        yxy.b.getClass();
        this.e = mk3.b;
        return this;
    }

    @Override // xsna.phk0
    public phk0 c(long j) {
        return g(xfx.a(AttributeType.LONG, "user.id"), Long.valueOf(j));
    }

    @Override // xsna.phk0
    public phk0 d(SpanKind spanKind) {
        if (spanKind == null) {
            return this;
        }
        this.f = spanKind;
        return this;
    }

    @Override // xsna.phk0
    public final ohk0 e() {
        String str;
        boolean z;
        wmj wmjVar;
        Runnable blh0Var;
        bz1 bz1Var;
        boolean z2;
        wmj wmjVar2 = this.e;
        if (wmjVar2 == null) {
            wmjVar2 = wmj.current();
        }
        ohk0 o = ohk0.o(wmjVar2);
        qhk0 i = o.i();
        nep0 nep0Var = this.c;
        hwe0 hwe0Var = (hwe0) nep0Var.c;
        String h2 = hwe0Var.h();
        sm5 sm5Var = (sm5) i;
        if (sm5Var.f) {
            str = sm5Var.b;
            z = (((qpw) sm5Var.d).b & 2) != 0;
            wmjVar = wmjVar2;
        } else {
            str = hwe0Var.i();
            wmjVar = h;
            z = true;
        }
        String str2 = str;
        List<d9z> list = Collections.EMPTY_LIST;
        q94 q94Var = this.g;
        if (q94Var == null) {
            q94Var = jk3.e;
        }
        n0h0 n0h0Var = nep0Var.g;
        SpanKind spanKind = this.f;
        String str3 = this.a;
        rm5 rm5Var = (rm5) n0h0Var.shouldSample(wmjVar, str2, str3, spanKind, q94Var, list);
        SamplingDecision samplingDecision = rm5Var.d;
        ok3 ok3Var = sm5Var.e;
        qpw qpwVar = qpw.d;
        SamplingDecision samplingDecision2 = SamplingDecision.RECORD_AND_SAMPLE;
        boolean equals = samplingDecision2.equals(samplingDecision);
        byte b = qpwVar.b;
        byte b2 = (byte) (equals ? b | 1 : b & (-2));
        qpw[] qpwVarArr = qpw.c;
        byte b3 = qpwVarArr[b2 & 255].b;
        qpw qpwVar2 = qpwVarArr[((byte) (z ? b3 | 2 : b3 & (-3))) & 255];
        qpwVar2.getClass();
        sm5 a = kpw.a(str2, h2, qpwVar2, ok3Var, nep0Var.d);
        clh0 clh0Var = nep0Var.j;
        clh0Var.getClass();
        jk3 jk3Var = clh0.l;
        jk3 jk3Var2 = clh0.m;
        if (sm5Var.f) {
            int i2 = clh0.a.a[samplingDecision.ordinal()];
            if (i2 == 1) {
                clh0Var.b().add(1L, clh0.i);
                blh0Var = new blh0();
            } else if (i2 == 2) {
                clh0Var.b().add(1L, clh0.j);
                clh0Var.a().add(1L, jk3Var);
                blh0Var = new xqc(clh0Var, 11);
            } else {
                if (i2 != 3) {
                    throw new IllegalArgumentException("Unrecognized sampling decision: " + samplingDecision);
                }
                clh0Var.b().add(1L, clh0.k);
                clh0Var.a().add(1L, jk3Var2);
                blh0Var = new or4(clh0Var, 10);
            }
        } else {
            int i3 = clh0.a.a[samplingDecision.ordinal()];
            if (i3 == 1) {
                clh0Var.b().add(1L, clh0.f);
                blh0Var = new blh0();
            } else if (i3 == 2) {
                clh0Var.b().add(1L, clh0.g);
                clh0Var.a().add(1L, jk3Var);
                blh0Var = new xqc(clh0Var, 11);
            } else {
                if (i3 != 3) {
                    throw new IllegalArgumentException("Unrecognized sampling decision: " + samplingDecision);
                }
                clh0Var.b().add(1L, clh0.h);
                clh0Var.a().add(1L, jk3Var2);
                blh0Var = new or4(clh0Var, 10);
            }
        }
        Runnable runnable = blh0Var;
        if (!SamplingDecision.RECORD_ONLY.equals(samplingDecision) && !samplingDecision2.equals(samplingDecision)) {
            return new u6e0(a);
        }
        q94 q94Var2 = rm5Var.e;
        if (!q94Var2.isEmpty()) {
            q94Var2.forEach(new BiConsumer() { // from class: xsna.skh0
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    i94<?> i94Var = (i94) obj;
                    tkh0 tkh0Var = tkh0.this;
                    zhk0 zhk0Var = tkh0Var.d;
                    AttributesMap attributesMap = tkh0Var.g;
                    if (attributesMap == null) {
                        AttributesMap attributesMap2 = new AttributesMap(zhk0Var.b(), zhk0Var.a());
                        tkh0Var.g = attributesMap2;
                        attributesMap = attributesMap2;
                    }
                    attributesMap.put(i94Var, obj2);
                }
            });
        }
        AttributesMap attributesMap = this.g;
        this.g = null;
        SpanKind spanKind2 = this.f;
        fik0 fik0Var = nep0Var.h;
        n1q n1qVar = nep0Var.i;
        cvf cvfVar = nep0Var.b;
        gag0 gag0Var = nep0Var.e;
        Logger logger = rkh0.u;
        if (o instanceof rkh0) {
            bz1Var = ((rkh0) o).g;
            z2 = false;
        } else {
            z2 = true;
            bz1Var = new bz1(cvfVar, ((gcd0) cvfVar).r(true), System.nanoTime());
        }
        rkh0 rkh0Var = new rkh0(a, str3, this.b, spanKind2, o.i(), this.d, fik0Var, n1qVar, bz1Var, gag0Var, attributesMap, z2 ? bz1Var.b : bz1Var.a(), runnable);
        if (fik0Var.isStartRequired()) {
            fik0Var.onStart(wmjVar2, rkh0Var);
        }
        return rkh0Var;
    }

    @Override // xsna.phk0
    public phk0 f(wmj wmjVar) {
        if (wmjVar == null) {
            return this;
        }
        this.e = wmjVar;
        return this;
    }

    public phk0 g(xfx xfxVar, Object obj) {
        if (!xfxVar.b.isEmpty() && obj != null) {
            AttributesMap attributesMap = this.g;
            if (attributesMap == null) {
                AttributesMap attributesMap2 = new AttributesMap(r0.b(), this.d.a());
                this.g = attributesMap2;
                attributesMap = attributesMap2;
            }
            attributesMap.put(xfxVar, obj);
        }
        return this;
    }

    @Override // xsna.phk0
    public phk0 setAttribute(String str, String str2) {
        return g(xfx.a(AttributeType.STRING, str), str2);
    }
}
