package com.yandex.go.mainscreen.superapp.impl.foundation.presentation;

import com.yandex.go.zone.model.Zone;
import defpackage.gd61;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperAppMainScreenPresenter$observeZoneChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1 superAppMainScreenPresenter$observeZoneChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof SuperAppMainScreenPresenter$observeZoneChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1) {
            superAppMainScreenPresenter$observeZoneChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = (SuperAppMainScreenPresenter$observeZoneChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = superAppMainScreenPresenter$observeZoneChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppMainScreenPresenter$observeZoneChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superAppMainScreenPresenter$observeZoneChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainScreenPresenter$observeZoneChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Zone zone = ((gd61) obj).b;
                    if (zone != null) {
                        superAppMainScreenPresenter$observeZoneChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$0 = null;
                        superAppMainScreenPresenter$observeZoneChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$1 = null;
                        superAppMainScreenPresenter$observeZoneChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$2 = null;
                        superAppMainScreenPresenter$observeZoneChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$3 = null;
                        superAppMainScreenPresenter$observeZoneChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$4 = null;
                        superAppMainScreenPresenter$observeZoneChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(zone, superAppMainScreenPresenter$observeZoneChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        superAppMainScreenPresenter$observeZoneChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = new SuperAppMainScreenPresenter$observeZoneChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = superAppMainScreenPresenter$observeZoneChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainScreenPresenter$observeZoneChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
