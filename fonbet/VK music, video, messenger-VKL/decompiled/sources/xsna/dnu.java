package xsna;

import com.vk.api.generated.notifications.dto.NotificationsNotificationListRedesignResponseDto;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;
import xsna.jnu;

/* compiled from: GroupedNotificationListFeature.kt */
@b6l(c = "com.vk.notifications.list.impl.presentation.base.mvi.grouped.GroupedNotificationListFeature$loadNextPage$1", f = "GroupedNotificationListFeature.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class dnu extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wnu $state;
    int I$0;
    int I$1;
    Object L$0;
    int label;
    final /* synthetic */ gnu this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnu(gnu gnuVar, wnu wnuVar, spj<? super dnu> spjVar) {
        super(2, spjVar);
        this.this$0 = gnuVar;
        this.$state = wnuVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new dnu(this.this$0, this.$state, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((dnu) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Object obj2;
        gnu gnuVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                this.this$0.T(jnu.h.b);
                gnu gnuVar2 = this.this$0;
                String str = this.$state.m;
                this.L$0 = gnuVar2;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                Object U = gnu.U(gnuVar2, str, this);
                if (U == coroutineSingletons) {
                    return coroutineSingletons;
                }
                gnuVar = gnuVar2;
                obj = U;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gnuVar = (gnu) this.L$0;
                kotlin.a.a(obj);
            }
            gnuVar.T(new jnu.i(gnuVar.f.a((NotificationsNotificationListRedesignResponseDto) obj, null)));
            obj2 = s3q0.a;
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
            obj2 = failure;
            gnu gnuVar3 = this.this$0;
            if (Result.a(obj2) != null) {
            }
            this.this$0.T(new jnu.t(false));
            return s3q0.a;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            obj2 = failure;
            gnu gnuVar32 = this.this$0;
            if (Result.a(obj2) != null) {
            }
            this.this$0.T(new jnu.t(false));
            return s3q0.a;
        }
        gnu gnuVar322 = this.this$0;
        if (Result.a(obj2) != null) {
            gnuVar322.T(jnu.g.b);
        }
        this.this$0.T(new jnu.t(false));
        return s3q0.a;
    }
}
