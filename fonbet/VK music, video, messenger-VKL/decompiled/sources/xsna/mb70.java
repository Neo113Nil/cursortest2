package xsna;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;
import xsna.ha70;
import xsna.wb70;
import xsna.xh70;

/* compiled from: NotificationListItemActionsDelegate.kt */
@b6l(c = "com.vk.notifications.list.impl.presentation.base.mvi.list.delegate.NotificationListItemActionsDelegate$handleDeleteNotification$1", f = "NotificationListItemActionsDelegate.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class mb70 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ ha70.b $action;
    final /* synthetic */ dc70 $state;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ qb70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb70(qb70 qb70Var, ha70.b bVar, dc70 dc70Var, spj<? super mb70> spjVar) {
        super(2, spjVar);
        this.this$0 = qb70Var;
        this.$action = bVar;
        this.$state = dc70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new mb70(this.this$0, this.$action, this.$state, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((mb70) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00bd  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Object obj2;
        ha70.b bVar;
        qb70 qb70Var;
        dc70 dc70Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                qb70 qb70Var2 = this.this$0;
                bVar = this.$action;
                dc70 dc70Var2 = this.$state;
                iz2 A = yfb.A(m4s.A(qb70Var2.b, bVar.b));
                this.L$0 = qb70Var2;
                this.L$1 = bVar;
                this.L$2 = dc70Var2;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                if (evj.p(A, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                qb70Var = qb70Var2;
                dc70Var = dc70Var2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dc70Var = (dc70) this.L$2;
                bVar = (ha70.b) this.L$1;
                qb70Var = (qb70) this.L$0;
                kotlin.a.a(obj);
            }
            o870 o870Var = dc70Var.d.get(dc70Var.i);
            Integer g = i7o0.g(o870Var.d, new h630(bVar, 9));
            if (g != null) {
                kb70 kb70Var = o870Var.d.get(g.intValue());
                qb70Var.c.invoke(new wb70.b(g.intValue()));
                qb70Var.c.invoke(new wb70.u(new xh70.a(new ha70.w(bVar.b, g.intValue(), kb70Var))));
            }
            obj2 = s3q0.a;
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
            obj2 = failure;
            qb70 qb70Var3 = this.this$0;
            if (Result.a(obj2) != null) {
            }
            return s3q0.a;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            obj2 = failure;
            qb70 qb70Var32 = this.this$0;
            if (Result.a(obj2) != null) {
            }
            return s3q0.a;
        }
        qb70 qb70Var322 = this.this$0;
        if (Result.a(obj2) != null) {
            qb70Var322.c.invoke(wb70.r.b);
        }
        return s3q0.a;
    }
}
