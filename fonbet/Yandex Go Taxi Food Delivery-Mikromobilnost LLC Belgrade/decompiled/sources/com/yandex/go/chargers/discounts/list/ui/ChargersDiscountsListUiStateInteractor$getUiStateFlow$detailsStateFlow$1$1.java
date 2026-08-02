package com.yandex.go.chargers.discounts.list.ui;

import com.yandex.go.chargers.discounts.data.models.ChargersProgressDiscountDetailsDto;
import com.yandex.go.chargers.discounts.data.models.ChargersPromoDetailsDto;
import com.yandex.go.chargers.discounts.data.models.ChargersTaskDiscountDetailsDto;
import defpackage.as9;
import defpackage.ir9;
import defpackage.kgq0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ow9;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Low9;", "selected", "Lsr9;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Low9;)Lsr9;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.discounts.list.ui.ChargersDiscountsListUiStateInteractor$getUiStateFlow$detailsStateFlow$1$1", f = "ChargersDiscountsListUiStateInteractor.kt", l = {HProv.PP_RESERVED1}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersDiscountsListUiStateInteractor$getUiStateFlow$detailsStateFlow$1$1 extends SuspendLambda implements zls {
    final /* synthetic */ kgq0 $selectedDetails;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersDiscountsListUiStateInteractor$getUiStateFlow$detailsStateFlow$1$1(h hVar, kgq0 kgq0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = hVar;
        this.$selectedDetails = kgq0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChargersDiscountsListUiStateInteractor$getUiStateFlow$detailsStateFlow$1$1 chargersDiscountsListUiStateInteractor$getUiStateFlow$detailsStateFlow$1$1 = new ChargersDiscountsListUiStateInteractor$getUiStateFlow$detailsStateFlow$1$1(this.this$0, this.$selectedDetails, (Continuation) obj3);
        chargersDiscountsListUiStateInteractor$getUiStateFlow$detailsStateFlow$1$1.L$0 = (ow9) obj2;
        return chargersDiscountsListUiStateInteractor$getUiStateFlow$detailsStateFlow$1$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        ow9 ow9Var = (ow9) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.go.chargers.discounts.data.mappers.a aVar = this.this$0.d;
        kgq0 kgq0Var = this.$selectedDetails;
        as9 as9Var = kgq0Var.a;
        ir9 ir9Var = kgq0Var.b;
        this.L$0 = null;
        this.label = 1;
        if (as9Var instanceof ChargersPromoDetailsDto) {
            c = aVar.b((ChargersPromoDetailsDto) as9Var, ir9Var, ow9Var, this);
        } else if (as9Var instanceof ChargersProgressDiscountDetailsDto) {
            c = aVar.a((ChargersProgressDiscountDetailsDto) as9Var, ir9Var, ow9Var, this);
        } else {
            if (!(as9Var instanceof ChargersTaskDiscountDetailsDto)) {
                w511.b();
                return null;
            }
            c = aVar.c((ChargersTaskDiscountDetailsDto) as9Var, ow9Var, this);
        }
        return c == coroutineSingletons ? coroutineSingletons : c;
    }
}
