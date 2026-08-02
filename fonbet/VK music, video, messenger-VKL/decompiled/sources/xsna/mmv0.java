package xsna;

import android.content.Context;
import com.vk.superapp.bridges.dto.analytics.HealthDataProvider;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import com.vk.superapp.vksteps.VkStepsSyncReason;
import com.vk.superapp.vksteps.domain.GoogleServicesDataSource;
import com.vk.superapp.vksteps.utils.enums.VkStepsStoreSyncReason;
import java.time.ZonedDateTime;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkStepsManagerImpl.kt */
@b6l(c = "com.vk.superapp.vksteps.VkStepsManagerImpl$startSyncFromEvents$1", f = "VkStepsManagerImpl.kt", l = {257, 264, 268, 277}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class mmv0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ GoogleServicesDataSource $googleServicesDataSource;
    final /* synthetic */ e9q0 $payload;
    long J$0;
    long J$1;
    Object L$0;
    int label;
    final /* synthetic */ imv0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmv0(GoogleServicesDataSource googleServicesDataSource, spj spjVar, e9q0 e9q0Var, imv0 imv0Var) {
        super(2, spjVar);
        this.$payload = e9q0Var;
        this.this$0 = imv0Var;
        this.$googleServicesDataSource = googleServicesDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new mmv0(this.$googleServicesDataSource, spjVar, this.$payload, this.this$0);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((mmv0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x014a, code lost:
    
        if (xsna.imv0.l(r0, r3, r2, r1, r4, r12, r8, r6, r10, r11, r7, true, r14) != r15) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x015e, code lost:
    
        if (xsna.imv0.k(r1, r0, r2, r3, r14) != r15) goto L55;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long longValue;
        Object a;
        long j;
        Object a2;
        List<m0l0> list;
        long j2;
        mmv0 mmv0Var = this;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = mmv0Var.label;
        try {
        } catch (Exception e) {
            e = e;
        }
        if (i == 0) {
            kotlin.a.a(obj);
            qvo0.a.getClass();
            long d = qvo0.d();
            Long l = mmv0Var.$payload.c;
            if (l != null) {
                d = l.longValue();
            }
            long j3 = d;
            Long l2 = mmv0Var.$payload.d;
            longValue = l2 != null ? l2.longValue() : System.currentTimeMillis();
            twt twtVar = mmv0Var.this$0.i;
            e9q0 e9q0Var = mmv0Var.$payload;
            ZonedDateTime E = edi.E(j3);
            ZonedDateTime E2 = edi.E(longValue);
            GoogleServicesDataSource googleServicesDataSource = mmv0Var.$googleServicesDataSource;
            mmv0Var.J$0 = j3;
            mmv0Var.J$1 = longValue;
            mmv0Var.label = 1;
            try {
                a = twtVar.a(e9q0Var, E, E2, googleServicesDataSource, mmv0Var);
                mmv0Var = mmv0Var;
                if (a != coroutineSingletons) {
                    j = j3;
                }
            } catch (Exception e2) {
                e = e2;
                mmv0Var = mmv0Var;
                imv0 imv0Var = mmv0Var.this$0;
                e9q0 e9q0Var2 = mmv0Var.$payload;
                GoogleServicesDataSource googleServicesDataSource2 = mmv0Var.$googleServicesDataSource;
                mmv0Var.label = 2;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            long j4 = mmv0Var.J$1;
            j = mmv0Var.J$0;
            kotlin.a.a(obj);
            longValue = j4;
            a = obj;
        } else {
            if (i == 2) {
                kotlin.a.a(obj);
                return s3q0.a;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            long j5 = mmv0Var.J$1;
            long j6 = mmv0Var.J$0;
            List<m0l0> list2 = (List) mmv0Var.L$0;
            kotlin.a.a(obj);
            list = list2;
            j2 = j6;
            longValue = j5;
            a2 = obj;
            List list3 = (List) a2;
            xgx0 xgx0Var = xgx0.a;
            StringBuilder sb = new StringBuilder("VkStepManagerImpl.startSyncFromEvents() -> data: ");
            sb.append(j5g.k0(list));
            sb.append(", dataSource: ");
            sb.append(mmv0Var.$payload.h);
            sb.append(", fromTime: ");
            qvo0 qvo0Var = qvo0.a;
            sb.append(qvo0.k(qvo0Var, j2));
            sb.append(", toTime: ");
            sb.append(qvo0.k(qvo0Var, longValue));
            sb.append(", collectDataTime = ");
            sb.append(System.currentTimeMillis() - mmv0Var.this$0.p);
            String sb2 = sb.toString();
            xgx0Var.getClass();
            xgx0.a(sb2);
            imv0 imv0Var2 = mmv0Var.this$0;
            e9q0 e9q0Var3 = mmv0Var.$payload;
            Context context = e9q0Var3.a;
            VkStepsSyncReason vkStepsSyncReason = e9q0Var3.b;
            GoogleServicesDataSource googleServicesDataSource3 = mmv0Var.$googleServicesDataSource;
            imv0Var2.getClass();
            HealthDataProvider n = imv0.n(googleServicesDataSource3);
            VkStepsStoreSyncReason j7 = imv0.j(mmv0Var.this$0, j2, longValue);
            e9q0 e9q0Var4 = mmv0Var.$payload;
            gzs<s3q0> gzsVar = e9q0Var4.f;
            izs<Exception, s3q0> izsVar = e9q0Var4.e;
            mmv0Var.L$0 = null;
            mmv0Var.label = 4;
        }
        List<m0l0> list4 = (List) a;
        izs<List<m0l0>, s3q0> izsVar2 = mmv0Var.$payload.g;
        if (izsVar2 != null) {
            izsVar2.invoke(list4);
        }
        qwt qwtVar = mmv0Var.this$0.c;
        boolean z = mmv0Var.$payload.h != SelectedDataSource.HEALTH_CONNECT;
        mmv0Var.L$0 = list4;
        mmv0Var.J$0 = j;
        mmv0Var.J$1 = longValue;
        mmv0Var.label = 3;
        a2 = qwtVar.a(list4, true, z, mmv0Var);
        if (a2 != coroutineSingletons) {
            long j8 = j;
            list = list4;
            j2 = j8;
            List list32 = (List) a2;
            xgx0 xgx0Var2 = xgx0.a;
            StringBuilder sb3 = new StringBuilder("VkStepManagerImpl.startSyncFromEvents() -> data: ");
            sb3.append(j5g.k0(list));
            sb3.append(", dataSource: ");
            sb3.append(mmv0Var.$payload.h);
            sb3.append(", fromTime: ");
            qvo0 qvo0Var2 = qvo0.a;
            sb3.append(qvo0.k(qvo0Var2, j2));
            sb3.append(", toTime: ");
            sb3.append(qvo0.k(qvo0Var2, longValue));
            sb3.append(", collectDataTime = ");
            sb3.append(System.currentTimeMillis() - mmv0Var.this$0.p);
            String sb22 = sb3.toString();
            xgx0Var2.getClass();
            xgx0.a(sb22);
            imv0 imv0Var22 = mmv0Var.this$0;
            e9q0 e9q0Var32 = mmv0Var.$payload;
            Context context2 = e9q0Var32.a;
            VkStepsSyncReason vkStepsSyncReason2 = e9q0Var32.b;
            GoogleServicesDataSource googleServicesDataSource32 = mmv0Var.$googleServicesDataSource;
            imv0Var22.getClass();
            HealthDataProvider n2 = imv0.n(googleServicesDataSource32);
            VkStepsStoreSyncReason j72 = imv0.j(mmv0Var.this$0, j2, longValue);
            e9q0 e9q0Var42 = mmv0Var.$payload;
            gzs<s3q0> gzsVar2 = e9q0Var42.f;
            izs<Exception, s3q0> izsVar3 = e9q0Var42.e;
            mmv0Var.L$0 = null;
            mmv0Var.label = 4;
        }
        return coroutineSingletons;
    }
}
