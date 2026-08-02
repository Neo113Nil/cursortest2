package sg.bigo.ads.am;

import android.content.ComponentName;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import xsna.lok;
import xsna.nok;

/* loaded from: classes9.dex */
public final class c extends nok {
    private WeakReference<d> a;

    public c(d dVar) {
        this.a = new WeakReference<>(dVar);
    }

    @Override // xsna.nok
    public final void onCustomTabsServiceConnected(@NonNull ComponentName componentName, @NonNull lok lokVar) {
        d dVar = this.a.get();
        if (dVar != null) {
            dVar.a(lokVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        d dVar = this.a.get();
        if (dVar != null) {
            dVar.b();
        }
    }
}
