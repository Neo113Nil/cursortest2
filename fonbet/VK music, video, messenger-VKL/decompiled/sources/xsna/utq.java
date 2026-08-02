package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: FcmLifecycleCallbacks.java */
/* loaded from: classes.dex */
public final class utq implements Application.ActivityLifecycleCallbacks {
    public final Set<Intent> b = Collections.newSetFromMap(new WeakHashMap());

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @SuppressLint({"ThreadPoolCreation"})
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        ex1 ex1Var;
        Intent intent = activity.getIntent();
        if (intent == null || !this.b.add(intent)) {
            return;
        }
        Bundle bundle2 = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                bundle2 = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException unused) {
        }
        if (bundle2 == null ? false : "1".equals(bundle2.getString("google.c.a.e"))) {
            if (bundle2 != null && "1".equals(bundle2.getString("google.c.a.tc")) && (ex1Var = (ex1) vhr.d().b(ex1.class)) != null) {
                String string = bundle2.getString("google.c.a.c_id");
                ex1Var.f(string);
                Bundle bundle3 = new Bundle();
                bundle3.putString("source", "Firebase");
                bundle3.putString("medium", "notification");
                bundle3.putString(MBInterstitialActivity.INTENT_CAMAPIGN, string);
                ex1Var.d("fcm", "_cmp", bundle3);
            }
            ch20.a(bundle2, "_no");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.b.remove(activity.getIntent());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
