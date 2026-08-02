package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import defpackage.cvw;
import defpackage.dey;
import defpackage.hdy;
import defpackage.ny61;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class b {
    protected final dey mLifecycleFragment;

    public b(dey deyVar) {
        this.mLifecycleFragment = deyVar;
    }

    public static dey getFragment(hdy hdyVar) {
        if (hdyVar.a()) {
            return zzd.zza(hdyVar.d());
        }
        if (hdyVar.b()) {
            return zza.zza(hdyVar.c());
        }
        ny61.g("Can't get fragment for unexpected activity.");
        return null;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        Activity lifecycleActivity = this.mLifecycleFragment.getLifecycleActivity();
        cvw.l(lifecycleActivity);
        return lifecycleActivity;
    }

    public abstract void onActivityResult(int i, int i2, Intent intent);

    public abstract void onCreate(Bundle bundle);

    public void onDestroy() {
    }

    public void onResume() {
    }

    public abstract void onSaveInstanceState(Bundle bundle);

    public abstract void onStart();

    public abstract void onStop();

    public static dey getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    public static dey getFragment(Activity activity) {
        return getFragment(new hdy(activity));
    }
}
