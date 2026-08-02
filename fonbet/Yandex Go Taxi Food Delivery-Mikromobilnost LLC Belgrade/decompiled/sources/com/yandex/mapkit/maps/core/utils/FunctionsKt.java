package com.yandex.mapkit.maps.core.utils;

import defpackage.i3y;
import defpackage.sls;
import defpackage.wls;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001ac\u0010\u000e\u001a\u0004\u0018\u00018\u0002\"\b\b\u0000\u0010\b*\u00020\u0000\"\b\b\u0001\u0010\t*\u00020\u0000\"\b\b\u0002\u0010\n*\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\f\u001a\u0004\u0018\u00018\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00020\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"", "T", "", "condition", "Lkotlin/Function0;", "block", "grabIf", "(ZLsls;)Ljava/lang/Object;", "T1", "T2", "R", "p1", "p2", "Lkotlin/Function2;", "grabIfBothNotNull", "(Ljava/lang/Object;Ljava/lang/Object;Lwls;)Ljava/lang/Object;", "initializer", "Li3y;", "unsafeLazy", "(Lsls;)Li3y;", "exported-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FunctionsKt {
    public static final <T> T grabIf(boolean z, sls slsVar) {
        if (z) {
            return (T) slsVar.invoke();
        }
        return null;
    }

    public static final <T1, T2, R> R grabIfBothNotNull(T1 t1, T2 t2, wls wlsVar) {
        if (t1 == null || t2 == null) {
            return null;
        }
        return (R) wlsVar.invoke(t1, t2);
    }

    public static final <T> i3y unsafeLazy(sls slsVar) {
        return a.b(LazyThreadSafetyMode.NONE, slsVar);
    }
}
