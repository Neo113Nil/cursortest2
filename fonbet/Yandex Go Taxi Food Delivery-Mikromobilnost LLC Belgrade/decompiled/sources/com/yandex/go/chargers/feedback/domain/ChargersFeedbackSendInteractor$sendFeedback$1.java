package com.yandex.go.chargers.feedback.domain;

import com.yandex.go.chargers.analytics.ChargersError;
import com.yandex.go.chargers.feedback.data.d;
import defpackage.cy9;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.whb1;
import defpackage.wls;
import defpackage.yx9;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.feedback.domain.ChargersFeedbackSendInteractor$sendFeedback$1", f = "ChargersFeedbackSendInteractor.kt", l = {25, 28}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersFeedbackSendInteractor$sendFeedback$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<String> $feedbackItemIds;
    final /* synthetic */ String $orderId;
    final /* synthetic */ Integer $rating;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersFeedbackSendInteractor$sendFeedback$1(b bVar, String str, Integer num, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$orderId = str;
        this.$rating = num;
        this.$feedbackItemIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersFeedbackSendInteractor$sendFeedback$1(this.this$0, this.$orderId, this.$rating, this.$feedbackItemIds, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersFeedbackSendInteractor$sendFeedback$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        if (r9 == r0) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r9v13 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        b bVar = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th2) {
            com.yandex.go.chargers.error.data.a aVar = (com.yandex.go.chargers.error.data.a) bVar.c.get();
            this.L$0 = th2;
            this.L$1 = null;
            this.label = 2;
            Object a = aVar.a(th2, this);
            if (a != obj2) {
                obj = a;
                th = th2;
            }
            return obj2;
        }
        if (bVar == 0) {
            kotlin.b.b(obj);
            b bVar2 = this.this$0;
            String str = this.$orderId;
            Integer num = this.$rating;
            List<String> list = this.$feedbackItemIds;
            d dVar = bVar2.b;
            this.L$0 = bVar2;
            this.label = 1;
            Object b = dVar.b(str, num, list, this);
            bVar = bVar2;
            this = b;
        } else {
            if (bVar != 1) {
                if (bVar != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = (Throwable) this.L$0;
                kotlin.b.b(obj);
                yx9.a(ChargersError.Companion, ChargersError.FeedbackSend, ((cy9) obj).a, 4);
                whb1.c(null, th);
                return zy11.a;
            }
            b bVar3 = (b) this.L$0;
            kotlin.b.b(obj);
            bVar = bVar3;
            this = this;
        }
        return zy11.a;
    }
}
