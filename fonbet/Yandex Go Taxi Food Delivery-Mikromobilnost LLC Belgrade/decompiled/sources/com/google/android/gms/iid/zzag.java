package com.google.android.gms.iid;

import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.gcm.zzj;
import defpackage.z491;

/* loaded from: classes11.dex */
final class zzag extends zzj {
    private final /* synthetic */ z491 zzdc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzag(z491 z491Var, Looper looper) {
        super(looper);
        this.zzdc = z491Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        z491 z491Var = this.zzdc;
        z491Var.getClass();
        if (message == null) {
            return;
        }
        Object obj = message.obj;
        if (obj instanceof Intent) {
            Intent intent = (Intent) obj;
            intent.setExtrasClassLoader(MessengerCompat.class.getClassLoader());
            if (intent.hasExtra("google.messenger")) {
                intent.getParcelableExtra("google.messenger");
            }
            z491Var.c((Intent) message.obj);
        }
    }
}
