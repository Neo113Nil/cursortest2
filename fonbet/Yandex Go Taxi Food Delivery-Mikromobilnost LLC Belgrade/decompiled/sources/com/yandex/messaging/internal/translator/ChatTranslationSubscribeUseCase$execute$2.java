package com.yandex.messaging.internal.translator;

import com.yandex.messaging.ChatRequest;
import defpackage.b1s;
import defpackage.jz01;
import defpackage.kgx;
import defpackage.kse;
import defpackage.l8x;
import defpackage.m8g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.op3;
import defpackage.s020;
import defpackage.s8x;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.z83;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.translator.ChatTranslationSubscribeUseCase$execute$2", f = "ChatTranslationSubscribeUseCase.kt", l = {25, 27}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatTranslationSubscribeUseCase$execute$2 extends SuspendLambda implements wls {
    final /* synthetic */ ChatRequest $chatRequest;
    final /* synthetic */ String $language;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatTranslationSubscribeUseCase$execute$2(a aVar, ChatRequest chatRequest, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$chatRequest = chatRequest;
        this.$language = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatTranslationSubscribeUseCase$execute$2(this.this$0, this.$chatRequest, this.$language, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatTranslationSubscribeUseCase$execute$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0032, code lost:
    
        if (r11 == r0) goto L43;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b1s b1sVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            if (aVar.b.p != null) {
                com.yandex.messaging.internal.authorized.chat.b bVar = aVar.a;
                ChatRequest chatRequest = this.$chatRequest;
                this.label = 1;
                obj = bVar.a(chatRequest, this);
            }
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        final j jVar = (j) ((m8g) ((s020) obj)).P.get();
        String str = this.$language;
        this.label = 2;
        kse kseVar = jVar.a;
        op3 op3Var = jVar.l;
        kse.a(kseVar);
        ArrayList arrayList = jVar.m;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                l8x l8xVar = (l8x) it.next();
                if (!l8xVar.k0() && !l8xVar.isCancelled()) {
                    break;
                }
            }
        }
        kgx[] kgxVarArr = j.n;
        kgx kgxVar = kgxVarArr[0];
        op3Var.a();
        z83.i();
        arrayList.clear();
        jz01 jz01Var = jVar.c;
        kse.a(jz01Var.c);
        if (jz01Var.d != null) {
            z83.i();
            b1sVar = jz01Var.d;
            if (b1sVar == null) {
                ny61.r("must be initialized");
                return null;
            }
        } else {
            b1s b1sVar2 = new b1s(jz01Var, str);
            jz01Var.d = b1sVar2;
            b1sVar = b1sVar2;
        }
        kgx kgxVar2 = kgxVarArr[0];
        op3Var.b(b1sVar);
        final s8x s8xVar = new s8x(kotlinx.coroutines.a.n(get_context()));
        s8xVar.w(new tls() { // from class: com.yandex.messaging.internal.translator.i
            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                j jVar2 = j.this;
                tje.N(jVar2.b, null, null, new TranslationController$subscribeForTranslations$4$1(jVar2, s8xVar, null), 3);
                return zy11.a;
            }
        });
        arrayList.add(s8xVar);
        Object u0 = s8xVar.u0(this);
        if (u0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            u0 = zy11Var;
        }
        return u0 == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
