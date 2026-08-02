package com.google.firebase.messaging;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.e;
import defpackage.c32;
import defpackage.d32;
import defpackage.ji91;
import defpackage.lz10;
import defpackage.nc91;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
class FcmLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    private static final int RECENTLY_LOGGED_MESSAGE_IDS_MAX_SIZE = 10;
    private final Queue<String> recentlyLoggedMessageIds = new ArrayDeque(10);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: logNotificationOpen, reason: merged with bridge method [inline-methods] */
    public void lambda$onActivityCreated$0(Intent intent) {
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    if (this.recentlyLoggedMessageIds.contains(string)) {
                        return;
                    } else {
                        this.recentlyLoggedMessageIds.add(string);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException unused) {
        }
        if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    c32 c32Var = (c32) com.google.firebase.a.d().b(c32.class);
                    Log.isLoggable("FirebaseMessaging", 3);
                    if (c32Var != null) {
                        String string2 = bundle.getString("google.c.a.c_id");
                        d32 d32Var = (d32) c32Var;
                        if (!nc91.c.contains("fcm")) {
                            e eVar = (e) d32Var.a.a;
                            eVar.a(new ji91(eVar, string2, 0));
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("source", "Firebase");
                        bundle2.putString("medium", "notification");
                        bundle2.putString("campaign", string2);
                        d32Var.a("fcm", "_cmp", bundle2);
                    }
                } else {
                    Log.isLoggable("FirebaseMessaging", 3);
                }
            }
            lz10.c(bundle, "_no");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        lambda$onActivityCreated$0(intent);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
