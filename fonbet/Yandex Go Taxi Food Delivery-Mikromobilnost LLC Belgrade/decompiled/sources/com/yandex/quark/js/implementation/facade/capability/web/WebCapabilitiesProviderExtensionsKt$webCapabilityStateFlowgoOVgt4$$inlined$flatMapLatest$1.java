package com.yandex.quark.js.implementation.facade.capability.web;

import com.squareup.wire.ProtoAdapter;
import defpackage.g92;
import defpackage.gcx;
import defpackage.mvg;
import defpackage.nc41;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.u28;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.yandex.alice.protos.endpoint.platform.utils.TCapability;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "R", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.js.implementation.facade.capability.web.WebCapabilitiesProviderExtensionsKt$webCapabilityStateFlow-goOVgt4$$inlined$flatMapLatest$1", f = "WebCapabilitiesProviderExtensions.kt", l = {190}, m = "invokeSuspend")
/* renamed from: com.yandex.quark.js.implementation.facade.capability.web.WebCapabilitiesProviderExtensionsKt$webCapabilityStateFlow-goOVgt4$$inlined$flatMapLatest$1, reason: invalid class name */
/* loaded from: classes8.dex */
public final class WebCapabilitiesProviderExtensionsKt$webCapabilityStateFlowgoOVgt4$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ ProtoAdapter $adapter$inlined;
    final /* synthetic */ gcx $jsonConverter$inlined;
    final /* synthetic */ TCapability.ECapabilityType $type$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebCapabilitiesProviderExtensionsKt$webCapabilityStateFlowgoOVgt4$$inlined$flatMapLatest$1(Continuation continuation, TCapability.ECapabilityType eCapabilityType, ProtoAdapter protoAdapter, gcx gcxVar) {
        super(3, continuation);
        this.$type$inlined = eCapabilityType;
        this.$adapter$inlined = protoAdapter;
        this.$jsonConverter$inlined = gcxVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        WebCapabilitiesProviderExtensionsKt$webCapabilityStateFlowgoOVgt4$$inlined$flatMapLatest$1 webCapabilitiesProviderExtensionsKt$webCapabilityStateFlowgoOVgt4$$inlined$flatMapLatest$1 = new WebCapabilitiesProviderExtensionsKt$webCapabilityStateFlowgoOVgt4$$inlined$flatMapLatest$1((Continuation) obj3, this.$type$inlined, this.$adapter$inlined, this.$jsonConverter$inlined);
        webCapabilitiesProviderExtensionsKt$webCapabilityStateFlowgoOVgt4$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        webCapabilitiesProviderExtensionsKt$webCapabilityStateFlowgoOVgt4$$inlined$flatMapLatest$1.L$1 = obj2;
        return webCapabilitiesProviderExtensionsKt$webCapabilityStateFlowgoOVgt4$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            u28 u28Var = (u28) this.L$1;
            if (u28Var == null) {
                g = new g92(2, nc41.a);
            } else {
                g = e.g(new WebCapabilitiesProviderExtensionsKt$createCapabilityStateFlow$1(u28Var, this.$adapter$inlined, this.$jsonConverter$inlined, this.$type$inlined, null));
            }
            this.label = 1;
            if (e.u(g, vprVar, this) == coroutineSingletons) {
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
