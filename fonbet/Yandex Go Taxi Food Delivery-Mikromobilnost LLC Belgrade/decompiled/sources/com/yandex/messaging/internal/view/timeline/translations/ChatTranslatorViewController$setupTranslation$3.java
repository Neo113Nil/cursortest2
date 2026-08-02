package com.yandex.messaging.internal.view.timeline.translations;

import com.yandex.messaging.ChatRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pcb;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.timeline.translations.ChatTranslatorViewController$setupTranslation$3", f = "ChatTranslatorViewController.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatTranslatorViewController$setupTranslation$3 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ pcb this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "lang", "Lzy11;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.internal.view.timeline.translations.ChatTranslatorViewController$setupTranslation$3$1", f = "ChatTranslatorViewController.kt", l = {70}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.internal.view.timeline.translations.ChatTranslatorViewController$setupTranslation$3$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ pcb this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(pcb pcbVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = pcbVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                String str = (String) this.L$0;
                if (str != null) {
                    pcb pcbVar = this.this$0;
                    com.yandex.messaging.internal.translator.a aVar = pcbVar.f;
                    ChatRequest chatRequest = pcbVar.a;
                    this.label = 1;
                    if (aVar.a(chatRequest, str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatTranslatorViewController$setupTranslation$3(pcb pcbVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pcbVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatTranslatorViewController$setupTranslation$3(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatTranslatorViewController$setupTranslation$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pcb pcbVar = this.this$0;
            tpr a = pcbVar.c.a(pcbVar.a);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.k(a, anonymousClass1, this) == coroutineSingletons) {
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
