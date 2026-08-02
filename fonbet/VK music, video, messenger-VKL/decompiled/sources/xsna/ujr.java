package xsna;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;

/* compiled from: FirebasePerformance_Factory.java */
/* loaded from: classes13.dex */
public final class ujr implements d9e0 {
    public final ojr b;
    public final qjr c;
    public final pjr d;
    public final tjr e;
    public final rjr f;
    public final njr g;
    public final sjr h;

    public ujr(ojr ojrVar, qjr qjrVar, pjr pjrVar, tjr tjrVar, rjr rjrVar, njr njrVar, sjr sjrVar) {
        this.b = ojrVar;
        this.c = qjrVar;
        this.d = pjrVar;
        this.e = tjrVar;
        this.f = rjrVar;
        this.g = njrVar;
        this.h = sjrVar;
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new kjr((vhr) this.b.get(), (f9e0) this.c.get(), (uir) this.d.get(), (f9e0) this.e.get(), (RemoteConfigManager) this.f.get(), (txi) this.g.get(), (SessionManager) this.h.get());
    }
}
