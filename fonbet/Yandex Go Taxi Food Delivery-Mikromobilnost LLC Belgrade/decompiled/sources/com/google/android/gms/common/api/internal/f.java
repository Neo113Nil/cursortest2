package com.google.android.gms.common.api.internal;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import defpackage.a091;
import defpackage.c091;
import defpackage.cvw;
import defpackage.dey;
import defpackage.qy81;

/* loaded from: classes11.dex */
public final class f implements Runnable {
    public final a091 a;
    public final /* synthetic */ zap b;

    public f(zap zapVar, a091 a091Var) {
        this.b = zapVar;
        this.a = a091Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.zaa) {
            ConnectionResult connectionResult = this.a.b;
            boolean hasResolution = connectionResult.hasResolution();
            zap zapVar = this.b;
            if (hasResolution) {
                dey deyVar = zapVar.mLifecycleFragment;
                Activity activity = zapVar.getActivity();
                PendingIntent resolution = connectionResult.getResolution();
                cvw.l(resolution);
                deyVar.startActivityForResult(GoogleApiActivity.zaa(activity, resolution, this.a.a, false), 1);
                return;
            }
            if (zapVar.zac.b(zapVar.getActivity(), connectionResult.getErrorCode(), null) != null) {
                zap zapVar2 = this.b;
                zapVar2.zac.j(zapVar2.getActivity(), zapVar2.mLifecycleFragment, connectionResult.getErrorCode(), this.b);
                return;
            }
            int errorCode = connectionResult.getErrorCode();
            zap zapVar3 = this.b;
            if (errorCode != 18) {
                zapVar3.zaa(connectionResult, this.a.a);
                return;
            }
            com.google.android.gms.common.a aVar = zapVar3.zac;
            Activity activity2 = zapVar3.getActivity();
            aVar.getClass();
            ProgressBar progressBar = new ProgressBar(activity2, null, R.attr.progressBarStyleLarge);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(activity2);
            builder.setView(progressBar);
            builder.setMessage(qy81.c(18, activity2));
            builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
            AlertDialog create = builder.create();
            com.google.android.gms.common.a.h(activity2, create, "GooglePlayServicesUpdatingDialog", zapVar3);
            zap zapVar4 = this.b;
            Context applicationContext = zapVar4.getActivity().getApplicationContext();
            c091 c091Var = new c091(this, create);
            zapVar4.zac.getClass();
            com.google.android.gms.common.a.g(applicationContext, c091Var);
        }
    }
}
