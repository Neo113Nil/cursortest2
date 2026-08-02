package com.ybsdk.feature.cashback.impl.screens.categories;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.CashbackEvents$CashbackCategoryClickedResult;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.cashback.impl.entities.CashbackSelectorCategoryEntity;
import com.ybsdk.feature.cashback.impl.entities.SuggestedCashbackPromoEntity;
import com.ybsdk.feature.cashback.impl.entities.types.AgreementID;
import com.ybsdk.feature.cashback.impl.screens.categories.CashbackCategoriesScreenParams;
import defpackage.b64;
import defpackage.c9s0;
import defpackage.dbv0;
import defpackage.ds31;
import defpackage.dzh0;
import defpackage.jl40;
import defpackage.m29;
import defpackage.n0t0;
import defpackage.ny61;
import defpackage.o39;
import defpackage.qh2;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.uc5;
import defpackage.vm7;
import defpackage.w511;
import defpackage.we8;
import defpackage.x4c;
import defpackage.z94;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final CashbackCategoriesScreenParams B;
    public final com.ybsdk.feature.cashback.impl.domain.a C;
    public final tfl0 D;
    public final AppAnalyticsReporter E;

    public a(CashbackCategoriesScreenParams cashbackCategoriesScreenParams, com.ybsdk.feature.cashback.impl.domain.a aVar, tfl0 tfl0Var, AppAnalyticsReporter appAnalyticsReporter) {
        super(new we8(12), new vm7(17));
        this.B = cashbackCategoriesScreenParams;
        this.C = aVar;
        this.D = tfl0Var;
        this.E = appAnalyticsReporter;
        appAnalyticsReporter.m.a.a("cashback.select_category_opened", null);
        tje.N(ds31.a(this), null, null, new CashbackCategoriesViewModel$loadData$1(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b0(a aVar, ContinuationImpl continuationImpl) {
        CashbackCategoriesViewModel$getPromo$1 cashbackCategoriesViewModel$getPromo$1;
        int i;
        Object a;
        o39 o39Var;
        dbv0 dbv0Var;
        Iterator it;
        Object obj;
        SuggestedCashbackPromoEntity suggestedCashbackPromoEntity;
        CashbackCategoriesScreenParams cashbackCategoriesScreenParams = aVar.B;
        if (continuationImpl instanceof CashbackCategoriesViewModel$getPromo$1) {
            cashbackCategoriesViewModel$getPromo$1 = (CashbackCategoriesViewModel$getPromo$1) continuationImpl;
            int i2 = cashbackCategoriesViewModel$getPromo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cashbackCategoriesViewModel$getPromo$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = cashbackCategoriesViewModel$getPromo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashbackCategoriesViewModel$getPromo$1.label;
                if (i != 0) {
                    b.b(obj2);
                    if (cashbackCategoriesScreenParams instanceof CashbackCategoriesScreenParams.Prefetched) {
                        return ((CashbackCategoriesScreenParams.Prefetched) cashbackCategoriesScreenParams).getSuggestedCashbackPromo();
                    }
                    if (!(cashbackCategoriesScreenParams instanceof CashbackCategoriesScreenParams.UnknownPromo)) {
                        w511.b();
                        return null;
                    }
                    com.ybsdk.feature.cashback.impl.domain.a aVar2 = aVar.C;
                    String m388constructorimpl = AgreementID.m388constructorimpl(((CashbackCategoriesScreenParams.UnknownPromo) cashbackCategoriesScreenParams).getAgreementId());
                    cashbackCategoriesViewModel$getPromo$1.label = 1;
                    a = aVar2.a(m388constructorimpl, cashbackCategoriesViewModel$getPromo$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                    a = ((Result) obj2).getValue();
                }
                if (a instanceof Result.Failure) {
                    a = null;
                }
                o39Var = (o39) a;
                if (o39Var != null && (dbv0Var = o39Var.f) != null) {
                    it = dbv0Var.b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (jl40.l(((SuggestedCashbackPromoEntity) obj).m385getPromoIdy5i_914(), ((CashbackCategoriesScreenParams.UnknownPromo) cashbackCategoriesScreenParams).getPromoID())) {
                            break;
                        }
                    }
                    suggestedCashbackPromoEntity = (SuggestedCashbackPromoEntity) obj;
                    if (suggestedCashbackPromoEntity != null) {
                        return suggestedCashbackPromoEntity;
                    }
                }
                CashbackCategoriesScreenParams.UnknownPromo unknownPromo = (CashbackCategoriesScreenParams.UnknownPromo) cashbackCategoriesScreenParams;
                x4c.g("Can't find promo error", null, b64.l("promoId=", unknownPromo.getPromoID(), " agreementId=", unknownPromo.getAgreementId()), null, 10);
                return null;
            }
        }
        cashbackCategoriesViewModel$getPromo$1 = new CashbackCategoriesViewModel$getPromo$1(aVar, continuationImpl);
        Object obj22 = cashbackCategoriesViewModel$getPromo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashbackCategoriesViewModel$getPromo$1.label;
        if (i != 0) {
        }
        if (a instanceof Result.Failure) {
        }
        o39Var = (o39) a;
        if (o39Var != null) {
            it = dbv0Var.b.iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            suggestedCashbackPromoEntity = (SuggestedCashbackPromoEntity) obj;
            if (suggestedCashbackPromoEntity != null) {
            }
        }
        CashbackCategoriesScreenParams.UnknownPromo unknownPromo2 = (CashbackCategoriesScreenParams.UnknownPromo) cashbackCategoriesScreenParams;
        x4c.g("Can't find promo error", null, b64.l("promoId=", unknownPromo2.getPromoID(), " agreementId=", unknownPromo2.getAgreementId()), null, 10);
        return null;
    }

    public final boolean c0(List list, CashbackSelectorCategoryEntity cashbackSelectorCategoryEntity) {
        if (((m29) X()).d > ((m29) X()).e) {
            return true;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (jl40.l(((CashbackSelectorCategoryEntity) it.next()).m380getCategoryIdUWxlUg(), cashbackSelectorCategoryEntity.m380getCategoryIdUWxlUg())) {
                return true;
            }
        }
        return false;
    }

    public final void d0() {
        tje.N(ds31.a(this), null, null, new CashbackCategoriesViewModel$loadData$1(this, null), 3);
    }

    public final void e0(List list, CashbackSelectorCategoryEntity cashbackSelectorCategoryEntity, boolean z) {
        z94 z94Var = this.E.m;
        CashbackEvents$CashbackCategoryClickedResult cashbackEvents$CashbackCategoryClickedResult = z ? CashbackEvents$CashbackCategoryClickedResult.SELECTED : CashbackEvents$CashbackCategoryClickedResult.UNSELECTED;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, cashbackEvents$CashbackCategoryClickedResult.getOriginalValue());
        z94Var.a.a("cashback.category_clicked", linkedHashMap);
        if (z) {
            list.add(cashbackSelectorCategoryEntity);
        } else {
            list.remove(cashbackSelectorCategoryEntity);
        }
        a0(new qh2(list, 3));
    }

    public final void f0(List list) {
        if (list.isEmpty()) {
            Z(new c9s0(new n0t0(new Text.Resource(dzh0.ybsdk_cashback_no_categories_selected_toast), Text.Empty.INSTANCE)));
        } else {
            tje.N(ds31.a(this), null, null, new CashbackCategoriesViewModel$submitItems$1(this, list, null), 3);
        }
    }
}
