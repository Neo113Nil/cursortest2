package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.dfa;

/* compiled from: CatalogSectionScreenInlineActor.kt */
@b6l(c = "com.vk.catalog.mvi.section.screen.impl.ui.store.CatalogSectionScreenInlineActor$handleStoreFlows$2", f = "CatalogSectionScreenInlineActor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class jfa extends SuspendLambda implements wzs<bea, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ kfa this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfa(kfa kfaVar, spj<? super jfa> spjVar) {
        super(2, spjVar);
        this.this$0 = kfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        jfa jfaVar = new jfa(this.this$0, spjVar);
        jfaVar.L$0 = obj;
        return jfaVar;
    }

    @Override // xsna.wzs
    public final Object invoke(bea beaVar, spj<? super s3q0> spjVar) {
        return ((jfa) create(beaVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        bea beaVar = (bea) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.this$0.c(new dfa.b(beaVar));
        return s3q0.a;
    }
}
