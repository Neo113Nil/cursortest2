package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import com.vk.biometrics.lock.api.domain.model.PinLockLaunchMode;
import com.vk.biometrics.lock.impl.presentation.base.mvi.onboarding.BiometricsLockOnboardingFragment;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.BiometricsLockPinFragment;
import com.vk.biometrics.lock.impl.presentation.base.mvi.settings.BiometricsLockSettingsFragment;
import com.vk.biometrics.lock.impl.presentation.base.mvi.setup.BiometricsLockSecuritySetupFragment;
import java.util.Iterator;

/* compiled from: BiometricsLockRouterImpl.kt */
/* loaded from: classes.dex */
public final class d87 implements b87 {
    @Override // xsna.b87
    public final void a(Context context) {
        new oz50(BiometricsLockSettingsFragment.class, null, new Bundle()).k(context);
    }

    @Override // xsna.b87
    public final void b(Context context) {
        new oz50(BiometricsLockOnboardingFragment.class, null, null).k(context);
    }

    @Override // xsna.b87
    public final void c(Context context) {
        Object obj;
        Intent intent;
        Object next;
        String str;
        if (gz80.a(30)) {
            intent = new Intent("android.settings.BIOMETRIC_ENROLL");
            intent.putExtra("android.provider.extra.BIOMETRIC_AUTHENTICATORS_ALLOWED", 15);
        } else {
            Iterator<Object> it = new bli0(new c87()).iterator();
            do {
                vki0 vki0Var = (vki0) it;
                obj = null;
                if (!vki0Var.hasNext()) {
                    break;
                }
                next = vki0Var.next();
                ActivityInfo resolveActivityInfo = ((Intent) next).resolveActivityInfo(context.getPackageManager(), 65536);
                str = resolveActivityInfo != null ? resolveActivityInfo.permission : null;
                if (str == null) {
                    break;
                }
            } while (!enj.l(context, str));
            obj = next;
            intent = (Intent) obj;
            if (intent == null) {
                intent = new Intent("android.settings.SECURITY_SETTINGS");
            }
        }
        context.startActivity(intent);
    }

    @Override // xsna.b87
    public final void d(Context context) {
        new oz50(BiometricsLockSecuritySetupFragment.class, null, null).k(context);
    }

    @Override // xsna.b87
    public final void e(Context context, PinLockLaunchMode pinLockLaunchMode) {
        Bundle bundle = new Bundle();
        bundle.putInt("PIN_LOCK_LAUNCH_MODE_KEY", pinLockLaunchMode.h());
        new oz50(BiometricsLockPinFragment.class, null, bundle).k(context);
    }
}
