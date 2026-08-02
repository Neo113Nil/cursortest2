package com.yandex.quark.deeplinks.internal;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import java.util.Set;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeeplinksFeatureImpl$special$$inlined$map$1$2$1 deeplinksFeatureImpl$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof DeeplinksFeatureImpl$special$$inlined$map$1$2$1) {
            deeplinksFeatureImpl$special$$inlined$map$1$2$1 = (DeeplinksFeatureImpl$special$$inlined$map$1$2$1) continuation;
            int i2 = deeplinksFeatureImpl$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deeplinksFeatureImpl$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deeplinksFeatureImpl$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deeplinksFeatureImpl$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    b.b(obj2);
                    List J0 = kotlin.collections.a.J0((Set) obj);
                    deeplinksFeatureImpl$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(J0, deeplinksFeatureImpl$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                return zy11.a;
            }
        }
        deeplinksFeatureImpl$special$$inlined$map$1$2$1 = new DeeplinksFeatureImpl$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = deeplinksFeatureImpl$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deeplinksFeatureImpl$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
