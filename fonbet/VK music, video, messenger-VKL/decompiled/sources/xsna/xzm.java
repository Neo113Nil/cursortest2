package xsna;

import android.content.ComponentName;
import android.content.Context;
import com.vk.push.common.Logger;
import com.vk.push.pushsdk.ipc.ForegroundPushService;
import com.vk.push.pushsdk.ipc.PushService;
import com.vk.push.pushsdk.masterhost.MasterSelectionService;

/* compiled from: DisableAllServicesUseCase.kt */
/* loaded from: classes.dex */
public final class xzm {
    public final uri0 a;

    public xzm(uri0 uri0Var) {
        this.a = uri0Var;
    }

    public final void a() {
        fpz fpzVar = this.a.a;
        Context context = (Context) fpzVar.a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) PushService.class), 2, 1);
        } catch (RuntimeException unused) {
        }
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) ForegroundPushService.class), 2, 1);
        } catch (RuntimeException unused2) {
        }
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) MasterSelectionService.class), 2, 1);
        } catch (RuntimeException unused3) {
        }
        Logger.DefaultImpls.warn$default((Logger) fpzVar.b, "Push provider host sdk is disabled. No work is happening", null, 2, null);
    }
}
