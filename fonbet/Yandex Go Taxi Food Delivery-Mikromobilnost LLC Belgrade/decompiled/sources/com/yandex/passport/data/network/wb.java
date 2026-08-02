package com.yandex.passport.data.network;

import com.yandex.passport.data.network.core.DataEvents;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class wb extends com.yandex.passport.data.network.core.a {
    public final com.yandex.passport.internal.network.c f;
    public final sb g;
    public final com.yandex.passport.data.network.core.s h;

    public wb(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, sb sbVar, com.yandex.passport.data.network.core.s sVar) {
        super(aVar, cVar, l0Var, new com.yandex.passport.common.network.u(vb.Companion.serializer(), com.yandex.passport.common.network.x.Companion.serializer()), new com.yandex.passport.data.network.core.j());
        this.f = cVar;
        this.g = sbVar;
        this.h = sVar;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.data.network.core.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(rb rbVar, ContinuationImpl continuationImpl) {
        SendAuthToTrackRequest$run$1 sendAuthToTrackRequest$run$1;
        int i;
        if (continuationImpl instanceof SendAuthToTrackRequest$run$1) {
            sendAuthToTrackRequest$run$1 = (SendAuthToTrackRequest$run$1) continuationImpl;
            int i2 = sendAuthToTrackRequest$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sendAuthToTrackRequest$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sendAuthToTrackRequest$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sendAuthToTrackRequest$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.data.network.core.r rVar = new com.yandex.passport.data.network.core.r(rbVar, "SendAuthToTrackRequest", new s0(this, rbVar, 2));
                    sendAuthToTrackRequest$run$1.L$0 = this;
                    sendAuthToTrackRequest$run$1.label = 1;
                    obj = this.h.a(rVar, sendAuthToTrackRequest$run$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (wb) sendAuthToTrackRequest$run$1.L$0;
                    kotlin.b.b(obj);
                }
                this.f.b(((Result) obj).getValue(), DataEvents.SendAuthToTrack);
                return obj;
            }
        }
        sendAuthToTrackRequest$run$1 = new SendAuthToTrackRequest$run$1(this, continuationImpl);
        Object obj2 = sendAuthToTrackRequest$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sendAuthToTrackRequest$run$1.label;
        if (i != 0) {
        }
        this.f.b(((Result) obj2).getValue(), DataEvents.SendAuthToTrack);
        return obj2;
    }
}
