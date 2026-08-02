package xsna;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import androidx.datastore.core.CorruptionException;
import kotlin.jvm.internal.Lambda;

/* compiled from: FirebaseSessionsComponent.kt */
/* loaded from: classes.dex */
public final class ikr extends Lambda implements izs<CorruptionException, uyc0> {
    public static final ikr i = new ikr(1);

    @Override // xsna.izs
    public final uyc0 invoke(CorruptionException corruptionException) {
        if (Build.VERSION.SDK_INT > 33) {
            Process.myProcessName();
        } else if (Application.getProcessName() == null) {
            ahd0.a();
        }
        return new nh50(true, 1);
    }
}
