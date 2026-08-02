package xsna;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class s9u {
    public final dnv a;
    public b1y b;

    /* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
    public interface a {
        void onCancel();

        void onFinish();
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
    public interface b {
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
    public interface c {
        void a();
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
    public interface d {
        void a();
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
    public interface e {
        void f(@NonNull eo00 eo00Var);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
    public interface f {
        void a(@NonNull eo00 eo00Var);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
    public interface g {
        void a();
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
    public interface h {
        boolean e(@NonNull eo00 eo00Var);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
    public interface i {
    }

    public s9u(@NonNull dnv dnvVar) {
        exc0.i(dnvVar);
        this.a = dnvVar;
    }

    @Nullable
    public final eo00 a(@NonNull MarkerOptions markerOptions) {
        try {
            exc0.j(markerOptions, "MarkerOptions must not be null.");
            com.google.android.gms.internal.maps.zzx w = this.a.w(markerOptions);
            if (w != null) {
                return new eo00(w);
            }
            return null;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void b(@NonNull eo9 eo9Var) {
        try {
            this.a.d0((vnv) eo9Var.a);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void c(@NonNull eo9 eo9Var, int i2, @Nullable a aVar) {
        try {
            this.a.A1((vnv) eo9Var.a, i2, aVar == null ? null : new euz0(aVar));
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    @NonNull
    public final CameraPosition d() {
        try {
            return this.a.h();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    @NonNull
    public final cbb e() {
        try {
            return new cbb(this.a.H0(), 6);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    @NonNull
    public final b1y f() {
        try {
            if (this.b == null) {
                this.b = new b1y(this.a.I(), 10);
            }
            return this.b;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void g(@NonNull eo9 eo9Var) {
        try {
            this.a.O0((vnv) eo9Var.a);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void h(@Nullable d dVar) {
        try {
            this.a.L0(new vq01(dVar));
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void i(@Nullable g gVar) {
        dnv dnvVar = this.a;
        try {
            if (gVar == null) {
                dnvVar.n(null);
            } else {
                dnvVar.n(new ug01(gVar));
            }
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void j(@Nullable h hVar) {
        try {
            this.a.C1(new ssz0(hVar));
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }
}
