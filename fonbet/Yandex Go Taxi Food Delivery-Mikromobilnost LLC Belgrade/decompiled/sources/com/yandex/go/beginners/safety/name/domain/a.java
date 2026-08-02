package com.yandex.go.beginners.safety.name.domain;

import defpackage.mwl0;
import defpackage.nwl0;
import defpackage.ny61;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final ru.yandex.taxi.profile.a a;

    public a(ru.yandex.taxi.profile.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        SafetyNameInteractor$submit$1 safetyNameInteractor$submit$1;
        int i;
        try {
            if (continuationImpl instanceof SafetyNameInteractor$submit$1) {
                safetyNameInteractor$submit$1 = (SafetyNameInteractor$submit$1) continuationImpl;
                int i2 = safetyNameInteractor$submit$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    safetyNameInteractor$submit$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = safetyNameInteractor$submit$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = safetyNameInteractor$submit$1.label;
                    if (i != 0) {
                        b.b(obj);
                        ru.yandex.taxi.profile.a aVar = this.a;
                        safetyNameInteractor$submit$1.L$0 = null;
                        safetyNameInteractor$submit$1.label = 1;
                        if (aVar.c(str, safetyNameInteractor$submit$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    return nwl0.a;
                }
            }
            if (i != 0) {
            }
            return nwl0.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return mwl0.a;
        }
        safetyNameInteractor$submit$1 = new SafetyNameInteractor$submit$1(this, continuationImpl);
        Object obj2 = safetyNameInteractor$submit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = safetyNameInteractor$submit$1.label;
    }
}
