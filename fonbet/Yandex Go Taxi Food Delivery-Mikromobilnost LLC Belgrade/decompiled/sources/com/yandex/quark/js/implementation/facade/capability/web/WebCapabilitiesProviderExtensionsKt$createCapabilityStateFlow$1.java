package com.yandex.quark.js.implementation.facade.capability.web;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.yandex.quark.utils.Disposable;
import defpackage.gc41;
import defpackage.gcx;
import defpackage.jyj0;
import defpackage.loe;
import defpackage.lyj0;
import defpackage.mc41;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.syj0;
import defpackage.u28;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.alice.protos.endpoint.platform.utils.TCapability;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/squareup/wire/Message;", "State", "Ly6f0;", "Lpc41;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.js.implementation.facade.capability.web.WebCapabilitiesProviderExtensionsKt$createCapabilityStateFlow$1", f = "WebCapabilitiesProviderExtensions.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WebCapabilitiesProviderExtensionsKt$createCapabilityStateFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ ProtoAdapter<Message<Object, ?>> $adapter;
    final /* synthetic */ u28 $capability;
    final /* synthetic */ gcx $jsonConverter;
    final /* synthetic */ TCapability.ECapabilityType $type;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebCapabilitiesProviderExtensionsKt$createCapabilityStateFlow$1(u28 u28Var, ProtoAdapter protoAdapter, gcx gcxVar, TCapability.ECapabilityType eCapabilityType, Continuation continuation) {
        super(2, continuation);
        this.$capability = u28Var;
        this.$adapter = protoAdapter;
        this.$jsonConverter = gcxVar;
        this.$type = eCapabilityType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WebCapabilitiesProviderExtensionsKt$createCapabilityStateFlow$1 webCapabilitiesProviderExtensionsKt$createCapabilityStateFlow$1 = new WebCapabilitiesProviderExtensionsKt$createCapabilityStateFlow$1(this.$capability, this.$adapter, this.$jsonConverter, this.$type, continuation);
        webCapabilitiesProviderExtensionsKt$createCapabilityStateFlow$1.L$0 = obj;
        return webCapabilitiesProviderExtensionsKt$createCapabilityStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebCapabilitiesProviderExtensionsKt$createCapabilityStateFlow$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0075  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var;
        Object b;
        Object obj2;
        Object obj3;
        u28 u28Var;
        jyj0 jyj0Var;
        Object obj4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y6f0Var = (y6f0) this.L$0;
            u28 u28Var2 = this.$capability;
            b = u28Var2.b(new gc41(this.$adapter, this.$jsonConverter, this.$type, new loe(y6f0Var, 5), new loe(y6f0Var, 6), u28Var2));
            lyj0 lyj0Var = b instanceof lyj0 ? (lyj0) b : null;
            if (lyj0Var != null && (obj2 = lyj0Var.a) != null) {
                WebCapabilitiesProviderExtensionsKt$createCapabilityStateFlow$1$1$1 webCapabilitiesProviderExtensionsKt$createCapabilityStateFlow$1$1$1 = new WebCapabilitiesProviderExtensionsKt$createCapabilityStateFlow$1$1$1(0, (Disposable) obj2, Disposable.class, "dispose", "dispose()V", 0);
                this.L$0 = y6f0Var;
                this.L$1 = b;
                this.label = 1;
                if (kotlinx.coroutines.channels.b.a(y6f0Var, webCapabilitiesProviderExtensionsKt$createCapabilityStateFlow$1$1$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj3 = b;
            }
            u28Var = this.$capability;
            jyj0Var = b instanceof jyj0 ? (jyj0) b : null;
            if (jyj0Var != null && (obj4 = jyj0Var.a) != null) {
                ((x6f0) y6f0Var).d(new mc41(oyr.p("Failed to register listener for capability '", u28Var.a(), "': Failed to register duplicate capability listener")));
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        obj3 = (syj0) this.L$1;
        y6f0Var = (y6f0) this.L$0;
        kotlin.b.b(obj);
        b = obj3;
        u28Var = this.$capability;
        if (b instanceof jyj0) {
        }
        if (jyj0Var != null) {
            ((x6f0) y6f0Var).d(new mc41(oyr.p("Failed to register listener for capability '", u28Var.a(), "': Failed to register duplicate capability listener")));
        }
        return zy11.a;
    }
}
