package xsna;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: VkStatDependencies.kt */
/* loaded from: classes5.dex */
public final class rlv0 {
    public final qlv0 a;
    public final wlv0 b;
    public final eml c;
    public final ExecutorService d;
    public final List<pur> e;

    /* compiled from: VkStatDependencies.kt */
    public static final class a {
        public static rlv0 a(Context context, String str, zzp zzpVar, m66 m66Var, ExecutorService executorService, List list) {
            eml emlVar = new eml(new edi(23));
            qlv0 qlv0Var = new qlv0(context.getApplicationContext(), m66Var, zzpVar);
            context.getApplicationContext();
            return new rlv0(qlv0Var, new wlv0(str, zzpVar), emlVar, executorService, list);
        }
    }

    public rlv0(qlv0 qlv0Var, wlv0 wlv0Var, eml emlVar, ExecutorService executorService, List list) {
        this.a = qlv0Var;
        this.b = wlv0Var;
        this.c = emlVar;
        this.d = executorService;
        this.e = list;
    }
}
