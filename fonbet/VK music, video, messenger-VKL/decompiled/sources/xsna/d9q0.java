package xsna;

import android.content.Context;
import android.text.format.DateUtils;
import com.vk.superapp.bridges.dto.analytics.HealthDataProvider;
import com.vk.superapp.bridges.dto.analytics.HealthSyncState;
import com.vk.superapp.vksteps.VkStepsReadInterval;
import com.vk.superapp.vksteps.VkStepsSyncReason;
import com.vk.superapp.vksteps.utils.enums.VkStepsStoreSyncReason;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.tji0;

/* compiled from: UpdateStepsFromHuaweiUseCase.kt */
/* loaded from: classes11.dex */
public final class d9q0 {
    public final umv0 a;
    public final tji0 b;
    public final qwt c;
    public final env0 d;
    public Set<? extends w0l0> e = EmptySet.b;
    public VkStepsStoreSyncReason f = VkStepsStoreSyncReason.SKIP;
    public boolean g;
    public long h;
    public long i;
    public long j;

    public d9q0(umv0 umv0Var, tji0 tji0Var, qwt qwtVar, env0 env0Var) {
        this.a = umv0Var;
        this.b = tji0Var;
        this.c = qwtVar;
        this.d = env0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:0|1|(2:3|(21:5|6|7|(1:(5:(1:(1:(5:13|14|15|16|17)(2:24|25))(7:26|27|28|29|30|(1:32)|33))(9:42|43|44|45|46|(2:48|35)|30|(0)|33)|21|(1:23)|16|17)(1:52))(3:80|(1:82)|35)|53|(1:55)(1:79)|56|(1:58)(1:78)|59|(1:63)|64|(2:74|(1:76)(1:77))(1:68)|69|70|71|(2:73|35)|46|(0)|30|(0)|33))|83|6|7|(0)(0)|53|(0)(0)|56|(0)(0)|59|(2:61|63)|64|(1:66)|74|(0)(0)|69|70|71|(0)|46|(0)|30|(0)|33) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x017b, code lost:
    
        if (b(r15, r3, r0, r10) != r2) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x016e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x016f, code lost:
    
