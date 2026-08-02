package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.push.pushsdk.ipc.ForegroundPushService;
import com.vk.push.pushsdk.ipc.PushService;
import com.vk.push.pushsdk.masterhost.MasterSelectionService;

/* compiled from: StopAllServicesUseCase.kt */
/* loaded from: classes5.dex */
public final class yfl0 {
    public final msi0 a;

    public yfl0(msi0 msi0Var) {
        this.a = msi0Var;
    }

    public final void a(f5w0 f5w0Var) {
        Context context = (Context) this.a.a.b;
        Intent intent = new Intent(context, (Class<?>) ForegroundPushService.class);
        Intent intent2 = new Intent(context, (Class<?>) PushService.class);
        Intent intent3 = new Intent(context, (Class<?>) MasterSelectionService.class);
        context.stopService(intent);
        context.stopService(intent2);
        f5w0Var.invoke();
        context.stopService(intent3);
    }
}
