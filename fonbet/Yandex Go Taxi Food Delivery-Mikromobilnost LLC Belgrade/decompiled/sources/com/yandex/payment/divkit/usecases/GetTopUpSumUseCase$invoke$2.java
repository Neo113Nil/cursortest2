package com.yandex.payment.divkit.usecases;

import defpackage.jcv0;
import defpackage.kq4;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv90;
import defpackage.rwo;
import defpackage.sv90;
import defpackage.tse;
import defpackage.wj00;
import defpackage.wls;
import defpackage.y22;
import defpackage.y891;
import defpackage.zy11;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ljcv0;", "<anonymous>", "(Ltse;)Ljcv0;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.usecases.GetTopUpSumUseCase$invoke$2", f = "GetTopUpSumUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class GetTopUpSumUseCase$invoke$2 extends SuspendLambda implements wls {
    final /* synthetic */ kq4 $cardBalance;
    final /* synthetic */ kq4 $orderCost;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTopUpSumUseCase$invoke$2(kq4 kq4Var, kq4 kq4Var2, m mVar, Continuation continuation) {
        super(2, continuation);
        this.$cardBalance = kq4Var;
        this.$orderCost = kq4Var2;
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetTopUpSumUseCase$invoke$2(this.$cardBalance, this.$orderCost, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetTopUpSumUseCase$invoke$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (defpackage.jl40.l(r2 != null ? r2.b : null, r4 != null ? r4.b : null) != false) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        kq4 kq4Var = this.$cardBalance;
        BigDecimal bigDecimal = kq4Var != null ? kq4Var.a : BigDecimal.ZERO;
        kq4 kq4Var2 = this.$orderCost;
        BigDecimal subtract = (kq4Var2 != null ? kq4Var2.a : BigDecimal.ZERO).subtract(bigDecimal);
        kq4 kq4Var3 = this.$cardBalance;
        String str = kq4Var3 != null ? kq4Var3.b : null;
        if (str == null) {
            str = "";
        }
        jcv0 jcv0Var = new jcv0(subtract, subtract + " " + str);
        kq4 kq4Var4 = this.$cardBalance;
        kq4 kq4Var5 = this.$orderCost;
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (subtract.compareTo(bigDecimal2) > 0) {
        }
        jcv0Var = null;
        if (jcv0Var == null) {
            kq4 kq4Var6 = this.$cardBalance;
            String str2 = kq4Var6 != null ? kq4Var6.b : null;
            jcv0Var = new jcv0(bigDecimal2, bigDecimal2 + " " + (str2 != null ? str2 : ""));
        }
        rwo rwoVar = this.this$0.a;
        sv90 sv90Var = qv90.a;
        boolean equals = jcv0Var.a.equals(bigDecimal2);
        boolean z = !equals;
        sv90Var.getClass();
        String concat = "Вычислена сумма пополнения при совершении платежа: пополнение ".concat(!equals ? "требуется" : "не требуется");
        wj00 wj00Var = new wj00(0);
        wj00Var.i("is_need_to_top_up", z);
        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat);
        ((y22) rwoVar).a(y891.c("sum_to_top_up_calculated", wj00Var));
        return jcv0Var;
    }
}
