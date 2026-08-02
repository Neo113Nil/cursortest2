package com.yandex.go.payments.addmethod.navigation;

import defpackage.gg0;
import defpackage.jd0;
import defpackage.lg0;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.po21;
import defpackage.qaa0;
import defpackage.scc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.addmethod.navigation.AddFastshiftAccountBaseRouter$onLaunch$1", f = "AddFastshiftAccountBaseRouter.kt", l = {HProv.PP_BIO_STATISTICA_LEN}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AddFastshiftAccountBaseRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ jd0 $payload;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddFastshiftAccountBaseRouter$onLaunch$1(c cVar, jd0 jd0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$payload = jd0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddFastshiftAccountBaseRouter$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddFastshiftAccountBaseRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gg0 a;
        gg0 gg0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            a = cVar.P.a(new a(cVar), true);
            qaa0 a2 = this.this$0.O.a();
            if (a2 == null || (r1 = a2.b) == null) {
                po21 po21Var = this.this$0.H;
                this.L$0 = null;
                this.L$1 = a;
                this.label = 1;
                Object f = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).f(this);
                if (f == coroutineSingletons) {
                    return coroutineSingletons;
                }
                gg0Var = a;
                obj = f;
            }
            List g = scc.g(new Double(r1.b), new Double(r1.a));
            c cVar2 = this.this$0;
            cVar2.A(a, new lg0(PaymentMethod$Type.FASTSHIFT_ACCOUNT, g, this.$payload.b), new b(cVar2, 0));
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        gg0Var = (gg0) this.L$1;
        kotlin.b.b(obj);
        zzs zzsVar = ((mo21) obj).a();
        a = gg0Var;
        List g2 = scc.g(new Double(zzsVar.b), new Double(zzsVar.a));
        c cVar22 = this.this$0;
        cVar22.A(a, new lg0(PaymentMethod$Type.FASTSHIFT_ACCOUNT, g2, this.$payload.b), new b(cVar22, 0));
        return zy11.a;
    }
}
