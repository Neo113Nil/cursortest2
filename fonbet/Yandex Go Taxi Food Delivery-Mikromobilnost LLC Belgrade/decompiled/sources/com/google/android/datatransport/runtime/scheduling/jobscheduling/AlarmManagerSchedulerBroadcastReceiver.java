package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import defpackage.a94;
import defpackage.i3f0;
import defpackage.ny61;
import defpackage.td21;
import defpackage.v111;
import defpackage.wd21;
import defpackage.z811;
import defpackage.zi;

/* loaded from: classes10.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onReceive$0() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        z811.b(context);
        a94 a = v111.a();
        if (queryParameter == null) {
            ny61.t("Null backendName");
            return;
        }
        a.a = queryParameter;
        a.c = i3f0.b(intValue);
        if (queryParameter2 != null) {
            a.b = Base64.decode(queryParameter2, 0);
        }
        wd21 wd21Var = z811.a().d;
        wd21Var.e.execute(new td21(wd21Var, a.a(), i, new zi(3)));
    }
}
