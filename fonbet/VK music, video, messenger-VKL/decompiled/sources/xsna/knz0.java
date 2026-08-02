package xsna;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class knz0<R extends qdg0> extends jlp0<R> implements tdg0<R> {
    public final WeakReference e;
    public final jnz0 f;

    @Nullable
    public knz0 a = null;

    @Nullable
    public cv90 b = null;
    public final Object c = new Object();

    @Nullable
    public Status d = null;
    public boolean g = false;

    public knz0(WeakReference weakReference) {
        exc0.j(weakReference, "GoogleApiClient reference must not be null");
        this.e = weakReference;
        com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) weakReference.get();
        this.f = new jnz0(this, cVar != null ? cVar.d() : Looper.getMainLooper());
    }

    public static final void e(qdg0 qdg0Var) {
        if (qdg0Var instanceof ftf0) {
            try {
                ((ftf0) qdg0Var).release();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(qdg0Var));
            }
        }
    }

    @Override // xsna.tdg0
    public final void a(qdg0 qdg0Var) {
        synchronized (this.c) {
            if (qdg0Var.getStatus().i()) {
            } else {
                d(qdg0Var.getStatus());
                e(qdg0Var);
            }
        }
    }

    @NonNull
    public final knz0 b(@NonNull wdg0 wdg0Var) {
        knz0 knz0Var;
        synchronized (this.c) {
            exc0.k("Cannot call then() twice.", true);
            knz0Var = new knz0(this.e);
            this.a = knz0Var;
            c();
        }
        return knz0Var;
    }

    public final void d(Status status) {
        synchronized (this.c) {
            this.d = status;
            synchronized (this.c) {
            }
        }
    }

    public final void c() {
    }
}
