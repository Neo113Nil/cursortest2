package com.yandex.go.drive.mapselection;

import com.yandex.go.layers.api.model.Action;
import com.yandex.go.layers.domain.g;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.dhm;
import defpackage.fkp;
import defpackage.fnx0;
import defpackage.jmp;
import defpackage.jqr;
import defpackage.mq5;
import defpackage.mth;
import defpackage.nm00;
import defpackage.ny61;
import defpackage.rfu0;
import defpackage.tcc;
import defpackage.tt2;
import defpackage.tyx;
import defpackage.uud0;
import defpackage.uyj;
import defpackage.wiq0;
import defpackage.zlp;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.common_models.net.map_object.MapObjectType;
import ru.yandex.taxi.common_models.net.map_object.r;
import ru.yandex.taxi.common_models.net.map_object.z;

/* loaded from: classes12.dex */
public final class a {
    public final wiq0 a;
    public final tyx b;
    public final g c;
    public final tt2 d;

    public a(wiq0 wiq0Var, tyx tyxVar, g gVar, tt2 tt2Var) {
        this.a = wiq0Var;
        this.b = tyxVar;
        this.c = gVar;
        this.d = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(fnx0 fnx0Var, Continuation continuation) {
        ChangeMapObjectByTariffSelectionInteractorImpl$handleDriveActionFlow$1 changeMapObjectByTariffSelectionInteractorImpl$handleDriveActionFlow$1;
        int i;
        fkp fkpVar;
        String str;
        zlp zlpVar;
        zzs zzsVar;
        List list;
        if (continuation instanceof ChangeMapObjectByTariffSelectionInteractorImpl$handleDriveActionFlow$1) {
            changeMapObjectByTariffSelectionInteractorImpl$handleDriveActionFlow$1 = (ChangeMapObjectByTariffSelectionInteractorImpl$handleDriveActionFlow$1) continuation;
            int i2 = changeMapObjectByTariffSelectionInteractorImpl$handleDriveActionFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changeMapObjectByTariffSelectionInteractorImpl$handleDriveActionFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = changeMapObjectByTariffSelectionInteractorImpl$handleDriveActionFlow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changeMapObjectByTariffSelectionInteractorImpl$handleDriveActionFlow$1.label;
                if (i != 0) {
                    b.b(obj);
                    dhm dhmVar = fnx0Var.c.Y;
                    String str2 = dhmVar != null ? dhmVar.c : null;
                    if (str2 == null || str2.length() == 0) {
                        return rfu0.i;
                    }
                    tyx tyxVar = this.b;
                    mth mthVar = new mth(tyxVar.c, 6);
                    tyxVar.a.getClass();
                    mth mthVar2 = new mth(new ru.yandex.taxi.layers.external.b(e.F(mthVar, uyj.a), str2), 6);
                    changeMapObjectByTariffSelectionInteractorImpl$handleDriveActionFlow$1.L$0 = null;
                    changeMapObjectByTariffSelectionInteractorImpl$handleDriveActionFlow$1.L$1 = null;
                    changeMapObjectByTariffSelectionInteractorImpl$handleDriveActionFlow$1.label = 1;
                    obj = e.y(mthVar2, changeMapObjectByTariffSelectionInteractorImpl$handleDriveActionFlow$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                fkpVar = (fkp) obj;
                if (fkpVar != null) {
                    jmp jmpVar = fkpVar.b;
                    if ((jmpVar != null ? jmpVar.k : null) == MapObjectType.DRIVE && (str = fkpVar.a) != null && (zlpVar = fkpVar.c) != null && (zzsVar = zlpVar.a) != null && jmpVar != null && (list = jmpVar.i) != null) {
                        List<uud0> list2 = list;
                        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                        for (uud0 uud0Var : list2) {
                            List list3 = uud0Var.a;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : list3) {
                                if (!(((z) obj2) instanceof r)) {
                                    arrayList2.add(obj2);
                                }
                            }
                            arrayList.add(new uud0(arrayList2, uud0Var.b, uud0Var.c));
                        }
                        return new nm00(str, zzsVar, arrayList, Action.TAP);
                    }
                }
                return null;
            }
        }
        changeMapObjectByTariffSelectionInteractorImpl$handleDriveActionFlow$1 = new ChangeMapObjectByTariffSelectionInteractorImpl$handleDriveActionFlow$1(this, continuation);
        Object obj3 = changeMapObjectByTariffSelectionInteractorImpl$handleDriveActionFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changeMapObjectByTariffSelectionInteractorImpl$handleDriveActionFlow$1.label;
        if (i != 0) {
        }
        fkpVar = (fkp) obj3;
        if (fkpVar != null) {
        }
        return null;
    }

    public final Object b(Continuation continuation) {
        mth mthVar = new mth(e.I(e.s(((k) this.a).j.b(), new mq5(14)), new ChangeMapObjectByTariffSelectionInteractorImpl$listenTariffSelection$3(2, this, a.class, "extractNotifyAction", "extractNotifyAction(Lru/yandex/taxi/tariffs/model/TariffSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0)), 6);
        this.d.getClass();
        return e.j(new kotlinx.coroutines.flow.k(new jqr(e.F(mthVar, uyj.a), new ChangeMapObjectByTariffSelectionInteractorImpl$listenTariffSelection$4(2, this.c, g.class, "notifyAction", "notifyAction(Lcom/yandex/go/layers/api/model/MapObjectActionEvent;)V", 4), 3), new ChangeMapObjectByTariffSelectionInteractorImpl$listenTariffSelection$5(this, null)), continuation);
    }
}
