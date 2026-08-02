package com.yandex.plus.home.datasource.local.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.gtq0;
import defpackage.jse;
import defpackage.ny61;
import defpackage.sbx;
import defpackage.tje;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class a {
    public final String a;
    public final String b;
    public final KSerializer c;
    public final sbx d;
    public final jse e;
    public final SharedPreferences f;
    public final kotlinx.coroutines.sync.a g = gtq0.a();
    public final LinkedHashMap h = new LinkedHashMap();

    public a(Context context, String str, String str2, KSerializer kSerializer, sbx sbxVar, jse jseVar) {
        this.a = str;
        this.b = str2;
        this.c = kSerializer;
        this.d = sbxVar;
        this.e = jseVar;
        this.f = context.getSharedPreferences(str, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PreferencesStaticKeyLocalDataSource$get$1 preferencesStaticKeyLocalDataSource$get$1;
        int i;
        if (continuationImpl instanceof PreferencesStaticKeyLocalDataSource$get$1) {
            preferencesStaticKeyLocalDataSource$get$1 = (PreferencesStaticKeyLocalDataSource$get$1) continuationImpl;
            int i2 = preferencesStaticKeyLocalDataSource$get$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                preferencesStaticKeyLocalDataSource$get$1.label = i2 - Integer.MIN_VALUE;
                Object obj = preferencesStaticKeyLocalDataSource$get$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = preferencesStaticKeyLocalDataSource$get$1.label;
                if (i != 0) {
                    b.b(obj);
                    preferencesStaticKeyLocalDataSource$get$1.label = 1;
                    Object c = c(null, preferencesStaticKeyLocalDataSource$get$1);
                    return c == obj2 ? obj2 : c;
                }
                if (i == 1) {
                    b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        preferencesStaticKeyLocalDataSource$get$1 = new PreferencesStaticKeyLocalDataSource$get$1(this, continuationImpl);
        Object obj3 = preferencesStaticKeyLocalDataSource$get$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = preferencesStaticKeyLocalDataSource$get$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        PreferencesStaticKeyLocalDataSource$get$2 preferencesStaticKeyLocalDataSource$get$2;
        int i;
        if (continuationImpl instanceof PreferencesStaticKeyLocalDataSource$get$2) {
            preferencesStaticKeyLocalDataSource$get$2 = (PreferencesStaticKeyLocalDataSource$get$2) continuationImpl;
            int i2 = preferencesStaticKeyLocalDataSource$get$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                preferencesStaticKeyLocalDataSource$get$2.label = i2 - Integer.MIN_VALUE;
                Object obj = preferencesStaticKeyLocalDataSource$get$2.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = preferencesStaticKeyLocalDataSource$get$2.label;
                if (i != 0) {
                    b.b(obj);
                    preferencesStaticKeyLocalDataSource$get$2.L$0 = null;
                    preferencesStaticKeyLocalDataSource$get$2.label = 1;
                    Object c = c(str, preferencesStaticKeyLocalDataSource$get$2);
                    return c == obj2 ? obj2 : c;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return ((Result) obj).getValue();
            }
        }
        preferencesStaticKeyLocalDataSource$get$2 = new PreferencesStaticKeyLocalDataSource$get$2(this, continuationImpl);
        Object obj3 = preferencesStaticKeyLocalDataSource$get$2.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = preferencesStaticKeyLocalDataSource$get$2.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        PreferencesStaticKeyLocalDataSource$getInternal$1 preferencesStaticKeyLocalDataSource$getInternal$1;
        int i;
        if (continuationImpl instanceof PreferencesStaticKeyLocalDataSource$getInternal$1) {
            preferencesStaticKeyLocalDataSource$getInternal$1 = (PreferencesStaticKeyLocalDataSource$getInternal$1) continuationImpl;
            int i2 = preferencesStaticKeyLocalDataSource$getInternal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                preferencesStaticKeyLocalDataSource$getInternal$1.label = i2 - Integer.MIN_VALUE;
                Object obj = preferencesStaticKeyLocalDataSource$getInternal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = preferencesStaticKeyLocalDataSource$getInternal$1.label;
                if (i != 0) {
                    b.b(obj);
                    PreferencesStaticKeyLocalDataSource$getInternal$2 preferencesStaticKeyLocalDataSource$getInternal$2 = new PreferencesStaticKeyLocalDataSource$getInternal$2(this, str, null);
                    preferencesStaticKeyLocalDataSource$getInternal$1.L$0 = null;
                    preferencesStaticKeyLocalDataSource$getInternal$1.label = 1;
                    obj = tje.k0(this.e, preferencesStaticKeyLocalDataSource$getInternal$2, preferencesStaticKeyLocalDataSource$getInternal$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        preferencesStaticKeyLocalDataSource$getInternal$1 = new PreferencesStaticKeyLocalDataSource$getInternal$1(this, continuationImpl);
        Object obj2 = preferencesStaticKeyLocalDataSource$getInternal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = preferencesStaticKeyLocalDataSource$getInternal$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, Object obj, ContinuationImpl continuationImpl) {
        PreferencesStaticKeyLocalDataSource$save$2 preferencesStaticKeyLocalDataSource$save$2;
        int i;
        if (continuationImpl instanceof PreferencesStaticKeyLocalDataSource$save$2) {
            preferencesStaticKeyLocalDataSource$save$2 = (PreferencesStaticKeyLocalDataSource$save$2) continuationImpl;
            int i2 = preferencesStaticKeyLocalDataSource$save$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                preferencesStaticKeyLocalDataSource$save$2.label = i2 - Integer.MIN_VALUE;
                Object obj2 = preferencesStaticKeyLocalDataSource$save$2.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = preferencesStaticKeyLocalDataSource$save$2.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                    return ((Result) obj2).getValue();
                }
                b.b(obj2);
                preferencesStaticKeyLocalDataSource$save$2.L$0 = null;
                preferencesStaticKeyLocalDataSource$save$2.L$1 = null;
                preferencesStaticKeyLocalDataSource$save$2.label = 1;
                Object f = f(str, obj, preferencesStaticKeyLocalDataSource$save$2);
                return f == obj3 ? obj3 : f;
            }
        }
        preferencesStaticKeyLocalDataSource$save$2 = new PreferencesStaticKeyLocalDataSource$save$2(this, continuationImpl);
        Object obj22 = preferencesStaticKeyLocalDataSource$save$2.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = preferencesStaticKeyLocalDataSource$save$2.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Object obj, ContinuationImpl continuationImpl) {
        PreferencesStaticKeyLocalDataSource$save$1 preferencesStaticKeyLocalDataSource$save$1;
        int i;
        if (continuationImpl instanceof PreferencesStaticKeyLocalDataSource$save$1) {
            preferencesStaticKeyLocalDataSource$save$1 = (PreferencesStaticKeyLocalDataSource$save$1) continuationImpl;
            int i2 = preferencesStaticKeyLocalDataSource$save$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                preferencesStaticKeyLocalDataSource$save$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = preferencesStaticKeyLocalDataSource$save$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = preferencesStaticKeyLocalDataSource$save$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj2);
                        return ((Result) obj2).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj2);
                preferencesStaticKeyLocalDataSource$save$1.L$0 = null;
                preferencesStaticKeyLocalDataSource$save$1.label = 1;
                Object f = f(null, obj, preferencesStaticKeyLocalDataSource$save$1);
                return f == obj3 ? obj3 : f;
            }
        }
        preferencesStaticKeyLocalDataSource$save$1 = new PreferencesStaticKeyLocalDataSource$save$1(this, continuationImpl);
        Object obj22 = preferencesStaticKeyLocalDataSource$save$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = preferencesStaticKeyLocalDataSource$save$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, Object obj, ContinuationImpl continuationImpl) {
        PreferencesStaticKeyLocalDataSource$saveInternal$1 preferencesStaticKeyLocalDataSource$saveInternal$1;
        int i;
        if (continuationImpl instanceof PreferencesStaticKeyLocalDataSource$saveInternal$1) {
            preferencesStaticKeyLocalDataSource$saveInternal$1 = (PreferencesStaticKeyLocalDataSource$saveInternal$1) continuationImpl;
            int i2 = preferencesStaticKeyLocalDataSource$saveInternal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                preferencesStaticKeyLocalDataSource$saveInternal$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = preferencesStaticKeyLocalDataSource$saveInternal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = preferencesStaticKeyLocalDataSource$saveInternal$1.label;
                if (i != 0) {
                    b.b(obj2);
                    PreferencesStaticKeyLocalDataSource$saveInternal$2 preferencesStaticKeyLocalDataSource$saveInternal$2 = new PreferencesStaticKeyLocalDataSource$saveInternal$2(obj, this, str, null);
                    preferencesStaticKeyLocalDataSource$saveInternal$1.L$0 = null;
                    preferencesStaticKeyLocalDataSource$saveInternal$1.L$1 = null;
                    preferencesStaticKeyLocalDataSource$saveInternal$1.label = 1;
                    obj2 = tje.k0(this.e, preferencesStaticKeyLocalDataSource$saveInternal$2, preferencesStaticKeyLocalDataSource$saveInternal$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                return ((Result) obj2).getValue();
            }
        }
        preferencesStaticKeyLocalDataSource$saveInternal$1 = new PreferencesStaticKeyLocalDataSource$saveInternal$1(this, continuationImpl);
        Object obj22 = preferencesStaticKeyLocalDataSource$saveInternal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = preferencesStaticKeyLocalDataSource$saveInternal$1.label;
        if (i != 0) {
        }
        return ((Result) obj22).getValue();
    }
}
