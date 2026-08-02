package com.yandex.go.summary.interactor.common.state;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.plus.text.PlusNewType;
import com.yandex.go.summary.ui.model.common.tariffcell.EtaUiState$TextStyle;
import com.yandex.go.summary.ui.model.common.tariffcell.PriceUiState$TextStyle;
import com.yandex.go.summary.ui.model.common.tariffcell.TariffNameUiState$TextStyle;
import com.yandex.go.summary.ui.model.common.tooltip.TooltipAlignment;
import com.yandex.go.taxi.experiments.ShowPolicyDto;
import com.yandex.go.taxi.order.cancel.paid.ui.CancelledOrderCostModalView;
import defpackage.a1h0;
import defpackage.akv0;
import defpackage.arm0;
import defpackage.avj0;
import defpackage.b8r;
import defpackage.bk31;
import defpackage.bpl0;
import defpackage.bvf0;
import defpackage.c5b1;
import defpackage.c6m;
import defpackage.cne0;
import defpackage.cvu0;
import defpackage.cx7;
import defpackage.d1f0;
import defpackage.d6m;
import defpackage.dmq0;
import defpackage.ej31;
import defpackage.elx0;
import defpackage.eq2;
import defpackage.euz0;
import defpackage.evu0;
import defpackage.fg31;
import defpackage.g86;
import defpackage.gw00;
import defpackage.hh8;
import defpackage.hjp0;
import defpackage.i69;
import defpackage.ijp0;
import defpackage.is60;
import defpackage.iuz0;
import defpackage.jfv;
import defpackage.jl40;
import defpackage.juz0;
import defpackage.k58;
import defpackage.kco;
import defpackage.kuz0;
import defpackage.kyh0;
import defpackage.luz0;
import defpackage.mex0;
import defpackage.mi31;
import defpackage.mja1;
import defpackage.mm4;
import defpackage.mmq0;
import defpackage.mr31;
import defpackage.muz0;
import defpackage.nco;
import defpackage.nmq0;
import defpackage.nuz0;
import defpackage.ny61;
import defpackage.o6d0;
import defpackage.ob31;
import defpackage.ob5;
import defpackage.oco;
import defpackage.ogx0;
import defpackage.ouz0;
import defpackage.pmq0;
import defpackage.pvz0;
import defpackage.q0f0;
import defpackage.qlq0;
import defpackage.qm4;
import defpackage.quz0;
import defpackage.qvz0;
import defpackage.r0f0;
import defpackage.rwa0;
import defpackage.s0f0;
import defpackage.sgx0;
import defpackage.swa0;
import defpackage.t0f0;
import defpackage.t49;
import defpackage.tcc;
import defpackage.tfe;
import defpackage.tpr;
import defpackage.tvz0;
import defpackage.twa0;
import defpackage.u49;
import defpackage.ua31;
import defpackage.up2;
import defpackage.vj31;
import defpackage.vl4;
import defpackage.vnx0;
import defpackage.w511;
import defpackage.wj31;
import defpackage.wp2;
import defpackage.x29;
import defpackage.xj31;
import defpackage.xjv0;
import defpackage.y1f;
import defpackage.ycc;
import defpackage.yt11;
import defpackage.zuj0;
import defpackage.zvd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.perf.screen.ElementPerformanceState;

/* loaded from: classes14.dex */
public final class c implements yt11 {
    public final c6m a;
    public final ru.yandex.taxi.preorder.summary.selector.ui.interactor.f b;
    public final bk31 c;
    public final ru.yandex.taxi.widget.utils.e d;
    public final ru.yandex.taxi.tooltips.repository.b e;
    public final t49 f;
    public final b8r g;
    public final akv0 h;
    public final zuj0 i;
    public final x29 j;
    public final kotlinx.coroutines.flow.internal.g k;

