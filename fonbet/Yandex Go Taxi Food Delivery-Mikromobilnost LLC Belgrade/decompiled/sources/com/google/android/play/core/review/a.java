package com.google.android.play.core.review;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.zzw;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import defpackage.atx0;
import defpackage.faa1;
import defpackage.udq0;

/* loaded from: classes11.dex */
public final class a {
    public final faa1 a;
    public final Handler b = new Handler(Looper.getMainLooper());

    public a(faa1 faa1Var) {
        this.a = faa1Var;
    }

    public final zzw a(Activity activity, ReviewInfo reviewInfo) {
        if (reviewInfo.zzb()) {
            return udq0.p(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.zza());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        atx0 atx0Var = new atx0();
        intent.putExtra("result_receiver", new zzc(this, this.b, atx0Var));
        activity.startActivity(intent);
        return atx0Var.a;
    }
}
