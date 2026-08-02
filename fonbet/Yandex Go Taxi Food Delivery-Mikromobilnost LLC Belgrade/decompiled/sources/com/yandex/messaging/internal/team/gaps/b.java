package com.yandex.messaging.internal.team.gaps;

import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$getUserGaps$$inlined$makeCall$1;
import defpackage.g6u;
import defpackage.hts;
import defpackage.ny61;
import defpackage.oyj0;
import defpackage.tje;
import defpackage.to3;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class b {
    public final to3 a;
    public final MessengerEnvironment b;

    public b(to3 to3Var, MessengerEnvironment messengerEnvironment) {
        this.a = to3Var;
        this.b = messengerEnvironment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v2, types: [fse] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(g6u g6uVar, String str, ContinuationImpl continuationImpl) {
        GapUserRepository$getUserGaps$1 gapUserRepository$getUserGaps$1;
        int i;
        List list;
        if (continuationImpl instanceof GapUserRepository$getUserGaps$1) {
            gapUserRepository$getUserGaps$1 = (GapUserRepository$getUserGaps$1) continuationImpl;
            int i2 = gapUserRepository$getUserGaps$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gapUserRepository$getUserGaps$1.label = i2 - Integer.MIN_VALUE;
                Object obj = gapUserRepository$getUserGaps$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gapUserRepository$getUserGaps$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (hts.a[this.b.ordinal()] == 1) {
                        gapUserRepository$getUserGaps$1.label = 1;
                        g6u g6uVar2 = g6uVar;
                        if (g6uVar == null) {
                            g6uVar2 = gapUserRepository$getUserGaps$1.get_context();
                        }
                        obj = tje.k0(g6uVar2, new AuthorizedApiCallsExtensionsKt$getUserGaps$$inlined$makeCall$1(null, this.a, str), gapUserRepository$getUserGaps$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return EmptyList.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                list = (List) ((oyj0) obj).b();
                if (list != null) {
                    return list;
                }
                return EmptyList.a;
            }
        }
        gapUserRepository$getUserGaps$1 = new GapUserRepository$getUserGaps$1(this, continuationImpl);
        Object obj2 = gapUserRepository$getUserGaps$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gapUserRepository$getUserGaps$1.label;
        if (i != 0) {
        }
        list = (List) ((oyj0) obj2).b();
        if (list != null) {
        }
        return EmptyList.a;
    }
}
