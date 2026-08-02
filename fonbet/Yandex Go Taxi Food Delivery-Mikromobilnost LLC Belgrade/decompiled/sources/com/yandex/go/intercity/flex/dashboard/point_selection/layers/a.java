package com.yandex.go.intercity.flex.dashboard.point_selection.layers;

import defpackage.cq60;
import defpackage.fkp;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zlp;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;

    public a(vpr vprVar, String str) {
        this.a = vprVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        IntercityGetToPointLocationsInteractor$objectLocation$$inlined$map$1$2$1 intercityGetToPointLocationsInteractor$objectLocation$$inlined$map$1$2$1;
        int i;
        zzs zzsVar;
        Object obj2;
        zlp zlpVar;
        if (continuation instanceof IntercityGetToPointLocationsInteractor$objectLocation$$inlined$map$1$2$1) {
            intercityGetToPointLocationsInteractor$objectLocation$$inlined$map$1$2$1 = (IntercityGetToPointLocationsInteractor$objectLocation$$inlined$map$1$2$1) continuation;
            int i2 = intercityGetToPointLocationsInteractor$objectLocation$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intercityGetToPointLocationsInteractor$objectLocation$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = intercityGetToPointLocationsInteractor$objectLocation$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityGetToPointLocationsInteractor$objectLocation$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    List list = ((cq60) ((Pair) obj).c()).g;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (jl40.l(((fkp) obj2).a, this.b)) {
                                break;
                            }
                        }
                        fkp fkpVar = (fkp) obj2;
                        if (fkpVar != null && (zlpVar = fkpVar.c) != null) {
                            zzsVar = zlpVar.a;
                            intercityGetToPointLocationsInteractor$objectLocation$$inlined$map$1$2$1.L$0 = null;
                            intercityGetToPointLocationsInteractor$objectLocation$$inlined$map$1$2$1.L$1 = null;
                            intercityGetToPointLocationsInteractor$objectLocation$$inlined$map$1$2$1.L$2 = null;
                            intercityGetToPointLocationsInteractor$objectLocation$$inlined$map$1$2$1.L$3 = null;
                            intercityGetToPointLocationsInteractor$objectLocation$$inlined$map$1$2$1.label = 1;
                            if (this.a.emit(zzsVar, intercityGetToPointLocationsInteractor$objectLocation$$inlined$map$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    zzsVar = null;
                    intercityGetToPointLocationsInteractor$objectLocation$$inlined$map$1$2$1.L$0 = null;
                    intercityGetToPointLocationsInteractor$objectLocation$$inlined$map$1$2$1.L$1 = null;
                    intercityGetToPointLocationsInteractor$objectLocation$$inlined$map$1$2$1.L$2 = null;
                    intercityGetToPointLocationsInteractor$objectLocation$$inlined$map$1$2$1.L$3 = null;
                    intercityGetToPointLocationsInteractor$objectLocation$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(zzsVar, intercityGetToPointLocationsInteractor$objectLocation$$inlined$map$1$2$1) == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        intercityGetToPointLocationsInteractor$objectLocation$$inlined$map$1$2$1 = new IntercityGetToPointLocationsInteractor$objectLocation$$inlined$map$1$2$1(this, continuation);
        Object obj32 = intercityGetToPointLocationsInteractor$objectLocation$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityGetToPointLocationsInteractor$objectLocation$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
