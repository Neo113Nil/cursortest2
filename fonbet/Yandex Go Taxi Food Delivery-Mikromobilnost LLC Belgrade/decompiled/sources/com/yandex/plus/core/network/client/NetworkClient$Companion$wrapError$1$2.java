package com.yandex.plus.core.network.client;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sq50;
import defpackage.tls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Output", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.core.network.client.NetworkClient$Companion$wrapError$1$2", f = "NetworkClient.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class NetworkClient$Companion$wrapError$1$2 extends SuspendLambda implements tls {
    final /* synthetic */ zls $block;
    final /* synthetic */ sq50 $context;
    final /* synthetic */ Object $input;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkClient$Companion$wrapError$1$2(zls zlsVar, sq50 sq50Var, Object obj, Continuation continuation) {
        super(1, continuation);
        this.$block = zlsVar;
        this.$context = sq50Var;
        this.$input = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new NetworkClient$Companion$wrapError$1$2(this.$block, this.$context, this.$input, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((NetworkClient$Companion$wrapError$1$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        zls zlsVar = this.$block;
        sq50 sq50Var = this.$context;
        Object obj2 = this.$input;
        this.label = 1;
        Object invoke = zlsVar.invoke(sq50Var, obj2, this);
        return invoke == coroutineSingletons ? coroutineSingletons : invoke;
    }
}
