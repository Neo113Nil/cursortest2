package xsna;

import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.bea;
import xsna.el50;

/* compiled from: ReorderDelegate.kt */
@b6l(c = "com.vk.catalog.mvi.section.impl.ui.store.delegate.ReorderDelegateKt$handleItemReorderAction$2$1", f = "ReorderDelegate.kt", l = {53}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class qzf0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ String $blockId;
    final /* synthetic */ eea $this_handleItemReorderAction;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qzf0(eea eeaVar, String str, spj<? super qzf0> spjVar) {
        super(2, spjVar);
        this.$this_handleItemReorderAction = eeaVar;
        this.$blockId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new qzf0(this.$this_handleItemReorderAction, this.$blockId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((qzf0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            eea eeaVar = this.$this_handleItemReorderAction;
            acc0 acc0Var = new acc0(5);
            eeaVar.getClass();
            el50.a.b(eeaVar, acc0Var);
            eea eeaVar2 = this.$this_handleItemReorderAction;
            String str = this.$blockId;
            this.label = 1;
            a = rzf0.a(eeaVar2, str, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            a = ((Result) obj).d();
        }
        eea eeaVar3 = this.$this_handleItemReorderAction;
        if (!(a instanceof Result.Failure)) {
            t810 t810Var = new t810(12);
            eeaVar3.getClass();
            el50.a.b(eeaVar3, t810Var);
        }
        eea eeaVar4 = this.$this_handleItemReorderAction;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            xpt xptVar = new xpt(25);
            eeaVar4.getClass();
            el50.a.b(eeaVar4, xptVar);
            String str2 = ((CatalogSectionState) eeaVar4.b.getCurrentState()).c;
            eeaVar4.c(new bea.b(a2));
        }
        return s3q0.a;
    }
}
