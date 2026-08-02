package xsna;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.vk.superapp.vksteps.utils.enums.VkStepsSyncDurationStrategy;
import java.time.ZonedDateTime;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GoogleFitDataSource.kt */
@b6l(c = "com.vk.superapp.vksteps.data.datasource.GoogleFitDataSource$getStepsFromGoogleFit$2", f = "GoogleFitDataSource.kt", l = {161, 162}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class k9u extends SuspendLambda implements wzs<yvj, spj<? super ruk>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ZonedDateTime $endTime;
    final /* synthetic */ ZonedDateTime $startTime;
    final /* synthetic */ VkStepsSyncDurationStrategy $syncDurationStrategy;
    final /* synthetic */ boolean $withoutStream;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ j9u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9u(Context context, boolean z, j9u j9uVar, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, VkStepsSyncDurationStrategy vkStepsSyncDurationStrategy, spj<? super k9u> spjVar) {
        super(2, spjVar);
        this.$context = context;
        this.$withoutStream = z;
        this.this$0 = j9uVar;
        this.$startTime = zonedDateTime;
        this.$endTime = zonedDateTime2;
        this.$syncDurationStrategy = vkStepsSyncDurationStrategy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        k9u k9uVar = new k9u(this.$context, this.$withoutStream, this.this$0, this.$startTime, this.$endTime, this.$syncDurationStrategy, spjVar);
        k9uVar.L$0 = obj;
        return k9uVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super ruk> spjVar) {
        return ((k9u) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x005d, code lost:
    
        if (r11 == r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        k9u k9uVar;
        Object failure;
        Throwable a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.$context) != 0) {
                    IllegalAccessException illegalAccessException = new IllegalAccessException("Google Play Services is not available on this device, which is required for accessing Google Fit data.");
                    xgx0 xgx0Var = xgx0.a;
                    String str = "GoogleFitDataProvider.getStepsFromGoogleFit() -> isGooglePlayServicesAvailable = false, " + illegalAccessException.getMessage();
                    xgx0Var.getClass();
                    xgx0.b(str);
                    throw illegalAccessException;
                }
                boolean z = this.$withoutStream;
                j9u j9uVar = this.this$0;
                Context context = this.$context;
                ZonedDateTime zonedDateTime = this.$startTime;
                ZonedDateTime zonedDateTime2 = this.$endTime;
                VkStepsSyncDurationStrategy vkStepsSyncDurationStrategy = this.$syncDurationStrategy;
                if (z) {
                    try {
                        this.label = 1;
                        k9uVar = this;
                        obj = j9u.b(j9uVar, context, zonedDateTime, zonedDateTime2, vkStepsSyncDurationStrategy, k9uVar);
                        if (obj == coroutineSingletons) {
                        }
                        failure = (ruk) obj;
                    } catch (Throwable th2) {
                        th = th2;
                        k9uVar = this;
                        th = th;
                        failure = new Result.Failure(th);
                        j9u j9uVar2 = k9uVar.this$0;
                        a = Result.a(failure);
                        if (a != null) {
                        }
                        kotlin.a.a(failure);
                        return failure;
                    }
                } else {
                    k9uVar = this;
                    k9uVar.label = 2;
                    obj = j9u.a(j9uVar, context, zonedDateTime, zonedDateTime2, vkStepsSyncDurationStrategy, k9uVar);
                }
                return coroutineSingletons;
            }
            try {
                if (i == 1) {
                    kotlin.a.a(obj);
                    k9uVar = this;
                    failure = (ruk) obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    k9uVar = this;
                    failure = (ruk) obj;
                }
            } catch (Throwable th3) {
                th = th3;
                k9uVar = this;
                failure = new Result.Failure(th);
                j9u j9uVar22 = k9uVar.this$0;
                a = Result.a(failure);
                if (a != null) {
                }
                kotlin.a.a(failure);
                return failure;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        j9u j9uVar222 = k9uVar.this$0;
        a = Result.a(failure);
        if (a != null) {
            j9uVar222.a.f(a);
        }
        kotlin.a.a(failure);
        return failure;
    }
}
