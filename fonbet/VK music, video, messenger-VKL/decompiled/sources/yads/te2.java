package yads;

import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.lq9;
import xsna.s3q0;
import xsna.s7s0;
import xsna.spj;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class te2 extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ ve2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te2(ve2 ve2Var, spj spjVar) {
        super(2, spjVar);
        this.c = ve2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new te2(this.c, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new te2(this.c, (spj) obj2).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        ve2 ve2Var = this.c;
        this.b = 1;
        lq9 lq9Var = new lq9(1, s7s0.c(this));
        lq9Var.o();
        try {
            Task<AppSetIdInfo> appSetIdInfo = AppSet.getClient(ve2Var.a.getApplicationContext()).getAppSetIdInfo();
            final re2 re2Var = new re2(lq9Var);
            appSetIdInfo.addOnSuccessListener(new OnSuccessListener() { // from class: yads.ue2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final /* synthetic */ void onSuccess(Object obj2) {
                    re2Var.invoke(obj2);
                }
            }).addOnFailureListener(new se2(lq9Var));
        } catch (Throwable unused) {
            lq9Var.p(null, null);
        }
        Object n = lq9Var.n();
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
