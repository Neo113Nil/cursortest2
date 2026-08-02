package com.yandex.go.order.tariffs_suggest.ui;

import com.yandex.go.order.tariffs_suggest.mapper.ChangeStatusUiState$Status;
import com.yandex.go.taxi.order.change.common.domain.d;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import defpackage.lb80;
import defpackage.lg9;
import defpackage.mg9;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.ob80;
import defpackage.pm5;
import defpackage.sjh;
import defpackage.tb9;
import defpackage.tje;
import defpackage.uyj;
import defpackage.wls;
import defpackage.yxx0;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmg9;", "it", "Lzy11;", "<anonymous>", "(Lmg9;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.order.tariffs_suggest.ui.OrderWithTariffSuggestPresenter$proceedTariffChange$1$1$1", f = "OrderWithTariffSuggestPresenter.kt", l = {BuildConfig.API_LEVEL, HProv.PP_DELETE_SAVED_PASSWD, HProv.PP_CONTAINER_EXTENSION}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class OrderWithTariffSuggestPresenter$proceedTariffChange$1$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderWithTariffSuggestPresenter$proceedTariffChange$1$1$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderWithTariffSuggestPresenter$proceedTariffChange$1$1$1 orderWithTariffSuggestPresenter$proceedTariffChange$1$1$1 = new OrderWithTariffSuggestPresenter$proceedTariffChange$1$1$1(this.this$0, continuation);
        orderWithTariffSuggestPresenter$proceedTariffChange$1$1$1.L$0 = obj;
        return orderWithTariffSuggestPresenter$proceedTariffChange$1$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderWithTariffSuggestPresenter$proceedTariffChange$1$1$1) create((mg9) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        if (r10 == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
    
        if (r10 == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0105, code lost:
    
        if (r10 == r1) goto L62;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        mg9 mg9Var = (mg9) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            if (i == 2) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            if (i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11Var;
        }
        kotlin.b.b(obj);
        ChangeStatusUiState$Status changeStatusUiState$Status = mg9Var != null ? mg9Var.a : null;
        int i2 = changeStatusUiState$Status == null ? -1 : ob80.a[changeStatusUiState$Status.ordinal()];
        if (i2 == 1) {
            a aVar = this.this$0;
            lb80 Lg = aVar.Lg(true);
            if (Lg != null) {
                yxx0.b((yxx0) aVar.B.a, Lg.a, Lg.b, Lg.c);
            }
            a aVar2 = this.this$0;
            String str = mg9Var.c;
            String str2 = str != null ? str : "";
            this.L$0 = null;
            this.label = 1;
            aVar2.C.getClass();
            sjh sjhVar = uyj.a;
            Object k0 = tje.k0(o400.a, new OrderWithTariffSuggestPresenter$showSuccessNotification$2(aVar2, str2, null), this);
            obj = k0 == coroutineSingletons ? k0 : zy11Var;
        } else {
            if (i2 == 2) {
                pm5 pm5Var = this.this$0.z;
                String str3 = mg9Var.e;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = mg9Var.b;
                ((d) pm5Var.b).a.h(new tb9(str3, str4 != null ? str4 : "", ChangeOrderState$Source.TARIFF));
                return zy11Var;
            }
            if (i2 == 3 || i2 == 4) {
                a.Kg(this.this$0);
                this.this$0.x.f();
                a aVar3 = this.this$0;
                lg9 lg9Var = mg9Var.d;
                this.L$0 = null;
                this.label = 2;
                aVar3.C.getClass();
                sjh sjhVar2 = uyj.a;
                Object k02 = tje.k0(o400.a, new OrderWithTariffSuggestPresenter$showFailedNotification$2(aVar3, lg9Var, null), this);
                obj = k02 == coroutineSingletons ? k02 : zy11Var;
            } else {
                a.Kg(this.this$0);
                this.this$0.x.f();
                a aVar4 = this.this$0;
                this.L$0 = null;
                this.label = 3;
                aVar4.C.getClass();
                sjh sjhVar3 = uyj.a;
                Object k03 = tje.k0(o400.a, new OrderWithTariffSuggestPresenter$showFailedNotification$2(aVar4, null, null), this);
                obj = k03 == coroutineSingletons ? k03 : zy11Var;
            }
        }
        return coroutineSingletons;
    }
}
