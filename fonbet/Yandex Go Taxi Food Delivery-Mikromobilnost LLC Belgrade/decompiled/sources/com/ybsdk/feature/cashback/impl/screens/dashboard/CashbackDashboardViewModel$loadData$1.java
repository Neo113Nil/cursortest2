package com.ybsdk.feature.cashback.impl.screens.dashboard;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.cashback.impl.entities.CashbackSelectorCategoryEntity;
import com.ybsdk.feature.cashback.impl.entities.SuggestedCashbackPromoEntity;
import com.ybsdk.feature.cashback.impl.entities.types.AgreementID;
import com.ybsdk.feature.cashback.impl.entities.types.CashbackSelectionType;
import defpackage.dbv0;
import defpackage.e39;
import defpackage.g30;
import defpackage.gwh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o39;
import defpackage.pz40;
import defpackage.qaq0;
import defpackage.rcc;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tse;
import defpackage.v00;
import defpackage.wls;
import defpackage.x4c;
import defpackage.xep0;
import defpackage.ycc;
import defpackage.yep0;
import defpackage.zep0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.cashback.impl.screens.dashboard.CashbackDashboardViewModel$loadData$1", f = "CashbackDashboardViewModel.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CashbackDashboardViewModel$loadData$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $forceRefresh;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashbackDashboardViewModel$loadData$1(a aVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$forceRefresh = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CashbackDashboardViewModel$loadData$1(this.this$0, this.$forceRefresh, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CashbackDashboardViewModel$loadData$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014d A[LOOP:3: B:39:0x0147->B:41:0x014d, LOOP_END] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        Object obj2;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        ArrayList arrayList;
        r0 r0Var4;
        Object value4;
        Text text;
        Text plural;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            pz40 Y = this.this$0.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, e39.a((e39) value, null, null, null, null, null, yep0.a, 31)));
            if (this.$forceRefresh) {
                this.this$0.C.a.d.a.l(null);
            }
            a aVar = this.this$0;
            com.ybsdk.feature.cashback.impl.domain.a aVar2 = aVar.C;
            String m388constructorimpl = AgreementID.m388constructorimpl(aVar.B.getAgreementId());
            this.label = 1;
            Object a = aVar2.a(m388constructorimpl, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = a;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            obj2 = ((Result) obj).getValue();
        }
        a aVar3 = this.this$0;
        if (!(obj2 instanceof Result.Failure)) {
            o39 o39Var = (o39) obj2;
            pz40 Y2 = aVar3.Y();
            do {
                r0Var3 = (r0) Y2;
                value3 = r0Var3.getValue();
            } while (!r0Var3.k(value3, e39.a((e39) value3, o39Var, null, null, null, null, null, 62)));
            dbv0 dbv0Var = o39Var.f;
            if (dbv0Var != null) {
                ArrayList<SuggestedCashbackPromoEntity> arrayList2 = dbv0Var.b;
                arrayList = new ArrayList(tcc.n(arrayList2, 10));
                for (SuggestedCashbackPromoEntity suggestedCashbackPromoEntity : arrayList2) {
                    List<CashbackSelectorCategoryEntity> categories = suggestedCashbackPromoEntity.getCategories();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : categories) {
                        CashbackSelectorCategoryEntity cashbackSelectorCategoryEntity = (CashbackSelectorCategoryEntity) obj3;
                        if (cashbackSelectorCategoryEntity.isSelected() || cashbackSelectorCategoryEntity.getType() == CashbackSelectionType.PREDEFINED) {
                            arrayList3.add(obj3);
                        }
                    }
                    Text title = suggestedCashbackPromoEntity.getTitle();
                    String m385getPromoIdy5i_914 = suggestedCashbackPromoEntity.m385getPromoIdy5i_914();
                    List<CashbackSelectorCategoryEntity> categories2 = suggestedCashbackPromoEntity.getCategories();
                    int i2 = 0;
                    if (!(categories2 instanceof Collection) || !categories2.isEmpty()) {
                        Iterator it2 = categories2.iterator();
                        while (it2.hasNext()) {
                            if (((CashbackSelectorCategoryEntity) it2.next()).isSelected() && (i2 = i2 + 1) < 0) {
                                scc.l();
                                throw null;
                            }
                        }
                    }
                    int maxCategories = suggestedCashbackPromoEntity.getMaxCategories() - i2;
                    if (i2 == 0) {
                        plural = suggestedCashbackPromoEntity.getSubtitle();
                    } else if (maxCategories > 0) {
                        plural = new Text.Plural(gwh0.ybsdk_cashback_select_categories_description_plurals, maxCategories);
                    } else {
                        text = null;
                        com.ybsdk.core.utils.text.b bVar = Text.Companion;
                        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                        it = arrayList3.iterator();
                        while (it.hasNext()) {
                            arrayList4.add(((CashbackSelectorCategoryEntity) it.next()).getTitle());
                        }
                        bVar.getClass();
                        arrayList.add(new qaq0(m385getPromoIdy5i_914, title, text, arrayList3, new Text.Join(arrayList4, Extension.FIX_SPACE)));
                    }
                    text = plural;
                    com.ybsdk.core.utils.text.b bVar2 = Text.Companion;
                    ArrayList arrayList42 = new ArrayList(tcc.n(arrayList3, 10));
                    it = arrayList3.iterator();
                    while (it.hasNext()) {
                    }
                    bVar2.getClass();
                    arrayList.add(new qaq0(m385getPromoIdy5i_914, title, text, arrayList3, new Text.Join(arrayList42, Extension.FIX_SPACE)));
                }
            } else {
                arrayList = null;
            }
            ?? r3 = EmptyList.a;
            if (arrayList == null) {
                arrayList = r3;
            }
            ListBuilder a2 = rcc.a();
            a2.addAll(arrayList);
            g30 g30Var = o39Var.e;
            ArrayList arrayList5 = g30Var != null ? g30Var.b : null;
            if (arrayList5 != null) {
                r3 = arrayList5;
            }
            ArrayList arrayList6 = new ArrayList();
            Iterator it3 = ((Iterable) r3).iterator();
            while (it3.hasNext()) {
                ycc.r(((v00) it3.next()).e, arrayList6);
            }
            a2.addAll(arrayList6);
            ListBuilder j = a2.j();
            Text.Constant constant = o39Var.b;
            Text.Constant constant2 = o39Var.a;
            MoneyEntity moneyEntity = o39Var.d;
            pz40 Y3 = aVar3.Y();
            do {
                r0Var4 = (r0) Y3;
                value4 = r0Var4.getValue();
            } while (!r0Var4.k(value4, e39.a((e39) value4, null, constant2, moneyEntity, constant, j, zep0.a, 1)));
        }
        a aVar4 = this.this$0;
        Throwable a3 = Result.a(obj2);
        if (a3 != null) {
            pz40 Y4 = aVar4.Y();
            do {
                r0Var2 = (r0) Y4;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, e39.a((e39) value2, null, null, null, null, null, new xep0(a3), 31)));
            x4c.g("Exception during loadData() in CashbackDashboardViewModel", a3, null, null, 12);
        }
        return zy11.a;
    }
}
