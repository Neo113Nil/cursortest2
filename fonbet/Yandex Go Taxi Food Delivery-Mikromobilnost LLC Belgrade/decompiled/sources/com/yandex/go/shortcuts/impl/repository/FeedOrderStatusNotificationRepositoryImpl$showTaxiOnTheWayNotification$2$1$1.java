package com.yandex.go.shortcuts.impl.repository;

import com.yandex.go.shortcuts.impl.experiments.OrderNotificationsSettingsExperiment;
import com.yandex.go.shortcuts.impl.notifications.TaxiOnTheWayStateNotification;
import defpackage.g6u;
import defpackage.m810;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.qn5;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.design.NotificationStackComponent;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.repository.FeedOrderStatusNotificationRepositoryImpl$showTaxiOnTheWayNotification$2$1$1", f = "FeedOrderStatusNotificationRepositoryImpl.kt", l = {HProv.PP_PASSWD_TERM}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class FeedOrderStatusNotificationRepositoryImpl$showTaxiOnTheWayNotification$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $notificationId;
    final /* synthetic */ TaxiOnTheWayStateNotification $taxiOnTheWayStateNotification;
    float F$0;
    Object L$0;
    int label;
    final /* synthetic */ i this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.shortcuts.impl.repository.FeedOrderStatusNotificationRepositoryImpl$showTaxiOnTheWayNotification$2$1$1$1", f = "FeedOrderStatusNotificationRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.shortcuts.impl.repository.FeedOrderStatusNotificationRepositoryImpl$showTaxiOnTheWayNotification$2$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ String $notificationId;
        final /* synthetic */ TaxiOnTheWayStateNotification $taxiOnTheWayStateNotification;
        final /* synthetic */ float $timeToHideInSeconds;
        int label;
        final /* synthetic */ i this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(i iVar, TaxiOnTheWayStateNotification taxiOnTheWayStateNotification, String str, float f, Continuation continuation) {
            super(2, continuation);
            this.this$0 = iVar;
            this.$taxiOnTheWayStateNotification = taxiOnTheWayStateNotification;
            this.$notificationId = str;
            this.$timeToHideInSeconds = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$taxiOnTheWayStateNotification, this.$notificationId, this.$timeToHideInSeconds, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            i iVar = this.this$0;
            TaxiOnTheWayStateNotification taxiOnTheWayStateNotification = this.$taxiOnTheWayStateNotification;
            String str = this.$notificationId;
            long c = m810.c(this.$timeToHideInSeconds * 1000.0f);
            iVar.getClass();
            taxiOnTheWayStateNotification.setExpiresListener(new qn5(5, iVar, str));
            NotificationStackComponent notificationStackComponent = iVar.d.a;
            if (notificationStackComponent != null) {
                notificationStackComponent.showNotification(taxiOnTheWayStateNotification);
            }
            taxiOnTheWayStateNotification.startExpiresTimer(c);
            this.this$0.i.d();
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedOrderStatusNotificationRepositoryImpl$showTaxiOnTheWayNotification$2$1$1(i iVar, String str, TaxiOnTheWayStateNotification taxiOnTheWayStateNotification, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$notificationId = str;
        this.$taxiOnTheWayStateNotification = taxiOnTheWayStateNotification;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FeedOrderStatusNotificationRepositoryImpl$showTaxiOnTheWayNotification$2$1$1(this.this$0, this.$notificationId, this.$taxiOnTheWayStateNotification, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FeedOrderStatusNotificationRepositoryImpl$showTaxiOnTheWayNotification$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11Var;
        }
        kotlin.b.b(obj);
        if (this.this$0.d.a(this.$notificationId) == null) {
            float f = ((OrderNotificationsSettingsExperiment) this.this$0.h.b.b()).c;
            this.this$0.a.getClass();
            sjh sjhVar = uyj.a;
            g6u g6uVar = o400.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$taxiOnTheWayStateNotification, this.$notificationId, f, null);
            this.L$0 = null;
            this.F$0 = f;
            this.label = 1;
            if (tje.k0(g6uVar, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
