package com.ybsdk.feature.cashback.impl.screens.categories;

import com.ybsdk.core.analytics.generated.delegates.CashbackEvents$CashbackCategoriesSubmittedResult;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.cashback.impl.entities.CashbackSelectorCategoryEntity;
import com.ybsdk.feature.cashback.impl.entities.SelectedCodeStatus;
import com.ybsdk.feature.cashback.impl.entities.SuggestedCashbackPromoEntity;
import com.ybsdk.feature.cashback.impl.entities.types.AgreementID;
import defpackage.c9s0;
import defpackage.dzh0;
import defpackage.gao;
import defpackage.m29;
import defpackage.mvg;
import defpackage.n0t0;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.x4c;
import defpackage.z94;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.cashback.impl.screens.categories.CashbackCategoriesViewModel$submitItems$1", f = "CashbackCategoriesViewModel.kt", l = {HProv.PP_CONTAINER_EXTENSION_DEL, 139}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CashbackCategoriesViewModel$submitItems$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<CashbackSelectorCategoryEntity> $selectedList;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashbackCategoriesViewModel$submitItems$1(a aVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$selectedList = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CashbackCategoriesViewModel$submitItems$1(this.this$0, this.$selectedList, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CashbackCategoriesViewModel$submitItems$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
    
        if (r0 == r7) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x005a, code lost:
    
        if (r0 == r7) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        Object b0;
        Object failure;
        Throwable a;
        pz40 Y;
        r0 r0Var2;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            pz40 Y2 = this.this$0.Y();
            do {
                r0Var = (r0) Y2;
                value = r0Var.getValue();
            } while (!r0Var.k(value, m29.a((m29) value, null, null, null, 0, 0, null, false, true, HProv.PP_VERSION_TIMESTAMP)));
            a aVar = this.this$0;
            this.label = 1;
            b0 = a.b0(aVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                failure = ((Result) obj).getValue();
                a aVar2 = this.this$0;
                a = Result.a(failure);
                if (a != null) {
                    z94.l(aVar2.E.m, CashbackEvents$CashbackCategoriesSubmittedResult.ERROR);
                    aVar2.Z(new c9s0(gao.e(new Text.Resource(dzh0.ybsdk_cashback_save_cashback_error), null, a, 2)));
                    x4c.g("Exception during submitItems() in CashbackCategoriesViewModel", a, null, null, 12);
                }
                a aVar3 = this.this$0;
                if (!(failure instanceof Result.Failure)) {
                    if (((SelectedCodeStatus) failure) == SelectedCodeStatus.DATA_OUTDATED) {
                        aVar3.Z(new c9s0(new n0t0(new Text.Resource(dzh0.ybsdk_cashback_make_cashback_promo_decision_error_outdated), Text.Empty.INSTANCE)));
                        z94.l(aVar3.E.m, CashbackEvents$CashbackCategoriesSubmittedResult.OUTDATED);
                    } else {
                        z94.l(aVar3.E.m, CashbackEvents$CashbackCategoriesSubmittedResult.OK);
                    }
                    aVar3.D.e();
                }
                Y = this.this$0.Y();
                do {
                    r0Var2 = (r0) Y;
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, m29.a((m29) value2, null, null, null, 0, 0, null, false, false, HProv.PP_VERSION_TIMESTAMP)));
                return zy11.a;
            }
            b.b(obj);
            b0 = obj;
        }
        Object obj2 = (SuggestedCashbackPromoEntity) b0;
        if (obj2 == null) {
            obj2 = new Result.Failure(new IllegalStateException("Can't save cashback selection, because promo not found"));
        }
        a aVar4 = this.this$0;
        List<CashbackSelectorCategoryEntity> list = this.$selectedList;
        Throwable a2 = Result.a(obj2);
        if (a2 == null) {
            SuggestedCashbackPromoEntity suggestedCashbackPromoEntity = (SuggestedCashbackPromoEntity) obj2;
            com.ybsdk.feature.cashback.impl.domain.a aVar5 = aVar4.C;
            String m385getPromoIdy5i_914 = suggestedCashbackPromoEntity.m385getPromoIdy5i_914();
            String m386getPromoTypebAW3nNs = suggestedCashbackPromoEntity.m386getPromoTypebAW3nNs();
            String m388constructorimpl = AgreementID.m388constructorimpl(aVar4.B.getAgreementId());
            this.label = 2;
            failure = aVar5.b(m385getPromoIdy5i_914, m386getPromoTypebAW3nNs, list, m388constructorimpl, aVar4, this);
        } else {
            failure = new Result.Failure(a2);
        }
        a aVar22 = this.this$0;
        a = Result.a(failure);
        if (a != null) {
        }
        a aVar32 = this.this$0;
        if (!(failure instanceof Result.Failure)) {
        }
        Y = this.this$0.Y();
        do {
            r0Var2 = (r0) Y;
            value2 = r0Var2.getValue();
        } while (!r0Var2.k(value2, m29.a((m29) value2, null, null, null, 0, 0, null, false, false, HProv.PP_VERSION_TIMESTAMP)));
        return zy11.a;
    }
}