        r2 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016a A[Catch: Exception -> 0x016e, TryCatch #0 {Exception -> 0x016e, blocks: (B:30:0x0162, B:32:0x016a, B:33:0x0171, B:46:0x0145, B:71:0x0121), top: B:70:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(e9q0 e9q0Var, Set set, ContinuationImpl continuationImpl) {
        c9q0 c9q0Var;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        Set set2;
        e9q0 e9q0Var2;
        env0 env0Var;
        Long g;
        boolean z;
        long timeInMillis;
        List<m0l0> b;
        e9q0 e9q0Var3;
        izs<List<m0l0>, s3q0> d;
        if (continuationImpl instanceof c9q0) {
            c9q0Var = (c9q0) continuationImpl;
            int i2 = c9q0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c9q0Var.label = i2 - Integer.MIN_VALUE;
                c9q0 c9q0Var2 = c9q0Var;
                obj = c9q0Var2.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c9q0Var2.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    mlv mlvVar = mlv.a;
                    c9q0Var2.L$0 = e9q0Var;
                    set2 = set;
                    c9q0Var2.L$1 = set2;
                    env0 env0Var2 = this.d;
                    c9q0Var2.L$2 = env0Var2;
                    c9q0Var2.label = 1;
                    mlvVar.getClass();
                    obj = mlv.a(c9q0Var2);
                    if (obj != coroutineSingletons) {
                        e9q0Var2 = e9q0Var;
                        env0Var = env0Var2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        e9q0 e9q0Var4 = (e9q0) c9q0Var2.L$0;
                        try {
                            kotlin.a.a(obj);
                            e9q0Var2 = e9q0Var4;
                            int i3 = u0l0.b;
                            b = u0l0.b((List) obj, VkStepsReadInterval.DAY.h());
                            qwt qwtVar = this.c;
                            c9q0Var2.L$0 = e9q0Var2;
                            c9q0Var2.L$1 = b;
                            c9q0Var2.label = 3;
                            obj = qwtVar.a(b, true, true, c9q0Var2);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            List list = (List) obj;
                            d = e9q0Var2.d();
                            if (d != null) {
                            }
                            c9q0Var2.L$0 = e9q0Var2;
                            c9q0Var2.L$1 = null;
                            c9q0Var2.label = 4;
                        } catch (Exception e) {
                            e = e;
                            e9q0Var3 = e9q0Var4;
                        }
                    } else {
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            e9q0Var3 = (e9q0) c9q0Var2.L$0;
                            try {
                                kotlin.a.a(obj);
                            } catch (Exception e2) {
                                e = e2;
                            }
                            return s3q0.a;
                        }
                        b = (List) c9q0Var2.L$1;
                        e9q0 e9q0Var5 = (e9q0) c9q0Var2.L$0;
                        try {
                            kotlin.a.a(obj);
                            e9q0Var2 = e9q0Var5;
                            List list2 = (List) obj;
                            d = e9q0Var2.d();
                            if (d != null) {
                                d.invoke(b);
                            }
                            c9q0Var2.L$0 = e9q0Var2;
                            c9q0Var2.L$1 = null;
                            c9q0Var2.label = 4;
                        } catch (Exception e3) {
                            e = e3;
                            e9q0Var3 = e9q0Var5;
                        }
                    }
                    amv0.a(e9q0Var3.a(), HealthSyncState.HEALTH_PROVIDER_ERROR, e9q0Var3.h(), HealthDataProvider.HUAWEI_HEALTH, e.getMessage(), 0, this.j);
                    izs<Exception, s3q0> c = e9q0Var3.c();
                    if (c != null) {
                        c.invoke(e);
                    }
                    return s3q0.a;
                }
                env0Var = (env0) c9q0Var2.L$2;
                set2 = (Set) c9q0Var2.L$1;
                e9q0 e9q0Var6 = (e9q0) c9q0Var2.L$0;
                kotlin.a.a(obj);
                e9q0Var2 = e9q0Var6;
                env0Var.b((String) obj);
                this.e = set2;
                g = e9q0Var2.g();
                z = false;
                if (g == null) {
                    timeInMillis = g.longValue();
                } else {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(new Date());
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    calendar.add(5, -30);
                    timeInMillis = calendar.getTimeInMillis();
                }
                this.h = timeInMillis;
                Long b2 = e9q0Var2.b();
                this.i = b2 == null ? b2.longValue() : System.currentTimeMillis();
                if (e9q0Var2.b() != null && e9q0Var2.g() != null) {
                    z = true;
                }
                this.g = z;
                VkStepsStoreSyncReason.a aVar = VkStepsStoreSyncReason.Companion;
                long j = this.h;
                long j2 = this.i;
                aVar.getClass();
                qvo0.a.getClass();
                long d2 = qvo0.d();
                this.f = (DateUtils.isToday(j2) || j != d2) ? j < d2 ? VkStepsStoreSyncReason.UPDATE : VkStepsStoreSyncReason.SKIP : VkStepsStoreSyncReason.SAVE;
                this.j = System.currentTimeMillis();
                umv0 umv0Var = this.a;
                Context a = e9q0Var2.a();
                long j3 = this.h;
                long j4 = this.i;
                VkStepsSyncReason h = e9q0Var2.h();
                c9q0Var2.L$0 = e9q0Var2;
                c9q0Var2.L$1 = null;
                c9q0Var2.L$2 = null;
                c9q0Var2.label = 2;
                obj = umv0Var.c(a, j3, j4, h, c9q0Var2);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                int i32 = u0l0.b;
                b = u0l0.b((List) obj, VkStepsReadInterval.DAY.h());
                qwt qwtVar2 = this.c;
                c9q0Var2.L$0 = e9q0Var2;
                c9q0Var2.L$1 = b;
                c9q0Var2.label = 3;
                obj = qwtVar2.a(b, true, true, c9q0Var2);
                if (obj == coroutineSingletons) {
                }
                List list22 = (List) obj;
                d = e9q0Var2.d();
                if (d != null) {
                }
                c9q0Var2.L$0 = e9q0Var2;
                c9q0Var2.L$1 = null;
                c9q0Var2.label = 4;
            }
        }
        c9q0Var = new c9q0(this, continuationImpl);
        c9q0 c9q0Var22 = c9q0Var;
        obj = c9q0Var22.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c9q0Var22.label;
        if (i != 0) {
        }
        env0Var.b((String) obj);
        this.e = set2;
        g = e9q0Var2.g();
        z = false;
        if (g == null) {
        }
        this.h = timeInMillis;
        Long b22 = e9q0Var2.b();
        this.i = b22 == null ? b22.longValue() : System.currentTimeMillis();
        if (e9q0Var2.b() != null) {
            z = true;
        }
        this.g = z;
        VkStepsStoreSyncReason.a aVar2 = VkStepsStoreSyncReason.Companion;
        long j5 = this.h;
        long j22 = this.i;
        aVar2.getClass();
        qvo0.a.getClass();
        long d22 = qvo0.d();
        this.f = (DateUtils.isToday(j22) || j5 != d22) ? j5 < d22 ? VkStepsStoreSyncReason.UPDATE : VkStepsStoreSyncReason.SKIP : VkStepsStoreSyncReason.SAVE;
        this.j = System.currentTimeMillis();
        umv0 umv0Var2 = this.a;
        Context a2 = e9q0Var2.a();
        long j32 = this.h;
        long j42 = this.i;
        VkStepsSyncReason h2 = e9q0Var2.h();
        c9q0Var22.L$0 = e9q0Var2;
        c9q0Var22.L$1 = null;
        c9q0Var22.L$2 = null;
        c9q0Var22.label = 2;
        obj = umv0Var2.c(a2, j32, j42, h2, c9q0Var22);
        if (obj == coroutineSingletons) {
        }
        int i322 = u0l0.b;
        b = u0l0.b((List) obj, VkStepsReadInterval.DAY.h());
        qwt qwtVar22 = this.c;
        c9q0Var22.L$0 = e9q0Var2;
        c9q0Var22.L$1 = b;
        c9q0Var22.label = 3;
        obj = qwtVar22.a(b, true, true, c9q0Var22);
        if (obj == coroutineSingletons) {
        }
        List list222 = (List) obj;
        d = e9q0Var2.d();
        if (d != null) {
        }
        c9q0Var22.L$0 = e9q0Var2;
        c9q0Var22.L$1 = null;
        c9q0Var22.label = 4;
    }

    public final Object b(e9q0 e9q0Var, List list, List list2, c9q0 c9q0Var) {
        Object a = this.b.a(new tji0.a(e9q0Var.a(), list, list2, e9q0Var.h(), this.f, HealthDataProvider.HUAWEI_HEALTH, this.h, this.i, this.j, this.g, this.e, e9q0Var.e(), e9q0Var.c()), c9q0Var);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : s3q0.a;
    }
}
