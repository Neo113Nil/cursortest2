package xsna;

import android.health.connect.HealthConnectManager;
import android.health.connect.ReadRecordsRequestUsingFilters;
import android.health.connect.ReadRecordsResponse;
import android.health.connect.datatypes.DataOrigin;
import android.health.connect.datatypes.Record;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: HealthConnectClientUpsideDownImpl.kt */
@b6l(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$readRecords$response$1", f = "HealthConnectClientUpsideDownImpl.kt", l = {634}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class wzu extends SuspendLambda implements izs<spj<? super ReadRecordsResponse<? extends Record>>, Object> {
    final /* synthetic */ j7f0<Object> $request;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ qzu this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzu(qzu qzuVar, j7f0<Object> j7f0Var, spj<? super wzu> spjVar) {
        super(1, spjVar);
        this.this$0 = qzuVar;
        this.$request = j7f0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new wzu(this.this$0, this.$request, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super ReadRecordsResponse<? extends Record>> spjVar) {
        return ((wzu) create(spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ReadRecordsRequestUsingFilters.Builder timeRangeFilter;
        ReadRecordsRequestUsingFilters.Builder pageSize;
        ReadRecordsRequestUsingFilters build;
        DataOrigin build2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        qzu qzuVar = this.this$0;
        j7f0<Object> j7f0Var = this.$request;
        this.L$0 = qzuVar;
        this.L$1 = j7f0Var;
        this.label = 1;
        lq9 lq9Var = new lq9(1, s7s0.c(this));
        lq9Var.o();
        HealthConnectManager healthConnectManager = qzuVar.d;
        String str = j7f0Var.f;
        v81.m();
        dcy<Object> dcyVar = j7f0Var.a;
        Class<? extends Record> cls = !v3r0.c() ? null : lhf0.c.get(dcyVar);
        if (cls == null) {
            cls = !v3r0.b() ? null : lhf0.b.get(dcyVar);
            if (cls == null) {
                Class<? extends Record> cls2 = v3r0.a() ? (Class) lhf0.a.get(dcyVar) : null;
                if (cls2 == null) {
                    cls = (Class) lhf0.d.get(dcyVar);
                    if (cls == null) {
                        throw new IllegalArgumentException("Unsupported record type " + dcyVar);
                    }
                } else {
                    cls = cls2;
                }
            }
        }
        timeRangeFilter = u81.c(cls).setTimeRangeFilter(l7g0.b(j7f0Var.b));
        pageSize = timeRangeFilter.setPageSize(j7f0Var.e);
        for (luk lukVar : j7f0Var.c) {
            DataOrigin.Builder e = l91.e();
            e.setPackageName(lukVar.a);
            build2 = e.build();
            pageSize.addDataOrigins(build2);
        }
        if (str != null) {
            pageSize.setPageToken(Long.parseLong(str));
        }
        if (str == null) {
            pageSize.setAscending(j7f0Var.d);
        }
        build = pageSize.build();
        healthConnectManager.readRecords(a91.c(build), qzuVar.b, new vpj(lq9Var));
        Object n = lq9Var.n();
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
