package com.yandex.go.yb.lack_of_order.domain;

import com.yandex.go.yb.lack_of_order.experiments.MoneyNotEnoughExperiment;
import defpackage.aw51;
import defpackage.baq0;
import defpackage.bze;
import defpackage.c4v;
import defpackage.d6z;
import defpackage.g00;
import defpackage.gdc;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.kdc;
import defpackage.ksq0;
import defpackage.m7x0;
import defpackage.n6y0;
import defpackage.ny61;
import defpackage.o6y0;
import defpackage.swz0;
import defpackage.ufu;
import defpackage.vpr;
import defpackage.xqg0;
import defpackage.zv51;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.communications.model.widgets.ArrowActionType;

/* loaded from: classes15.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ MoneyNotEnoughExperiment b;
    public final /* synthetic */ e c;

    public c(vpr vprVar, MoneyNotEnoughExperiment moneyNotEnoughExperiment, e eVar) {
        this.a = vprVar;
        this.b = moneyNotEnoughExperiment;
        this.c = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MoneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$2$1 moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$2$1;
        int i;
        Object n6y0Var;
        MoneyNotEnoughExperiment moneyNotEnoughExperiment = this.b;
        MoneyNotEnoughExperiment.DialogItem dialogItem = moneyNotEnoughExperiment.d;
        MoneyNotEnoughExperiment.PromoblockListItem promoblockListItem = moneyNotEnoughExperiment.e;
        if (continuation instanceof MoneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$2$1) {
            moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$2$1 = (MoneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$2$1) continuation;
            int i2 = moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$2$1.label;
                bze bzeVar = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    aw51 aw51Var = (aw51) obj;
                    if (aw51Var != null) {
                        MoneyNotEnoughExperiment.PromoblockListItem.Companion.getClass();
                        boolean l = jl40.l(promoblockListItem, MoneyNotEnoughExperiment.PromoblockListItem.d);
                        e eVar = this.c;
                        if (l) {
                            MoneyNotEnoughExperiment.DialogItem.Companion.getClass();
                            if (!jl40.l(dialogItem, MoneyNotEnoughExperiment.DialogItem.d)) {
                                kdc b = ((ufu) eVar.a).b(dialogItem.a);
                                if (b == null) {
                                    b = new gdc(xqg0.orange_normal);
                                }
                                n6y0Var = new n6y0(d6z.Y(moneyNotEnoughExperiment, dialogItem.c), d6z.Y(moneyNotEnoughExperiment, dialogItem.b), b, aw51Var);
                            }
                        } else {
                            String a = ((m7x0) eVar.b).a(promoblockListItem.a);
                            ru.yandex.taxi.common_models.net.b bVar = FormattedText.Companion;
                            FormattedText c = bVar.c(d6z.Y(moneyNotEnoughExperiment, promoblockListItem.b));
                            FormattedText c2 = bVar.c(d6z.Y(moneyNotEnoughExperiment, promoblockListItem.c));
                            zv51 zv51Var = aw51Var.a;
                            g00 g00Var = new g00(Collections.singletonList(new baq0(ArrowActionType.TOPUP_CARD, zv51Var != null ? new swz0(zv51Var.b, zv51Var.a) : null, 254)), 3);
                            c4v c4vVar = new c4v(null, a);
                            CommunicationItem.a aVar = new CommunicationItem.a(g00Var, bzeVar, 223);
                            List singletonList = Collections.singletonList(CommunicationItem.DisplayOnType.MULTIORDER);
                            jsq0 jsq0Var = ksq0.a;
                            n6y0Var = new o6y0(new CommunicationItem(c, c2, c4vVar, aVar, new jsq0(singletonList), 1456));
                        }
                        moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$2$1.L$0 = null;
                        moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$2$1.L$1 = null;
                        moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$2$1.L$2 = null;
                        moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$2$1.L$3 = null;
                        moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$2$1.label = 1;
                        if (this.a.emit(n6y0Var, moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    n6y0Var = null;
                    moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$2$1.L$0 = null;
                    moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$2$1.L$1 = null;
                    moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$2$1.L$2 = null;
                    moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$2$1.L$3 = null;
                    moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(n6y0Var, moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$2$1 = new MoneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = moneyNotEnoughExperimentInteractorImpl$informerFlow$$inlined$map$1$2$1.label;
        bze bzeVar2 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
