package com.google.ar.core;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.ar.core.exceptions.FatalException;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes11.dex */
final class ad extends com.google.ar.core.dependencies.i {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ Activity b;
    final /* synthetic */ i c;
    final /* synthetic */ c0 d;

    public ad(i iVar, AtomicBoolean atomicBoolean, c0 c0Var, Activity activity) {
        this.a = atomicBoolean;
        this.d = c0Var;
        this.b = activity;
        this.c = iVar;
    }

    @Override // com.google.ar.core.dependencies.j
    public final void b(Bundle bundle) throws RemoteException {
        if (this.a.getAndSet(true)) {
        }
        int i = bundle.getInt("error.code", -100);
        int i2 = bundle.getInt("install.status", 0);
        if (i2 == 4) {
            this.d.a(w.c);
            return;
        }
        if (i != 0) {
            new StringBuilder(String.valueOf(i).length() + 40);
            i iVar = this.c;
            Activity activity = this.b;
            c0 c0Var = this.d;
            d0 d0Var = iVar.c;
            d0.e(activity, c0Var);
            return;
        }
        if (bundle.containsKey("resolution.intent")) {
            i iVar2 = this.c;
            Activity activity2 = this.b;
            c0 c0Var2 = this.d;
            d0 d0Var2 = iVar2.c;
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("resolution.intent");
            if (pendingIntent == null) {
                Log.e("ARCore-InstallService", "Did not get pending intent.");
                c0Var2.b(new FatalException("Installation intent failed to unparcel."));
                return;
            } else {
                try {
                    activity2.startIntentSenderForResult(pendingIntent.getIntentSender(), 1234, new Intent(activity2, activity2.getClass()), 0, 0, 0);
                    return;
                } catch (IntentSender.SendIntentException e) {
                    c0Var2.b(new FatalException("Installation Intent failed", e));
                    return;
                }
            }
        }
        if (i2 == 10) {
            this.d.b(new FatalException("Unexpected REQUIRES_UI_INTENT install status without an intent."));
            return;
        }
        switch (i2) {
            case 1:
            case 2:
            case 3:
                this.d.a(w.a);
                break;
            case 4:
                this.d.a(w.c);
                break;
            case 5:
                this.d.b(new FatalException("Unexpected FAILED install status without error."));
                break;
            case 6:
                this.d.a(w.b);
                break;
            default:
                this.d.b(new FatalException(a0.a(DerValue.tag_GeneralString, i2, "Unexpected install status: ")));
                break;
        }
    }

    @Override // com.google.ar.core.dependencies.j
    public final void c(Bundle bundle) throws RemoteException {
    }
}
