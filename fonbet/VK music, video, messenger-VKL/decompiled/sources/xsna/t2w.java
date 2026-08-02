package xsna;

import android.app.Activity;
import com.vk.im.engine.models.sync.ImBgSyncMode;
import com.vk.im.engine.models.sync.SyncStartCause;
import com.vk.im.engine.models.sync.SyncStopCause;
import xsna.c63;

/* compiled from: ImEngineSyncHelperImpl.kt */
/* loaded from: classes.dex */
public final class t2w extends c63.b {
    public final /* synthetic */ s2w b;

    public t2w(s2w s2wVar) {
        this.b = s2wVar;
    }

    @Override // xsna.c63.b
    public final void u() {
        s2w s2wVar = this.b;
        synchronized (s2wVar) {
            s2wVar.h(s2w.n, SyncStopCause.APP_PAUSE);
            ((lsl) s2wVar.k.getValue()).a("APP_PAUSE");
        }
    }

    @Override // xsna.c63.b
    public final void x(Activity activity) {
        s2w s2wVar = this.b;
        synchronized (s2wVar) {
            s2wVar.e(ImBgSyncMode.FULL, SyncStartCause.APP_RESUME);
            ((lsl) s2wVar.k.getValue()).a("APP_RESUME");
        }
    }
}
