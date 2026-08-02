package xsna;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GroupedNotificationListFeature.kt */
@b6l(c = "com.vk.notifications.list.impl.presentation.base.mvi.grouped.GroupedNotificationListFeature$sendMarkAsRead$1", f = "GroupedNotificationListFeature.kt", l = {169}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class hnu extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ long $groupId;
    int I$0;
    int I$1;
    Object L$0;
    int label;
    final /* synthetic */ gnu this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hnu(gnu gnuVar, long j, spj<? super hnu> spjVar) {
        super(2, spjVar);
        this.this$0 = gnuVar;
        this.$groupId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new hnu(this.this$0, this.$groupId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((hnu) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gnu gnuVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                gnu gnuVar2 = this.this$0;
                iz2 A = yfb.A(gnuVar2.j.C(new Long(this.$groupId), String.valueOf(qni0.b())));
                this.L$0 = gnuVar2;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                if (evj.p(A, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                gnuVar = gnuVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gnuVar = (gnu) this.L$0;
                try {
                    kotlin.a.a(obj);
                } catch (Throwable unused) {
                }
            }
            ((he70) gnuVar.l.getValue()).getClass();
            if (he70.a() == null) {
                g620.w(0);
            }
            s3q0 s3q0Var = s3q0.a;
            return s3q0.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
