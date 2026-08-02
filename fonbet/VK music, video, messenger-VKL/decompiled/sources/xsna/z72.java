package xsna;

import android.os.Looper;

/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes11.dex */
public final class z72 implements he00 {
    @Override // xsna.he00
    public final htu a() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new htu(ktu.b(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }
}
