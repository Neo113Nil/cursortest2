package com.yandex.go.scooters.offers.v2.surge.info;

import defpackage.a3p0;
import defpackage.bvf0;
import defpackage.n3p0;
import defpackage.ny61;
import defpackage.o3p0;
import defpackage.rcc;
import defpackage.vpr;
import defpackage.y2p0;
import defpackage.zy11;
import java.util.Collection;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ i b;

    public g(vpr vprVar, i iVar) {
        this.a = vprVar;
        this.b = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0126, code lost:
    
        if (r11.emit(r12, r2) == r3) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1 scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1;
        Object obj2;
        CoroutineSingletons coroutineSingletons;
        int i;
        vpr vprVar;
        Object obj3;
        vpr vprVar2;
        y2p0 y2p0Var;
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        y2p0 y2p0Var2;
        vpr vprVar3;
        i iVar = this.b;
        e eVar = iVar.a;
        if (continuation instanceof ScootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1) {
            scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1 = (ScootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                obj2 = scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    y2p0 y2p0Var3 = (y2p0) obj;
                    vprVar = this.a;
                    if (y2p0Var3 != null) {
                        ListBuilder a = rcc.a();
                        scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$0 = null;
                        scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$1 = null;
                        scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$2 = null;
                        scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$3 = null;
                        scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$4 = vprVar;
                        scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$5 = null;
                        scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$6 = y2p0Var3;
                        scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$7 = a;
                        scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$8 = a;
                        scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$9 = a;
                        scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.label = 1;
                        eVar.getClass();
                        Object n = bvf0.n(new ScootersSurgeInfoContentItemMapper$mapHeaderItem$2(eVar, y2p0Var3, null), scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1);
                        if (n != coroutineSingletons) {
                            vprVar2 = vprVar;
                            y2p0Var = y2p0Var3;
                            list = a;
                            list2 = list;
                            obj2 = n;
                            list3 = list2;
                        }
                        return coroutineSingletons;
                    }
                    obj3 = n3p0.a;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$4 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$5 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$6 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$7 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$8 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$9 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.label = 3;
                } else if (i == 1) {
                    list = (List) scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$9;
                    list2 = (List) scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$8;
                    list3 = (List) scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$7;
                    y2p0Var = (y2p0) scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$6;
                    vprVar2 = (vpr) scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    list4 = (List) scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$9;
                    list2 = (List) scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$8;
                    list5 = (List) scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$7;
                    y2p0Var2 = (y2p0) scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$6;
                    vprVar3 = (vpr) scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                    list4.addAll((Collection) obj2);
                    String str = (String) y2p0Var2.g.i;
                    eVar.getClass();
                    list2.add(new a3p0(str));
                    obj3 = new o3p0(((ListBuilder) list5).j());
                    vprVar = vprVar3;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$4 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$5 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$6 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$7 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$8 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$9 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.label = 3;
                }
                list.add(obj2);
                scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$0 = null;
                scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$1 = null;
                scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$2 = null;
                scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$3 = null;
                scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$4 = vprVar2;
                scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$5 = null;
                scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$6 = y2p0Var;
                scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$7 = list3;
                scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$8 = list2;
                scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$9 = list2;
                scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.label = 2;
                obj2 = i.a(iVar, y2p0Var, scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1);
                if (obj2 != coroutineSingletons) {
                    list4 = list2;
                    list5 = list3;
                    y2p0Var2 = y2p0Var;
                    vprVar3 = vprVar2;
                    list4.addAll((Collection) obj2);
                    String str2 = (String) y2p0Var2.g.i;
                    eVar.getClass();
                    list2.add(new a3p0(str2));
                    obj3 = new o3p0(((ListBuilder) list5).j());
                    vprVar = vprVar3;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$4 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$5 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$6 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$7 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$8 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$9 = null;
                    scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.label = 3;
                }
                return coroutineSingletons;
            }
        }
        scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1 = new ScootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1(this, continuation);
        obj2 = scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        list.add(obj2);
        scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$0 = null;
        scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$1 = null;
        scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$2 = null;
        scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$3 = null;
        scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$4 = vprVar2;
        scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$5 = null;
        scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$6 = y2p0Var;
        scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$7 = list3;
        scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$8 = list2;
        scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.L$9 = list2;
        scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1.label = 2;
        obj2 = i.a(iVar, y2p0Var, scootersSurgeInfoUiStateInteractor$special$$inlined$map$1$2$1);
        if (obj2 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
