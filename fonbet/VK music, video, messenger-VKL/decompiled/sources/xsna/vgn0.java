package xsna;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SuperappKitCommon.kt */
@b6l(c = "com.vk.superapp.SuperappKitCommon$initStats$1", f = "SuperappKitCommon.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class vgn0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mgn0 $config;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgn0(mgn0 mgn0Var, spj<? super vgn0> spjVar) {
        super(2, spjVar);
        this.$config = mgn0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new vgn0(this.$config, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((vgn0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        qhn0 qhn0Var = this.$config.h;
        if (qhn0Var != null && (list = (List) qhn0Var.a.getValue()) != null) {
            mgn0 mgn0Var = this.$config;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((rgn0) it.next()).init(mgn0Var.a);
            }
        }
        return s3q0.a;
    }
}
