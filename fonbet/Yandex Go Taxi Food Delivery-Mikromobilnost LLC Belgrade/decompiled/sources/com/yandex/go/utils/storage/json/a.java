package com.yandex.go.utils.storage.json;

import defpackage.aee;
import defpackage.ny61;
import defpackage.yww0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a implements yww0 {
    public final /* synthetic */ ru.yandex.taxi.utils.storage.b a;
    public final /* synthetic */ Object b;

    public a(ru.yandex.taxi.utils.storage.b bVar, Object obj) {
        this.a = bVar;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.yww0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        JsonStorageFactory$wrapStorage$1$getData$1 jsonStorageFactory$wrapStorage$1$getData$1;
        int i;
        if (continuation instanceof JsonStorageFactory$wrapStorage$1$getData$1) {
            jsonStorageFactory$wrapStorage$1$getData$1 = (JsonStorageFactory$wrapStorage$1$getData$1) continuation;
            int i2 = jsonStorageFactory$wrapStorage$1$getData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jsonStorageFactory$wrapStorage$1$getData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = jsonStorageFactory$wrapStorage$1$getData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = jsonStorageFactory$wrapStorage$1$getData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jsonStorageFactory$wrapStorage$1$getData$1.label = 1;
                    obj = this.a.a(jsonStorageFactory$wrapStorage$1$getData$1);
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
        jsonStorageFactory$wrapStorage$1$getData$1 = new JsonStorageFactory$wrapStorage$1$getData$1(this, continuation);
        Object obj3 = jsonStorageFactory$wrapStorage$1$getData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = jsonStorageFactory$wrapStorage$1$getData$1.label;
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

    @Override // defpackage.yww0
    public final Object d(Object obj, Continuation continuation) {
        return this.a.d(new aee(obj), continuation);
    }
}
