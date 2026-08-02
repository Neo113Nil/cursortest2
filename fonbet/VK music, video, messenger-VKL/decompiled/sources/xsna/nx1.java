package xsna;

import android.content.Context;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import xsna.yrl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class nx1 implements yrl.a, io.reactivex.rxjava3.functions.l, b9i {
    public final /* synthetic */ Object b;

    public /* synthetic */ nx1(Object obj) {
        this.b = obj;
    }

    @Override // xsna.yrl.a
    public void a(f9e0 f9e0Var) {
        ox1 ox1Var = (ox1) this.b;
        ex1 ex1Var = (ex1) f9e0Var.get();
        i5k i5kVar = new i5k(ex1Var);
        j4k j4kVar = new j4k();
        lyd e = ex1Var.e("clx", j4kVar);
        if (e == null) {
            e = ex1Var.e(CrashHianalyticsData.EVENT_ID_CRASH, j4kVar);
        }
        if (e != null) {
            ab8 ab8Var = new ab8();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            qf7 qf7Var = new qf7(i5kVar);
            synchronized (ox1Var) {
                try {
                    Iterator it = ox1Var.c.iterator();
                    while (it.hasNext()) {
                        ab8Var.b = (bb8) it.next();
                    }
                    j4kVar.b = ab8Var;
                    j4kVar.a = qf7Var;
                    ox1Var.b = ab8Var;
                    ox1Var.a = qf7Var;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return (io.reactivex.rxjava3.core.t) ((o45) this.b).invoke(obj);
    }

    @Override // xsna.b9i
    public Object c(lcg0 lcg0Var) {
        return new com.google.firebase.heartbeatinfo.a((Context) lcg0Var.a(Context.class), ((vhr) lcg0Var.a(vhr.class)).f(), lcg0Var.g(toe0.a(g1v.class)), lcg0Var.e(hgq0.class), (Executor) lcg0Var.c((toe0) this.b));
    }
}
