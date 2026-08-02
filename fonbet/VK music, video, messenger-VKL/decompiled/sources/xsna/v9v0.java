package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.vk.voip.VoipCallActivity;
import com.vk.voip.ui.VoipViewModelState;
import com.vkontakte.android.sync.online.VkOnlineService;
import java.util.concurrent.TimeUnit;
import xsna.c63;

/* compiled from: VkOnlineServiceManager.kt */
/* loaded from: classes11.dex */
public final class v9v0 extends c63.b {
    public static final v9v0 b = new v9v0();
    public static final Handler c = new Handler(Looper.getMainLooper());
    public static final bpn0 d = new bpn0(new y45(17));

    public static void D() {
        try {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            context.startService(new Intent(context, (Class<?>) VkOnlineService.class));
        } catch (IllegalStateException unused) {
            c.postDelayed(new Runnable() { // from class: xsna.u9v0
                @Override // java.lang.Runnable
                public final void run() {
                    v9v0.b.getClass();
                    v9v0.D();
                }
            }, 500L);
        }
    }

    public final void E() {
        c.removeCallbacksAndMessages(null);
        Context context = e43.a;
        Context context2 = context != null ? context : null;
        context2.stopService(new Intent(context2, (Class<?>) VkOnlineService.class));
    }

    @Override // xsna.c63.b
    public final void u() {
        long millis = TimeUnit.SECONDS.toMillis(50L);
        if (millis <= 0) {
            E();
            return;
        }
        Handler handler = c;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new y9o0(1), millis);
    }

    @Override // xsna.c63.b
    public final void x(Activity activity) {
        hqw0 hqw0Var = (hqw0) d.getValue();
        hqw0Var.getClass();
        boolean z = false;
        if (a201.b().b().isInitialized()) {
            if (a201.b().b().isInitialized()) {
                io.reactivex.rxjava3.disposables.c cVar = hqw0Var.c;
                if (cVar != null) {
                    cVar.dispose();
                }
                hqw0Var.c = null;
                hqw0Var.c = com.vk.voip.ui.c.I0(com.vk.voip.ui.c.b).subscribe(new zk30(new gqw0(hqw0Var, 0), 27));
            }
            if (activity instanceof VoipCallActivity) {
                com.vk.voip.ui.c.b.getClass();
                if (com.vk.voip.ui.c.K0 == VoipViewModelState.ReceivingCallFromPeer) {
                    z = true;
                }
            }
            if (z) {
                hqw0Var.b = true;
            }
        }
        if (!z && o25.a().b()) {
            Handler handler = c;
            handler.removeCallbacksAndMessages(null);
            handler.postDelayed(new f5m(2), 1000L);
        }
    }
}
