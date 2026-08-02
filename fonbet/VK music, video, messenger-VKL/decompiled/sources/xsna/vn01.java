package xsna;

import android.util.Log;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes.dex */
public final class vn01 implements Runnable {
    public final /* synthetic */ klk0 b;

    public vn01(klk0 klk0Var) {
        this.b = klk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.a.b();
        } catch (Exception e) {
            Log.e("SplitCompat", "Failed to cleanup splitcompat storage", e);
        }
    }
}
