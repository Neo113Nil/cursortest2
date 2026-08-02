package xsna;

import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.yeg0;

/* compiled from: UxPolls.kt */
@b6l(c = "com.vk.uxpolls.framework.UxPolls$retrievePolls$2", f = "UxPolls.kt", l = {ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class n4r0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $clearCache;
    final /* synthetic */ List<String> $triggers;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4r0(boolean z, List<String> list, spj<? super n4r0> spjVar) {
        super(2, spjVar);
        this.$clearCache = z;
        this.$triggers = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new n4r0(this.$clearCache, this.$triggers, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((n4r0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$clearCache) {
                eic eicVar = (eic) l4r0.f.getValue();
                kotlin.coroutines.d context = getContext();
                eicVar.getClass();
                myc0.h(zvj.a(context), null, null, new lf6(eicVar, null, null), 3);
            }
            yeg0 yeg0Var = (yeg0) l4r0.d.getValue();
            kotlin.coroutines.d context2 = getContext();
            blq0 blq0Var = l4r0.a;
            if (blq0Var == null) {
                blq0Var = null;
            }
            d4e0 d4e0Var = l4r0.b;
            if (d4e0Var == null || (a = d4e0Var.a()) == null) {
                return s3q0.a;
            }
            asl b = yeg0Var.b(context2, new yeg0.a.b(a, null, this.$triggers, blq0Var));
            this.label = 1;
            if (b.J(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
