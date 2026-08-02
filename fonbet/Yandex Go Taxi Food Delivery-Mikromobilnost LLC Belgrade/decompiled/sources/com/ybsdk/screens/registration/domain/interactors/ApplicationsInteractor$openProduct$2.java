package com.ybsdk.screens.registration.domain.interactors;

import com.ybsdk.api.entities.YBProduct;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "La03;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.registration.domain.interactors.ApplicationsInteractor$openProduct$2", f = "ApplicationsInteractor.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ApplicationsInteractor$openProduct$2 extends SuspendLambda implements wls {
    final /* synthetic */ Map<String, String> $additionalParams;
    final /* synthetic */ YBProduct $product;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicationsInteractor$openProduct$2(a aVar, YBProduct yBProduct, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$product = yBProduct;
        this.$additionalParams = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ApplicationsInteractor$openProduct$2 applicationsInteractor$openProduct$2 = new ApplicationsInteractor$openProduct$2(this.this$0, this.$product, this.$additionalParams, continuation);
        applicationsInteractor$openProduct$2.L$0 = obj;
        return applicationsInteractor$openProduct$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ApplicationsInteractor$openProduct$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            String str = (String) this.L$0;
            com.ybsdk.screens.registration.data.b bVar = this.this$0.b;
            YBProduct yBProduct = this.$product;
            Map<String, String> map = this.$additionalParams;
            this.label = 1;
            a = bVar.a(yBProduct, str, map, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
