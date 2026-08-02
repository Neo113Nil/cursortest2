package xsna;

import com.vk.api.generated.notifications.dto.NotificationsNotificationListRedesignResponseDto;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;
import xsna.oa70;
import xsna.wb70;

/* compiled from: NotificationListFeatureV2.kt */
@b6l(c = "com.vk.notifications.list.impl.presentation.base.mvi.list.feature.NotificationListFeatureV2$loadNextPage$1", f = "NotificationListFeatureV2.kt", l = {567}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class za70 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ oa70.g $action;
    final /* synthetic */ o870 $currentPage;
    final /* synthetic */ dc70 $state;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ wa70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za70(wa70 wa70Var, oa70.g gVar, o870 o870Var, dc70 dc70Var, spj<? super za70> spjVar) {
        super(2, spjVar);
        this.this$0 = wa70Var;
        this.$action = gVar;
        this.$currentPage = o870Var;
        this.$state = dc70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new za70(this.this$0, this.$action, this.$currentPage, this.$state, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((za70) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ae  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        za70 za70Var;
        TimeoutCancellationException timeoutCancellationException;
        Result.Failure failure;
        Object obj2;
        Throwable a;
        String str;
        String str2;
        boolean b0;
        wa70 wa70Var;
        oa70.g gVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                this.this$0.T(new wb70.i(this.$action.b));
                o870 o870Var = this.$currentPage;
                wa70 wa70Var2 = this.this$0;
                dc70 dc70Var = this.$state;
                oa70.g gVar2 = this.$action;
                try {
                    str = o870Var.e;
                    zi70 W = wa70.W(wa70Var2, dc70Var);
                    str2 = W != null ? W.a : null;
                    b0 = wa70.b0(dc70Var);
                    this.L$0 = wa70Var2;
                    this.L$1 = gVar2;
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    za70Var = this;
                } catch (TimeoutCancellationException e) {
                    e = e;
                    za70Var = this;
                    timeoutCancellationException = e;
                    failure = new Result.Failure(timeoutCancellationException);
                    obj2 = failure;
                    wa70 wa70Var3 = za70Var.this$0;
                    oa70.g gVar3 = za70Var.$action;
                    a = Result.a(obj2);
                    if (a != null) {
                    }
                    za70Var.this$0.T(new wb70.y(za70Var.$action.b, false));
                    return s3q0.a;
                } catch (CancellationException e2) {
                    e = e2;
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    za70Var = this;
                    th = th;
                    failure = new Result.Failure(th);
                    obj2 = failure;
                    wa70 wa70Var32 = za70Var.this$0;
                    oa70.g gVar32 = za70Var.$action;
                    a = Result.a(obj2);
                    if (a != null) {
                    }
                    za70Var.this$0.T(new wb70.y(za70Var.$action.b, false));
                    return s3q0.a;
                }
                try {
                    obj = wa70Var2.c0(str, b0, str2, 0, false, za70Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    wa70Var = wa70Var2;
                    gVar = gVar2;
                } catch (TimeoutCancellationException e3) {
                    e = e3;
                    timeoutCancellationException = e;
                    failure = new Result.Failure(timeoutCancellationException);
                    obj2 = failure;
                    wa70 wa70Var322 = za70Var.this$0;
                    oa70.g gVar322 = za70Var.$action;
                    a = Result.a(obj2);
                    if (a != null) {
                    }
                    za70Var.this$0.T(new wb70.y(za70Var.$action.b, false));
                    return s3q0.a;
                } catch (CancellationException e4) {
                    e = e4;
                    throw e;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    failure = new Result.Failure(th);
                    obj2 = failure;
                    wa70 wa70Var3222 = za70Var.this$0;
                    oa70.g gVar3222 = za70Var.$action;
                    a = Result.a(obj2);
                    if (a != null) {
                    }
                    za70Var.this$0.T(new wb70.y(za70Var.$action.b, false));
                    return s3q0.a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gVar = (oa70.g) this.L$1;
                wa70Var = (wa70) this.L$0;
                kotlin.a.a(obj);
                za70Var = this;
            }
            wa70Var.T(new wb70.j(gVar.b, wa70Var.f.a((NotificationsNotificationListRedesignResponseDto) obj, null)));
            obj2 = s3q0.a;
        } catch (TimeoutCancellationException e5) {
            timeoutCancellationException = e5;
            za70Var = this;
        } catch (CancellationException e6) {
            throw e6;
        } catch (Throwable th4) {
            th = th4;
            za70Var = this;
        }
        wa70 wa70Var32222 = za70Var.this$0;
        oa70.g gVar32222 = za70Var.$action;
        a = Result.a(obj2);
        if (a != null) {
            com.vk.metrics.eventtracking.b.a.a(new Throwable("Notifications list loading error", a));
            wa70Var32222.T(new wb70.g(gVar32222.b));
        }
        za70Var.this$0.T(new wb70.y(za70Var.$action.b, false));
        return s3q0.a;
    }
}
