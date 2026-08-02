package com.yandex.go.summary.interactor.anchored.state.content;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.haptic.HapticEffect;
import defpackage.a2d;
import defpackage.a6t0;
import defpackage.aej0;
import defpackage.amb1;
import defpackage.au2;
import defpackage.avj0;
import defpackage.bej0;
import defpackage.cej0;
import defpackage.dej0;
import defpackage.eej0;
import defpackage.fej0;
import defpackage.gej0;
import defpackage.hej0;
import defpackage.hq91;
import defpackage.iej0;
import defpackage.iq2;
import defpackage.jej0;
import defpackage.jl40;
import defpackage.kdj0;
import defpackage.kyh0;
import defpackage.lej0;
import defpackage.lgv;
import defpackage.mej0;
import defpackage.mja1;
import defpackage.ndj0;
import defpackage.nej0;
import defpackage.ny61;
import defpackage.olb1;
import defpackage.qqb;
import defpackage.rdj0;
import defpackage.rqb;
import defpackage.rya1;
import defpackage.sdj0;
import defpackage.sqb;
import defpackage.tcc;
import defpackage.tdj0;
import defpackage.tk91;
import defpackage.tqb;
import defpackage.uq90;
import defpackage.vom;
import defpackage.vpr;
import defpackage.w511;
import defpackage.xdj0;
import defpackage.xtb1;
import defpackage.ydj0;
import defpackage.zdj0;
import defpackage.zqb;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.design.ChipsState;
import ru.yandex.taxi.requirements.models.domain.RequirementBubbleAction;

