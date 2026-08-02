package com.yandex.go.utils.storage.json;

import defpackage.aee;
import defpackage.hju0;
import defpackage.hk20;
import defpackage.iju0;
import defpackage.jju0;
import defpackage.ny61;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.utils.ResponseError;

/* loaded from: classes8.dex */
public final class b implements hk20 {
    public final /* synthetic */ ru.yandex.taxi.utils.storage.a a;
    public final /* synthetic */ Object b;

    public b(ru.yandex.taxi.utils.storage.a aVar, Object obj) {
        this.a = aVar;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.yww0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        JsonStorageFactory$wrapStorage$2$getData$1 jsonStorageFactory$wrapStorage$2$getData$1;
        int i;
        if (continuation instanceof JsonStorageFactory$wrapStorage$2$getData$1) {
            jsonStorageFactory$wrapStorage$2$getData$1 = (JsonStorageFactory$wrapStorage$2$getData$1) continuation;
            int i2 = jsonStorageFactory$wrapStorage$2$getData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jsonStorageFactory$wrapStorage$2$getData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = jsonStorageFactory$wrapStorage$2$getData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = jsonStorageFactory$wrapStorage$2$getData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jsonStorageFactory$wrapStorage$2$getData$1.label = 1;
                    obj = this.a.a(jsonStorageFactory$wrapStorage$2$getData$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Object obj2 = ((aee) obj).a;
                return obj2 != null ? this.b : obj2;
            }
        }
        jsonStorageFactory$wrapStorage$2$getData$1 = new JsonStorageFactory$wrapStorage$2$getData$1(this, (ContinuationImpl) continuation);
        Object obj3 = jsonStorageFactory$wrapStorage$2$getData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = jsonStorageFactory$wrapStorage$2$getData$1.label;
        if (i != 0) {
        }
        Object obj22 = ((aee) obj3).a;
        if (obj22 != null) {
        }
    }

    @Override // defpackage.yww0
    public final void b(Object obj) {
        this.a.b(new aee(obj));
    }

    @Override // defpackage.hk20
    public final Object c() {
        Object obj = ((aee) this.a.c()).a;
        return obj == null ? this.b : obj;
    }

    @Override // defpackage.yww0
    public final Object d(Object obj, Continuation continuation) {
        return this.a.d(new aee(obj), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Continuation continuation) {
        JsonStorageFactory$wrapStorage$2$getResponse$1 jsonStorageFactory$wrapStorage$2$getResponse$1;
        int i;
        boolean z;
        if (continuation instanceof JsonStorageFactory$wrapStorage$2$getResponse$1) {
            jsonStorageFactory$wrapStorage$2$getResponse$1 = (JsonStorageFactory$wrapStorage$2$getResponse$1) continuation;
            int i2 = jsonStorageFactory$wrapStorage$2$getResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jsonStorageFactory$wrapStorage$2$getResponse$1.label = i2 - Integer.MIN_VALUE;
                Object obj = jsonStorageFactory$wrapStorage$2$getResponse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = jsonStorageFactory$wrapStorage$2$getResponse$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jsonStorageFactory$wrapStorage$2$getResponse$1.label = 1;
                    obj = this.a.e(jsonStorageFactory$wrapStorage$2$getResponse$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                jju0 jju0Var = (jju0) obj;
                Object obj2 = ((aee) jju0Var.a()).a;
                z = jju0Var instanceof hju0;
                Object obj3 = this.b;
                if (z) {
                    return obj2 == null ? new hju0(obj3, ResponseError.UnknownError) : new iju0(obj2);
                }
                if (obj2 == null) {
                    obj2 = obj3;
                }
                return new hju0(obj2, ((hju0) jju0Var).c);
            }
        }
        jsonStorageFactory$wrapStorage$2$getResponse$1 = new JsonStorageFactory$wrapStorage$2$getResponse$1(this, (ContinuationImpl) continuation);
        Object obj4 = jsonStorageFactory$wrapStorage$2$getResponse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = jsonStorageFactory$wrapStorage$2$getResponse$1.label;
        if (i != 0) {
        }
        jju0 jju0Var2 = (jju0) obj4;
        Object obj22 = ((aee) jju0Var2.a()).a;
        z = jju0Var2 instanceof hju0;
        Object obj32 = this.b;
        if (z) {
        }
    }
}
