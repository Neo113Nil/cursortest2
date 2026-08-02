package com.yandex.passport.data.network;

import defpackage.ny61;
import defpackage.oo31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class d0 implements com.yandex.passport.data.network.core.c {
    public final com.yandex.passport.data.network.core.p a;
    public final com.yandex.passport.data.network.core.h b;

    public d0(com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar) {
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
    public final Object a(c0 c0Var, ContinuationImpl continuationImpl) {
        CheckAgeByTrackIdRequest$RequestFactory$createRequest$1 checkAgeByTrackIdRequest$RequestFactory$createRequest$1;
        int i;
        com.yandex.passport.common.network.o oVar;
        if (continuationImpl instanceof CheckAgeByTrackIdRequest$RequestFactory$createRequest$1) {
            checkAgeByTrackIdRequest$RequestFactory$createRequest$1 = (CheckAgeByTrackIdRequest$RequestFactory$createRequest$1) continuationImpl;
            int i2 = checkAgeByTrackIdRequest$RequestFactory$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkAgeByTrackIdRequest$RequestFactory$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = checkAgeByTrackIdRequest$RequestFactory$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkAgeByTrackIdRequest$RequestFactory$createRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.network.o oVar2 = new com.yandex.passport.common.network.o((String) oo31.h(0L, this.a, c0Var.d).a);
                    oVar2.c("1/bundle/biometrics/ebs/check_face_recognized/");
                    oVar2.b("Authorization", "OAuth " + c0Var.a.getRawValue());
                    oVar2.d("track_id", c0Var.b);
                    String str = c0Var.c;
                    if (str != null) {
                        oVar2.d("flow_id", str);
                    }
                    checkAgeByTrackIdRequest$RequestFactory$createRequest$1.L$0 = oVar2;
                    checkAgeByTrackIdRequest$RequestFactory$createRequest$1.label = 1;
                    if (this.b.b(oVar2, checkAgeByTrackIdRequest$RequestFactory$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    oVar = oVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oVar = (com.yandex.passport.common.network.o) checkAgeByTrackIdRequest$RequestFactory$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return oVar.a();
            }
        }
        checkAgeByTrackIdRequest$RequestFactory$createRequest$1 = new CheckAgeByTrackIdRequest$RequestFactory$createRequest$1(this, continuationImpl);
        Object obj2 = checkAgeByTrackIdRequest$RequestFactory$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkAgeByTrackIdRequest$RequestFactory$createRequest$1.label;
        if (i != 0) {
        }
        return oVar.a();
    }
}
