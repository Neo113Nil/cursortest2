package xsna;

import android.content.Context;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Device;
import com.google.android.gms.fitness.data.Field;
import com.huawei.hms.hihealth.data.SamplePoint;
import com.huawei.hms.hihealth.data.SampleSet;
import com.unity3d.services.UnityAdsConstants;
import com.vk.superapp.vksteps.VkStepsSyncReason;
import com.vk.superapp.vksteps.utils.enums.VkStepsSyncDurationStrategy;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.s0l0;
import xsna.v0l0;

/* compiled from: VkStepsRepository.kt */
/* loaded from: classes11.dex */
public final class umv0 {
    public final j9u a;
    public final glv b;

    public umv0(j9u j9uVar, c0v c0vVar, glv glvVar, v0l0 v0l0Var, nr4 nr4Var, dm10 dm10Var) {
        this.a = j9uVar;
        this.b = glvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
    
        if (r6 == r3) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0185 -> B:12:0x0189). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0102 -> B:25:0x0107). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(Context context, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, VkStepsSyncDurationStrategy vkStepsSyncDurationStrategy, ContinuationImpl continuationImpl) {
        pmv0 pmv0Var;
        int i;
        Context context2;
        VkStepsSyncDurationStrategy vkStepsSyncDurationStrategy2;
        Object a;
        Context context3;
        Iterator it;
        List list;
        VkStepsSyncDurationStrategy vkStepsSyncDurationStrategy3;
        Collection collection;
        Collection arrayList;
        Iterator it2;
        if (continuationImpl instanceof pmv0) {
            pmv0Var = (pmv0) continuationImpl;
            int i2 = pmv0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pmv0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = pmv0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pmv0Var.label;
                j9u j9uVar = this.a;
                int i3 = 2;
                boolean z = true;
                if (i != 0) {
                    kotlin.a.a(obj);
                    SimpleDateFormat simpleDateFormat = dnv0.a;
                    context2 = context;
                    pmv0Var.L$0 = context2;
                    vkStepsSyncDurationStrategy2 = vkStepsSyncDurationStrategy;
                    pmv0Var.L$1 = vkStepsSyncDurationStrategy2;
                    pmv0Var.label = 1;
                    a = dnv0.a(zonedDateTime, zonedDateTime2, pmv0Var);
                } else if (i == 1) {
                    vkStepsSyncDurationStrategy2 = (VkStepsSyncDurationStrategy) pmv0Var.L$1;
                    Context context4 = (Context) pmv0Var.L$0;
                    kotlin.a.a(obj);
                    a = obj;
                    context2 = context4;
                } else if (i == 2) {
                    collection = (Collection) pmv0Var.L$5;
                    Iterator it3 = (Iterator) pmv0Var.L$4;
                    Collection collection2 = (Collection) pmv0Var.L$3;
                    List list2 = (List) pmv0Var.L$2;
                    VkStepsSyncDurationStrategy vkStepsSyncDurationStrategy4 = (VkStepsSyncDurationStrategy) pmv0Var.L$1;
                    Context context5 = (Context) pmv0Var.L$0;
                    kotlin.a.a(obj);
                    boolean z2 = true;
                    List list3 = list2;
                    collection.add((ruk) obj);
                    it = it3;
                    collection = collection2;
                    context3 = context5;
                    z = z2;
                    list = list3;
                    i3 = 2;
                    vkStepsSyncDurationStrategy3 = vkStepsSyncDurationStrategy4;
                    if (!it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        ZonedDateTime zonedDateTime3 = (ZonedDateTime) pair.d();
                        ZonedDateTime zonedDateTime4 = (ZonedDateTime) pair.g();
                        pmv0Var.L$0 = context3;
                        pmv0Var.L$1 = vkStepsSyncDurationStrategy3;
                        pmv0Var.L$2 = list;
                        pmv0Var.L$3 = collection;
                        pmv0Var.L$4 = it;
                        pmv0Var.L$5 = collection;
                        pmv0Var.label = i3;
                        z2 = z;
                        list3 = list;
                        Object k = myc0.k(dgn0.f().getIo(), new k9u(context3, false, j9uVar, zonedDateTime3, zonedDateTime4, vkStepsSyncDurationStrategy3, null), pmv0Var);
                        if (k != coroutineSingletons) {
                            collection2 = collection;
                            vkStepsSyncDurationStrategy4 = vkStepsSyncDurationStrategy3;
                            context5 = context3;
                            it3 = it;
                            obj = k;
                            collection.add((ruk) obj);
                            it = it3;
                            collection = collection2;
                            context3 = context5;
                            z = z2;
                            list = list3;
                            i3 = 2;
                            vkStepsSyncDurationStrategy3 = vkStepsSyncDurationStrategy4;
                            if (!it.hasNext()) {
                                List list4 = list;
                                ArrayList e = e((List) collection);
                                if (!e.isEmpty()) {
                                    return e;
                                }
                                xgx0.a.getClass();
                                xgx0.b("VkStepsRepository.getStepsFromGoogleFit() -> start second try");
                                List list5 = list4;
                                arrayList = new ArrayList(c5g.u(list5, 10));
                                it2 = list5.iterator();
                                if (it2.hasNext()) {
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    arrayList = (Collection) pmv0Var.L$4;
                    Iterator it4 = (Iterator) pmv0Var.L$3;
                    Collection collection3 = (Collection) pmv0Var.L$2;
                    VkStepsSyncDurationStrategy vkStepsSyncDurationStrategy5 = (VkStepsSyncDurationStrategy) pmv0Var.L$1;
                    Context context6 = (Context) pmv0Var.L$0;
                    kotlin.a.a(obj);
                    vkStepsSyncDurationStrategy3 = vkStepsSyncDurationStrategy5;
                    arrayList.add((ruk) obj);
                    it2 = it4;
                    arrayList = collection3;
                    context3 = context6;
                    if (it2.hasNext()) {
                        Pair pair2 = (Pair) it2.next();
                        ZonedDateTime zonedDateTime5 = (ZonedDateTime) pair2.d();
                        ZonedDateTime zonedDateTime6 = (ZonedDateTime) pair2.g();
                        pmv0Var.L$0 = context3;
                        pmv0Var.L$1 = vkStepsSyncDurationStrategy3;
                        pmv0Var.L$2 = arrayList;
                        pmv0Var.L$3 = it2;
                        pmv0Var.L$4 = arrayList;
                        pmv0Var.L$5 = null;
                        pmv0Var.label = 3;
                        Object k2 = myc0.k(dgn0.f().getIo(), new k9u(context3, true, j9uVar, zonedDateTime5, zonedDateTime6, vkStepsSyncDurationStrategy3, null), pmv0Var);
                        if (k2 != coroutineSingletons) {
                            collection3 = arrayList;
                            context6 = context3;
                            it4 = it2;
                            obj = k2;
                            arrayList.add((ruk) obj);
                            it2 = it4;
                            arrayList = collection3;
                            context3 = context6;
                            if (it2.hasNext()) {
                                ArrayList e2 = e((List) arrayList);
                                xgx0 xgx0Var = xgx0.a;
                                StringBuilder sb = new StringBuilder("VkStepsRepository.getStepsFromGoogleFit() -> is second try success - ");
                                sb.append(!e2.isEmpty());
                                String sb2 = sb.toString();
                                xgx0Var.getClass();
                                xgx0.b(sb2);
                                return e2;
                            }
                        }
                        return coroutineSingletons;
                    }
                }
                List list6 = (List) a;
                List list7 = list6;
                ArrayList arrayList2 = new ArrayList(c5g.u(list7, 10));
                context3 = context2;
                it = list7.iterator();
                list = list6;
                vkStepsSyncDurationStrategy3 = vkStepsSyncDurationStrategy2;
                collection = arrayList2;
                if (!it.hasNext()) {
                }
            }
        }
        pmv0Var = new pmv0(this, continuationImpl);
        Object obj2 = pmv0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pmv0Var.label;
        j9u j9uVar2 = this.a;
        int i32 = 2;
        boolean z3 = true;
        if (i != 0) {
        }
        List list62 = (List) a;
        List list72 = list62;
        ArrayList arrayList22 = new ArrayList(c5g.u(list72, 10));
        context3 = context2;
        it = list72.iterator();
        list = list62;
        vkStepsSyncDurationStrategy3 = vkStepsSyncDurationStrategy2;
        collection = arrayList22;
        if (!it.hasNext()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0195 A[EDGE_INSN: B:59:0x0195->B:60:0x0195 BREAK  A[LOOP:1: B:33:0x00e3->B:52:0x0187], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(Context context, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, VkStepsSyncDurationStrategy vkStepsSyncDurationStrategy, ContinuationImpl continuationImpl) {
        qmv0 qmv0Var;
        int i;
        ArrayList arrayList;
        Iterator it;
        boolean hasNext;
        Iterator it2;
        Object obj;
        if (continuationImpl instanceof qmv0) {
            qmv0Var = (qmv0) continuationImpl;
            int i2 = qmv0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qmv0Var.label = i2 - Integer.MIN_VALUE;
                Object obj2 = qmv0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qmv0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj2);
                    VkStepsSyncDurationStrategy.a aVar = VkStepsSyncDurationStrategy.Companion;
                    String optString = e370.s != null ? new x19().C().optString("sync_strategy") : null;
                    aVar.getClass();
                    VkStepsSyncDurationStrategy a = VkStepsSyncDurationStrategy.a.a(optString);
                    VkStepsSyncDurationStrategy vkStepsSyncDurationStrategy2 = a == null ? vkStepsSyncDurationStrategy : a;
                    qmv0Var.label = 1;
                    obj2 = myc0.k(dgn0.f().getIo(), new b0v(context, vkStepsSyncDurationStrategy2, zonedDateTime, zonedDateTime2, null), qmv0Var);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj2);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : (List) obj2) {
                    lb1 lb1Var = (lb1) obj3;
                    Long l = (Long) lb1Var.a().a(x0l0.g);
                    c2z c2zVar = (c2z) lb1Var.a().a(bhn.h);
                    Double valueOf = c2zVar != null ? Double.valueOf(c2zVar.a()) : null;
                    if ((l != null && l.longValue() > 0) || (valueOf != null && valueOf.doubleValue() > ConnectivityTracker.DEFAULT_UPLINK_BITRATE)) {
                        arrayList2.add(obj3);
                    }
                }
                arrayList = new ArrayList(c5g.u(arrayList2, 10));
                it = arrayList2.iterator();
                while (true) {
                    hasNext = it.hasNext();
                    float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    if (hasNext) {
                        break;
                    }
                    lb1 lb1Var2 = (lb1) it.next();
                    xgx0 xgx0Var = xgx0.a;
                    String str = "Data from HealthConnect startTime = " + bhu.j(lb1Var2.b().toEpochMilli()) + ", result =" + lb1Var2.a();
                    xgx0Var.getClass();
                    xgx0.a(str);
                    Long l2 = (Long) lb1Var2.a().a(x0l0.g);
                    int longValue = l2 != null ? (int) l2.longValue() : 0;
                    c2z c2zVar2 = (c2z) lb1Var2.a().a(bhn.h);
                    if (c2zVar2 != null) {
                        f = (float) (c2zVar2.a() / 1000);
                    }
                    float f2 = f;
                    long epochMilli = lb1Var2.b().toEpochMilli();
                    Iterator<T> it3 = lb1Var2.a().b().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it3.next();
                        if (((luk) obj).a().length() > 0) {
                            break;
                        }
                    }
                    luk lukVar = (luk) obj;
                    arrayList.add(new m0l0(longValue, f2, epochMilli, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lukVar != null ? lukVar.a() : null, 88));
                }
                ArrayList arrayList3 = new ArrayList();
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    m0l0 m0l0Var = (m0l0) next;
                    if (m0l0Var.f() > 0 || m0l0Var.c() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        arrayList3.add(next);
                    }
                }
                return arrayList3;
            }
        }
        qmv0Var = new qmv0(this, continuationImpl);
        Object obj22 = qmv0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qmv0Var.label;
        if (i != 0) {
        }
        ArrayList arrayList22 = new ArrayList();
        while (r0.hasNext()) {
        }
        arrayList = new ArrayList(c5g.u(arrayList22, 10));
        it = arrayList22.iterator();
        while (true) {
            hasNext = it.hasNext();
            float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (hasNext) {
            }
            arrayList.add(new m0l0(longValue, f2, epochMilli, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lukVar != null ? lukVar.a() : null, 88));
        }
        ArrayList arrayList32 = new ArrayList();
        it2 = arrayList.iterator();
        while (it2.hasNext()) {
        }
        return arrayList32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(Context context, long j, long j2, VkStepsSyncReason vkStepsSyncReason, ContinuationImpl continuationImpl) {
        rmv0 rmv0Var;
        int i;
        List list;
        SampleSet sampleSet;
        SampleSet sampleSet2;
        ?? r4;
        ?? r2;
        List<SamplePoint> samplePoints;
        List<SamplePoint> samplePoints2;
        if (continuationImpl instanceof rmv0) {
            rmv0Var = (rmv0) continuationImpl;
            int i2 = rmv0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rmv0Var.label = i2 - Integer.MIN_VALUE;
                rmv0 rmv0Var2 = rmv0Var;
                Object obj = rmv0Var2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rmv0Var2.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ArrayList arrayList = new ArrayList();
                    rmv0Var2.L$0 = arrayList;
                    rmv0Var2.label = 1;
                    Serializable c = this.b.c(context, j, j2, vkStepsSyncReason, rmv0Var2);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list = arrayList;
                    obj = c;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) rmv0Var2.L$0;
                    kotlin.a.a(obj);
                }
                Pair pair = (Pair) obj;
                sampleSet = (SampleSet) pair.d();
                sampleSet2 = (SampleSet) pair.g();
                if (sampleSet != null || (samplePoints2 = sampleSet.getSamplePoints()) == null) {
                    r4 = EmptyList.b;
                } else {
                    List V = j5g.V(samplePoints2);
                    r4 = new ArrayList(c5g.u(V, 10));
                    Iterator it = V.iterator();
                    while (it.hasNext()) {
                        r4.add(dm10.h((SamplePoint) it.next()));
                    }
                }
                if (sampleSet2 != null || (samplePoints = sampleSet2.getSamplePoints()) == null) {
                    r2 = EmptyList.b;
                } else {
                    List V2 = j5g.V(samplePoints);
                    r2 = new ArrayList(c5g.u(V2, 10));
                    Iterator it2 = V2.iterator();
                    while (it2.hasNext()) {
                        r2.add(dm10.h((SamplePoint) it2.next()));
                    }
                }
                list.addAll((Collection) r4);
                list.addAll((Collection) r2);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    m0l0 m0l0Var = (m0l0) obj2;
                    if (m0l0Var.f() > 0 || m0l0Var.c() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
            }
        }
        rmv0Var = new rmv0(this, continuationImpl);
        rmv0 rmv0Var22 = rmv0Var;
        Object obj3 = rmv0Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rmv0Var22.label;
        if (i != 0) {
        }
        Pair pair2 = (Pair) obj3;
        sampleSet = (SampleSet) pair2.d();
        sampleSet2 = (SampleSet) pair2.g();
        if (sampleSet != null) {
        }
        r4 = EmptyList.b;
        if (sampleSet2 != null) {
        }
        r2 = EmptyList.b;
        list.addAll((Collection) r4);
        list.addAll((Collection) r2);
        ArrayList arrayList22 = new ArrayList();
        while (r1.hasNext()) {
        }
        return arrayList22;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(List list, VkStepsSyncReason vkStepsSyncReason, ContinuationImpl continuationImpl) {
        smv0 smv0Var;
        int i;
        if (continuationImpl instanceof smv0) {
            smv0Var = (smv0) continuationImpl;
            int i2 = smv0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                smv0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = smv0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = smv0Var.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return obj;
                }
                kotlin.a.a(obj);
                vdx0 vdx0Var = e370.e;
                if (vdx0Var == null) {
                    vdx0Var = null;
                }
                io.reactivex.rxjava3.internal.operators.single.y b = vdx0Var.z().b(vkStepsSyncReason.name().toLowerCase(Locale.ENGLISH), list);
                smv0Var.label = 1;
                Object f = sd9.f(b, smv0Var);
                return f == coroutineSingletons ? coroutineSingletons : f;
            }
        }
        smv0Var = new smv0(this, continuationImpl);
        Object obj2 = smv0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = smv0Var.label;
        if (i == 0) {
        }
    }

    public final ArrayList e(List list) {
        List<DataPoint> i;
        DataPoint dataPoint;
        DataSource i2;
        Device i3;
        float f;
        int i4;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List<Bucket> a = ((ruk) it.next()).a();
            ArrayList arrayList2 = new ArrayList(c5g.u(a, 10));
            for (Bucket bucket : a) {
                List<DataSet> i5 = bucket.i();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : i5) {
                    if (epx.f(((DataSet) obj).j(), DataType.f)) {
                        arrayList3.add(obj);
                    }
                }
                Iterator it2 = arrayList3.iterator();
                int i6 = 0;
                int i7 = 0;
                while (it2.hasNext()) {
                    for (DataPoint dataPoint2 : ((DataSet) it2.next()).i()) {
                        try {
                            i4 = dataPoint2.j(Field.g).j();
                        } catch (Exception unused) {
                            i4 = 0;
                        }
                        i6 += i4;
                        if (epx.f(dataPoint2.i().k(), "user_input")) {
                            i7 += i4;
                        }
                    }
                }
                v0l0.b bVar = new v0l0.b(i6, i7);
                List<DataSet> i8 = bucket.i();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : i8) {
                    if (epx.f(((DataSet) obj2).j(), DataType.m)) {
                        arrayList4.add(obj2);
                    }
                }
                Iterator it3 = arrayList4.iterator();
                float f2 = 0.0f;
                float f3 = 0.0f;
                while (it3.hasNext()) {
                    Iterator<T> it4 = ((DataSet) it3.next()).i().iterator();
                    while (it4.hasNext()) {
                        try {
                            f = an10.b(r12.j(Field.n).i() / 10.0f) / 100.0f;
                        } catch (Exception unused2) {
                            f = 0.0f;
                        }
                        f2 += f;
                        if (epx.f(((DataPoint) it4.next()).i().k(), "user_input")) {
                            f3 += f;
                        }
                    }
                }
                v0l0.a aVar = new v0l0.a(f2, f3);
                DataSet dataSet = (DataSet) j5g.a0(bucket.i());
                String i9 = (dataSet == null || (i = dataSet.i()) == null || (dataPoint = (DataPoint) j5g.a0(i)) == null || (i2 = dataPoint.i()) == null || (i3 = i2.i()) == null) ? null : i3.i();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                arrayList2.add(new m0l0(bVar.b(), aVar.a(), bucket.l(), bVar.a(), aVar.b(), i9, 64));
            }
            g5g.y(arrayList2, arrayList);
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            Object next = it5.next();
            m0l0 m0l0Var = (m0l0) next;
            if (m0l0Var.f() > 0 || m0l0Var.c() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                arrayList5.add(next);
            }
        }
        return arrayList5;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(m0l0 m0l0Var, VkStepsSyncReason vkStepsSyncReason, ContinuationImpl continuationImpl) {
        tmv0 tmv0Var;
        int i;
        if (continuationImpl instanceof tmv0) {
            tmv0Var = (tmv0) continuationImpl;
            int i2 = tmv0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tmv0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = tmv0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tmv0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    vdx0 vdx0Var = e370.e;
                    if (vdx0Var == null) {
                        vdx0Var = null;
                    }
                    io.reactivex.rxjava3.internal.operators.single.y a = vdx0Var.z().a(m0l0Var.f(), m0l0Var.c(), m0l0Var.e(), m0l0Var.d(), vkStepsSyncReason.name().toLowerCase(Locale.ENGLISH), s0l0.a.a(m0l0Var.b()));
                    tmv0Var.label = 1;
                    obj = sd9.f(a, tmv0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                ghv0 ghv0Var = (ghv0) obj;
                return Collections.singletonList(new m0l0(ghv0Var.b(), ghv0Var.a(), System.currentTimeMillis(), 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (String) null, 120));
            }
        }
        tmv0Var = new tmv0(this, continuationImpl);
        Object obj2 = tmv0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tmv0Var.label;
        if (i != 0) {
        }
        ghv0 ghv0Var2 = (ghv0) obj2;
        return Collections.singletonList(new m0l0(ghv0Var2.b(), ghv0Var2.a(), System.currentTimeMillis(), 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (String) null, 120));
    }
}
