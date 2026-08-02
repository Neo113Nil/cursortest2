package xsna;

import android.content.ComponentName;
import android.content.Context;
import com.vk.push.authsdk.ipc.AuthService;
import com.vk.push.common.Logger;

/* compiled from: DisableAllServicesUseCase.kt */
/* loaded from: classes.dex */
public final class yzm {
    public final vri0 a;

    public yzm(vri0 vri0Var) {
        this.a = vri0Var;
    }

    public final void a() {
        tri0 tri0Var = this.a.a;
        Context context = tri0Var.a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) AuthService.class), 2, 1);
        } catch (RuntimeException unused) {
        }
        Logger.DefaultImpls.warn$default(tri0Var.b, "Auth push host sdk is disabled. No work is happening", null, 2, null);
    }
}
