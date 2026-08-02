package com.yandex.plus.core.activity.result.internal;

import android.app.Application;
import defpackage.bvf0;
import defpackage.c60;
import defpackage.g6u;
import defpackage.gw00;
import defpackage.h50;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.x40;
import defpackage.z40;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class c extends c60 {
    public static final c d = new c();
    public Application a;
    public final ArrayList b = new ArrayList();
    public final r0 c = bvf0.c(EmptyList.a);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.c60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Continuation continuation) {
        ActivityWithResultLauncherImpl$getMultipleContents$1 activityWithResultLauncherImpl$getMultipleContents$1;
        int i;
        Object b;
        if (continuation instanceof ActivityWithResultLauncherImpl$getMultipleContents$1) {
            activityWithResultLauncherImpl$getMultipleContents$1 = (ActivityWithResultLauncherImpl$getMultipleContents$1) continuation;
            int i2 = activityWithResultLauncherImpl$getMultipleContents$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                activityWithResultLauncherImpl$getMultipleContents$1.label = i2 - Integer.MIN_VALUE;
                Object obj = activityWithResultLauncherImpl$getMultipleContents$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityWithResultLauncherImpl$getMultipleContents$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    x40 z40Var = new z40();
                    activityWithResultLauncherImpl$getMultipleContents$1.L$0 = null;
                    activityWithResultLauncherImpl$getMultipleContents$1.label = 1;
                    b = b(z40Var, str, activityWithResultLauncherImpl$getMultipleContents$1);
                    if (b == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    b = ((Result) obj).getValue();
                }
                return Result.a(b) != null ? b : EmptyList.a;
            }
        }
        activityWithResultLauncherImpl$getMultipleContents$1 = new ActivityWithResultLauncherImpl$getMultipleContents$1(this, (ContinuationImpl) continuation);
        Object obj3 = activityWithResultLauncherImpl$getMultipleContents$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityWithResultLauncherImpl$getMultipleContents$1.label;
        if (i != 0) {
        }
        if (Result.a(b) != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // defpackage.c60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(x40 x40Var, Object obj, ContinuationImpl continuationImpl) {
        ActivityWithResultLauncherImpl$launch$1 activityWithResultLauncherImpl$launch$1;
        int i;
        try {
            if (continuationImpl instanceof ActivityWithResultLauncherImpl$launch$1) {
                activityWithResultLauncherImpl$launch$1 = (ActivityWithResultLauncherImpl$launch$1) continuationImpl;
                int i2 = activityWithResultLauncherImpl$launch$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    activityWithResultLauncherImpl$launch$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = activityWithResultLauncherImpl$launch$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = activityWithResultLauncherImpl$launch$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return obj2;
                    }
                    kotlin.b.b(obj2);
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a.x;
                    ActivityWithResultLauncherImpl$launch$2$1 activityWithResultLauncherImpl$launch$2$1 = new ActivityWithResultLauncherImpl$launch$2$1(this, x40Var, obj, null);
                    activityWithResultLauncherImpl$launch$1.L$0 = null;
                    activityWithResultLauncherImpl$launch$1.L$1 = null;
                    activityWithResultLauncherImpl$launch$1.L$2 = null;
                    activityWithResultLauncherImpl$launch$1.L$3 = null;
                    activityWithResultLauncherImpl$launch$1.L$4 = null;
                    activityWithResultLauncherImpl$launch$1.I$0 = 0;
                    activityWithResultLauncherImpl$launch$1.I$1 = 0;
                    activityWithResultLauncherImpl$launch$1.label = 1;
                    Object k0 = tje.k0(g6uVar, activityWithResultLauncherImpl$launch$2$1, activityWithResultLauncherImpl$launch$1);
                    return k0 == coroutineSingletons ? coroutineSingletons : k0;
                }
            }
            if (i == 0) {
            }
        } catch (TimeoutCancellationException e) {
            return new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        activityWithResultLauncherImpl$launch$1 = new ActivityWithResultLauncherImpl$launch$1(this, continuationImpl);
        Object obj22 = activityWithResultLauncherImpl$launch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityWithResultLauncherImpl$launch$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.c60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String[] strArr, Continuation continuation) {
        ActivityWithResultLauncherImpl$requestRuntimePermissions$1 activityWithResultLauncherImpl$requestRuntimePermissions$1;
        int i;
        Object b;
        if (continuation instanceof ActivityWithResultLauncherImpl$requestRuntimePermissions$1) {
            activityWithResultLauncherImpl$requestRuntimePermissions$1 = (ActivityWithResultLauncherImpl$requestRuntimePermissions$1) continuation;
            int i2 = activityWithResultLauncherImpl$requestRuntimePermissions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                activityWithResultLauncherImpl$requestRuntimePermissions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = activityWithResultLauncherImpl$requestRuntimePermissions$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityWithResultLauncherImpl$requestRuntimePermissions$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    x40 h50Var = new h50();
                    activityWithResultLauncherImpl$requestRuntimePermissions$1.L$0 = strArr;
                    activityWithResultLauncherImpl$requestRuntimePermissions$1.label = 1;
                    b = b(h50Var, strArr, activityWithResultLauncherImpl$requestRuntimePermissions$1);
                    if (b == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    strArr = (String[]) activityWithResultLauncherImpl$requestRuntimePermissions$1.L$0;
                    kotlin.b.b(obj);
                    b = ((Result) obj).getValue();
                }
                if (Result.a(b) != null) {
                    return b;
                }
                int d2 = gw00.d(strArr.length);
                if (d2 < 16) {
                    d2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(d2);
                for (String str : strArr) {
                    linkedHashMap.put(str, Boolean.FALSE);
                }
                return linkedHashMap;
            }
        }
        activityWithResultLauncherImpl$requestRuntimePermissions$1 = new ActivityWithResultLauncherImpl$requestRuntimePermissions$1(this, (ContinuationImpl) continuation);
        Object obj3 = activityWithResultLauncherImpl$requestRuntimePermissions$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityWithResultLauncherImpl$requestRuntimePermissions$1.label;
        if (i != 0) {
        }
        if (Result.a(b) != null) {
        }
    }
}
