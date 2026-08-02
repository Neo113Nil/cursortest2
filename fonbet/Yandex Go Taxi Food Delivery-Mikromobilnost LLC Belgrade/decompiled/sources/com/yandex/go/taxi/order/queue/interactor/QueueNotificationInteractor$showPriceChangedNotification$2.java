package com.yandex.go.taxi.order.queue.interactor;

import android.content.Context;
import com.yandex.go.taxi.order.change.common.notification.ChangeOrderItemNotification;
import defpackage.evu0;
import defpackage.f1h0;
import defpackage.fkg0;
import defpackage.gkg0;
import defpackage.kqe0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.ob9;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.wz1;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.queue.interactor.QueueNotificationInteractor$showPriceChangedNotification$2", f = "QueueNotificationInteractor.kt", l = {43}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class QueueNotificationInteractor$showPriceChangedNotification$2 extends SuspendLambda implements wls {
    final /* synthetic */ gkg0 $notificationModel;
    final /* synthetic */ o2y0 $orderHolder;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ fkg0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueueNotificationInteractor$showPriceChangedNotification$2(gkg0 gkg0Var, fkg0 fkg0Var, o2y0 o2y0Var, Continuation continuation) {
        super(2, continuation);
        this.$notificationModel = gkg0Var;
        this.this$0 = fkg0Var;
        this.$orderHolder = o2y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QueueNotificationInteractor$showPriceChangedNotification$2(this.$notificationModel, this.this$0, this.$orderHolder, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QueueNotificationInteractor$showPriceChangedNotification$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Context context;
        CharSequence charSequence;
        CharSequence charSequence2;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            if (evu0.J(this.$notificationModel.a)) {
                return zy11Var;
            }
            fkg0 fkg0Var = this.this$0;
            Context context2 = fkg0Var.a;
            gkg0 gkg0Var = this.$notificationModel;
            CharSequence charSequence3 = gkg0Var.a;
            CharSequence charSequence4 = gkg0Var.b;
            String str2 = gkg0Var.c;
            int i2 = f1h0.ic_success_change;
            this.L$0 = context2;
            this.L$1 = "QueueNotification";
            this.L$2 = charSequence3;
            this.L$3 = charSequence4;
            this.label = 1;
            fkg0Var.e.getClass();
            sjh sjhVar = uyj.a;
            obj = tje.k0(mdh.b, new QueueNotificationInteractor$downloadIcon$2(fkg0Var, str2, i2, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            context = context2;
            charSequence = charSequence4;
            charSequence2 = charSequence3;
            str = "QueueNotification";
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            CharSequence charSequence5 = (CharSequence) this.L$3;
            CharSequence charSequence6 = (CharSequence) this.L$2;
            String str3 = (String) this.L$1;
            Context context3 = (Context) this.L$0;
            kotlin.b.b(obj);
            charSequence = charSequence5;
            charSequence2 = charSequence6;
            str = str3;
            context = context3;
        }
        ChangeOrderItemNotification changeOrderItemNotification = new ChangeOrderItemNotification(context, str, charSequence2, charSequence, (ob9) obj, this.$notificationModel.d);
        fkg0 fkg0Var2 = this.this$0;
        ru.yandex.taxi.design.utils.c.z(new kqe0(5, fkg0Var2, this.$orderHolder, this.$notificationModel), changeOrderItemNotification);
        fkg0Var2.b.e(changeOrderItemNotification);
        changeOrderItemNotification.setExpiresListener(new wz1(11, fkg0Var2));
        changeOrderItemNotification.startExpiresTimer(3000L);
        return zy11Var;
    }
}
