package com.yandex.passport.data.network;

import defpackage.ny61;
import defpackage.oo31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class u3 implements com.yandex.passport.data.network.core.c {
    public final com.yandex.passport.data.network.core.p a;
    public final com.yandex.passport.data.network.core.h b;

    public u3(com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar) {
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
    public final Object a(t3 t3Var, ContinuationImpl continuationImpl) {
        GetChildCodeByUidParentRequest$RequestFactory$createRequest$1 getChildCodeByUidParentRequest$RequestFactory$createRequest$1;
        int i;
        com.yandex.passport.common.network.r rVar;
        if (continuationImpl instanceof GetChildCodeByUidParentRequest$RequestFactory$createRequest$1) {
            getChildCodeByUidParentRequest$RequestFactory$createRequest$1 = (GetChildCodeByUidParentRequest$RequestFactory$createRequest$1) continuationImpl;
            int i2 = getChildCodeByUidParentRequest$RequestFactory$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getChildCodeByUidParentRequest$RequestFactory$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getChildCodeByUidParentRequest$RequestFactory$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getChildCodeByUidParentRequest$RequestFactory$createRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.network.r g = oo31.g((String) oo31.h(t3Var.f(), this.a, t3Var.e()).a, "/1/bundle/family/get_neochild_code/");
                    g.b("Ya-Consumer-Authorization", "OAuth " + t3Var.g().getRawValue());
                    String c = t3Var.c();
                    if (c != null) {
                        g.f("client_id", c);
                    }
                    String d = t3Var.d();
                    if (d != null) {
                        g.f("client_secret", d);
                    }
                    g.f("neochild_uid", t3Var.b());
                    getChildCodeByUidParentRequest$RequestFactory$createRequest$1.L$0 = g;
                    getChildCodeByUidParentRequest$RequestFactory$createRequest$1.label = 1;
                    if (this.b.b(g, getChildCodeByUidParentRequest$RequestFactory$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rVar = g;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rVar = (com.yandex.passport.common.network.r) getChildCodeByUidParentRequest$RequestFactory$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return rVar.a();
            }
        }
        getChildCodeByUidParentRequest$RequestFactory$createRequest$1 = new GetChildCodeByUidParentRequest$RequestFactory$createRequest$1(this, continuationImpl);
        Object obj2 = getChildCodeByUidParentRequest$RequestFactory$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getChildCodeByUidParentRequest$RequestFactory$createRequest$1.label;
        if (i != 0) {
        }
        return rVar.a();
    }
}
