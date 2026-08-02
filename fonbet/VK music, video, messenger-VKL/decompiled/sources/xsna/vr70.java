package xsna;

import com.vk.dto.common.id.UserId;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ds70;
import xsna.ur70;

/* compiled from: ObtainVerificationFeature.kt */
@b6l(c = "com.vk.ecomm.verifiedseller.impl.screens.obtainverification.presentation.ObtainVerificationFeature$activateCheckmark$1", f = "ObtainVerificationFeature.kt", l = {155}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class vr70 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ as70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr70(as70 as70Var, spj<? super vr70> spjVar) {
        super(2, spjVar);
        this.this$0 = as70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new vr70(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((vr70) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            as70 as70Var = this.this$0;
            ks70 ks70Var = as70Var.f;
            UserId userId = as70Var.g;
            String str = as70Var.h;
            this.label = 1;
            a = ks70Var.a(userId, str, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            a = ((Result) obj).d();
        }
        as70 as70Var2 = this.this$0;
        if (!(a instanceof Result.Failure)) {
            as70Var2.j.b(rr70.a);
        }
        as70 as70Var3 = this.this$0;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            as70Var3.T(new ds70.g(false));
            f4z f4zVar = as70Var3.j;
            String message = a2.getMessage();
            if (message == null) {
                message = "";
            }
            f4zVar.b(new ur70.a(message));
        }
        return s3q0.a;
    }
}
