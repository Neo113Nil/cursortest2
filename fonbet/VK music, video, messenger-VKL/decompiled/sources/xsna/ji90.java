package xsna;

import io.opentelemetry.api.trace.SpanKind;
import java.util.List;

/* compiled from: ParentBasedSampler.java */
/* loaded from: classes11.dex */
public final class ji90 implements n0h0 {
    public final n0h0 b;
    public final n0h0 c;
    public final n0h0 d;
    public final n0h0 e;
    public final n0h0 f;

    public ji90(n0h0 n0h0Var) {
        this.b = n0h0Var;
        uv1 uv1Var = uv1.INSTANCE;
        this.c = uv1Var;
        tv1 tv1Var = tv1.INSTANCE;
        this.d = tv1Var;
        this.e = uv1Var;
        this.f = tv1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji90)) {
            return false;
        }
        ji90 ji90Var = (ji90) obj;
        return this.b.equals(ji90Var.b) && this.c.equals(ji90Var.c) && this.d.equals(ji90Var.d) && this.e.equals(ji90Var.e) && this.f.equals(ji90Var.f);
    }

    @Override // xsna.n0h0
    public final String getDescription() {
        String description = this.b.getDescription();
        String description2 = this.c.getDescription();
        String description3 = this.d.getDescription();
        String description4 = this.e.getDescription();
        String description5 = this.f.getDescription();
        StringBuilder a = xe9.a("ParentBased{root:", description, ",remoteParentSampled:", description2, ",remoteParentNotSampled:");
        n6j.b(a, description3, ",localParentSampled:", description4, ",localParentNotSampled:");
        return i5s.a(a, description5, "}");
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @Override // xsna.n0h0
    public final p0h0 shouldSample(wmj wmjVar, String str, String str2, SpanKind spanKind, q94 q94Var, List<d9z> list) {
        qhk0 i = ohk0.o(wmjVar).i();
        sm5 sm5Var = (sm5) i;
        if (!sm5Var.f) {
            return this.b.shouldSample(wmjVar, str, str2, spanKind, q94Var, list);
        }
        sm5Var.getClass();
        return i.i() ? this.e.shouldSample(wmjVar, str, str2, spanKind, q94Var, list) : this.f.shouldSample(wmjVar, str, str2, spanKind, q94Var, list);
    }

    public final String toString() {
        return getDescription();
    }
}
