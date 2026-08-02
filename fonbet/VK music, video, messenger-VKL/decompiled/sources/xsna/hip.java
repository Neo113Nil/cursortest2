package xsna;

import android.content.ComponentName;
import android.content.Context;
import com.vk.push.authsdk.ipc.AuthService;

/* compiled from: EnableAllServicesUseCase.kt */
/* loaded from: classes5.dex */
public final class hip {
    public final vri0 a;

    public hip(vri0 vri0Var) {
        this.a = vri0Var;
    }

    public final void a() {
        Context context = this.a.a.a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) AuthService.class), 1, 1);
        } catch (RuntimeException unused) {
        }
    }
}
