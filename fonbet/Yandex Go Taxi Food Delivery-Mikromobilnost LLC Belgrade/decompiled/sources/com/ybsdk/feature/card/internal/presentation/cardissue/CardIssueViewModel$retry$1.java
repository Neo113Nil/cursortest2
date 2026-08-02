package com.ybsdk.feature.card.internal.presentation.cardissue;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.ybsdk.core.analytics.generated.delegates.CardCommonEvents$CardCreateResultResult;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.sh8;
import defpackage.t7o;
import defpackage.tse;
import defpackage.u7o;
import defpackage.w9a1;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.presentation.cardissue.CardIssueViewModel$retry$1", f = "CardIssueViewModel.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE, 70, 72}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardIssueViewModel$retry$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardIssueViewModel$retry$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardIssueViewModel$retry$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardIssueViewModel$retry$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
    
        if (r11 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
    
        if (r11 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0052, code lost:
    
        if (r11 == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        Object b0;
        Object failure;
        Throwable a;
        r0 r0Var2;
        Object value2;
        sh8 sh8Var;
        w9a1 t7oVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            pz40 Y = this.this$0.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, sh8.a((sh8) value, true, null, null, 14)));
            a aVar = this.this$0;
            this.label = 1;
            b0 = a.b0(aVar, this);
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                failure = ((Result) obj).getValue();
                a aVar2 = this.this$0;
                a = Result.a(failure);
                if (a != null) {
                    pz40 Y2 = aVar2.Y();
                    do {
                        r0Var2 = (r0) Y2;
                        value2 = r0Var2.getValue();
                        sh8Var = (sh8) value2;
                        if (a instanceof TimeoutCancellationException) {
                            t7oVar = u7o.c;
                        } else {
                            x4c.g("Exception during retry() in CardIssueViewModel", a, null, null, 12);
                            t7oVar = new t7o();
                        }
                    } while (!r0Var2.k(value2, sh8.a(sh8Var, false, t7oVar, null, 12)));
                    aVar2.D.k.f(CardCommonEvents$CardCreateResultResult.ERROR, a.toString());
                }
                a aVar3 = this.this$0;
                if (!(failure instanceof Result.Failure)) {
                    aVar3.D.k.f(CardCommonEvents$CardCreateResultResult.OK, null);
                }
                return zy11.a;
            }
            b.b(obj);
            b0 = ((Result) obj).getValue();
        }
        a aVar4 = this.this$0;
        Throwable a2 = Result.a(b0);
        if (a2 == null) {
            String str = (String) b0;
            if (((sh8) aVar4.X()).c) {
                this.label = 2;
                failure = aVar4.g0(str, this);
            } else {
                this.label = 3;
                failure = a.c0(aVar4, str, this);
            }
        } else {
            failure = new Result.Failure(a2);
        }
        a aVar22 = this.this$0;
        a = Result.a(failure);
        if (a != null) {
        }
        a aVar32 = this.this$0;
        if (!(failure instanceof Result.Failure)) {
        }
        return zy11.a;
    }
}
