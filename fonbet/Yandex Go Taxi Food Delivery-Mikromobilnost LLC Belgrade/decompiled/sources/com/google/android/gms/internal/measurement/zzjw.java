package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import defpackage.cna1;
import java.util.Objects;

/* loaded from: classes11.dex */
final class zzjw extends ContentObserver {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjw(v0 v0Var, Handler handler) {
        super(null);
        Objects.requireNonNull(v0Var);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        cna1.i.incrementAndGet();
    }
}
