package xsna;

import android.content.Context;
import java.io.Serializable;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetActivitiesFromHealthConnectVkWorkoutUseCase.kt */
/* loaded from: classes11.dex */
public final class ipt {
    public final m2w0 a;

    public ipt(m2w0 m2w0Var) {
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
        hpt hptVar;
        int i;
        if (continuationImpl instanceof hpt) {
            hptVar = (hpt) continuationImpl;
            int i2 = hptVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hptVar.label = i2 - Integer.MIN_VALUE;
                Object obj = hptVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hptVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    hptVar.L$0 = context;
                    hptVar.L$1 = bvo0Var;
                    hptVar.label = 1;
                    obj = kzx0.a(bvo0Var, hptVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return obj;
                    }
                    bvo0Var = (bvo0) hptVar.L$1;
                    context = (Context) hptVar.L$0;
                    kotlin.a.a(obj);
                }
                List list = (List) obj;
                xgx0.a.getClass();
                xgx0.a("GetActivitiesFromHealthConnectVkWorkoutUseCase.execute() -> timeRange: " + bvo0Var + ", timeIntervals: " + list);
                hptVar.L$0 = null;
                hptVar.L$1 = null;
                hptVar.label = 2;
                Serializable b = this.a.b(context, list, hptVar);
                return b != coroutineSingletons ? coroutineSingletons : b;
            }
        }
        hptVar = new hpt(this, continuationImpl);
        Object obj2 = hptVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hptVar.label;
        if (i != 0) {
        }
        List list2 = (List) obj2;
        xgx0.a.getClass();
        xgx0.a("GetActivitiesFromHealthConnectVkWorkoutUseCase.execute() -> timeRange: " + bvo0Var + ", timeIntervals: " + list2);
        hptVar.L$0 = null;
        hptVar.L$1 = null;
        hptVar.label = 2;
        Serializable b2 = this.a.b(context, list2, hptVar);
        if (b2 != coroutineSingletons2) {
        }
    }
}
