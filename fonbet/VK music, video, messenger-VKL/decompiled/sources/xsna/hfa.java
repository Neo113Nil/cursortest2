package xsna;

import com.vk.catalog.mvi.section.screen.impl.ui.CatalogSectionScreenFragment;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.dfa;

/* compiled from: CatalogSectionScreenFragment.kt */
@b6l(c = "com.vk.catalog.mvi.section.screen.impl.ui.CatalogSectionScreenFragment$ScreenContent$1$2$1", f = "CatalogSectionScreenFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class hfa extends SuspendLambda implements yzs<z37<bfa>, dfa, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CatalogSectionScreenFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hfa(CatalogSectionScreenFragment catalogSectionScreenFragment, spj<? super hfa> spjVar) {
        super(3, spjVar);
        this.this$0 = catalogSectionScreenFragment;
    }

    @Override // xsna.yzs
    public final Object invoke(z37<bfa> z37Var, dfa dfaVar, spj<? super s3q0> spjVar) {
        hfa hfaVar = new hfa(this.this$0, spjVar);
        hfaVar.L$0 = dfaVar;
        return hfaVar.invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dfa dfaVar = (dfa) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        CatalogSectionScreenFragment catalogSectionScreenFragment = this.this$0;
        qcy<Object>[] qcyVarArr = CatalogSectionScreenFragment.T;
        if (dfaVar instanceof dfa.a) {
            catalogSectionScreenFragment.finish();
        } else {
            if (!(dfaVar instanceof dfa.b)) {
                catalogSectionScreenFragment.getClass();
                throw new NoWhenBranchMatchedException();
            }
            ((cga) catalogSectionScreenFragment.R.getValue()).a(catalogSectionScreenFragment.requireContext(), ((dfa.b) dfaVar).a);
        }
        return s3q0.a;
    }
}
