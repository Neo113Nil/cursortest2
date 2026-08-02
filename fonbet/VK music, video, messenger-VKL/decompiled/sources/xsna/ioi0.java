package xsna;

import android.app.ActivityManager;
import android.content.Context;
import android.os.HandlerThread;
import androidx.health.platform.client.request.RequestContext;
import com.vk.core.preference.Preference;

/* compiled from: ServiceBackedHealthDataClient.kt */
/* loaded from: classes12.dex */
public final class ioi0 extends clc<gnv> {
    public final Context f;
    public final String g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ioi0(Context context, mcc0 mcc0Var) {
        super(mcc0Var, r1, new ryt0(), new up(29));
        f4j f4jVar;
        synchronized (q6x.i) {
            try {
                if (q6x.j == null) {
                    Context applicationContext = context.getApplicationContext();
                    HandlerThread handlerThread = new HandlerThread("ProviderConnectionManager", 9);
                    handlerThread.start();
                    q6x.j = new f4j(applicationContext, handlerThread.getLooper());
                }
                f4jVar = q6x.j;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f = context;
        this.g = context.getPackageName();
    }

    public final lzi0 b(androidx.health.platform.client.proto.p0 p0Var) {
        return a(1, new hoi0(this, p0Var));
    }

    public final RequestContext c() {
        String string = Preference.h(this.f, 0, "PermissionTokenManager.healthdata").getString("token", null);
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i = runningAppProcessInfo.importance;
        return new RequestContext(this.g, 112, string, i == 100 || i == 125 || i == 200);
    }
}
