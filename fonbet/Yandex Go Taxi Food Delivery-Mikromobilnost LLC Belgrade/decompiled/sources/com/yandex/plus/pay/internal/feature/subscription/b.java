package com.yandex.plus.pay.internal.feature.subscription;

import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.plus.pay.api.exception.PlusPayException;
import com.yandex.plus.pay.api.model.SyncType;
import com.yandex.plus.pay.internal.model.PlusPaySubscriptionInfo;
import defpackage.bt90;
import defpackage.g8e;
import defpackage.gt90;
import defpackage.m1v0;
import defpackage.mdd0;
import defpackage.ny61;
import defpackage.s1v0;
import defpackage.t1v0;
import defpackage.tms;
import defpackage.u2e0;
import defpackage.w511;
import defpackage.y1v0;
import defpackage.zy11;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class b implements t1v0 {
    public final m1v0 a;
    public final mdd0 b;
    public final y1v0 c;

    public b(m1v0 m1v0Var, mdd0 mdd0Var, y1v0 y1v0Var) {
        this.a = m1v0Var;
        this.b = mdd0Var;
        this.c = y1v0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(6:(1:19)|20|22|23|(12:25|26|27|(2:29|(1:31)(8:32|33|(1:35)|36|(1:38)(1:85)|(1:40)(1:84)|41|42))|86|33|(0)|36|(0)(0)|(0)(0)|41|42)|87) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01a5, code lost:
    
        if (r7 == r3) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0118, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0119, code lost:
    
        r15 = r2;
        r14 = r4;
        r4 = r8;
        r2 = r11;
        r11 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x011e, code lost:
    
        r12 = r13;
        r13 = r5;
        r5 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a9 A[PHI: r2 r4 r5 r11 r12 r13 r14 r15
      0x01a9: PHI (r2v10 com.yandex.plus.pay.internal.feature.subscription.PollingSubscriptionSyncInteractor$startSubscriptionPolling$1) = 
      (r2v11 com.yandex.plus.pay.internal.feature.subscription.PollingSubscriptionSyncInteractor$startSubscriptionPolling$1)
      (r2v11 com.yandex.plus.pay.internal.feature.subscription.PollingSubscriptionSyncInteractor$startSubscriptionPolling$1)
      (r2v2 com.yandex.plus.pay.internal.feature.subscription.PollingSubscriptionSyncInteractor$startSubscriptionPolling$1)
     binds: [B:42:0x0180, B:46:0x01a5, B:103:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x01a9: PHI (r4v8 int) = (r4v10 int), (r4v10 int), (r4v23 int) binds: [B:42:0x0180, B:46:0x01a5, B:103:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x01a9: PHI (r5v10 java.lang.String) = (r5v11 java.lang.String), (r5v11 java.lang.String), (r5v23 java.lang.String) binds: [B:42:0x0180, B:46:0x01a5, B:103:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x01a9: PHI (r11v9 int) = (r11v11 int), (r11v11 int), (r11v24 int) binds: [B:42:0x0180, B:46:0x01a5, B:103:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x01a9: PHI (r12v6 int) = (r12v7 int), (r12v7 int), (r12v18 int) binds: [B:42:0x0180, B:46:0x01a5, B:103:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x01a9: PHI (r13v6 int) = (r13v7 int), (r13v7 int), (r13v30 int) binds: [B:42:0x0180, B:46:0x01a5, B:103:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x01a9: PHI (r14v7 s1v0) = (r14v8 s1v0), (r14v8 s1v0), (r14v25 s1v0) binds: [B:42:0x0180, B:46:0x01a5, B:103:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x01a9: PHI (r15v7 java.util.Set) = (r15v8 java.util.Set), (r15v8 java.util.Set), (r15v22 java.util.Set) binds: [B:42:0x0180, B:46:0x01a5, B:103:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0238 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x025c -> B:13:0x0263). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Set set, s1v0 s1v0Var, ContinuationImpl continuationImpl) {
        PollingSubscriptionSyncInteractor$startSubscriptionPolling$1 pollingSubscriptionSyncInteractor$startSubscriptionPolling$1;
        int i;
        int i2;
        Set set2;
        s1v0 s1v0Var2;
        PollingSubscriptionSyncInteractor$startSubscriptionPolling$1 pollingSubscriptionSyncInteractor$startSubscriptionPolling$12;
        int i3;
        String str2;
        String str3;
        Set set3;
        s1v0 s1v0Var3;
        int i4;
        int i5;
        int i6;
        int i7;
        Throwable th;
        Result.Failure failure;
        Continuation continuation;
        int i8;
        String str4;
        Set set4;
        s1v0 s1v0Var4;
        int i9;
        int i10;
        TimeoutCancellationException e;
        String str5;
        Set set5;
        s1v0 s1v0Var5;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        ?? r7;
        ?? r10;
        Throwable a;
        PlusPaySubscriptionInfo.SubscriptionStatus subscriptionStatus;
        int i18;
        int i19;
        if (continuationImpl instanceof PollingSubscriptionSyncInteractor$startSubscriptionPolling$1) {
            pollingSubscriptionSyncInteractor$startSubscriptionPolling$1 = (PollingSubscriptionSyncInteractor$startSubscriptionPolling$1) continuationImpl;
            int i20 = pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.label;
            if ((i20 & Integer.MIN_VALUE) != 0) {
                pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.label = i20 - Integer.MIN_VALUE;
                Object obj = pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.label;
                int i21 = 0;
                int i22 = 1;
                Continuation continuation2 = null;
                Continuation continuation3 = null;
                continuation2 = null;
                continuation2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i2 = 61;
                    set2 = set;
                    s1v0Var2 = s1v0Var;
                    pollingSubscriptionSyncInteractor$startSubscriptionPolling$12 = pollingSubscriptionSyncInteractor$startSubscriptionPolling$1;
                    i3 = 0;
                    str2 = str;
                    i19 = i2;
                    if (i3 < i19) {
                    }
                } else if (i == 1) {
                    i7 = pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$3;
                    i6 = pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$2;
                    i5 = pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$1;
                    i4 = pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$0;
                    s1v0Var3 = (s1v0) pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$2;
                    set3 = (Set) pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$1;
                    str3 = (String) pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$0;
                    try {
                        try {
                            kotlin.b.b(obj);
                        } catch (CancellationException e2) {
                            throw e2;
                        }
                    } catch (TimeoutCancellationException e3) {
                        e = e3;
                        failure = new Result.Failure(e);
                        continuation = continuation2;
                        int i23 = i5;
                        i8 = i6;
                        str4 = str3;
                        set4 = set3;
                        s1v0Var4 = s1v0Var3;
                        i9 = i4;
                        i10 = i23;
                        obj = failure;
                        r10 = continuation;
                        a = Result.a(obj);
                        if (a != null) {
                        }
                        subscriptionStatus = r10;
                        if (obj instanceof Result.Failure) {
                        }
                        PlusPaySubscriptionInfo plusPaySubscriptionInfo = (PlusPaySubscriptionInfo) obj;
                        if (plusPaySubscriptionInfo != null) {
                        }
                        if (r6 == null) {
                        }
                        zy11 zy11Var = zy11.a;
                        switch (i18) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        failure = new Result.Failure(th);
                        continuation = continuation2;
                        int i232 = i5;
                        i8 = i6;
                        str4 = str3;
                        set4 = set3;
                        s1v0Var4 = s1v0Var3;
                        i9 = i4;
                        i10 = i232;
                        obj = failure;
                        r10 = continuation;
                        a = Result.a(obj);
                        if (a != null) {
                        }
                        subscriptionStatus = r10;
                        if (obj instanceof Result.Failure) {
                        }
                        PlusPaySubscriptionInfo plusPaySubscriptionInfo2 = (PlusPaySubscriptionInfo) obj;
                        if (plusPaySubscriptionInfo2 != null) {
                        }
                        if (r6 == null) {
                        }
                        zy11 zy11Var2 = zy11.a;
                        switch (i18) {
                        }
                    }
                    int i24 = i5;
                    i8 = i6;
                    str4 = str3;
                    set4 = set3;
                    s1v0Var4 = s1v0Var3;
                    i9 = i4;
                    i10 = i24;
                    r10 = continuation3;
                    a = Result.a(obj);
                    if (a != null) {
                    }
                    subscriptionStatus = r10;
                    if (obj instanceof Result.Failure) {
                    }
                    PlusPaySubscriptionInfo plusPaySubscriptionInfo22 = (PlusPaySubscriptionInfo) obj;
                    if (plusPaySubscriptionInfo22 != null) {
                    }
                    if (r6 == null) {
                    }
                    zy11 zy11Var22 = zy11.a;
                    switch (i18) {
                    }
                } else {
                    if (i == 2) {
                        i7 = pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$3;
                        i13 = pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$2;
                        i12 = pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$1;
                        i11 = pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$0;
                        s1v0Var5 = (s1v0) pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$2;
                        set5 = (Set) pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$1;
                        str5 = (String) pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$0;
                        kotlin.b.b(obj);
                        i14 = i7;
                        i15 = i13;
                        i16 = i12;
                        i17 = i11;
                        str4 = str5;
                        set4 = set5;
                        s1v0Var4 = s1v0Var5;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$0 = str4;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$1 = set4;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$2 = s1v0Var4;
                        r7 = null;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$3 = null;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$4 = null;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$5 = null;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$6 = null;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$0 = i17;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$1 = i16;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$2 = i15;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$3 = i14;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.label = 4;
                        if (kotlinx.coroutines.a.i(1000L, pollingSubscriptionSyncInteractor$startSubscriptionPolling$1) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    if (i == 3) {
                        i7 = pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$3;
                        i8 = pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$2;
                        i10 = pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$1;
                        i9 = pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$0;
                        s1v0Var4 = (s1v0) pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$2;
                        set4 = (Set) pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$1;
                        str4 = (String) pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$0;
                        kotlin.b.b(obj);
                        i14 = i7;
                        i15 = i8;
                        i16 = i10;
                        i17 = i9;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$0 = str4;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$1 = set4;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$2 = s1v0Var4;
                        r7 = null;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$3 = null;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$4 = null;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$5 = null;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$6 = null;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$0 = i17;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$1 = i16;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$2 = i15;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$3 = i14;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.label = 4;
                        if (kotlinx.coroutines.a.i(1000L, pollingSubscriptionSyncInteractor$startSubscriptionPolling$1) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i16 = pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$1;
                    int i25 = pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$0;
                    s1v0 s1v0Var6 = (s1v0) pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$2;
                    Set set6 = (Set) pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$1;
                    String str6 = (String) pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$0;
                    kotlin.b.b(obj);
                    int i26 = 1;
                    r7 = null;
                    i2 = i25;
                    s1v0Var2 = s1v0Var6;
                    pollingSubscriptionSyncInteractor$startSubscriptionPolling$12 = pollingSubscriptionSyncInteractor$startSubscriptionPolling$1;
                    str2 = str6;
                    i3 = i16 + 1;
                    continuation2 = r7;
                    set2 = set6;
                    i22 = i26;
                    i21 = 0;
                    i19 = i2;
                    if (i3 < i19) {
                        try {
                            try {
                            } catch (TimeoutCancellationException e4) {
                                e = e4;
                                str3 = str2;
                                set3 = set2;
                                pollingSubscriptionSyncInteractor$startSubscriptionPolling$1 = pollingSubscriptionSyncInteractor$startSubscriptionPolling$12;
                                i5 = i3;
                                i7 = 0;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            str3 = str2;
                            set3 = set2;
                            i7 = i21;
                            pollingSubscriptionSyncInteractor$startSubscriptionPolling$1 = pollingSubscriptionSyncInteractor$startSubscriptionPolling$12;
                            i5 = i3;
                            i4 = i19;
                            s1v0Var3 = s1v0Var2;
                            i6 = i5;
                            failure = new Result.Failure(th);
                            continuation = continuation2;
                            int i2322 = i5;
                            i8 = i6;
                            str4 = str3;
                            set4 = set3;
                            s1v0Var4 = s1v0Var3;
                            i9 = i4;
                            i10 = i2322;
                            obj = failure;
                            r10 = continuation;
                            a = Result.a(obj);
                            if (a != null) {
                            }
                            subscriptionStatus = r10;
                            if (obj instanceof Result.Failure) {
                            }
                            PlusPaySubscriptionInfo plusPaySubscriptionInfo222 = (PlusPaySubscriptionInfo) obj;
                            if (plusPaySubscriptionInfo222 != null) {
                            }
                            if (r6 == null) {
                            }
                            zy11 zy11Var222 = zy11.a;
                            switch (i18) {
                            }
                        }
                        PollingSubscriptionSyncInteractor$startSubscriptionPolling$2$subscriptionInfo$1$1 pollingSubscriptionSyncInteractor$startSubscriptionPolling$2$subscriptionInfo$1$1 = new PollingSubscriptionSyncInteractor$startSubscriptionPolling$2$subscriptionInfo$1$1(this, str2, set2, continuation2);
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$12.L$0 = str2;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$12.L$1 = set2;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$12.L$2 = s1v0Var2;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$12.L$3 = continuation2;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$12.L$4 = continuation2;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$12.L$5 = continuation2;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$12.L$6 = continuation2;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$12.I$0 = i19;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$12.I$1 = i3;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$12.I$2 = i3;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$12.I$3 = i21;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$12.I$4 = i21;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$12.I$5 = i21;
                        pollingSubscriptionSyncInteractor$startSubscriptionPolling$12.label = i22;
                        obj = kotlinx.coroutines.a.u(2000L, pollingSubscriptionSyncInteractor$startSubscriptionPolling$2$subscriptionInfo$1$1, pollingSubscriptionSyncInteractor$startSubscriptionPolling$12);
                        if (obj != coroutineSingletons) {
                            str3 = str2;
                            set3 = set2;
                            i7 = i21;
                            pollingSubscriptionSyncInteractor$startSubscriptionPolling$1 = pollingSubscriptionSyncInteractor$startSubscriptionPolling$12;
                            i5 = i3;
                            i4 = i19;
                            s1v0Var3 = s1v0Var2;
                            i6 = i5;
                            continuation3 = continuation2;
                            int i242 = i5;
                            i8 = i6;
                            str4 = str3;
                            set4 = set3;
                            s1v0Var4 = s1v0Var3;
                            i9 = i4;
                            i10 = i242;
                            r10 = continuation3;
                            a = Result.a(obj);
                            if (a != null) {
                                boolean z = a instanceof TimeoutCancellationException;
                                tms tmsVar = gt90.a;
                                mdd0 mdd0Var = this.b;
                                if (!z) {
                                    subscriptionStatus = r10;
                                    mdd0.g(mdd0Var, tmsVar, "Error when receiving subscription status.", a, 8);
                                    if (obj instanceof Result.Failure) {
                                        obj = subscriptionStatus;
                                    }
                                    PlusPaySubscriptionInfo plusPaySubscriptionInfo2222 = (PlusPaySubscriptionInfo) obj;
                                    PlusPaySubscriptionInfo.SubscriptionStatus status = plusPaySubscriptionInfo2222 != null ? plusPaySubscriptionInfo2222.getStatus() : subscriptionStatus;
                                    i18 = status == null ? -1 : u2e0.a[status.ordinal()];
                                    zy11 zy11Var2222 = zy11.a;
                                    switch (i18) {
                                        case -1:
                                            i14 = i7;
                                            i15 = i8;
                                            i16 = i10;
                                            i17 = i9;
                                            pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$0 = str4;
                                            pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$1 = set4;
                                            pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$2 = s1v0Var4;
                                            r7 = null;
                                            pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$3 = null;
                                            pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$4 = null;
                                            pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$5 = null;
                                            pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$6 = null;
                                            pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$0 = i17;
                                            pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$1 = i16;
                                            pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$2 = i15;
                                            pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$3 = i14;
                                            pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.label = 4;
                                            if (kotlinx.coroutines.a.i(1000L, pollingSubscriptionSyncInteractor$startSubscriptionPolling$1) != coroutineSingletons) {
                                                i2 = i17;
                                                set6 = set4;
                                                i26 = 1;
                                                pollingSubscriptionSyncInteractor$startSubscriptionPolling$12 = pollingSubscriptionSyncInteractor$startSubscriptionPolling$1;
                                                str2 = str4;
                                                s1v0Var2 = s1v0Var4;
                                                i3 = i16 + 1;
                                                continuation2 = r7;
                                                set2 = set6;
                                                i22 = i26;
                                                i21 = 0;
                                                i19 = i2;
                                                if (i3 < i19) {
                                                    bt90 bt90Var = this.c.a;
                                                    LinkedHashMap y = g8e.y("requestId", "no_value", "additionalData", "no_value");
                                                    y.put(FinishFlowStatus.ORDER_ID_FIELD_NAME, str2);
                                                    y.put("_meta", bt90.b(new HashMap()));
                                                    bt90Var.c("Error.Api.SubscriptionStatus.Timeout", y);
                                                    throw new PlusPayException("Subscription synchronization retry limit exceeded", 2);
                                                }
                                            }
                                            break;
                                        case 0:
                                        default:
                                            w511.b();
                                            return subscriptionStatus;
                                        case 1:
                                        case 4:
                                        case 5:
                                        case 6:
                                            return plusPaySubscriptionInfo2222;
                                        case 2:
                                            if (!set4.isEmpty()) {
                                                if (plusPaySubscriptionInfo2222.getSynchronizationState() != null) {
                                                    Set<SyncType> set7 = set4;
                                                    if (!(set7 instanceof Collection) || !set7.isEmpty()) {
                                                        for (SyncType syncType : set7) {
                                                            PlusPaySubscriptionInfo.SynchronizationState synchronizationState = plusPaySubscriptionInfo2222.getSynchronizationState();
                                                            if (u2e0.b[syncType.ordinal()] != 1) {
                                                                w511.b();
                                                                return null;
                                                            }
                                                            if (synchronizationState.getOttSubscriptionSync() && synchronizationState.getFamilyRoleSync() && synchronizationState.getFeaturesSync()) {
                                                            }
                                                        }
                                                    }
                                                }
                                                pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$0 = str4;
                                                pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$1 = set4;
                                                pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$2 = s1v0Var4;
                                                pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$3 = null;
                                                pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$4 = null;
                                                pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$5 = null;
                                                pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$6 = null;
                                                pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$0 = i9;
                                                pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$1 = i10;
                                                pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$2 = i8;
                                                pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$3 = i7;
                                                pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.label = 2;
                                                s1v0Var4.getClass();
                                                if (zy11Var2222 != coroutineSingletons) {
                                                    Set set8 = set4;
                                                    str5 = str4;
                                                    i13 = i8;
                                                    i12 = i10;
                                                    i11 = i9;
                                                    s1v0Var5 = s1v0Var4;
                                                    set5 = set8;
                                                    i14 = i7;
                                                    i15 = i13;
                                                    i16 = i12;
                                                    i17 = i11;
                                                    str4 = str5;
                                                    set4 = set5;
                                                    s1v0Var4 = s1v0Var5;
                                                    pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$0 = str4;
                                                    pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$1 = set4;
                                                    pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$2 = s1v0Var4;
                                                    r7 = null;
                                                    pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$3 = null;
                                                    pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$4 = null;
                                                    pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$5 = null;
                                                    pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$6 = null;
                                                    pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$0 = i17;
                                                    pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$1 = i16;
                                                    pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$2 = i15;
                                                    pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$3 = i14;
                                                    pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.label = 4;
                                                    if (kotlinx.coroutines.a.i(1000L, pollingSubscriptionSyncInteractor$startSubscriptionPolling$1) != coroutineSingletons) {
                                                    }
                                                }
                                            }
                                            return plusPaySubscriptionInfo2222;
                                        case 3:
                                            pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$0 = str4;
                                            pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$1 = set4;
                                            pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$2 = s1v0Var4;
                                            PlusPaySubscriptionInfo.SubscriptionStatus subscriptionStatus2 = subscriptionStatus;
                                            pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$3 = subscriptionStatus2;
                                            pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$4 = subscriptionStatus2;
                                            pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$5 = subscriptionStatus2;
                                            pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.L$6 = subscriptionStatus2;
                                            pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$0 = i9;
                                            pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$1 = i10;
                                            pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$2 = i8;
                                            pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.I$3 = i7;
                                            pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.label = 3;
                                            s1v0Var4.getClass();
                                            break;
                                    }
                                } else {
                                    mdd0.g(mdd0Var, tmsVar, "Timeout when receiving subscription status.", r10, 12);
                                }
                            }
                            subscriptionStatus = r10;
                            if (obj instanceof Result.Failure) {
                            }
                            PlusPaySubscriptionInfo plusPaySubscriptionInfo22222 = (PlusPaySubscriptionInfo) obj;
                            if (plusPaySubscriptionInfo22222 != null) {
                            }
                            if (status == null) {
                            }
                            zy11 zy11Var22222 = zy11.a;
                            switch (i18) {
                            }
                        }
                        return coroutineSingletons;
                    }
                }
            }
        }
        pollingSubscriptionSyncInteractor$startSubscriptionPolling$1 = new PollingSubscriptionSyncInteractor$startSubscriptionPolling$1(this, continuationImpl);
        Object obj2 = pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pollingSubscriptionSyncInteractor$startSubscriptionPolling$1.label;
        int i212 = 0;
        int i222 = 1;
        Continuation continuation22 = null;
        Continuation continuation32 = null;
        continuation22 = null;
        continuation22 = null;
        if (i != 0) {
        }
    }
}
