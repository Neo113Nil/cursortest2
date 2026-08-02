package xsna;

import com.google.firebase.perf.config.RemoteConfigManager;

/* compiled from: FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory.java */
/* loaded from: classes13.dex */
public final class rjr implements d9e0 {
    public final mjr b;

    public rjr(mjr mjrVar) {
        this.b = mjrVar;
    }

    @Override // xsna.e9e0
    public final Object get() {
        this.b.getClass();
        RemoteConfigManager remoteConfigManager = RemoteConfigManager.getInstance();
        k7b0.a(remoteConfigManager);
        return remoteConfigManager;
    }
}
