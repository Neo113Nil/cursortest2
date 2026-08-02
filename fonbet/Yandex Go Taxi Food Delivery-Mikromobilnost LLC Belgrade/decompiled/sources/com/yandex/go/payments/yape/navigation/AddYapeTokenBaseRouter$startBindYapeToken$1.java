package com.yandex.go.payments.yape.navigation;

import android.content.Intent;
import android.net.Uri;
import com.yandex.go.payments.addmethod.data.model.ApplicationBindingFlow;
import com.yandex.go.payments.addmethod.data.model.AsyncApplicationBindingFlow;
import com.yandex.go.payments.addmethod.data.model.BindPaymentMethodRequest;
import com.yandex.go.payments.addmethod.data.model.WebviewBindingFlow;
import com.yandex.go.payments.addmethod.data.model.g0;
import defpackage.cmt;
import defpackage.evu0;
import defpackage.g9a0;
import defpackage.lk0;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.po21;
import defpackage.qaa0;
import defpackage.scc;
import defpackage.tls;
import defpackage.v5;
import defpackage.w511;
import defpackage.xe91;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.preorder.source.userposition.e;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.yape.navigation.AddYapeTokenBaseRouter$startBindYapeToken$1", f = "AddYapeTokenBaseRouter.kt", l = {85, HProv.PP_HASHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AddYapeTokenBaseRouter$startBindYapeToken$1 extends SuspendLambda implements tls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddYapeTokenBaseRouter$startBindYapeToken$1(c cVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AddYapeTokenBaseRouter$startBindYapeToken$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((AddYapeTokenBaseRouter$startBindYapeToken$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
    
        if (r12 != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0094, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0041, code lost:
    
        if (r12 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qaa0 a = this.this$0.M.a();
            if (a == null || (r12 = a.b) == null) {
                po21 po21Var = this.this$0.F;
                this.label = 1;
                obj = ((e) po21Var).f(this);
            }
            String code = PaymentMethod$Type.YAPE_TOKEN.getCode();
            String d = this.this$0.I.d();
            List g = scc.g(new Double(r12.b), new Double(r12.a));
            c cVar = this.this$0;
            lk0 lk0Var = (lk0) cVar.x;
            cmt<g0> c = cVar.L.c(new BindPaymentMethodRequest(code, 16, d, lk0Var == null ? lk0Var.b : null, g));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            obj = ru.yandex.taxi.network.api.a.d(c, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                g0 g0Var = (g0) obj;
                if (!(g0Var instanceof ApplicationBindingFlow)) {
                    if ((g0Var instanceof AsyncApplicationBindingFlow) || (g0Var instanceof WebviewBindingFlow)) {
                        ny61.k();
                        return null;
                    }
                    w511.b();
                    return null;
                }
                c cVar2 = this.this$0;
                String str = ((ApplicationBindingFlow) g0Var).a;
                cVar2.getClass();
                if (evu0.J(str)) {
                    ny61.k();
                    return null;
                }
                g9a0 g9a0Var = cVar2.J;
                lk0 lk0Var2 = (lk0) cVar2.x;
                String str2 = lk0Var2 != null ? lk0Var2.a : null;
                if (str2 == null) {
                    str2 = "";
                }
                g9a0Var.c(xe91.i(str2), PaymentMethod$Type.YAPE_TOKEN.getCode(), "success");
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(SelfTester_JCP.IMITA);
                cVar2.r(new v5(6, cVar2, intent));
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        zzs zzsVar = ((mo21) obj).a();
        String code2 = PaymentMethod$Type.YAPE_TOKEN.getCode();
        String d2 = this.this$0.I.d();
        List g2 = scc.g(new Double(zzsVar.b), new Double(zzsVar.a));
        c cVar3 = this.this$0;
        lk0 lk0Var3 = (lk0) cVar3.x;
        cmt<g0> c2 = cVar3.L.c(new BindPaymentMethodRequest(code2, 16, d2, lk0Var3 == null ? lk0Var3.b : null, g2));
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        obj = ru.yandex.taxi.network.api.a.d(c2, this);
    }
}
