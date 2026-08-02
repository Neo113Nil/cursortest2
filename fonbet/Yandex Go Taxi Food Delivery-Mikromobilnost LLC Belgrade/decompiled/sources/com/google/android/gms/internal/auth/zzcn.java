package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;
import defpackage.rh91;
import defpackage.ue91;

/* loaded from: classes11.dex */
final class zzcn extends ContentObserver {
    public zzcn(ue91 ue91Var, Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        rh91.a.incrementAndGet();
    }
}
