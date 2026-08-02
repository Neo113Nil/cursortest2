package xsna;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.Choreographer;
import androidx.core.app.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import java.util.HashMap;
import java.util.UUID;
import xsna.v1h0;
import xsna.xy50;

/* compiled from: NavigationPerformanceSessionDelegate.kt */
/* loaded from: classes17.dex */
public final class zy50 implements i7f0<z1h0, xy50>, nhl {
    public final u3k b;
    public final HashMap c;
    public final long d;
    public volatile UUID e;
    public volatile boolean f;
    public volatile boolean g;
    public volatile z1h0 h;

    public zy50(u3k u3kVar) {
        HashMap<UUID, yw90> hashMap = zrd0.e;
        this.b = u3kVar;
        this.c = hashMap;
        this.d = SystemClock.elapsedRealtime();
        this.e = UUID.randomUUID();
    }

    public static boolean b(Fragment fragment) {
        boolean z;
        if (!fragment.isRemoving()) {
            if (fragment.getParentFragment() != null) {
                z = b(fragment.requireParentFragment());
            } else {
                if (fragment.getActivity() != null) {
                    FragmentActivity kn = fragment.kn();
                    if (!kn.isFinishing() && kn.isChangingConfigurations()) {
                        z = false;
                    }
                }
                z = true;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final synchronized xy50 a(z1h0 z1h0Var) {
        xy50 xy50Var;
        try {
            this.h = z1h0Var;
            Lifecycle lifecycle = z1h0Var.getLifecycle();
            if (!this.f) {
                this.f = true;
                lifecycle.addObserver(this);
            }
            Object obj = this.c.get(this.e);
            xy50Var = obj instanceof xy50 ? (xy50) obj : null;
            if (xy50Var == null) {
                zrd0 zrd0Var = zrd0.a;
                Choreographer choreographer = zrd0.b;
                xy50 xy50Var2 = new xy50(new pb00(this, 8), zrd0.g, choreographer != null ? new ihl(choreographer, zrd0.c, zrd0.d) : null);
                this.c.put(this.e, xy50Var2);
                long j = this.d;
                xy50Var2.init();
                xy50.a aVar = xy50Var2.d;
                if (aVar.a == null) {
                    aVar.a = Long.valueOf(j);
                }
                xy50Var = xy50Var2;
            }
        } finally {
        }
        return xy50Var;
    }

    @Override // xsna.i7f0
    public final /* bridge */ /* synthetic */ xy50 getValue(z1h0 z1h0Var, qcy qcyVar) {
        return a(z1h0Var);
    }

    @Override // xsna.nhl
    public final synchronized void onCreate(f5z f5zVar) {
        v1h0 savedStateRegistry;
        Bundle a;
        v1h0 savedStateRegistry2;
        try {
            if (!this.g) {
                z1h0 z1h0Var = this.h;
                if (z1h0Var != null && (savedStateRegistry2 = z1h0Var.getSavedStateRegistry()) != null && savedStateRegistry2.b("performance_score_session") == null) {
                    savedStateRegistry2.c("performance_score_session", new v1h0.b() { // from class: xsna.yy50
                        @Override // xsna.v1h0.b
                        public final Bundle r() {
                            zy50 zy50Var = zy50.this;
                            Bundle bundle = new Bundle();
                            bundle.putString("session_uuid", zy50Var.e.toString());
                            return bundle;
                        }
                    });
                    s3q0 s3q0Var = s3q0.a;
                }
                this.g = true;
            }
            z1h0 z1h0Var2 = this.h;
            if (z1h0Var2 != null && (savedStateRegistry = z1h0Var2.getSavedStateRegistry()) != null && (a = savedStateRegistry.a("performance_score_session")) != null) {
                UUID fromString = UUID.fromString(a.getString("session_uuid"));
                if (fromString != null && !epx.f(this.e, fromString)) {
                    this.c.remove(this.e);
                }
                this.e = fromString;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // xsna.nhl
    public final synchronized void onDestroy(f5z f5zVar) {
        try {
            if (f5zVar.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                Lifecycle lifecycle = f5zVar.getLifecycle();
                this.f = false;
                lifecycle.removeObserver(this);
                this.g = false;
            }
            f5z f5zVar2 = this.h;
            boolean z = true;
            if (f5zVar2 instanceof ComponentActivity) {
                ComponentActivity componentActivity = (ComponentActivity) f5zVar2;
                z = componentActivity.isFinishing() || !componentActivity.isChangingConfigurations();
            } else if (f5zVar2 instanceof Fragment) {
                z = b((Fragment) f5zVar2);
            }
            if (z) {
                yw90 yw90Var = (yw90) this.c.get(this.e);
                if (yw90Var != null) {
                    yw90Var.stop();
                }
                this.c.remove(this.e);
            }
        } finally {
        }
    }

    @Override // xsna.nhl
    public final synchronized void onPause(f5z f5zVar) {
        try {
            Object obj = this.c.get(this.e);
            xy50 xy50Var = obj instanceof xy50 ? (xy50) obj : null;
            if (xy50Var != null) {
                String str = (String) this.b.invoke();
                synchronized (xy50Var) {
                    xy50Var.k = str;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // xsna.nhl
    public final void onResume(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onStart(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onStop(f5z f5zVar) {
    }
}
