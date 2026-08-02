package xsna;

import java.util.UUID;
import java.util.concurrent.TimeUnit;
import xsna.g8i;

/* compiled from: ReportableCompletionMarker.kt */
/* loaded from: classes2.dex */
public final class o6g0 implements g8i {
    public final g8i a;
    public final long b;
    public final vok0 c;
    public final String d;

    public o6g0(g8i g8iVar, long j, vok0 vok0Var, String str) {
        this.a = g8iVar;
        this.b = j;
        this.c = vok0Var;
        this.d = str;
    }

    @Override // xsna.g8i
    public final g8i.a a(long j, TimeUnit timeUnit) {
        return this.a.a(j, timeUnit);
    }

    @Override // xsna.g8i
    public final void await() {
        this.c.a(this.b, UUID.randomUUID(), new f0z(this, 24));
    }

    @Override // xsna.g8i
    public final boolean b(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return this.a.b(j);
    }

    @Override // xsna.g8i
    public final String id() {
        return this.a.id();
    }
}
