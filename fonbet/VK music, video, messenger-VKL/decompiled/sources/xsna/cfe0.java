package xsna;

import com.vk.geo.impl.model.CameraBounds;
import com.vk.geo.impl.presentation.GeoDataSet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Publisher.kt */
@b6l(c = "com.vk.geo.impl.presentation.publish.Publisher$publish$1", f = "Publisher.kt", l = {125}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class cfe0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ CameraBounds $bounds;
    int label;
    final /* synthetic */ efe0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfe0(efe0 efe0Var, CameraBounds cameraBounds, spj<? super cfe0> spjVar) {
        super(2, spjVar);
        this.this$0 = efe0Var;
        this.$bounds = cameraBounds;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new cfe0(this.this$0, this.$bounds, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((cfe0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            efe0 efe0Var = this.this$0;
            GeoDataSet.a b = efe0Var.h().b();
            CameraBounds cameraBounds = this.$bounds;
            nh0 nh0Var = this.this$0.g;
            qcy<Object>[] qcyVarArr = com.vk.geo.impl.presentation.b.H;
            boolean z = !Boolean.FALSE.booleanValue();
            this.label = 1;
            if (efe0.g(efe0Var, b, cameraBounds, jgp.b, z, this) == coroutineSingletons) {
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
