package xsna;

import com.vk.api.generated.notifications.dto.NotificationsActionRedesignResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsApiCallResultDto;
import com.vkontakte.android.R;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;
import xsna.wb70;

/* compiled from: NotificationListItemActionsDelegate.kt */
@b6l(c = "com.vk.notifications.list.impl.presentation.base.mvi.list.delegate.NotificationListItemActionsDelegate$handleApiCall$1", f = "NotificationListItemActionsDelegate.kt", l = {162}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class lb70 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Boolean $isPrimaryButton;
    final /* synthetic */ String $notificationId;
    final /* synthetic */ String $query;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ qb70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb70(Boolean bool, qb70 qb70Var, String str, String str2, spj<? super lb70> spjVar) {
        super(2, spjVar);
        this.$isPrimaryButton = bool;
        this.this$0 = qb70Var;
        this.$notificationId = str;
        this.$query = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new lb70(this.$isPrimaryButton, this.this$0, this.$notificationId, this.$query, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((lb70) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Object obj2;
        qb70 qb70Var;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                Boolean bool = this.$isPrimaryButton;
                if (bool != null) {
                    this.this$0.c.invoke(new wb70.m(this.$notificationId, bool));
                }
                qb70Var = this.this$0;
                String str2 = this.$query;
                String str3 = this.$notificationId;
                iz2 A = yfb.A(qb70Var.b.w(str2));
                this.L$0 = qb70Var;
                this.L$1 = str3;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                obj = evj.p(A, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str = str3;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$1;
                qb70Var = (qb70) this.L$0;
                kotlin.a.a(obj);
            }
            NotificationsActionRedesignResponseDto notificationsActionRedesignResponseDto = (NotificationsActionRedesignResponseDto) obj;
            qb70Var.c.invoke(new wb70.w(str, notificationsActionRedesignResponseDto.d().d() == NotificationsApiCallResultDto.IconDto.DONE ? R.drawable.vk_icon_done_16 : R.drawable.vk_icon_cancel_16, notificationsActionRedesignResponseDto.d().e()));
            obj2 = s3q0.a;
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
            obj2 = failure;
            qb70 qb70Var2 = this.this$0;
            String str4 = this.$notificationId;
            if (Result.a(obj2) != null) {
            }
            return s3q0.a;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            obj2 = failure;
            qb70 qb70Var22 = this.this$0;
            String str42 = this.$notificationId;
            if (Result.a(obj2) != null) {
            }
            return s3q0.a;
        }
        qb70 qb70Var222 = this.this$0;
        String str422 = this.$notificationId;
        if (Result.a(obj2) != null) {
            qb70Var222.c.invoke(new wb70.m(str422, null));
            qb70Var222.c.invoke(wb70.r.b);
        }
        return s3q0.a;
    }
}
