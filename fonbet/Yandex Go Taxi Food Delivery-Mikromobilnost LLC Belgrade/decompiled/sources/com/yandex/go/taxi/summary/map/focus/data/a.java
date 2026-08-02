package com.yandex.go.taxi.summary.map.focus.data;

import com.yandex.go.navigation.screen.api.Screen;
import defpackage.ny61;
import defpackage.rsn;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
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
        SummaryClarifyRepositoryImpl$attach$$inlined$filter$1$2$1 summaryClarifyRepositoryImpl$attach$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof SummaryClarifyRepositoryImpl$attach$$inlined$filter$1$2$1) {
            summaryClarifyRepositoryImpl$attach$$inlined$filter$1$2$1 = (SummaryClarifyRepositoryImpl$attach$$inlined$filter$1$2$1) continuation;
            int i2 = summaryClarifyRepositoryImpl$attach$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryClarifyRepositoryImpl$attach$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = summaryClarifyRepositoryImpl$attach$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryClarifyRepositoryImpl$attach$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    rsn rsnVar = (rsn) obj;
                    Object obj3 = rsnVar.a;
                    Screen screen = Screen.SUMMARY;
                    if (obj3 == screen) {
                        Screen screen2 = (Screen) rsnVar.b;
                        screen2.getClass();
                        if (screen2 != screen && screen2 != Screen.ROUTE_SELECTOR && screen2 != Screen.CHOOSE_B) {
                            summaryClarifyRepositoryImpl$attach$$inlined$filter$1$2$1.L$0 = null;
                            summaryClarifyRepositoryImpl$attach$$inlined$filter$1$2$1.L$1 = null;
                            summaryClarifyRepositoryImpl$attach$$inlined$filter$1$2$1.L$2 = null;
                            summaryClarifyRepositoryImpl$attach$$inlined$filter$1$2$1.L$3 = null;
                            summaryClarifyRepositoryImpl$attach$$inlined$filter$1$2$1.label = 1;
                            if (this.a.emit(obj, summaryClarifyRepositoryImpl$attach$$inlined$filter$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
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
        summaryClarifyRepositoryImpl$attach$$inlined$filter$1$2$1 = new SummaryClarifyRepositoryImpl$attach$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = summaryClarifyRepositoryImpl$attach$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryClarifyRepositoryImpl$attach$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
