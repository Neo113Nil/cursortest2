package com.yandex.passport.data.network;

import defpackage.ny61;
import defpackage.oo31;
import defpackage.qje;
import defpackage.wg10;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;

/* loaded from: classes8.dex */
public final class wd implements com.yandex.passport.data.network.core.c {
    public final com.yandex.passport.data.network.core.p a;
    public final com.yandex.passport.data.network.core.h b;

    public wd(com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar) {
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
    public final Object a(vd vdVar, ContinuationImpl continuationImpl) {
        UpdateAvatarRequest$RequestFactory$createRequest$1 updateAvatarRequest$RequestFactory$createRequest$1;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (continuationImpl instanceof UpdateAvatarRequest$RequestFactory$createRequest$1) {
            updateAvatarRequest$RequestFactory$createRequest$1 = (UpdateAvatarRequest$RequestFactory$createRequest$1) continuationImpl;
            int i2 = updateAvatarRequest$RequestFactory$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateAvatarRequest$RequestFactory$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = updateAvatarRequest$RequestFactory$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateAvatarRequest$RequestFactory$createRequest$1.label;
                wg10 wg10Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.network.p pVar2 = new com.yandex.passport.common.network.p((String) oo31.h(vdVar.d(), this.a, vdVar.c()).a);
                    pVar2.c("/2/change_avatar/");
                    pVar2.b("Ya-Consumer-Authorization", "OAuth " + vdVar.e());
                    pVar2.f("default", "true");
                    Regex regex = wg10.e;
                    try {
                        wg10Var = qje.o("image/jpeg");
                    } catch (IllegalArgumentException unused) {
                    }
                    pVar2.i(wg10Var, vdVar.b());
                    updateAvatarRequest$RequestFactory$createRequest$1.L$0 = pVar2;
                    updateAvatarRequest$RequestFactory$createRequest$1.label = 1;
                    if (this.b.b(pVar2, updateAvatarRequest$RequestFactory$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    pVar = pVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = (com.yandex.passport.common.network.p) updateAvatarRequest$RequestFactory$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return pVar.a();
            }
        }
        updateAvatarRequest$RequestFactory$createRequest$1 = new UpdateAvatarRequest$RequestFactory$createRequest$1(this, continuationImpl);
        Object obj2 = updateAvatarRequest$RequestFactory$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateAvatarRequest$RequestFactory$createRequest$1.label;
        wg10 wg10Var2 = null;
        if (i != 0) {
        }
        return pVar.a();
    }
}
