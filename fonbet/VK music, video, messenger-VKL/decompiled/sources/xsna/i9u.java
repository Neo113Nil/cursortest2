package xsna;

import android.content.Context;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.tasks.OnSuccessListener;
import java.time.ZonedDateTime;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.omr;

/* compiled from: GoogleFitDataProvider.kt */
/* loaded from: classes11.dex */
public final class i9u {
    public final ayu0 a;
    public final omr b;

    /* compiled from: GoogleFitDataProvider.kt */
    /* loaded from: classes6.dex */
    public static final class a implements OnSuccessListener {
        public final /* synthetic */ fzj a;

        public a(fzj fzjVar) {
            this.a = fzjVar;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final /* synthetic */ void onSuccess(Object obj) {
            this.a.invoke(obj);
        }
    }

    public i9u(ayu0 ayu0Var) {
        this.a = ayu0Var;
        omr.a aVar = new omr.a();
        aVar.a(DataType.m);
        aVar.a(DataType.f);
        aVar.a(DataType.h);
        this.b = new omr(aVar);
    }

    public static final Object a(i9u i9uVar, Context context, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, f9u f9uVar) {
        i9uVar.getClass();
        int i = 1;
        lq9 lq9Var = new lq9(1, s7s0.c(f9uVar));
        lq9Var.o();
        DataReadRequest.a aVar = new DataReadRequest.a();
        aVar.b(DataType.f);
        aVar.b(DataType.h);
        aVar.b(DataType.m);
        aVar.h(zonedDateTime.toEpochSecond(), zonedDateTime2.toEpochSecond(), TimeUnit.SECONDS);
        aVar.g();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aVar.d();
        try {
            nmr.a(context, com.google.android.gms.auth.api.signin.a.a(context, i9uVar.b)).a(aVar.f()).addOnSuccessListener(new a(new fzj(lq9Var, i))).addOnFailureListener(new g9u(lq9Var)).addOnCanceledListener(new h9u(lq9Var));
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
