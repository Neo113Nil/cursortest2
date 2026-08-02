package xsna;

import android.app.Activity;
import com.vk.core.preference.Preference;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.ArrayList;

/* compiled from: InAppReviewVkGamesTriggerController.kt */
/* loaded from: classes11.dex */
public final class rrw {
    public static final bpn0 a = new bpn0(new jvg(3));
    public static boolean b;
    public static io.reactivex.rxjava3.disposables.c c;

    /* compiled from: InAppReviewVkGamesTriggerController.kt */
    /* loaded from: classes6.dex */
    public static final class b {
        public final ArrayList a = new ArrayList();

        public b() {
            Long[] n = Preference.n("vk_in_app_review_trigger_controller", "vk_games_3_last_close");
            int length = n.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                long longValue = n[i].longValue();
                if (i2 < 3) {
                    this.a.add(Long.valueOf(longValue));
                }
                i++;
                i2 = i3;
            }
        }
    }

    /* compiled from: InAppReviewVkGamesTriggerController.kt */
    public static final class a extends ja0 {
        public final EmptyDisposable b = EmptyDisposable.INSTANCE;

        @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            this.b.getClass();
        }

        @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
        }

        @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }
    }
}
