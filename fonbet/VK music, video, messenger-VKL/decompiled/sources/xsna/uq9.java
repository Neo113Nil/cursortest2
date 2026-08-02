package xsna;

import android.os.CancellationSignal;
import androidx.annotation.Nullable;

/* compiled from: CancellationSignalProvider.java */
/* loaded from: classes11.dex */
public final class uq9 {

    @Nullable
    public CancellationSignal a;

    @Nullable
    public rq9 b;

    /* compiled from: CancellationSignalProvider.java */
    public class a {
    }

    /* compiled from: CancellationSignalProvider.java */
    public static class b {
        public static void a(CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }

        public static CancellationSignal b() {
            return new CancellationSignal();
        }
    }
}
