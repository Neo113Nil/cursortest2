package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;
import defpackage.ed91;

/* loaded from: classes11.dex */
final class zzca extends ContentObserver {
    public zzca(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        ed91.a.set(true);
    }
}
