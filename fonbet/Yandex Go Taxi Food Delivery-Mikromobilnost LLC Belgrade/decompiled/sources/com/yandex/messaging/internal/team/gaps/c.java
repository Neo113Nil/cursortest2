package com.yandex.messaging.internal.team.gaps;

import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.internal.authorized.i;
import defpackage.c9v;
import defpackage.cl21;
import defpackage.d9g;
import defpackage.el21;
import defpackage.fi9;
import defpackage.g6u;
import defpackage.kse;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class c {
    public final el21 a;
    public final kse b;
    public final MessengerEnvironment c;
    public final c9v d = new c9v(100);

    public c(el21 el21Var, kse kseVar, MessengerEnvironment messengerEnvironment) {
        this.a = el21Var;
        this.b = kseVar;
        this.c = messengerEnvironment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, String str, ContinuationImpl continuationImpl) {
        GetUserGapsUseCase$retrieveFromNetwork$1 getUserGapsUseCase$retrieveFromNetwork$1;
        int i;
        cVar.getClass();
        if (continuationImpl instanceof GetUserGapsUseCase$retrieveFromNetwork$1) {
            getUserGapsUseCase$retrieveFromNetwork$1 = (GetUserGapsUseCase$retrieveFromNetwork$1) continuationImpl;
            int i2 = getUserGapsUseCase$retrieveFromNetwork$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getUserGapsUseCase$retrieveFromNetwork$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getUserGapsUseCase$retrieveFromNetwork$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getUserGapsUseCase$retrieveFromNetwork$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fi9 b = i.b(cVar.a);
                    getUserGapsUseCase$retrieveFromNetwork$1.L$0 = cVar;
                    getUserGapsUseCase$retrieveFromNetwork$1.L$1 = str;
                    getUserGapsUseCase$retrieveFromNetwork$1.label = 1;
                    obj = e.y(b, getUserGapsUseCase$retrieveFromNetwork$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) getUserGapsUseCase$retrieveFromNetwork$1.L$1;
                    cVar = (c) getUserGapsUseCase$retrieveFromNetwork$1.L$0;
                    kotlin.b.b(obj);
                }
                b bVar = (b) ((d9g) ((cl21) obj)).I0.get();
                g6u g6uVar = cVar.b.e;
                getUserGapsUseCase$retrieveFromNetwork$1.L$0 = null;
                getUserGapsUseCase$retrieveFromNetwork$1.L$1 = null;
                getUserGapsUseCase$retrieveFromNetwork$1.label = 2;
                Object a = bVar.a(g6uVar, str, getUserGapsUseCase$retrieveFromNetwork$1);
                return a != coroutineSingletons ? coroutineSingletons : a;
            }
        }
        getUserGapsUseCase$retrieveFromNetwork$1 = new GetUserGapsUseCase$retrieveFromNetwork$1(cVar, continuationImpl);
        Object obj2 = getUserGapsUseCase$retrieveFromNetwork$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getUserGapsUseCase$retrieveFromNetwork$1.label;
        if (i != 0) {
        }
        b bVar2 = (b) ((d9g) ((cl21) obj2)).I0.get();
        g6u g6uVar2 = cVar.b.e;
        getUserGapsUseCase$retrieveFromNetwork$1.L$0 = null;
        getUserGapsUseCase$retrieveFromNetwork$1.L$1 = null;
        getUserGapsUseCase$retrieveFromNetwork$1.label = 2;
        Object a2 = bVar2.a(g6uVar2, str, getUserGapsUseCase$retrieveFromNetwork$1);
        if (a2 != coroutineSingletons2) {
        }
    }
}
