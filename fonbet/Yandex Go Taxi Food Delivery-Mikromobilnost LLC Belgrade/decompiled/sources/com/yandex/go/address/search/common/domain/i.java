package com.yandex.go.address.search.common.domain;

import defpackage.jtj0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class i implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ k b;

    public i(vpr vprVar, k kVar) {
        this.a = vprVar;
        this.b = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MappingAdapter$resolveWholeQuery$$inlined$map$1$2$1 mappingAdapter$resolveWholeQuery$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof MappingAdapter$resolveWholeQuery$$inlined$map$1$2$1) {
            mappingAdapter$resolveWholeQuery$$inlined$map$1$2$1 = (MappingAdapter$resolveWholeQuery$$inlined$map$1$2$1) continuation;
            int i2 = mappingAdapter$resolveWholeQuery$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mappingAdapter$resolveWholeQuery$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mappingAdapter$resolveWholeQuery$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mappingAdapter$resolveWholeQuery$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    jtj0 f = k.f(this.b, (jtj0) obj);
                    mappingAdapter$resolveWholeQuery$$inlined$map$1$2$1.L$0 = null;
                    mappingAdapter$resolveWholeQuery$$inlined$map$1$2$1.L$1 = null;
                    mappingAdapter$resolveWholeQuery$$inlined$map$1$2$1.L$2 = null;
                    mappingAdapter$resolveWholeQuery$$inlined$map$1$2$1.L$3 = null;
                    mappingAdapter$resolveWholeQuery$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(f, mappingAdapter$resolveWholeQuery$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        mappingAdapter$resolveWholeQuery$$inlined$map$1$2$1 = new MappingAdapter$resolveWholeQuery$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mappingAdapter$resolveWholeQuery$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mappingAdapter$resolveWholeQuery$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
