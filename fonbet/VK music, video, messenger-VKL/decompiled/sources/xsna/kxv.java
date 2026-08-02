package xsna;

import android.os.Trace;
import com.vk.im.engine.models.sync.ImBgSyncMode;

/* compiled from: ImBgSyncWorkerImpl.kt */
/* loaded from: classes.dex */
public final class kxv implements jxv {
    public final a1w a;

    public kxv(a1w a1wVar) {
        this.a = a1wVar;
    }

    @Override // xsna.jxv
    public final ixv b() {
        return this.a.p();
    }

    @Override // xsna.jxv
    public final void c(String str) {
        this.a.A(str);
    }

    @Override // xsna.jxv
    public final boolean d() {
        boolean z;
        a1w a1wVar = this.a;
        a1wVar.getClass();
        try {
            Trace.beginSection("ImEngine.isBgSyncStartedOrStarting");
            synchronized (a1wVar.c) {
                z = a1wVar.j.d() != null;
            }
            return z;
        } finally {
            Trace.endSection();
        }
    }

    @Override // xsna.jxv
    public final void e(ImBgSyncMode imBgSyncMode, String str) {
        this.a.z(imBgSyncMode, str);
    }

    @Override // xsna.jxv
    public final boolean f() {
        return this.a.u();
    }
}
