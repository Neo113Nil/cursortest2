package com.yandex.go.safety.center.lost_item.modal.interactor;

import defpackage.ny61;
import defpackage.qrz;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;
    public final /* synthetic */ qrz c;

    public a(vpr vprVar, c cVar, qrz qrzVar) {
        this.a = vprVar;
        this.b = cVar;
        this.c = qrzVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        if (r7.emit(r9, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof LostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) {
            lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 = (LostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    com.yandex.go.safety.center.lost_item.modal.mapper.a aVar = this.b.d;
                    lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$4 = vprVar2;
                    lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$5 = null;
                    lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$6 = null;
                    lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = 1;
                    Object d = aVar.d(this.c, lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1);
                    if (d != coroutineSingletons) {
                        obj2 = d;
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                vprVar = (vpr) lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$0 = null;
                lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$1 = null;
                lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$2 = null;
                lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$3 = null;
                lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$4 = null;
                lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$5 = null;
                lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$6 = null;
                lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = 2;
            }
        }
        lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 = new LostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$0 = null;
        lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$1 = null;
        lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$2 = null;
        lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$3 = null;
        lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$4 = null;
        lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$5 = null;
        lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$6 = null;
        lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = 2;
    }
}
