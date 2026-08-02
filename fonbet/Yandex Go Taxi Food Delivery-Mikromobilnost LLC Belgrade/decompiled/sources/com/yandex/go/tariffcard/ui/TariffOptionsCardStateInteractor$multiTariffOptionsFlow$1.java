package com.yandex.go.tariffcard.ui;

import com.yandex.go.multitariff.Description;
import defpackage.cxu0;
import defpackage.dms;
import defpackage.en40;
import defpackage.fnx0;
import defpackage.jn40;
import defpackage.jx40;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.tix0;
import defpackage.vfx0;
import defpackage.ym40;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\n¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lfnx0;", "tariffSelection", "", "", "Lnco;", "etaUiStates", "Lcxu0;", "style", "Lzy11;", "<unused var>", "Lf6v;", "Lufx0;", "Ljx40;", "<anonymous>", "(Lru/yandex/taxi/tariffs/model/TariffSelection;Ljava/util/Map;Lru/yandex/taxi/styling/Style;V)Lru/yandex/taxi/requirements/utils/Identifiable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.tariffcard.ui.TariffOptionsCardStateInteractor$multiTariffOptionsFlow$1", f = "TariffOptionsCardStateInteractor.kt", l = {551}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TariffOptionsCardStateInteractor$multiTariffOptionsFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ tix0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffOptionsCardStateInteractor$multiTariffOptionsFlow$1(tix0 tix0Var, Continuation continuation) {
        super(5, continuation);
        this.this$0 = tix0Var;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        TariffOptionsCardStateInteractor$multiTariffOptionsFlow$1 tariffOptionsCardStateInteractor$multiTariffOptionsFlow$1 = new TariffOptionsCardStateInteractor$multiTariffOptionsFlow$1(this.this$0, (Continuation) obj5);
        tariffOptionsCardStateInteractor$multiTariffOptionsFlow$1.L$0 = (fnx0) obj;
        tariffOptionsCardStateInteractor$multiTariffOptionsFlow$1.L$1 = (Map) obj2;
        tariffOptionsCardStateInteractor$multiTariffOptionsFlow$1.L$2 = (cxu0) obj3;
        return tariffOptionsCardStateInteractor$multiTariffOptionsFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        TariffOptionsCardStateInteractor$multiTariffOptionsFlow$1 tariffOptionsCardStateInteractor$multiTariffOptionsFlow$1;
        String str2;
        Description description;
        fnx0 fnx0Var = (fnx0) this.L$0;
        Map map = (Map) this.L$1;
        cxu0 cxu0Var = (cxu0) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            mi31 mi31Var = fnx0Var.a;
            this.this$0.getClass();
            jn40 jn40Var = mi31Var.a.V;
            en40 en40Var = jn40Var != null ? jn40Var.b : null;
            if (en40Var == null || (description = en40Var.f) == null || (str = description.b) == null) {
                str = en40Var != null ? en40Var.c : null;
            }
            String str3 = (str == null || str.length() == 0) ? null : str;
            b bVar = this.this$0.B;
            boolean z = str3 == null;
            this.L$0 = fnx0Var;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = str3;
            this.label = 1;
            boolean z2 = z;
            tariffOptionsCardStateInteractor$multiTariffOptionsFlow$1 = this;
            obj = bVar.a(mi31Var, map, z2, cxu0Var, tariffOptionsCardStateInteractor$multiTariffOptionsFlow$1);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            str2 = str3;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = (String) this.L$4;
            kotlin.b.b(obj);
            tariffOptionsCardStateInteractor$multiTariffOptionsFlow$1 = this;
        }
        List list = (List) obj;
        if (str2 != null) {
            ListBuilder a = rcc.a();
            a.add(new ym40(str2));
            a.addAll(list);
            list = a.j();
        }
        String str4 = fnx0Var.c.b;
        jx40 jx40Var = new jx40(list);
        vfx0 vfx0Var = tariffOptionsCardStateInteractor$multiTariffOptionsFlow$1.this$0.d;
        mi31 mi31Var2 = fnx0Var.a;
        vfx0Var.getClass();
        return ru.yandex.taxi.requirements.utils.c.b(jx40Var, vfx0.a(mi31Var2));
    }
}
