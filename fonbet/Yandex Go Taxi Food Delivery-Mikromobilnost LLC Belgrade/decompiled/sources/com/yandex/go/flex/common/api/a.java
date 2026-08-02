package com.yandex.go.flex.common.api;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.yir;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlexGeoParamsRepositoryKt$resolvedGeoParamsFlow$$inlined$filterIsInstance$1$2$1 flexGeoParamsRepositoryKt$resolvedGeoParamsFlow$$inlined$filterIsInstance$1$2$1;
        int i;
        if (continuation instanceof FlexGeoParamsRepositoryKt$resolvedGeoParamsFlow$$inlined$filterIsInstance$1$2$1) {
            flexGeoParamsRepositoryKt$resolvedGeoParamsFlow$$inlined$filterIsInstance$1$2$1 = (FlexGeoParamsRepositoryKt$resolvedGeoParamsFlow$$inlined$filterIsInstance$1$2$1) continuation;
            int i2 = flexGeoParamsRepositoryKt$resolvedGeoParamsFlow$$inlined$filterIsInstance$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flexGeoParamsRepositoryKt$resolvedGeoParamsFlow$$inlined$filterIsInstance$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = flexGeoParamsRepositoryKt$resolvedGeoParamsFlow$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flexGeoParamsRepositoryKt$resolvedGeoParamsFlow$$inlined$filterIsInstance$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (obj instanceof yir) {
                        flexGeoParamsRepositoryKt$resolvedGeoParamsFlow$$inlined$filterIsInstance$1$2$1.L$0 = null;
                        flexGeoParamsRepositoryKt$resolvedGeoParamsFlow$$inlined$filterIsInstance$1$2$1.L$1 = null;
                        flexGeoParamsRepositoryKt$resolvedGeoParamsFlow$$inlined$filterIsInstance$1$2$1.L$2 = null;
                        flexGeoParamsRepositoryKt$resolvedGeoParamsFlow$$inlined$filterIsInstance$1$2$1.L$3 = null;
                        flexGeoParamsRepositoryKt$resolvedGeoParamsFlow$$inlined$filterIsInstance$1$2$1.label = 1;
                        if (this.a.emit(obj, flexGeoParamsRepositoryKt$resolvedGeoParamsFlow$$inlined$filterIsInstance$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        flexGeoParamsRepositoryKt$resolvedGeoParamsFlow$$inlined$filterIsInstance$1$2$1 = new FlexGeoParamsRepositoryKt$resolvedGeoParamsFlow$$inlined$filterIsInstance$1$2$1(this, continuation);
        Object obj22 = flexGeoParamsRepositoryKt$resolvedGeoParamsFlow$$inlined$filterIsInstance$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flexGeoParamsRepositoryKt$resolvedGeoParamsFlow$$inlined$filterIsInstance$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
