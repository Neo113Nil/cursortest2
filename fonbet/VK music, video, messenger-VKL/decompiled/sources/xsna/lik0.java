package xsna;

import io.opentelemetry.api.trace.SpanKind;
import java.util.List;
import java.util.Objects;

/* compiled from: SpanWrapper.java */
/* loaded from: classes8.dex */
public abstract class lik0 implements whk0 {
    @Override // xsna.whk0
    public final int a() {
        return x();
    }

    @Override // xsna.whk0
    public final List<pyp> b() {
        return u();
    }

    @Override // xsna.whk0
    public final q8x c() {
        return q().i;
    }

    @Override // xsna.whk0
    public final gag0 d() {
        return q().h;
    }

    @Override // xsna.whk0
    public final List<d9z> f() {
        return v();
    }

    @Override // xsna.whk0
    public final long g() {
        return q().j;
    }

    @Override // xsna.whk0
    public final q94 getAttributes() {
        return p();
    }

    @Override // xsna.whk0
    public final SpanKind getKind() {
        return q().f;
    }

    @Override // xsna.whk0
    public final String getName() {
        return t();
    }

    @Override // xsna.whk0
    public final izk0 getStatus() {
        return w();
    }

    @Override // xsna.whk0
    public final qhk0 i() {
        return q().b;
    }

    @Override // xsna.whk0
    public final long j() {
        return r();
    }

    @Override // xsna.whk0
    public final int k() {
        return y();
    }

    @Override // xsna.whk0
    public final int m() {
        return z();
    }

    @Override // xsna.whk0
    public final qhk0 n() {
        return q().c;
    }

    @Override // xsna.whk0
    @Deprecated
    public final an5 o() {
        q8x q8xVar = q().i;
        String c = q8xVar.c();
        String e = q8xVar.e();
        String d = q8xVar.d();
        int i = p8x.a;
        Objects.requireNonNull(c, "name");
        return new an5(c, e, d);
    }

    public abstract q94 p();

    public abstract rkh0 q();

    public abstract long r();

    public abstract boolean s();

    public abstract String t();

    public final String toString() {
        return "SpanData{spanContext=" + q().b + ", parentSpanContext=" + q().c + ", resource=" + q().h + ", instrumentationScopeInfo=" + q().i + ", name=" + t() + ", kind=" + q().f + ", startEpochNanos=" + q().j + ", endEpochNanos=" + r() + ", attributes=" + p() + ", totalAttributeCount=" + x() + ", events=" + u() + ", totalRecordedEvents=" + y() + ", links=" + v() + ", totalRecordedLinks=" + z() + ", status=" + w() + ", hasEnded=" + s() + "}";
    }

    public abstract List<pyp> u();

    public abstract List<d9z> v();

    public abstract izk0 w();

    public abstract int x();

    public abstract int y();

    public abstract int z();
}
