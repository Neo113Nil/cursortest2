package com.yandex.go.mainscreen.superapp.orders.domain;

import defpackage.d4s0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w201;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar, h hVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$2$1 superAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SuperAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$2$1) {
            superAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$2$1 = (SuperAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$2$1) continuation;
            int i2 = superAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = ((d4s0) obj).d;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (obj3 instanceof w201) {
                            arrayList.add(obj3);
                        }
                    }
                    superAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$2$1.L$0 = null;
                    superAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$2$1.L$1 = null;
                    superAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$2$1.L$2 = null;
                    superAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$2$1.L$3 = null;
                    superAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList, superAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$2$1) == coroutineSingletons) {
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
        superAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$2$1 = new SuperAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$2$1(this, continuation);
        Object obj22 = superAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
