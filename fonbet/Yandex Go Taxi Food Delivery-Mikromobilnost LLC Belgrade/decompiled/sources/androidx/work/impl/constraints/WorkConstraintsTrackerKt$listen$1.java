package androidx.work.impl.constraints;

import defpackage.d7e;
import defpackage.fa51;
import defpackage.g92;
import defpackage.idn;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.y851;
import defpackage.zx60;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1", f = "WorkConstraintsTracker.kt", l = {67}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class WorkConstraintsTrackerKt$listen$1 extends SuspendLambda implements wls {
    final /* synthetic */ zx60 $listener;
    final /* synthetic */ fa51 $spec;
    final /* synthetic */ y851 $this_listen;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkConstraintsTrackerKt$listen$1(y851 y851Var, fa51 fa51Var, zx60 zx60Var, Continuation continuation) {
        super(2, continuation);
        this.$this_listen = y851Var;
        this.$spec = fa51Var;
        this.$listener = zx60Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WorkConstraintsTrackerKt$listen$1(this.$this_listen, this.$spec, this.$listener, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WorkConstraintsTrackerKt$listen$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y851 y851Var = this.$this_listen;
            fa51 fa51Var = this.$spec;
            List list = y851Var.a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((d7e) obj2).a(fa51Var)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((d7e) it.next()).b(fa51Var.j));
            }
            tpr t = e.t(new g92(11, (tpr[]) kotlin.collections.a.J0(arrayList2).toArray(new tpr[0])));
            idn idnVar = new idn(9, this.$listener, this.$spec);
            this.label = 1;
            if (t.collect(idnVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
