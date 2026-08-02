package com.yandex.go.taxi.order.promo_plaques.domain;

import defpackage.jsq0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.communications.model.CommunicationItem;

/* loaded from: classes14.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;

    public d(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PromoPlaqueStyleInteractor$filterBottomSectionCommunications$$inlined$map$1$2$1 promoPlaqueStyleInteractor$filterBottomSectionCommunications$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof PromoPlaqueStyleInteractor$filterBottomSectionCommunications$$inlined$map$1$2$1) {
            promoPlaqueStyleInteractor$filterBottomSectionCommunications$$inlined$map$1$2$1 = (PromoPlaqueStyleInteractor$filterBottomSectionCommunications$$inlined$map$1$2$1) continuation;
            int i2 = promoPlaqueStyleInteractor$filterBottomSectionCommunications$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoPlaqueStyleInteractor$filterBottomSectionCommunications$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = promoPlaqueStyleInteractor$filterBottomSectionCommunications$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoPlaqueStyleInteractor$filterBottomSectionCommunications$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : (List) obj) {
                        jsq0 jsq0Var = ((CommunicationItem) obj3).j;
                        if (jsq0Var != null ? jsq0Var.contains(CommunicationItem.DisplayOnType.DETAILS) : true) {
                            arrayList.add(obj3);
                        }
                    }
                    promoPlaqueStyleInteractor$filterBottomSectionCommunications$$inlined$map$1$2$1.L$0 = null;
                    promoPlaqueStyleInteractor$filterBottomSectionCommunications$$inlined$map$1$2$1.L$1 = null;
                    promoPlaqueStyleInteractor$filterBottomSectionCommunications$$inlined$map$1$2$1.L$2 = null;
                    promoPlaqueStyleInteractor$filterBottomSectionCommunications$$inlined$map$1$2$1.L$3 = null;
                    promoPlaqueStyleInteractor$filterBottomSectionCommunications$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList, promoPlaqueStyleInteractor$filterBottomSectionCommunications$$inlined$map$1$2$1) == coroutineSingletons) {
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
        promoPlaqueStyleInteractor$filterBottomSectionCommunications$$inlined$map$1$2$1 = new PromoPlaqueStyleInteractor$filterBottomSectionCommunications$$inlined$map$1$2$1(this, continuation);
        Object obj22 = promoPlaqueStyleInteractor$filterBottomSectionCommunications$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoPlaqueStyleInteractor$filterBottomSectionCommunications$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
