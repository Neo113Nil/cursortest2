package com.yandex.go.tariffcard.ui;

import defpackage.ems;
import defpackage.fnx0;
import defpackage.kdu;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o9u;
import defpackage.p9u;
import defpackage.q9u;
import defpackage.r9u;
import defpackage.tix0;
import defpackage.vfx0;
import defpackage.w511;
import defpackage.w8u;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\n¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lfnx0;", "tariffSelection", "Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;", "priceLoadingState", "Lkdu;", "headerUiConfigHolder", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "", "Lr9u;", "headerGradientConfigs", "Lf6v;", "Lufx0;", "Lw8u;", "<anonymous>", "(Lfnx0;Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;Lkdu;Lru/yandex/taxi/theme/ThemeType;Ljava/util/List;)Lf6v;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.tariffcard.ui.TariffOptionsCardStateInteractor$headerFlow$2", f = "TariffOptionsCardStateInteractor.kt", l = {520}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TariffOptionsCardStateInteractor$headerFlow$2 extends SuspendLambda implements ems {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;
    final /* synthetic */ tix0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffOptionsCardStateInteractor$headerFlow$2(tix0 tix0Var, Continuation continuation) {
        super(6, continuation);
        this.this$0 = tix0Var;
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        TariffOptionsCardStateInteractor$headerFlow$2 tariffOptionsCardStateInteractor$headerFlow$2 = new TariffOptionsCardStateInteractor$headerFlow$2(this.this$0, (Continuation) obj6);
        tariffOptionsCardStateInteractor$headerFlow$2.L$0 = (fnx0) obj;
        tariffOptionsCardStateInteractor$headerFlow$2.L$1 = (PriceUpdate$PriceLoadingState) obj2;
        tariffOptionsCardStateInteractor$headerFlow$2.L$2 = (kdu) obj3;
        tariffOptionsCardStateInteractor$headerFlow$2.L$3 = (List) obj5;
        return tariffOptionsCardStateInteractor$headerFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        TariffOptionsCardStateInteractor$headerFlow$2 tariffOptionsCardStateInteractor$headerFlow$2;
        fnx0 fnx0Var = (fnx0) this.L$0;
        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState = (PriceUpdate$PriceLoadingState) this.L$1;
        kdu kduVar = (kdu) this.L$2;
        List list = (List) this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0.a;
            mi31 mi31Var = fnx0Var.a;
            String str = fnx0Var.d;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                r9u r9uVar = (r9u) obj2;
                boolean z = false;
                if (r9uVar instanceof p9u) {
                    List list2 = (List) ((p9u) r9uVar).a.get(str);
                    if (list2 != null) {
                        z = list2.contains(mi31Var.f);
                    }
                } else if (r9uVar instanceof o9u) {
                    List list3 = (List) ((o9u) r9uVar).a.get(str);
                    if (list3 != null) {
                        z = list3.contains(mi31Var.f);
                    }
                } else {
                    if (!(r9uVar instanceof q9u)) {
                        w511.b();
                        return null;
                    }
                    z = true;
                }
                if (z) {
                    break;
                }
            }
            r9u r9uVar2 = (r9u) obj2;
            if (r9uVar2 == null) {
                r9uVar2 = q9u.a;
            }
            this.L$0 = fnx0Var;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 1;
            tariffOptionsCardStateInteractor$headerFlow$2 = this;
            obj = eVar.b(mi31Var, priceUpdate$PriceLoadingState, kduVar, r9uVar2, tariffOptionsCardStateInteractor$headerFlow$2);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            tariffOptionsCardStateInteractor$headerFlow$2 = this;
        }
        vfx0 vfx0Var = tariffOptionsCardStateInteractor$headerFlow$2.this$0.d;
        mi31 mi31Var2 = fnx0Var.a;
        vfx0Var.getClass();
        return ru.yandex.taxi.requirements.utils.c.b((w8u) obj, vfx0.a(mi31Var2));
    }
}
