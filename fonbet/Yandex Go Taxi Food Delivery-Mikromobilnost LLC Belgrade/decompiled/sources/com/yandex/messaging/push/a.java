package com.yandex.messaging.push;

import defpackage.bvf0;
import defpackage.ny61;
import defpackage.p8g;
import defpackage.tse;
import defpackage.v320;
import defpackage.vpr;
import defpackage.y1g0;
import defpackage.y9i0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class a implements vpr {
    public final /* synthetic */ y9i0 a;
    public final /* synthetic */ tse b;

    public a(y9i0 y9i0Var, tse tseVar) {
        this.a = y9i0Var;
        this.b = tseVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(v320 v320Var, Continuation continuation) {
        CloudMessageHandler$onCloudMessageReceivedWithoutAwaiting$1$1$emit$1 cloudMessageHandler$onCloudMessageReceivedWithoutAwaiting$1$1$emit$1;
        Object obj;
        int i;
        if (continuation instanceof CloudMessageHandler$onCloudMessageReceivedWithoutAwaiting$1$1$emit$1) {
            cloudMessageHandler$onCloudMessageReceivedWithoutAwaiting$1$1$emit$1 = (CloudMessageHandler$onCloudMessageReceivedWithoutAwaiting$1$1$emit$1) continuation;
            int i2 = cloudMessageHandler$onCloudMessageReceivedWithoutAwaiting$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cloudMessageHandler$onCloudMessageReceivedWithoutAwaiting$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                obj = cloudMessageHandler$onCloudMessageReceivedWithoutAwaiting$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cloudMessageHandler$onCloudMessageReceivedWithoutAwaiting$1$1$emit$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    y1g0 y1g0Var = (y1g0) ((p8g) v320Var).Y.get();
                    cloudMessageHandler$onCloudMessageReceivedWithoutAwaiting$1$1$emit$1.L$0 = this;
                    cloudMessageHandler$onCloudMessageReceivedWithoutAwaiting$1$1$emit$1.label = 1;
                    obj = y1g0Var.a.a(this.a, cloudMessageHandler$onCloudMessageReceivedWithoutAwaiting$1$1$emit$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (a) cloudMessageHandler$onCloudMessageReceivedWithoutAwaiting$1$1$emit$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    bvf0.j(this.b, null);
                }
                return zy11.a;
            }
        }
        cloudMessageHandler$onCloudMessageReceivedWithoutAwaiting$1$1$emit$1 = new CloudMessageHandler$onCloudMessageReceivedWithoutAwaiting$1$1$emit$1(this, continuation);
        obj = cloudMessageHandler$onCloudMessageReceivedWithoutAwaiting$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cloudMessageHandler$onCloudMessageReceivedWithoutAwaiting$1$1$emit$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return zy11.a;
    }
}
