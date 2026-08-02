package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.yandex.pulse.mvi.tracker.ResponsivenessTracker;
import java.util.Random;

/* loaded from: classes9.dex */
public final /* synthetic */ class h6u implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h6u(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.a = 1;
        this.b = context;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                sjh sjhVar = uyj.a;
                ((j18) obj).G(o400.a, Long.valueOf(j));
                break;
            case 1:
                Handler.createAsync(Looper.getMainLooper()).postDelayed(new fb1((Context) obj, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            default:
                ResponsivenessTracker responsivenessTracker = (ResponsivenessTracker) obj;
                SparseArray sparseArray = responsivenessTracker.i;
                responsivenessTracker.g = false;
                if (responsivenessTracker.h) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    int size = sparseArray.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        qwj0 qwj0Var = (qwj0) sparseArray.valueAt(i2);
                        lwa0 lwa0Var = qwj0Var.a;
                        if (lwa0Var != null) {
                            long j2 = uptimeMillis - lwa0Var.a;
                            Long l = qwj0Var.b;
                            qwj0Var.b = Long.valueOf(Math.max(j2, l != null ? l.longValue() : 0L));
                            qwj0Var.a = null;
                        }
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ h6u(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
