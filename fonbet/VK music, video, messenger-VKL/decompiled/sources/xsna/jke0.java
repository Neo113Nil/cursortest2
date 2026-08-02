package xsna;

import com.vk.push.pushsdk.ipc.ForegroundPushService;
import kotlin.random.Random;

/* compiled from: PushServiceForegroundModeResolver.kt */
/* loaded from: classes5.dex */
public final class jke0 {
    static {
        Random.b.getClass();
        Random.c.j();
    }

    public jke0() {
        this(0);
    }

    public static void a() {
        throw new IllegalArgumentException("Required value was null.");
    }

    public static void b(ForegroundPushService foregroundPushService) {
        foregroundPushService.stopForeground(1);
    }

    public jke0(int i) {
        if (qxi.b == null) {
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
    }
}
