package com.yandex.go.yb;

import android.content.Context;
import com.yandex.go.payments.paymentlist.domain.n;
import com.yandex.go.yb.data.u;
import com.yandex.go.yb.experiments.SuggestYandexCardInRideExperiment;
import com.yandex.go.yb.ui.SuggestYbCardInRideView;
import defpackage.aav0;
import defpackage.be9;
import defpackage.g8k0;
import defpackage.jl40;
import defpackage.k7x0;
import defpackage.kv90;
import defpackage.lv90;
import defpackage.mv51;
import defpackage.mvg;
import defpackage.n3w;
import defpackage.nv51;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.oep0;
import defpackage.pav;
import defpackage.pda0;
import defpackage.qv51;
import defpackage.tse;
import defpackage.w030;
import defpackage.wls;
import defpackage.zxs0;
import defpackage.zy11;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.activity.h;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.yb.SuggestYbCardInRideRouterImpl$getChangePaymentSuggestCallback$1$onScreenDismissed$1", f = "SuggestYbCardInRideRouterImpl.kt", l = {141}, m = "invokeSuspend", v = 2)
/* loaded from: classes15.dex */
final class SuggestYbCardInRideRouterImpl$getChangePaymentSuggestCallback$1$onScreenDismissed$1 extends SuspendLambda implements wls {
    final /* synthetic */ be9 $changePaymentSuggest;
    final /* synthetic */ mv51 $initialBalance;
    final /* synthetic */ o2y0 $orderHolder;
    final /* synthetic */ PaymentMethod$Type $type;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestYbCardInRideRouterImpl$getChangePaymentSuggestCallback$1$onScreenDismissed$1(b bVar, be9 be9Var, mv51 mv51Var, PaymentMethod$Type paymentMethod$Type, o2y0 o2y0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$changePaymentSuggest = be9Var;
        this.$initialBalance = mv51Var;
        this.$type = paymentMethod$Type;
        this.$orderHolder = o2y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuggestYbCardInRideRouterImpl$getChangePaymentSuggestCallback$1$onScreenDismissed$1(this.this$0, this.$changePaymentSuggest, this.$initialBalance, this.$type, this.$orderHolder, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuggestYbCardInRideRouterImpl$getChangePaymentSuggestCallback$1$onScreenDismissed$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            u uVar = this.this$0.k;
            String str = this.$changePaymentSuggest.a;
            mv51 mv51Var = this.$initialBalance;
            BigDecimal bigDecimal = mv51Var.a;
            String str2 = mv51Var.b;
            this.label = 1;
            b = uVar.b(str, bigDecimal, str2, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = obj;
        }
        boolean l = jl40.l((qv51) b, nv51.a);
        zy11 zy11Var = zy11.a;
        if (l) {
            kv90 kv90Var = lv90.Companion;
            PaymentMethod$Type paymentMethod$Type = this.$type;
            String str3 = this.$changePaymentSuggest.a;
            kv90Var.getClass();
            lv90 b2 = kv90.b(str3, paymentMethod$Type);
            b bVar = this.this$0;
            Context context = bVar.a;
            o2y0 o2y0Var = this.$orderHolder;
            w030 a = bVar.l.a();
            SuggestYandexCardInRideExperiment suggestYandexCardInRideExperiment = (SuggestYandexCardInRideExperiment) bVar.n.b();
            if (suggestYandexCardInRideExperiment.b() && a.i(SuggestYbCardInRideView.class) == null) {
                n nVar = bVar.d;
                g8k0 g8k0Var = bVar.e;
                pda0 pda0Var = (pda0) bVar.f.get();
                pav pavVar = bVar.h;
                k7x0 k7x0Var = bVar.i;
                h hVar = bVar.g;
                oep0 oep0Var = bVar.m;
                context.getClass();
                nVar.getClass();
                g8k0Var.getClass();
                o2y0Var.getClass();
                pda0Var.getClass();
                pavVar.getClass();
                k7x0Var.getClass();
                hVar.getClass();
                oep0Var.getClass();
                n3w a2 = n3w.a(pda0Var);
                zxs0 zxs0Var = new zxs0();
                zxs0Var.a = g8k0Var;
                zxs0Var.b = b2.b();
                a.s(new SuggestYbCardInRideView(context, new aav0(b2, o2y0Var, nVar, suggestYandexCardInRideExperiment, zxs0Var, a2, k7x0Var, oep0Var), pavVar, hVar), true);
                return zy11Var;
            }
        }
        return zy11Var;
    }
}
