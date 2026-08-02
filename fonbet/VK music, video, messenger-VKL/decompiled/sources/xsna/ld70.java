package xsna;

import com.vk.api.generated.notifications.dto.NotificationsGetUnreadCountersResponseDto;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.nd70;

/* compiled from: NotificationMenuModalFeature.kt */
@b6l(c = "com.vk.notifications.list.impl.presentation.base.mvi.menu.NotificationMenuModalFeature$loadSources$1", f = "NotificationMenuModalFeature.kt", l = {ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ld70 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int I$0;
    int I$1;
    Object L$0;
    int label;
    final /* synthetic */ md70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld70(md70 md70Var, spj<? super ld70> spjVar) {
        super(2, spjVar);
        this.this$0 = md70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ld70(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ld70) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x008c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Object obj2;
        md70 md70Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                this.this$0.T(nd70.d.b);
                md70 md70Var2 = this.this$0;
                iz2 A = yfb.A(md70Var2.j.B());
                this.L$0 = md70Var2;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                Object p = evj.p(A, this);
                if (p == coroutineSingletons) {
                    return coroutineSingletons;
                }
                md70Var = md70Var2;
                obj = p;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                md70Var = (md70) this.L$0;
                kotlin.a.a(obj);
            }
            NotificationsGetUnreadCountersResponseDto notificationsGetUnreadCountersResponseDto = (NotificationsGetUnreadCountersResponseDto) obj;
            md70Var.T(new nd70.a(j5g.u0(md70.V(md70Var, notificationsGetUnreadCountersResponseDto.e(), notificationsGetUnreadCountersResponseDto.d()), Collections.singletonList(md70.U(md70Var, notificationsGetUnreadCountersResponseDto.d().e())))));
            obj2 = s3q0.a;
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
            obj2 = failure;
            md70 md70Var3 = this.this$0;
            if (Result.a(obj2) != null) {
            }
            return s3q0.a;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            obj2 = failure;
            md70 md70Var32 = this.this$0;
            if (Result.a(obj2) != null) {
            }
            return s3q0.a;
        }
        md70 md70Var322 = this.this$0;
        if (Result.a(obj2) != null) {
            md70Var322.T(nd70.b.b);
        }
        return s3q0.a;
    }
}
