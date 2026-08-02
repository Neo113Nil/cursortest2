package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubOfferType;
import defpackage.c1v;
import defpackage.gxu;
import defpackage.iyu;
import defpackage.khq0;
import defpackage.le31;
import defpackage.ny61;
import defpackage.ru60;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ List b;
    public final /* synthetic */ iyu c;
    public final /* synthetic */ ru60 w;
    public final /* synthetic */ khq0 x;
    public final /* synthetic */ q y;

    public h(vpr vprVar, List list, iyu iyuVar, ru60 ru60Var, khq0 khq0Var, q qVar) {
        this.a = vprVar;
        this.b = list;
        this.c = iyuVar;
        this.w = ru60Var;
        this.x = khq0Var;
        this.y = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        VerticalHubV2UiStateInteractor$mapLoadingState$lambda$1$$inlined$map$1$2$1 verticalHubV2UiStateInteractor$mapLoadingState$lambda$1$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof VerticalHubV2UiStateInteractor$mapLoadingState$lambda$1$$inlined$map$1$2$1) {
            verticalHubV2UiStateInteractor$mapLoadingState$lambda$1$$inlined$map$1$2$1 = (VerticalHubV2UiStateInteractor$mapLoadingState$lambda$1$$inlined$map$1$2$1) continuation;
            int i2 = verticalHubV2UiStateInteractor$mapLoadingState$lambda$1$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalHubV2UiStateInteractor$mapLoadingState$lambda$1$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = verticalHubV2UiStateInteractor$mapLoadingState$lambda$1$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubV2UiStateInteractor$mapLoadingState$lambda$1$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    c1v c1vVar = (c1v) obj;
                    HubOfferType hubOfferType = this.w.b;
                    khq0 khq0Var = this.x;
                    le31 le31Var = new le31(this.b, this.c, null, hubOfferType, c1vVar, true, khq0Var != null ? q.a(this.y, khq0Var) : gxu.a, khq0Var != null ? khq0Var.a : null);
                    verticalHubV2UiStateInteractor$mapLoadingState$lambda$1$$inlined$map$1$2$1.L$0 = null;
                    verticalHubV2UiStateInteractor$mapLoadingState$lambda$1$$inlined$map$1$2$1.L$1 = null;
                    verticalHubV2UiStateInteractor$mapLoadingState$lambda$1$$inlined$map$1$2$1.L$2 = null;
                    verticalHubV2UiStateInteractor$mapLoadingState$lambda$1$$inlined$map$1$2$1.L$3 = null;
                    verticalHubV2UiStateInteractor$mapLoadingState$lambda$1$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(le31Var, verticalHubV2UiStateInteractor$mapLoadingState$lambda$1$$inlined$map$1$2$1) == coroutineSingletons) {
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
        verticalHubV2UiStateInteractor$mapLoadingState$lambda$1$$inlined$map$1$2$1 = new VerticalHubV2UiStateInteractor$mapLoadingState$lambda$1$$inlined$map$1$2$1(this, continuation);
        Object obj22 = verticalHubV2UiStateInteractor$mapLoadingState$lambda$1$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubV2UiStateInteractor$mapLoadingState$lambda$1$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
