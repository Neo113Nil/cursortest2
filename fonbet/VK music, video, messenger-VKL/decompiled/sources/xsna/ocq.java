package xsna;

import io.opentelemetry.api.incubator.trace.ExtendedSpanBuilder;
import io.opentelemetry.api.trace.SpanKind;

/* compiled from: ExtendedSdkSpanBuilder.java */
/* loaded from: classes8.dex */
public final class ocq extends tkh0 implements ExtendedSpanBuilder {
    @Override // xsna.tkh0, xsna.phk0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final ExtendedSpanBuilder c(long j) {
        super.c(j);
        return this;
    }

    @Override // xsna.tkh0, xsna.phk0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final ExtendedSpanBuilder setAttribute(String str, String str2) {
        super.setAttribute(str, str2);
        return this;
    }

    @Override // xsna.tkh0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final ExtendedSpanBuilder g(xfx xfxVar, Object obj) {
        super.g(xfxVar, obj);
        return this;
    }

    @Override // xsna.tkh0, xsna.phk0
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final ExtendedSpanBuilder a(boolean z) {
        super.a(z);
        return this;
    }

    @Override // xsna.tkh0, xsna.phk0
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final ExtendedSpanBuilder b() {
        super.b();
        return this;
    }

    @Override // xsna.tkh0, xsna.phk0
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final ExtendedSpanBuilder f(wmj wmjVar) {
        if (wmjVar == null) {
            return this;
        }
        this.e = wmjVar;
        return this;
    }

    @Override // xsna.tkh0, xsna.phk0
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final ExtendedSpanBuilder d(SpanKind spanKind) {
        if (spanKind == null) {
            return this;
        }
        this.f = spanKind;
        return this;
    }
}
