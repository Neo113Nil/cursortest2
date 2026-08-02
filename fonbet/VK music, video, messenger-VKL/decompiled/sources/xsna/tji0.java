package xsna;

import android.content.Context;
import android.text.format.DateUtils;
import com.unity3d.services.UnityAdsConstants;
import com.vk.stat.scheme.SchemeStat$TypeVkRunItem;
import com.vk.stat.scheme.SchemeStat$VkRunSyncStepsItem;
import com.vk.superapp.bridges.dto.analytics.HealthDataProvider;
import com.vk.superapp.bridges.dto.analytics.HealthSyncState;
import com.vk.superapp.vksteps.VkStepsSyncReason;
import com.vk.superapp.vksteps.utils.enums.VkStepsStoreSyncReason;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: SendVkStepsUseCase.kt */
/* loaded from: classes11.dex */
public final class tji0 {
    public final umv0 a;
    public final xmv0 b;

    /* compiled from: SendVkStepsUseCase.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public final Context a;
        public final List<m0l0> b;
        public final List<m0l0> c;
        public final VkStepsSyncReason d;
        public final VkStepsStoreSyncReason e;
        public final HealthDataProvider f;
        public final long g;
        public final long h;
        public final long i;
        public final boolean j;
        public final Set<w0l0> k;
        public final gzs<s3q0> l;
        public final izs<Exception, s3q0> m;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Context context, List<m0l0> list, List<m0l0> list2, VkStepsSyncReason vkStepsSyncReason, VkStepsStoreSyncReason vkStepsStoreSyncReason, HealthDataProvider healthDataProvider, long j, long j2, long j3, boolean z, Set<? extends w0l0> set, gzs<s3q0> gzsVar, izs<? super Exception, s3q0> izsVar) {
            this.a = context;
            this.b = list;
            this.c = list2;
            this.d = vkStepsSyncReason;
            this.e = vkStepsStoreSyncReason;
            this.f = healthDataProvider;
            this.g = j;
            this.h = j2;
            this.i = j3;
            this.j = z;
            this.k = set;
            this.l = gzsVar;
            this.m = izsVar;
        }

        public final Context a() {
            return this.a;
        }

        public final List<m0l0> b() {
            return this.c;
        }

        public final long c() {
            return this.h;
        }

        public final HealthDataProvider d() {
            return this.f;
        }

        public final izs<Exception, s3q0> e() {
            return this.m;
        }

        public final gzs<s3q0> f() {
            return this.l;
        }

        public final long g() {
            return this.i;
        }

        public final long h() {
            return this.g;
        }

        public final List<m0l0> i() {
            return this.b;
        }

        public final Set<w0l0> j() {
            return this.k;
        }

        public final VkStepsStoreSyncReason k() {
            return this.e;
        }

        public final VkStepsSyncReason l() {
            return this.d;
        }

        public final boolean m() {
            return this.j;
        }
    }

    public tji0(umv0 umv0Var, xmv0 xmv0Var) {
        this.a = umv0Var;
        this.b = xmv0Var;
    }

    public static void b(a aVar, Exception exc, String str) {
        amv0.a(aVar.a(), HealthSyncState.API_SYNC_ERROR, aVar.l(), aVar.d(), cqi.b(exc, ho8.b(str, " error: ")), aVar.b().size(), aVar.g());
        xgx0 xgx0Var = xgx0.a;
        StringBuilder a2 = t33.a("SendVkStepsUseCase.", str, "() -> Steps was not sent to the server, thread: ");
        a2.append(Thread.currentThread().getName());
        String sb = a2.toString();
        xgx0Var.getClass();
        xgx0.c(sb, exc);
        izs<Exception, s3q0> e = aVar.e();
        if (e != null) {
            e.invoke(exc);
        }
    }

    public final Object a(a aVar, ContinuationImpl continuationImpl) {
        Object obj;
        xgx0 xgx0Var = xgx0.a;
        String str = "SendVkStepsUseCase.execute() -> payload: " + aVar + ", thread: " + Thread.currentThread().getName();
        xgx0Var.getClass();
        xgx0.a(str);
        Iterator<T> it = aVar.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (DateUtils.isToday(((m0l0) obj).g())) {
                break;
            }
        }
        m0l0 m0l0Var = (m0l0) obj;
        boolean m = aVar.m();
        List<m0l0> b = aVar.b();
        long g = aVar.g();
        boolean z = true;
        if (!m && g > 0 && !b.isEmpty()) {
            hhv0 hhv0Var = new hhv0((int) (System.currentTimeMillis() - g), b.size());
            udx0 udx0Var = e370.i;
            (udx0Var != null ? udx0Var : null).getClass();
            new dhv0(new SchemeStat$TypeVkRunItem(null, new SchemeStat$VkRunSyncStepsItem(hhv0Var.b(), hhv0Var.a(), true), vhk0.f(), 1, null)).q();
        }
        boolean z2 = aVar.b().size() == 1 && m0l0Var != null && DateUtils.isToday(((m0l0) j5g.Y(aVar.b())).g());
        if (!aVar.b().isEmpty()) {
            List<m0l0> b2 = aVar.b();
            if (!(b2 instanceof Collection) || !b2.isEmpty()) {
                for (m0l0 m0l0Var2 : b2) {
                    if (m0l0Var2.c() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || m0l0Var2.f() > 0) {
                        break;
                    }
                }
            }
        }
        z = false;
        if (z2) {
            Object e = e(aVar, m0l0Var, continuationImpl);
            return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : s3q0.a;
        }
        if (z) {
            Object d = d(aVar, continuationImpl);
            return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : s3q0.a;
        }
        Object c = c(aVar, continuationImpl);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ff A[LOOP:0: B:11:0x00f9->B:13:0x00ff, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(a aVar, ContinuationImpl continuationImpl) {
        uji0 uji0Var;
        int i;
        a aVar2;
        StringBuilder sb;
        if (continuationImpl instanceof uji0) {
            uji0Var = (uji0) continuationImpl;
            int i2 = uji0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uji0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = uji0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = uji0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SendVkStepsUseCase.logNoDataChanges() -> Steps was not sent to the server, steps = ");
                    sb2.append(aVar.i());
                    sb2.append(", cachedSteps = ");
                    uji0Var.L$0 = aVar;
                    uji0Var.L$1 = sb2;
                    uji0Var.label = 1;
                    Object b = this.b.b(uji0Var);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar2 = aVar;
                    sb = sb2;
                    obj = b;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sb = (StringBuilder) uji0Var.L$1;
                    aVar2 = (a) uji0Var.L$0;
                    kotlin.a.a(obj);
                }
                sb.append(obj);
                sb.append("syncReason = ");
                sb.append(aVar2.l());
                sb.append(", startTimestamp = ");
                sb.append(aVar2.h());
                sb.append(", endTimestamp = ");
                sb.append(aVar2.c());
                sb.append(", storeSyncReason = ");
                sb.append(aVar2.k());
                sb.append(", differencesWithCache = ");
                sb.append(aVar2.b());
                sb.append(", isTriggeredByEvent = ");
                sb.append(aVar2.m());
                String sb3 = sb.toString();
                xgx0 xgx0Var = xgx0.a;
                StringBuilder b2 = ho8.b(sb3, ", thread: ");
                b2.append(Thread.currentThread().getName());
                String sb4 = b2.toString();
                xgx0Var.getClass();
                xgx0.a(sb4);
                Context a2 = aVar2.a();
                HealthSyncState healthSyncState = HealthSyncState.NO_DATA_CHANGES;
                VkStepsSyncReason l = aVar2.l();
                HealthDataProvider d = aVar2.d();
                StringBuilder sb5 = new StringBuilder("steps = ");
                List<m0l0> i3 = aVar2.i();
                ArrayList arrayList = new ArrayList(c5g.u(i3, 10));
                for (m0l0 m0l0Var : i3) {
                    arrayList.add("distanceKm = " + m0l0Var.c() + ", steps = " + m0l0Var.f() + ", timestamp = " + m0l0Var.g());
                }
                sb5.append(arrayList);
                amv0.a(a2, healthSyncState, l, d, sb5.toString(), 0, aVar2.g());
                return s3q0.a;
            }
        }
        uji0Var = new uji0(this, continuationImpl);
        Object obj2 = uji0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = uji0Var.label;
        if (i != 0) {
        }
        sb.append(obj2);
        sb.append("syncReason = ");
        sb.append(aVar2.l());
        sb.append(", startTimestamp = ");
        sb.append(aVar2.h());
        sb.append(", endTimestamp = ");
        sb.append(aVar2.c());
        sb.append(", storeSyncReason = ");
        sb.append(aVar2.k());
        sb.append(", differencesWithCache = ");
        sb.append(aVar2.b());
        sb.append(", isTriggeredByEvent = ");
        sb.append(aVar2.m());
        String sb32 = sb.toString();
        xgx0 xgx0Var2 = xgx0.a;
        StringBuilder b22 = ho8.b(sb32, ", thread: ");
        b22.append(Thread.currentThread().getName());
        String sb42 = b22.toString();
        xgx0Var2.getClass();
        xgx0.a(sb42);
        Context a22 = aVar2.a();
        HealthSyncState healthSyncState2 = HealthSyncState.NO_DATA_CHANGES;
        VkStepsSyncReason l2 = aVar2.l();
        HealthDataProvider d2 = aVar2.d();
        StringBuilder sb52 = new StringBuilder("steps = ");
        List<m0l0> i32 = aVar2.i();
        ArrayList arrayList2 = new ArrayList(c5g.u(i32, 10));
        while (r13.hasNext()) {
        }
        sb52.append(arrayList2);
        amv0.a(a22, healthSyncState2, l2, d2, sb52.toString(), 0, aVar2.g());
        return s3q0.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(6:11|12|13|(1:15)|17|18)(2:20|21))(2:22|23))(3:32|33|(2:35|31))|24|(2:27|25)|28|29))|39|6|7|(0)(0)|24|(1:25)|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
    
        if (r15.d(r0, r3, r1) != r2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0031, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
    
        b(r14, r0, "vkRun.import");
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083 A[Catch: Exception -> 0x0031, LOOP:0: B:25:0x007d->B:27:0x0083, LOOP_END, TryCatch #0 {Exception -> 0x0031, blocks: (B:12:0x002c, B:13:0x00c0, B:15:0x00c6, B:23:0x0041, B:24:0x005d, B:25:0x007d, B:27:0x0083, B:29:0x008d, B:33:0x0048), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(a aVar, ContinuationImpl continuationImpl) {
        vji0 vji0Var;
        int i;
        Iterator<T> it;
        if (continuationImpl instanceof vji0) {
            vji0Var = (vji0) continuationImpl;
            int i2 = vji0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vji0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = vji0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = vji0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    umv0 umv0Var = this.a;
                    List<m0l0> b = aVar.b();
                    VkStepsSyncReason l = aVar.l();
                    vji0Var.L$0 = aVar;
                    vji0Var.label = 1;
                    obj = umv0Var.d(b, l, vji0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (a) vji0Var.L$0;
                        kotlin.a.a(obj);
                        gzs<s3q0> f = aVar.f();
                        if (f != null) {
                            f.invoke();
                        }
                        return s3q0.a;
                    }
                    aVar = (a) vji0Var.L$0;
                    kotlin.a.a(obj);
                }
                List<m0l0> list = (List) obj;
                xgx0.a.getClass();
                xgx0.a("SendVkStepsUseCase.processSetSteps() -> vkRun.import success, response: " + list);
                it = aVar.j().iterator();
                while (it.hasNext()) {
                    ((w0l0) it.next()).p0(list);
                }
                amv0.a(aVar.a(), HealthSyncState.SUCCESS, aVar.l(), aVar.d(), null, aVar.b().size(), aVar.g());
                xmv0 xmv0Var = this.b;
                VkStepsStoreSyncReason k = aVar.k();
                List<m0l0> b2 = aVar.b();
                vji0Var.L$0 = aVar;
                vji0Var.label = 2;
            }
        }
        vji0Var = new vji0(this, continuationImpl);
        Object obj2 = vji0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vji0Var.label;
        if (i != 0) {
        }
        List<m0l0> list2 = (List) obj2;
        xgx0.a.getClass();
        xgx0.a("SendVkStepsUseCase.processSetSteps() -> vkRun.import success, response: " + list2);
        it = aVar.j().iterator();
        while (it.hasNext()) {
        }
        amv0.a(aVar.a(), HealthSyncState.SUCCESS, aVar.l(), aVar.d(), null, aVar.b().size(), aVar.g());
        xmv0 xmv0Var2 = this.b;
        VkStepsStoreSyncReason k2 = aVar.k();
        List<m0l0> b22 = aVar.b();
        vji0Var.L$0 = aVar;
        vji0Var.label = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e2 A[Catch: Exception -> 0x0038, TRY_LEAVE, TryCatch #2 {Exception -> 0x0038, blocks: (B:12:0x0033, B:13:0x00dc, B:15:0x00e2), top: B:11:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2 A[Catch: Exception -> 0x0050, LOOP:0: B:29:0x009c->B:31:0x00a2, LOOP_END, TryCatch #0 {Exception -> 0x0050, blocks: (B:27:0x004c, B:28:0x006c, B:29:0x009c, B:31:0x00a2, B:33:0x00ac), top: B:26:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(a aVar, m0l0 m0l0Var, ContinuationImpl continuationImpl) {
        wji0 wji0Var;
        CoroutineSingletons coroutineSingletons;
        int i;
        a aVar2;
        a aVar3;
        umv0 umv0Var;
        VkStepsSyncReason l;
        Iterator<T> it;
        xmv0 xmv0Var;
        VkStepsStoreSyncReason k;
        List singletonList;
        a aVar4;
        gzs<s3q0> f;
        m0l0 m0l0Var2 = m0l0Var;
        if (continuationImpl instanceof wji0) {
            wji0Var = (wji0) continuationImpl;
            int i2 = wji0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wji0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = wji0Var.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = wji0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    try {
                        umv0Var = this.a;
                        l = aVar.l();
                        aVar2 = aVar;
                    } catch (Exception e) {
                        e = e;
                        aVar2 = aVar;
                    }
                    try {
                        wji0Var.L$0 = aVar2;
                        wji0Var.L$1 = m0l0Var2;
                        wji0Var.label = 1;
                        obj = umv0Var.f(m0l0Var2, l, wji0Var);
                        if (obj != coroutineSingletons) {
                            aVar3 = aVar2;
                        }
                        return coroutineSingletons;
                    } catch (Exception e2) {
                        e = e2;
                        aVar3 = aVar2;
                        b(aVar3, e, "vkRun.setSteps");
                        return s3q0.a;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar4 = (a) wji0Var.L$0;
                    try {
                        kotlin.a.a(obj);
                        f = aVar4.f();
                        if (f != null) {
                            f.invoke();
                        }
                    } catch (Exception e3) {
                        e = e3;
                        aVar3 = aVar4;
                        b(aVar3, e, "vkRun.setSteps");
                        return s3q0.a;
                    }
                    return s3q0.a;
                }
                m0l0Var2 = (m0l0) wji0Var.L$1;
                aVar3 = (a) wji0Var.L$0;
                try {
                    kotlin.a.a(obj);
                } catch (Exception e4) {
                    e = e4;
                    b(aVar3, e, "vkRun.setSteps");
                    return s3q0.a;
                }
                List<m0l0> list = (List) obj;
                xgx0 xgx0Var = xgx0.a;
                String str = "SendVkStepsUseCase.processSetSteps() -> vkRun.setSteps success, response: " + list + ", thread: " + Thread.currentThread().getName();
                xgx0Var.getClass();
                xgx0.a(str);
                it = aVar3.j().iterator();
                while (it.hasNext()) {
                    ((w0l0) it.next()).p0(list);
                }
                amv0.a(aVar3.a(), HealthSyncState.SUCCESS, aVar3.l(), aVar3.d(), null, 1, aVar3.g());
                xmv0Var = this.b;
                k = aVar3.k();
                singletonList = Collections.singletonList(m0l0Var2);
                wji0Var.L$0 = aVar3;
                wji0Var.L$1 = null;
                wji0Var.label = 2;
                if (xmv0Var.d(k, singletonList, wji0Var) != coroutineSingletons) {
                    aVar4 = aVar3;
                    f = aVar4.f();
                    if (f != null) {
                    }
                    return s3q0.a;
                }
                return coroutineSingletons;
            }
        }
        wji0Var = new wji0(this, continuationImpl);
        Object obj2 = wji0Var.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = wji0Var.label;
        if (i != 0) {
        }
        List<m0l0> list2 = (List) obj2;
        xgx0 xgx0Var2 = xgx0.a;
        String str2 = "SendVkStepsUseCase.processSetSteps() -> vkRun.setSteps success, response: " + list2 + ", thread: " + Thread.currentThread().getName();
        xgx0Var2.getClass();
        xgx0.a(str2);
        it = aVar3.j().iterator();
        while (it.hasNext()) {
        }
        amv0.a(aVar3.a(), HealthSyncState.SUCCESS, aVar3.l(), aVar3.d(), null, 1, aVar3.g());
        xmv0Var = this.b;
        k = aVar3.k();
        singletonList = Collections.singletonList(m0l0Var2);
        wji0Var.L$0 = aVar3;
        wji0Var.L$1 = null;
        wji0Var.label = 2;
        if (xmv0Var.d(k, singletonList, wji0Var) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
