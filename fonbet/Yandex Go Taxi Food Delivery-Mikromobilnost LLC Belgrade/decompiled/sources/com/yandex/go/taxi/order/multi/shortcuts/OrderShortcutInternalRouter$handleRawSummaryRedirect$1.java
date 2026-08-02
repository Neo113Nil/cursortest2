package com.yandex.go.taxi.order.multi.shortcuts;

import com.yandex.go.models.SummaryRedirectActionModel;
import defpackage.c680;
import defpackage.d680;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o820;
import defpackage.sxg;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.xxr0;
import defpackage.yyr0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.multi.shortcuts.OrderShortcutInternalRouter$handleRawSummaryRedirect$1", f = "OrderShortcutInternalRouter.kt", l = {266}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderShortcutInternalRouter$handleRawSummaryRedirect$1 extends SuspendLambda implements wls {
    final /* synthetic */ SummaryRedirectActionModel $action;
    final /* synthetic */ SummaryRedirectActionModel.a $dest;
    final /* synthetic */ yyr0 $model;
    int label;
    final /* synthetic */ d680 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderShortcutInternalRouter$handleRawSummaryRedirect$1(d680 d680Var, SummaryRedirectActionModel.a aVar, yyr0 yyr0Var, SummaryRedirectActionModel summaryRedirectActionModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = d680Var;
        this.$dest = aVar;
        this.$model = yyr0Var;
        this.$action = summaryRedirectActionModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderShortcutInternalRouter$handleRawSummaryRedirect$1(this.this$0, this.$dest, this.$model, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderShortcutInternalRouter$handleRawSummaryRedirect$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.shortcuts.interactors.a aVar = this.this$0.t;
            SummaryRedirectActionModel.a aVar2 = this.$dest;
            zzs zzsVar = aVar2.a;
            String a = aVar2.a();
            yyr0 yyr0Var = this.$model;
            String e = yyr0Var.e();
            String f = yyr0Var.f();
            switch (xxr0.a[yyr0Var.getSource().ordinal()]) {
                case 1:
                    str = "Header";
                    break;
                case 2:
                    str = "Suggest";
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    str = "UNKNOWN";
                    break;
                default:
                    w511.b();
                    return null;
            }
            o820 o820Var = new o820(f, e, str, "shortcut");
            this.label = 1;
            obj = aVar.a(zzsVar, a, o820Var, false, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        sxg sxgVar = (sxg) obj;
        d680 d680Var = this.this$0;
        SummaryRedirectActionModel summaryRedirectActionModel = this.$action;
        try {
            d680Var.e(summaryRedirectActionModel, sxgVar.a.a);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            d680Var.x.b("", th, new c680(0));
            d680Var.e(summaryRedirectActionModel, null);
        }
        return zy11.a;
    }
}
