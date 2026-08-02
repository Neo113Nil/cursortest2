package com.yandex.go.payments.shared.members.cardselector;

import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.v;
import defpackage.fl8;
import defpackage.hst;
import defpackage.il;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rn8;
import defpackage.tse;
import defpackage.vnr0;
import defpackage.wls;
import defpackage.zy11;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.members.cardselector.CardSelectorPresenter$onCardPaymentOptionSelected$1", f = "CardSelectorPresenter.kt", l = {130}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CardSelectorPresenter$onCardPaymentOptionSelected$1 extends SuspendLambda implements wls {
    final /* synthetic */ fl8 $selectedCard;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSelectorPresenter$onCardPaymentOptionSelected$1(a aVar, fl8 fl8Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$selectedCard = fl8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardSelectorPresenter$onCardPaymentOptionSelected$1(this.this$0, this.$selectedCard, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardSelectorPresenter$onCardPaymentOptionSelected$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        fl8 fl8Var;
        a aVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        fl8 fl8Var2 = this.label;
        try {
            if (fl8Var2 == 0) {
                b.b(obj);
                aVar = this.this$0;
                fl8 fl8Var3 = this.$selectedCard;
                v vVar = aVar.y;
                il ilVar = aVar.E;
                String str = ilVar.b;
                String str2 = fl8Var3.a;
                String str3 = ilVar.b().k;
                this.L$0 = aVar;
                this.L$1 = fl8Var3;
                this.L$2 = aVar;
                this.L$3 = fl8Var3;
                this.label = 1;
                obj = vVar.u(str, str2, str3, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                fl8Var = fl8Var3;
                aVar2 = aVar;
                fl8Var2 = fl8Var3;
            } else {
                if (fl8Var2 != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fl8 fl8Var4 = (fl8) this.L$3;
                aVar = (a) this.L$2;
                fl8Var = (fl8) this.L$1;
                aVar2 = (a) this.L$0;
                b.b(obj);
                fl8Var2 = fl8Var4;
            }
            int i = a.K;
            ((rn8) aVar2.Dg()).E();
            a.Kg(aVar2, (Account) obj, fl8Var);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            int i2 = a.K;
            aVar.getClass();
            hst hstVar = jst.e;
            il ilVar2 = aVar.E;
            hstVar.k(th, String.format("Cannot change payment type for account %s", Arrays.copyOf(new Object[]{ilVar2.b}, 1)));
            String a = aVar.z.a(th);
            aVar.G.s(a);
            vnr0 vnr0Var = aVar.A;
            String str4 = ilVar2.b;
            vnr0Var.l.a(vnr0Var.k(str4), str4, "false", Boolean.valueOf(aVar.J.contains(fl8Var2.a)), aVar.F.getValue(), a);
        }
        return zy11.a;
    }
}
