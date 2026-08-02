package xsna;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.vk.voip.VoipCallActivity;
import com.vk.voip.ui.picture_in_picture.overlay.PictureInPictureOverlayService;

/* compiled from: PictureInPictureOverlayLauncher.kt */
/* loaded from: classes7.dex */
public final class aka0 {
    public final VoipCallActivity a;
    public final gvw0 b;
    public final a c;
    public boolean d;

    /* compiled from: PictureInPictureOverlayLauncher.kt */
    public static final class b {
        public final nij a;
        public final gzs<s3q0> b;

        public b(boolean z, nij nijVar, gzs gzsVar) {
            this.a = nijVar;
            this.b = gzsVar;
        }
    }

    public aka0(VoipCallActivity voipCallActivity) {
        this.a = voipCallActivity;
        this.b = new gvw0(voipCallActivity, null);
        a aVar = new a();
        this.c = aVar;
        voipCallActivity.getApplication().registerActivityLifecycleCallbacks(aVar);
    }

    public final void a(b bVar) {
        boolean z;
        int i = PictureInPictureOverlayService.g;
        VoipCallActivity voipCallActivity = this.a;
        try {
            Intent intent = new Intent(voipCallActivity, (Class<?>) PictureInPictureOverlayService.class);
            intent.putExtra("auto_stop_when_activity_launched", VoipCallActivity.class.getCanonicalName());
            voipCallActivity.startService(intent);
            z = true;
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.q(th);
            z = false;
        }
        if (z) {
            bVar.a.invoke();
        }
        gzs<s3q0> gzsVar = bVar.b;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        if (z) {
            voipCallActivity.finish();
        }
    }

    /* compiled from: PictureInPictureOverlayLauncher.kt */
    public final class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            aka0 aka0Var = aka0.this;
            VoipCallActivity voipCallActivity = aka0Var.a;
            if (!voipCallActivity.equals(activity) || aka0Var.d) {
                return;
            }
            voipCallActivity.getApplication().unregisterActivityLifecycleCallbacks(aka0Var.c);
            aka0Var.d = true;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
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
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
