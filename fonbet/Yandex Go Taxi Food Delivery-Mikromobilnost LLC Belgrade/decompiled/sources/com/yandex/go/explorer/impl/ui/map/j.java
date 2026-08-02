package com.yandex.go.explorer.impl.ui.map;

import com.yandex.go.explorer.impl.experiments.ExplorerExperiment;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.xto;
import defpackage.zs7;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class j implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ List b;

    public j(vpr vprVar, List list) {
        this.a = vprVar;
        this.b = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ExplorerPresenter$subscribeToZoomUpdates$1$invokeSuspend$$inlined$map$1$2$1 explorerPresenter$subscribeToZoomUpdates$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ExplorerPresenter$subscribeToZoomUpdates$1$invokeSuspend$$inlined$map$1$2$1) {
            explorerPresenter$subscribeToZoomUpdates$1$invokeSuspend$$inlined$map$1$2$1 = (ExplorerPresenter$subscribeToZoomUpdates$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = explorerPresenter$subscribeToZoomUpdates$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                explorerPresenter$subscribeToZoomUpdates$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = explorerPresenter$subscribeToZoomUpdates$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = explorerPresenter$subscribeToZoomUpdates$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    i3y i3yVar = xto.a;
                    float zoom = ((zs7) obj).a.getZoom();
                    List list = this.b;
                    int i3 = 10;
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ExplorerExperiment.ZoomToResolution zoomToResolution = (ExplorerExperiment.ZoomToResolution) it.next();
                            if (zoom <= zoomToResolution.a) {
                                i3 = zoomToResolution.b;
                                break;
                            }
                        }
                    }
                    Integer num = new Integer(i3);
                    explorerPresenter$subscribeToZoomUpdates$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    explorerPresenter$subscribeToZoomUpdates$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    explorerPresenter$subscribeToZoomUpdates$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    explorerPresenter$subscribeToZoomUpdates$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    explorerPresenter$subscribeToZoomUpdates$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(num, explorerPresenter$subscribeToZoomUpdates$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        explorerPresenter$subscribeToZoomUpdates$1$invokeSuspend$$inlined$map$1$2$1 = new ExplorerPresenter$subscribeToZoomUpdates$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = explorerPresenter$subscribeToZoomUpdates$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = explorerPresenter$subscribeToZoomUpdates$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
