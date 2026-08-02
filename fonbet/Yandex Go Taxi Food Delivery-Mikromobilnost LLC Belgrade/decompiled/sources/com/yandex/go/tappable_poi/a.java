package com.yandex.go.tappable_poi;

import com.yandex.go.tappable_poi.experiments.TappablePoiCardExperiment;
import defpackage.g6u;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        if (defpackage.tje.k0(r10, r2, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (kotlinx.coroutines.a.i(1000, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TappablePoiController$observeScreenToApplyMapStyle$1$invokeSuspend$$inlined$safeCollect$2$1 tappablePoiController$observeScreenToApplyMapStyle$1$invokeSuspend$$inlined$safeCollect$2$1;
        int i;
        TappablePoiCardExperiment.CardOption cardOption;
        if (continuation instanceof TappablePoiController$observeScreenToApplyMapStyle$1$invokeSuspend$$inlined$safeCollect$2$1) {
            tappablePoiController$observeScreenToApplyMapStyle$1$invokeSuspend$$inlined$safeCollect$2$1 = (TappablePoiController$observeScreenToApplyMapStyle$1$invokeSuspend$$inlined$safeCollect$2$1) continuation;
            int i2 = tappablePoiController$observeScreenToApplyMapStyle$1$invokeSuspend$$inlined$safeCollect$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tappablePoiController$observeScreenToApplyMapStyle$1$invokeSuspend$$inlined$safeCollect$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tappablePoiController$observeScreenToApplyMapStyle$1$invokeSuspend$$inlined$safeCollect$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tappablePoiController$observeScreenToApplyMapStyle$1$invokeSuspend$$inlined$safeCollect$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    cardOption = (TappablePoiCardExperiment.CardOption) obj;
                    tappablePoiController$observeScreenToApplyMapStyle$1$invokeSuspend$$inlined$safeCollect$2$1.L$0 = null;
                    tappablePoiController$observeScreenToApplyMapStyle$1$invokeSuspend$$inlined$safeCollect$2$1.L$1 = null;
                    tappablePoiController$observeScreenToApplyMapStyle$1$invokeSuspend$$inlined$safeCollect$2$1.L$2 = cardOption;
                    tappablePoiController$observeScreenToApplyMapStyle$1$invokeSuspend$$inlined$safeCollect$2$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    cardOption = (TappablePoiCardExperiment.CardOption) tappablePoiController$observeScreenToApplyMapStyle$1$invokeSuspend$$inlined$safeCollect$2$1.L$2;
                    kotlin.b.b(obj2);
                }
                if (this.a.o != null) {
                    this.a.i.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    TappablePoiController$observeScreenToApplyMapStyle$1$2$1 tappablePoiController$observeScreenToApplyMapStyle$1$2$1 = new TappablePoiController$observeScreenToApplyMapStyle$1$2$1(cardOption, this.a, null);
                    tappablePoiController$observeScreenToApplyMapStyle$1$invokeSuspend$$inlined$safeCollect$2$1.L$0 = null;
                    tappablePoiController$observeScreenToApplyMapStyle$1$invokeSuspend$$inlined$safeCollect$2$1.L$1 = null;
                    tappablePoiController$observeScreenToApplyMapStyle$1$invokeSuspend$$inlined$safeCollect$2$1.L$2 = null;
                    tappablePoiController$observeScreenToApplyMapStyle$1$invokeSuspend$$inlined$safeCollect$2$1.label = 2;
                }
                return zy11.a;
            }
        }
        tappablePoiController$observeScreenToApplyMapStyle$1$invokeSuspend$$inlined$safeCollect$2$1 = new TappablePoiController$observeScreenToApplyMapStyle$1$invokeSuspend$$inlined$safeCollect$2$1(this, continuation);
        Object obj22 = tappablePoiController$observeScreenToApplyMapStyle$1$invokeSuspend$$inlined$safeCollect$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tappablePoiController$observeScreenToApplyMapStyle$1$invokeSuspend$$inlined$safeCollect$2$1.label;
        if (i != 0) {
        }
        if (this.a.o != null) {
        }
        return zy11.a;
    }
}
