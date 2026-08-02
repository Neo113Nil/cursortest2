package com.yandex.passport.data.network;

import defpackage.ny61;
import defpackage.oo31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class l3 implements com.yandex.passport.data.network.core.c {
    public final com.yandex.passport.data.network.core.p a;
    public final com.yandex.passport.data.network.core.h b;

    public l3(com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar) {
        this.a = pVar;
        this.b = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.data.network.core.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(j3 j3Var, ContinuationImpl continuationImpl) {
        GetChallengeRequest$RequestFactory$createRequest$1 getChallengeRequest$RequestFactory$createRequest$1;
        int i;
        com.yandex.passport.common.network.s sVar;
        if (continuationImpl instanceof GetChallengeRequest$RequestFactory$createRequest$1) {
            getChallengeRequest$RequestFactory$createRequest$1 = (GetChallengeRequest$RequestFactory$createRequest$1) continuationImpl;
            int i2 = getChallengeRequest$RequestFactory$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getChallengeRequest$RequestFactory$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getChallengeRequest$RequestFactory$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getChallengeRequest$RequestFactory$createRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.network.u h = oo31.h(j3Var.b(), this.a, j3Var.a());
                    com.yandex.passport.common.network.s sVar2 = new com.yandex.passport.common.network.s((String) h.a, new k3(0, h, j3Var));
                    sVar2.c("/external-score");
                    getChallengeRequest$RequestFactory$createRequest$1.L$0 = sVar2;
                    getChallengeRequest$RequestFactory$createRequest$1.label = 1;
                    if (this.b.b(sVar2, getChallengeRequest$RequestFactory$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    sVar = sVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sVar = (com.yandex.passport.common.network.s) getChallengeRequest$RequestFactory$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return sVar.a();
            }
        }
        getChallengeRequest$RequestFactory$createRequest$1 = new GetChallengeRequest$RequestFactory$createRequest$1(this, continuationImpl);
        Object obj2 = getChallengeRequest$RequestFactory$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getChallengeRequest$RequestFactory$createRequest$1.label;
        if (i != 0) {
        }
        return sVar.a();
    }
}
