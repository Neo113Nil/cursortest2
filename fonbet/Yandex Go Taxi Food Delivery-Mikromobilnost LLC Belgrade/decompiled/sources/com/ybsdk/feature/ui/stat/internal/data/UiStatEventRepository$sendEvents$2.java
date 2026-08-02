package com.ybsdk.feature.ui.stat.internal.data;

import com.ybsdk.feature.ui.stat.internal.data.network.UiStatEventsApi;
import com.ybsdk.feature.ui.stat.internal.data.network.dto.UiStatEventsRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lzy11;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.ui.stat.internal.data.UiStatEventRepository$sendEvents$2", f = "UiStatEventRepository.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class UiStatEventRepository$sendEvents$2 extends SuspendLambda implements tls {
    final /* synthetic */ List<UiStatEventsRequest> $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiStatEventRepository$sendEvents$2(a aVar, List list, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$request = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new UiStatEventRepository$sendEvents$2(this.this$0, this.$request, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((UiStatEventRepository$sendEvents$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            UiStatEventsApi uiStatEventsApi = this.this$0.a;
            List<UiStatEventsRequest> list = this.$request;
            this.label = 1;
            a = uiStatEventsApi.a(list, this);
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
