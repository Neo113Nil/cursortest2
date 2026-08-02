package xsna;

import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.core.filedatastore.FileDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.w80;

/* compiled from: ActivityAnalyticsRepository.kt */
@b6l(c = "com.vk.push.pushsdk.domain.repository.ActivityAnalyticsRepository$onActive$1", f = "ActivityAnalyticsRepository.kt", l = {26, 48, 59, 61, 66}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class y80 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ long $activeForMsNew;
    final /* synthetic */ long $activeIntervalNew;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ w80 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y80(w80 w80Var, long j, long j2, spj<? super y80> spjVar) {
        super(2, spjVar);
        this.this$0 = w80Var;
        this.$activeIntervalNew = j;
        this.$activeForMsNew = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new y80(this.this$0, this.$activeIntervalNew, this.$activeForMsNew, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((y80) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x024b, code lost:
    
        if (r0.m100setDatagIAlus("", r35) == r2) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x024d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01e1, code lost:
    
        if (r0.m100setDatagIAlus("", r35) == r2) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01e4, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0235, code lost:
    
        if (r5.m100setDatagIAlus(r0, r35) == r2) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0147, code lost:
    
        if (r5 == r2) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0073, code lost:
    
        if (r0 == r2) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0240  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m99getDataIoAF18A;
        Object obj2;
        w80 w80Var;
        Object failure;
        w80.a aVar;
        long currentTimeMillis;
        long j;
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            FileDataSource fileDataSource = this.this$0.c;
            this.label = 1;
            m99getDataIoAF18A = fileDataSource.m99getDataIoAF18A(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        ((Result) obj).getClass();
                        return s3q0.a;
                    }
                    Object obj3 = this.L$0;
                    kotlin.a.a(obj);
                    ((Result) obj).getClass();
                    obj2 = obj3;
                    w80 w80Var2 = this.this$0;
                    if (Result.a(obj2) != null) {
                        FileDataSource fileDataSource2 = w80Var2.c;
                        this.L$0 = obj2;
                        this.label = 5;
                    }
                    return s3q0.a;
                }
                j = this.J$1;
                long j2 = this.J$0;
                aVar = (w80.a) this.L$2;
                w80Var = (w80) this.L$1;
                Object obj4 = this.L$0;
                kotlin.a.a(obj);
                currentTimeMillis = j2;
                obj2 = obj4;
                a = obj;
                if (j < currentTimeMillis - ((Number) a).longValue()) {
                    AnalyticsSender analyticsSender = w80Var.a;
                    long j3 = aVar.a;
                    List<Long> list = aVar.b;
                    double O = j5g.O(list);
                    long c = !Double.isNaN(O) ? an10.c(O) : 0L;
                    List C0 = j5g.C0(list);
                    analyticsSender.send(new ike0(j3, aVar.c, System.currentTimeMillis(), c, C0.size() % 2 == 0 ? (((Number) C0.get((C0.size() - 1) / 2)).longValue() + ((Number) C0.get(C0.size() / 2)).longValue()) / 2 : ((Number) C0.get(C0.size() / 2)).longValue(), w80Var.d));
                    FileDataSource fileDataSource3 = w80Var.c;
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                } else {
                    FileDataSource fileDataSource4 = w80Var.c;
                    aVar.getClass();
                    JSONObject put = new JSONObject().put("active_for_ms", aVar.a).put("last_time_event_sent", aVar.c);
                    JSONArray jSONArray = new JSONArray();
                    Iterator<T> it = aVar.b.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((Number) it.next()).longValue());
                    }
                    s3q0 s3q0Var = s3q0.a;
                    String jSONObject = put.put("avg_active_time", jSONArray).toString();
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                }
                obj2 = obj3;
                w80 w80Var22 = this.this$0;
                if (Result.a(obj2) != null) {
                }
                return s3q0.a;
            }
            kotlin.a.a(obj);
            m99getDataIoAF18A = ((Result) obj).d();
        }
        obj2 = m99getDataIoAF18A;
        w80Var = this.this$0;
        long j4 = this.$activeIntervalNew;
        long j5 = this.$activeForMsNew;
        if (!(obj2 instanceof Result.Failure)) {
            try {
                JSONObject jSONObject2 = new JSONObject((String) obj2);
                long j6 = jSONObject2.getLong("active_for_ms");
                long j7 = jSONObject2.getLong("last_time_event_sent");
                JSONArray jSONArray2 = jSONObject2.getJSONArray("avg_active_time");
                ListBuilder e = e43.e();
                int length = jSONArray2.length();
                int i2 = 0;
                while (i2 < length) {
                    e.add(Long.valueOf(jSONArray2.getLong(i2)));
                    i2++;
                    jSONArray2 = jSONArray2;
                }
                failure = new w80.a(e.g(), j6, j7);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (Result.a(failure) == null) {
                w80.a aVar2 = (w80.a) failure;
                List<Long> list2 = aVar2.b;
                Long l = (Long) j5g.k0(list2);
                long longValue = l != null ? l.longValue() : 0L;
                long j8 = aVar2.a + j4;
                if (j5 >= longValue && !list2.isEmpty()) {
                    list2 = j5g.T(1, list2);
                }
                ArrayList arrayList = new ArrayList(list2);
                arrayList.add(new Long(j5));
                s3q0 s3q0Var2 = s3q0.a;
                aVar = new w80.a(arrayList, j8, aVar2.c);
            } else {
                aVar = new w80.a(Collections.singletonList(new Long(j5)), 0L, System.currentTimeMillis());
            }
            currentTimeMillis = System.currentTimeMillis();
            this.L$0 = obj2;
            this.L$1 = w80Var;
            this.L$2 = aVar;
            this.J$0 = currentTimeMillis;
            j = aVar.c;
            this.J$1 = j;
            this.label = 2;
            a = w80.a(w80Var, this);
        }
        w80 w80Var222 = this.this$0;
        if (Result.a(obj2) != null) {
        }
        return s3q0.a;
    }
}
