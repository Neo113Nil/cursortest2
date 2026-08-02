package xsna;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import java.time.ZonedDateTime;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GoogleFitDataProvider.kt */
@b6l(c = "com.vk.superapp.vkworkout.data.datasource.GoogleFitDataProvider$getWorkoutsFromGoogleFit$2", f = "GoogleFitDataProvider.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class f9u extends SuspendLambda implements wzs<yvj, spj<? super ruk>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ZonedDateTime $endTime;
    final /* synthetic */ ZonedDateTime $startTime;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ i9u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9u(Context context, i9u i9uVar, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, spj<? super f9u> spjVar) {
        super(2, spjVar);
        this.$context = context;
        this.this$0 = i9uVar;
        this.$startTime = zonedDateTime;
        this.$endTime = zonedDateTime2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        f9u f9uVar = new f9u(this.$context, this.this$0, this.$startTime, this.$endTime, spjVar);
        f9uVar.L$0 = obj;
        return f9uVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super ruk> spjVar) {
        return ((f9u) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.$context) != 0) {
                    IllegalAccessException illegalAccessException = new IllegalAccessException("Google Play Services is not available on this device, which is required for accessing Google Fit data.");
                    xgx0 xgx0Var = xgx0.a;
                    String str = "GoogleFitDataProvider getWorkoutsFromGoogleFit() -> isGooglePlayServicesAvailable = false, " + illegalAccessException.getMessage();
                    xgx0Var.getClass();
                    xgx0.b(str);
                    throw illegalAccessException;
                }
                i9u i9uVar = this.this$0;
                Context context = this.$context;
                ZonedDateTime zonedDateTime = this.$startTime;
                ZonedDateTime zonedDateTime2 = this.$endTime;
                this.label = 1;
                obj = i9u.a(i9uVar, context, zonedDateTime, zonedDateTime2, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            failure = (ruk) obj;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        i9u i9uVar2 = this.this$0;
        Throwable a = Result.a(failure);
        if (a != null) {
            i9uVar2.a.f(a);
        }
        kotlin.a.a(failure);
        return failure;
    }
}
