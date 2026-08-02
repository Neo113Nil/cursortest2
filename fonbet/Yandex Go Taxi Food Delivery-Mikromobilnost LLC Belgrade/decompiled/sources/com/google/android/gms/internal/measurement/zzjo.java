package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import defpackage.b64;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzjo extends ContentObserver {
    final /* synthetic */ t0 zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjo(t0 t0Var, Handler handler) {
        super(null);
        Objects.requireNonNull(t0Var);
        this.zza = t0Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        t0 t0Var = this.zza;
        synchronized (t0Var.f) {
            t0Var.g = null;
            t0Var.c.run();
        }
        synchronized (t0Var) {
            try {
                Iterator it = t0Var.h.iterator();
                if (it.hasNext()) {
                    b64.D(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
