package xsna;

import android.content.Context;
import java.io.Serializable;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetActivitiesFromGoogleFitVkWorkoutUseCase.kt */
/* loaded from: classes11.dex */
public final class gpt {
    public final m2w0 a;

    public gpt(m2w0 m2w0Var) {
        this.a = m2w0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r9 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, bvo0 bvo0Var, ContinuationImpl continuationImpl) {
        fpt fptVar;
        int i;
        if (continuationImpl instanceof fpt) {
            fptVar = (fpt) continuationImpl;
            int i2 = fptVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fptVar.label = i2 - Integer.MIN_VALUE;
                Object obj = fptVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fptVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    fptVar.L$0 = context;
                    fptVar.L$1 = bvo0Var;
                    fptVar.label = 1;
                    obj = kzx0.a(bvo0Var, fptVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return obj;
                    }
                    bvo0Var = (bvo0) fptVar.L$1;
                    context = (Context) fptVar.L$0;
                    kotlin.a.a(obj);
                }
                List list = (List) obj;
                xgx0.a.getClass();
                xgx0.a("GetActivitiesFromGoogleFitVkWorkoutUseCase.execute() -> timeRange: " + bvo0Var + ", timeIntervals: " + list);
                fptVar.L$0 = null;
                fptVar.L$1 = null;
                fptVar.label = 2;
                Serializable a = this.a.a(context, list, fptVar);
                return a != coroutineSingletons ? coroutineSingletons : a;
            }
        }
        fptVar = new fpt(this, continuationImpl);
        Object obj2 = fptVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fptVar.label;
        if (i != 0) {
        }
        List list2 = (List) obj2;
        xgx0.a.getClass();
        xgx0.a("GetActivitiesFromGoogleFitVkWorkoutUseCase.execute() -> timeRange: " + bvo0Var + ", timeIntervals: " + list2);
        fptVar.L$0 = null;
        fptVar.L$1 = null;
        fptVar.label = 2;
        Serializable a2 = this.a.a(context, list2, fptVar);
        if (a2 != coroutineSingletons2) {
        }
    }
}
