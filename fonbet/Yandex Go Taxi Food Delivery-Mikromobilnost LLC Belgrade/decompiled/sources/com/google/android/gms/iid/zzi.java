package com.google.android.gms.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import defpackage.bx91;
import defpackage.ny61;
import defpackage.uqs;

/* loaded from: classes11.dex */
public final class zzi extends Binder {
    private final zze zzbm;

    public zzi(zze zzeVar) {
        this.zzbm = zzeVar;
    }

    public final void zzd(bx91 bx91Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            ny61.z("Binding only allowed within app");
            return;
        }
        Log.isLoggable("EnhancedIntentService", 3);
        Log.isLoggable("EnhancedIntentService", 3);
        this.zzbm.zzbb.execute(new uqs(this, bx91Var, false, 24));
    }
}
