package xsna;

import com.google.firebase.perf.session.SessionManager;

/* compiled from: FirebasePerformanceModule_ProvidesSessionManagerFactory.java */
/* loaded from: classes13.dex */
public final class sjr implements d9e0 {
    public final mjr b;

    public sjr(mjr mjrVar) {
        this.b = mjrVar;
    }

    @Override // xsna.e9e0
    public final Object get() {
        this.b.getClass();
        SessionManager sessionManager = SessionManager.getInstance();
        k7b0.a(sessionManager);
        return sessionManager;
    }
}
