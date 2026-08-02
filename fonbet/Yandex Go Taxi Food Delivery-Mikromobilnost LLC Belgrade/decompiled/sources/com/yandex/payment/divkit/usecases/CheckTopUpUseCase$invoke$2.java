package com.yandex.payment.divkit.usecases;

import com.yandex.payment.sdk.core.data.PaymentMethod;
import defpackage.a8a0;
import defpackage.iho;
import defpackage.jcv0;
import defpackage.kq4;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ogb;
import defpackage.qv90;
import defpackage.rwo;
import defpackage.sv90;
import defpackage.tse;
import defpackage.wj00;
import defpackage.wls;
import defpackage.xhb;
import defpackage.y22;
import defpackage.y891;
import defpackage.yhb;
import defpackage.zy11;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzhb;", "<anonymous>", "(Ltse;)Lzhb;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.usecases.CheckTopUpUseCase$invoke$2", f = "CheckTopUpUseCase.kt", l = {33, 49, 61}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class CheckTopUpUseCase$invoke$2 extends SuspendLambda implements wls {
    final /* synthetic */ kq4 $cardBalance;
    final /* synthetic */ PaymentMethod $currentPaymentMethod;
    final /* synthetic */ boolean $isCheckPaymentEnabled;
    final /* synthetic */ boolean $isTopUpEnabled;
    final /* synthetic */ kq4 $orderCost;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckTopUpUseCase$invoke$2(PaymentMethod paymentMethod, kq4 kq4Var, boolean z, a aVar, boolean z2, kq4 kq4Var2, Continuation continuation) {
        super(2, continuation);
        this.$currentPaymentMethod = paymentMethod;
        this.$orderCost = kq4Var;
        this.$isCheckPaymentEnabled = z;
        this.this$0 = aVar;
        this.$isTopUpEnabled = z2;
        this.$cardBalance = kq4Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CheckTopUpUseCase$invoke$2 checkTopUpUseCase$invoke$2 = new CheckTopUpUseCase$invoke$2(this.$currentPaymentMethod, this.$orderCost, this.$isCheckPaymentEnabled, this.this$0, this.$isTopUpEnabled, this.$cardBalance, continuation);
        checkTopUpUseCase$invoke$2.L$0 = obj;
        return checkTopUpUseCase$invoke$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckTopUpUseCase$invoke$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
    
        if (r9 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c7, code lost:
    
        if (r9 == r1) goto L38;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kq4 kq4Var;
        Object a;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        xhb xhbVar = xhb.a;
        if (i == 0) {
            kotlin.b.b(obj);
            if (a8a0.f(this.$currentPaymentMethod)) {
                com.yandex.payment.sdk.core.utils.a aVar = com.yandex.payment.sdk.core.utils.a.a;
                if (((Boolean) com.yandex.payment.sdk.core.utils.a.c.getValue()).booleanValue() && (kq4Var = this.$orderCost) != null) {
                    if (this.$isCheckPaymentEnabled) {
                        rwo rwoVar = this.this$0.b;
                        qv90.a.getClass();
                        ((y22) rwoVar).a(sv90.g());
                        a8a0.c(this.$currentPaymentMethod);
                        BigDecimal bigDecimal = this.$orderCost.a;
                        this.L$0 = tseVar;
                        this.label = 1;
                        a = aVar.a(this);
                    } else if (this.$isTopUpEnabled) {
                        m mVar = this.this$0.a;
                        kq4 kq4Var2 = this.$cardBalance;
                        this.L$0 = null;
                        this.label = 3;
                        obj = mVar.a(kq4Var2, kq4Var, this);
                    }
                    return coroutineSingletons;
                }
            }
        } else {
            if (i == 1) {
                kotlin.b.b(obj);
                a = ((Result) obj).getValue();
                if (a instanceof Result.Failure) {
                    a = null;
                }
                ogb ogbVar = (ogb) a;
                a aVar2 = this.this$0;
                if (ogbVar != null) {
                    rwo rwoVar2 = aVar2.b;
                    qv90.a.getClass();
                    ((y22) rwoVar2).a(sv90.g().d(null));
                    return xhbVar;
                }
                rwo rwoVar3 = aVar2.b;
                qv90.a.getClass();
                ((y22) rwoVar3).a(iho.b(sv90.g(), null, 3));
                return xhbVar;
            }
            if (i == 2) {
                kotlin.b.b(obj);
                return obj;
            }
            if (i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            jcv0 jcv0Var = (jcv0) obj;
            if (!jcv0Var.a.equals(BigDecimal.ZERO)) {
                rwo rwoVar4 = this.this$0.b;
                qv90.a.getClass();
                sv90 sv90Var = qv90.a;
                wj00 wj00Var = new wj00(0);
                wj00Var.i("from_check_payment", false);
                wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Началось пополнение при совершении платежа");
                ((y22) rwoVar4).a(y891.c("top_up_started", wj00Var));
                return new yhb(jcv0Var);
            }
        }
        return xhbVar;
    }
}
