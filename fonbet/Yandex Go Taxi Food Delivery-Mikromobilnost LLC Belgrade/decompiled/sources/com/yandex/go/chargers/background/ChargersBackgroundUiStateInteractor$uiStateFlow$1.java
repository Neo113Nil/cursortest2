package com.yandex.go.chargers.background;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.go.chargers.data.g;
import com.yandex.go.chargers.data.model.ChargersExperiment;
import com.yandex.go.chargers.plus.api.ChargersPlusPlaqueExperiment;
import defpackage.bei;
import defpackage.ems;
import defpackage.ko9;
import defpackage.kyh0;
import defpackage.lo9;
import defpackage.lwa;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.mwa;
import defpackage.no9;
import defpackage.ny61;
import defpackage.oo9;
import defpackage.p1h0;
import defpackage.po9;
import defpackage.vva;
import defpackage.wn9;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/yandex/go/chargers/data/model/ChargersExperiment;", "chargersExp", "Lwn9;", "delegateState", "Lcom/yandex/go/chargers/plus/api/ChargersPlusPlaqueExperiment;", "plusExp", "Lvva;", "surge", "Lru/yandex/taxi/theme/ThemeType;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "Loo9;", "<anonymous>", "(Lcom/yandex/go/chargers/data/model/ChargersExperiment;Lwn9;Lcom/yandex/go/chargers/plus/api/ChargersPlusPlaqueExperiment;Lvva;Lru/yandex/taxi/theme/ThemeType;)Loo9;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.background.ChargersBackgroundUiStateInteractor$uiStateFlow$1", f = "ChargersBackgroundUiStateInteractor.kt", l = {40}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersBackgroundUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements ems {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ po9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersBackgroundUiStateInteractor$uiStateFlow$1(po9 po9Var, Continuation continuation) {
        super(6, continuation);
        this.this$0 = po9Var;
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        ChargersBackgroundUiStateInteractor$uiStateFlow$1 chargersBackgroundUiStateInteractor$uiStateFlow$1 = new ChargersBackgroundUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj6);
        chargersBackgroundUiStateInteractor$uiStateFlow$1.L$0 = (ChargersExperiment) obj;
        chargersBackgroundUiStateInteractor$uiStateFlow$1.L$1 = (wn9) obj2;
        chargersBackgroundUiStateInteractor$uiStateFlow$1.L$2 = (ChargersPlusPlaqueExperiment) obj3;
        chargersBackgroundUiStateInteractor$uiStateFlow$1.L$3 = (vva) obj4;
        chargersBackgroundUiStateInteractor$uiStateFlow$1.L$4 = (ThemeType) obj5;
        return chargersBackgroundUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String a;
        ChargersExperiment chargersExperiment = (ChargersExperiment) this.L$0;
        wn9 wn9Var = (wn9) this.L$1;
        ChargersPlusPlaqueExperiment chargersPlusPlaqueExperiment = (ChargersPlusPlaqueExperiment) this.L$2;
        vva vvaVar = (vva) this.L$3;
        ThemeType themeType = (ThemeType) this.L$4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        no9 no9Var = null;
        if (i == 0) {
            b.b(obj);
            String str = chargersExperiment.f;
            a = str != null ? ((m7x0) this.this$0.b).a(str) : null;
            g gVar = this.this$0.g;
            this.L$0 = null;
            this.L$1 = wn9Var;
            this.L$2 = chargersPlusPlaqueExperiment;
            this.L$3 = vvaVar;
            this.L$4 = themeType;
            this.L$5 = a;
            this.label = 1;
            obj = gVar.d(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a = (String) this.L$5;
            b.b(obj);
        }
        String str2 = (String) obj;
        if (str2 == null) {
            str2 = this.this$0.c.a.getString(kyh0.chargers_discovery_title);
        }
        if (wn9Var.b) {
            no9Var = new no9(str2, a == null ? new ko9(p1h0.ic_chargers_discovery_toolbar) : new lo9(a));
        }
        no9 no9Var2 = no9Var;
        boolean z = wn9Var.a;
        boolean z2 = wn9Var.c && chargersPlusPlaqueExperiment.b;
        mwa lwaVar = (!wn9Var.d || vvaVar == null) ? bei.A : new lwa(vvaVar.a / 100.0f, vvaVar.c, vvaVar.b, themeType, vvaVar.d);
        this.this$0.h.a.getClass();
        return new oo9(z, no9Var2, z2, lwaVar);
    }
}
