package xsna;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.ApplicationMetadata;
import java.util.HashSet;
import java.util.Iterator;
import xsna.dz9;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class vr01 extends dz9.c {
    public final /* synthetic */ g0a a;

    public /* synthetic */ vr01(g0a g0aVar) {
        this.a = g0aVar;
    }

    @Override // xsna.dz9.c
    public final void onActiveInputStateChanged(int i) {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((dz9.c) it.next()).onActiveInputStateChanged(i);
        }
    }

    @Override // xsna.dz9.c
    public final void onApplicationDisconnected(int i) {
        g0a g0aVar = this.a;
        g0aVar.n(i);
        d001 d001Var = g0aVar.a;
        if (d001Var != null) {
            try {
                d001Var.K(i);
            } catch (RemoteException unused) {
                ssi0.b.b("Unable to call %s on %s.", "notifySessionEnded", d001.class.getSimpleName());
            }
        }
        Iterator it = new HashSet(g0aVar.d).iterator();
        while (it.hasNext()) {
            ((dz9.c) it.next()).onApplicationDisconnected(i);
        }
    }

    @Override // xsna.dz9.c
    public final void onApplicationMetadataChanged(@Nullable ApplicationMetadata applicationMetadata) {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((dz9.c) it.next()).onApplicationMetadataChanged(applicationMetadata);
        }
    }

    @Override // xsna.dz9.c
    public final void onApplicationStatusChanged() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((dz9.c) it.next()).onApplicationStatusChanged();
        }
    }

    @Override // xsna.dz9.c
    public final void onStandbyStateChanged(int i) {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((dz9.c) it.next()).onStandbyStateChanged(i);
        }
    }

    @Override // xsna.dz9.c
    public final void onVolumeChanged() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((dz9.c) it.next()).onVolumeChanged();
        }
    }
}
