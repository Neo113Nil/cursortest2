package xsna;

import com.vk.draftslist.impl.ui.DraftsListFragment;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.tdo;

/* compiled from: DraftsListFragment.kt */
@b6l(c = "com.vk.draftslist.impl.ui.DraftsListFragment$ScreenContent$1$2$1", f = "DraftsListFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class vdo extends SuspendLambda implements yzs<z37<sdo>, tdo, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DraftsListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vdo(DraftsListFragment draftsListFragment, spj<? super vdo> spjVar) {
        super(3, spjVar);
        this.this$0 = draftsListFragment;
    }

    @Override // xsna.yzs
    public final Object invoke(z37<sdo> z37Var, tdo tdoVar, spj<? super s3q0> spjVar) {
        vdo vdoVar = new vdo(this.this$0, spjVar);
        vdoVar.L$0 = tdoVar;
        return vdoVar.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tdo tdoVar = (tdo) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        DraftsListFragment draftsListFragment = this.this$0;
        qcy<Object>[] qcyVarArr = DraftsListFragment.Q;
        if (tdoVar instanceof tdo.a) {
            draftsListFragment.finish();
            return s3q0.a;
        }
        draftsListFragment.getClass();
        throw new NoWhenBranchMatchedException();
    }
}
