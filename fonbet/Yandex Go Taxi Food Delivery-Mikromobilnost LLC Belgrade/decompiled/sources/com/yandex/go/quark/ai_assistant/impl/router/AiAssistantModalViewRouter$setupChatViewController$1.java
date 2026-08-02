package com.yandex.go.quark.ai_assistant.impl.router;

import defpackage.hm1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.odb;
import defpackage.ora1;
import defpackage.rdb;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.quark.ai_assistant.impl.router.AiAssistantModalViewRouter$setupChatViewController$1", f = "AiAssistantModalViewRouter.kt", l = {150}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AiAssistantModalViewRouter$setupChatViewController$1 extends SuspendLambda implements wls {
    final /* synthetic */ rdb $chatViewController;
    final /* synthetic */ hm1 $payload;
    int label;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.quark.ai_assistant.impl.router.AiAssistantModalViewRouter$setupChatViewController$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(((odb) this.receiver).equals(obj));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiAssistantModalViewRouter$setupChatViewController$1(rdb rdbVar, hm1 hm1Var, Continuation continuation) {
        super(2, continuation);
        this.$chatViewController = rdbVar;
        this.$payload = hm1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AiAssistantModalViewRouter$setupChatViewController$1(this.$chatViewController, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AiAssistantModalViewRouter$setupChatViewController$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g b = ((com.yandex.go.quark.dynamic.c) this.$chatViewController).b();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, odb.a, odb.class, "equals", "equals(Ljava/lang/Object;)Z", 4);
            this.label = 1;
            if (e.x(b, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        String str = this.$payload.d;
        if (str != null) {
            ora1.e(((com.yandex.go.quark.dynamic.c) this.$chatViewController).d.a, str);
        }
        return zy11.a;
    }
}
