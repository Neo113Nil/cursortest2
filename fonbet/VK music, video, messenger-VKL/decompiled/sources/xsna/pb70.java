package xsna;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;
import xsna.ha70;
import xsna.wb70;

/* compiled from: NotificationListItemActionsDelegate.kt */
@b6l(c = "com.vk.notifications.list.impl.presentation.base.mvi.list.delegate.NotificationListItemActionsDelegate$handleRestoreNotification$1", f = "NotificationListItemActionsDelegate.kt", l = {120}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class pb70 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ ha70.w $action;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ qb70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb70(qb70 qb70Var, ha70.w wVar, spj<? super pb70> spjVar) {
        super(2, spjVar);
        this.this$0 = qb70Var;
        this.$action = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new pb70(this.this$0, this.$action, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((pb70) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0070  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Object obj2;
        qb70 qb70Var;
        ha70.w wVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                qb70Var = this.this$0;
                ha70.w wVar2 = this.$action;
                iz2 A = yfb.A(qb70Var.b.D(wVar2.a));
                this.L$0 = qb70Var;
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
                qb70Var = (qb70) this.L$0;
                kotlin.a.a(obj);
            }
            qb70Var.c.invoke(new wb70.k(wVar.b, wVar.c));
            obj2 = s3q0.a;
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
            obj2 = failure;
            qb70 qb70Var2 = this.this$0;
            if (Result.a(obj2) != null) {
            }
            return s3q0.a;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            obj2 = failure;
            qb70 qb70Var22 = this.this$0;
            if (Result.a(obj2) != null) {
            }
            return s3q0.a;
        }
        qb70 qb70Var222 = this.this$0;
        if (Result.a(obj2) != null) {
            qb70Var222.c.invoke(wb70.r.b);
        }
        return s3q0.a;
    }
}
