package xsna;

import android.content.ComponentName;
import android.content.Context;
import com.vk.push.pushsdk.ipc.PushService;
import com.vk.push.pushsdk.masterhost.MasterSelectionService;

/* compiled from: EnableAllServicesUseCase.kt */
/* loaded from: classes5.dex */
public final class gip {
    public final uri0 a;

    public gip(uri0 uri0Var) {
        this.a = uri0Var;
    }

    public final void a() {
        Context context = (Context) this.a.a.a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) PushService.class), 1, 1);
        } catch (RuntimeException unused) {
        }
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) MasterSelectionService.class), 1, 1);
        } catch (RuntimeException unused2) {
        }
    }
}
