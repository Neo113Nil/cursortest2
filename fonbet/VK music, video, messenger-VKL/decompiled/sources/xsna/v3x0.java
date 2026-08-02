package xsna;

import android.os.Handler;
import com.vk.voip.ui.VoipViewModelState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class v3x0 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (com.vk.voip.ui.c.K0 == VoipViewModelState.InCall) {
            int i = com.vk.voip.ui.c.R0 + 1;
            com.vk.voip.ui.c.b.getClass();
            if (com.vk.voip.ui.c.R0 != i) {
                com.vk.voip.ui.c.R0 = i;
                ysg0.b.a(new wgw0());
            }
            Handler handler = com.vk.voip.ui.c.N0;
            v3x0 v3x0Var = com.vk.voip.ui.c.Q0;
            handler.removeCallbacks(v3x0Var);
            handler.postDelayed(v3x0Var, 1000L);
        }
    }
}
