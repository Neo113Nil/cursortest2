package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class lbs extends m50 {
    public final /* synthetic */ AtomicReference a;

    public lbs(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.m50
    public final void a(Object obj) {
        m50 m50Var = (m50) this.a.get();
        if (m50Var != null) {
            m50Var.a(obj);
        } else {
            ny61.r("Operation cannot be started before fragment is in created state");
        }
    }

    @Override // defpackage.m50
    public final void b() {
        m50 m50Var = (m50) this.a.getAndSet(null);
        if (m50Var != null) {
            m50Var.b();
        }
    }
}
