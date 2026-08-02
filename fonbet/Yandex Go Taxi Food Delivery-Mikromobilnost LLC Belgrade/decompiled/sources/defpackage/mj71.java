package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;
import yads.ih;

/* loaded from: classes7.dex */
public final class mj71 {
    public static final AtomicBoolean a = new AtomicBoolean(false);
    public static volatile kd71 b;

    public static void a(Context context, ge71 ge71Var) {
        qx71 qx71Var = new qx71(0, ge71Var);
        qhw0 a2 = jl40.a();
        sjh sjhVar = uyj.a;
        ike a3 = bvf0.a(cvw.U(a2, mdh.b).plus(qx71Var));
        if (Build.VERSION.SDK_INT >= 30 && !a.getAndSet(true)) {
            tje.N(a3, null, null, new ih(context, ge71Var, a3, null), 3);
        }
    }
}
