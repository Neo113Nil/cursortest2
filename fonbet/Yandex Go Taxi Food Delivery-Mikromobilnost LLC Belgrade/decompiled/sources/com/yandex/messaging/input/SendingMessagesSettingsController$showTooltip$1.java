package com.yandex.messaging.input;

import com.yandex.messaging.internal.view.input.mesix.Mesix;
import defpackage.e3n;
import defpackage.kp50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.oyh0;
import defpackage.tse;
import defpackage.w0w;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.input.SendingMessagesSettingsController$showTooltip$1", f = "SendingMessagesSettingsController.kt", l = {100}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class SendingMessagesSettingsController$showTooltip$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendingMessagesSettingsController$showTooltip$1(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SendingMessagesSettingsController$showTooltip$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SendingMessagesSettingsController$showTooltip$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (this.this$0.c()) {
            f fVar = this.this$0;
            com.yandex.messaging.internal.view.input.b bVar = fVar.m;
            Mesix mesix = fVar.b;
            int i2 = oyh0.messaging_tooltip_sending_settings;
            o430 o430Var = e3n.b;
            w0w w0wVar = new w0w(mesix, new Integer(i2), kp50.U(5, DurationUnit.MINUTES), true);
            this.label = 1;
            if (bVar.b(w0wVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
