package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import androidx.activity.result.IntentSenderRequest;
import defpackage.m50;

/* loaded from: classes11.dex */
final class zac implements DialogInterface.OnClickListener {
    final /* synthetic */ Activity zaa;
    final /* synthetic */ int zab;
    final /* synthetic */ m50 zac;
    final /* synthetic */ a zad;

    public zac(a aVar, Activity activity, int i, m50 m50Var) {
        this.zad = aVar;
        this.zaa = activity;
        this.zab = i;
        this.zac = m50Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        PendingIntent c = this.zad.c(this.zaa, this.zab, null);
        if (c == null) {
            return;
        }
        this.zac.a(new IntentSenderRequest(c.getIntentSender(), null, 0, 0));
    }
}
