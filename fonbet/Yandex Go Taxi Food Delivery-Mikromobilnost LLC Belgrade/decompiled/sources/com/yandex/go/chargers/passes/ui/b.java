package com.yandex.go.chargers.passes.ui;

import com.yandex.go.chargers.passes.data.r0;
import defpackage.cy9;
import defpackage.hka;
import defpackage.ika;
import defpackage.iy9;
import defpackage.j6a;
import defpackage.k6a;
import defpackage.kka;
import defpackage.ly9;
import defpackage.m950;
import defpackage.ny61;
import defpackage.qka;
import defpackage.rja;
import defpackage.uja;
import defpackage.vja;
import defpackage.w511;
import defpackage.wja;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class b {
    public final r0 a;
    public final rja b;
    public final qka c;
    public final kka d;

    public b(r0 r0Var, rja rjaVar, qka qkaVar, kka kkaVar) {
        this.a = r0Var;
        this.b = rjaVar;
        this.c = qkaVar;
        this.d = kkaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, hka hkaVar, ContinuationImpl continuationImpl) {
        ChargersPassesUiActionInteractor$performResume$1 chargersPassesUiActionInteractor$performResume$1;
        int i;
        boolean z;
        if (continuationImpl instanceof ChargersPassesUiActionInteractor$performResume$1) {
            chargersPassesUiActionInteractor$performResume$1 = (ChargersPassesUiActionInteractor$performResume$1) continuationImpl;
            int i2 = chargersPassesUiActionInteractor$performResume$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPassesUiActionInteractor$performResume$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPassesUiActionInteractor$performResume$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassesUiActionInteractor$performResume$1.label;
                qka qkaVar = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    qkaVar.a(true);
                    chargersPassesUiActionInteractor$performResume$1.L$0 = null;
                    chargersPassesUiActionInteractor$performResume$1.L$1 = hkaVar;
                    chargersPassesUiActionInteractor$performResume$1.label = 1;
                    obj = this.a.g(str, chargersPassesUiActionInteractor$performResume$1, true);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    hkaVar = (hka) chargersPassesUiActionInteractor$performResume$1.L$1;
                    kotlin.b.b(obj);
                }
                wja wjaVar = (wja) obj;
                z = wjaVar instanceof vja;
                zy11 zy11Var = zy11.a;
                if (z) {
                    if (!(wjaVar instanceof uja)) {
                        w511.b();
                        return null;
                    }
                    qkaVar.a(false);
                    cy9 cy9Var = ((uja) wjaVar).a;
                    ika ikaVar = hkaVar.a;
                    ikaVar.A((m950) ikaVar.K.get(), new ly9(cy9Var), new iy9(2));
                    return zy11Var;
                }
                k6a k6aVar = ((vja) wjaVar).a;
                if (k6aVar != null) {
                    j6a.b((j6a) hkaVar.a.M.get(), k6aVar);
                }
                chargersPassesUiActionInteractor$performResume$1.L$0 = null;
                chargersPassesUiActionInteractor$performResume$1.L$1 = null;
                chargersPassesUiActionInteractor$performResume$1.L$2 = null;
                chargersPassesUiActionInteractor$performResume$1.label = 2;
                Object emit = this.b.a.emit(zy11Var, chargersPassesUiActionInteractor$performResume$1);
                return emit == coroutineSingletons ? coroutineSingletons : emit;
            }
        }
        chargersPassesUiActionInteractor$performResume$1 = new ChargersPassesUiActionInteractor$performResume$1(this, continuationImpl);
        Object obj2 = chargersPassesUiActionInteractor$performResume$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassesUiActionInteractor$performResume$1.label;
        qka qkaVar2 = this.c;
        if (i != 0) {
        }
        wja wjaVar2 = (wja) obj2;
        z = wjaVar2 instanceof vja;
        zy11 zy11Var2 = zy11.a;
        if (z) {
        }
    }
}
