package xsna;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
@VisibleForTesting
/* loaded from: classes13.dex */
public final class xzz0 implements l4z {
    public final Fragment a;
    public final mnv b;

    public xzz0(jin0 jin0Var, mnv mnvVar) {
        this.b = mnvVar;
        exc0.i(jin0Var);
        this.a = jin0Var;
    }

    @Override // xsna.l4z
    public final void a(Activity activity, Bundle bundle, @Nullable Bundle bundle2) {
        GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
        try {
            Bundle bundle3 = new Bundle();
            t401.b(bundle2, bundle3);
            this.b.X(new bq70(activity), googleMapOptions, bundle3);
            t401.b(bundle3, bundle2);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // xsna.l4z
    public final void b(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            t401.b(bundle, bundle2);
            this.b.b(bundle2);
            t401.b(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // xsna.l4z
    public final View c(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            t401.b(bundle, bundle2);
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
            try {
                vnv n1 = this.b.n1(new bq70(layoutInflater), new bq70(viewGroup), bundle2);
                StrictMode.setThreadPolicy(threadPolicy);
                t401.b(bundle2, bundle);
                return (View) bq70.g(n1);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // xsna.l4z
    public final void onCreate(@Nullable Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            t401.b(bundle, bundle2);
            Bundle arguments = this.a.getArguments();
            if (arguments != null && arguments.containsKey("MapOptions")) {
                t401.c(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
            }
            this.b.onCreate(bundle2);
            t401.b(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // xsna.l4z
    public final void onDestroy() {
        try {
            this.b.onDestroy();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // xsna.l4z
    public final void onDestroyView() {
        try {
            this.b.onDestroyView();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // xsna.l4z
    public final void onLowMemory() {
        try {
            this.b.onLowMemory();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // xsna.l4z
    public final void onPause() {
        try {
            this.b.onPause();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // xsna.l4z
    public final void onResume() {
        try {
            this.b.onResume();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // xsna.l4z
    public final void onStart() {
        try {
            this.b.onStart();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // xsna.l4z
    public final void onStop() {
        try {
            this.b.onStop();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
