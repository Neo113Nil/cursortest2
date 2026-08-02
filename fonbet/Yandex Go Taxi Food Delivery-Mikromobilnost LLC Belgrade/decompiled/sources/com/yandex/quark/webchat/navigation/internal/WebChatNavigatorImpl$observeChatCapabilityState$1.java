package com.yandex.quark.webchat.navigation.internal;

import defpackage.exz0;
import defpackage.fxz0;
import defpackage.g4x0;
import defpackage.jl40;
import defpackage.mc41;
import defpackage.mvg;
import defpackage.nc41;
import defpackage.ny61;
import defpackage.oc41;
import defpackage.pc41;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpc41;", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability;", "chatCapabilityState", "Lzy11;", "<anonymous>", "(Lpc41;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.webchat.navigation.internal.WebChatNavigatorImpl$observeChatCapabilityState$1", f = "WebChatNavigatorImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class WebChatNavigatorImpl$observeChatCapabilityState$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebChatNavigatorImpl$observeChatCapabilityState$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WebChatNavigatorImpl$observeChatCapabilityState$1 webChatNavigatorImpl$observeChatCapabilityState$1 = new WebChatNavigatorImpl$observeChatCapabilityState$1(this.this$0, continuation);
        webChatNavigatorImpl$observeChatCapabilityState$1.L$0 = obj;
        return webChatNavigatorImpl$observeChatCapabilityState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        WebChatNavigatorImpl$observeChatCapabilityState$1 webChatNavigatorImpl$observeChatCapabilityState$1 = (WebChatNavigatorImpl$observeChatCapabilityState$1) create((pc41) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        webChatNavigatorImpl$observeChatCapabilityState$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TAliceChatCapability.TNavigationState navigationState;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        pc41 pc41Var = (pc41) this.L$0;
        a aVar = this.this$0;
        r0 r0Var = aVar.d;
        boolean z = pc41Var instanceof oc41;
        Object obj2 = fxz0.a;
        if (z) {
            TAliceChatCapability.TState state = ((TAliceChatCapability) ((oc41) pc41Var).a()).getState();
            TAliceChatCapability.TChatNavigationEntry topmostNavigationEntry = (state == null || (navigationState = state.getNavigationState()) == null) ? null : navigationState.getTopmostNavigationEntry();
            if (topmostNavigationEntry != null) {
                obj2 = new exz0(g4x0.a(topmostNavigationEntry));
            }
        } else if (pc41Var instanceof mc41) {
            aVar.b.f("WebChatNavigator", ((mc41) pc41Var).a());
        } else if (!jl40.l(pc41Var, nc41.a)) {
            w511.b();
            return null;
        }
        r0Var.getClass();
        r0Var.m(null, obj2);
        return zy11.a;
    }
}
