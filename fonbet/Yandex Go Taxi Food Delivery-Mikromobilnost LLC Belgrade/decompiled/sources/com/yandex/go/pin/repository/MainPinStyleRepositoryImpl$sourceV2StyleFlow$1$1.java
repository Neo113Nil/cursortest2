package com.yandex.go.pin.repository;

import defpackage.bms;
import defpackage.fji;
import defpackage.i1c0;
import defpackage.lub0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Li1c0;", "defaultStyle", "Lfji;", "deliveryStyle", "Llub0;", "brandingOverride", "<anonymous>", "(Li1c0;Lfji;Llub0;)Li1c0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pin.repository.MainPinStyleRepositoryImpl$sourceV2StyleFlow$1$1", f = "MainPinStyleRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MainPinStyleRepositoryImpl$sourceV2StyleFlow$1$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainPinStyleRepositoryImpl$sourceV2StyleFlow$1$1(o oVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = oVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        MainPinStyleRepositoryImpl$sourceV2StyleFlow$1$1 mainPinStyleRepositoryImpl$sourceV2StyleFlow$1$1 = new MainPinStyleRepositoryImpl$sourceV2StyleFlow$1$1(this.this$0, (Continuation) obj4);
        mainPinStyleRepositoryImpl$sourceV2StyleFlow$1$1.L$0 = (i1c0) obj;
        mainPinStyleRepositoryImpl$sourceV2StyleFlow$1$1.L$1 = (fji) obj2;
        mainPinStyleRepositoryImpl$sourceV2StyleFlow$1$1.L$2 = (lub0) obj3;
        return mainPinStyleRepositoryImpl$sourceV2StyleFlow$1$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Integer c;
        Integer p;
        i1c0 i1c0Var = (i1c0) this.L$0;
        fji fjiVar = (fji) this.L$1;
        lub0 lub0Var = (lub0) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        o oVar = this.this$0;
        ru.yandex.taxi.widget.utils.e eVar = oVar.h;
        String str = lub0Var.c;
        int intValue = (str == null || (p = eVar.p(str)) == null) ? i1c0Var.a : p.intValue();
        String str2 = lub0Var.b;
        return o.a(oVar, fjiVar, i1c0.a(i1c0Var, intValue, (str2 == null || (c = eVar.c(str2)) == null) ? i1c0Var.b : c.intValue(), null, 0.0f, 12));
    }
}
