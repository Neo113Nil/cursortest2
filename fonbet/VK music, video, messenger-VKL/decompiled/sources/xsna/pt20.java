package xsna;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import com.vk.stat.model.builders.aggregate.AggregateEventBuilder;
import com.vk.stat.model.builders.aggregate.AggregateEventKey;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import xsna.a9i;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public class pt20 {
    public static bpn0 a;

    public static final void a(kvj0 kvj0Var) {
        AggregateEventBuilder aggregateEventBuilder = new AggregateEventBuilder(AggregateEventKey.CORE_SINGLE_PREF_MIGRATION);
        aggregateEventBuilder.v(0, kvj0Var.b.h());
        aggregateEventBuilder.v(1, kvj0Var.a ? 1 : 0);
        aggregateEventBuilder.v(2, kvj0Var.d ? 1 : 0);
        Integer num = kvj0Var.e;
        aggregateEventBuilder.v(3, num != null ? num.intValue() : -1);
        aggregateEventBuilder.v(4, (int) kvj0Var.c);
        aggregateEventBuilder.v(5, kvj0Var.f ? 1 : 0);
        aggregateEventBuilder.q();
    }

    public static final e0m0 b() {
        bpn0 bpn0Var = a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (e0m0) bpn0Var.getValue();
    }

    public static void c(@NonNull Context context) {
        synchronized (qt20.b) {
            exc0.k("MlKitContext is already initialized", qt20.c == null);
            qt20 qt20Var = new qt20();
            qt20.c = qt20Var;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList a2 = new a9i(context, new a9i.a(MlKitComponentDiscoveryService.class)).a();
            Executor executor = TaskExecutors.MAIN_THREAD;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            sl9 sl9Var = m9i.a;
            arrayList.addAll(a2);
            arrayList2.add(i8i.c(context, Context.class, new Class[0]));
            arrayList2.add(i8i.c(qt20Var, qt20.class, new Class[0]));
            aai aaiVar = new aai(executor, arrayList, arrayList2, sl9Var);
            qt20Var.a = aaiVar;
            aaiVar.i(true);
        }
    }

    public static Map d(Map map, izs izsVar) {
        return map instanceof sm00 ? d(((sm00) map).v9(), izsVar) : new tm00(map, izsVar);
    }
}
