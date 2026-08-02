package com.google.android.gms.internal.gcm;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import defpackage.gma1;

/* loaded from: classes11.dex */
public class zzj extends Handler {
    private static volatile gma1 zzdj;

    public zzj() {
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        super.dispatchMessage(message);
    }

    public zzj(Looper looper) {
        super(looper);
    }

    public zzj(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }
}
