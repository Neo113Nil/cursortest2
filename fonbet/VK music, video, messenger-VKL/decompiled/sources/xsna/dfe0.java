package xsna;

import com.vk.geo.impl.model.CameraBounds;
import com.vk.geo.impl.model.id.StringId;
import com.vk.log.L;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Publisher.kt */
@b6l(c = "com.vk.geo.impl.presentation.publish.Publisher$publishMarkersExecutor$2$1", f = "Publisher.kt", l = {103}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class dfe0 extends SuspendLambda implements wzs<uee0, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ efe0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfe0(efe0 efe0Var, spj<? super dfe0> spjVar) {
        super(2, spjVar);
        this.this$0 = efe0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        dfe0 dfe0Var = new dfe0(this.this$0, spjVar);
        dfe0Var.L$0 = obj;
        return dfe0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(uee0 uee0Var, spj<? super s3q0> spjVar) {
        return ((dfe0) create(uee0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dfe0 dfe0Var;
        Throwable th;
        uee0 uee0Var = (uee0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            try {
                efe0 efe0Var = this.this$0;
                Object obj2 = uee0Var.c;
                CameraBounds cameraBounds = uee0Var.a;
                Map<StringId, do00> map = uee0Var.b;
                boolean z = !map.isEmpty();
                this.L$0 = uee0Var;
                this.label = 1;
                dfe0Var = this;
                try {
                    if (efe0.g(efe0Var, obj2, cameraBounds, map, z, dfe0Var) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    L.i(th);
                    return s3q0.a;
                }
            } catch (Throwable th3) {
                th = th3;
                dfe0Var = this;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                kotlin.a.a(obj);
                dfe0Var = this;
            } catch (Throwable th4) {
                th = th4;
                dfe0Var = this;
                try {
                    L.i(th);
                    return s3q0.a;
                } finally {
                    xf9.e.g(uee0Var.a, dfe0Var.this$0);
                }
            }
        }
        return s3q0.a;
    }
}
