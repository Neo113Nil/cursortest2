package com.yandex.messaging.ui.settings;

import defpackage.gu21;
import defpackage.ij60;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyh0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgu21;", "userStatus", "Lzy11;", "<anonymous>", "(Lgu21;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.settings.NotificationSettingsViewModel$loadInitialState$1", f = "NotificationSettingsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class NotificationSettingsViewModel$loadInitialState$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSettingsViewModel$loadInitialState$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NotificationSettingsViewModel$loadInitialState$1 notificationSettingsViewModel$loadInitialState$1 = new NotificationSettingsViewModel$loadInitialState$1(this.this$0, continuation);
        notificationSettingsViewModel$loadInitialState$1.L$0 = obj;
        return notificationSettingsViewModel$loadInitialState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        NotificationSettingsViewModel$loadInitialState$1 notificationSettingsViewModel$loadInitialState$1 = (NotificationSettingsViewModel$loadInitialState$1) create((gu21) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        notificationSettingsViewModel$loadInitialState$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object value;
        int i;
        Integer num;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        gu21 gu21Var = (gu21) this.L$0;
        b bVar = this.this$0;
        if (gu21Var != null) {
            bVar.getClass();
            z = gu21Var.a();
        } else {
            z = false;
        }
        r0 r0Var = bVar.x;
        do {
            value = r0Var.getValue();
            ij60 ij60Var = (ij60) value;
            Integer valueOf = Integer.valueOf(oyh0.notifications_disabled_by_status_message);
            if (!z) {
                valueOf = null;
            }
            boolean z8 = !z;
            boolean z9 = !z && bVar.w.a();
            i = ij60Var.a;
            if ((193 & 2) != 0) {
                valueOf = ij60Var.b;
            }
            num = valueOf;
            if ((193 & 4) != 0) {
                z9 = ij60Var.c;
            }
            z2 = z9;
            z3 = (193 & 8) != 0 ? ij60Var.d : z8;
            z4 = (193 & 16) != 0 ? ij60Var.e : z8;
            if ((193 & 32) != 0) {
                z8 = ij60Var.f;
            }
            z5 = z8;
            z6 = (193 & 64) != 0 ? ij60Var.g : false;
            z7 = (193 & 128) != 0 ? ij60Var.h : false;
            ij60Var.getClass();
        } while (!r0Var.k(value, new ij60(i, num, z2, z3, z4, z5, z6, z7)));
        return zy11.a;
    }
}
