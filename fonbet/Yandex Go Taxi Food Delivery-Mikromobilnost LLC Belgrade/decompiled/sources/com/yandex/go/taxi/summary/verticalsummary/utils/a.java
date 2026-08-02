package com.yandex.go.taxi.summary.verticalsummary.utils;

import defpackage.n6y;
import defpackage.ny61;
import defpackage.s6y;
import defpackage.t6y;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ wls b;

    public a(vpr vprVar, wls wlsVar) {
        this.a = vprVar;
        this.b = wlsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1 lazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1;
        int i;
        Integer num;
        if (continuation instanceof LazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1) {
            lazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = (LazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = lazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = lazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    s6y s6yVar = (s6y) obj;
                    List list = s6yVar.k;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        n6y n6yVar = (n6y) obj3;
                        wls wlsVar = this.b;
                        if (wlsVar != null ? ((Boolean) wlsVar.invoke(s6yVar, new Integer(((t6y) n6yVar).a))).booleanValue() : true) {
                            arrayList.add(obj3);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        num = new Integer(((t6y) ((n6y) it.next())).p);
                        while (it.hasNext()) {
                            Integer num2 = new Integer(((t6y) ((n6y) it.next())).p);
                            if (num.compareTo(num2) < 0) {
                                num = num2;
                            }
                        }
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        lazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$0 = null;
                        lazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$1 = null;
                        lazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$2 = null;
                        lazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$3 = null;
                        lazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$4 = null;
                        lazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(num, lazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        lazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = new LazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = lazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
