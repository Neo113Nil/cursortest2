package xsna;

import com.vk.api.generated.notifications.dto.NotificationsActionRedesignResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsApiCallResultDto;
import com.vkontakte.android.R;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;
import xsna.jnu;

/* compiled from: GroupedNotificationListFeature.kt */
@b6l(c = "com.vk.notifications.list.impl.presentation.base.mvi.grouped.GroupedNotificationListFeature$handleApiCall$1", f = "GroupedNotificationListFeature.kt", l = {379}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ymu extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Boolean $isPrimaryButton;
    final /* synthetic */ String $notificationId;
    final /* synthetic */ String $query;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ gnu this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymu(Boolean bool, gnu gnuVar, String str, String str2, spj<? super ymu> spjVar) {
        super(2, spjVar);
        this.$isPrimaryButton = bool;
        this.this$0 = gnuVar;
        this.$notificationId = str;
        this.$query = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ymu(this.$isPrimaryButton, this.this$0, this.$notificationId, this.$query, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ymu) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Object obj2;
        gnu gnuVar;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                Boolean bool = this.$isPrimaryButton;
                if (bool != null) {
                    this.this$0.T(new jnu.k(this.$notificationId, bool));
                }
                gnuVar = this.this$0;
                String str2 = this.$query;
                String str3 = this.$notificationId;
                iz2 A = yfb.A(gnuVar.j.w(str2));
                this.L$0 = gnuVar;
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
                gnuVar = (gnu) this.L$0;
                kotlin.a.a(obj);
            }
            NotificationsActionRedesignResponseDto notificationsActionRedesignResponseDto = (NotificationsActionRedesignResponseDto) obj;
            gnuVar.T(new jnu.s(str, notificationsActionRedesignResponseDto.d().d() == NotificationsApiCallResultDto.IconDto.DONE ? R.drawable.vk_icon_done_16 : R.drawable.vk_icon_cancel_16, notificationsActionRedesignResponseDto.d().e()));
            obj2 = s3q0.a;
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
            obj2 = failure;
            gnu gnuVar2 = this.this$0;
            String str4 = this.$notificationId;
            if (Result.a(obj2) != null) {
            }
            return s3q0.a;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            obj2 = failure;
            gnu gnuVar22 = this.this$0;
            String str42 = this.$notificationId;
            if (Result.a(obj2) != null) {
            }
            return s3q0.a;
        }
        gnu gnuVar222 = this.this$0;
        String str422 = this.$notificationId;
        if (Result.a(obj2) != null) {
            gnuVar222.T(new jnu.k(str422, null));
            gnuVar222.T(jnu.o.b);
        }
        return s3q0.a;
    }
}
