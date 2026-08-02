package com.yandex.go.about.domain;

import com.yandex.go.zone.model.Policy;
import com.yandex.go.zone.model.Zone;
import defpackage.avj0;
import defpackage.evu0;
import defpackage.fa31;
import defpackage.kyh0;
import defpackage.l5;
import defpackage.ny61;
import defpackage.pk51;
import defpackage.pwd0;
import defpackage.rs2;
import defpackage.s4;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ s4 b;

    public a(vpr vprVar, s4 s4Var) {
        this.a = vprVar;
        this.b = s4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AboutAggregateInfoInteractor$aboutInfo$$inlined$map$1$2$1 aboutAggregateInfoInteractor$aboutInfo$$inlined$map$1$2$1;
        int i;
        List list;
        if (continuation instanceof AboutAggregateInfoInteractor$aboutInfo$$inlined$map$1$2$1) {
            aboutAggregateInfoInteractor$aboutInfo$$inlined$map$1$2$1 = (AboutAggregateInfoInteractor$aboutInfo$$inlined$map$1$2$1) continuation;
            int i2 = aboutAggregateInfoInteractor$aboutInfo$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aboutAggregateInfoInteractor$aboutInfo$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = aboutAggregateInfoInteractor$aboutInfo$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aboutAggregateInfoInteractor$aboutInfo$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Zone zone = (Zone) obj;
                    s4 s4Var = this.b;
                    pk51 pk51Var = s4Var.b;
                    ((rs2) s4Var.a.a).getClass();
                    fa31 fa31Var = new fa31("5.89.0", "128354");
                    String str = zone != null ? zone.m : null;
                    if (str == null || evu0.J(str)) {
                        str = null;
                    }
                    if (str == null) {
                        str = ((avj0) s4Var.d).h(kyh0.about_copyright);
                    }
                    if (str == null || evu0.J(str)) {
                        str = null;
                    }
                    String str2 = zone != null ? zone.t : null;
                    if (str2 == null || evu0.J(str2)) {
                        str2 = null;
                    }
                    List list2 = zone != null ? zone.s : null;
                    if (list2 == null) {
                        list = EmptyList.a;
                    } else {
                        List<Policy> list3 = list2;
                        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                        for (Policy policy : list3) {
                            String str3 = policy.b;
                            String str4 = "";
                            if (str3 == null) {
                                str3 = "";
                            }
                            String str5 = policy.c;
                            if (str5 != null) {
                                str4 = str5;
                            }
                            arrayList.add(new pwd0(str3, str4));
                        }
                        list = arrayList;
                    }
                    pk51Var.getClass();
                    l5 l5Var = new l5(fa31Var, str, str2, list);
                    aboutAggregateInfoInteractor$aboutInfo$$inlined$map$1$2$1.L$0 = null;
                    aboutAggregateInfoInteractor$aboutInfo$$inlined$map$1$2$1.L$1 = null;
                    aboutAggregateInfoInteractor$aboutInfo$$inlined$map$1$2$1.L$2 = null;
                    aboutAggregateInfoInteractor$aboutInfo$$inlined$map$1$2$1.L$3 = null;
                    aboutAggregateInfoInteractor$aboutInfo$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(l5Var, aboutAggregateInfoInteractor$aboutInfo$$inlined$map$1$2$1) == coroutineSingletons) {
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
        aboutAggregateInfoInteractor$aboutInfo$$inlined$map$1$2$1 = new AboutAggregateInfoInteractor$aboutInfo$$inlined$map$1$2$1(this, continuation);
        Object obj22 = aboutAggregateInfoInteractor$aboutInfo$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aboutAggregateInfoInteractor$aboutInfo$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
