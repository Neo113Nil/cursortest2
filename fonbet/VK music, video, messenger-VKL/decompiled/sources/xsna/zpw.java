package xsna;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.superapp.api.dto.vkworkout.WorkoutData;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ImportActivitiesVkWorkoutUseCase.kt */
/* loaded from: classes11.dex */
public final class zpw {
    public final m2w0 a;
    public final s2w0 b;
    public final w2w0 c;

    public zpw(m2w0 m2w0Var, s2w0 s2w0Var, w2w0 w2w0Var) {
        this.a = m2w0Var;
        this.b = s2w0Var;
        this.c = w2w0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, List list, long j, yzs yzsVar, izs izsVar, ContinuationImpl continuationImpl) {
        wpw wpwVar;
        int i;
        izs izsVar2;
        Context context2;
        List D0;
        List e;
        wpw wpwVar2;
        yzs yzsVar2;
        Iterator it;
        long j2;
        Context context3;
        long j3 = j;
        yzs yzsVar3 = yzsVar;
        if (continuationImpl instanceof wpw) {
            wpwVar = (wpw) continuationImpl;
            int i2 = wpwVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wpwVar.label = i2 - Integer.MIN_VALUE;
                Object obj = wpwVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = wpwVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (list.isEmpty()) {
                        xgx0.a.getClass();
                        xgx0.a("VkWorkoutImportActivitiesUseCase.execute() -> List<WorkoutData> is empty! nothing to send");
                        if (yzsVar3 != null) {
                            yzsVar3.invoke(new Integer(0), "List<WorkoutData> is empty! nothing to send", new Long(j3));
                        }
                        return s3q0.a;
                    }
                    wpwVar.L$0 = context;
                    wpwVar.L$1 = yzsVar3;
                    izsVar2 = izsVar;
                    wpwVar.L$2 = izsVar2;
                    wpwVar.J$0 = j3;
                    wpwVar.label = 1;
                    Object a = this.b.a(list, wpwVar);
                    if (a != obj2) {
                        obj = a;
                        context2 = context;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j4 = wpwVar.J$0;
                    Iterator it2 = (Iterator) wpwVar.L$3;
                    izsVar2 = (izs) wpwVar.L$2;
                    yzs yzsVar4 = (yzs) wpwVar.L$1;
                    Context context4 = (Context) wpwVar.L$0;
                    kotlin.a.a(obj);
                    it = it2;
                    j2 = j4;
                    context3 = context4;
                    wpwVar2 = wpwVar;
                    yzsVar2 = yzsVar4;
                    while (it.hasNext()) {
                        List list2 = (List) it.next();
                        wpwVar2.L$0 = context3;
                        wpwVar2.L$1 = yzsVar2;
                        wpwVar2.L$2 = izsVar2;
                        wpwVar2.L$3 = it;
                        wpwVar2.J$0 = j2;
                        wpwVar2.label = 2;
                        if (c(context3, list2, j2, yzsVar2, izsVar2, wpwVar2) == obj2) {
                            return obj2;
                        }
                    }
                    return s3q0.a;
                }
                j3 = wpwVar.J$0;
                izs izsVar3 = (izs) wpwVar.L$2;
                yzs yzsVar5 = (yzs) wpwVar.L$1;
                context2 = (Context) wpwVar.L$0;
                kotlin.a.a(obj);
                izsVar2 = izsVar3;
                yzsVar3 = yzsVar5;
                D0 = j5g.D0(new drt(1), (Iterable) obj);
                if (!D0.isEmpty()) {
                    xgx0.a.getClass();
                    xgx0.a("VkWorkoutImportActivitiesUseCase.execute() -> No difference with cache");
                    if (yzsVar3 != null) {
                        yzsVar3.invoke(new Integer(0), "No difference with cache", new Long(j3));
                    }
                    return s3q0.a;
                }
                xgx0 xgx0Var = xgx0.a;
                String str = "VkWorkoutImportActivitiesUseCase.execute() -> size: " + D0.size() + ", cacheDiff: " + D0;
                xgx0Var.getClass();
                xgx0.a(str);
                e = o19.e(D0);
                wpwVar2 = wpwVar;
                yzsVar2 = yzsVar3;
                Context context5 = context2;
                it = e.iterator();
                j2 = j3;
                context3 = context5;
                while (it.hasNext()) {
                }
                return s3q0.a;
            }
        }
        wpwVar = new wpw(this, continuationImpl);
        Object obj3 = wpwVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = wpwVar.label;
        if (i != 0) {
        }
        D0 = j5g.D0(new drt(1), (Iterable) obj3);
        if (!D0.isEmpty()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, boolean z, long j, yzs yzsVar, ContinuationImpl continuationImpl) {
        xpw xpwVar;
        int i;
        if (continuationImpl instanceof xpw) {
            xpwVar = (xpw) continuationImpl;
            int i2 = xpwVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xpwVar.label = i2 - Integer.MIN_VALUE;
                Object obj = xpwVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = xpwVar.label;
                int i3 = 0;
                if (i != 0) {
                    kotlin.a.a(obj);
                    xgx0.a.getClass();
                    xgx0.a("VkWorkoutImportActivitiesUseCase.execute() -> vkStart.importActivities returned " + z);
                    if (!z) {
                        if (yzsVar != null) {
                            yzsVar.invoke(new Integer(0), "importWorkouts returned false", new Long(j));
                        }
                        this.c.c();
                        return s3q0.a;
                    }
                    xpwVar.L$0 = list;
                    xpwVar.L$1 = yzsVar;
                    xpwVar.J$0 = j;
                    xpwVar.label = 1;
                    if (this.b.b(list, xpwVar) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = xpwVar.J$0;
                    yzsVar = (yzs) xpwVar.L$1;
                    list = (List) xpwVar.L$0;
                    kotlin.a.a(obj);
                }
                if (yzsVar != null) {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (((WorkoutData) it.next()).b() != null && (i3 = i3 + 1) < 0) {
                                e43.s();
                                throw null;
                            }
                        }
                    }
                    yzsVar.invoke(new Integer(i3), "Send workouts diff to the server", new Long(j));
                }
                this.c.c();
                return s3q0.a;
            }
        }
        xpwVar = new xpw(this, continuationImpl);
        Object obj2 = xpwVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = xpwVar.label;
        int i32 = 0;
        if (i != 0) {
        }
        if (yzsVar != null) {
        }
        this.c.c();
        return s3q0.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|(2:46|(4:(1:(1:50)(2:52|53))(2:54|55)|51|21|22)(2:56|57))(4:9|10|11|(2:42|24))|13|14|15|16|17|18|19))|60|6|7|(0)(0)|13|14|15|16|17|18|19|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
    
        if (b(r9, r10, r11, r13, r14) != r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
    
        r10 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
    
        r9 = r0;
        r8 = r2;
        r13 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ea, code lost:
    
        if (xsna.s3q0.a != r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a3, code lost:
    
        r10 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Context context, List list, long j, yzs yzsVar, izs izsVar, ContinuationImpl continuationImpl) {
        ypw ypwVar;
        int i;
        VKApiExecutionException vKApiExecutionException;
        zpw zpwVar;
        if (continuationImpl instanceof ypw) {
            ypwVar = (ypw) continuationImpl;
            int i2 = ypwVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ypwVar.label = i2 - Integer.MIN_VALUE;
                ypw ypwVar2 = ypwVar;
                Object obj = ypwVar2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ypwVar2.label;
                if (i == 0) {
                    try {
                    } catch (Throwable th) {
                        vKApiExecutionException = th;
                        zpwVar = this;
                        ypwVar2.L$0 = null;
                        ypwVar2.L$1 = null;
                        ypwVar2.L$2 = null;
                        ypwVar2.L$3 = null;
                        ypwVar2.label = 3;
                        if (vKApiExecutionException instanceof VKApiExecutionException) {
                            w2w0 w2w0Var = zpwVar.c;
                            w2w0Var.b(context);
                            w2w0Var.a();
                        }
                        xgx0 xgx0Var = xgx0.a;
                        String str = "VkWorkoutImportActivitiesUseCase.execute() -> Error while vkStart.importActivities: " + vKApiExecutionException.getMessage();
                        xgx0Var.getClass();
                        xgx0.b(str);
                        if (izsVar != null) {
                        }
                    }
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.a.a(obj);
                        } else {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a.a(obj);
                        }
                        return s3q0.a;
                    }
                    j = ypwVar2.J$0;
                    izsVar = (izs) ypwVar2.L$3;
                    yzsVar = (yzs) ypwVar2.L$2;
                    list = (List) ypwVar2.L$1;
                    context = (Context) ypwVar2.L$0;
                    kotlin.a.a(obj);
                } else {
                    kotlin.a.a(obj);
                    try {
                        m2w0 m2w0Var = this.a;
                        ypwVar2.L$0 = context;
                        ypwVar2.L$1 = list;
                        ypwVar2.L$2 = yzsVar;
                        ypwVar2.L$3 = izsVar;
                        ypwVar2.J$0 = j;
                        ypwVar2.label = 1;
                        obj = m2w0Var.c(list, ypwVar2);
                    } catch (Throwable th2) {
                        zpwVar = this;
                        vKApiExecutionException = th2;
                        ypwVar2.L$0 = null;
                        ypwVar2.L$1 = null;
                        ypwVar2.L$2 = null;
                        ypwVar2.L$3 = null;
                        ypwVar2.label = 3;
                        if ((vKApiExecutionException instanceof VKApiExecutionException) && vKApiExecutionException.s() == 7800) {
                            w2w0 w2w0Var2 = zpwVar.c;
                            w2w0Var2.b(context);
                            w2w0Var2.a();
                        }
                        xgx0 xgx0Var2 = xgx0.a;
                        String str2 = "VkWorkoutImportActivitiesUseCase.execute() -> Error while vkStart.importActivities: " + vKApiExecutionException.getMessage();
                        xgx0Var2.getClass();
                        xgx0.b(str2);
                        if (izsVar != null) {
                            izsVar.invoke(vKApiExecutionException);
                        }
                    }
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                Context context2 = context;
                izs izsVar2 = izsVar;
                yzs yzsVar2 = yzsVar;
                long j2 = j;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ypwVar2.L$0 = context2;
                ypwVar2.L$1 = izsVar2;
                ypwVar2.L$2 = null;
                ypwVar2.L$3 = null;
                ypwVar2.label = 2;
            }
        }
        ypwVar = new ypw(this, continuationImpl);
        ypw ypwVar22 = ypwVar;
        Object obj2 = ypwVar22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ypwVar22.label;
        if (i == 0) {
        }
        Context context22 = context;
        izs izsVar22 = izsVar;
        yzs yzsVar22 = yzsVar;
        long j22 = j;
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        ypwVar22.L$0 = context22;
        ypwVar22.L$1 = izsVar22;
        ypwVar22.L$2 = null;
        ypwVar22.L$3 = null;
        ypwVar22.label = 2;
    }
}
