package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.GestureDetector;
import com.vk.log.L;
import com.vk.uxpolls.presentation.view.PollsWebView;
import com.vk.voip.VoipService;
import xsna.r7s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class oub0 implements gzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Context c;

    public /* synthetic */ oub0(Context context) {
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                Context context = this.c;
                int i = PollsWebView.h;
                return new GestureDetector(context, new kfh0(context));
            default:
                Context context2 = this.c;
                L.A("VoipServiceLifecycle", "sendStartIntent");
                Intent intent = new Intent(context2, (Class<?>) VoipService.class);
                try {
                    try {
                        context2.startForegroundService(intent);
                    } catch (Exception e) {
                        c63 c63Var = c63.a;
                        if (c63.f) {
                            throw e;
                        }
                        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                        ComponentName component = intent.getComponent();
                        bVar.q(new r7s.a(component != null ? component.getClassName() : null, e));
                    }
                } catch (Throwable th) {
                    L.f("VoipServiceLifecycle", "Foreground service start failed", th);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ oub0(e1x0 e1x0Var, Context context) {
        this.c = context;
    }
}
