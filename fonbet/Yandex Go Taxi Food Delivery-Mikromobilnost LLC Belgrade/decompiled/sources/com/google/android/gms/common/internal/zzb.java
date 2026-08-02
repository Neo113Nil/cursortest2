package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.common.zzg;
import defpackage.q391;
import defpackage.unr0;
import defpackage.z15;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzb extends zzg {
    final /* synthetic */ a zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(a aVar, Looper looper) {
        super(looper);
        Objects.requireNonNull(aVar);
        this.zza = aVar;
    }

    private static final void zza(Message message) {
        q391 q391Var = (q391) message.obj;
        if (q391Var != null) {
            q391Var.d();
        }
    }

    private static final boolean zzb(Message message) {
        int i = message.what;
        return i == 2 || i == 1 || i == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        a aVar = this.zza;
        if (aVar.U.get() != message.arg1) {
            if (zzb(message)) {
                zza(message);
                return;
            }
            return;
        }
        int i = message.what;
        if ((i == 1 || i == 7 || i == 4 || i == 5) && !aVar.isConnecting()) {
            zza(message);
            return;
        }
        int i2 = message.what;
        if (i2 == 4) {
            aVar.R = new ConnectionResult(message.arg2);
            if (!aVar.S && !TextUtils.isEmpty(aVar.j()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(aVar.j());
                    if (!aVar.S) {
                        aVar.r(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            ConnectionResult connectionResult = aVar.R;
            if (connectionResult == null) {
                connectionResult = new ConnectionResult(8);
            }
            aVar.H.a(connectionResult);
            aVar.n(connectionResult);
            return;
        }
        if (i2 == 5) {
            ConnectionResult connectionResult2 = aVar.R;
            if (connectionResult2 == null) {
                connectionResult2 = new ConnectionResult(8);
            }
            aVar.H.a(connectionResult2);
            aVar.n(connectionResult2);
            return;
        }
        if (i2 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            aVar.H.a(connectionResult3);
            aVar.n(connectionResult3);
            return;
        }
        if (i2 == 6) {
            aVar.r(5, null);
            z15 z15Var = aVar.M;
            if (z15Var != null) {
                z15Var.onConnectionSuspended(message.arg2);
            }
            aVar.o(message.arg2);
            aVar.q(5, 1, null);
            return;
        }
        if (i2 == 2 && !aVar.isConnected()) {
            zza(message);
        } else if (zzb(message)) {
            ((q391) message.obj).c();
        } else {
            int i3 = message.what;
            Log.wtf("GmsClient", unr0.m(i3, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i3).length() + 34)), new Exception());
        }
    }
}
