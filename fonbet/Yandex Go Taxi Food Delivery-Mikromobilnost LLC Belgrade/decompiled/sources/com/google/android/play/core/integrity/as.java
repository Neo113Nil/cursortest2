package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.integrity.internal.e;
import com.google.android.play.integrity.internal.q;
import defpackage.atx0;
import defpackage.em71;
import defpackage.sa81;
import defpackage.vms;

/* loaded from: classes11.dex */
final class as extends q {
    final atx0 a;
    final e b;
    private final sa81 c = new sa81("RequestDialogCallbackImpl");
    private final String d;
    private final em71 e;
    private final Activity f;

    public as(Context context, em71 em71Var, Activity activity, atx0 atx0Var, e eVar) {
        this.d = context.getPackageName();
        this.e = em71Var;
        this.a = atx0Var;
        this.f = activity;
        this.b = eVar;
    }

    @Override // com.google.android.play.integrity.internal.q, com.google.android.play.integrity.internal.r
    public final void b(Bundle bundle) {
        this.b.c(this.a);
        this.c.a("onRequestDialog(%s)", this.d);
        ((vms) this.e).getClass();
        int i = bundle.getInt("error");
        IntegrityServiceException integrityServiceException = i != 0 ? new IntegrityServiceException(i, null) : null;
        if (integrityServiceException != null) {
            this.a.b(integrityServiceException);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            sa81 sa81Var = this.c;
            Object[] objArr = {this.d};
            sa81Var.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", sa81.b(sa81Var.a, "onRequestDialog(%s): got null dialog intent", objArr));
            }
            this.a.c(0);
            return;
        }
        Intent intent = new Intent(this.f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ar(this, this.b.a()));
        sa81 sa81Var2 = this.c;
        Object[] objArr2 = new Object[0];
        sa81Var2.getClass();
        if (Log.isLoggable("PlayCore", 3)) {
            sa81.b(sa81Var2.a, "Starting dialog intent...", objArr2);
        }
        this.f.startActivityForResult(intent, 0);
    }
}
