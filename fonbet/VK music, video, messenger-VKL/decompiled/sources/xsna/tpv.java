package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;

/* compiled from: IconCache.kt */
/* loaded from: classes2.dex */
public final class tpv implements nhl {
    public final /* synthetic */ rpv b;

    public tpv(rpv rpvVar) {
        this.b = rpvVar;
    }

    @Override // xsna.nhl
    public final void onDestroy(f5z f5zVar) {
        rpv rpvVar = this.b;
        rpvVar.a(true);
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{rpvVar.toString()});
    }

    @Override // xsna.nhl
    public final void onCreate(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onPause(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onResume(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onStart(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onStop(f5z f5zVar) {
    }
}
