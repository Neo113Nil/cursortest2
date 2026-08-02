package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.lifecycle.Lifecycle;
import com.vk.log.L;

/* compiled from: LifecycleAwareHandler.kt */
/* loaded from: classes3.dex */
public final class z3z extends Handler implements nhl {
    public final f5z b;
    public boolean c;

    public z3z(f5z f5zVar) {
        super(Looper.getMainLooper());
        this.b = f5zVar;
        this.c = f5zVar.getLifecycle().getCurrentState().a(Lifecycle.State.STARTED);
        f5zVar.getLifecycle().addObserver(this);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        if (this.c) {
            super.dispatchMessage(message);
        } else {
            L.G("message was skipped");
        }
    }

    @Override // xsna.nhl
    public final void onDestroy(f5z f5zVar) {
        this.b.getLifecycle().removeObserver(this);
    }

    @Override // xsna.nhl
    public final void onStart(f5z f5zVar) {
        this.c = true;
    }

    @Override // xsna.nhl
    public final void onStop(f5z f5zVar) {
        this.c = false;
        removeCallbacksAndMessages(null);
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
}
