package com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.data;

import com.ybsdk.core.transfer.utils.domain.dto.PageHeaderDto;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.transfer.version2.internal.network.Transfer2Api;
import com.ybsdk.feature.transfer.version2.internal.network.dto.me2me.Me2MeDebitAutoPullPageContent;
import defpackage.b910;
import defpackage.m4m0;
import defpackage.ns;
import defpackage.ny61;
import defpackage.qxy0;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final Transfer2Api a;

    public a(Transfer2Api transfer2Api) {
        this.a = transfer2Api;
    }

    public static b910 b(Me2MeDebitAutoPullPageContent me2MeDebitAutoPullPageContent) {
        PageHeaderDto header = me2MeDebitAutoPullPageContent.getHeader();
        return new b910(header != null ? m4m0.k(header) : null, qxy0.c(me2MeDebitAutoPullPageContent.getYbLogo(), null), me2MeDebitAutoPullPageContent.getTitle(), me2MeDebitAutoPullPageContent.getDescription(), ns.a(me2MeDebitAutoPullPageContent.getButton()), me2MeDebitAutoPullPageContent.getLegal());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        Me2mConfirmPullRepository$getMe2MeDebitConfirmPull$1 me2mConfirmPullRepository$getMe2MeDebitConfirmPull$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof Me2mConfirmPullRepository$getMe2MeDebitConfirmPull$1) {
            me2mConfirmPullRepository$getMe2MeDebitConfirmPull$1 = (Me2mConfirmPullRepository$getMe2MeDebitConfirmPull$1) continuationImpl;
            int i2 = me2mConfirmPullRepository$getMe2MeDebitConfirmPull$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                me2mConfirmPullRepository$getMe2MeDebitConfirmPull$1.label = i2 - Integer.MIN_VALUE;
                Object obj = me2mConfirmPullRepository$getMe2MeDebitConfirmPull$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = me2mConfirmPullRepository$getMe2MeDebitConfirmPull$1.label;
                if (i != 0) {
                    b.b(obj);
                    Me2mConfirmPullRepository$getMe2MeDebitConfirmPull$2 me2mConfirmPullRepository$getMe2MeDebitConfirmPull$2 = new Me2mConfirmPullRepository$getMe2MeDebitConfirmPull$2(this, str, str2, null);
                    me2mConfirmPullRepository$getMe2MeDebitConfirmPull$1.label = 1;
                    c = c.c(me2mConfirmPullRepository$getMe2MeDebitConfirmPull$2, me2mConfirmPullRepository$getMe2MeDebitConfirmPull$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                Me2mConfirmPullRepository$getMe2MeDebitConfirmPull$3$1 me2mConfirmPullRepository$getMe2MeDebitConfirmPull$3$1 = new Me2mConfirmPullRepository$getMe2MeDebitConfirmPull$3$1(this, null);
                me2mConfirmPullRepository$getMe2MeDebitConfirmPull$1.label = 2;
                Object f = com.ybsdk.core.utils.dto.b.f((DataWithStatusResponse) c, me2mConfirmPullRepository$getMe2MeDebitConfirmPull$3$1, me2mConfirmPullRepository$getMe2MeDebitConfirmPull$1);
                return f == coroutineSingletons ? coroutineSingletons : f;
            }
        }
        me2mConfirmPullRepository$getMe2MeDebitConfirmPull$1 = new Me2mConfirmPullRepository$getMe2MeDebitConfirmPull$1(this, continuationImpl);
        Object obj2 = me2mConfirmPullRepository$getMe2MeDebitConfirmPull$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = me2mConfirmPullRepository$getMe2MeDebitConfirmPull$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
