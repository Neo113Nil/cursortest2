package com.ybsdk.common.repositiories.plus;

import com.ybsdk.network.retrofit.e;
import defpackage.bg51;
import defpackage.h12;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r0d0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import retrofit2.Call;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.common.repositiories.plus.PlusRepository$getPlusShortcutData$2", f = "PlusRepository.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlusRepository$getPlusShortcutData$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<bg51> $attempts;
    final /* synthetic */ Ref$ObjectRef<String> $lastTraceId;
    final /* synthetic */ String $requestBody;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusRepository$getPlusShortcutData$2(a aVar, String str, Ref$ObjectRef ref$ObjectRef, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$requestBody = str;
        this.$lastTraceId = ref$ObjectRef;
        this.$attempts = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlusRepository$getPlusShortcutData$2(this.this$0, this.$requestBody, this.$lastTraceId, this.$attempts, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusRepository$getPlusShortcutData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Call<String> I = this.this$0.a.I(this.$requestBody);
            a aVar = this.this$0;
            e eVar = aVar.b;
            r0d0 r0d0Var = new r0d0(8, aVar);
            h12 h12Var = new h12(3, this.$lastTraceId);
            this.label = 1;
            a = eVar.a(I, r0d0Var, h12Var, this);
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
        List<bg51> list = this.$attempts;
        Ref$ObjectRef<String> ref$ObjectRef = this.$lastTraceId;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            list.add(new bg51(ref$ObjectRef.element, a2));
        }
        return new Result(a);
    }
}
