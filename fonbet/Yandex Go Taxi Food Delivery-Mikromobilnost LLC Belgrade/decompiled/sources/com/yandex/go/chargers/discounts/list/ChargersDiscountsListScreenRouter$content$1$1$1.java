package com.yandex.go.chargers.discounts.list;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersDiscountDetailsButton;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersDiscountsButtonV2;
import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountTypeDto;
import com.yandex.go.chargers.discounts.data.models.ChargersProgressDiscountDetailsDto;
import com.yandex.go.chargers.discounts.list.ui.ChargersDiscountsListUiState$Content$DiscountsTabType;
import com.yandex.go.chargers.discounts.list.ui.h;
import defpackage.as9;
import defpackage.boj0;
import defpackage.bs9;
import defpackage.c29;
import defpackage.cs9;
import defpackage.cy9;
import defpackage.ds9;
import defpackage.em9;
import defpackage.es9;
import defpackage.fs9;
import defpackage.gs9;
import defpackage.hh5;
import defpackage.io9;
import defpackage.ir9;
import defpackage.jl40;
import defpackage.jr9;
import defpackage.jv8;
import defpackage.jv9;
import defpackage.kgq0;
import defpackage.kr9;
import defpackage.kv9;
import defpackage.lc0;
import defpackage.lea0;
import defpackage.lg21;
import defpackage.lr9;
import defpackage.ls9;
import defpackage.lv9;
import defpackage.ly9;
import defpackage.m950;
import defpackage.mg21;
import defpackage.mr9;
import defpackage.mv9;
import defpackage.mvg;
import defpackage.nr9;
import defpackage.nv9;
import defpackage.ny61;
import defpackage.ov9;
import defpackage.pv9;
import defpackage.qs9;
import defpackage.qu;
import defpackage.qu9;
import defpackage.qv9;
import defpackage.ru9;
import defpackage.rv9;
import defpackage.shq0;
import defpackage.spa;
import defpackage.sv9;
import defpackage.tse;
import defpackage.tv9;
import defpackage.uj9;
import defpackage.uv9;
import defpackage.v4r0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zla;
import defpackage.zy11;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.discounts.list.ChargersDiscountsListScreenRouter$content$1$1$1", f = "ChargersDiscountsListScreenRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersDiscountsListScreenRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ uv9 $action;
    int label;
    final /* synthetic */ lv9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersDiscountsListScreenRouter$content$1$1$1(lv9 lv9Var, uv9 uv9Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lv9Var;
        this.$action = uv9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersDiscountsListScreenRouter$content$1$1$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChargersDiscountsListScreenRouter$content$1$1$1 chargersDiscountsListScreenRouter$content$1$1$1 = (ChargersDiscountsListScreenRouter$content$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chargersDiscountsListScreenRouter$content$1$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        Object value;
        PaymentMethod$Type c;
        boolean z;
        boolean z2;
        ir9 ir9Var;
        PaymentMethod$Type c2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        lv9 lv9Var = this.this$0;
        boj0 boj0Var = lv9Var.M;
        uv9 uv9Var = this.$action;
        io9 io9Var = lv9Var.O;
        c29 c29Var = lv9Var.P;
        com.yandex.go.chargers.payments.data.a aVar = (com.yandex.go.chargers.payments.data.a) boj0Var.x;
        hh5 hh5Var = (hh5) boj0Var.c;
        if (jl40.l(uv9Var, mv9.a)) {
            ((lv9) io9Var.a).r(new qu(9));
        } else {
            if (uv9Var instanceof nv9) {
                cy9 cy9Var = ((nv9) uv9Var).a;
                lv9 lv9Var2 = (lv9) io9Var.a;
                lv9Var2.A((m950) lv9Var2.I.get(), new ly9(cy9Var), new qs9(lv9Var2, 1));
            } else if (!jl40.l(uv9Var, tv9.a)) {
                if (uv9Var instanceof pv9) {
                    uj9 uj9Var = ((pv9) uv9Var).a;
                    if (uj9Var instanceof lr9) {
                        hh5.g(hh5Var, ChargersAnalytics$ChargersDiscountsButtonV2.EnterPromocode, null, 6);
                        ((lv9) io9Var.a).r(new jv8(29));
                    } else if (uj9Var instanceof kr9) {
                        ((mg21) ((lg21) ((lv9) io9Var.a).G.get())).c(((kr9) uj9Var).a);
                    }
                } else if (uv9Var instanceof ov9) {
                    ov9 ov9Var = (ov9) uv9Var;
                    ru9 ru9Var = ov9Var.a;
                    shq0 shq0Var = aVar.c().b;
                    lea0 lea0Var = shq0Var != null ? shq0Var.a : null;
                    boolean z3 = ov9Var.b;
                    qu9 qu9Var = ru9Var.f;
                    ir9 ir9Var2 = ru9Var.a;
                    List list = qu9Var.c;
                    if (list == null || !z3) {
                        list = null;
                    }
                    if (z3) {
                        z2 = false;
                        ir9Var = ir9Var2;
                    } else {
                        z2 = false;
                        ir9Var = null;
                    }
                    List list2 = list;
                    if (list2 != null && !list2.isEmpty()) {
                        List list3 = list;
                        if (lea0Var != null && (c2 = lea0Var.c()) != null) {
                            r1 = c2.getCode();
                        }
                        if (!kotlin.collections.a.G(list3, r1)) {
                            lc0 lc0Var = new lc0(list, boj0Var, ir9Var, ov9Var, 8);
                            lv9 lv9Var3 = (lv9) io9Var.a;
                            lv9Var3.A((m950) lv9Var3.N.get(), new zla(true, 5), new kv9(lc0Var));
                            hh5.g(hh5Var, ChargersAnalytics$ChargersDiscountsButtonV2.DiscountToggle, ir9Var2.b, 2);
                        }
                    }
                    boj0Var.b(ir9Var == null ? ov9Var.c : ir9Var, ir9Var == null ? z2 : true);
                    hh5.g(hh5Var, ChargersAnalytics$ChargersDiscountsButtonV2.DiscountToggle, ir9Var2.b, 2);
                } else if (uv9Var instanceof sv9) {
                    sv9 sv9Var = (sv9) uv9Var;
                    ir9 ir9Var3 = sv9Var.b;
                    as9 as9Var = sv9Var.a;
                    hh5.g(hh5Var, as9Var instanceof ChargersProgressDiscountDetailsDto ? ChargersAnalytics$ChargersDiscountsButtonV2.CumulativeDiscount : ChargersAnalytics$ChargersDiscountsButtonV2.DiscountDetails, ir9Var3.b, 2);
                    ((lv9) io9Var.a).J.b(as9Var, ir9Var3, false);
                } else if (uv9Var instanceof qv9) {
                    gs9 gs9Var = ((qv9) uv9Var).a;
                    em9 em9Var = (em9) boj0Var.b;
                    if (jl40.l(gs9Var, bs9.a)) {
                        lv9 lv9Var4 = (lv9) c29Var.b;
                        h hVar = lv9Var4.J;
                        kgq0 kgq0Var = (kgq0) hVar.j.b.a.getValue();
                        z = kgq0Var != null ? kgq0Var.c : true;
                        r0 r0Var = hVar.j.a;
                        r0Var.l(null);
                        if (z) {
                            lv9Var4.r(new qu(9));
                        }
                    } else if (gs9Var instanceof es9) {
                        uj9 uj9Var2 = ((es9) gs9Var).a;
                        if (uj9Var2 instanceof jr9) {
                            em9Var.e(ChargersAnalytics$ChargersDiscountDetailsButton.Ok);
                            lv9 lv9Var5 = (lv9) c29Var.b;
                            h hVar2 = lv9Var5.J;
                            kgq0 kgq0Var2 = (kgq0) hVar2.j.b.a.getValue();
                            z = kgq0Var2 != null ? kgq0Var2.c : true;
                            r0 r0Var2 = hVar2.j.a;
                            r0Var2.l(null);
                            if (z) {
                                lv9Var5.r(new qu(9));
                            }
                        } else if (uj9Var2 instanceof mr9) {
                            ir9 ir9Var4 = ((mr9) uj9Var2).a;
                            em9Var.e(ir9Var4.a == ChargersDiscountTypeDto.PROMOCODE ? ChargersAnalytics$ChargersDiscountDetailsButton.ActivatePromocode : ChargersAnalytics$ChargersDiscountDetailsButton.Apply);
                            boj0Var.b(ir9Var4, true);
                            lv9 lv9Var6 = (lv9) c29Var.b;
                            r0 r0Var3 = lv9Var6.J.j.a;
                            r0Var3.l(null);
                            lv9Var6.r(new qu(9));
                        } else if (uj9Var2 instanceof nr9) {
                            em9Var.e(ChargersAnalytics$ChargersDiscountDetailsButton.ChoosePaymentMethod);
                            shq0 shq0Var2 = aVar.c().b;
                            lea0 lea0Var2 = shq0Var2 != null ? shq0Var2.a : null;
                            ir9 ir9Var5 = ((nr9) uj9Var2).a;
                            Iterable iterable = ir9Var5.c;
                            if (iterable == null) {
                                iterable = EmptyList.a;
                            }
                            if (kotlin.collections.a.G(iterable, (lea0Var2 == null || (c = lea0Var2.c()) == null) ? null : c.getCode())) {
                                boj0Var.b(ir9Var5, true);
                                lv9 lv9Var7 = (lv9) c29Var.b;
                                r0 r0Var4 = lv9Var7.J.j.a;
                                r0Var4.l(null);
                                lv9Var7.r(new qu(9));
                            } else {
                                lc0 lc0Var2 = new lc0(iterable, boj0Var, gs9Var, c29Var, 9);
                                lv9 lv9Var8 = (lv9) c29Var.b;
                                lv9Var8.A((m950) lv9Var8.N.get(), new zla(true, 5), new kv9(lc0Var2));
                            }
                        }
                    } else if (gs9Var instanceof cs9) {
                        em9Var.e(ChargersAnalytics$ChargersDiscountDetailsButton.LocationsList);
                        ir9 ir9Var6 = ((cs9) gs9Var).a;
                        lv9 lv9Var9 = (lv9) c29Var.b;
                        lv9Var9.A((m950) lv9Var9.L.get(), new ls9(ir9Var6), new jv9(lv9Var9));
                    } else if (gs9Var instanceof ds9) {
                        ((mg21) ((lg21) ((lv9) c29Var.b).G.get())).c(((ds9) gs9Var).a);
                    } else if (!jl40.l(gs9Var, fs9.a)) {
                        w511.b();
                        return null;
                    }
                } else {
                    if (!(uv9Var instanceof rv9)) {
                        w511.b();
                        return null;
                    }
                    try {
                        failure = ChargersDiscountsListUiState$Content$DiscountsTabType.valueOf(((rv9) uv9Var).a);
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    ChargersDiscountsListUiState$Content$DiscountsTabType chargersDiscountsListUiState$Content$DiscountsTabType = (ChargersDiscountsListUiState$Content$DiscountsTabType) (failure instanceof Result.Failure ? null : failure);
                    if (chargersDiscountsListUiState$Content$DiscountsTabType != null) {
                        spa spaVar = (spa) boj0Var.y;
                        spaVar.a.l(chargersDiscountsListUiState$Content$DiscountsTabType);
                        r0 r0Var5 = spaVar.c;
                        do {
                            value = r0Var5.getValue();
                        } while (!r0Var5.k(value, v4r0.i((Set) value, chargersDiscountsListUiState$Content$DiscountsTabType)));
                    }
                }
            }
        }
        return zy11.a;
    }
}
