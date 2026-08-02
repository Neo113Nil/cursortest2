package com.yandex.messaging.ui.chatthreadscontainer;

import defpackage.ccg;
import defpackage.g4f0;
import defpackage.gtq0;
import defpackage.ht0;
import defpackage.kt11;
import defpackage.lnr0;
import defpackage.mvg;
import defpackage.n3w;
import defpackage.noh;
import defpackage.ny61;
import defpackage.r720;
import defpackage.tse;
import defpackage.v7p;
import defpackage.wls;
import defpackage.wrh;
import defpackage.x9b;
import defpackage.xvf0;
import defpackage.ybg;
import defpackage.z9n;
import defpackage.zbg;
import defpackage.zy11;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lhs31;", "<anonymous>", "(Ltse;)Lhs31;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.chatthreadscontainer.ChatThreadsContainerFragment$viewModelFactoryAsync$2$1", f = "ChatThreadsContainerFragment.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class ChatThreadsContainerFragment$viewModelFactoryAsync$2$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ ChatThreadsContainerFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatThreadsContainerFragment$viewModelFactoryAsync$2$1(ChatThreadsContainerFragment chatThreadsContainerFragment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chatThreadsContainerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatThreadsContainerFragment$viewModelFactoryAsync$2$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatThreadsContainerFragment$viewModelFactoryAsync$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        noh nohVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            nohVar = this.this$0.profileComponentAsync;
            this.label = 1;
            obj = nohVar.k(this);
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
        ccg ccgVar = ((ccg) ((kt11) obj)).b;
        x9b arguments = this.this$0.getArguments();
        arguments.getClass();
        n3w a = n3w.a(arguments);
        zbg zbgVar = ccgVar.F;
        ybg ybgVar = ccgVar.N;
        ybg ybgVar2 = ccgVar.j;
        wrh wrhVar = new wrh(zbgVar, ybgVar, ybgVar2, 27);
        ybg ybgVar3 = ccgVar.y;
        ybg ybgVar4 = ccgVar.h;
        ht0 ht0Var = new ht0((v7p) a, (xvf0) ccgVar.M0, (xvf0) ccgVar.N0, (xvf0) ybgVar4, (v7p) new z9n((xvf0) ybgVar3, (xvf0) wrhVar, (xvf0) ybgVar4, (xvf0) ybgVar2, 17, (char) 0), (xvf0) ccgVar.w, (xvf0) ccgVar.O0, 23);
        LinkedHashMap A = gtq0.A(4);
        A.put(lnr0.class, ccgVar.c);
        A.put(com.yandex.messaging.ui.banners.a.class, ccgVar.d);
        A.put(g4f0.class, ccgVar.e);
        A.put(d.class, ht0Var);
        return new r720(0, A.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A));
    }
}
