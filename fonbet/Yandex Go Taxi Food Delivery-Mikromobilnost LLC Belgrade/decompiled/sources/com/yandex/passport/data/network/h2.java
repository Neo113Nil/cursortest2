package com.yandex.passport.data.network;

import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes8.dex */
public final class h2 implements com.yandex.passport.data.network.core.c {
    public final com.yandex.passport.data.network.core.p a;
    public final com.yandex.passport.data.network.core.h b;

    public h2(com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar) {
        this.a = pVar;
        this.b = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.yandex.passport.data.network.core.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(d2 d2Var, ContinuationImpl continuationImpl) {
        ExperimentsRequest$RequestFactory$createRequest$1 experimentsRequest$RequestFactory$createRequest$1;
        int i;
        com.yandex.passport.common.network.o oVar;
        if (continuationImpl instanceof ExperimentsRequest$RequestFactory$createRequest$1) {
            experimentsRequest$RequestFactory$createRequest$1 = (ExperimentsRequest$RequestFactory$createRequest$1) continuationImpl;
            int i2 = experimentsRequest$RequestFactory$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                experimentsRequest$RequestFactory$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = experimentsRequest$RequestFactory$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = experimentsRequest$RequestFactory$createRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.network.o oVar2 = new com.yandex.passport.common.network.o((String) this.a.a(d2Var.a, null).a);
                    oVar2.c("/1/bundle/experiments/by_device_id/");
                    oVar2.d(MetaDataField.DEVICE_ID_FIELD, d2Var.b);
                    experimentsRequest$RequestFactory$createRequest$1.L$0 = oVar2;
                    experimentsRequest$RequestFactory$createRequest$1.label = 1;
                    if (this.b.b(oVar2, experimentsRequest$RequestFactory$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    oVar = oVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oVar = (com.yandex.passport.common.network.o) experimentsRequest$RequestFactory$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return oVar.a();
            }
        }
        experimentsRequest$RequestFactory$createRequest$1 = new ExperimentsRequest$RequestFactory$createRequest$1(this, continuationImpl);
        Object obj2 = experimentsRequest$RequestFactory$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = experimentsRequest$RequestFactory$createRequest$1.label;
        if (i != 0) {
        }
        return oVar.a();
    }
}
