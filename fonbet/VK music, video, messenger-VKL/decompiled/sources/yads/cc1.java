package yads;

import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.ttk0;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class cc1 extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ IntegrationInspectorActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc1(IntegrationInspectorActivity integrationInspectorActivity, spj spjVar) {
        super(2, spjVar);
        this.c = integrationInspectorActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new cc1(this.c, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new cc1(this.c, (spj) obj2).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        nc1 b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            kotlin.a.a(obj);
            b = this.c.b();
            ttk0 ttk0Var = b.n;
            bc1 bc1Var = new bc1(this.c);
            this.b = 1;
            if (ttk0Var.collect(bc1Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        throw new KotlinNothingValueException();
    }
}
