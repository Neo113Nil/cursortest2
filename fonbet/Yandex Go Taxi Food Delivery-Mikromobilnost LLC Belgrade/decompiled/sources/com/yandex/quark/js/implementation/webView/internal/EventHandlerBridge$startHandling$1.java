package com.yandex.quark.js.implementation.webView.internal;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.yandex.quark.js.event.i;
import defpackage.ci9;
import defpackage.jq6;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.js.implementation.webView.internal.EventHandlerBridge$startHandling$1", f = "EventHandlerBridge.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE, 70}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class EventHandlerBridge$startHandling$1 extends SuspendLambda implements wls {
    final /* synthetic */ ci9 $this_startHandling;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventHandlerBridge$startHandling$1(ci9 ci9Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$this_startHandling = ci9Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EventHandlerBridge$startHandling$1(this.$this_startHandling, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EventHandlerBridge$startHandling$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
    
        if (com.yandex.quark.js.implementation.webView.internal.a.b(r4, r10, r9) == r0) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x006c -> B:6:0x0013). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jq6 it;
        jq6 jq6Var;
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            it = this.$this_startHandling.iterator();
            this.L$0 = it;
            this.label = 1;
            a = it.a(this);
            if (a != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jq6Var = (jq6) this.L$0;
            kotlin.b.b(obj);
            it = jq6Var;
            this.L$0 = it;
            this.label = 1;
            a = it.a(this);
            if (a != coroutineSingletons) {
                jq6Var = it;
                obj = a;
                if (((Boolean) obj).booleanValue()) {
                    return zy11.a;
                }
                i iVar = (i) jq6Var.b();
                this.this$0.a.c("EventHandlerBridge", "Try handle event type = " + iVar.a);
                a aVar = this.this$0;
                this.L$0 = jq6Var;
                this.label = 2;
            }
            return coroutineSingletons;
        }
        jq6Var = (jq6) this.L$0;
        kotlin.b.b(obj);
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
