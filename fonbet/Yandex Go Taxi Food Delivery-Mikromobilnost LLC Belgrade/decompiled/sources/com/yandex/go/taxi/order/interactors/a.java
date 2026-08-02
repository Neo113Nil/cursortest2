package com.yandex.go.taxi.order.interactors;

import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import defpackage.a3y0;
import defpackage.du;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p2y0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public final p2y0 a;
    public final a3y0 b = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "ActiveOrderMarkerInteractor");

    public a(p2y0 p2y0Var) {
        this.a = p2y0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ActiveOrderMarkerInteractor$findAndMarkMostActive$1 activeOrderMarkerInteractor$findAndMarkMostActive$1;
        int i;
        o2y0 o2y0Var;
        if (continuationImpl instanceof ActiveOrderMarkerInteractor$findAndMarkMostActive$1) {
            activeOrderMarkerInteractor$findAndMarkMostActive$1 = (ActiveOrderMarkerInteractor$findAndMarkMostActive$1) continuationImpl;
            int i2 = activeOrderMarkerInteractor$findAndMarkMostActive$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                activeOrderMarkerInteractor$findAndMarkMostActive$1.label = i2 - Integer.MIN_VALUE;
                Object obj = activeOrderMarkerInteractor$findAndMarkMostActive$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activeOrderMarkerInteractor$findAndMarkMostActive$1.label;
                p2y0 p2y0Var = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    activeOrderMarkerInteractor$findAndMarkMostActive$1.L$0 = null;
                    activeOrderMarkerInteractor$findAndMarkMostActive$1.label = 1;
                    obj = ((e0) p2y0Var).p(str, activeOrderMarkerInteractor$findAndMarkMostActive$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                o2y0Var = (o2y0) obj;
                if (o2y0Var != null) {
                    this.b.b("markByOrderId", new IllegalStateException("Missed TaxiOrderHolder"), new du(28));
                    return Boolean.FALSE;
                }
                activeOrderMarkerInteractor$findAndMarkMostActive$1.L$0 = null;
                activeOrderMarkerInteractor$findAndMarkMostActive$1.L$1 = null;
                activeOrderMarkerInteractor$findAndMarkMostActive$1.label = 2;
                Object w = ((e0) p2y0Var).w(o2y0Var, activeOrderMarkerInteractor$findAndMarkMostActive$1);
                return w == coroutineSingletons ? coroutineSingletons : w;
            }
        }
        activeOrderMarkerInteractor$findAndMarkMostActive$1 = new ActiveOrderMarkerInteractor$findAndMarkMostActive$1(this, continuationImpl);
        Object obj2 = activeOrderMarkerInteractor$findAndMarkMostActive$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activeOrderMarkerInteractor$findAndMarkMostActive$1.label;
        p2y0 p2y0Var2 = this.a;
        if (i != 0) {
        }
        o2y0Var = (o2y0) obj2;
        if (o2y0Var != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        ActiveOrderMarkerInteractor$findByChatIdAndMarkMostActiveIgnoring$1 activeOrderMarkerInteractor$findByChatIdAndMarkMostActiveIgnoring$1;
        int i;
        if (continuationImpl instanceof ActiveOrderMarkerInteractor$findByChatIdAndMarkMostActiveIgnoring$1) {
            activeOrderMarkerInteractor$findByChatIdAndMarkMostActiveIgnoring$1 = (ActiveOrderMarkerInteractor$findByChatIdAndMarkMostActiveIgnoring$1) continuationImpl;
            int i2 = activeOrderMarkerInteractor$findByChatIdAndMarkMostActiveIgnoring$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                activeOrderMarkerInteractor$findByChatIdAndMarkMostActiveIgnoring$1.label = i2 - Integer.MIN_VALUE;
                Object obj = activeOrderMarkerInteractor$findByChatIdAndMarkMostActiveIgnoring$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activeOrderMarkerInteractor$findByChatIdAndMarkMostActiveIgnoring$1.label;
                p2y0 p2y0Var = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    activeOrderMarkerInteractor$findByChatIdAndMarkMostActiveIgnoring$1.L$0 = null;
                    activeOrderMarkerInteractor$findByChatIdAndMarkMostActiveIgnoring$1.label = 1;
                    obj = ((e0) p2y0Var).o(str, activeOrderMarkerInteractor$findByChatIdAndMarkMostActiveIgnoring$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o2y0 o2y0Var = (o2y0) activeOrderMarkerInteractor$findByChatIdAndMarkMostActiveIgnoring$1.L$1;
                        kotlin.b.b(obj);
                        return o2y0Var;
                    }
                    kotlin.b.b(obj);
                }
                o2y0 o2y0Var2 = (o2y0) obj;
                activeOrderMarkerInteractor$findByChatIdAndMarkMostActiveIgnoring$1.L$0 = null;
                activeOrderMarkerInteractor$findByChatIdAndMarkMostActiveIgnoring$1.L$1 = o2y0Var2;
                activeOrderMarkerInteractor$findByChatIdAndMarkMostActiveIgnoring$1.label = 2;
                return ((e0) p2y0Var).w(o2y0Var2, activeOrderMarkerInteractor$findByChatIdAndMarkMostActiveIgnoring$1) != coroutineSingletons ? coroutineSingletons : o2y0Var2;
            }
        }
        activeOrderMarkerInteractor$findByChatIdAndMarkMostActiveIgnoring$1 = new ActiveOrderMarkerInteractor$findByChatIdAndMarkMostActiveIgnoring$1(this, continuationImpl);
        Object obj2 = activeOrderMarkerInteractor$findByChatIdAndMarkMostActiveIgnoring$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activeOrderMarkerInteractor$findByChatIdAndMarkMostActiveIgnoring$1.label;
        p2y0 p2y0Var2 = this.a;
        if (i != 0) {
        }
        o2y0 o2y0Var22 = (o2y0) obj2;
        activeOrderMarkerInteractor$findByChatIdAndMarkMostActiveIgnoring$1.L$0 = null;
        activeOrderMarkerInteractor$findByChatIdAndMarkMostActiveIgnoring$1.L$1 = o2y0Var22;
        activeOrderMarkerInteractor$findByChatIdAndMarkMostActiveIgnoring$1.label = 2;
        if (((e0) p2y0Var2).w(o2y0Var22, activeOrderMarkerInteractor$findByChatIdAndMarkMostActiveIgnoring$1) != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        ActiveOrderMarkerInteractor$findByIdAndMarkMostActiveIgnoring$1 activeOrderMarkerInteractor$findByIdAndMarkMostActiveIgnoring$1;
        int i;
        if (continuationImpl instanceof ActiveOrderMarkerInteractor$findByIdAndMarkMostActiveIgnoring$1) {
            activeOrderMarkerInteractor$findByIdAndMarkMostActiveIgnoring$1 = (ActiveOrderMarkerInteractor$findByIdAndMarkMostActiveIgnoring$1) continuationImpl;
            int i2 = activeOrderMarkerInteractor$findByIdAndMarkMostActiveIgnoring$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                activeOrderMarkerInteractor$findByIdAndMarkMostActiveIgnoring$1.label = i2 - Integer.MIN_VALUE;
                Object obj = activeOrderMarkerInteractor$findByIdAndMarkMostActiveIgnoring$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activeOrderMarkerInteractor$findByIdAndMarkMostActiveIgnoring$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    activeOrderMarkerInteractor$findByIdAndMarkMostActiveIgnoring$1.L$0 = str;
                    activeOrderMarkerInteractor$findByIdAndMarkMostActiveIgnoring$1.label = 1;
                    obj = ((e0) this.a).p(str, activeOrderMarkerInteractor$findByIdAndMarkMostActiveIgnoring$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o2y0 o2y0Var = (o2y0) activeOrderMarkerInteractor$findByIdAndMarkMostActiveIgnoring$1.L$1;
                        kotlin.b.b(obj);
                        return o2y0Var;
                    }
                    str = (String) activeOrderMarkerInteractor$findByIdAndMarkMostActiveIgnoring$1.L$0;
                    kotlin.b.b(obj);
                }
                o2y0 o2y0Var2 = (o2y0) obj;
                activeOrderMarkerInteractor$findByIdAndMarkMostActiveIgnoring$1.L$0 = null;
                activeOrderMarkerInteractor$findByIdAndMarkMostActiveIgnoring$1.L$1 = o2y0Var2;
                activeOrderMarkerInteractor$findByIdAndMarkMostActiveIgnoring$1.label = 2;
                return a(str, activeOrderMarkerInteractor$findByIdAndMarkMostActiveIgnoring$1) != obj2 ? obj2 : o2y0Var2;
            }
        }
        activeOrderMarkerInteractor$findByIdAndMarkMostActiveIgnoring$1 = new ActiveOrderMarkerInteractor$findByIdAndMarkMostActiveIgnoring$1(this, continuationImpl);
        Object obj3 = activeOrderMarkerInteractor$findByIdAndMarkMostActiveIgnoring$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activeOrderMarkerInteractor$findByIdAndMarkMostActiveIgnoring$1.label;
        if (i != 0) {
        }
        o2y0 o2y0Var22 = (o2y0) obj3;
        activeOrderMarkerInteractor$findByIdAndMarkMostActiveIgnoring$1.L$0 = null;
        activeOrderMarkerInteractor$findByIdAndMarkMostActiveIgnoring$1.L$1 = o2y0Var22;
        activeOrderMarkerInteractor$findByIdAndMarkMostActiveIgnoring$1.label = 2;
        if (a(str, activeOrderMarkerInteractor$findByIdAndMarkMostActiveIgnoring$1) != obj22) {
        }
    }
}
