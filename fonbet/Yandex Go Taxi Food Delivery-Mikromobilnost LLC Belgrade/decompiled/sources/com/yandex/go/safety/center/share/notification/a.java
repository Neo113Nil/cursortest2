package com.yandex.go.safety.center.share.notification;

import com.yandex.go.safety.center.api.ShareResponse;
import defpackage.g92;
import defpackage.jst;
import defpackage.lz40;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.x6f0;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public static rol0 b(Throwable th) {
        jst.e.k(th, "Error with /share executing");
        return new rol0(new ShareStatus$Companion$handleShareError$1(2, null));
    }

    public static tpr c(ShareResponse shareResponse) {
        int i = 2;
        if (shareResponse.a) {
            ShareResponse.Message message = shareResponse.b;
            String str = message != null ? message.a : null;
            if (str != null && str.length() != 0) {
                return new g92(i, ShareStatus.NONE);
            }
        }
        return new rol0(new ShareStatus$Companion$handleShareResponse$1(2, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, lz40 lz40Var, tse tseVar, ContinuationImpl continuationImpl) {
        ShareStatus$Companion$delayShare$1 shareStatus$Companion$delayShare$1;
        int i2;
        if (continuationImpl instanceof ShareStatus$Companion$delayShare$1) {
            shareStatus$Companion$delayShare$1 = (ShareStatus$Companion$delayShare$1) continuationImpl;
            int i3 = shareStatus$Companion$delayShare$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                shareStatus$Companion$delayShare$1.label = i3 - Integer.MIN_VALUE;
                Object obj = shareStatus$Companion$delayShare$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = shareStatus$Companion$delayShare$1.label;
                if (i2 != 0) {
                    b.b(obj);
                    x6f0 b = kotlinx.coroutines.channels.b.b(tseVar, 0, new ShareStatus$Companion$delayShare$delay$1(i, null), 3);
                    x6f0 b2 = kotlinx.coroutines.channels.b.b(tseVar, 0, new ShareStatus$Companion$delayShare$forceShare$1(lz40Var, null), 3);
                    kotlinx.coroutines.selects.b bVar = new kotlinx.coroutines.selects.b(shareStatus$Companion$delayShare$1.get_context());
                    bVar.h(b.y.i(), new ShareStatus$Companion$delayShare$2$1(2, null));
                    bVar.h(b2.y.i(), new ShareStatus$Companion$delayShare$2$2(2, null));
                    shareStatus$Companion$delayShare$1.L$0 = null;
                    shareStatus$Companion$delayShare$1.L$1 = null;
                    shareStatus$Companion$delayShare$1.L$2 = null;
                    shareStatus$Companion$delayShare$1.L$3 = null;
                    shareStatus$Companion$delayShare$1.L$4 = null;
                    shareStatus$Companion$delayShare$1.I$0 = i;
                    shareStatus$Companion$delayShare$1.label = 1;
                    if (bVar.e(shareStatus$Companion$delayShare$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return zy11.a;
            }
        }
        shareStatus$Companion$delayShare$1 = new ShareStatus$Companion$delayShare$1(this, continuationImpl);
        Object obj2 = shareStatus$Companion$delayShare$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = shareStatus$Companion$delayShare$1.label;
        if (i2 != 0) {
        }
        return zy11.a;
    }
}
