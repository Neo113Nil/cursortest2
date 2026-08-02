package com.yandex.messaging.internal.view.chat;

import android.os.Handler;
import com.yandex.messaging.core.net.entities.directives.ServerDirective;
import com.yandex.messaging.core.net.entities.proto.message.BotRequest;
import defpackage.a00;
import defpackage.b00;
import defpackage.g6u;
import defpackage.k0b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.otq0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tu10;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.chat.ServerDirectiveHandler$handle$2", f = "ServerDirectiveHandler.kt", l = {25}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ServerDirectiveHandler$handle$2 extends SuspendLambda implements wls {
    final /* synthetic */ ServerDirective $directive;
    final /* synthetic */ BotRequest.Error[] $errors;
    final /* synthetic */ tu10 $messageMetaData;
    final /* synthetic */ String $triggeredElementId;
    int label;
    final /* synthetic */ otq0 this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.internal.view.chat.ServerDirectiveHandler$handle$2$1", f = "ServerDirectiveHandler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.internal.view.chat.ServerDirectiveHandler$handle$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ ServerDirective $directive;
        final /* synthetic */ BotRequest.Error[] $errors;
        final /* synthetic */ tu10 $messageMetaData;
        final /* synthetic */ String $triggeredElementId;
        int label;
        final /* synthetic */ otq0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(otq0 otq0Var, tu10 tu10Var, String str, ServerDirective serverDirective, BotRequest.Error[] errorArr, Continuation continuation) {
            super(2, continuation);
            this.this$0 = otq0Var;
            this.$messageMetaData = tu10Var;
            this.$triggeredElementId = str;
            this.$directive = serverDirective;
            this.$errors = errorArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$messageMetaData, this.$triggeredElementId, this.$directive, this.$errors, continuation);
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
            k0b k0bVar = this.this$0.a;
            tu10 tu10Var = this.$messageMetaData;
            String str = tu10Var.a;
            String str2 = this.$triggeredElementId;
            long j = tu10Var.d;
            ServerDirective serverDirective = this.$directive;
            BotRequest.Error[] errorArr = this.$errors;
            k0bVar.getClass();
            tje.e();
            b00 b00Var = k0bVar.a;
            ((Handler) b00Var.a.get()).post(new a00(b00Var, k0bVar.b, str, str2, j, serverDirective, errorArr));
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerDirectiveHandler$handle$2(otq0 otq0Var, tu10 tu10Var, String str, ServerDirective serverDirective, BotRequest.Error[] errorArr, Continuation continuation) {
        super(2, continuation);
        this.this$0 = otq0Var;
        this.$messageMetaData = tu10Var;
        this.$triggeredElementId = str;
        this.$directive = serverDirective;
        this.$errors = errorArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ServerDirectiveHandler$handle$2(this.this$0, this.$messageMetaData, this.$triggeredElementId, this.$directive, this.$errors, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ServerDirectiveHandler$handle$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            sjh sjhVar = uyj.a;
            g6u g6uVar = o400.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$messageMetaData, this.$triggeredElementId, this.$directive, this.$errors, null);
            this.label = 1;
            if (tje.k0(g6uVar, anonymousClass1, this) == coroutineSingletons) {
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
