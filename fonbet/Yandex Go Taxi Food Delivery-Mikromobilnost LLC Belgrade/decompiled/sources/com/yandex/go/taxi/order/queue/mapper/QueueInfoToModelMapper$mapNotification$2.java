package com.yandex.go.taxi.order.queue.mapper;

import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$QueueSearch;
import defpackage.gkg0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lgkg0;", "<anonymous>", "(Ltse;)Lgkg0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.queue.mapper.QueueInfoToModelMapper$mapNotification$2", f = "QueueInfoToModelMapper.kt", l = {102, 103}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class QueueInfoToModelMapper$mapNotification$2 extends SuspendLambda implements wls {
    final /* synthetic */ SearchInfoResponse$QueueSearch.QueueInfo.QueueNotification $notification;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueueInfoToModelMapper$mapNotification$2(SearchInfoResponse$QueueSearch.QueueInfo.QueueNotification queueNotification, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$notification = queueNotification;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        QueueInfoToModelMapper$mapNotification$2 queueInfoToModelMapper$mapNotification$2 = new QueueInfoToModelMapper$mapNotification$2(this.$notification, this.this$0, continuation);
        queueInfoToModelMapper$mapNotification$2.L$0 = obj;
        return queueInfoToModelMapper$mapNotification$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QueueInfoToModelMapper$mapNotification$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (r11 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        CharSequence charSequence;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new QueueInfoToModelMapper$mapNotification$2$title$1(this.$notification, this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new QueueInfoToModelMapper$mapNotification$2$subtitle$1(this.$notification, this.this$0, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.label = 1;
            obj = h2.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                charSequence = (CharSequence) this.L$3;
                b.b(obj);
                SearchInfoResponse$QueueSearch.QueueInfo.QueueNotification queueNotification = this.$notification;
                return new gkg0(charSequence, (CharSequence) obj, queueNotification.c, queueNotification.d);
            }
            h = (noh) this.L$2;
            b.b(obj);
        }
        CharSequence charSequence2 = (CharSequence) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = charSequence2;
        this.label = 2;
        Object k = h.k(this);
        if (k != coroutineSingletons) {
            charSequence = charSequence2;
            obj = k;
            SearchInfoResponse$QueueSearch.QueueInfo.QueueNotification queueNotification2 = this.$notification;
            return new gkg0(charSequence, (CharSequence) obj, queueNotification2.c, queueNotification2.d);
        }
        return coroutineSingletons;
    }
}
