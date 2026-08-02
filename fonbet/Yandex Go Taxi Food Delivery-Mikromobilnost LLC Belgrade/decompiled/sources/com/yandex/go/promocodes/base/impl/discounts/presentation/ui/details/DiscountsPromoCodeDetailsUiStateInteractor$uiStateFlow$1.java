package com.yandex.go.promocodes.base.impl.discounts.presentation.ui.details;

import com.yandex.go.promocodes.base.impl.discounts.domain.entities.button.DiscountsButtonAction;
import defpackage.avj0;
import defpackage.cda0;
import defpackage.cmf0;
import defpackage.dmf0;
import defpackage.emf0;
import defpackage.fl8;
import defpackage.fmf0;
import defpackage.gmf0;
import defpackage.grj;
import defpackage.hrj;
import defpackage.irj;
import defpackage.jl40;
import defpackage.jmf0;
import defpackage.jrj;
import defpackage.krj;
import defpackage.kyh0;
import defpackage.mqg0;
import defpackage.mrj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qje;
import defpackage.qqy;
import defpackage.rcc;
import defpackage.tcc;
import defpackage.tqj;
import defpackage.w511;
import defpackage.wlf0;
import defpackage.xng0;
import defpackage.zls;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.utils.ForegroundColorSpanFix;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljrj;", "uiState", "", "buttonClicked", "<anonymous>", "(Ljrj;Z)Ljrj;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.promocodes.base.impl.discounts.presentation.ui.details.DiscountsPromoCodeDetailsUiStateInteractor$uiStateFlow$1", f = "DiscountsPromoCodeDetailsUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class DiscountsPromoCodeDetailsUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements zls {
    final /* synthetic */ wlf0 $promoCode;
    final /* synthetic */ cmf0 $promoCodeDetails;
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ krj this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscountsPromoCodeDetailsUiStateInteractor$uiStateFlow$1(krj krjVar, wlf0 wlf0Var, cmf0 cmf0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = krjVar;
        this.$promoCode = wlf0Var;
        this.$promoCodeDetails = cmf0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        DiscountsPromoCodeDetailsUiStateInteractor$uiStateFlow$1 discountsPromoCodeDetailsUiStateInteractor$uiStateFlow$1 = new DiscountsPromoCodeDetailsUiStateInteractor$uiStateFlow$1(this.this$0, this.$promoCode, this.$promoCodeDetails, (Continuation) obj3);
        discountsPromoCodeDetailsUiStateInteractor$uiStateFlow$1.L$0 = (jrj) obj;
        discountsPromoCodeDetailsUiStateInteractor$uiStateFlow$1.Z$0 = booleanValue;
        return discountsPromoCodeDetailsUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DiscountsButtonAction discountsButtonAction;
        irj irjVar;
        grj grjVar;
        String h;
        jrj jrjVar = (jrj) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        mrj mrjVar = this.this$0.c;
        wlf0 wlf0Var = this.$promoCode;
        cmf0 cmf0Var = this.$promoCodeDetails;
        boolean z2 = !z;
        zuj0 zuj0Var = (zuj0) mrjVar.b;
        ListBuilder a = rcc.a();
        boolean z3 = wlf0Var.k;
        boolean z4 = wlf0Var.j;
        if (z3 && !z4) {
            a.add(new hrj(z2));
        }
        int i = e.b[wlf0Var.g.ordinal()];
        if (i == 1) {
            discountsButtonAction = DiscountsButtonAction.REMOVE_PROMO_CODE;
        } else if (i != 2) {
            if (z4 && !jl40.l(wlf0Var.e, "scooters")) {
                discountsButtonAction = DiscountsButtonAction.GO_TO_ORDER;
            }
            discountsButtonAction = null;
        } else {
            jmf0 jmf0Var = wlf0Var.h;
            if (jmf0Var != null && jmf0Var.c) {
                ListBuilder h2 = ((com.yandex.go.payments.paymentlist.data.c) ((cda0) mrjVar.w)).h();
                ArrayList arrayList = new ArrayList();
                ListIterator listIterator = h2.listIterator(0);
                while (true) {
                    qqy qqyVar = (qqy) listIterator;
                    if (!qqyVar.hasNext()) {
                        break;
                    }
                    Object next = qqyVar.next();
                    if (next instanceof fl8) {
                        arrayList.add(next);
                    }
                }
                discountsButtonAction = arrayList.isEmpty() ? DiscountsButtonAction.ADD_CARD : DiscountsButtonAction.SELECT_CARD;
            }
            discountsButtonAction = null;
        }
        int i2 = discountsButtonAction == null ? -1 : e.c[discountsButtonAction.ordinal()];
        if (i2 == 1) {
            avj0 avj0Var = (avj0) zuj0Var;
            irjVar = new irj(discountsButtonAction, d.b(avj0Var.h(kyh0.promocode_goto_order), new ForegroundColorSpanFix(avj0Var.a(mqg0.accent_background_text_color))), avj0Var.a(mqg0.component_accent_color), z2);
        } else if (i2 == 2) {
            avj0 avj0Var2 = (avj0) zuj0Var;
            irjVar = new irj(discountsButtonAction, d.b(avj0Var2.h(kyh0.favorites_remove_address), new ForegroundColorSpanFix(avj0Var2.a(mqg0.component_white))), avj0Var2.a(mqg0.component_gray_400), z2);
        } else if (i2 == 3) {
            avj0 avj0Var3 = (avj0) zuj0Var;
            irjVar = new irj(discountsButtonAction, d.b(avj0Var3.h(kyh0.add_credit_card_title), new ForegroundColorSpanFix(avj0Var3.a(mqg0.component_white))), avj0Var3.a(mqg0.component_blue_normal), z2);
        } else if (i2 != 4) {
            irjVar = null;
        } else {
            avj0 avj0Var4 = (avj0) zuj0Var;
            irjVar = new irj(discountsButtonAction, d.b(avj0Var4.h(kyh0.promocode_select_card), new ForegroundColorSpanFix(avj0Var4.a(mqg0.component_white))), avj0Var4.a(mqg0.component_blue_normal), z2);
        }
        if (irjVar != null) {
            a.add(irjVar);
        }
        ArrayList<dmf0> arrayList2 = cmf0Var.e;
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
        for (dmf0 dmf0Var : arrayList2) {
            if (dmf0Var instanceof emf0) {
                grjVar = new grj(dmf0Var, !z ? ((emf0) dmf0Var).a : ((emf0) dmf0Var).c, ((emf0) dmf0Var).b, qje.t(xng0.controlMinor, ((avj0) zuj0Var).a), z2);
            } else if (dmf0Var instanceof fmf0) {
                fmf0 fmf0Var = (fmf0) dmf0Var;
                grjVar = new grj(dmf0Var, fmf0Var.a, fmf0Var.b, qje.t(xng0.controlMain, ((avj0) zuj0Var).a), z2);
            } else {
                if (!(dmf0Var instanceof gmf0)) {
                    w511.b();
                    return null;
                }
                if (z) {
                    tqj tqjVar = DiscountsPromoCodeDetailsActionUrl.Companion;
                    gmf0 gmf0Var = (gmf0) dmf0Var;
                    String str = gmf0Var.c;
                    tqjVar.getClass();
                    int loadingStringId = tqj.a(str).getLoadingStringId();
                    h = loadingStringId != 0 ? ((avj0) zuj0Var).h(loadingStringId) : gmf0Var.a;
                } else {
                    h = ((gmf0) dmf0Var).a;
                }
                grjVar = new grj(dmf0Var, h, ((gmf0) dmf0Var).b, qje.t(xng0.controlMain, ((avj0) zuj0Var).a), z2);
            }
            arrayList3.add(grjVar);
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            a.add((grj) it.next());
        }
        return new jrj(jrjVar.a, jrjVar.b, jrjVar.c, jrjVar.d, a.j());
    }
}
