package xsna;

import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: NotificationListFeatureV2.kt */
@b6l(c = "com.vk.notifications.list.impl.presentation.base.mvi.list.feature.NotificationListFeatureV2$loadFriendRequests$2", f = "NotificationListFeatureV2.kt", l = {713}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ya70 extends SuspendLambda implements wzs<yvj, spj<? super yos>, Object> {
    int I$0;
    int I$1;
    int label;

    public ya70() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ya70(2, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super yos> spjVar) {
        return ((ya70) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0060 A[ORIG_RETURN, RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                io.reactivex.rxjava3.internal.operators.observable.m1 T = rsg0.T(new wos(0, 2, false, false, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.NOTIFICATIONS), new pr(29)));
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                obj = sd9.g(T, q230.FIRST_OR_DEFAULT, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            obj2 = (yos) obj;
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
            obj2 = failure;
            if (obj2 instanceof Result.Failure) {
            }
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            obj2 = failure;
            if (obj2 instanceof Result.Failure) {
            }
        }
        if (obj2 instanceof Result.Failure) {
            return null;
        }
        return obj2;
    }
}
