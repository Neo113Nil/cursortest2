package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;

/* loaded from: classes11.dex */
public final class l791 implements udy {
    public final Fragment a;
    public final IMapFragmentDelegate b;

    public l791(SupportMapFragment supportMapFragment, IMapFragmentDelegate iMapFragmentDelegate) {
        this.b = iMapFragmentDelegate;
        cvw.l(supportMapFragment);
        this.a = supportMapFragment;
    }

    @Override // defpackage.udy
    public final void a(Activity activity, Bundle bundle, Bundle bundle2) {
        GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
        try {
            Bundle bundle3 = new Bundle();
            qb91.g(bundle2, bundle3);
            this.b.onInflate(ObjectWrapper.wrap(activity), googleMapOptions, bundle3);
            qb91.g(bundle3, bundle2);
        } catch (RemoteException e) {
            su71.e(e);
        }
    }

    @Override // defpackage.udy
    public final void onCreate(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            qb91.g(bundle, bundle2);
            Bundle arguments = this.a.getArguments();
            if (arguments != null && arguments.containsKey("MapOptions")) {
                qb91.h(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
            }
            this.b.onCreate(bundle2);
            qb91.g(bundle2, bundle);
        } catch (RemoteException e) {
            su71.e(e);
        }
    }

    @Override // defpackage.udy
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            qb91.g(bundle, bundle2);
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
            try {
                IObjectWrapper onCreateView = this.b.onCreateView(ObjectWrapper.wrap(layoutInflater), ObjectWrapper.wrap(viewGroup), bundle2);
                StrictMode.setThreadPolicy(threadPolicy);
                qb91.g(bundle2, bundle);
                return (View) ObjectWrapper.unwrap(onCreateView);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (RemoteException e) {
            su71.e(e);
            return null;
        }
    }

    @Override // defpackage.udy
    public final void onDestroy() {
        try {
            this.b.onDestroy();
        } catch (RemoteException e) {
            su71.e(e);
        }
    }

    @Override // defpackage.udy
    public final void onDestroyView() {
        try {
            this.b.onDestroyView();
        } catch (RemoteException e) {
            su71.e(e);
        }
    }

    @Override // defpackage.udy
    public final void onLowMemory() {
        try {
            this.b.onLowMemory();
        } catch (RemoteException e) {
            su71.e(e);
        }
    }

    @Override // defpackage.udy
    public final void onPause() {
        try {
            this.b.onPause();
        } catch (RemoteException e) {
            su71.e(e);
        }
    }

    @Override // defpackage.udy
    public final void onResume() {
        try {
            this.b.onResume();
        } catch (RemoteException e) {
            su71.e(e);
        }
    }

    @Override // defpackage.udy
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            qb91.g(bundle, bundle2);
            this.b.onSaveInstanceState(bundle2);
            qb91.g(bundle2, bundle);
        } catch (RemoteException e) {
            su71.e(e);
        }
    }

    @Override // defpackage.udy
    public final void onStart() {
        try {
            this.b.onStart();
        } catch (RemoteException e) {
            su71.e(e);
        }
    }

    @Override // defpackage.udy
    public final void onStop() {
        try {
            this.b.onStop();
        } catch (RemoteException e) {
            su71.e(e);
        }
    }
}
