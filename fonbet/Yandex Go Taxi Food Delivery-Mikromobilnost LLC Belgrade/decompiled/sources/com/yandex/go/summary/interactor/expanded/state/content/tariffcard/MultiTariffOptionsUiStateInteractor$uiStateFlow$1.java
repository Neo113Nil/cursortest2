package com.yandex.go.summary.interactor.expanded.state.content.tariffcard;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.multitariff.Description;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.divider.DividerUiState$CustomGroupTitleUiState$TextStyleUiState;
import defpackage.bms;
import defpackage.en40;
import defpackage.evu0;
import defpackage.fnx0;
import defpackage.irl;
import defpackage.jn40;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.vfx0;
import defpackage.x4c;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lfnx0;", "tariffSelection", "", "", "Lnco;", "etaUiStates", "Lzy11;", "<unused var>", "Lf6v;", "Lufx0;", "", "Lrcx0;", "<anonymous>", "(Lru/yandex/taxi/tariffs/model/TariffSelection;Ljava/util/Map;V)Lru/yandex/taxi/requirements/utils/Identifiable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.MultiTariffOptionsUiStateInteractor$uiStateFlow$1", f = "MultiTariffOptionsUiStateInteractor.kt", l = {91}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MultiTariffOptionsUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTariffOptionsUiStateInteractor$uiStateFlow$1(c cVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        MultiTariffOptionsUiStateInteractor$uiStateFlow$1 multiTariffOptionsUiStateInteractor$uiStateFlow$1 = new MultiTariffOptionsUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj4);
        multiTariffOptionsUiStateInteractor$uiStateFlow$1.L$0 = (fnx0) obj;
        multiTariffOptionsUiStateInteractor$uiStateFlow$1.L$1 = (Map) obj2;
        return multiTariffOptionsUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Description description;
        fnx0 fnx0Var = (fnx0) this.L$0;
        Map map = (Map) this.L$1;
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
            if (str == null || str.length() == 0) {
                str = null;
            }
            c cVar = this.this$0;
            this.L$0 = fnx0Var;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = str;
            this.label = 1;
            obj = c.a(cVar, mi31Var, map, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            str2 = str;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str3 = (String) this.L$3;
            kotlin.b.b(obj);
            str2 = str3;
        }
        List list = (List) obj;
        ListBuilder a = rcc.a();
        if (str2 != null && !evu0.J(str2)) {
            a.add(new irl(str2, str2, str2, AppColor$Palette.Text, DividerUiState$CustomGroupTitleUiState$TextStyleUiState.MULTI_TARIFF_OPTIONS_TEXT_STYLE, x4c.E, SlotSize.L));
        }
        a.addAll(list);
        ListBuilder j = a.j();
        vfx0 vfx0Var = this.this$0.b;
        mi31 mi31Var2 = fnx0Var.a;
        vfx0Var.getClass();
        return ru.yandex.taxi.requirements.utils.c.b(j, vfx0.a(mi31Var2));
    }
}
