package xsna;

import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.el50;

/* compiled from: CatalogSectionScreenInlineActor.kt */
@b6l(c = "com.vk.catalog.mvi.section.screen.impl.ui.store.CatalogSectionScreenInlineActor$handleStoreFlows$1", f = "CatalogSectionScreenInlineActor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class ifa extends SuspendLambda implements wzs<CatalogSectionState, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ kfa this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifa(kfa kfaVar, spj<? super ifa> spjVar) {
        super(2, spjVar);
        this.this$0 = kfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        ifa ifaVar = new ifa(this.this$0, spjVar);
        ifaVar.L$0 = obj;
        return ifaVar;
    }

    @Override // xsna.wzs
    public final Object invoke(CatalogSectionState catalogSectionState, spj<? super s3q0> spjVar) {
        return ((ifa) create(catalogSectionState, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CatalogSectionState catalogSectionState = (CatalogSectionState) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        kfa kfaVar = this.this$0;
        com.vk.movika.sdk.base.observable.k kVar = new com.vk.movika.sdk.base.observable.k(catalogSectionState, 14);
        kfaVar.getClass();
        el50.a.b(kfaVar, kVar);
        return s3q0.a;
    }
}
