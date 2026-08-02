package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import defpackage.dey;
import defpackage.lc91;
import defpackage.ny61;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes11.dex */
public final class zzd extends Fragment implements dey {
    private static final WeakHashMap zza = new WeakHashMap();
    private final lc91 zzb = new lc91();

    public static zzd zza(FragmentActivity fragmentActivity) {
        zzd zzdVar;
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        WeakHashMap weakHashMap = zza;
        WeakReference weakReference = (WeakReference) weakHashMap.get(fragmentActivity);
        if (weakReference != null && (zzdVar = (zzd) weakReference.get()) != null) {
            return zzdVar;
        }
        try {
            zzd zzdVar2 = (zzd) supportFragmentManager.F("SLifecycleFragmentImpl");
            if (zzdVar2 == null || zzdVar2.isRemoving()) {
                zzdVar2 = new zzd();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.f(0, zzdVar2, "SLifecycleFragmentImpl", 1);
                aVar.l(true, true);
            }
            weakHashMap.put(fragmentActivity, new WeakReference(zzdVar2));
            return zzdVar2;
        } catch (ClassCastException e) {
            ny61.h("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
            return null;
        }
    }

    @Override // defpackage.dey
    public final void addCallback(String str, b bVar) {
        this.zzb.a(str, bVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.zzb.a.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // defpackage.dey
    public final <T extends b> T getCallbackOrNull(String str, Class<T> cls) {
        return cls.cast(this.zzb.a.get(str));
    }

    @Override // defpackage.dey
    public final Activity getLifecycleActivity() {
        return getActivity();
    }

    public final boolean isCreated() {
        return this.zzb.b > 0;
    }

    public final boolean isStarted() {
        return this.zzb.b >= 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = this.zzb.a.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.zzb.b(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        lc91 lc91Var = this.zzb;
        lc91Var.b = 5;
        Iterator it = lc91Var.a.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).onDestroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        lc91 lc91Var = this.zzb;
        lc91Var.b = 3;
        Iterator it = lc91Var.a.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.zzb.c(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        lc91 lc91Var = this.zzb;
        lc91Var.b = 2;
        Iterator it = lc91Var.a.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        lc91 lc91Var = this.zzb;
        lc91Var.b = 4;
        Iterator it = lc91Var.a.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).onStop();
        }
    }
}
