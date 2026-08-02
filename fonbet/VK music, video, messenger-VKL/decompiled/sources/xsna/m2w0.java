package xsna;

import android.content.Context;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Field;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.data.Value;
import com.unity3d.services.UnityAdsConstants;
import com.vk.superapp.api.dto.vkworkout.WorkoutData;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.hzx0;

/* compiled from: VkWorkoutRepository.kt */
/* loaded from: classes11.dex */
public final class m2w0 {
    public final i9u a;

    public m2w0(i9u i9uVar, a0v a0vVar, hzx0 hzx0Var, izx0 izx0Var) {
        this.a = i9uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0096 -> B:10:0x009b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(Context context, List list, ContinuationImpl continuationImpl) {
        i2w0 i2w0Var;
        int i;
        Collection arrayList;
        Iterator it;
        Context context2;
        String sb;
        WorkoutData.WorkoutType workoutType;
        String str;
        DataSource i2;
        String k;
        List<DataPoint> i3;
        String l;
        String description;
        String i4;
        String i5;
        if (continuationImpl instanceof i2w0) {
            i2w0Var = (i2w0) continuationImpl;
            int i6 = i2w0Var.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                i2w0Var.label = i6 - Integer.MIN_VALUE;
                Object obj = i2w0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = i2w0Var.label;
                int i7 = 10;
                boolean z = true;
                if (i != 0) {
                    kotlin.a.a(obj);
                    List list2 = list;
                    arrayList = new ArrayList(c5g.u(list2, 10));
                    it = list2.iterator();
                    context2 = context;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    arrayList = (Collection) i2w0Var.L$3;
                    Iterator it2 = (Iterator) i2w0Var.L$2;
                    Collection collection = (Collection) i2w0Var.L$1;
                    Context context3 = (Context) i2w0Var.L$0;
                    kotlin.a.a(obj);
                    arrayList.add((ruk) obj);
                    it = it2;
                    arrayList = collection;
                    context2 = context3;
                    if (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        ZonedDateTime zonedDateTime = (ZonedDateTime) pair.d();
                        ZonedDateTime zonedDateTime2 = (ZonedDateTime) pair.g();
                        i2w0Var.L$0 = context2;
                        i2w0Var.L$1 = arrayList;
                        i2w0Var.L$2 = it;
                        i2w0Var.L$3 = arrayList;
                        i2w0Var.label = 1;
                        Object k2 = myc0.k(dgn0.f().getIo(), new f9u(context2, this.a, zonedDateTime, zonedDateTime2, null), i2w0Var);
                        if (k2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        it2 = it;
                        obj = k2;
                        context3 = context2;
                        collection = arrayList;
                        arrayList.add((ruk) obj);
                        it = it2;
                        arrayList = collection;
                        context2 = context3;
                        if (it.hasNext()) {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it3 = ((List) arrayList).iterator();
                            while (it3.hasNext()) {
                                List<Bucket> a = ((ruk) it3.next()).a();
                                ArrayList arrayList3 = new ArrayList(c5g.u(a, i7));
                                for (Bucket bucket : a) {
                                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                    long l2 = bucket.l();
                                    long j = bucket.j();
                                    long l3 = bucket.l();
                                    long j2 = bucket.j();
                                    Session k3 = bucket.k();
                                    if (k3 == null || (sb = k3.k()) == null) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(l3);
                                        sb2.append('-');
                                        sb2.append(j2);
                                        sb = sb2.toString();
                                    }
                                    String str2 = sb;
                                    Session k4 = bucket.k();
                                    if (k4 == null || (i5 = k4.i()) == null) {
                                        workoutType = WorkoutData.WorkoutType.OTHER;
                                    } else {
                                        workoutType = WorkoutData.WorkoutType.BIKING;
                                        if (!hzx0.a(i5, workoutType)) {
                                            workoutType = WorkoutData.WorkoutType.RUNNING;
                                            if (!hzx0.a(i5, workoutType)) {
                                                workoutType = WorkoutData.WorkoutType.SWIMMING;
                                                if (!hzx0.a(i5, workoutType)) {
                                                    workoutType = WorkoutData.WorkoutType.OTHER;
                                                }
                                            }
                                        }
                                    }
                                    WorkoutData.WorkoutType workoutType2 = workoutType;
                                    Session k5 = bucket.k();
                                    String str3 = (k5 == null || (i4 = k5.i()) == null) ? "unknown" : i4;
                                    Session k6 = bucket.k();
                                    String str4 = (k6 == null || (description = k6.getDescription()) == null) ? "unknown" : description;
                                    Session k7 = bucket.k();
                                    String str5 = (k7 == null || (l = k7.l()) == null) ? "unknown" : l;
                                    DataSet dataSet = (DataSet) j5g.a0(bucket.i());
                                    DataPoint dataPoint = (dataSet == null || (i3 = dataSet.i()) == null) ? null : (DataPoint) j5g.a0(i3);
                                    String str6 = (dataPoint == null || (i2 = dataPoint.i()) == null || (k = i2.k()) == null) ? "unknown" : k;
                                    if (dataPoint != null && brm0.w(dataPoint.i().k(), "user_input", z)) {
                                        str = "user_input";
                                    } else if (dataPoint != null) {
                                        str = dataPoint.i().j();
                                    } else {
                                        Session k8 = bucket.k();
                                        String j3 = k8 != null ? k8.j() : null;
                                        str = j3 == null ? "" : j3;
                                    }
                                    hzx0.a aVar = new hzx0.a(str2, workoutType2, str3, str4, str5, str6, str, str.equalsIgnoreCase("user_input"));
                                    Value b = hzx0.b(bucket, DataType.f, Field.g);
                                    int j4 = b != null ? b.j() : 0;
                                    Value b2 = hzx0.b(bucket, DataType.h, Field.u);
                                    float i8 = b2 != null ? b2.i() : 0.0f;
                                    Value b3 = hzx0.b(bucket, DataType.m, Field.n);
                                    float i9 = b3 != null ? b3.i() : 0.0f;
                                    long j5 = bucket.j() - bucket.l();
                                    int i10 = (int) (j5 / 1000);
                                    float f = 1000;
                                    int b4 = an10.b(i8 * f);
                                    int i11 = i10 / 60;
                                    arrayList3.add(new WorkoutData(aVar.c(), aVar.f(), l2, Long.valueOf(j), aVar.g(), aVar.e(), aVar.b(), aVar.d(), aVar.a(), new WorkoutData.a((int) i9, i10, j5, b4, Integer.valueOf(i9 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (int) (i10 / (i9 / f)) : 0), Integer.valueOf(i11 > 0 ? j4 / i11 : 0))));
                                    z = true;
                                }
                                g5g.y(arrayList3, arrayList2);
                                i7 = 10;
                                z = true;
                            }
                            return arrayList2;
                        }
                    }
                }
            }
        }
        i2w0Var = new i2w0(this, continuationImpl);
        Object obj2 = i2w0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = i2w0Var.label;
        int i72 = 10;
        boolean z2 = true;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0071  */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x013f -> B:11:0x014a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00f7 -> B:32:0x010f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x00bf -> B:84:0x00c2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(Context context, List list, ContinuationImpl continuationImpl) {
        j2w0 j2w0Var;
        int i;
        Collection arrayList;
        Iterator it;
        Context context2;
        ArrayList arrayList2;
        Iterator it2;
        WorkoutData.WorkoutType workoutType;
        j2w0 j2w0Var2;
        int i2;
        float f;
        CoroutineSingletons coroutineSingletons;
        WorkoutData workoutData;
        if (continuationImpl instanceof j2w0) {
            j2w0Var = (j2w0) continuationImpl;
            int i3 = j2w0Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                j2w0Var.label = i3 - Integer.MIN_VALUE;
                Object obj = j2w0Var.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = j2w0Var.label;
                spj spjVar = null;
                int i4 = 2;
                if (i != 0) {
                    kotlin.a.a(obj);
                    List list2 = list;
                    arrayList = new ArrayList(c5g.u(list2, 10));
                    it = list2.iterator();
                    context2 = context;
                    if (it.hasNext()) {
                    }
                } else if (i == 1) {
                    arrayList = (Collection) j2w0Var.L$3;
                    it = (Iterator) j2w0Var.L$2;
                    Collection collection = (Collection) j2w0Var.L$1;
                    Context context3 = (Context) j2w0Var.L$0;
                    kotlin.a.a(obj);
                    arrayList.add((k7f0) obj);
                    arrayList = collection;
                    context2 = context3;
                    if (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        ZonedDateTime zonedDateTime = (ZonedDateTime) pair.d();
                        ZonedDateTime zonedDateTime2 = (ZonedDateTime) pair.g();
                        j2w0Var.L$0 = context2;
                        j2w0Var.L$1 = arrayList;
                        j2w0Var.L$2 = it;
                        j2w0Var.L$3 = arrayList;
                        j2w0Var.label = 1;
                        Object k = myc0.k(dgn0.f().getIo(), new zzu(context2, zonedDateTime, zonedDateTime2, null), j2w0Var);
                        if (k != coroutineSingletons2) {
                            context3 = context2;
                            obj = k;
                            collection = arrayList;
                            arrayList.add((k7f0) obj);
                            arrayList = collection;
                            context2 = context3;
                            if (it.hasNext()) {
                                List list3 = (List) arrayList;
                                xgx0.a.getClass();
                                xgx0.a("VkWorkoutsRepository.getWorkoutsFromHealthConnect() -> workouts received from Health Connect: \nrecords: " + list3);
                                List list4 = list3;
                                arrayList2 = new ArrayList(c5g.u(list4, 10));
                                it2 = list4.iterator();
                                if (it2.hasNext()) {
                                }
                            }
                        }
                        return coroutineSingletons2;
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Collection collection2 = (Collection) j2w0Var.L$6;
                    n4q n4qVar = (n4q) j2w0Var.L$5;
                    Iterator it3 = (Iterator) j2w0Var.L$4;
                    ?? r10 = (Collection) j2w0Var.L$3;
                    Iterator it4 = (Iterator) j2w0Var.L$2;
                    ?? r12 = (Collection) j2w0Var.L$1;
                    Context context4 = (Context) j2w0Var.L$0;
                    kotlin.a.a(obj);
                    ArrayList arrayList3 = r10;
                    ArrayList arrayList4 = r12;
                    androidx.health.connect.client.aggregate.c cVar = (androidx.health.connect.client.aggregate.c) obj;
                    Long l = (Long) cVar.a(x0l0.g);
                    int longValue = (int) (l == null ? l.longValue() : 0L);
                    c2z c2zVar = (c2z) cVar.a(bhn.h);
                    int i5 = 0;
                    int a = c2zVar == null ? (int) c2zVar.a() : 0;
                    Iterator it5 = it3;
                    int epochSecond = (int) (n4qVar.b().getEpochSecond() - n4qVar.a().getEpochSecond());
                    long epochMilli = n4qVar.b().toEpochMilli() - n4qVar.a().toEpochMilli();
                    jlp jlpVar = (jlp) cVar.a(zcp0.h);
                    int a2 = jlpVar == null ? an10.a(jlpVar.c()) : 0;
                    int d = n4qVar.getMetadata().d();
                    String str = "RECORDING_METHOD_UNKNOWN";
                    if (d != 0) {
                        if (d == 1) {
                            str = "RECORDING_METHOD_ACTIVELY_RECORDED";
                        } else if (d == 2) {
                            str = "RECORDING_METHOD_AUTOMATICALLY_RECORDED";
                        } else if (d == 3) {
                            j2w0Var2 = j2w0Var;
                            coroutineSingletons = coroutineSingletons2;
                            workoutData = null;
                            if (workoutData != null) {
                                arrayList3.add(workoutData);
                            }
                            it3 = it5;
                            Iterator it6 = it4;
                            ArrayList arrayList5 = arrayList3;
                            context2 = context4;
                            coroutineSingletons2 = coroutineSingletons;
                            j2w0Var = j2w0Var2;
                            spjVar = null;
                            i4 = 2;
                            if (it3.hasNext()) {
                                n4q n4qVar2 = (n4q) it3.next();
                                j2w0Var.L$0 = context2;
                                j2w0Var.L$1 = arrayList4;
                                j2w0Var.L$2 = it6;
                                j2w0Var.L$3 = arrayList5;
                                j2w0Var.L$4 = it3;
                                j2w0Var.L$5 = n4qVar2;
                                j2w0Var.L$6 = collection2;
                                j2w0Var.label = i4;
                                Object k2 = myc0.k(dgn0.f().getIo(), new yzu(context2, n4qVar2, spjVar), j2w0Var);
                                if (k2 != coroutineSingletons2) {
                                    context4 = context2;
                                    obj = k2;
                                    ArrayList arrayList6 = arrayList5;
                                    it4 = it6;
                                    n4qVar = n4qVar2;
                                    arrayList3 = arrayList6;
                                    androidx.health.connect.client.aggregate.c cVar2 = (androidx.health.connect.client.aggregate.c) obj;
                                    Long l2 = (Long) cVar2.a(x0l0.g);
                                    int longValue2 = (int) (l2 == null ? l2.longValue() : 0L);
                                    c2z c2zVar2 = (c2z) cVar2.a(bhn.h);
                                    int i52 = 0;
                                    if (c2zVar2 == null) {
                                    }
                                    Iterator it52 = it3;
                                    int epochSecond2 = (int) (n4qVar.b().getEpochSecond() - n4qVar.a().getEpochSecond());
                                    long epochMilli2 = n4qVar.b().toEpochMilli() - n4qVar.a().toEpochMilli();
                                    jlp jlpVar2 = (jlp) cVar2.a(zcp0.h);
                                    if (jlpVar2 == null) {
                                    }
                                    int d2 = n4qVar.getMetadata().d();
                                    String str2 = "RECORDING_METHOD_UNKNOWN";
                                    if (d2 != 0) {
                                    }
                                }
                                return coroutineSingletons2;
                            }
                            collection2.add(arrayList5);
                            it2 = it6;
                            arrayList2 = arrayList4;
                            spjVar = null;
                            i4 = 2;
                            if (it2.hasNext()) {
                                ArrayList v = c5g.v(arrayList2);
                                xgx0.a.getClass();
                                xgx0.a("VkWorkoutsRepository.getWorkoutsFromHealthConnect() -> workouts parsed: " + v);
                                return v;
                            }
                            List a3 = ((k7f0) it2.next()).a();
                            arrayList5 = new ArrayList();
                            arrayList4 = arrayList2;
                            it3 = a3.iterator();
                            it6 = it2;
                            collection2 = arrayList4;
                            if (it3.hasNext()) {
                            }
                        }
                    }
                    String str3 = n4qVar.getMetadata().b().a() + '_' + str2;
                    String a4 = n4qVar.getMetadata().a();
                    if (a4 == null) {
                        a4 = n4qVar.getMetadata().c();
                    }
                    String h = n4qVar.h();
                    long epochMilli3 = n4qVar.a().toEpochMilli();
                    Long valueOf = Long.valueOf(n4qVar.b().toEpochMilli());
                    int f2 = n4qVar.f();
                    WorkoutData.WorkoutType workoutType2 = WorkoutData.WorkoutType.BIKING;
                    if (!izx0.a(f2, workoutType2)) {
                        workoutType2 = WorkoutData.WorkoutType.RUNNING;
                        if (!izx0.a(f2, workoutType2)) {
                            workoutType2 = WorkoutData.WorkoutType.SWIMMING;
                            if (!izx0.a(f2, workoutType2)) {
                                workoutType2 = WorkoutData.WorkoutType.OTHER;
                            }
                        }
                    }
                    String valueOf2 = String.valueOf(n4qVar.f());
                    String g = n4qVar.g();
                    if (g == null) {
                        g = "";
                    }
                    String str4 = g;
                    float f3 = epochSecond2;
                    float f4 = f3 / 60;
                    if (longValue2 == 0 || f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        workoutType = workoutType2;
                        j2w0Var2 = j2w0Var;
                    } else {
                        workoutType = workoutType2;
                        j2w0Var2 = j2w0Var;
                        if (f4 >= 0.25d) {
                            i2 = (int) (longValue2 / f4);
                            f = a / 1000;
                            if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || epochSecond2 == 0) {
                                coroutineSingletons = coroutineSingletons2;
                            } else {
                                coroutineSingletons = coroutineSingletons2;
                                if (f >= 0.1d) {
                                    i52 = (int) (f3 / f);
                                }
                            }
                            workoutData = new WorkoutData(a4, h, epochMilli3, valueOf, workoutType, valueOf2, str4, str3, str2, new WorkoutData.a(a, epochSecond2, epochMilli2, a2, Integer.valueOf(i52), Integer.valueOf(i2)));
                            xgx0.a.getClass();
                            xgx0.a("WorkoutDataParserHealthConnect parseWorkoutData -> " + workoutData + "\n, steps = " + longValue2);
                            if (workoutData != null) {
                            }
                            it3 = it52;
                            Iterator it62 = it4;
                            ArrayList arrayList52 = arrayList3;
                            context2 = context4;
                            coroutineSingletons2 = coroutineSingletons;
                            j2w0Var = j2w0Var2;
                            spjVar = null;
                            i4 = 2;
                            if (it3.hasNext()) {
                            }
                        }
                    }
                    i2 = 0;
                    f = a / 1000;
                    if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        coroutineSingletons = coroutineSingletons2;
                        if (f >= 0.1d) {
                        }
                        workoutData = new WorkoutData(a4, h, epochMilli3, valueOf, workoutType, valueOf2, str4, str3, str2, new WorkoutData.a(a, epochSecond2, epochMilli2, a2, Integer.valueOf(i52), Integer.valueOf(i2)));
                        xgx0.a.getClass();
                        xgx0.a("WorkoutDataParserHealthConnect parseWorkoutData -> " + workoutData + "\n, steps = " + longValue2);
                        if (workoutData != null) {
                        }
                        it3 = it52;
                        Iterator it622 = it4;
                        ArrayList arrayList522 = arrayList3;
                        context2 = context4;
                        coroutineSingletons2 = coroutineSingletons;
                        j2w0Var = j2w0Var2;
                        spjVar = null;
                        i4 = 2;
                        if (it3.hasNext()) {
                        }
                    }
                    coroutineSingletons = coroutineSingletons2;
                    workoutData = new WorkoutData(a4, h, epochMilli3, valueOf, workoutType, valueOf2, str4, str3, str2, new WorkoutData.a(a, epochSecond2, epochMilli2, a2, Integer.valueOf(i52), Integer.valueOf(i2)));
                    xgx0.a.getClass();
                    xgx0.a("WorkoutDataParserHealthConnect parseWorkoutData -> " + workoutData + "\n, steps = " + longValue2);
                    if (workoutData != null) {
                    }
                    it3 = it52;
                    Iterator it6222 = it4;
                    ArrayList arrayList5222 = arrayList3;
                    context2 = context4;
                    coroutineSingletons2 = coroutineSingletons;
                    j2w0Var = j2w0Var2;
                    spjVar = null;
                    i4 = 2;
                    if (it3.hasNext()) {
                    }
                }
            }
        }
        j2w0Var = new j2w0(this, continuationImpl);
        Object obj2 = j2w0Var.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = j2w0Var.label;
        spj spjVar2 = null;
        int i42 = 2;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, ContinuationImpl continuationImpl) {
        k2w0 k2w0Var;
        int i;
        if (continuationImpl instanceof k2w0) {
            k2w0Var = (k2w0) continuationImpl;
            int i2 = k2w0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k2w0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = k2w0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = k2w0Var.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return obj;
                }
                kotlin.a.a(obj);
                ovj io2 = dgn0.f().getIo();
                l2w0 l2w0Var = new l2w0(list, null);
                k2w0Var.label = 1;
                Object k = myc0.k(io2, l2w0Var, k2w0Var);
                return k == coroutineSingletons ? coroutineSingletons : k;
            }
        }
        k2w0Var = new k2w0(this, continuationImpl);
        Object obj2 = k2w0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = k2w0Var.label;
        if (i == 0) {
        }
    }
}
