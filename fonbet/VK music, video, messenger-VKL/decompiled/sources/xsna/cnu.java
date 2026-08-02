package xsna;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;
import xsna.ha70;
import xsna.jnu;

/* compiled from: GroupedNotificationListFeature.kt */
@b6l(c = "com.vk.notifications.list.impl.presentation.base.mvi.grouped.GroupedNotificationListFeature$handleRestoreNotification$1", f = "GroupedNotificationListFeature.kt", l = {337}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class cnu extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ ha70.w $action;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ gnu this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnu(gnu gnuVar, ha70.w wVar, spj<? super cnu> spjVar) {
        super(2, spjVar);
        this.this$0 = gnuVar;
        this.$action = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new cnu(this.this$0, this.$action, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((cnu) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Object obj2;
        gnu gnuVar;
        ha70.w wVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                gnuVar = this.this$0;
                ha70.w wVar2 = this.$action;
                iz2 A = yfb.A(gnuVar.j.D(wVar2.a));
                this.L$0 = gnuVar;
                this.L$1 = wVar2;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                if (evj.p(A, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                wVar = wVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wVar = (ha70.w) this.L$1;
                gnuVar = (gnu) this.L$0;
                kotlin.a.a(obj);
            }
            gnuVar.T(new jnu.j(wVar.b, wVar.c));
            obj2 = s3q0.a;
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
            obj2 = failure;
            gnu gnuVar2 = this.this$0;
            if (Result.a(obj2) != null) {
            }
            return s3q0.a;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            obj2 = failure;
            gnu gnuVar22 = this.this$0;
            if (Result.a(obj2) != null) {
            }
            return s3q0.a;
        }
        gnu gnuVar222 = this.this$0;
        if (Result.a(obj2) != null) {
            gnuVar222.T(jnu.o.b);
        }
        return s3q0.a;
    }
}
