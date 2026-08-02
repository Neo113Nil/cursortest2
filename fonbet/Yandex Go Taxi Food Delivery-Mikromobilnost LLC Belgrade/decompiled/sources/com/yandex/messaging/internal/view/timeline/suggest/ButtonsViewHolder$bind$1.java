package com.yandex.messaging.internal.view.timeline.suggest;

import com.yandex.messaging.ChatRequest;
import defpackage.acb;
import defpackage.j3b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xw4;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.timeline.suggest.ButtonsViewHolder$bind$1", f = "ButtonsViewHolder.kt", l = {103}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ButtonsViewHolder$bind$1 extends SuspendLambda implements wls {
    final /* synthetic */ acb $chatDependencies;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj3b;", "chatInfo", "", "lang", "Lzy11;", "<anonymous>", "(Lj3b;Ljava/lang/String;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.internal.view.timeline.suggest.ButtonsViewHolder$bind$1$1", f = "ButtonsViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.internal.view.timeline.suggest.ButtonsViewHolder$bind$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, Continuation continuation) {
            super(3, continuation);
            this.this$0 = cVar;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, (Continuation) obj3);
            anonymousClass1.L$0 = (j3b) obj;
            anonymousClass1.L$1 = (String) obj2;
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
            j3b j3bVar = (j3b) this.L$0;
            String str = (String) this.L$1;
            c cVar = this.this$0;
            cVar.R0 = j3bVar;
            cVar.Q0 = str;
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonsViewHolder$bind$1(acb acbVar, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$chatDependencies = acbVar;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ButtonsViewHolder$bind$1(this.$chatDependencies, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ButtonsViewHolder$bind$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ChatRequest chatRequest = this.$chatDependencies.d;
            m0 m0Var = new m0(this.this$0.B0.a(chatRequest), this.this$0.C0.b(chatRequest), new AnonymousClass1(this.this$0, null));
            xw4 xw4Var = new xw4(16, this.this$0);
            this.label = 1;
            if (m0Var.collect(xw4Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
