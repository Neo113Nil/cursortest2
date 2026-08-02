package com.yandex.plus.pay.internal.feature.cache;

import com.yandex.plus.pay.internal.feature.user.c;
import com.yandex.plus.pay.internal.feature.user.d;
import defpackage.gt90;
import defpackage.mdd0;
import defpackage.ny61;
import defpackage.tms;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public final mdd0 a;
    public final d b;
    public final c c;
    public final com.yandex.plus.pay.graphql.offers.a d;

    public a(mdd0 mdd0Var, d dVar, c cVar, com.yandex.plus.pay.graphql.offers.a aVar) {
        this.a = mdd0Var;
        this.b = dVar;
        this.c = cVar;
        this.d = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b2, code lost:
    
        if (r11.a(r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009b, code lost:
    
        if (r12.a(r0) != r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0084, code lost:
    
        if (r4 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        DefaultResetCacheInteractor$resetCache$1 defaultResetCacheInteractor$resetCache$1;
        int i;
        try {
            try {
                try {
                    if (continuationImpl instanceof DefaultResetCacheInteractor$resetCache$1) {
                        defaultResetCacheInteractor$resetCache$1 = (DefaultResetCacheInteractor$resetCache$1) continuationImpl;
                        int i2 = defaultResetCacheInteractor$resetCache$1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            defaultResetCacheInteractor$resetCache$1.label = i2 - Integer.MIN_VALUE;
                            Object obj = defaultResetCacheInteractor$resetCache$1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = defaultResetCacheInteractor$resetCache$1.label;
                            mdd0 mdd0Var = this.a;
                            zy11 zy11Var = zy11.a;
                            tms tmsVar = gt90.a;
                            if (i != 0) {
                                b.b(obj);
                                mdd0.c(mdd0Var, tmsVar, "Start reset cache.");
                                com.yandex.plus.pay.graphql.offers.a aVar = this.d;
                                defaultResetCacheInteractor$resetCache$1.L$0 = null;
                                defaultResetCacheInteractor$resetCache$1.L$1 = null;
                                defaultResetCacheInteractor$resetCache$1.L$2 = null;
                                defaultResetCacheInteractor$resetCache$1.I$0 = 0;
                                defaultResetCacheInteractor$resetCache$1.I$1 = 0;
                                defaultResetCacheInteractor$resetCache$1.label = 1;
                                aVar.e.h(-1);
                            } else if (i == 1) {
                                try {
                                    b.b(obj);
                                } catch (Throwable unused) {
                                }
                            } else {
                                if (i != 2) {
                                    if (i != 3) {
                                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    try {
                                        b.b(obj);
                                    } catch (Throwable unused2) {
                                    }
                                    mdd0.c(mdd0Var, tmsVar, "Success reset cache.");
                                    return zy11Var;
                                }
                                try {
                                    b.b(obj);
                                } catch (Throwable unused3) {
                                }
                                c cVar = this.c;
                                defaultResetCacheInteractor$resetCache$1.L$0 = null;
                                defaultResetCacheInteractor$resetCache$1.L$1 = null;
                                defaultResetCacheInteractor$resetCache$1.L$2 = null;
                                defaultResetCacheInteractor$resetCache$1.I$0 = 0;
                                defaultResetCacheInteractor$resetCache$1.I$1 = 0;
                                defaultResetCacheInteractor$resetCache$1.label = 3;
                            }
                            d dVar = this.b;
                            defaultResetCacheInteractor$resetCache$1.L$0 = null;
                            defaultResetCacheInteractor$resetCache$1.L$1 = null;
                            defaultResetCacheInteractor$resetCache$1.L$2 = null;
                            defaultResetCacheInteractor$resetCache$1.I$0 = 0;
                            defaultResetCacheInteractor$resetCache$1.I$1 = 0;
                            defaultResetCacheInteractor$resetCache$1.label = 2;
                        }
                    }
                    if (i != 0) {
                    }
                    d dVar2 = this.b;
                    defaultResetCacheInteractor$resetCache$1.L$0 = null;
                    defaultResetCacheInteractor$resetCache$1.L$1 = null;
                    defaultResetCacheInteractor$resetCache$1.L$2 = null;
                    defaultResetCacheInteractor$resetCache$1.I$0 = 0;
                    defaultResetCacheInteractor$resetCache$1.I$1 = 0;
                    defaultResetCacheInteractor$resetCache$1.label = 2;
                } catch (CancellationException e) {
                    throw e;
                }
            } catch (CancellationException e2) {
                throw e2;
            }
        } catch (CancellationException e3) {
            throw e3;
        }
        defaultResetCacheInteractor$resetCache$1 = new DefaultResetCacheInteractor$resetCache$1(this, continuationImpl);
        Object obj2 = defaultResetCacheInteractor$resetCache$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultResetCacheInteractor$resetCache$1.label;
        mdd0 mdd0Var2 = this.a;
        zy11 zy11Var2 = zy11.a;
        tms tmsVar2 = gt90.a;
    }
}
