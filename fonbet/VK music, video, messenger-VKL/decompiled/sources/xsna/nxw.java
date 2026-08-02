package xsna;

import android.app.Application;
import android.view.WindowManager;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import java.util.concurrent.ExecutorService;

/* compiled from: InitCoreTaskLogic.kt */
/* loaded from: classes11.dex */
public final class nxw extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "InitCore";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        b25 s = ((AuthBridgeComponent) m7m.e().a(fpf0.a(AuthBridgeComponent.class))).s();
        Application application = u6l.a;
        Application application2 = this.b;
        u6l.a = application2;
        u6l.b = (WindowManager) application2.getSystemService("window");
        Application application3 = u6l.a;
        if (application3 == null) {
            application3 = null;
        }
        application3.registerActivityLifecycleCallbacks(new t6l(application3.getApplicationContext()));
        sgn0 sgn0Var = sgn0.c;
        a0a a0aVar = a0a.c;
        synchronized (sgn0Var) {
            sgn0.d = a0aVar;
        }
        ca70 ca70Var = ca70.a;
        lxw lxwVar = new lxw(s);
        mxw mxwVar = new mxw(s);
        g620.A = ca70Var;
        g620.B = lxwVar;
        g620.C = mxwVar;
        Application application4 = this.b;
        asu0.a.getClass();
        ExecutorService s2 = asu0.s();
        m9u0.c = s2;
        rwi.e = application4.getApplicationContext();
        i7o0.a = s2;
        oa01.c = s2;
        return s3q0.a;
    }
}
