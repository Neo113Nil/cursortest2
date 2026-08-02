package com.yandex.go.taxi.order.search.ui;

import com.yandex.go.taxi.order.models.api.response.SearchOverlayType;
import com.yandex.go.taxi.order.state.search.SearchState;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;

    public a(vpr vprVar, String str) {
        this.a = vprVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LongSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$$inlined$filter$1$2$1 longSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof LongSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$$inlined$filter$1$2$1) {
            longSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$$inlined$filter$1$2$1 = (LongSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$$inlined$filter$1$2$1) continuation;
            int i2 = longSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                longSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = longSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = longSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    SearchState searchState = (SearchState) obj;
                    if (jl40.l(searchState.a, this.b) && searchState.d == SearchOverlayType.ORDINARY) {
                        longSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$$inlined$filter$1$2$1.L$0 = null;
                        longSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$$inlined$filter$1$2$1.L$1 = null;
                        longSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$$inlined$filter$1$2$1.L$2 = null;
                        longSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$$inlined$filter$1$2$1.L$3 = null;
                        longSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, longSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        longSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$$inlined$filter$1$2$1 = new LongSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = longSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = longSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
