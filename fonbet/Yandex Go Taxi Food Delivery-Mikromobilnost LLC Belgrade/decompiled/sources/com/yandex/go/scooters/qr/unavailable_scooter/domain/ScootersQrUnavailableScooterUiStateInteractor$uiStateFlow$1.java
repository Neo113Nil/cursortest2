package com.yandex.go.scooters.qr.unavailable_scooter.domain;

import com.yandex.go.scooters.qr.unavailable_scooter.data.model.ScootersQrUnavailableScooterExperiment;
import com.yandex.go.scooters.qr.unavailable_scooter.ui.d;
import defpackage.cro0;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.n7p0;
import defpackage.ny61;
import defpackage.pqo0;
import defpackage.r7p0;
import defpackage.rcc;
import defpackage.rqo0;
import defpackage.sqo0;
import defpackage.y0o0;
import defpackage.zls;
import defpackage.zy11;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/go/scooters/qr/unavailable_scooter/data/model/ScootersQrUnavailableScooterExperiment;", "experiment", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lcro0;", "<anonymous>", "(Lcom/yandex/go/scooters/qr/unavailable_scooter/data/model/ScootersQrUnavailableScooterExperiment;Lru/yandex/taxi/theme/ThemeType;)Lcro0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.qr.unavailable_scooter.domain.ScootersQrUnavailableScooterUiStateInteractor$uiStateFlow$1", f = "ScootersQrUnavailableScooterUiStateInteractor.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersQrUnavailableScooterUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements zls {
    final /* synthetic */ n7p0 $unavailable;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersQrUnavailableScooterUiStateInteractor$uiStateFlow$1(n7p0 n7p0Var, a aVar, Continuation continuation) {
        super(3, continuation);
        this.$unavailable = n7p0Var;
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersQrUnavailableScooterUiStateInteractor$uiStateFlow$1 scootersQrUnavailableScooterUiStateInteractor$uiStateFlow$1 = new ScootersQrUnavailableScooterUiStateInteractor$uiStateFlow$1(this.$unavailable, this.this$0, (Continuation) obj3);
        scootersQrUnavailableScooterUiStateInteractor$uiStateFlow$1.L$0 = (ScootersQrUnavailableScooterExperiment) obj;
        return scootersQrUnavailableScooterUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        n7p0 n7p0Var;
        String str;
        List list;
        List list2;
        a aVar;
        List list3;
        ScootersQrUnavailableScooterExperiment scootersQrUnavailableScooterExperiment = (ScootersQrUnavailableScooterExperiment) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        sqo0 sqo0Var = null;
        if (i == 0) {
            b.b(obj);
            n7p0Var = this.$unavailable;
            String str2 = n7p0Var.a;
            a aVar2 = this.this$0;
            ListBuilder a = rcc.a();
            d dVar = aVar2.c;
            this.L$0 = null;
            this.L$1 = aVar2;
            this.L$2 = n7p0Var;
            this.L$3 = a;
            this.L$4 = a;
            this.L$5 = a;
            this.L$6 = str2;
            this.label = 1;
            Object a2 = dVar.a(n7p0Var, scootersQrUnavailableScooterExperiment, this);
            if (a2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = str2;
            list = a;
            list2 = list;
            obj = a2;
            aVar = aVar2;
            list3 = list2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.L$6;
            list = (List) this.L$5;
            list3 = (List) this.L$4;
            list2 = (List) this.L$3;
            n7p0Var = (n7p0) this.L$2;
            aVar = (a) this.L$1;
            b.b(obj);
        }
        list.addAll((Collection) obj);
        d dVar2 = aVar.c;
        y0o0 y0o0Var = n7p0Var.c;
        dVar2.getClass();
        if (y0o0Var != null) {
            String str3 = y0o0Var.c;
            sqo0Var = new sqo0(str3.length() == 0 ? "" : ((m7x0) dVar2.a).a(str3), new r7p0(y0o0Var.a, y0o0Var.b), y0o0Var.d);
        }
        pqo0 pqo0Var = pqo0.a;
        if (sqo0Var != null) {
            list3.add(sqo0Var);
            list3.add(pqo0Var);
        } else {
            list3.add(pqo0Var);
            list3.add(rqo0.a);
        }
        return new cro0(str, ((ListBuilder) list2).j());
    }
}
