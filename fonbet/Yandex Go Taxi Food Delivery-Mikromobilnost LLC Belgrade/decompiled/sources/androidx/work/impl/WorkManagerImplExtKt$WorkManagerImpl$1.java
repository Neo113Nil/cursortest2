package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import defpackage.btx0;
import defpackage.ems;
import defpackage.hgz;
import defpackage.k3x0;
import defpackage.pom0;
import defpackage.r6f0;
import defpackage.r951;
import defpackage.s0u;
import defpackage.scc;
import defpackage.u0e;
import defpackage.v201;
import defpackage.v490;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class WorkManagerImplExtKt$WorkManagerImpl$1 extends FunctionReferenceImpl implements ems {
    public static final WorkManagerImplExtKt$WorkManagerImpl$1 b = new WorkManagerImplExtKt$WorkManagerImpl$1(6, 1, c.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;");

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        u0e u0eVar = (u0e) obj2;
        btx0 btx0Var = (btx0) obj3;
        r6f0 r6f0Var = (r6f0) obj6;
        int i = pom0.a;
        k3x0 k3x0Var = new k3x0(context, (WorkDatabase) obj4, u0eVar);
        v490.a(context, SystemJobService.class, true);
        hgz.g().getClass();
        return scc.g(k3x0Var, new s0u(context, u0eVar, (v201) obj5, r6f0Var, new r951(r6f0Var, btx0Var), btx0Var));
    }
}
