package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.ay81;
import defpackage.cvw;
import defpackage.oz60;
import defpackage.q491;
import defpackage.qb91;
import defpackage.su71;
import defpackage.udy;

/* loaded from: classes11.dex */
public class MapFragment extends Fragment {
    private final a zza = new a(this);

    public static MapFragment newInstance(GoogleMapOptions googleMapOptions) {
        MapFragment mapFragment = new MapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        mapFragment.setArguments(bundle);
        return mapFragment;
    }

    public void getMapAsync(oz60 oz60Var) {
        cvw.h("getMapAsync must be called on the main thread.");
        cvw.m(oz60Var, "callback must not be null.");
        a aVar = this.zza;
        udy udyVar = aVar.a;
        if (udyVar == null) {
            aVar.h.add(oz60Var);
            return;
        }
        q491 q491Var = (q491) udyVar;
        try {
            q491Var.b.getMapAsync(new zzac(q491Var, null));
        } catch (RemoteException e) {
            su71.e(e);
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        ClassLoader classLoader = MapFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onActivityCreated(bundle);
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        a aVar = this.zza;
        aVar.g = activity;
        aVar.n();
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.zza.b(bundle);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout c = this.zza.c(layoutInflater, viewGroup, bundle);
        c.setClickable(true);
        return c;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        this.zza.d();
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        a aVar = this.zza;
        udy udyVar = aVar.a;
        if (udyVar != null) {
            udyVar.onDestroyView();
        } else {
            aVar.l(2);
        }
        super.onDestroyView();
    }

    public final void onEnterAmbient(Bundle bundle) {
        cvw.h("onEnterAmbient must be called on the main thread.");
        udy udyVar = this.zza.a;
        if (udyVar != null) {
            q491 q491Var = (q491) udyVar;
            q491Var.getClass();
            try {
                Bundle bundle2 = new Bundle();
                qb91.g(bundle, bundle2);
                q491Var.b.onEnterAmbient(bundle2);
                qb91.g(bundle2, bundle);
            } catch (RemoteException e) {
                su71.e(e);
            }
        }
    }

    public final void onExitAmbient() {
        cvw.h("onExitAmbient must be called on the main thread.");
        udy udyVar = this.zza.a;
        if (udyVar != null) {
            q491 q491Var = (q491) udyVar;
            q491Var.getClass();
            try {
                q491Var.b.onExitAmbient();
            } catch (RemoteException e) {
                su71.e(e);
            }
        }
    }

    @Override // android.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            a aVar = this.zza;
            aVar.g = activity;
            aVar.n();
            GoogleMapOptions createFromAttributes = GoogleMapOptions.createFromAttributes(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", createFromAttributes);
            a aVar2 = this.zza;
            aVar2.getClass();
            aVar2.m(bundle, new ay81(aVar2, activity, bundle2, bundle));
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.zza.e();
        super.onLowMemory();
    }

    @Override // android.app.Fragment
    public void onPause() {
        this.zza.f();
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.zza.g();
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        ClassLoader classLoader = MapFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onSaveInstanceState(bundle);
        this.zza.h(bundle);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.zza.i();
    }

    @Override // android.app.Fragment
    public void onStop() {
        this.zza.j();
        super.onStop();
    }

    @Override // android.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }

    public static MapFragment newInstance() {
        return new MapFragment();
    }
}
