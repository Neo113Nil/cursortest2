package com.google.ar.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes11.dex */
final class ac extends BroadcastReceiver {
    final /* synthetic */ c0 a;

    public ac(c0 c0Var) {
        this.a = c0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Bundle extras = intent.getExtras();
        if ("com.google.android.play.core.install.ACTION_INSTALL_STATUS".equals(action) && extras != null && extras.containsKey("install.status")) {
            int i = extras.getInt("install.status");
            if (i == 1 || i == 2 || i == 3) {
                this.a.a(w.a);
            } else if (i == 4) {
                this.a.a(w.c);
            } else {
                if (i != 6) {
                    return;
                }
                this.a.a(w.b);
            }
        }
    }
}
