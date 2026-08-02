package com.yandex.go.navigator.domain;

import defpackage.dd61;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.zzs;
import java.io.Serializable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class b0 {
    public final po21 a;
    public final ru.yandex.taxi.deeplinks.e b;

    public b0(po21 po21Var, ru.yandex.taxi.deeplinks.e eVar) {
        this.a = po21Var;
        this.b = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(ContinuationImpl continuationImpl) {
        UserAddressByLocationInteractor$userAddress$1 userAddressByLocationInteractor$userAddress$1;
        int i;
        if (continuationImpl instanceof UserAddressByLocationInteractor$userAddress$1) {
            userAddressByLocationInteractor$userAddress$1 = (UserAddressByLocationInteractor$userAddress$1) continuationImpl;
            int i2 = userAddressByLocationInteractor$userAddress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userAddressByLocationInteractor$userAddress$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userAddressByLocationInteractor$userAddress$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userAddressByLocationInteractor$userAddress$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    userAddressByLocationInteractor$userAddress$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.a).g(userAddressByLocationInteractor$userAddress$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return ((dd61) obj).a().a;
                    }
                    kotlin.b.b(obj);
                }
                zzs a = ((mo21) obj).a();
                userAddressByLocationInteractor$userAddress$1.L$0 = null;
                userAddressByLocationInteractor$userAddress$1.label = 2;
                obj = this.b.e(a, null, false, false, userAddressByLocationInteractor$userAddress$1);
            }
        }
        userAddressByLocationInteractor$userAddress$1 = new UserAddressByLocationInteractor$userAddress$1(this, continuationImpl);
        Object obj2 = userAddressByLocationInteractor$userAddress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userAddressByLocationInteractor$userAddress$1.label;
        if (i != 0) {
        }
        zzs a2 = ((mo21) obj2).a();
        userAddressByLocationInteractor$userAddress$1.L$0 = null;
        userAddressByLocationInteractor$userAddress$1.label = 2;
        obj2 = this.b.e(a2, null, false, false, userAddressByLocationInteractor$userAddress$1);
    }
}
