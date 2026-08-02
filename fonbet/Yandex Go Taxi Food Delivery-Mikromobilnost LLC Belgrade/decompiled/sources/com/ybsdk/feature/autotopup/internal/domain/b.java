package com.ybsdk.feature.autotopup.internal.domain;

import defpackage.ny61;
import defpackage.zri0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b {
    public final com.ybsdk.feature.autotopup.internal.data.b a;

    public b(com.ybsdk.feature.autotopup.internal.data.b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        AutoTopupRegularInteractor$getRegularAutoTopupSettings$1 autoTopupRegularInteractor$getRegularAutoTopupSettings$1;
        int i;
        if (continuationImpl instanceof AutoTopupRegularInteractor$getRegularAutoTopupSettings$1) {
            autoTopupRegularInteractor$getRegularAutoTopupSettings$1 = (AutoTopupRegularInteractor$getRegularAutoTopupSettings$1) continuationImpl;
            int i2 = autoTopupRegularInteractor$getRegularAutoTopupSettings$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupRegularInteractor$getRegularAutoTopupSettings$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupRegularInteractor$getRegularAutoTopupSettings$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupRegularInteractor$getRegularAutoTopupSettings$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    autoTopupRegularInteractor$getRegularAutoTopupSettings$1.label = 1;
                    Object g = this.a.g(str, autoTopupRegularInteractor$getRegularAutoTopupSettings$1);
                    return g == coroutineSingletons ? coroutineSingletons : g;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        autoTopupRegularInteractor$getRegularAutoTopupSettings$1 = new AutoTopupRegularInteractor$getRegularAutoTopupSettings$1(this, continuationImpl);
        Object obj2 = autoTopupRegularInteractor$getRegularAutoTopupSettings$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupRegularInteractor$getRegularAutoTopupSettings$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, zri0 zri0Var, ContinuationImpl continuationImpl) {
        AutoTopupRegularInteractor$saveRegularAutoTopup$1 autoTopupRegularInteractor$saveRegularAutoTopup$1;
        int i;
        if (continuationImpl instanceof AutoTopupRegularInteractor$saveRegularAutoTopup$1) {
            autoTopupRegularInteractor$saveRegularAutoTopup$1 = (AutoTopupRegularInteractor$saveRegularAutoTopup$1) continuationImpl;
            int i2 = autoTopupRegularInteractor$saveRegularAutoTopup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupRegularInteractor$saveRegularAutoTopup$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupRegularInteractor$saveRegularAutoTopup$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupRegularInteractor$saveRegularAutoTopup$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    autoTopupRegularInteractor$saveRegularAutoTopup$1.label = 1;
                    Object o = this.a.o(str, zri0Var, autoTopupRegularInteractor$saveRegularAutoTopup$1);
                    return o == coroutineSingletons ? coroutineSingletons : o;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        autoTopupRegularInteractor$saveRegularAutoTopup$1 = new AutoTopupRegularInteractor$saveRegularAutoTopup$1(this, continuationImpl);
        Object obj2 = autoTopupRegularInteractor$saveRegularAutoTopup$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupRegularInteractor$saveRegularAutoTopup$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(zri0 zri0Var, ContinuationImpl continuationImpl) {
        AutoTopupRegularInteractor$validateRegularAutotopup$1 autoTopupRegularInteractor$validateRegularAutotopup$1;
        int i;
        if (continuationImpl instanceof AutoTopupRegularInteractor$validateRegularAutotopup$1) {
            autoTopupRegularInteractor$validateRegularAutotopup$1 = (AutoTopupRegularInteractor$validateRegularAutotopup$1) continuationImpl;
            int i2 = autoTopupRegularInteractor$validateRegularAutotopup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupRegularInteractor$validateRegularAutotopup$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupRegularInteractor$validateRegularAutotopup$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupRegularInteractor$validateRegularAutotopup$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    autoTopupRegularInteractor$validateRegularAutotopup$1.label = 1;
                    Object u = this.a.u(zri0Var, autoTopupRegularInteractor$validateRegularAutotopup$1);
                    return u == coroutineSingletons ? coroutineSingletons : u;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        autoTopupRegularInteractor$validateRegularAutotopup$1 = new AutoTopupRegularInteractor$validateRegularAutotopup$1(this, continuationImpl);
        Object obj2 = autoTopupRegularInteractor$validateRegularAutotopup$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupRegularInteractor$validateRegularAutotopup$1.label;
        if (i != 0) {
        }
    }
}
