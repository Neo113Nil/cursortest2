package androidx.compose.foundation;

import android.view.Surface;
import defpackage.dms;
import defpackage.l8x;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.zls;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes10.dex */
public abstract class BaseAndroidExternalSurfaceState {
    private l8x job;
    private dms onSurface;
    private zls onSurfaceChanged;
    private tls onSurfaceDestroyed;
    private final tse scope;

    public BaseAndroidExternalSurfaceState(tse tseVar) {
        this.scope = tseVar;
    }

    public final void dispatchSurfaceChanged(Surface surface, int i, int i2) {
        zls zlsVar = this.onSurfaceChanged;
        if (zlsVar != null) {
            zlsVar.invoke(surface, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public final void dispatchSurfaceCreated(Surface surface, int i, int i2) {
        if (this.onSurface != null) {
            this.job = tje.N(this.scope, null, CoroutineStart.UNDISPATCHED, new BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1(this, surface, i, i2, null), 1);
        }
    }

    public final void dispatchSurfaceDestroyed(Surface surface) {
        tls tlsVar = this.onSurfaceDestroyed;
        if (tlsVar != null) {
            tlsVar.invoke(surface);
        }
        l8x l8xVar = this.job;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
    }

    public final tse getScope() {
        return this.scope;
    }

    public void onChanged(Surface surface, zls zlsVar) {
        this.onSurfaceChanged = zlsVar;
    }

    public void onDestroyed(Surface surface, tls tlsVar) {
        this.onSurfaceDestroyed = tlsVar;
    }

    public void onSurface(dms dmsVar) {
        this.onSurface = dmsVar;
    }
}