    public c(c6m c6mVar, ru.yandex.taxi.preorder.summary.selector.ui.interactor.f fVar, dmq0 dmq0Var, bk31 bk31Var, ru.yandex.taxi.widget.utils.e eVar, ru.yandex.taxi.tooltips.repository.b bVar, t49 t49Var, b8r b8rVar, akv0 akv0Var, zuj0 zuj0Var, x29 x29Var) {
        this.a = c6mVar;
        this.b = fVar;
        this.c = bk31Var;
        this.d = eVar;
        this.e = bVar;
        this.f = t49Var;
        this.g = b8rVar;
        this.h = akv0Var;
        this.i = zuj0Var;
        this.j = x29Var;
        this.k = kotlinx.coroutines.flow.e.X(dmq0Var.b(), new SelectorUiStateInteractor$special$$inlined$flatMapLatest$1(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(c cVar, elx0 elx0Var, ContinuationImpl continuationImpl) {
        SelectorUiStateInteractor$getTariffCellItemUiState$1 selectorUiStateInteractor$getTariffCellItemUiState$1;
        int i;
        cVar.getClass();
        if (continuationImpl instanceof SelectorUiStateInteractor$getTariffCellItemUiState$1) {
            selectorUiStateInteractor$getTariffCellItemUiState$1 = (SelectorUiStateInteractor$getTariffCellItemUiState$1) continuationImpl;
            int i2 = selectorUiStateInteractor$getTariffCellItemUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectorUiStateInteractor$getTariffCellItemUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = selectorUiStateInteractor$getTariffCellItemUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectorUiStateInteractor$getTariffCellItemUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    selectorUiStateInteractor$getTariffCellItemUiState$1.L$0 = null;
                    selectorUiStateInteractor$getTariffCellItemUiState$1.L$1 = cVar;
                    selectorUiStateInteractor$getTariffCellItemUiState$1.L$2 = elx0Var;
                    selectorUiStateInteractor$getTariffCellItemUiState$1.label = 1;
                    obj = cVar.m(elx0Var, selectorUiStateInteractor$getTariffCellItemUiState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    elx0Var = (elx0) selectorUiStateInteractor$getTariffCellItemUiState$1.L$2;
                    cVar = (c) selectorUiStateInteractor$getTariffCellItemUiState$1.L$1;
                    kotlin.b.b(obj);
                }
                return cVar.j(elx0Var, (d1f0) obj);
            }
        }
        selectorUiStateInteractor$getTariffCellItemUiState$1 = new SelectorUiStateInteractor$getTariffCellItemUiState$1(cVar, continuationImpl);
        Object obj2 = selectorUiStateInteractor$getTariffCellItemUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectorUiStateInteractor$getTariffCellItemUiState$1.label;
        if (i != 0) {
        }
        return cVar.j(elx0Var, (d1f0) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(c cVar, qlq0 qlq0Var, mmq0 mmq0Var, ContinuationImpl continuationImpl) {
        SelectorUiStateInteractor$resolveFullBackendPricesForDefaultSelector$1 selectorUiStateInteractor$resolveFullBackendPricesForDefaultSelector$1;
        int i;
        cVar.getClass();
        if (continuationImpl instanceof SelectorUiStateInteractor$resolveFullBackendPricesForDefaultSelector$1) {
            selectorUiStateInteractor$resolveFullBackendPricesForDefaultSelector$1 = (SelectorUiStateInteractor$resolveFullBackendPricesForDefaultSelector$1) continuationImpl;
            int i2 = selectorUiStateInteractor$resolveFullBackendPricesForDefaultSelector$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectorUiStateInteractor$resolveFullBackendPricesForDefaultSelector$1.label = i2 - Integer.MIN_VALUE;
                Object obj = selectorUiStateInteractor$resolveFullBackendPricesForDefaultSelector$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectorUiStateInteractor$resolveFullBackendPricesForDefaultSelector$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    LinkedHashMap k = k(qlq0Var.a);
                    if (k.isEmpty()) {
                        return null;
                    }
                    selectorUiStateInteractor$resolveFullBackendPricesForDefaultSelector$1.L$0 = null;
                    selectorUiStateInteractor$resolveFullBackendPricesForDefaultSelector$1.L$1 = mmq0Var;
                    selectorUiStateInteractor$resolveFullBackendPricesForDefaultSelector$1.L$2 = null;
                    selectorUiStateInteractor$resolveFullBackendPricesForDefaultSelector$1.label = 1;
                    obj = bvf0.n(new SelectorUiStateInteractor$resolveAllPrices$2(k, cVar, null), selectorUiStateInteractor$resolveFullBackendPricesForDefaultSelector$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mmq0Var = (mmq0) selectorUiStateInteractor$resolveFullBackendPricesForDefaultSelector$1.L$1;
                    kotlin.b.b(obj);
                }
                return new mmq0(r(mmq0Var.a, (Map) obj));
            }
        }
        selectorUiStateInteractor$resolveFullBackendPricesForDefaultSelector$1 = new SelectorUiStateInteractor$resolveFullBackendPricesForDefaultSelector$1(cVar, continuationImpl);
        Object obj2 = selectorUiStateInteractor$resolveFullBackendPricesForDefaultSelector$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectorUiStateInteractor$resolveFullBackendPricesForDefaultSelector$1.label;
        if (i != 0) {
        }
        return new mmq0(r(mmq0Var.a, (Map) obj2));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a8 A[LOOP:0: B:11:0x00a2->B:13:0x00a8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(c cVar, d6m d6mVar, nmq0 nmq0Var, ContinuationImpl continuationImpl) {
        SelectorUiStateInteractor$resolveFullBackendPricesForDoubleSelector$1 selectorUiStateInteractor$resolveFullBackendPricesForDoubleSelector$1;
        int i;
        cVar.getClass();
        if (continuationImpl instanceof SelectorUiStateInteractor$resolveFullBackendPricesForDoubleSelector$1) {
            selectorUiStateInteractor$resolveFullBackendPricesForDoubleSelector$1 = (SelectorUiStateInteractor$resolveFullBackendPricesForDoubleSelector$1) continuationImpl;
            int i2 = selectorUiStateInteractor$resolveFullBackendPricesForDoubleSelector$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectorUiStateInteractor$resolveFullBackendPricesForDoubleSelector$1.label = i2 - Integer.MIN_VALUE;
                Object obj = selectorUiStateInteractor$resolveFullBackendPricesForDoubleSelector$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectorUiStateInteractor$resolveFullBackendPricesForDoubleSelector$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list = d6mVar.b;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ycc.r(((elx0) it.next()).e, arrayList);
                    }
                    LinkedHashMap k = k(arrayList);
                    if (k.isEmpty()) {
                        return null;
                    }
                    selectorUiStateInteractor$resolveFullBackendPricesForDoubleSelector$1.L$0 = null;
                    selectorUiStateInteractor$resolveFullBackendPricesForDoubleSelector$1.L$1 = nmq0Var;
                    selectorUiStateInteractor$resolveFullBackendPricesForDoubleSelector$1.L$2 = null;
                    selectorUiStateInteractor$resolveFullBackendPricesForDoubleSelector$1.L$3 = null;
                    selectorUiStateInteractor$resolveFullBackendPricesForDoubleSelector$1.label = 1;
                    obj = bvf0.n(new SelectorUiStateInteractor$resolveAllPrices$2(k, cVar, null), selectorUiStateInteractor$resolveFullBackendPricesForDoubleSelector$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nmq0Var = (nmq0) selectorUiStateInteractor$resolveFullBackendPricesForDoubleSelector$1.L$1;
                    kotlin.b.b(obj);
                }
                Map map = (Map) obj;
                Map map2 = nmq0Var.b;
                LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map2.size()));
                for (Map.Entry entry : map2.entrySet()) {
                    linkedHashMap.put(entry.getKey(), r((vnx0) entry.getValue(), map));
                }
                return new nmq0(nmq0Var.a, linkedHashMap, nmq0Var.c);
            }
        }
        selectorUiStateInteractor$resolveFullBackendPricesForDoubleSelector$1 = new SelectorUiStateInteractor$resolveFullBackendPricesForDoubleSelector$1(cVar, continuationImpl);
        Object obj2 = selectorUiStateInteractor$resolveFullBackendPricesForDoubleSelector$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectorUiStateInteractor$resolveFullBackendPricesForDoubleSelector$1.label;
        if (i != 0) {
        }
        Map map3 = (Map) obj2;
        Map map22 = nmq0Var.b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(map22.size()));
        while (r5.hasNext()) {
        }
        return new nmq0(nmq0Var.a, linkedHashMap2, nmq0Var.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(c cVar, qlq0 qlq0Var, ContinuationImpl continuationImpl) {
        SelectorUiStateInteractor$toDefaultSelectorUiState$1 selectorUiStateInteractor$toDefaultSelectorUiState$1;
        int i;
        cVar.getClass();
        if (continuationImpl instanceof SelectorUiStateInteractor$toDefaultSelectorUiState$1) {
            selectorUiStateInteractor$toDefaultSelectorUiState$1 = (SelectorUiStateInteractor$toDefaultSelectorUiState$1) continuationImpl;
            int i2 = selectorUiStateInteractor$toDefaultSelectorUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectorUiStateInteractor$toDefaultSelectorUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = selectorUiStateInteractor$toDefaultSelectorUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectorUiStateInteractor$toDefaultSelectorUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list = qlq0Var.a;
                    selectorUiStateInteractor$toDefaultSelectorUiState$1.L$0 = null;
                    selectorUiStateInteractor$toDefaultSelectorUiState$1.label = 1;
                    obj = bvf0.n(new SelectorUiStateInteractor$getTariffSelectorUiState$2(list, cVar, null), selectorUiStateInteractor$toDefaultSelectorUiState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new mmq0((vnx0) obj);
            }
        }
        selectorUiStateInteractor$toDefaultSelectorUiState$1 = new SelectorUiStateInteractor$toDefaultSelectorUiState$1(cVar, continuationImpl);
        Object obj2 = selectorUiStateInteractor$toDefaultSelectorUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectorUiStateInteractor$toDefaultSelectorUiState$1.label;
        if (i != 0) {
        }
        return new mmq0((vnx0) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(c cVar, d6m d6mVar, ContinuationImpl continuationImpl) {
        SelectorUiStateInteractor$toDoubleSelectorUiState$1 selectorUiStateInteractor$toDoubleSelectorUiState$1;
        int i;
        fg31 fg31Var;
        cVar.getClass();
        if (continuationImpl instanceof SelectorUiStateInteractor$toDoubleSelectorUiState$1) {
            selectorUiStateInteractor$toDoubleSelectorUiState$1 = (SelectorUiStateInteractor$toDoubleSelectorUiState$1) continuationImpl;
            int i2 = selectorUiStateInteractor$toDoubleSelectorUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectorUiStateInteractor$toDoubleSelectorUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = selectorUiStateInteractor$toDoubleSelectorUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectorUiStateInteractor$toDoubleSelectorUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fg31 p = cVar.p(d6mVar);
                    selectorUiStateInteractor$toDoubleSelectorUiState$1.L$0 = d6mVar;
                    selectorUiStateInteractor$toDoubleSelectorUiState$1.L$1 = p;
                    selectorUiStateInteractor$toDoubleSelectorUiState$1.label = 1;
                    Object n = bvf0.n(new SelectorUiStateInteractor$getVerticalsTariffs$2(d6mVar, cVar, null), selectorUiStateInteractor$toDoubleSelectorUiState$1);
                    if (n == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = n;
                    fg31Var = p;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg31Var = (fg31) selectorUiStateInteractor$toDoubleSelectorUiState$1.L$1;
                    d6mVar = (d6m) selectorUiStateInteractor$toDoubleSelectorUiState$1.L$0;
                    kotlin.b.b(obj);
                }
                return new nmq0(fg31Var, (Map) obj, d6mVar.e);
            }
        }
        selectorUiStateInteractor$toDoubleSelectorUiState$1 = new SelectorUiStateInteractor$toDoubleSelectorUiState$1(cVar, continuationImpl);
        Object obj2 = selectorUiStateInteractor$toDoubleSelectorUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectorUiStateInteractor$toDoubleSelectorUiState$1.label;
        if (i != 0) {
        }
        return new nmq0(fg31Var, (Map) obj2, d6mVar.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(c cVar, d6m d6mVar, ContinuationImpl continuationImpl) {
        SelectorUiStateInteractor$toDoubleSelectorUiStateQuick$1 selectorUiStateInteractor$toDoubleSelectorUiStateQuick$1;
        int i;
        fg31 fg31Var;
        cVar.getClass();
        if (continuationImpl instanceof SelectorUiStateInteractor$toDoubleSelectorUiStateQuick$1) {
            selectorUiStateInteractor$toDoubleSelectorUiStateQuick$1 = (SelectorUiStateInteractor$toDoubleSelectorUiStateQuick$1) continuationImpl;
            int i2 = selectorUiStateInteractor$toDoubleSelectorUiStateQuick$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectorUiStateInteractor$toDoubleSelectorUiStateQuick$1.label = i2 - Integer.MIN_VALUE;
                Object obj = selectorUiStateInteractor$toDoubleSelectorUiStateQuick$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectorUiStateInteractor$toDoubleSelectorUiStateQuick$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fg31 p = cVar.p(d6mVar);
                    selectorUiStateInteractor$toDoubleSelectorUiStateQuick$1.L$0 = d6mVar;
                    selectorUiStateInteractor$toDoubleSelectorUiStateQuick$1.L$1 = p;
                    selectorUiStateInteractor$toDoubleSelectorUiStateQuick$1.label = 1;
                    Object n = bvf0.n(new SelectorUiStateInteractor$getVerticalsTariffsQuick$2(d6mVar, cVar, null), selectorUiStateInteractor$toDoubleSelectorUiStateQuick$1);
                    if (n == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = n;
                    fg31Var = p;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg31Var = (fg31) selectorUiStateInteractor$toDoubleSelectorUiStateQuick$1.L$1;
                    d6mVar = (d6m) selectorUiStateInteractor$toDoubleSelectorUiStateQuick$1.L$0;
                    kotlin.b.b(obj);
                }
                return new nmq0(fg31Var, (Map) obj, d6mVar.e);
            }
        }
        selectorUiStateInteractor$toDoubleSelectorUiStateQuick$1 = new SelectorUiStateInteractor$toDoubleSelectorUiStateQuick$1(cVar, continuationImpl);
        Object obj2 = selectorUiStateInteractor$toDoubleSelectorUiStateQuick$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectorUiStateInteractor$toDoubleSelectorUiStateQuick$1.label;
        if (i != 0) {
        }
        return new nmq0(fg31Var, (Map) obj2, d6mVar.e);
    }

    public static void h(String str, StringBuilder sb) {
        if (str == null || str.length() == 0) {
            return;
        }
        if (sb.length() > 0) {
            sb.append(Extension.FIX_SPACE);
        }
        sb.append((CharSequence) str);
    }

    public static d1f0 i(elx0 elx0Var, CharSequence charSequence) {
        AppColor$Palette appColor$Palette = AppColor$Palette.Text;
        boolean z = elx0Var.u;
        return new d1f0(charSequence, appColor$Palette, z ? PriceUiState$TextStyle.BODY2_MEDIUM : PriceUiState$TextStyle.BODY2_REGULAR, (z || elx0Var.w) ? 0 : -4);
    }

    public static LinkedHashMap k(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            elx0 elx0Var = (elx0) it.next();
            t0f0 t0f0Var = elx0Var.P;
            if ((t0f0Var instanceof r0f0) && !elx0Var.g) {
                ob5 ob5Var = new ob5(elx0Var.a, elx0Var.b, elx0Var.c, c5b1.e(elx0Var.j));
                is60 is60Var = elx0Var.d.b;
                linkedHashMap.put(ob5Var, ((r0f0) t0f0Var).a);
            }
        }
        return linkedHashMap;
    }

    public static mex0 q(mex0 mex0Var, Map map) {
        d1f0 d1f0Var;
        CharSequence charSequence = (CharSequence) map.get(mex0Var.a.a);
        return (charSequence == null || (d1f0Var = mex0Var.g) == null) ? mex0Var : mex0.a(mex0Var, new d1f0(charSequence, d1f0Var.b, d1f0Var.c, d1f0Var.d), null, null, 4031);
    }

    public static vnx0 r(vnx0 vnx0Var, Map map) {
        List<zvd> list = vnx0Var.b.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (zvd zvdVar : list) {
            mex0 q = q(zvdVar.b, map);
            mex0 mex0Var = zvdVar.a;
            arrayList.add(new zvd(mex0Var != null ? q(mex0Var, map) : null, q));
        }
        return new vnx0(vnx0Var.a, com.yandex.go.design.compose.list.a.b(arrayList, new arm0(21)));
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x020b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0291 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mex0 j(elx0 elx0Var, d1f0 d1f0Var) {
        quz0 quz0Var;
        boolean z;
        nuz0 nuz0Var;
        boolean z2;
        TooltipAlignment tooltipAlignment;
        quz0 quz0Var2;
        boolean z3;
        String str;
        quz0 quz0Var3;
        qm4 qm4Var;
        String str2;
        jfv jfvVar;
        boolean z4;
        oco ocoVar;
        akv0 akv0Var;
        twa0 twa0Var;
        twa0 twa0Var2;
        boolean z5;
        avj0 avj0Var;
        CharSequence text;
        StringBuilder sb;
        t0f0 t0f0Var;
        mr31 mr31Var = elx0Var.s;
        String str3 = elx0Var.a;
        sgx0 sgx0Var = elx0Var.d;
        nco ncoVar = elx0Var.l;
        boolean z6 = elx0Var.N;
        boolean z7 = elx0Var.w;
        boolean z8 = elx0Var.u;
        t49 t49Var = this.f;
        if (z8) {
            pvz0 pvz0Var = mr31Var != null ? mr31Var.j : null;
            if ((pvz0Var == null || this.e.a(pvz0Var)) && mr31Var != null) {
                boolean z9 = mr31Var.c;
                String str4 = mr31Var.a;
                quz0Var = null;
                wp2 wp2Var = mr31Var.k;
                euz0 euz0Var = new euz0(str4, wp2Var);
                tvz0 tvz0Var = (mr31Var.d && z9) ? new tvz0(wp2Var) : null;
                if (pvz0Var != null) {
                    z = z6;
                    nuz0Var = new nuz0(pvz0Var.a, pvz0Var.b, pvz0Var.c, pvz0Var.d);
                } else {
                    z = z6;
                    nuz0Var = null;
                }
                int i = pmq0.b[mr31Var.i.ordinal()];
                z2 = true;
                if (i == 1) {
                    tooltipAlignment = TooltipAlignment.START;
                } else if (i == 2) {
                    tooltipAlignment = TooltipAlignment.END;
                } else {
                    if (i != 3) {
                        w511.b();
                        return null;
                    }
                    tooltipAlignment = TooltipAlignment.CENTER;
                }
                quz0Var2 = new quz0(mr31Var.h, tooltipAlignment, euz0Var, tvz0Var, new ouz0(mr31Var.b), nuz0Var, z9 ? muz0.a : null);
                z3 = quz0Var2 == null ? z2 : false;
                if (elx0Var.g || (str = elx0Var.Q) == null) {
                    qm4Var = quz0Var;
                } else {
                    PlusNewType plusNewType = !z ? PlusNewType.Gradient : PlusNewType.Disabled;
                    mm4 mm4Var = !z ? o6d0.a : o6d0.b;
                    if (z3) {
                        String str5 = elx0Var.z;
                        u49 u49Var = (u49) t49Var;
                        u49Var.getClass();
                        if (((!z8 || str5.length() <= 0 || ((cne0) u49Var.a.b).g("ru.yandex.taxi.cashback.onboarding.CASHBACK_FOR_TRIP_SHOWED", false)) ? false : z2) && !evu0.J(str5)) {
                            AppColor$Palette appColor$Palette = AppColor$Palette.TextInvert;
                            quz0Var3 = new quz0(AppColor$Palette.BgInvert, TooltipAlignment.CENTER, new euz0(str5, appColor$Palette), new tvz0(appColor$Palette), luz0.a, null, kuz0.a);
                            qm4Var = new qm4(str, mm4Var, plusNewType, quz0Var3);
                        }
                    }
                    quz0Var3 = quz0Var;
                    qm4Var = new qm4(str, mm4Var, plusNewType, quz0Var3);
                }
                zuj0 zuj0Var = this.i;
                String h = !z8 ? ((avj0) zuj0Var).h(kyh0.summary_accessibility_tariff_open_details_label) : ((avj0) zuj0Var).h(kyh0.summary_accessibility_tariff_select_label);
                ej31 ej31Var = new ej31(new ob5(str3, elx0Var.b, elx0Var.c, c5b1.e(elx0Var.j)), sgx0Var.b, z8);
                i69 i69Var = !z8 ? new i69(88, 4, 4, 4, AppColor$Palette.BgMinor) : z7 ? new i69(88, 4, 4, 4, new up2(up2.b)) : new i69(72, 0, 0, 0, new up2(up2.b));
                str2 = elx0Var.O;
                if (str2 == null) {
                    str2 = "";
                }
                jfvVar = quz0Var;
                k58 k58Var = new k58(mja1.b(str2, jfvVar, 6), !z ? 1.0f : 0.5f, !z ? 88 : 72, !z ? 0 : -12);
                String str6 = elx0Var.f;
                AppColor$Palette appColor$Palette2 = !z8 ? AppColor$Palette.Text : AppColor$Palette.TextMinor;
                TariffNameUiState$TextStyle tariffNameUiState$TextStyle = !z8 ? TariffNameUiState$TextStyle.CAPTION1_MEDIUM : TariffNameUiState$TextStyle.CAPTION1_REGULAR;
                z4 = elx0Var.g;
                ogx0 ogx0Var = new ogx0(str6, appColor$Palette2, tariffNameUiState$TextStyle, z4, (!z8 || z7) ? 0 : -4);
                if (!z4) {
                    CharSequence text2 = ncoVar != null ? ncoVar.getText() : jfvVar;
                    if (text2 != null && !evu0.J(text2)) {
                        ocoVar = z8 ? new oco(text2, AppColor$Palette.Text, EtaUiState$TextStyle.CAPTION2_MEDIUM, AppColor$Palette.Background, 0) : ncoVar instanceof kco ? new oco(text2, AppColor$Palette.EverFront, EtaUiState$TextStyle.CAPTION2_MEDIUM, new up2(eq2.a), 0) : z7 ? new oco(text2, AppColor$Palette.TextMinor, EtaUiState$TextStyle.CAPTION2_REGULAR, AppColor$Palette.Background, 0) : new oco(text2, AppColor$Palette.TextMinor, EtaUiState$TextStyle.CAPTION2_REGULAR, AppColor$Palette.Background, -4);
                        akv0Var = this.h;
                        if (akv0Var.a.a(new xjv0(ElementPerformanceState.LARGEST_CONTENTFUL_PAINT)) && z8) {
                            t0f0Var = elx0Var.n;
                            if (t0f0Var == null ? t0f0Var.b() : false) {
                                twa0Var2 = swa0.a;
                                twa0Var = twa0Var2;
                                qm4 qm4Var2 = qm4Var != 0 ? qm4Var : jfvVar;
                                quz0 quz0Var4 = qm4Var2 != null ? qm4Var2.d : jfvVar;
                                z5 = (quz0Var2 == null || quz0Var4 != null) && z8;
                                avj0Var = (avj0) zuj0Var;
                                String h2 = avj0Var.h(kyh0.content_description_tariff_bubble_notification_prefix);
                                String h3 = avj0Var.h(kyh0.pool_tariff_title);
                                t0f0 t0f0Var2 = elx0Var.P;
                                String a = t0f0Var2 != null ? t0f0Var2.a() : jfvVar;
                                text = ncoVar != null ? ncoVar.getText() : jfvVar;
                                sb = new StringBuilder();
                                h(cvu0.v(h3, CancelledOrderCostModalView.PLACEHOLDER_TARIFF_NAME, elx0Var.f, false), sb);
                                h(a, sb);
                                if (text != null && !evu0.J(text)) {
                                    h(avj0Var.i(kyh0.summary_accessibility_tariff_eta, text), sb);
                                }
                                String str7 = elx0Var.R;
                                x29 x29Var = this.j;
                                x29Var.getClass();
                                h(tfe.a(str7, new hh8(10, x29Var), new cx7(26, x29Var)), sb);
                                if (z5) {
                                    h(h2, sb);
                                    h(quz0Var2 != null ? quz0Var2.c.a : null, sb);
                                    h(quz0Var4 != null ? quz0Var4.c.a : null, sb);
                                }
                                return new mex0(ej31Var, i69Var, k58Var, ogx0Var, ocoVar, elx0Var.V ? new y1f(a1h0.ic_promocode) : null, d1f0Var, qm4Var, quz0Var2, twa0Var, sb.toString(), h);
                            }
                        }
                        if (akv0Var.a.a(new xjv0(ElementPerformanceState.FIRST_CONTENTFUL_PAINT)) || !z8) {
                            twa0Var = jfvVar;
                            if (qm4Var != 0) {
                            }
                            if (qm4Var2 != null) {
                            }
                            if (quz0Var2 == null) {
                            }
                            avj0Var = (avj0) zuj0Var;
                            String h22 = avj0Var.h(kyh0.content_description_tariff_bubble_notification_prefix);
                            String h32 = avj0Var.h(kyh0.pool_tariff_title);
                            t0f0 t0f0Var22 = elx0Var.P;
                            if (t0f0Var22 != null) {
                            }
                            if (ncoVar != null) {
                            }
                            sb = new StringBuilder();
                            h(cvu0.v(h32, CancelledOrderCostModalView.PLACEHOLDER_TARIFF_NAME, elx0Var.f, false), sb);
                            h(a, sb);
                            if (text != null) {
                                h(avj0Var.i(kyh0.summary_accessibility_tariff_eta, text), sb);
                            }
                            String str72 = elx0Var.R;
                            x29 x29Var2 = this.j;
                            x29Var2.getClass();
                            h(tfe.a(str72, new hh8(10, x29Var2), new cx7(26, x29Var2)), sb);
                            if (z5) {
                            }
                            return new mex0(ej31Var, i69Var, k58Var, ogx0Var, ocoVar, elx0Var.V ? new y1f(a1h0.ic_promocode) : null, d1f0Var, qm4Var, quz0Var2, twa0Var, sb.toString(), h);
                        }
                        twa0Var2 = rwa0.a;
                        twa0Var = twa0Var2;
                        if (qm4Var != 0) {
                        }
                        if (qm4Var2 != null) {
                        }
                        if (quz0Var2 == null) {
                        }
                        avj0Var = (avj0) zuj0Var;
                        String h222 = avj0Var.h(kyh0.content_description_tariff_bubble_notification_prefix);
                        String h322 = avj0Var.h(kyh0.pool_tariff_title);
                        t0f0 t0f0Var222 = elx0Var.P;
                        if (t0f0Var222 != null) {
                        }
                        if (ncoVar != null) {
                        }
                        sb = new StringBuilder();
                        h(cvu0.v(h322, CancelledOrderCostModalView.PLACEHOLDER_TARIFF_NAME, elx0Var.f, false), sb);
                        h(a, sb);
                        if (text != null) {
                        }
                        String str722 = elx0Var.R;
                        x29 x29Var22 = this.j;
                        x29Var22.getClass();
                        h(tfe.a(str722, new hh8(10, x29Var22), new cx7(26, x29Var22)), sb);
                        if (z5) {
                        }
                        return new mex0(ej31Var, i69Var, k58Var, ogx0Var, ocoVar, elx0Var.V ? new y1f(a1h0.ic_promocode) : null, d1f0Var, qm4Var, quz0Var2, twa0Var, sb.toString(), h);
                    }
                }
                ocoVar = jfvVar;
                akv0Var = this.h;
                if (akv0Var.a.a(new xjv0(ElementPerformanceState.LARGEST_CONTENTFUL_PAINT))) {
                    t0f0Var = elx0Var.n;
                    if (t0f0Var == null ? t0f0Var.b() : false) {
                    }
                }
                if (akv0Var.a.a(new xjv0(ElementPerformanceState.FIRST_CONTENTFUL_PAINT))) {
                }
                twa0Var = jfvVar;
                if (qm4Var != 0) {
                }
                if (qm4Var2 != null) {
                }
                if (quz0Var2 == null) {
                }
                avj0Var = (avj0) zuj0Var;
                String h2222 = avj0Var.h(kyh0.content_description_tariff_bubble_notification_prefix);
                String h3222 = avj0Var.h(kyh0.pool_tariff_title);
                t0f0 t0f0Var2222 = elx0Var.P;
                if (t0f0Var2222 != null) {
                }
                if (ncoVar != null) {
                }
                sb = new StringBuilder();
                h(cvu0.v(h3222, CancelledOrderCostModalView.PLACEHOLDER_TARIFF_NAME, elx0Var.f, false), sb);
                h(a, sb);
                if (text != null) {
                }
                String str7222 = elx0Var.R;
                x29 x29Var222 = this.j;
                x29Var222.getClass();
                h(tfe.a(str7222, new hh8(10, x29Var222), new cx7(26, x29Var222)), sb);
                if (z5) {
                }
                return new mex0(ej31Var, i69Var, k58Var, ogx0Var, ocoVar, elx0Var.V ? new y1f(a1h0.ic_promocode) : null, d1f0Var, qm4Var, quz0Var2, twa0Var, sb.toString(), h);
            }
            mi31 b = this.g.b(sgx0Var, str3);
            if (b != null) {
                qvz0 a2 = ((u49) t49Var).a(b.a.S);
                String str8 = a2.b;
                AppColor$Palette appColor$Palette3 = AppColor$Palette.TextInvert;
                euz0 euz0Var2 = new euz0(str8, appColor$Palette3);
                tvz0 tvz0Var2 = new tvz0(appColor$Palette3);
                if (a2.a) {
                    quz0Var2 = new quz0(AppColor$Palette.BgInvert, TooltipAlignment.START, euz0Var2, tvz0Var2, juz0.a, null, iuz0.a);
                    z = z6;
                    z2 = true;
                    quz0Var = null;
                    if (quz0Var2 == null) {
                    }
                    if (elx0Var.g) {
                        if (!z) {
                        }
                        if (!z) {
                        }
                        if (z3) {
                        }
                        quz0Var3 = quz0Var;
                        qm4Var = new qm4(str, mm4Var, plusNewType, quz0Var3);
                        zuj0 zuj0Var2 = this.i;
                        String h4 = !z8 ? ((avj0) zuj0Var2).h(kyh0.summary_accessibility_tariff_open_details_label) : ((avj0) zuj0Var2).h(kyh0.summary_accessibility_tariff_select_label);
                        ej31 ej31Var2 = new ej31(new ob5(str3, elx0Var.b, elx0Var.c, c5b1.e(elx0Var.j)), sgx0Var.b, z8);
                        if (!z8) {
                        }
                        str2 = elx0Var.O;
                        if (str2 == null) {
                        }
                        jfvVar = quz0Var;
                        k58 k58Var2 = new k58(mja1.b(str2, jfvVar, 6), !z ? 1.0f : 0.5f, !z ? 88 : 72, !z ? 0 : -12);
                        String str62 = elx0Var.f;
                        AppColor$Palette appColor$Palette22 = !z8 ? AppColor$Palette.Text : AppColor$Palette.TextMinor;
                        TariffNameUiState$TextStyle tariffNameUiState$TextStyle2 = !z8 ? TariffNameUiState$TextStyle.CAPTION1_MEDIUM : TariffNameUiState$TextStyle.CAPTION1_REGULAR;
                        z4 = elx0Var.g;
                        ogx0 ogx0Var2 = new ogx0(str62, appColor$Palette22, tariffNameUiState$TextStyle2, z4, (!z8 || z7) ? 0 : -4);
                        if (!z4) {
                        }
                        ocoVar = jfvVar;
                        akv0Var = this.h;
                        if (akv0Var.a.a(new xjv0(ElementPerformanceState.LARGEST_CONTENTFUL_PAINT))) {
                        }
                        if (akv0Var.a.a(new xjv0(ElementPerformanceState.FIRST_CONTENTFUL_PAINT))) {
                        }
                        twa0Var = jfvVar;
                        if (qm4Var != 0) {
                        }
                        if (qm4Var2 != null) {
                        }
                        if (quz0Var2 == null) {
                        }
                        avj0Var = (avj0) zuj0Var2;
                        String h22222 = avj0Var.h(kyh0.content_description_tariff_bubble_notification_prefix);
                        String h32222 = avj0Var.h(kyh0.pool_tariff_title);
                        t0f0 t0f0Var22222 = elx0Var.P;
                        if (t0f0Var22222 != null) {
                        }
                        if (ncoVar != null) {
                        }
                        sb = new StringBuilder();
                        h(cvu0.v(h32222, CancelledOrderCostModalView.PLACEHOLDER_TARIFF_NAME, elx0Var.f, false), sb);
                        h(a, sb);
                        if (text != null) {
                        }
                        String str72222 = elx0Var.R;
                        x29 x29Var2222 = this.j;
                        x29Var2222.getClass();
                        h(tfe.a(str72222, new hh8(10, x29Var2222), new cx7(26, x29Var2222)), sb);
                        if (z5) {
                        }
                        return new mex0(ej31Var2, i69Var, k58Var2, ogx0Var2, ocoVar, elx0Var.V ? new y1f(a1h0.ic_promocode) : null, d1f0Var, qm4Var, quz0Var2, twa0Var, sb.toString(), h4);
                    }
                    qm4Var = quz0Var;
                    zuj0 zuj0Var22 = this.i;
                    String h42 = !z8 ? ((avj0) zuj0Var22).h(kyh0.summary_accessibility_tariff_open_details_label) : ((avj0) zuj0Var22).h(kyh0.summary_accessibility_tariff_select_label);
                    ej31 ej31Var22 = new ej31(new ob5(str3, elx0Var.b, elx0Var.c, c5b1.e(elx0Var.j)), sgx0Var.b, z8);
                    if (!z8) {
                    }
                    str2 = elx0Var.O;
                    if (str2 == null) {
                    }
                    jfvVar = quz0Var;
                    k58 k58Var22 = new k58(mja1.b(str2, jfvVar, 6), !z ? 1.0f : 0.5f, !z ? 88 : 72, !z ? 0 : -12);
                    String str622 = elx0Var.f;
                    AppColor$Palette appColor$Palette222 = !z8 ? AppColor$Palette.Text : AppColor$Palette.TextMinor;
                    TariffNameUiState$TextStyle tariffNameUiState$TextStyle22 = !z8 ? TariffNameUiState$TextStyle.CAPTION1_MEDIUM : TariffNameUiState$TextStyle.CAPTION1_REGULAR;
                    z4 = elx0Var.g;
                    ogx0 ogx0Var22 = new ogx0(str622, appColor$Palette222, tariffNameUiState$TextStyle22, z4, (!z8 || z7) ? 0 : -4);
                    if (!z4) {
                    }
                    ocoVar = jfvVar;
                    akv0Var = this.h;
                    if (akv0Var.a.a(new xjv0(ElementPerformanceState.LARGEST_CONTENTFUL_PAINT))) {
                    }
                    if (akv0Var.a.a(new xjv0(ElementPerformanceState.FIRST_CONTENTFUL_PAINT))) {
                    }
                    twa0Var = jfvVar;
                    if (qm4Var != 0) {
                    }
                    if (qm4Var2 != null) {
                    }
                    if (quz0Var2 == null) {
                    }
                    avj0Var = (avj0) zuj0Var22;
                    String h222222 = avj0Var.h(kyh0.content_description_tariff_bubble_notification_prefix);
                    String h322222 = avj0Var.h(kyh0.pool_tariff_title);
                    t0f0 t0f0Var222222 = elx0Var.P;
                    if (t0f0Var222222 != null) {
                    }
                    if (ncoVar != null) {
                    }
                    sb = new StringBuilder();
                    h(cvu0.v(h322222, CancelledOrderCostModalView.PLACEHOLDER_TARIFF_NAME, elx0Var.f, false), sb);
                    h(a, sb);
                    if (text != null) {
                    }
                    String str722222 = elx0Var.R;
                    x29 x29Var22222 = this.j;
                    x29Var22222.getClass();
                    h(tfe.a(str722222, new hh8(10, x29Var22222), new cx7(26, x29Var22222)), sb);
                    if (z5) {
                    }
                    return new mex0(ej31Var22, i69Var, k58Var22, ogx0Var22, ocoVar, elx0Var.V ? new y1f(a1h0.ic_promocode) : null, d1f0Var, qm4Var, quz0Var2, twa0Var, sb.toString(), h42);
                }
            }
        }
        z = z6;
        z2 = true;
        quz0Var2 = null;
        quz0Var = null;
        if (quz0Var2 == null) {
        }
        if (elx0Var.g) {
        }
        qm4Var = quz0Var;
        zuj0 zuj0Var222 = this.i;
        String h422 = !z8 ? ((avj0) zuj0Var222).h(kyh0.summary_accessibility_tariff_open_details_label) : ((avj0) zuj0Var222).h(kyh0.summary_accessibility_tariff_select_label);
        ej31 ej31Var222 = new ej31(new ob5(str3, elx0Var.b, elx0Var.c, c5b1.e(elx0Var.j)), sgx0Var.b, z8);
        if (!z8) {
        }
        str2 = elx0Var.O;
        if (str2 == null) {
        }
        jfvVar = quz0Var;
        k58 k58Var222 = new k58(mja1.b(str2, jfvVar, 6), !z ? 1.0f : 0.5f, !z ? 88 : 72, !z ? 0 : -12);
        String str6222 = elx0Var.f;
        AppColor$Palette appColor$Palette2222 = !z8 ? AppColor$Palette.Text : AppColor$Palette.TextMinor;
        TariffNameUiState$TextStyle tariffNameUiState$TextStyle222 = !z8 ? TariffNameUiState$TextStyle.CAPTION1_MEDIUM : TariffNameUiState$TextStyle.CAPTION1_REGULAR;
        z4 = elx0Var.g;
        ogx0 ogx0Var222 = new ogx0(str6222, appColor$Palette2222, tariffNameUiState$TextStyle222, z4, (!z8 || z7) ? 0 : -4);
        if (!z4) {
        }
        ocoVar = jfvVar;
        akv0Var = this.h;
        if (akv0Var.a.a(new xjv0(ElementPerformanceState.LARGEST_CONTENTFUL_PAINT))) {
        }
        if (akv0Var.a.a(new xjv0(ElementPerformanceState.FIRST_CONTENTFUL_PAINT))) {
        }
        twa0Var = jfvVar;
        if (qm4Var != 0) {
        }
        if (qm4Var2 != null) {
        }
        if (quz0Var2 == null) {
        }
        avj0Var = (avj0) zuj0Var222;
        String h2222222 = avj0Var.h(kyh0.content_description_tariff_bubble_notification_prefix);
        String h3222222 = avj0Var.h(kyh0.pool_tariff_title);
        t0f0 t0f0Var2222222 = elx0Var.P;
        if (t0f0Var2222222 != null) {
        }
        if (ncoVar != null) {
        }
        sb = new StringBuilder();
        h(cvu0.v(h3222222, CancelledOrderCostModalView.PLACEHOLDER_TARIFF_NAME, elx0Var.f, false), sb);
        h(a, sb);
        if (text != null) {
        }
        String str7222222 = elx0Var.R;
        x29 x29Var222222 = this.j;
        x29Var222222.getClass();
        h(tfe.a(str7222222, new hh8(10, x29Var222222), new cx7(26, x29Var222222)), sb);
        if (z5) {
        }
        return new mex0(ej31Var222, i69Var, k58Var222, ogx0Var222, ocoVar, elx0Var.V ? new y1f(a1h0.ic_promocode) : null, d1f0Var, qm4Var, quz0Var2, twa0Var, sb.toString(), h422);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(FormattedText formattedText, ContinuationImpl continuationImpl) {
        SelectorUiStateInteractor$convertFormattedTextWithFallback$1 selectorUiStateInteractor$convertFormattedTextWithFallback$1;
        int i;
        if (continuationImpl instanceof SelectorUiStateInteractor$convertFormattedTextWithFallback$1) {
            selectorUiStateInteractor$convertFormattedTextWithFallback$1 = (SelectorUiStateInteractor$convertFormattedTextWithFallback$1) continuationImpl;
            int i2 = selectorUiStateInteractor$convertFormattedTextWithFallback$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectorUiStateInteractor$convertFormattedTextWithFallback$1.label = i2 - Integer.MIN_VALUE;
                Object obj = selectorUiStateInteractor$convertFormattedTextWithFallback$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectorUiStateInteractor$convertFormattedTextWithFallback$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SelectorUiStateInteractor$convertFormattedTextWithFallback$2 selectorUiStateInteractor$convertFormattedTextWithFallback$2 = new SelectorUiStateInteractor$convertFormattedTextWithFallback$2(this, formattedText, null);
                    selectorUiStateInteractor$convertFormattedTextWithFallback$1.L$0 = formattedText;
                    selectorUiStateInteractor$convertFormattedTextWithFallback$1.label = 1;
                    obj = kotlinx.coroutines.a.w(750L, selectorUiStateInteractor$convertFormattedTextWithFallback$2, selectorUiStateInteractor$convertFormattedTextWithFallback$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    formattedText = (FormattedText) selectorUiStateInteractor$convertFormattedTextWithFallback$1.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence = (CharSequence) obj;
                return charSequence != null ? this.d.r(formattedText) : charSequence;
            }
        }
        selectorUiStateInteractor$convertFormattedTextWithFallback$1 = new SelectorUiStateInteractor$convertFormattedTextWithFallback$1(this, continuationImpl);
        Object obj2 = selectorUiStateInteractor$convertFormattedTextWithFallback$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectorUiStateInteractor$convertFormattedTextWithFallback$1.label;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        if (charSequence2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(elx0 elx0Var, ContinuationImpl continuationImpl) {
        SelectorUiStateInteractor$getPriceUiState$1 selectorUiStateInteractor$getPriceUiState$1;
        int i;
        CharSequence charSequence;
        if (continuationImpl instanceof SelectorUiStateInteractor$getPriceUiState$1) {
            selectorUiStateInteractor$getPriceUiState$1 = (SelectorUiStateInteractor$getPriceUiState$1) continuationImpl;
            int i2 = selectorUiStateInteractor$getPriceUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectorUiStateInteractor$getPriceUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = selectorUiStateInteractor$getPriceUiState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectorUiStateInteractor$getPriceUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!elx0Var.g) {
                        t0f0 t0f0Var = elx0Var.P;
                        if (t0f0Var instanceof q0f0) {
                            charSequence = ((q0f0) t0f0Var).c;
                        } else if (t0f0Var instanceof r0f0) {
                            FormattedText formattedText = ((r0f0) t0f0Var).a;
                            selectorUiStateInteractor$getPriceUiState$1.L$0 = elx0Var;
                            selectorUiStateInteractor$getPriceUiState$1.L$1 = null;
                            selectorUiStateInteractor$getPriceUiState$1.label = 1;
                            obj = l(formattedText, selectorUiStateInteractor$getPriceUiState$1);
                            if (obj == obj2) {
                                return obj2;
                            }
                        } else {
                            if (!(t0f0Var instanceof s0f0) && t0f0Var != null) {
                                w511.b();
                                return null;
                            }
                            charSequence = null;
                        }
                        if (charSequence != null) {
                            return i(elx0Var, charSequence);
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                elx0Var = (elx0) selectorUiStateInteractor$getPriceUiState$1.L$0;
                kotlin.b.b(obj);
                charSequence = (CharSequence) obj;
                if (charSequence != null) {
                }
                return null;
            }
        }
        selectorUiStateInteractor$getPriceUiState$1 = new SelectorUiStateInteractor$getPriceUiState$1(this, continuationImpl);
        Object obj3 = selectorUiStateInteractor$getPriceUiState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectorUiStateInteractor$getPriceUiState$1.label;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj3;
        if (charSequence != null) {
        }
        return null;
    }

    public final mex0 n(elx0 elx0Var) {
        CharSequence charSequence;
        d1f0 d1f0Var = null;
        if (!elx0Var.g) {
            t0f0 t0f0Var = elx0Var.P;
            if (t0f0Var instanceof q0f0) {
                charSequence = ((q0f0) t0f0Var).c;
            } else if (t0f0Var instanceof r0f0) {
                charSequence = this.d.r(((r0f0) t0f0Var).a);
            } else {
                if (!(t0f0Var instanceof s0f0) && t0f0Var != null) {
                    w511.b();
                    return null;
                }
                charSequence = null;
            }
            if (charSequence != null) {
                d1f0Var = i(elx0Var, charSequence);
            }
        }
        return j(elx0Var, d1f0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [zvd] */
    public final vnx0 o(List list) {
        mex0 mex0Var;
        Object obj;
        Object obj2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : list) {
            elx0 elx0Var = (elx0) obj3;
            Pair pair = new Pair(elx0Var.a, elx0Var.b);
            Object obj4 = linkedHashMap.get(pair);
            if (obj4 == null) {
                obj4 = new ArrayList();
                linkedHashMap.put(pair, obj4);
            }
            ((List) obj4).add(obj3);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            List list2 = (List) ((Map.Entry) it.next()).getValue();
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((elx0) obj).v) {
                    break;
                }
            }
            elx0 elx0Var2 = (elx0) obj;
            Iterator it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it3.next();
                if (!((elx0) obj2).v) {
                    break;
                }
            }
            elx0 elx0Var3 = (elx0) obj2;
            mex0 n = elx0Var2 != null ? n(elx0Var2) : null;
            mex0 n2 = elx0Var3 != null ? n(elx0Var3) : null;
            mex0 mex0Var2 = (n == null && n2 == null) ? null : (n != null || n2 == null) ? n : n2;
            mex0 zvdVar = mex0Var2 != null ? new zvd(n != null ? n2 : null, mex0Var2) : null;
            if (zvdVar != null) {
                arrayList.add(zvdVar);
            }
        }
        bpl0 b = com.yandex.go.design.compose.list.a.b(arrayList, new arm0(23));
        Iterator it4 = b.a.iterator();
        int i = 0;
        while (true) {
            if (!it4.hasNext()) {
                i = -1;
                break;
            }
            zvd zvdVar2 = (zvd) it4.next();
            if (zvdVar2.b.a.c || ((mex0Var = zvdVar2.a) != null && mex0Var.a.c)) {
                break;
            }
            i++;
        }
        return new vnx0(i, b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [wj31] */
    /* JADX WARN: Type inference failed for: r8v2, types: [vj31] */
    public final fg31 p(d6m d6mVar) {
        String str;
        ua31 ua31Var;
        boolean z = ((g86) this.c.a.getValue()) != null;
        ArrayList arrayList = d6mVar.a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ob31 ob31Var = (ob31) it.next();
            if (!evu0.J(ob31Var.a)) {
                String str2 = ob31Var.a;
                String str3 = ob31Var.b;
                if (z) {
                    String upperCase = str3.toUpperCase(Locale.ROOT);
                    boolean z2 = ob31Var.c;
                    vl4 vl4Var = ob31Var.e;
                    if (vl4Var != null) {
                        String str4 = vl4Var.a;
                        wp2 wp2Var = vl4Var.c;
                        wp2 wp2Var2 = vl4Var.e;
                        wp2 wp2Var3 = vl4Var.g;
                        Float f = vl4Var.h;
                        ShowPolicyDto showPolicyDto = vl4Var.i;
                        ua31Var = new ua31(str4, wp2Var, wp2Var2, wp2Var3, f, showPolicyDto != null ? showPolicyDto.a : null);
                    } else {
                        ua31Var = null;
                    }
                    str = new vj31(str2, upperCase, z2, ob31Var.f, ob31Var.g, ua31Var);
                } else {
                    str = new wj31(str2, str3, ob31Var.c, ob31Var.f, ob31Var.g);
                }
                r6 = str;
            }
            if (r6 != null) {
                arrayList2.add(r6);
            }
        }
        bpl0 b = com.yandex.go.design.compose.list.a.b(arrayList2, new arm0(22));
        List list = b.a;
        Iterator it2 = list.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            if (((xj31) it2.next()).isSelected()) {
                break;
            }
            i++;
        }
        boolean z3 = list.size() > 1;
        xj31 xj31Var = (xj31) kotlin.collections.a.R(list);
        return new fg31(i, b, z3, jl40.l(xj31Var != null ? xj31Var.getId() : null, "hub") ? ijp0.a : hjp0.a);
    }
}
