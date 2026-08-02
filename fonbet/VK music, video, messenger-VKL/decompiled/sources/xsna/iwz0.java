package xsna;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
@VisibleForTesting
/* loaded from: classes13.dex */
public final class iwz0 implements l4z {
    public final ViewGroup a;
    public final nnv b;
    public View c;

    public iwz0(km00 km00Var, nnv nnvVar) {
        this.b = nnvVar;
        exc0.i(km00Var);
        this.a = km00Var;
    }

    @Override // xsna.l4z
    public final void a(Activity activity, Bundle bundle, @Nullable Bundle bundle2) {
        throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
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
        throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
    }

    @Override // xsna.l4z
    public final void onCreate(@Nullable Bundle bundle) {
        ViewGroup viewGroup = this.a;
        nnv nnvVar = this.b;
        try {
            Bundle bundle2 = new Bundle();
            t401.b(bundle, bundle2);
            nnvVar.onCreate(bundle2);
            t401.b(bundle2, bundle);
            this.c = (View) bq70.g(nnvVar.getView());
            viewGroup.removeAllViews();
            viewGroup.addView(this.c);
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
        throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
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
