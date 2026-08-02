package com.yandex.go.chargers.tariff_item_info;

import com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersTariffDto;
import defpackage.hwa;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Ltwa;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.tariff_item_info.ChargersTariffsMapperImpl$map$2$blocks$1", f = "ChargersTariffsMapperImpl.kt", l = {33}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersTariffsMapperImpl$map$2$blocks$1 extends SuspendLambda implements wls {
    final /* synthetic */ hwa $surgeModal;
    final /* synthetic */ ChargersTariffDto $tariff;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersTariffsMapperImpl$map$2$blocks$1(b bVar, ChargersTariffDto chargersTariffDto, hwa hwaVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$tariff = chargersTariffDto;
        this.$surgeModal = hwaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersTariffsMapperImpl$map$2$blocks$1(this.this$0, this.$tariff, this.$surgeModal, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersTariffsMapperImpl$map$2$blocks$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        b bVar = this.this$0;
        List list = this.$tariff.c;
        hwa hwaVar = this.$surgeModal;
        this.label = 1;
        Object a = b.a(bVar, list, hwaVar, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
