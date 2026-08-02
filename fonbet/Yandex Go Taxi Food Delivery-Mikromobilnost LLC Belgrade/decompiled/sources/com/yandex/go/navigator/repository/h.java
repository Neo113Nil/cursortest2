package com.yandex.go.navigator.repository;

import defpackage.bf50;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class h implements tpr {
    public final /* synthetic */ r0 a;
    public final /* synthetic */ bf50 b;

    public h(r0 r0Var, bf50 bf50Var) {
        this.a = r0Var;
        this.b = bf50Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        NavigatorSettingsRepository$special$$inlined$mapNotNull$1$1 navigatorSettingsRepository$special$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof NavigatorSettingsRepository$special$$inlined$mapNotNull$1$1) {
            navigatorSettingsRepository$special$$inlined$mapNotNull$1$1 = (NavigatorSettingsRepository$special$$inlined$mapNotNull$1$1) continuation;
            int i2 = navigatorSettingsRepository$special$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigatorSettingsRepository$special$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = navigatorSettingsRepository$special$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigatorSettingsRepository$special$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g gVar = new g(vprVar, this.b);
                    navigatorSettingsRepository$special$$inlined$mapNotNull$1$1.L$0 = null;
                    navigatorSettingsRepository$special$$inlined$mapNotNull$1$1.L$1 = null;
                    navigatorSettingsRepository$special$$inlined$mapNotNull$1$1.L$2 = null;
                    navigatorSettingsRepository$special$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(gVar, navigatorSettingsRepository$special$$inlined$mapNotNull$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        navigatorSettingsRepository$special$$inlined$mapNotNull$1$1 = new NavigatorSettingsRepository$special$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = navigatorSettingsRepository$special$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigatorSettingsRepository$special$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
