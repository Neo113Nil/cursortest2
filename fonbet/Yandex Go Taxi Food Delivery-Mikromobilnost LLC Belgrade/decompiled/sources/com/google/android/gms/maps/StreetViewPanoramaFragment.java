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
import defpackage.ay81;
import defpackage.cvw;
import defpackage.p691;
import defpackage.s070;
import defpackage.su71;
import defpackage.udy;

/* loaded from: classes11.dex */
public class StreetViewPanoramaFragment extends Fragment {
    private final c zza = new c(this);

    public static StreetViewPanoramaFragment newInstance(StreetViewPanoramaOptions streetViewPanoramaOptions) {
        StreetViewPanoramaFragment streetViewPanoramaFragment = new StreetViewPanoramaFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("StreetViewPanoramaOptions", streetViewPanoramaOptions);
        streetViewPanoramaFragment.setArguments(bundle);
        return streetViewPanoramaFragment;
    }

    public void getStreetViewPanoramaAsync(s070 s070Var) {
        cvw.h("getStreetViewPanoramaAsync() must be called on the main thread");
        cvw.m(s070Var, "callback must not be null.");
        c cVar = this.zza;
        udy udyVar = cVar.a;
        if (udyVar == null) {
            cVar.h.add(s070Var);
            return;
        }
        p691 p691Var = (p691) udyVar;
        try {
            p691Var.b.getStreetViewPanoramaAsync(new zzam(p691Var, null));
        } catch (RemoteException e) {
            su71.e(e);
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        ClassLoader classLoader = StreetViewPanoramaFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onActivityCreated(bundle);
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        c cVar = this.zza;
        cVar.g = activity;
        cVar.n();
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.zza.b(bundle);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.zza.c(layoutInflater, viewGroup, bundle);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        this.zza.d();
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        c cVar = this.zza;
        udy udyVar = cVar.a;
        if (udyVar != null) {
            udyVar.onDestroyView();
        } else {
            cVar.l(2);
        }
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            c cVar = this.zza;
            cVar.g = activity;
            cVar.n();
            Bundle bundle2 = new Bundle();
            c cVar2 = this.zza;
            cVar2.getClass();
            cVar2.m(bundle, new ay81(cVar2, activity, bundle2, bundle));
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
        ClassLoader classLoader = StreetViewPanoramaFragment.class.getClassLoader();
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

    public static StreetViewPanoramaFragment newInstance() {
        return new StreetViewPanoramaFragment();
    }
}
