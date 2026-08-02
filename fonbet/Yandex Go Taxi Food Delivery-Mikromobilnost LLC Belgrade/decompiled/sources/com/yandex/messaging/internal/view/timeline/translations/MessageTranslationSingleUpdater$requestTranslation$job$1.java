package com.yandex.messaging.internal.view.timeline.translations;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.translator.j;
import defpackage.m8g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s020;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.timeline.translations.MessageTranslationSingleUpdater$requestTranslation$job$1", f = "MessageTranslationSingleUpdater.kt", l = {30}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class MessageTranslationSingleUpdater$requestTranslation$job$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $messageHistoryId;
    int label;
    final /* synthetic */ f this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls020;", "Lzy11;", "<anonymous>", "(Ls020;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.internal.view.timeline.translations.MessageTranslationSingleUpdater$requestTranslation$job$1$1", f = "MessageTranslationSingleUpdater.kt", l = {31}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.internal.view.timeline.translations.MessageTranslationSingleUpdater$requestTranslation$job$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ long $messageHistoryId;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, f fVar, Continuation continuation) {
            super(2, continuation);
            this.$messageHistoryId = j;
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$messageHistoryId, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((s020) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                j jVar = (j) ((m8g) ((s020) this.L$0)).P.get();
                Set singleton = Collections.singleton(new Long(this.$messageHistoryId));
                this.label = 1;
                obj = jVar.b(singleton, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            f fVar = this.this$0;
            Iterator it = ((Set) obj).iterator();
            while (it.hasNext()) {
                fVar.c.c(((Number) it.next()).longValue());
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageTranslationSingleUpdater$requestTranslation$job$1(long j, f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$messageHistoryId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MessageTranslationSingleUpdater$requestTranslation$job$1(this.$messageHistoryId, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MessageTranslationSingleUpdater$requestTranslation$job$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0;
            com.yandex.messaging.internal.authorized.chat.b bVar = fVar.b;
            ChatRequest chatRequest = fVar.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$messageHistoryId, fVar, null);
            this.label = 1;
            if (bVar.d(chatRequest, anonymousClass1, this) == coroutineSingletons) {
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
