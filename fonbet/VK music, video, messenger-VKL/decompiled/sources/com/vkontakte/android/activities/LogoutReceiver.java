package com.vkontakte.android.activities;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.vk.log.L;
import java.lang.ref.WeakReference;
import xsna.anj;
import xsna.e43;
import xsna.hf8;
import xsna.lmg0;
import xsna.z23;

/* loaded from: classes11.dex */
public class LogoutReceiver extends BroadcastReceiver {

    @NonNull
    public final WeakReference<Activity> a;

    public LogoutReceiver(Activity activity) {
        this.a = new WeakReference<>(activity);
    }

    @NonNull
    public static LogoutReceiver a(Activity activity) {
        LogoutReceiver logoutReceiver = new LogoutReceiver(activity);
        anj.d(e43.a, logoutReceiver, z23.a("com.vkontakte.android.LOGOUT"), hf8.a, 4);
        return logoutReceiver;
    }

    public final void b() {
        try {
            e43.a.unregisterReceiver(this);
        } catch (Exception e) {
            L.i(e);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Activity activity = this.a.get();
        if (activity == null) {
            b();
        } else {
            if (!"com.vkontakte.android.LOGOUT".equals(intent.getAction()) || (activity instanceof lmg0)) {
                return;
            }
            activity.setResult(0);
            activity.finish();
        }
    }
}
