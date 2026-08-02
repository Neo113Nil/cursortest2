package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.verifiedseller.impl.screens.obtainverification.model.ObtainVerificationScreenContent;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ds70;
import xsna.mr70;

/* compiled from: ObtainVerificationFeature.kt */
@b6l(c = "com.vk.ecomm.verifiedseller.impl.screens.obtainverification.presentation.ObtainVerificationFeature$unlinkBidProfile$1", f = "ObtainVerificationFeature.kt", l = {211}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class zr70 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ as70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr70(as70 as70Var, spj<? super zr70> spjVar) {
        super(2, spjVar);
        this.this$0 = as70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new zr70(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((zr70) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            as70 as70Var = this.this$0;
            ks70 ks70Var = as70Var.f;
            UserId userId = as70Var.g;
            this.label = 1;
            h = ks70Var.h(userId, this);
            if (h == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            h = ((Result) obj).d();
        }
        as70 as70Var2 = this.this$0;
        if (!(h instanceof Result.Failure)) {
            as70Var2.T(new ds70.c(ObtainVerificationScreenContent.CurrentModalType.UNLINKED));
            as70Var2.C(mr70.i.b);
        }
        as70 as70Var3 = this.this$0;
        if (Result.a(h) != null) {
            as70Var3.T(new ds70.c(ObtainVerificationScreenContent.CurrentModalType.ERROR));
        }
        return s3q0.a;
    }
}
