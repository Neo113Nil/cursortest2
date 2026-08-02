package com.yandex.messaging.internal.view.timeline.translations;

import com.yandex.messaging.ChatRequest;
import defpackage.acb;
import defpackage.j3b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pi00;
import defpackage.tse;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.timeline.translations.MessageTextTranslationHelper$bind$2", f = "MessageTextTranslationHelper.kt", l = {219, 228}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class MessageTextTranslationHelper$bind$2 extends SuspendLambda implements wls {
    final /* synthetic */ acb $chatDependencies;
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj3b;", "chatInfo", "", "lang", "Lzy11;", "<anonymous>", "(Lj3b;Ljava/lang/String;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.internal.view.timeline.translations.MessageTextTranslationHelper$bind$2$1", f = "MessageTextTranslationHelper.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.internal.view.timeline.translations.MessageTextTranslationHelper$bind$2$1, reason: invalid class name */
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
            cVar.J = j3bVar;
            cVar.F = str;
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageTextTranslationHelper$bind$2(c cVar, acb acbVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$chatDependencies = acbVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MessageTextTranslationHelper$bind$2(this.this$0, this.$chatDependencies, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MessageTextTranslationHelper$bind$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r8 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            cVar = this.this$0;
            com.yandex.messaging.domain.personal.a aVar = cVar.b;
            this.L$0 = cVar;
            this.label = 1;
            obj = aVar.a(zy11Var, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cVar = (c) this.L$0;
            kotlin.b.b(obj);
        }
        cVar.v = (String) obj;
        ChatRequest chatRequest = this.$chatDependencies.d;
        m0 m0Var = new m0(this.this$0.a.a(chatRequest), this.this$0.c.b(chatRequest), new AnonymousClass1(this.this$0, null));
        pi00 pi00Var = new pi00(3, this.this$0);
        this.L$0 = null;
        this.label = 2;
        return m0Var.collect(pi00Var, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
