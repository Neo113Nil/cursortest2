package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import defpackage.ay81;
import defpackage.cvw;
import defpackage.l791;
import defpackage.oz60;
import defpackage.qb91;
import defpackage.su71;
import defpackage.udy;

/* loaded from: classes11.dex */
public class SupportMapFragment extends Fragment {
    private final e zza = new e(this);

    public static SupportMapFragment newInstance(GoogleMapOptions googleMapOptions) {
        SupportMapFragment supportMapFragment = new SupportMapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        supportMapFragment.setArguments(bundle);
        return supportMapFragment;
    }

    public void getMapAsync(oz60 oz60Var) {
        cvw.h("getMapAsync must be called on the main thread.");
        cvw.m(oz60Var, "callback must not be null.");
        e eVar = this.zza;
        udy udyVar = eVar.a;
        if (udyVar == null) {
            eVar.h.add(oz60Var);
            return;
        }
        l791 l791Var = (l791) udyVar;
        try {
            l791Var.b.getMapAsync(new zzat(l791Var, null));
        } catch (RemoteException e) {
            su71.e(e);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        ClassLoader classLoader = SupportMapFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        e eVar = this.zza;
        eVar.g = activity;
        eVar.n();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onCreate(bundle);
            this.zza.b(bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout c = this.zza.c(layoutInflater, viewGroup, bundle);
        c.setClickable(true);
        return c;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.zza.d();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        e eVar = this.zza;
        udy udyVar = eVar.a;
        if (udyVar != null) {
            udyVar.onDestroyView();
        } else {
            eVar.l(2);
        }
        super.onDestroyView();
    }

    public final void onEnterAmbient(Bundle bundle) {
        cvw.h("onEnterAmbient must be called on the main thread.");
        udy udyVar = this.zza.a;
        if (udyVar != null) {
            l791 l791Var = (l791) udyVar;
            l791Var.getClass();
            try {
                Bundle bundle2 = new Bundle();
                qb91.g(bundle, bundle2);
                l791Var.b.onEnterAmbient(bundle2);
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
            l791 l791Var = (l791) udyVar;
            l791Var.getClass();
            try {
                l791Var.b.onExitAmbient();
            } catch (RemoteException e) {
                su71.e(e);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            e eVar = this.zza;
            eVar.g = activity;
            eVar.n();
            GoogleMapOptions createFromAttributes = GoogleMapOptions.createFromAttributes(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", createFromAttributes);
            e eVar2 = this.zza;
            eVar2.getClass();
            eVar2.m(bundle, new ay81(eVar2, activity, bundle2, bundle));
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.zza.e();
        super.onLowMemory();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        this.zza.f();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.zza.g();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        ClassLoader classLoader = SupportMapFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onSaveInstanceState(bundle);
        this.zza.h(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.zza.i();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        this.zza.j();
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }

    public static SupportMapFragment newInstance() {
        return new SupportMapFragment();
    }
}
