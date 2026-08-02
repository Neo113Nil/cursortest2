package xsna;

import android.content.Context;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.tasks.OnSuccessListener;
import com.vk.superapp.vksteps.utils.enums.VkStepsSyncDurationStrategy;
import java.time.ZonedDateTime;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.omr;

/* compiled from: GoogleFitDataSource.kt */
/* loaded from: classes11.dex */
public final class j9u {
    public final ayu0 a;
    public final omr b;

    /* compiled from: GoogleFitDataSource.kt */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkStepsSyncDurationStrategy.values().length];
            try {
                iArr[VkStepsSyncDurationStrategy.ONE_MINUTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkStepsSyncDurationStrategy.TEN_MINUTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkStepsSyncDurationStrategy.ONE_DAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: GoogleFitDataSource.kt */
    /* loaded from: classes6.dex */
    public static final class b implements OnSuccessListener {
        public final /* synthetic */ l9u a;

        public b(l9u l9uVar) {
            this.a = l9uVar;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final /* synthetic */ void onSuccess(Object obj) {
            this.a.invoke(obj);
        }
    }

    public j9u(ayu0 ayu0Var) {
        this.a = ayu0Var;
        omr.a aVar = new omr.a();
        aVar.a(DataType.m);
        aVar.a(DataType.f);
        aVar.a(DataType.y);
        aVar.a(DataType.x);
        this.b = new omr(aVar);
    }

    public static final Object a(j9u j9uVar, Context context, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, VkStepsSyncDurationStrategy vkStepsSyncDurationStrategy, k9u k9uVar) {
        j9uVar.getClass();
        DataSource.a aVar = new DataSource.a();
        aVar.c(DataType.f);
        aVar.e();
        aVar.d();
        aVar.b();
        DataSource a2 = aVar.a();
        DataReadRequest.a aVar2 = new DataReadRequest.a();
        aVar2.a(a2, DataType.x);
        aVar2.c(DataType.m, DataType.y);
        aVar2.h(zonedDateTime.toInstant().toEpochMilli(), zonedDateTime2.toInstant().toEpochMilli(), TimeUnit.MILLISECONDS);
        aVar2.g();
        return j9uVar.c(context, aVar2, vkStepsSyncDurationStrategy, k9uVar);
    }

    public static final Object b(j9u j9uVar, Context context, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, VkStepsSyncDurationStrategy vkStepsSyncDurationStrategy, k9u k9uVar) {
        j9uVar.getClass();
        DataReadRequest.a aVar = new DataReadRequest.a();
        aVar.c(DataType.f, DataType.x);
        aVar.c(DataType.m, DataType.y);
        aVar.h(zonedDateTime.toInstant().toEpochMilli(), zonedDateTime2.toInstant().toEpochMilli(), TimeUnit.MILLISECONDS);
        return j9uVar.c(context, aVar, vkStepsSyncDurationStrategy, k9uVar);
    }

    public final Object c(Context context, DataReadRequest.a aVar, VkStepsSyncDurationStrategy vkStepsSyncDurationStrategy, k9u k9uVar) {
        lq9 lq9Var = new lq9(1, s7s0.c(k9uVar));
        lq9Var.o();
        int i = a.$EnumSwitchMapping$0[vkStepsSyncDurationStrategy.ordinal()];
        if (i == 1 || i == 2) {
            aVar.e(10, TimeUnit.MINUTES);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            aVar.e(1, TimeUnit.DAYS);
        }
        try {
            nmr.a(context, com.google.android.gms.auth.api.signin.a.a(context, this.b)).a(aVar.f()).addOnSuccessListener(new b(new l9u(lq9Var))).addOnFailureListener(new m9u(lq9Var)).addOnCanceledListener(new n9u(lq9Var));
        } catch (Throwable th) {
            xgx0 xgx0Var = xgx0.a;
            String str = "GoogleFitDataProvider.readData() -> requestBuilder error: " + th.getMessage();
            xgx0Var.getClass();
            xgx0.b(str);
            lq9Var.resumeWith(new Result.Failure(th));
        }
        Object n = lq9Var.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return n;
    }
}
