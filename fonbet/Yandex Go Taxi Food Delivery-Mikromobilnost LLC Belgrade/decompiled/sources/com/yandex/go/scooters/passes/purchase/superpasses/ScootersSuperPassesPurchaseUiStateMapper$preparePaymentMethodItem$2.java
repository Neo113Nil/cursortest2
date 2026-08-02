package com.yandex.go.scooters.passes.purchase.superpasses;

import android.graphics.Bitmap;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.hfa0;
import defpackage.lea0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o1p0;
import defpackage.qoh;
import defpackage.sea0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lo1p0;", "<anonymous>", "(Ltse;)Lo1p0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.purchase.superpasses.ScootersSuperPassesPurchaseUiStateMapper$preparePaymentMethodItem$2", f = "ScootersSuperPassesPurchaseUiStateMapper.kt", l = {HProv.PROV_GOST_2001_DH, CalendarDayView.DISABLED_DAY_ALPHA}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSuperPassesPurchaseUiStateMapper$preparePaymentMethodItem$2 extends SuspendLambda implements wls {
    final /* synthetic */ hfa0 $paymentOptions;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSuperPassesPurchaseUiStateMapper$preparePaymentMethodItem$2(hfa0 hfa0Var, h hVar, Continuation continuation) {
        super(2, continuation);
        this.$paymentOptions = hfa0Var;
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersSuperPassesPurchaseUiStateMapper$preparePaymentMethodItem$2 scootersSuperPassesPurchaseUiStateMapper$preparePaymentMethodItem$2 = new ScootersSuperPassesPurchaseUiStateMapper$preparePaymentMethodItem$2(this.$paymentOptions, this.this$0, continuation);
        scootersSuperPassesPurchaseUiStateMapper$preparePaymentMethodItem$2.L$0 = obj;
        return scootersSuperPassesPurchaseUiStateMapper$preparePaymentMethodItem$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersSuperPassesPurchaseUiStateMapper$preparePaymentMethodItem$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        noh h;
        lea0 lea0Var;
        Bitmap bitmap;
        lea0 lea0Var2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            lea0 b = this.$paymentOptions.b();
            qoh h2 = tje.h(tseVar, null, null, new ScootersSuperPassesPurchaseUiStateMapper$preparePaymentMethodItem$2$baseImageAsync$1(b, this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new ScootersSuperPassesPurchaseUiStateMapper$preparePaymentMethodItem$2$complementImageAsync$1(this.$paymentOptions, this.this$0, null), 3);
            this.L$0 = null;
            this.L$1 = b;
            this.L$2 = null;
            this.L$3 = h;
            this.label = 1;
            Object s = h2.s(this);
            if (s != coroutineSingletons) {
                lea0Var = b;
                obj = s;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bitmap = (Bitmap) this.L$4;
            lea0Var2 = (lea0) this.L$1;
            kotlin.b.b(obj);
            h hVar = this.this$0;
            return new o1p0(bitmap, (Bitmap) obj, ((sea0) hVar.e).a(hVar.a, lea0Var2));
        }
        h = (noh) this.L$3;
        lea0Var = (lea0) this.L$1;
        kotlin.b.b(obj);
        Bitmap bitmap2 = (Bitmap) obj;
        this.L$0 = null;
        this.L$1 = lea0Var;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = bitmap2;
        this.label = 2;
        Object k = h.k(this);
        if (k != coroutineSingletons) {
            bitmap = bitmap2;
            obj = k;
            lea0Var2 = lea0Var;
            h hVar2 = this.this$0;
            return new o1p0(bitmap, (Bitmap) obj, ((sea0) hVar2.e).a(hVar2.a, lea0Var2));
        }
        return coroutineSingletons;
    }
}
