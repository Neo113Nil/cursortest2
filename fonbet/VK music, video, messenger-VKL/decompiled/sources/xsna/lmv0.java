package xsna;

import android.content.Context;
import com.vk.superapp.bridges.dto.analytics.HealthDataProvider;
import com.vk.superapp.vksteps.VkStepsSyncReason;
import com.vk.superapp.vksteps.domain.GoogleServicesDataSource;
import com.vk.superapp.vksteps.utils.enums.VkStepsStoreSyncReason;
import com.vungle.ads.internal.protos.Sdk;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkStepsManagerImpl.kt */
@b6l(c = "com.vk.superapp.vksteps.VkStepsManagerImpl$startPartialMonthlySync$1", f = "VkStepsManagerImpl.kt", l = {Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, 229, 233}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class lmv0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ GoogleServicesDataSource $googleServicesDataSource;
    final /* synthetic */ e9q0 $payload;
    long J$0;
    long J$1;
    int label;
    final /* synthetic */ imv0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lmv0(GoogleServicesDataSource googleServicesDataSource, spj spjVar, e9q0 e9q0Var, imv0 imv0Var) {
        super(2, spjVar);
        this.$payload = e9q0Var;
        this.this$0 = imv0Var;
        this.$googleServicesDataSource = googleServicesDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new lmv0(this.$googleServicesDataSource, spjVar, this.$payload, this.this$0);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((lmv0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b8, code lost:
    
        if (xsna.imv0.l(r0, r3, r2, r1, r4, r10, r8, r9, r2, r11, r7, false, r14) == r15) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cc, code lost:
    
        if (xsna.imv0.k(r1, r0, r2, r3, r14) != r15) goto L45;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long longValue;
        Object a;
        long j;
        lmv0 lmv0Var = this;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = lmv0Var.label;
        try {
        } catch (Exception e) {
            e = e;
        }
        if (i == 0) {
            kotlin.a.a(obj);
            qvo0.a.getClass();
            long d = qvo0.d();
            Long l = lmv0Var.$payload.c;
            if (l != null) {
                d = l.longValue();
            }
            long j2 = d;
            Long l2 = lmv0Var.$payload.d;
            longValue = l2 != null ? l2.longValue() : System.currentTimeMillis();
            rwt rwtVar = lmv0Var.this$0.g;
            e9q0 e9q0Var = lmv0Var.$payload;
            ZonedDateTime E = edi.E(j2);
            ZonedDateTime E2 = edi.E(longValue);
            GoogleServicesDataSource googleServicesDataSource = lmv0Var.$googleServicesDataSource;
            lmv0Var.J$0 = j2;
            lmv0Var.J$1 = longValue;
            lmv0Var.label = 1;
            try {
                a = rwtVar.a(e9q0Var, E, E2, googleServicesDataSource, lmv0Var);
                lmv0Var = lmv0Var;
                if (a != coroutineSingletons) {
                    j = j2;
                }
            } catch (Exception e2) {
                e = e2;
                lmv0Var = lmv0Var;
                imv0 imv0Var = lmv0Var.this$0;
                e9q0 e9q0Var2 = lmv0Var.$payload;
                GoogleServicesDataSource googleServicesDataSource2 = lmv0Var.$googleServicesDataSource;
                lmv0Var.label = 2;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.a.a(obj);
                return s3q0.a;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return s3q0.a;
        }
        long j3 = lmv0Var.J$1;
        long j4 = lmv0Var.J$0;
        kotlin.a.a(obj);
        longValue = j3;
        j = j4;
        a = obj;
        List<m0l0> list = (List) a;
        izs<List<m0l0>, s3q0> izsVar = lmv0Var.$payload.g;
        if (izsVar != null) {
            izsVar.invoke(list);
        }
        imv0 imv0Var2 = lmv0Var.this$0;
        e9q0 e9q0Var3 = lmv0Var.$payload;
        Context context = e9q0Var3.a;
        VkStepsSyncReason vkStepsSyncReason = e9q0Var3.b;
        GoogleServicesDataSource googleServicesDataSource3 = lmv0Var.$googleServicesDataSource;
        ArrayList arrayList = imv0.q;
        imv0Var2.getClass();
        HealthDataProvider n = imv0.n(googleServicesDataSource3);
        VkStepsStoreSyncReason vkStepsStoreSyncReason = VkStepsStoreSyncReason.UPDATE;
        e9q0 e9q0Var4 = lmv0Var.$payload;
        gzs<s3q0> gzsVar = e9q0Var4.f;
        izs<Exception, s3q0> izsVar2 = e9q0Var4.e;
        lmv0Var.label = 3;
    }
}
