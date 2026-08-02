package com.ybsdk.feature.stories.internal.screens.stories;

import defpackage.d6w;
import defpackage.hmu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.rt1;
import defpackage.s8j0;
import defpackage.scs0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.stories.internal.screens.stories.StoriesViewModel$loadData$2", f = "StoriesViewModel.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class StoriesViewModel$loadData$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoriesViewModel$loadData$2(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StoriesViewModel$loadData$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StoriesViewModel$loadData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            com.ybsdk.feature.stories.internal.domain.a aVar = dVar.C;
            String target = dVar.B.getTarget();
            String agreementId = this.this$0.B.getAgreementId();
            Map<String, String> additionalData = this.this$0.B.getAdditionalData();
            this.label = 1;
            a = aVar.a(target, agreementId, additionalData, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        d dVar2 = this.this$0;
        if (!(a instanceof Result.Failure)) {
            hmu0 hmu0Var = (hmu0) a;
            List list = hmu0Var.a;
            dVar2.b0(hmu0Var, new d6w(0, list != null ? list.size() : 0, 1));
            dVar2.a0(new scs0(28, hmu0Var, dVar2));
        }
        d dVar3 = this.this$0;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            rt1 rt1Var = dVar3.F.l0;
            String target2 = dVar3.B.getTarget();
            String message = a2.getMessage();
            LinkedHashMap linkedHashMap = new LinkedHashMap(2);
            if (message != null) {
                linkedHashMap.put("error_type", message);
            }
            linkedHashMap.put("target", target2);
            rt1Var.a.a("stories.error", linkedHashMap);
            pz40 Y = dVar3.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, c.a((c) value, new s8j0(a2), 0, false, false, null, 30)));
        }
        return zy11.a;
    }
}
