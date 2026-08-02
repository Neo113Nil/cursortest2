package com.yandex.go.scooters.subscription.pci_dss.web.js;

import defpackage.j73;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n"}, d2 = {"", "T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.subscription.pci_dss.web.js.ScootersSubscriptionJsApi$deserializeParam$2", f = "ScootersSubscriptionJsApi.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ScootersSubscriptionJsApi$deserializeParam$2 extends SuspendLambda implements wls {
    final /* synthetic */ KSerializer $serializer;
    final /* synthetic */ String[] $this_deserializeParam;
    int label;
    final /* synthetic */ ScootersSubscriptionJsApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSubscriptionJsApi$deserializeParam$2(ScootersSubscriptionJsApi scootersSubscriptionJsApi, String[] strArr, KSerializer kSerializer, Continuation continuation) {
        super(2, continuation);
        this.this$0 = scootersSubscriptionJsApi;
        this.$this_deserializeParam = strArr;
        this.$serializer = kSerializer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersSubscriptionJsApi$deserializeParam$2(this.this$0, this.$this_deserializeParam, this.$serializer, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersSubscriptionJsApi$deserializeParam$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object deserialize;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        deserialize = this.this$0.deserialize((String) j73.C(this.$this_deserializeParam), this.$serializer);
        return deserialize;
    }
}
