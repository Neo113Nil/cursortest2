package xsna;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: UnfinishedWorkListener.kt */
@b6l(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2", f = "UnfinishedWorkListener.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class f3q0 extends SuspendLambda implements wzs<Boolean, spj<? super s3q0>, Object> {
    final /* synthetic */ Context $appContext;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3q0(Context context, spj<? super f3q0> spjVar) {
        super(2, spjVar);
        this.$appContext = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        f3q0 f3q0Var = new f3q0(this.$appContext, spjVar);
        f3q0Var.Z$0 = ((Boolean) obj).booleanValue();
        return f3q0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Boolean bool, spj<? super s3q0> spjVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((f3q0) create(bool2, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        z790.a(this.$appContext, RescheduleReceiver.class, this.Z$0);
        return s3q0.a;
    }
}
