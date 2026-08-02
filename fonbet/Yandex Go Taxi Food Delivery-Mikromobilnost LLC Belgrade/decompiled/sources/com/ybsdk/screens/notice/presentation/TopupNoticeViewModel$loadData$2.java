package com.ybsdk.screens.notice.presentation;

import com.ybsdk.core.analytics.generated.delegates.TopupEvents$TopupNoticeScreenLoadedResult;
import com.ybsdk.screens.notice.domain.entities.TopupValueEntity;
import defpackage.ahk;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.notice.presentation.TopupNoticeViewModel$loadData$2", f = "TopupNoticeViewModel.kt", l = {58}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TopupNoticeViewModel$loadData$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopupNoticeViewModel$loadData$2(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TopupNoticeViewModel$loadData$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TopupNoticeViewModel$loadData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            com.ybsdk.screens.notice.data.a aVar = cVar.G;
            TopupValueEntity topupValueEntity = cVar.C;
            String str = cVar.B;
            this.label = 1;
            a = aVar.a(topupValueEntity, str, this);
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
        c cVar2 = this.this$0;
        if (!(a instanceof Result.Failure)) {
            ahk ahkVar = (ahk) a;
            cVar2.d0(TopupEvents$TopupNoticeScreenLoadedResult.OK, null);
            pz40 Y = cVar2.Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, new r8j0(ahkVar.a, null, 14)));
        }
        c cVar3 = this.this$0;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            cVar3.d0(TopupEvents$TopupNoticeScreenLoadedResult.ERROR, a2.getMessage());
            pz40 Y2 = cVar3.Y();
            do {
                r0Var = (r0) Y2;
                value = r0Var.getValue();
            } while (!r0Var.k(value, new s8j0(a2)));
        }
        return zy11.a;
    }
}
