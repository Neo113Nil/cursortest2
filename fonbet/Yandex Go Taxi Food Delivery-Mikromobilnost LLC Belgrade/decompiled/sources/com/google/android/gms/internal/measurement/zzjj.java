package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import defpackage.xia1;
import java.util.Objects;

/* loaded from: classes11.dex */
final class zzjj extends ContentObserver {
    final /* synthetic */ xia1 zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjj(xia1 xia1Var, Handler handler) {
        super(null);
        Objects.requireNonNull(xia1Var);
        this.zza = xia1Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.zza.a.set(true);
    }
}
