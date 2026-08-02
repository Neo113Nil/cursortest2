package com.yandex.go.suggest.impl.router;

import defpackage.m950;
import defpackage.mvg;
import defpackage.n9t0;
import defpackage.noh;
import defpackage.ny61;
import defpackage.ora1;
import defpackage.rdb;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.suggest.impl.router.SuperappSuggestFlexModalViewRouter$InnerNavigator$openAiAssistant$1", f = "SuperappSuggestFlexModalViewRouter.kt", l = {341}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SuperappSuggestFlexModalViewRouter$InnerNavigator$openAiAssistant$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $initialMessage;
    final /* synthetic */ noh $warmedUpDeferred;
    int label;
    final /* synthetic */ c this$0;
    final /* synthetic */ d this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappSuggestFlexModalViewRouter$InnerNavigator$openAiAssistant$1(noh nohVar, String str, c cVar, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$warmedUpDeferred = nohVar;
        this.$initialMessage = str;
        this.this$0 = cVar;
        this.this$1 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperappSuggestFlexModalViewRouter$InnerNavigator$openAiAssistant$1(this.$warmedUpDeferred, this.$initialMessage, this.this$0, this.this$1, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperappSuggestFlexModalViewRouter$InnerNavigator$openAiAssistant$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        rdb rdbVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            noh nohVar = this.$warmedUpDeferred;
            if (nohVar == null) {
                rdbVar = null;
                if (rdbVar == null) {
                    String str = this.$initialMessage;
                    if (str != null) {
                        ora1.e(((com.yandex.go.quark.dynamic.c) rdbVar).d.a, str);
                    }
                    d dVar = this.this$0.a;
                    tje.N(dVar.o(), null, CoroutineStart.UNDISPATCHED, new SuperappSuggestFlexModalViewRouter$InnerNavigator$openAiAssistant$2(dVar, rdbVar, null), 1);
                } else {
                    d dVar2 = this.this$1;
                    dVar2.A((m950) dVar2.V.get(), new n9t0(this.$warmedUpDeferred != null, this.$initialMessage), new b(this.this$0, dVar2));
                }
                return zy11.a;
            }
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
        rdbVar = (rdb) obj;
        if (rdbVar == null) {
        }
        return zy11.a;
    }
}
