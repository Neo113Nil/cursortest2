package xsna;

import android.content.Context;
import com.vk.superapp.bridges.dto.analytics.HealthDataProvider;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import com.vk.superapp.vksteps.VkStepsSyncReason;
import com.vk.superapp.vksteps.domain.GoogleServicesDataSource;
import com.vk.superapp.vksteps.utils.enums.VkStepsStoreSyncReason;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkStepsManagerImpl.kt */
@b6l(c = "com.vk.superapp.vksteps.VkStepsManagerImpl$startMonthlySync$1", f = "VkStepsManagerImpl.kt", l = {186, 193, 197, 198}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class kmv0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ GoogleServicesDataSource $googleServicesDataSource;
    final /* synthetic */ e9q0 $payload;
    long J$0;
    long J$1;
    Object L$0;
    int label;
    final /* synthetic */ imv0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmv0(GoogleServicesDataSource googleServicesDataSource, spj spjVar, e9q0 e9q0Var, imv0 imv0Var) {
        super(2, spjVar);
        this.this$0 = imv0Var;
        this.$payload = e9q0Var;
        this.$googleServicesDataSource = googleServicesDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        imv0 imv0Var = this.this$0;
        return new kmv0(this.$googleServicesDataSource, spjVar, this.$payload, imv0Var);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((kmv0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00df, code lost:
    
        if (xsna.imv0.l(r0, r3, r2, r1, r4, r12, r8, r9, r10, r11, r7, false, r14) != r15) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f3, code lost:
    
        if (xsna.imv0.k(r1, r0, r2, r3, r14) != r15) goto L48;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long currentTimeMillis;
        Object a;
        long j;
        Object a2;
        List<m0l0> list;
        long j2;
        kmv0 kmv0Var = this;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = kmv0Var.label;
        try {
        } catch (Exception e) {
            e = e;
        }
        if (i == 0) {
            kotlin.a.a(obj);
            qvo0.a.getClass();
            long d = qvo0.d();
            currentTimeMillis = System.currentTimeMillis();
            twt twtVar = kmv0Var.this$0.i;
            e9q0 e9q0Var = kmv0Var.$payload;
            ZonedDateTime E = edi.E(d);
            ZonedDateTime E2 = edi.E(currentTimeMillis);
            GoogleServicesDataSource googleServicesDataSource = kmv0Var.$googleServicesDataSource;
            kmv0Var.J$0 = d;
            kmv0Var.J$1 = currentTimeMillis;
            kmv0Var.label = 1;
            try {
                a = twtVar.a(e9q0Var, E, E2, googleServicesDataSource, kmv0Var);
                kmv0Var = kmv0Var;
                if (a != coroutineSingletons) {
                    j = d;
                }
            } catch (Exception e2) {
                e = e2;
                kmv0Var = kmv0Var;
                imv0 imv0Var = kmv0Var.this$0;
                e9q0 e9q0Var2 = kmv0Var.$payload;
                GoogleServicesDataSource googleServicesDataSource2 = kmv0Var.$googleServicesDataSource;
                kmv0Var.label = 2;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            long j3 = kmv0Var.J$1;
            j = kmv0Var.J$0;
            kotlin.a.a(obj);
            currentTimeMillis = j3;
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
            long j4 = kmv0Var.J$1;
            long j5 = kmv0Var.J$0;
            List<m0l0> list2 = (List) kmv0Var.L$0;
            kotlin.a.a(obj);
            list = list2;
            j2 = j5;
            currentTimeMillis = j4;
            a2 = obj;
            List list3 = (List) a2;
            imv0 imv0Var2 = kmv0Var.this$0;
            e9q0 e9q0Var3 = kmv0Var.$payload;
            Context context = e9q0Var3.a;
            VkStepsSyncReason vkStepsSyncReason = e9q0Var3.b;
            GoogleServicesDataSource googleServicesDataSource3 = kmv0Var.$googleServicesDataSource;
            ArrayList arrayList = imv0.q;
            imv0Var2.getClass();
            HealthDataProvider n = imv0.n(googleServicesDataSource3);
            VkStepsStoreSyncReason j6 = imv0.j(kmv0Var.this$0, j2, currentTimeMillis);
            e9q0 e9q0Var4 = kmv0Var.$payload;
            gzs<s3q0> gzsVar = e9q0Var4.f;
            izs<Exception, s3q0> izsVar = e9q0Var4.e;
            kmv0Var.L$0 = null;
            kmv0Var.label = 4;
        }
        List<m0l0> list4 = (List) a;
        izs<List<m0l0>, s3q0> izsVar2 = kmv0Var.$payload.g;
        if (izsVar2 != null) {
            izsVar2.invoke(list4);
        }
        qwt qwtVar = kmv0Var.this$0.c;
        boolean z = kmv0Var.$payload.h != SelectedDataSource.HEALTH_CONNECT;
        kmv0Var.L$0 = list4;
        kmv0Var.J$0 = j;
        kmv0Var.J$1 = currentTimeMillis;
        kmv0Var.label = 3;
        a2 = qwtVar.a(list4, true, z, kmv0Var);
        if (a2 != coroutineSingletons) {
            long j7 = j;
            list = list4;
            j2 = j7;
            List list32 = (List) a2;
            imv0 imv0Var22 = kmv0Var.this$0;
            e9q0 e9q0Var32 = kmv0Var.$payload;
            Context context2 = e9q0Var32.a;
            VkStepsSyncReason vkStepsSyncReason2 = e9q0Var32.b;
            GoogleServicesDataSource googleServicesDataSource32 = kmv0Var.$googleServicesDataSource;
            ArrayList arrayList2 = imv0.q;
            imv0Var22.getClass();
            HealthDataProvider n2 = imv0.n(googleServicesDataSource32);
            VkStepsStoreSyncReason j62 = imv0.j(kmv0Var.this$0, j2, currentTimeMillis);
            e9q0 e9q0Var42 = kmv0Var.$payload;
            gzs<s3q0> gzsVar2 = e9q0Var42.f;
            izs<Exception, s3q0> izsVar3 = e9q0Var42.e;
            kmv0Var.L$0 = null;
            kmv0Var.label = 4;
        }
        return coroutineSingletons;
    }
}
