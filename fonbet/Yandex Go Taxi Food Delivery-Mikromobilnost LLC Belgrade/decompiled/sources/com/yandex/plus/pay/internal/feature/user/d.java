package com.yandex.plus.pay.internal.feature.user;

import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.api.exception.PlusPayUnauthorizedException;
import com.yandex.plus.pay.api.model.PlusPayUserStatus;
import com.yandex.plus.pay.data.mb.ExternalMediaBillingApi;
import defpackage.bvf0;
import defpackage.eqj0;
import defpackage.g8e;
import defpackage.i3y;
import defpackage.izj0;
import defpackage.jj;
import defpackage.jse;
import defpackage.mdd0;
import defpackage.mwj0;
import defpackage.ndd0;
import defpackage.ny61;
import defpackage.rt21;
import defpackage.tje;
import defpackage.ygd0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class d {
    public final com.yandex.plus.domain.auth.impl.a a;
    public final ExternalMediaBillingApi b;
    public final jse c;
    public final mdd0 d;
    public final i3y e = kotlin.a.a(new eqj0(7));
    public final r0 f;
    public final r0 g;

    public d(com.yandex.plus.domain.auth.impl.a aVar, ExternalMediaBillingApi externalMediaBillingApi, jse jseVar, mdd0 mdd0Var) {
        this.a = aVar;
        this.b = externalMediaBillingApi;
        this.c = jseVar;
        this.d = mdd0Var;
        r0 c = bvf0.c(null);
        this.f = c;
        this.g = c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|(2:16|17)(2:19|20))(2:22|23))(1:24))(1:33)|25|(2:27|28)(2:31|32)))|42|6|7|(0)(0)|25|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
    
        if (r10 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0056, code lost:
    
        if (r10 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003f, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
    
        r0 = new kotlin.Result.Failure(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
    
        r10 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x003d, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0085, code lost:
    
        r0 = new kotlin.Result.Failure(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        RestUserStatusRepository$update$1 restUserStatusRepository$update$1;
        Object obj;
        int i;
        if (continuationImpl instanceof RestUserStatusRepository$update$1) {
            restUserStatusRepository$update$1 = (RestUserStatusRepository$update$1) continuationImpl;
            int i2 = restUserStatusRepository$update$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                restUserStatusRepository$update$1.label = i2 - Integer.MIN_VALUE;
                obj = restUserStatusRepository$update$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = restUserStatusRepository$update$1.label;
                r0 r0Var = this.f;
                mdd0 mdd0Var = this.d;
                if (i != 0) {
                    kotlin.b.b(obj);
                    restUserStatusRepository$update$1.label = 1;
                    obj = this.a.e(restUserStatusRepository$update$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        Throwable a = Result.a(obj);
                        if (a != null) {
                            LogPriority logPriority = LogPriority.ERROR;
                            mdd0Var.getClass();
                            ((ndd0) mdd0Var).b(logPriority, "RestUserStatusRepository", g8e.s(a, new StringBuilder("Failed to update user status: ")), a);
                            throw a;
                        }
                        ygd0 ygd0Var = (ygd0) this.e.getValue();
                        rt21 rt21Var = (rt21) ((mwj0) obj).a();
                        ygd0Var.getClass();
                        PlusPayUserStatus a2 = ygd0.a(rt21Var);
                        r0Var.getClass();
                        r0Var.m(null, a2);
                        LogPriority logPriority2 = LogPriority.INFO;
                        mdd0Var.getClass();
                        ((ndd0) mdd0Var).a(logPriority2, "RestUserStatusRepository", "User status updated successfully");
                        return a2;
                    }
                    kotlin.b.b(obj);
                }
                if (!(obj instanceof jj)) {
                    LogPriority logPriority3 = LogPriority.WARNING;
                    mdd0Var.getClass();
                    ((ndd0) mdd0Var).a(logPriority3, "RestUserStatusRepository", "update() skipped - user is not authorized");
                    r0Var.l(null);
                    throw new PlusPayUnauthorizedException(new izj0(401, "User must be authorized"));
                }
                LogPriority logPriority4 = LogPriority.DEBUG;
                mdd0Var.getClass();
                ((ndd0) mdd0Var).a(logPriority4, "RestUserStatusRepository", "Starting user status update");
                jse jseVar = this.c;
                RestUserStatusRepository$update$4$1 restUserStatusRepository$update$4$1 = new RestUserStatusRepository$update$4$1(this, null);
                restUserStatusRepository$update$1.L$0 = null;
                restUserStatusRepository$update$1.L$1 = null;
                restUserStatusRepository$update$1.L$2 = null;
                restUserStatusRepository$update$1.I$0 = 0;
                restUserStatusRepository$update$1.I$1 = 0;
                restUserStatusRepository$update$1.label = 2;
                obj = tje.k0(jseVar, restUserStatusRepository$update$4$1, restUserStatusRepository$update$1);
            }
        }
        restUserStatusRepository$update$1 = new RestUserStatusRepository$update$1(this, continuationImpl);
        obj = restUserStatusRepository$update$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = restUserStatusRepository$update$1.label;
        r0 r0Var2 = this.f;
        mdd0 mdd0Var2 = this.d;
        if (i != 0) {
        }
        if (!(obj instanceof jj)) {
        }
    }
}
