package com.yandex.go.navigator.repository;

import defpackage.l7z;
import defpackage.ny61;
import defpackage.t1l0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GuidanceProgressContentRepository$special$$inlined$mapNotNull$1$2$1 guidanceProgressContentRepository$special$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof GuidanceProgressContentRepository$special$$inlined$mapNotNull$1$2$1) {
            guidanceProgressContentRepository$special$$inlined$mapNotNull$1$2$1 = (GuidanceProgressContentRepository$special$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = guidanceProgressContentRepository$special$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                guidanceProgressContentRepository$special$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = guidanceProgressContentRepository$special$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = guidanceProgressContentRepository$special$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    l7z l7zVar = (l7z) obj;
                    t1l0 t1l0Var = l7zVar != null ? l7zVar.c : null;
                    if (t1l0Var != null) {
                        guidanceProgressContentRepository$special$$inlined$mapNotNull$1$2$1.L$0 = null;
                        guidanceProgressContentRepository$special$$inlined$mapNotNull$1$2$1.L$1 = null;
                        guidanceProgressContentRepository$special$$inlined$mapNotNull$1$2$1.L$2 = null;
                        guidanceProgressContentRepository$special$$inlined$mapNotNull$1$2$1.L$3 = null;
                        guidanceProgressContentRepository$special$$inlined$mapNotNull$1$2$1.L$4 = null;
                        guidanceProgressContentRepository$special$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(t1l0Var, guidanceProgressContentRepository$special$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        guidanceProgressContentRepository$special$$inlined$mapNotNull$1$2$1 = new GuidanceProgressContentRepository$special$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = guidanceProgressContentRepository$special$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = guidanceProgressContentRepository$special$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
