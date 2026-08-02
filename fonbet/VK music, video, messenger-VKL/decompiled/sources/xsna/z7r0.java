package xsna;

import android.app.Activity;
import com.vk.biometrics.lock.impl.presentation.view.BiometricsPinLockActivity;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.pushes.PushOpenActivity;
import com.vkontakte.android.LinkRedirActivity;
import xsna.c63;

/* compiled from: VKApplication.kt */
/* loaded from: classes11.dex */
public final class z7r0 extends c63.b {
    public final /* synthetic */ v57 b;

    public z7r0(v57 v57Var) {
        this.b = v57Var;
    }

    @Override // xsna.c63.b
    public final void o(Activity activity) {
        if ((activity instanceof LinkRedirActivity) || (activity instanceof PushOpenActivity) || (activity instanceof BiometricsPinLockActivity)) {
            return;
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"BiometricsLock Activity: activity paused " + activity});
        }
        this.b.b();
    }

    @Override // xsna.c63.b
    public final void p(Activity activity) {
        if ((activity instanceof LinkRedirActivity) || (activity instanceof PushOpenActivity) || (activity instanceof BiometricsPinLockActivity)) {
            return;
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"BiometricsLock Activity: activity resumed " + activity});
        }
        this.b.i();
    }

    @Override // xsna.c63.b
    public final void r(Activity activity, boolean z) {
        if (z) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"BiometricsLock Activity: all activities stopped " + activity});
            }
            v57 v57Var = this.b;
            v57Var.c(true);
            v57Var.d();
        }
    }
}
