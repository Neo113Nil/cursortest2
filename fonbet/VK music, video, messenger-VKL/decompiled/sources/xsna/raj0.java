package xsna;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: SharedPreferencesQueue.java */
/* loaded from: classes.dex */
public final class raj0 {
    public final SharedPreferences a;
    public final ScheduledThreadPoolExecutor e;
    public final ArrayDeque<String> d = new ArrayDeque<>();
    public final String b = "topic_operation_queue";
    public final String c = StringUtils.COMMA;

    public raj0(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.a = sharedPreferences;
        this.e = scheduledThreadPoolExecutor;
    }

    public static raj0 a(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        raj0 raj0Var = new raj0(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (raj0Var.d) {
            try {
                raj0Var.d.clear();
                String string = raj0Var.a.getString(raj0Var.b, "");
                if (!TextUtils.isEmpty(string) && string.contains(raj0Var.c)) {
                    String[] split = string.split(raj0Var.c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            raj0Var.d.add(str);
                        }
                    }
                    return raj0Var;
                }
                return raj0Var;
            } finally {
            }
        }
    }
}
