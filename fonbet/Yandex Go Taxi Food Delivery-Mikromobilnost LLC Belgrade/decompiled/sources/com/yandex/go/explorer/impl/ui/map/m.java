package com.yandex.go.explorer.impl.ui.map;

import com.yandex.go.explorer.impl.experiments.ExplorerExperiment;
import defpackage.d6z;
import defpackage.evu0;
import defpackage.fto;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.t1b0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class m {
    public final k7x0 a;
    public final com.yandex.go.explorer.impl.experiments.g b;

    public m(k7x0 k7x0Var, com.yandex.go.explorer.impl.experiments.g gVar) {
        this.a = k7x0Var;
        this.b = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ExplorerUiStateProvider$getDistrictExploreFinishedIconUrl$1 explorerUiStateProvider$getDistrictExploreFinishedIconUrl$1;
        Object obj;
        int i;
        if (continuationImpl instanceof ExplorerUiStateProvider$getDistrictExploreFinishedIconUrl$1) {
            explorerUiStateProvider$getDistrictExploreFinishedIconUrl$1 = (ExplorerUiStateProvider$getDistrictExploreFinishedIconUrl$1) continuationImpl;
            int i2 = explorerUiStateProvider$getDistrictExploreFinishedIconUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                explorerUiStateProvider$getDistrictExploreFinishedIconUrl$1.label = i2 - Integer.MIN_VALUE;
                obj = explorerUiStateProvider$getDistrictExploreFinishedIconUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = explorerUiStateProvider$getDistrictExploreFinishedIconUrl$1.label;
                com.yandex.go.explorer.impl.experiments.g gVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    explorerUiStateProvider$getDistrictExploreFinishedIconUrl$1.label = 1;
                    obj = gVar.b(explorerUiStateProvider$getDistrictExploreFinishedIconUrl$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        String a = ((m7x0) this.a).a(((ExplorerExperiment) obj).g.a);
                        if (evu0.J(a)) {
                            return null;
                        }
                        return a;
                    }
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    explorerUiStateProvider$getDistrictExploreFinishedIconUrl$1.label = 2;
                    obj = ((t1b0) gVar.b.getValue()).b(explorerUiStateProvider$getDistrictExploreFinishedIconUrl$1);
                }
                return null;
            }
        }
        explorerUiStateProvider$getDistrictExploreFinishedIconUrl$1 = new ExplorerUiStateProvider$getDistrictExploreFinishedIconUrl$1(this, continuationImpl);
        obj = explorerUiStateProvider$getDistrictExploreFinishedIconUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = explorerUiStateProvider$getDistrictExploreFinishedIconUrl$1.label;
        com.yandex.go.explorer.impl.experiments.g gVar2 = this.b;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
    
        if (r13 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0047, code lost:
    
        if (r13 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(boolean z, ContinuationImpl continuationImpl) {
        ExplorerUiStateProvider$getExplorerButtonUiState$1 explorerUiStateProvider$getExplorerButtonUiState$1;
        Object obj;
        int i;
        if (continuationImpl instanceof ExplorerUiStateProvider$getExplorerButtonUiState$1) {
            explorerUiStateProvider$getExplorerButtonUiState$1 = (ExplorerUiStateProvider$getExplorerButtonUiState$1) continuationImpl;
            int i2 = explorerUiStateProvider$getExplorerButtonUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                explorerUiStateProvider$getExplorerButtonUiState$1.label = i2 - Integer.MIN_VALUE;
                obj = explorerUiStateProvider$getExplorerButtonUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = explorerUiStateProvider$getExplorerButtonUiState$1.label;
                com.yandex.go.explorer.impl.experiments.g gVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    explorerUiStateProvider$getExplorerButtonUiState$1.Z$0 = z;
                    explorerUiStateProvider$getExplorerButtonUiState$1.label = 1;
                    obj = gVar.b(explorerUiStateProvider$getExplorerButtonUiState$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = explorerUiStateProvider$getExplorerButtonUiState$1.Z$0;
                        kotlin.b.b(obj);
                        boolean z2 = z;
                        ExplorerExperiment explorerExperiment = (ExplorerExperiment) obj;
                        String Y = z2 ? d6z.Y(explorerExperiment, explorerExperiment.d.b) : d6z.Y(explorerExperiment, explorerExperiment.d.c);
                        String Y2 = z2 ? "" : d6z.Y(explorerExperiment, explorerExperiment.d.d);
                        String a = ((m7x0) this.a).a(explorerExperiment.d.a);
                        fto ftoVar = new fto(Y, Y2, a, z2, false, false);
                        if (evu0.J(Y) && evu0.J(a)) {
                            return null;
                        }
                        return ftoVar;
                    }
                    z = explorerUiStateProvider$getExplorerButtonUiState$1.Z$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    explorerUiStateProvider$getExplorerButtonUiState$1.Z$0 = z;
                    explorerUiStateProvider$getExplorerButtonUiState$1.label = 2;
                    obj = ((t1b0) gVar.b.getValue()).b(explorerUiStateProvider$getExplorerButtonUiState$1);
                }
                return null;
            }
        }
        explorerUiStateProvider$getExplorerButtonUiState$1 = new ExplorerUiStateProvider$getExplorerButtonUiState$1(this, continuationImpl);
        obj = explorerUiStateProvider$getExplorerButtonUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = explorerUiStateProvider$getExplorerButtonUiState$1.label;
        com.yandex.go.explorer.impl.experiments.g gVar2 = this.b;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return null;
    }
}
