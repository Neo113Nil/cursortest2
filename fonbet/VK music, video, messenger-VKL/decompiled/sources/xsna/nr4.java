package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.vk.audiomsg.player.service.AudioMsgPlayerNotificationService;

/* compiled from: AudioMsgPlayerNotificationHelper.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class nr4 {
    public static final nr4 a = new nr4();
    public static boolean b = false;
    public static com.vk.audiomsg.player.service.a c = null;
    public static volatile boolean d = false;
    public static Context e = null;
    public static String f = "";
    public static int g;
    public static s12 h;
    public static lza0 i;
    public static v94 j;
    public static int k;
    public static bpn0 l;
    public static bpn0 m;

    public static final tl9 a() {
        bpn0 bpn0Var = l;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (tl9) bpn0Var.getValue();
    }

    public static final kbj0 b() {
        bpn0 bpn0Var = m;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (kbj0) bpn0Var.getValue();
    }

    public synchronized void c() {
        try {
            int i2 = k;
            if (i2 == 1) {
                d = true;
            } else if (i2 == 2) {
                Context context = e;
                if (context == null) {
                    context = null;
                }
                Intent intent = new Intent(context, (Class<?>) AudioMsgPlayerNotificationService.class);
                Context context2 = e;
                if (context2 == null) {
                    context2 = null;
                }
                context2.stopService(intent);
                com.vk.audiomsg.player.service.a aVar = c;
                if (aVar != null) {
                    Context context3 = e;
                    if (context3 == null) {
                        context3 = null;
                    }
                    context3.unbindService(aVar);
                }
                c = null;
                k = 0;
            }
        } finally {
        }
    }
}
