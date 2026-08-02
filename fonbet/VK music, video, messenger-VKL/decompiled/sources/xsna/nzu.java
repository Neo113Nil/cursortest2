package xsna;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import androidx.health.platform.client.proto.b0;
import androidx.health.platform.client.proto.m;
import androidx.health.platform.client.proto.m0;
import androidx.health.platform.client.request.ReadDataRangeRequest;
import com.huawei.hms.hihealth.data.Field;
import com.ironsource.X3;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.c2z;
import xsna.d8o0;
import xsna.dqk;
import xsna.eg7;
import xsna.fzj0;
import xsna.gkk0;
import xsna.i4q;
import xsna.imr0;
import xsna.jlp;
import xsna.k1v;
import xsna.k4q;
import xsna.r0l0;
import xsna.swc0;
import xsna.uzj0;
import xsna.v6x0;
import xsna.vi10;
import xsna.vwc0;

/* compiled from: HealthConnectClientImpl.kt */
/* loaded from: classes12.dex */
public final class nzu implements czu, sx90 {
    public final ioi0 b;

    /* compiled from: HealthConnectClientImpl.kt */
    @b6l(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", l = {101}, m = "getGrantedPermissions")
    public static final class a extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return nzu.this.c(this);
        }
    }

    public nzu(Context context, String str) {
        if (str.length() == 0) {
            throw new IllegalArgumentException("Service package name must not be empty.");
        }
        ioi0 ioi0Var = new ioi0(context, new mcc0(str));
        str.equals("com.google.android.apps.healthdata");
        this.b = ioi0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // xsna.czu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(o71 o71Var, ContinuationImpl continuationImpl) {
        mzu mzuVar;
        int i;
        try {
            if (continuationImpl instanceof mzu) {
                mzuVar = (mzu) continuationImpl;
                int i2 = mzuVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mzuVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = mzuVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = mzuVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        lzi0 b = this.b.b(u71.a(o71Var));
                        mzuVar.label = 1;
                        obj = sv1.i(b, mzuVar);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    b0.d<androidx.health.platform.client.proto.j> s = ((androidx.health.platform.client.proto.u0) obj).s();
                    ArrayList arrayList = new ArrayList(c5g.u(s, 10));
                    for (androidx.health.platform.client.proto.j jVar : s) {
                        if (!jVar.z()) {
                            throw new IllegalArgumentException("start time must be set");
                        }
                        if (!jVar.y()) {
                            throw new IllegalArgumentException("end time must be set");
                        }
                        arrayList.add(new lb1(d370.H(jVar), Instant.ofEpochMilli(jVar.w()), Instant.ofEpochMilli(jVar.u()), ZoneOffset.ofTotalSeconds(jVar.x()), false));
                    }
                    List O0 = j5g.O0(arrayList);
                    O0.size();
                    return O0;
                }
            }
            if (i != 0) {
            }
            b0.d<androidx.health.platform.client.proto.j> s2 = ((androidx.health.platform.client.proto.u0) obj).s();
            ArrayList arrayList2 = new ArrayList(c5g.u(s2, 10));
            while (r9.hasNext()) {
            }
            List O02 = j5g.O0(arrayList2);
            O02.size();
            return O02;
        } catch (RemoteException e) {
            Throwable transactionTooLargeException = !(e instanceof DeadObjectException) ? e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage()) : new DeadObjectException(e.getMessage());
            transactionTooLargeException.initCause(e);
            throw transactionTooLargeException;
        }
        mzuVar = new mzu(this, continuationImpl);
        Object obj2 = mzuVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mzuVar.label;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r0v286, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v383, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v48, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v51, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v62, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v63, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v66, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v104, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v105 */
    /* JADX WARN: Type inference failed for: r4v106, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v44, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v50, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v51, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v54, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v55, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v61, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v63, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v29, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.czu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(j7f0 j7f0Var, ContinuationImpl continuationImpl) {
        ozu ozuVar;
        int i;
        boolean z;
        zef0 x1vVar;
        zef0 zef0Var;
        zef0 fg7Var;
        List list;
        ?? r1;
        ?? r12;
        k4q cVar;
        k4q k4qVar;
        c2z c2zVar;
        c2z c2zVar2;
        c2z c2zVar3;
        c2z c2zVar4;
        jlp jlpVar;
        jlp jlpVar2;
        List list2;
        try {
            if (continuationImpl instanceof ozu) {
                ozuVar = (ozu) continuationImpl;
                int i2 = ozuVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ozuVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = ozuVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = ozuVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        j7f0Var.getClass();
                        ioi0 ioi0Var = this.b;
                        androidx.health.platform.client.proto.r0 a2 = e7f0.a(j7f0Var);
                        ioi0Var.getClass();
                        lzi0 a3 = ioi0Var.a(1, new vxb(ioi0Var, new ReadDataRangeRequest(a2)));
                        ozuVar.label = 1;
                        obj = sv1.i(a3, ozuVar);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    androidx.health.platform.client.proto.v0 v0Var = (androidx.health.platform.client.proto.v0) obj;
                    b0.d<androidx.health.platform.client.proto.m> s = v0Var.s();
                    ArrayList arrayList = new ArrayList(c5g.u(s, 10));
                    for (androidx.health.platform.client.proto.m mVar : s) {
                        String v = mVar.v().v();
                        if (v != null) {
                            androidx.health.platform.client.proto.v0 v0Var2 = v0Var;
                            switch (v.hashCode()) {
                                case -2137162425:
                                    z = true;
                                    if (!v.equals("Height")) {
                                        break;
                                    } else {
                                        double a4 = r8e0.a(mVar, "height");
                                        c2z.d.getClass();
                                        x1vVar = new x1v(r8e0.k(mVar), r8e0.l(mVar), c2z.a.a(a4), r8e0.g(mVar));
                                        zef0Var = x1vVar;
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case -1931142571:
                                    z = true;
                                    if (!v.equals("BasalMetabolicRate")) {
                                        break;
                                    } else {
                                        double a5 = r8e0.a(mVar, "bmr");
                                        swc0.d.getClass();
                                        x1vVar = new f46(r8e0.k(mVar), r8e0.l(mVar), new swc0(a5, swc0.b.KILOCALORIES_PER_DAY), r8e0.g(mVar));
                                        zef0Var = x1vVar;
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case -1878699588:
                                    z = true;
                                    if (!v.equals("MenstruationPeriod")) {
                                        break;
                                    } else {
                                        zef0Var = new j320(r8e0.h(mVar), r8e0.i(mVar), r8e0.c(mVar), r8e0.d(mVar), r8e0.g(mVar));
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case -1739492291:
                                    z = true;
                                    if (!v.equals("HeartRateSeries")) {
                                        break;
                                    } else {
                                        Instant h = r8e0.h(mVar);
                                        ZoneOffset i3 = r8e0.i(mVar);
                                        Instant c = r8e0.c(mVar);
                                        ZoneOffset d = r8e0.d(mVar);
                                        b0.d<androidx.health.platform.client.proto.p> B = mVar.B();
                                        ArrayList arrayList2 = new ArrayList(c5g.u(B, 10));
                                        for (androidx.health.platform.client.proto.p pVar : B) {
                                            arrayList2.add(new k1v.a(Instant.ofEpochMilli(pVar.s()), r8e0.f(pVar)));
                                        }
                                        zef0Var = new k1v(h, i3, c, d, arrayList2, r8e0.g(mVar));
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case -1728782805:
                                    z = true;
                                    if (!v.equals("Vo2Max")) {
                                        break;
                                    } else {
                                        zef0Var = new qbw0(r8e0.k(mVar), r8e0.l(mVar), r8e0.g(mVar), r8e0.a(mVar, "vo2"), r8e0.m(mVar, "measurementMethod", qbw0.f));
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case -1707725160:
                                    z = true;
                                    if (!v.equals("Weight")) {
                                        break;
                                    } else {
                                        double a6 = r8e0.a(mVar, "weight");
                                        vi10.d.getClass();
                                        zef0Var = new jkx0(r8e0.k(mVar), r8e0.l(mVar), new vi10(a6, vi10.b.KILOGRAMS), r8e0.g(mVar));
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case -1547814841:
                                    z = true;
                                    if (!v.equals("HeartRateVariabilityRmssd")) {
                                        break;
                                    } else {
                                        double d2 = 1.0d;
                                        if (r8e0.a(mVar, "heartRateVariability") >= 1.0d) {
                                            d2 = 200.0d;
                                            if (r8e0.a(mVar, "heartRateVariability") <= 200.0d) {
                                                d2 = r8e0.a(mVar, "heartRateVariability");
                                            }
                                        }
                                        zef0Var = new l1v(r8e0.k(mVar), r8e0.l(mVar), d2, r8e0.g(mVar));
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case -1380153916:
                                    z = true;
                                    if (!v.equals("ActivityIntensity")) {
                                        break;
                                    } else {
                                        zef0Var = new r90(r8e0.h(mVar), r8e0.i(mVar), r8e0.c(mVar), r8e0.d(mVar), r8e0.g(mVar), r8e0.m(mVar, "activityIntensityType", r90.g));
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case -1249467044:
                                    z = true;
                                    if (!v.equals("LeanBodyMass")) {
                                        break;
                                    } else {
                                        double a7 = r8e0.a(mVar, "mass");
                                        vi10.d.getClass();
                                        zef0Var = new bzy(r8e0.k(mVar), r8e0.l(mVar), new vi10(a7, vi10.b.KILOGRAMS), r8e0.g(mVar));
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case -1170329975:
                                    z = true;
                                    if (!v.equals("SexualActivity")) {
                                        break;
                                    } else {
                                        zef0Var = new e4j0(r8e0.m(mVar, "protectionUsed", e4j0.e), r8e0.k(mVar), r8e0.l(mVar), r8e0.g(mVar));
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case -1089246824:
                                    z = true;
                                    if (!v.equals("TotalCaloriesBurned")) {
                                        break;
                                    } else {
                                        double a8 = r8e0.a(mVar, "energy");
                                        jlp.d.getClass();
                                        zef0Var = new zcp0(r8e0.h(mVar), r8e0.i(mVar), r8e0.c(mVar), r8e0.d(mVar), jlp.a.a(a8), r8e0.g(mVar));
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case -633416129:
                                    z = true;
                                    if (!v.equals("BloodPressure")) {
                                        break;
                                    } else {
                                        zef0Var = new jg7(r8e0.k(mVar), r8e0.l(mVar), r8e0.g(mVar), y2d0.a(r8e0.a(mVar, "systolic")), y2d0.a(r8e0.a(mVar, "diastolic")), r8e0.m(mVar, "bodyPosition", jg7.i), r8e0.m(mVar, "measurementLocation", jg7.h));
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case -562822786:
                                    z = true;
                                    if (!v.equals("SpeedSeries")) {
                                        break;
                                    } else {
                                        Instant h2 = r8e0.h(mVar);
                                        ZoneOffset i4 = r8e0.i(mVar);
                                        Instant c2 = r8e0.c(mVar);
                                        ZoneOffset d3 = r8e0.d(mVar);
                                        b0.d<androidx.health.platform.client.proto.p> B2 = mVar.B();
                                        ArrayList arrayList3 = new ArrayList(c5g.u(B2, 10));
                                        for (androidx.health.platform.client.proto.p pVar2 : B2) {
                                            Instant ofEpochMilli = Instant.ofEpochMilli(pVar2.s());
                                            double b = r8e0.b(pVar2, "speed");
                                            imr0.d.getClass();
                                            arrayList3.add(new gkk0.d(ofEpochMilli, imr0.a.a(b)));
                                        }
                                        zef0Var = new gkk0(h2, i4, c2, d3, arrayList3, r8e0.g(mVar));
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case -561665783:
                                    z = true;
                                    if (!v.equals("BodyWaterMass")) {
                                        break;
                                    } else {
                                        double a9 = r8e0.a(mVar, "mass");
                                        vi10.d.getClass();
                                        zef0Var = new vj7(r8e0.k(mVar), r8e0.l(mVar), new vi10(a9, vi10.b.KILOGRAMS), r8e0.g(mVar));
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case -539421262:
                                    z = true;
                                    if (!v.equals("OxygenSaturation")) {
                                        break;
                                    } else {
                                        zef0Var = new f690(r8e0.k(mVar), r8e0.l(mVar), new uv90(r8e0.a(mVar, "percentage")), r8e0.g(mVar));
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case -187790444:
                                    z = true;
                                    if (!v.equals("MindfulnessSession")) {
                                        break;
                                    } else {
                                        zef0Var = new mo20(r8e0.h(mVar), r8e0.i(mVar), r8e0.c(mVar), r8e0.d(mVar), r8e0.g(mVar), r8e0.m(mVar, "sessionType", mo20.i), r8e0.j(mVar, "title"), r8e0.j(mVar, "notes"));
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case -136898551:
                                    z = true;
                                    if (!v.equals("OvulationTest")) {
                                        break;
                                    } else {
                                        zef0Var = new i490(r8e0.m(mVar, "result", i490.e), r8e0.k(mVar), r8e0.l(mVar), r8e0.g(mVar));
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case 8847540:
                                    z = true;
                                    if (!v.equals("BloodGlucose")) {
                                        break;
                                    } else {
                                        LinkedHashMap linkedHashMap = eg7.d;
                                        fg7Var = new fg7(r8e0.k(mVar), r8e0.l(mVar), r8e0.g(mVar), new eg7(r8e0.a(mVar, "level"), eg7.a.MILLIMOLES_PER_LITER), r8e0.m(mVar, "specimenSource", fg7.j), r8e0.m(mVar, "mealType", wo10.a), r8e0.m(mVar, "relationToMeal", fg7.i));
                                        zef0Var = fg7Var;
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case 80208647:
                                    z = true;
                                    if (!v.equals("Steps")) {
                                        break;
                                    } else {
                                        fg7Var = new x0l0(r8e0.h(mVar), r8e0.i(mVar), r8e0.c(mVar), r8e0.d(mVar), r8e0.e(mVar, "count"), r8e0.g(mVar));
                                        zef0Var = fg7Var;
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case 128630298:
                                    z = true;
                                    if (!v.equals("ActiveCaloriesBurned")) {
                                        break;
                                    } else {
                                        double a10 = r8e0.a(mVar, "energy");
                                        jlp.d.getClass();
                                        zef0Var = new f80(r8e0.h(mVar), r8e0.i(mVar), r8e0.c(mVar), r8e0.d(mVar), jlp.a.a(a10), r8e0.g(mVar));
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case 187665747:
                                    z = true;
                                    if (!v.equals("BasalBodyTemperature")) {
                                        break;
                                    } else {
                                        zef0Var = new e46(r8e0.k(mVar), r8e0.l(mVar), r8e0.g(mVar), atv0.l(r8e0.a(mVar, "temperature")), r8e0.m(mVar, "measurementLocation", tj7.a));
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case 246984731:
                                    z = true;
                                    if (!v.equals("Menstruation")) {
                                        break;
                                    } else {
                                        zef0Var = new i320(r8e0.m(mVar, "flow", i320.e), r8e0.k(mVar), r8e0.l(mVar), r8e0.g(mVar));
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case 353103893:
                                    z = true;
                                    if (!v.equals("Distance")) {
                                        break;
                                    } else {
                                        double a11 = r8e0.a(mVar, "distance");
                                        c2z.d.getClass();
                                        zef0Var = new bhn(r8e0.h(mVar), r8e0.i(mVar), r8e0.c(mVar), r8e0.d(mVar), c2z.a.a(a11), r8e0.g(mVar));
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case 557067342:
                                    z = true;
                                    if (!v.equals("CervicalMucus")) {
                                        break;
                                    } else {
                                        zef0Var = new nqa(r8e0.k(mVar), r8e0.l(mVar), r8e0.g(mVar), r8e0.m(mVar, "texture", nqa.f), r8e0.m(mVar, "amount", nqa.g));
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case 578805655:
                                    z = true;
                                    if (!v.equals("SkinTemperature")) {
                                        break;
                                    } else {
                                        androidx.health.platform.client.proto.r rVar = mVar.H().get("baseline");
                                        c8o0 l = rVar != null ? atv0.l(rVar.u()) : null;
                                        int m = r8e0.m(mVar, "measurementLocation", fzj0.n);
                                        Instant h3 = r8e0.h(mVar);
                                        ZoneOffset i5 = r8e0.i(mVar);
                                        Instant c3 = r8e0.c(mVar);
                                        ZoneOffset d4 = r8e0.d(mVar);
                                        m.b bVar = mVar.E().get("deltas");
                                        if (bVar != null) {
                                            b0.d<androidx.health.platform.client.proto.q> t = bVar.t();
                                            list = new ArrayList(c5g.u(t, 10));
                                            for (androidx.health.platform.client.proto.q qVar : t) {
                                                Instant ofEpochMilli2 = Instant.ofEpochMilli(qVar.t());
                                                d8o0.a aVar = d8o0.d;
                                                androidx.health.platform.client.proto.r rVar2 = qVar.u().get("temperatureDelta");
                                                double u = rVar2 != null ? rVar2.u() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                                                aVar.getClass();
                                                list.add(new fzj0.d(ofEpochMilli2, d8o0.a.a(u)));
                                            }
                                        } else {
                                            list = EmptyList.b;
                                        }
                                        fg7Var = new fzj0(h3, i5, c3, d4, r8e0.g(mVar), list, l, m);
                                        zef0Var = fg7Var;
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case 761063032:
                                    z = true;
                                    if (!v.equals("RestingHeartRate")) {
                                        break;
                                    } else {
                                        zef0Var = new vbg0(r8e0.k(mVar), r8e0.l(mVar), r8e0.e(mVar, "bpm"), r8e0.g(mVar));
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case 955204109:
                                    z = true;
                                    if (!v.equals("FloorsClimbed")) {
                                        break;
                                    } else {
                                        zef0Var = new jsr(r8e0.h(mVar), r8e0.i(mVar), r8e0.c(mVar), r8e0.d(mVar), r8e0.a(mVar, "floors"), r8e0.g(mVar));
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case 989918314:
                                    z = true;
                                    if (!v.equals("RespiratoryRate")) {
                                        break;
                                    } else {
                                        zef0Var = new ibg0(r8e0.k(mVar), r8e0.l(mVar), r8e0.a(mVar, "rate"), r8e0.g(mVar));
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case 1051870422:
                                    z = true;
                                    if (!v.equals("Hydration")) {
                                        break;
                                    } else {
                                        double a12 = r8e0.a(mVar, "volume");
                                        v6x0.d.getClass();
                                        zef0Var = new olv(r8e0.h(mVar), r8e0.i(mVar), r8e0.c(mVar), r8e0.d(mVar), new v6x0(a12, v6x0.b.LITERS), r8e0.g(mVar));
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case 1108584865:
                                    z = true;
                                    if (!v.equals("StepsCadenceSeries")) {
                                        break;
                                    } else {
                                        Instant h4 = r8e0.h(mVar);
                                        ZoneOffset i6 = r8e0.i(mVar);
                                        Instant c4 = r8e0.c(mVar);
                                        ZoneOffset d5 = r8e0.d(mVar);
                                        b0.d<androidx.health.platform.client.proto.p> B3 = mVar.B();
                                        ArrayList arrayList4 = new ArrayList(c5g.u(B3, 10));
                                        for (androidx.health.platform.client.proto.p pVar3 : B3) {
                                            arrayList4.add(new r0l0.a(r8e0.b(pVar3, "rate"), Instant.ofEpochMilli(pVar3.s())));
                                        }
                                        fg7Var = new r0l0(h4, i6, c4, d5, arrayList4, r8e0.g(mVar));
                                        zef0Var = fg7Var;
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case 1193457969:
                                    z = true;
                                    if (!v.equals("IntermenstrualBleeding")) {
                                        break;
                                    } else {
                                        zef0Var = new nfx(r8e0.k(mVar), r8e0.l(mVar), r8e0.g(mVar));
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case 1468615931:
                                    z = true;
                                    if (!v.equals("ElevationGained")) {
                                        break;
                                    } else {
                                        double a13 = r8e0.a(mVar, "elevation");
                                        c2z.d.getClass();
                                        zef0Var = new cbp(r8e0.h(mVar), r8e0.i(mVar), r8e0.c(mVar), r8e0.d(mVar), c2z.a.a(a13), r8e0.g(mVar));
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case 1478142546:
                                    z = true;
                                    if (!v.equals("WheelchairPushes")) {
                                        break;
                                    } else {
                                        fg7Var = new qkx0(r8e0.h(mVar), r8e0.i(mVar), r8e0.c(mVar), r8e0.d(mVar), r8e0.e(mVar, "count"), r8e0.g(mVar));
                                        zef0Var = fg7Var;
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case 1498531293:
                                    z = true;
                                    if (!v.equals("CyclingPedalingCadenceSeries")) {
                                        break;
                                    } else {
                                        Instant h5 = r8e0.h(mVar);
                                        ZoneOffset i7 = r8e0.i(mVar);
                                        Instant c5 = r8e0.c(mVar);
                                        ZoneOffset d6 = r8e0.d(mVar);
                                        b0.d<androidx.health.platform.client.proto.p> B4 = mVar.B();
                                        ArrayList arrayList5 = new ArrayList(c5g.u(B4, 10));
                                        for (androidx.health.platform.client.proto.p pVar4 : B4) {
                                            arrayList5.add(new dqk.a(r8e0.b(pVar4, "rpm"), Instant.ofEpochMilli(pVar4.s())));
                                        }
                                        zef0Var = new dqk(h5, i7, c5, d6, arrayList5, r8e0.g(mVar));
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case 1513758823:
                                    if (!v.equals("ActivitySession")) {
                                        break;
                                    } else {
                                        int m2 = r8e0.m(mVar, "activityType", n4q.n);
                                        String j = r8e0.j(mVar, "title");
                                        String j2 = r8e0.j(mVar, "notes");
                                        Instant h6 = r8e0.h(mVar);
                                        ZoneOffset i8 = r8e0.i(mVar);
                                        Instant c6 = r8e0.c(mVar);
                                        ZoneOffset d7 = r8e0.d(mVar);
                                        hi20 g = r8e0.g(mVar);
                                        m.b bVar2 = mVar.E().get(AnalyticsBaseParamsConstantsKt.SEGMENTS);
                                        if (bVar2 != null) {
                                            b0.d<androidx.health.platform.client.proto.q> t2 = bVar2.t();
                                            r1 = new ArrayList(c5g.u(t2, 10));
                                            for (androidx.health.platform.client.proto.q qVar2 : t2) {
                                                Instant ofEpochMilli3 = Instant.ofEpochMilli(qVar2.t());
                                                Instant ofEpochMilli4 = Instant.ofEpochMilli(qVar2.s());
                                                androidx.health.platform.client.proto.r rVar3 = qVar2.u().get("type");
                                                int intValue = (rVar3 != null ? Long.valueOf(rVar3.w()) : 0).intValue();
                                                androidx.health.platform.client.proto.r rVar4 = qVar2.u().get("reps");
                                                r1.add(new l4q(ofEpochMilli3, ofEpochMilli4, intValue, rVar4 != null ? (int) rVar4.w() : 0));
                                            }
                                        } else {
                                            r1 = EmptyList.b;
                                        }
                                        List list3 = r1;
                                        m.b bVar3 = mVar.E().get("laps");
                                        if (bVar3 != null) {
                                            b0.d<androidx.health.platform.client.proto.q> t3 = bVar3.t();
                                            r12 = new ArrayList(c5g.u(t3, 10));
                                            for (androidx.health.platform.client.proto.q qVar3 : t3) {
                                                Instant ofEpochMilli5 = Instant.ofEpochMilli(qVar3.t());
                                                Instant ofEpochMilli6 = Instant.ofEpochMilli(qVar3.s());
                                                androidx.health.platform.client.proto.r rVar5 = qVar3.u().get("length");
                                                if (rVar5 != null) {
                                                    double u2 = rVar5.u();
                                                    c2z.d.getClass();
                                                    c2zVar4 = c2z.a.a(u2);
                                                } else {
                                                    c2zVar4 = null;
                                                }
                                                r12.add(new g4q(ofEpochMilli5, ofEpochMilli6, c2zVar4));
                                            }
                                        } else {
                                            r12 = EmptyList.b;
                                        }
                                        List list4 = r12;
                                        m.b bVar4 = mVar.E().get("route");
                                        if (bVar4 != null) {
                                            b0.d<androidx.health.platform.client.proto.q> t4 = bVar4.t();
                                            ArrayList arrayList6 = new ArrayList(c5g.u(t4, 10));
                                            for (androidx.health.platform.client.proto.q qVar4 : t4) {
                                                Instant ofEpochMilli7 = Instant.ofEpochMilli(qVar4.t());
                                                androidx.health.platform.client.proto.r rVar6 = qVar4.u().get("latitude");
                                                double u3 = rVar6 != null ? rVar6.u() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                                                androidx.health.platform.client.proto.r rVar7 = qVar4.u().get("longitude");
                                                double u4 = rVar7 != null ? rVar7.u() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                                                androidx.health.platform.client.proto.r rVar8 = qVar4.u().get("altitude");
                                                if (rVar8 != null) {
                                                    double u5 = rVar8.u();
                                                    c2z.d.getClass();
                                                    c2zVar = c2z.a.a(u5);
                                                } else {
                                                    c2zVar = null;
                                                }
                                                androidx.health.platform.client.proto.r rVar9 = qVar4.u().get("horizontal_accuracy");
                                                if (rVar9 != null) {
                                                    double u6 = rVar9.u();
                                                    c2z.d.getClass();
                                                    c2zVar2 = c2z.a.a(u6);
                                                } else {
                                                    c2zVar2 = null;
                                                }
                                                androidx.health.platform.client.proto.r rVar10 = qVar4.u().get("vertical_accuracy");
                                                if (rVar10 != null) {
                                                    double u7 = rVar10.u();
                                                    c2z.d.getClass();
                                                    c2zVar3 = c2z.a.a(u7);
                                                } else {
                                                    c2zVar3 = null;
                                                }
                                                arrayList6.add(new i4q.a(ofEpochMilli7, u3, u4, c2zVar2, c2zVar3, c2zVar));
                                            }
                                            k4qVar = new k4q.b(new i4q(arrayList6));
                                            z = true;
                                        } else {
                                            androidx.health.platform.client.proto.r rVar11 = mVar.H().get("hasRoute");
                                            if (rVar11 != null) {
                                                z = true;
                                                if (rVar11.s()) {
                                                    cVar = new k4q.a();
                                                    k4qVar = cVar;
                                                }
                                            } else {
                                                z = true;
                                            }
                                            cVar = new k4q.c();
                                            k4qVar = cVar;
                                        }
                                        fg7Var = new n4q(h6, i8, c6, d7, g, m2, j, j2, list3, list4, k4qVar, null);
                                        zef0Var = fg7Var;
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case 1584919122:
                                    if (!v.equals("BodyTemperature")) {
                                        break;
                                    } else {
                                        zef0Var = new uj7(r8e0.k(mVar), r8e0.l(mVar), r8e0.g(mVar), atv0.l(r8e0.a(mVar, "temperature")), r8e0.m(mVar, "measurementLocation", tj7.a));
                                        z = true;
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case 1719563767:
                                    if (!v.equals("BodyFat")) {
                                        break;
                                    } else {
                                        zef0Var = new oj7(r8e0.k(mVar), r8e0.l(mVar), new uv90(r8e0.a(mVar, "percentage")), r8e0.g(mVar));
                                        z = true;
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case 1738316664:
                                    if (!v.equals("Nutrition")) {
                                        break;
                                    } else {
                                        androidx.health.platform.client.proto.r rVar12 = mVar.H().get("biotin");
                                        vi10 a14 = rVar12 != null ? wi10.a(rVar12.u()) : null;
                                        androidx.health.platform.client.proto.r rVar13 = mVar.H().get("caffeine");
                                        vi10 a15 = rVar13 != null ? wi10.a(rVar13.u()) : null;
                                        androidx.health.platform.client.proto.r rVar14 = mVar.H().get(Field.NUTRIENTS_FACTS_CALCIUM);
                                        vi10 a16 = rVar14 != null ? wi10.a(rVar14.u()) : null;
                                        androidx.health.platform.client.proto.r rVar15 = mVar.H().get(Field.NUTRIENTS_FACTS_CALORIES);
                                        if (rVar15 != null) {
                                            double u8 = rVar15.u();
                                            jlp.d.getClass();
                                            jlpVar = jlp.a.a(u8);
                                        } else {
                                            jlpVar = null;
                                        }
                                        androidx.health.platform.client.proto.r rVar16 = mVar.H().get("caloriesFromFat");
                                        if (rVar16 != null) {
                                            double u9 = rVar16.u();
                                            jlp.d.getClass();
                                            jlpVar2 = jlp.a.a(u9);
                                        } else {
                                            jlpVar2 = null;
                                        }
                                        androidx.health.platform.client.proto.r rVar17 = mVar.H().get("chloride");
                                        vi10 a17 = rVar17 != null ? wi10.a(rVar17.u()) : null;
                                        androidx.health.platform.client.proto.r rVar18 = mVar.H().get(Field.NUTRIENTS_FACTS_CHOLESTEROL);
                                        vi10 a18 = rVar18 != null ? wi10.a(rVar18.u()) : null;
                                        androidx.health.platform.client.proto.r rVar19 = mVar.H().get("chromium");
                                        vi10 a19 = rVar19 != null ? wi10.a(rVar19.u()) : null;
                                        androidx.health.platform.client.proto.r rVar20 = mVar.H().get("copper");
                                        vi10 a20 = rVar20 != null ? wi10.a(rVar20.u()) : null;
                                        androidx.health.platform.client.proto.r rVar21 = mVar.H().get("dietaryFiber");
                                        vi10 a21 = rVar21 != null ? wi10.a(rVar21.u()) : null;
                                        androidx.health.platform.client.proto.r rVar22 = mVar.H().get("folate");
                                        vi10 a22 = rVar22 != null ? wi10.a(rVar22.u()) : null;
                                        androidx.health.platform.client.proto.r rVar23 = mVar.H().get("folicAcid");
                                        vi10 a23 = rVar23 != null ? wi10.a(rVar23.u()) : null;
                                        androidx.health.platform.client.proto.r rVar24 = mVar.H().get("iodine");
                                        vi10 a24 = rVar24 != null ? wi10.a(rVar24.u()) : null;
                                        androidx.health.platform.client.proto.r rVar25 = mVar.H().get(Field.NUTRIENTS_FACTS_IRON);
                                        vi10 a25 = rVar25 != null ? wi10.a(rVar25.u()) : null;
                                        androidx.health.platform.client.proto.r rVar26 = mVar.H().get("magnesium");
                                        vi10 a26 = rVar26 != null ? wi10.a(rVar26.u()) : null;
                                        androidx.health.platform.client.proto.r rVar27 = mVar.H().get("manganese");
                                        vi10 a27 = rVar27 != null ? wi10.a(rVar27.u()) : null;
                                        androidx.health.platform.client.proto.r rVar28 = mVar.H().get("molybdenum");
                                        vi10 a28 = rVar28 != null ? wi10.a(rVar28.u()) : null;
                                        androidx.health.platform.client.proto.r rVar29 = mVar.H().get("monounsaturatedFat");
                                        vi10 a29 = rVar29 != null ? wi10.a(rVar29.u()) : null;
                                        androidx.health.platform.client.proto.r rVar30 = mVar.H().get("niacin");
                                        vi10 a30 = rVar30 != null ? wi10.a(rVar30.u()) : null;
                                        androidx.health.platform.client.proto.r rVar31 = mVar.H().get("pantothenicAcid");
                                        vi10 a31 = rVar31 != null ? wi10.a(rVar31.u()) : null;
                                        androidx.health.platform.client.proto.r rVar32 = mVar.H().get("phosphorus");
                                        vi10 a32 = rVar32 != null ? wi10.a(rVar32.u()) : null;
                                        androidx.health.platform.client.proto.r rVar33 = mVar.H().get("polyunsaturatedFat");
                                        vi10 a33 = rVar33 != null ? wi10.a(rVar33.u()) : null;
                                        androidx.health.platform.client.proto.r rVar34 = mVar.H().get(Field.NUTRIENTS_FACTS_POTASSIUM);
                                        vi10 a34 = rVar34 != null ? wi10.a(rVar34.u()) : null;
                                        androidx.health.platform.client.proto.r rVar35 = mVar.H().get(Field.NUTRIENTS_FACTS_PROTEIN);
                                        vi10 a35 = rVar35 != null ? wi10.a(rVar35.u()) : null;
                                        androidx.health.platform.client.proto.r rVar36 = mVar.H().get("riboflavin");
                                        vi10 a36 = rVar36 != null ? wi10.a(rVar36.u()) : null;
                                        androidx.health.platform.client.proto.r rVar37 = mVar.H().get("saturatedFat");
                                        vi10 a37 = rVar37 != null ? wi10.a(rVar37.u()) : null;
                                        androidx.health.platform.client.proto.r rVar38 = mVar.H().get("selenium");
                                        vi10 a38 = rVar38 != null ? wi10.a(rVar38.u()) : null;
                                        androidx.health.platform.client.proto.r rVar39 = mVar.H().get(Field.NUTRIENTS_FACTS_SODIUM);
                                        vi10 a39 = rVar39 != null ? wi10.a(rVar39.u()) : null;
                                        androidx.health.platform.client.proto.r rVar40 = mVar.H().get(Field.NUTRIENTS_FACTS_SUGAR);
                                        vi10 a40 = rVar40 != null ? wi10.a(rVar40.u()) : null;
                                        androidx.health.platform.client.proto.r rVar41 = mVar.H().get("thiamin");
                                        vi10 a41 = rVar41 != null ? wi10.a(rVar41.u()) : null;
                                        androidx.health.platform.client.proto.r rVar42 = mVar.H().get("totalCarbohydrate");
                                        vi10 a42 = rVar42 != null ? wi10.a(rVar42.u()) : null;
                                        androidx.health.platform.client.proto.r rVar43 = mVar.H().get("totalFat");
                                        vi10 a43 = rVar43 != null ? wi10.a(rVar43.u()) : null;
                                        androidx.health.platform.client.proto.r rVar44 = mVar.H().get("transFat");
                                        vi10 a44 = rVar44 != null ? wi10.a(rVar44.u()) : null;
                                        androidx.health.platform.client.proto.r rVar45 = mVar.H().get("unsaturatedFat");
                                        vi10 a45 = rVar45 != null ? wi10.a(rVar45.u()) : null;
                                        androidx.health.platform.client.proto.r rVar46 = mVar.H().get("vitaminA");
                                        vi10 a46 = rVar46 != null ? wi10.a(rVar46.u()) : null;
                                        androidx.health.platform.client.proto.r rVar47 = mVar.H().get("vitaminB12");
                                        vi10 a47 = rVar47 != null ? wi10.a(rVar47.u()) : null;
                                        androidx.health.platform.client.proto.r rVar48 = mVar.H().get("vitaminB6");
                                        vi10 a48 = rVar48 != null ? wi10.a(rVar48.u()) : null;
                                        androidx.health.platform.client.proto.r rVar49 = mVar.H().get("vitaminC");
                                        vi10 a49 = rVar49 != null ? wi10.a(rVar49.u()) : null;
                                        androidx.health.platform.client.proto.r rVar50 = mVar.H().get("vitaminD");
                                        vi10 a50 = rVar50 != null ? wi10.a(rVar50.u()) : null;
                                        androidx.health.platform.client.proto.r rVar51 = mVar.H().get("vitaminE");
                                        vi10 a51 = rVar51 != null ? wi10.a(rVar51.u()) : null;
                                        androidx.health.platform.client.proto.r rVar52 = mVar.H().get("vitaminK");
                                        vi10 a52 = rVar52 != null ? wi10.a(rVar52.u()) : null;
                                        androidx.health.platform.client.proto.r rVar53 = mVar.H().get("zinc");
                                        zef0Var = new yn70(r8e0.h(mVar), r8e0.i(mVar), r8e0.c(mVar), r8e0.d(mVar), r8e0.g(mVar), a14, a15, a16, jlpVar, jlpVar2, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, a30, a31, a32, a33, a34, a35, a36, a37, a38, a39, a40, a41, a42, a43, a44, a45, a46, a47, a48, a49, a50, a51, a52, rVar53 != null ? wi10.a(rVar53.u()) : null, r8e0.j(mVar, "name"), r8e0.m(mVar, "mealType", wo10.a));
                                        z = true;
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case 2034898936:
                                    if (!v.equals("BoneMass")) {
                                        break;
                                    } else {
                                        double a53 = r8e0.a(mVar, "mass");
                                        vi10.d.getClass();
                                        zef0Var = new xj7(r8e0.k(mVar), r8e0.l(mVar), new vi10(a53, vi10.b.KILOGRAMS), r8e0.g(mVar));
                                        z = true;
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case 2065313759:
                                    if (!v.equals("SleepSession")) {
                                        break;
                                    } else {
                                        String j3 = r8e0.j(mVar, "title");
                                        String j4 = r8e0.j(mVar, "notes");
                                        Instant h7 = r8e0.h(mVar);
                                        ZoneOffset i9 = r8e0.i(mVar);
                                        Instant c7 = r8e0.c(mVar);
                                        ZoneOffset d8 = r8e0.d(mVar);
                                        m.b bVar5 = mVar.E().get("stages");
                                        if (bVar5 != null) {
                                            b0.d t5 = bVar5.t();
                                            list2 = new ArrayList(c5g.u(t5, 10));
                                            Iterator it = t5.iterator();
                                            while (it.hasNext()) {
                                                androidx.health.platform.client.proto.q qVar5 = (androidx.health.platform.client.proto.q) it.next();
                                                Instant ofEpochMilli8 = Instant.ofEpochMilli(qVar5.t());
                                                Instant ofEpochMilli9 = Instant.ofEpochMilli(qVar5.s());
                                                Iterator it2 = it;
                                                ?? r0 = uzj0.j;
                                                androidx.health.platform.client.proto.r rVar54 = qVar5.u().get(X3.i.q);
                                                Integer num = (Integer) r0.get(rVar54 != null ? rVar54.v() : null);
                                                list2.add(new uzj0.a(ofEpochMilli8, ofEpochMilli9, num != null ? num.intValue() : 0));
                                                it = it2;
                                            }
                                        } else {
                                            list2 = EmptyList.b;
                                        }
                                        zef0Var = new uzj0(h7, i9, c7, d8, r8e0.g(mVar), j3, j4, list2);
                                        z = true;
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                                case 2095285180:
                                    if (!v.equals("PowerSeries")) {
                                        break;
                                    } else {
                                        Instant h8 = r8e0.h(mVar);
                                        ZoneOffset i10 = r8e0.i(mVar);
                                        Instant c8 = r8e0.c(mVar);
                                        ZoneOffset d9 = r8e0.d(mVar);
                                        b0.d<androidx.health.platform.client.proto.p> B5 = mVar.B();
                                        ArrayList arrayList7 = new ArrayList(c5g.u(B5, 10));
                                        for (androidx.health.platform.client.proto.p pVar5 : B5) {
                                            Instant ofEpochMilli10 = Instant.ofEpochMilli(pVar5.s());
                                            double b2 = r8e0.b(pVar5, "power");
                                            swc0.d.getClass();
                                            arrayList7.add(new vwc0.d(ofEpochMilli10, swc0.a.a(b2)));
                                        }
                                        zef0Var = new vwc0(h8, i10, c8, d9, arrayList7, r8e0.g(mVar));
                                        z = true;
                                        arrayList.add(zef0Var);
                                        v0Var = v0Var2;
                                    }
                            }
                        }
                        throw new RuntimeException("Unknown data type " + mVar.v().v());
                    }
                    return new k7f0(v0Var.t(), arrayList);
                }
            }
            if (i != 0) {
            }
            androidx.health.platform.client.proto.v0 v0Var3 = (androidx.health.platform.client.proto.v0) obj;
            b0.d<androidx.health.platform.client.proto.m> s2 = v0Var3.s();
            ArrayList arrayList8 = new ArrayList(c5g.u(s2, 10));
            while (r2.hasNext()) {
            }
            return new k7f0(v0Var3.t(), arrayList8);
        } catch (RemoteException e) {
            Throwable transactionTooLargeException = !(e instanceof DeadObjectException) ? e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage()) : new DeadObjectException(e.getMessage());
            transactionTooLargeException.initCause(e);
            throw transactionTooLargeException;
        }
        ozuVar = new ozu(this, continuationImpl);
        Object obj2 = ozuVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ozuVar.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a5 A[Catch: RemoteException -> 0x002b, LOOP:0: B:12:0x009f->B:14:0x00a5, LOOP_END, TryCatch #0 {RemoteException -> 0x002b, blocks: (B:10:0x0027, B:11:0x0090, B:12:0x009f, B:14:0x00a5, B:16:0x00b3, B:24:0x0039, B:25:0x004b, B:27:0x0054, B:29:0x0072), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // xsna.sx90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(spj<? super Set<String>> spjVar) {
        a aVar;
        int i;
        Iterator it;
        try {
            if (spjVar instanceof a) {
                aVar = (a) spjVar;
                int i2 = aVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = aVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        ioi0 ioi0Var = this.b;
                        ListBuilder listBuilder = p0v.c;
                        ArrayList arrayList = new ArrayList(c5g.u(listBuilder, 10));
                        ListIterator listIterator = listBuilder.listIterator(0);
                        while (true) {
                            ListBuilder.a aVar2 = (ListBuilder.a) listIterator;
                            if (!aVar2.hasNext()) {
                                break;
                            }
                            String str = (String) aVar2.next();
                            m0.a v = androidx.health.platform.client.proto.m0.v();
                            v.j();
                            androidx.health.platform.client.proto.m0.t((androidx.health.platform.client.proto.m0) v.c, str);
                            arrayList.add(v.e());
                        }
                        Set S0 = j5g.S0(arrayList);
                        ioi0Var.getClass();
                        lzi0 a2 = ioi0Var.a(Math.min(1, 5), new yqg0(ioi0Var, S0));
                        aVar.label = 1;
                        obj = sv1.i(a2, aVar);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    Iterable iterable = (Iterable) obj;
                    ArrayList arrayList2 = new ArrayList(c5g.u(iterable, 10));
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((androidx.health.platform.client.proto.m0) it.next()).u());
                    }
                    Set S02 = j5g.S0(arrayList2);
                    S02.size();
                    p0v.c.size();
                    return S02;
                }
            }
            if (i != 0) {
            }
            Iterable iterable2 = (Iterable) obj;
            ArrayList arrayList22 = new ArrayList(c5g.u(iterable2, 10));
            it = iterable2.iterator();
            while (it.hasNext()) {
            }
            Set S022 = j5g.S0(arrayList22);
            S022.size();
            p0v.c.size();
            return S022;
        } catch (RemoteException e) {
            Throwable transactionTooLargeException = !(e instanceof DeadObjectException) ? e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage()) : new DeadObjectException(e.getMessage());
            transactionTooLargeException.initCause(e);
            throw transactionTooLargeException;
        }
        aVar = new a((ContinuationImpl) spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // xsna.czu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(t71 t71Var, ContinuationImpl continuationImpl) {
        lzu lzuVar;
        int i;
        try {
            if (continuationImpl instanceof lzu) {
                lzuVar = (lzu) continuationImpl;
                int i2 = lzuVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lzuVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = lzuVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = lzuVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        lzi0 b = this.b.b(u71.b(t71Var));
                        lzuVar.label = 1;
                        obj = sv1.i(b, lzuVar);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    androidx.health.connect.client.aggregate.c H = d370.H((androidx.health.platform.client.proto.j) j5g.Y(((androidx.health.platform.client.proto.u0) obj).s()));
                    H.a.size();
                    H.b.size();
                    return H;
                }
            }
            if (i != 0) {
            }
            androidx.health.connect.client.aggregate.c H2 = d370.H((androidx.health.platform.client.proto.j) j5g.Y(((androidx.health.platform.client.proto.u0) obj).s()));
            H2.a.size();
            H2.b.size();
            return H2;
        } catch (RemoteException e) {
            Throwable transactionTooLargeException = !(e instanceof DeadObjectException) ? e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage()) : new DeadObjectException(e.getMessage());
            transactionTooLargeException.initCause(e);
            throw transactionTooLargeException;
        }
        lzuVar = new lzu(this, continuationImpl);
        Object obj2 = lzuVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lzuVar.label;
    }

    @Override // xsna.czu
    public final sx90 e() {
        return this;
    }
}