/* loaded from: classes14.dex */
public final class s implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ nej0 b;

    public s(vpr vprVar, nej0 nej0Var) {
        this.a = vprVar;
        this.b = nej0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RequirementChipsUiStateInteractor$requirementChipsUiStateFlow$$inlined$map$1$2$1 requirementChipsUiStateInteractor$requirementChipsUiStateFlow$$inlined$map$1$2$1;
        int i;
        CoroutineSingletons coroutineSingletons;
        zdj0 ydj0Var;
        cej0 cej0Var;
        AppColor$Palette appColor$Palette;
        int i2;
        au2 c;
        Object obj2;
        AppColor$Palette appColor$Palette2;
        Pair pair;
        iej0 gej0Var;
        iej0 iej0Var;
        iej0 iej0Var2;
        iej0 fej0Var;
        String h;
        s sVar = this;
        if (continuation instanceof RequirementChipsUiStateInteractor$requirementChipsUiStateFlow$$inlined$map$1$2$1) {
            requirementChipsUiStateInteractor$requirementChipsUiStateFlow$$inlined$map$1$2$1 = (RequirementChipsUiStateInteractor$requirementChipsUiStateFlow$$inlined$map$1$2$1) continuation;
            int i3 = requirementChipsUiStateInteractor$requirementChipsUiStateFlow$$inlined$map$1$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                requirementChipsUiStateInteractor$requirementChipsUiStateFlow$$inlined$map$1$2$1.label = i3 - Integer.MIN_VALUE;
                Object obj3 = requirementChipsUiStateInteractor$requirementChipsUiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementChipsUiStateInteractor$requirementChipsUiStateFlow$$inlined$map$1$2$1.label;
                Object obj4 = null;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    List list = ((kdj0) obj).a;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ndj0 ndj0Var = (ndj0) it.next();
                        nej0 nej0Var = sVar.b;
                        zuj0 zuj0Var = nej0Var.d;
                        zqb zqbVar = ndj0Var.e;
                        int i4 = ndj0Var.d;
                        RequirementBubbleAction requirementBubbleAction = ndj0Var.f;
                        String str = ndj0Var.b;
                        String str2 = ndj0Var.a;
                        ChipsState chipsState = zqbVar.a;
                        tqb tqbVar = zqbVar.e;
                        ChipsState chipsState2 = ChipsState.WARNING;
                        Iterator it2 = it;
                        rqb rqbVar = rqb.a;
                        qqb qqbVar = qqb.a;
                        if (chipsState == chipsState2) {
                            coroutineSingletons = coroutineSingletons2;
                            ydj0Var = new ydj0(new tdj0(mja1.b("", null, 6), tk91.d(), AppColor$Palette.Error));
                        } else {
                            coroutineSingletons = coroutineSingletons2;
                            if (jl40.l(tqbVar, qqbVar) || jl40.l(tqbVar, rqbVar)) {
                                String str3 = zqbVar.c;
                                ydj0Var = new ydj0(new tdj0(mja1.b(str3 != null ? str3 : "", null, 6), null, AppColor$Palette.Text));
                            } else {
                                if (!(tqbVar instanceof sqb)) {
                                    w511.b();
                                    return null;
                                }
                                au2 c2 = amb1.c();
                                boolean z = ((sqb) tqbVar).b;
                                AppColor$Palette appColor$Palette3 = z ? AppColor$Palette.Text : AppColor$Palette.TextMinor;
                                RequirementBubbleAction requirementBubbleAction2 = ndj0Var.g;
                                switch (requirementBubbleAction2 == null ? -1 : mej0.b[requirementBubbleAction2.ordinal()]) {
                                    case -1:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                        cej0Var = null;
                                        ydj0Var = new xdj0(new sdj0(c2, appColor$Palette3, cej0Var, nej0Var.a(ndj0Var), ((avj0) zuj0Var).h(kyh0.counter_component_minus_content_description)));
                                        break;
                                    case 0:
                                    default:
                                        w511.b();
                                        return null;
                                    case 7:
                                        if (z) {
                                            cej0Var = new cej0(str2, str, HapticEffect.Tick);
                                            ydj0Var = new xdj0(new sdj0(c2, appColor$Palette3, cej0Var, nej0Var.a(ndj0Var), ((avj0) zuj0Var).h(kyh0.counter_component_minus_content_description)));
                                            break;
                                        }
                                        cej0Var = null;
                                        ydj0Var = new xdj0(new sdj0(c2, appColor$Palette3, cej0Var, nej0Var.a(ndj0Var), ((avj0) zuj0Var).h(kyh0.counter_component_minus_content_description)));
                                }
                            }
                        }
                        zdj0 zdj0Var = ydj0Var;
                        CharSequence charSequence = zqbVar.b;
                        int i5 = mej0.a[zqbVar.a.ordinal()];
                        if (i5 == 1) {
                            appColor$Palette = AppColor$Palette.Text;
                        } else {
                            if (i5 != 2) {
                                w511.b();
                                return null;
                            }
                            appColor$Palette = AppColor$Palette.Error;
                        }
                        rdj0 rdj0Var = new rdj0(charSequence, appColor$Palette);
                        if (jl40.l(tqbVar, qqbVar)) {
                            c = olb1.a;
                            if (c != null) {
                                i2 = i4;
                            } else {
                                lgv lgvVar = new lgv("ChevronRightL", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                                i2 = i4;
                                a6t0 a6t0Var = new a6t0(iq2.g);
                                uq90 uq90Var = new uq90();
                                uq90Var.k(9.0f, 20.0f);
                                uq90Var.i(-1.4f, -1.4f);
                                uq90Var.i(6.6f, -6.6f);
                                uq90Var.i(-6.6f, -6.6f);
                                uq90Var.h(9.0f, 4.0f);
                                uq90Var.i(8.0f, 8.0f);
                                uq90Var.c();
                                lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", uq90Var.a);
                                c = rya1.a(lgvVar.d(), true);
                                olb1.a = c;
                            }
                        } else {
                            i2 = i4;
                            if (jl40.l(tqbVar, rqbVar)) {
                                c = xtb1.c();
                            } else {
                                if (!(tqbVar instanceof sqb)) {
                                    w511.b();
                                    return null;
                                }
                                c = hq91.c();
                            }
                        }
                        au2 au2Var = c;
                        if (jl40.l(tqbVar, qqbVar) || jl40.l(tqbVar, rqbVar)) {
                            obj2 = null;
                            appColor$Palette2 = AppColor$Palette.TextMinor;
                        } else {
                            if (!(tqbVar instanceof sqb)) {
                                w511.b();
                                return null;
                            }
                            appColor$Palette2 = ((sqb) tqbVar).a ? AppColor$Palette.Text : AppColor$Palette.TextMinor;
                            obj2 = null;
                        }
                        if (jl40.l(tqbVar, qqbVar)) {
                            pair = new Pair(((avj0) zuj0Var).h(kyh0.common_settings), obj2);
                        } else if (jl40.l(tqbVar, rqbVar)) {
                            pair = new Pair(nej0Var.a(ndj0Var), ((avj0) zuj0Var).h(kyh0.common_remove));
                        } else {
                            if (!(tqbVar instanceof sqb)) {
                                w511.b();
                                return null;
                            }
                            pair = new Pair(nej0Var.a(ndj0Var), ((avj0) zuj0Var).h(kyh0.counter_component_plus_content_description));
                        }
                        String str4 = (String) pair.getFirst();
                        String str5 = (String) pair.getSecond();
                        int[] iArr = mej0.b;
                        switch (iArr[requirementBubbleAction.ordinal()]) {
                            case 1:
                                gej0Var = new gej0(str2, str, HapticEffect.Tick);
                                iej0Var = gej0Var;
                                aej0 aej0Var = new aej0(new sdj0(au2Var, appColor$Palette2, iej0Var, str4, str5));
                                switch (iArr[requirementBubbleAction.ordinal()]) {
                                    case 1:
                                    case 2:
                                    case 6:
                                    case 7:
                                        iej0Var2 = null;
                                        switch (iArr[requirementBubbleAction.ordinal()]) {
                                            case 1:
                                                h = ((avj0) zuj0Var).h(kyh0.common_remove);
                                                break;
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                            case 7:
                                                h = null;
                                                break;
                                            default:
                                                w511.b();
                                                return null;
                                        }
                                        arrayList.add(new jej0(str2 + "_" + str + "_" + i2, zdj0Var, rdj0Var, aej0Var, iej0Var2, nej0Var.a(ndj0Var), h));
                                        sVar = this;
                                        it = it2;
                                        coroutineSingletons2 = coroutineSingletons;
                                        obj4 = null;
                                    case 3:
                                        fej0Var = new fej0(HapticEffect.ClickMedium);
                                        iej0Var2 = fej0Var;
                                        switch (iArr[requirementBubbleAction.ordinal()]) {
                                        }
                                        arrayList.add(new jej0(str2 + "_" + str + "_" + i2, zdj0Var, rdj0Var, aej0Var, iej0Var2, nej0Var.a(ndj0Var), h));
                                        sVar = this;
                                        it = it2;
                                        coroutineSingletons2 = coroutineSingletons;
                                        obj4 = null;
                                        break;
                                    case 4:
                                        fej0Var = new eej0(HapticEffect.ClickMedium);
                                        iej0Var2 = fej0Var;
                                        switch (iArr[requirementBubbleAction.ordinal()]) {
                                        }
                                        arrayList.add(new jej0(str2 + "_" + str + "_" + i2, zdj0Var, rdj0Var, aej0Var, iej0Var2, nej0Var.a(ndj0Var), h));
                                        sVar = this;
                                        it = it2;
                                        coroutineSingletons2 = coroutineSingletons;
                                        obj4 = null;
                                        break;
                                    case 5:
                                        fej0Var = new bej0(str2, i2, HapticEffect.ClickMedium);
                                        iej0Var2 = fej0Var;
                                        switch (iArr[requirementBubbleAction.ordinal()]) {
                                        }
                                        arrayList.add(new jej0(str2 + "_" + str + "_" + i2, zdj0Var, rdj0Var, aej0Var, iej0Var2, nej0Var.a(ndj0Var), h));
                                        sVar = this;
                                        it = it2;
                                        coroutineSingletons2 = coroutineSingletons;
                                        obj4 = null;
                                        break;
                                    default:
                                        w511.b();
                                        return null;
                                }
                            case 2:
                                gej0Var = new hej0(str2, str, HapticEffect.Tick);
                                iej0Var = gej0Var;
                                aej0 aej0Var2 = new aej0(new sdj0(au2Var, appColor$Palette2, iej0Var, str4, str5));
                                switch (iArr[requirementBubbleAction.ordinal()]) {
                                }
                            case 6:
                                if ((tqbVar instanceof sqb) && ((sqb) tqbVar).a) {
                                    gej0Var = new dej0(str2, str, HapticEffect.Tick);
                                    iej0Var = gej0Var;
                                    aej0 aej0Var22 = new aej0(new sdj0(au2Var, appColor$Palette2, iej0Var, str4, str5));
                                    switch (iArr[requirementBubbleAction.ordinal()]) {
                                    }
                                }
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 7:
                                iej0Var = null;
                                aej0 aej0Var222 = new aej0(new sdj0(au2Var, appColor$Palette2, iej0Var, str4, str5));
                                switch (iArr[requirementBubbleAction.ordinal()]) {
                                }
                            default:
                                w511.b();
                                return null;
                        }
                    }
                    CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                    Object obj5 = obj4;
                    lej0 lej0Var = new lej0(com.yandex.go.design.compose.list.a.a(arrayList, vom.L, a2d.z));
                    requirementChipsUiStateInteractor$requirementChipsUiStateFlow$$inlined$map$1$2$1.L$0 = obj5;
                    requirementChipsUiStateInteractor$requirementChipsUiStateFlow$$inlined$map$1$2$1.L$1 = obj5;
                    requirementChipsUiStateInteractor$requirementChipsUiStateFlow$$inlined$map$1$2$1.L$2 = obj5;
                    requirementChipsUiStateInteractor$requirementChipsUiStateFlow$$inlined$map$1$2$1.L$3 = obj5;
                    requirementChipsUiStateInteractor$requirementChipsUiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(lej0Var, requirementChipsUiStateInteractor$requirementChipsUiStateFlow$$inlined$map$1$2$1) == coroutineSingletons3) {
                        return coroutineSingletons3;
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
        requirementChipsUiStateInteractor$requirementChipsUiStateFlow$$inlined$map$1$2$1 = new RequirementChipsUiStateInteractor$requirementChipsUiStateFlow$$inlined$map$1$2$1(sVar, continuation);
        Object obj32 = requirementChipsUiStateInteractor$requirementChipsUiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementChipsUiStateInteractor$requirementChipsUiStateFlow$$inlined$map$1$2$1.label;
        Object obj42 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
