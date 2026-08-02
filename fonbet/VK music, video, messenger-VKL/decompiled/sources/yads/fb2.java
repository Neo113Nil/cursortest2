package yads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public abstract class fb2 {
    public static final mx3 a = new mx3();

    public static void a(Context context) {
        mx3 mx3Var = a;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new IllegalArgumentException("Application Context cannot be null");
        }
        if (mx3Var.a) {
            return;
        }
        mx3Var.a = true;
        ny3 a2 = ny3.a();
        a2.c.getClass();
        sw3 sw3Var = new sw3();
        ey3 ey3Var = a2.b;
        Handler handler = new Handler();
        ey3Var.getClass();
        a2.d = new zx3(handler, applicationContext, sw3Var, a2);
        fx3.d.a(applicationContext);
        ww3.a(applicationContext);
        WindowManager windowManager = px3.a;
        px3.c = applicationContext.getResources().getDisplayMetrics().density;
        px3.a = (WindowManager) applicationContext.getSystemService("window");
        applicationContext.registerReceiver(new ay3(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        jy3.b.a = applicationContext.getApplicationContext();
        tw3 tw3Var = tw3.f;
        if (!tw3Var.c) {
            tw3Var.d.a(applicationContext);
            vx3 vx3Var = tw3Var.d;
            vx3Var.c = tw3Var;
            vx3Var.b();
            tw3Var.e = tw3Var.d.b;
            tw3Var.c = true;
        }
        py3.d.a = new WeakReference(applicationContext);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        applicationContext.registerReceiver(new oy3(), intentFilter);
    }
}
