package com.google.android.gms.internal.appset;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import defpackage.mbs;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class b {
    public static b c;
    public final Context a;
    public final ExecutorService b;

    public b(Context context) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.b = Executors.newSingleThreadExecutor();
        this.a = context;
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(new mbs(12, this), 0L, 86400L, TimeUnit.SECONDS);
    }

    public static final SharedPreferences a(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void b(Context context) {
        if (a(context).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String valueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(valueOf) : new String("Failed to store app set ID last used time for App "));
        throw new zzk("Failed to store the app set ID last used time.");
    }
}
