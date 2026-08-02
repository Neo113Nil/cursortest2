package com.yandex.passport.internal.ui.autologin;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.w;
import defpackage.oey;
import defpackage.sls;

/* loaded from: classes2.dex */
public final class e implements oey {
    public final long a;
    public final long b;
    public final sls w;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final d x = new d(0, this);

    public e(AppCompatActivity appCompatActivity, Bundle bundle, sls slsVar, long j) {
        this.w = slsVar;
        this.b = j;
        if (bundle == null) {
            this.a = SystemClock.elapsedRealtime();
        } else {
            this.a = bundle.getLong("create_time", SystemClock.elapsedRealtime());
        }
        appCompatActivity.getLifecycle().a(this);
    }

    @w(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        this.c.removeCallbacks(this.x);
    }

    @w(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        this.c.postDelayed(this.x, this.b - (SystemClock.elapsedRealtime() - this.a));
    }
}
