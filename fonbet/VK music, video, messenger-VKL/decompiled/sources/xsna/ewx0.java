package xsna;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: WorkManagerImplExt.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class ewx0 extends FunctionReferenceImpl implements b0t<Context, androidx.work.a, r5o0, WorkDatabase, uhp0, ohd0, List<? extends z7h0>> {
    public static final ewx0 b = new ewx0(6, fwx0.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    @Override // xsna.b0t
    public final List<? extends z7h0> invoke(Context context, androidx.work.a aVar, r5o0 r5o0Var, WorkDatabase workDatabase, uhp0 uhp0Var, ohd0 ohd0Var) {
        Context context2 = context;
        androidx.work.a aVar2 = aVar;
        r5o0 r5o0Var2 = r5o0Var;
        ohd0 ohd0Var2 = ohd0Var;
        int i = i8h0.a;
        sqn0 sqn0Var = new sqn0(context2, workDatabase, aVar2);
        z790.a(context2, SystemJobService.class, true);
        m100.c().getClass();
        return e43.l(sqn0Var, new leu(context2, aVar2, uhp0Var, ohd0Var2, new zvx0(ohd0Var2, r5o0Var2), r5o0Var2));
    }
}
