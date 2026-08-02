package xsna;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.health.connect.AggregateRecordsGroupedByDurationResponse;
import android.health.connect.AggregateRecordsResponse;
import android.health.connect.HealthConnectException;
import android.health.connect.HealthConnectManager;
import android.health.connect.ReadRecordsResponse;
import android.health.connect.datatypes.ActiveCaloriesBurnedRecord;
import android.health.connect.datatypes.ActivityIntensityRecord;
import android.health.connect.datatypes.BasalBodyTemperatureRecord;
import android.health.connect.datatypes.BasalMetabolicRateRecord;
import android.health.connect.datatypes.BloodGlucoseRecord;
import android.health.connect.datatypes.BloodPressureRecord;
import android.health.connect.datatypes.BodyFatRecord;
import android.health.connect.datatypes.BodyTemperatureRecord;
import android.health.connect.datatypes.BodyWaterMassRecord;
import android.health.connect.datatypes.BoneMassRecord;
import android.health.connect.datatypes.CervicalMucusRecord;
import android.health.connect.datatypes.CyclingPedalingCadenceRecord;
import android.health.connect.datatypes.DistanceRecord;
import android.health.connect.datatypes.ElevationGainedRecord;
import android.health.connect.datatypes.ExerciseCompletionGoal;
import android.health.connect.datatypes.ExerciseLap;
import android.health.connect.datatypes.ExercisePerformanceGoal;
import android.health.connect.datatypes.ExerciseRoute;
import android.health.connect.datatypes.ExerciseSegment;
import android.health.connect.datatypes.ExerciseSessionRecord;
import android.health.connect.datatypes.FloorsClimbedRecord;
import android.health.connect.datatypes.HeartRateRecord;
import android.health.connect.datatypes.HeartRateVariabilityRmssdRecord;
import android.health.connect.datatypes.HeightRecord;
import android.health.connect.datatypes.HydrationRecord;
import android.health.connect.datatypes.IntermenstrualBleedingRecord;
import android.health.connect.datatypes.LeanBodyMassRecord;
import android.health.connect.datatypes.MenstruationFlowRecord;
import android.health.connect.datatypes.MenstruationPeriodRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.MindfulnessSessionRecord;
import android.health.connect.datatypes.NutritionRecord;
import android.health.connect.datatypes.OvulationTestRecord;
import android.health.connect.datatypes.OxygenSaturationRecord;
import android.health.connect.datatypes.PlannedExerciseBlock;
import android.health.connect.datatypes.PlannedExerciseSessionRecord;
import android.health.connect.datatypes.PlannedExerciseStep;
import android.health.connect.datatypes.PowerRecord;
import android.health.connect.datatypes.Record;
import android.health.connect.datatypes.RespiratoryRateRecord;
import android.health.connect.datatypes.RestingHeartRateRecord;
import android.health.connect.datatypes.SexualActivityRecord;
import android.health.connect.datatypes.SkinTemperatureRecord;
import android.health.connect.datatypes.SleepSessionRecord;
import android.health.connect.datatypes.SpeedRecord;
import android.health.connect.datatypes.StepsCadenceRecord;
import android.health.connect.datatypes.StepsRecord;
import android.health.connect.datatypes.TotalCaloriesBurnedRecord;
import android.health.connect.datatypes.Vo2MaxRecord;
import android.health.connect.datatypes.WeightRecord;
import android.health.connect.datatypes.WheelchairPushesRecord;
import android.health.connect.datatypes.units.BloodGlucose;
import android.health.connect.datatypes.units.Energy;
import android.health.connect.datatypes.units.Length;
import android.health.connect.datatypes.units.Mass;
import android.health.connect.datatypes.units.Percentage;
import android.health.connect.datatypes.units.Power;
import android.health.connect.datatypes.units.Pressure;
import android.health.connect.datatypes.units.Temperature;
import android.health.connect.datatypes.units.TemperatureDelta;
import android.health.connect.datatypes.units.Velocity;
import android.health.connect.datatypes.units.Volume;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.health.connect.client.aggregate.AggregateMetric;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.zone.ZoneRules;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.collections.builders.SetBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.c8o0;
import xsna.d8o0;
import xsna.dqk;
import xsna.eg7;
import xsna.f4q;
import xsna.fzj0;
import xsna.gkk0;
import xsna.h4q;
import xsna.i4q;
import xsna.imr0;
import xsna.jlp;
import xsna.k1v;
import xsna.k4q;
import xsna.r0l0;
import xsna.swc0;
import xsna.uzj0;
import xsna.v6x0;
import xsna.vwc0;
import xsna.x2d0;

/* compiled from: HealthConnectClientUpsideDownImpl.kt */
/* loaded from: classes12.dex */
public final class qzu implements czu, sx90 {
    public final Executor b;
    public final Context c;
    public final HealthConnectManager d;

    /* compiled from: HealthConnectClientUpsideDownImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Collection<String>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Collection<String> collection) {
            ((Context) this.receiver).revokeSelfPermissionsOnKill(collection);
            return s3q0.a;
        }
    }

    public qzu() {
        throw null;
    }

    public qzu(Context context) {
        new a(1, context, Context.class, "revokeSelfPermissionsOnKill", "revokeSelfPermissionsOnKill(Ljava/util/Collection;)V", 0);
        this.b = qu5.a(bdn.b);
        this.c = context;
        this.d = p81.c(context.getSystemService("healthconnect"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x005f, code lost:
    
        if (r2 == r4) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // xsna.czu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(o71 o71Var, ContinuationImpl continuationImpl) {
        tzu tzuVar;
        int i;
        Set S0;
        List list;
        Set set;
        Iterator it;
        Iterator it2;
        int extensionVersion;
        Instant startTime;
        Instant endTime;
        ZoneOffset zoneOffset;
        Instant startTime2;
        o71 o71Var2 = o71Var;
        if (continuationImpl instanceof tzu) {
            tzuVar = (tzu) continuationImpl;
            int i2 = tzuVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tzuVar.label = i2 - Integer.MIN_VALUE;
                Object obj = tzuVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tzuVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (o71Var2.a.isEmpty()) {
                        throw new IllegalArgumentException("At least one of the aggregation types must be set");
                    }
                    tzuVar.L$0 = o71Var2;
                    tzuVar.label = 1;
                    obj = kzu.b(this, o71Var2, tzuVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        set = (Set) tzuVar.L$1;
                        list = (List) tzuVar.L$0;
                        kotlin.a.a(obj);
                        Iterable iterable = (Iterable) obj;
                        ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
                        it = iterable.iterator();
                        while (it.hasNext()) {
                            AggregateRecordsGroupedByDurationResponse a2 = q81.a(it.next());
                            extensionVersion = SdkExtensions.getExtensionVersion(34);
                            androidx.health.connect.client.aggregate.c a3 = qbg0.a(set, new ud8(a2, 10), extensionVersion >= 10 ? new xd8(a2, 7) : pbg0.i);
                            startTime = a2.getStartTime();
                            endTime = a2.getEndTime();
                            Iterator it3 = set.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    zoneOffset = null;
                                    break;
                                }
                                zoneOffset = a2.getZoneOffset(l7g0.a((AggregateMetric) it3.next()));
                                if (zoneOffset != null) {
                                    break;
                                }
                            }
                            if (zoneOffset == null) {
                                ZoneRules rules = ZoneId.systemDefault().getRules();
                                startTime2 = a2.getStartTime();
                                zoneOffset = rules.getOffset(startTime2);
                            }
                            arrayList.add(new lb1(a3, startTime, endTime, zoneOffset, true));
                        }
                        ArrayList u0 = j5g.u0(arrayList, list);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        it2 = u0.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            lb1 lb1Var = (lb1) next;
                            Instant instant = lb1Var.b;
                            Object obj3 = linkedHashMap.get(instant);
                            if (obj3 != null || linkedHashMap.containsKey(instant)) {
                                lb1 lb1Var2 = (lb1) obj3;
                                next = new lb1(lb1Var2.a.c(lb1Var.a), instant, lb1Var2.c, lb1Var2.d, false);
                            }
                            linkedHashMap.put(instant, next);
                        }
                        return j5g.D0(new z5m(2), linkedHashMap.values());
                    }
                    o71Var2 = (o71) tzuVar.L$0;
                    kotlin.a.a(obj);
                }
                List list2 = (List) obj;
                Set<AggregateMetric<?>> set2 = o71Var2.a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : set2) {
                    if (y71.a((AggregateMetric) obj4)) {
                        arrayList2.add(obj4);
                    }
                }
                S0 = j5g.S0(arrayList2);
                if (!S0.isEmpty()) {
                    return list2;
                }
                izs uzuVar = new uzu(this, o71Var2, null);
                tzuVar.L$0 = list2;
                tzuVar.L$1 = S0;
                tzuVar.label = 2;
                Object f = f(uzuVar, tzuVar);
                if (f != obj2) {
                    list = list2;
                    obj = f;
                    set = S0;
                    Iterable iterable2 = (Iterable) obj;
                    ArrayList arrayList3 = new ArrayList(c5g.u(iterable2, 10));
                    it = iterable2.iterator();
                    while (it.hasNext()) {
                    }
                    ArrayList u02 = j5g.u0(arrayList3, list);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    it2 = u02.iterator();
                    while (it2.hasNext()) {
                    }
                    return j5g.D0(new z5m(2), linkedHashMap2.values());
                }
                return obj2;
            }
        }
        tzuVar = new tzu(this, continuationImpl);
        Object obj5 = tzuVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tzuVar.label;
        if (i != 0) {
        }
        List list22 = (List) obj5;
        Set<AggregateMetric<?>> set22 = o71Var2.a;
        ArrayList arrayList22 = new ArrayList();
        while (r5.hasNext()) {
        }
        S0 = j5g.S0(arrayList22);
        if (!S0.isEmpty()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x1334  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x1337  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x133c  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // xsna.czu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(j7f0 j7f0Var, ContinuationImpl continuationImpl) {
        vzu vzuVar;
        int i;
        List records;
        Iterator it;
        long nextPageToken;
        Long l;
        Object r90Var;
        Instant startTime;
        ZoneOffset startZoneOffset;
        Instant endTime;
        ZoneOffset endZoneOffset;
        Metadata metadata;
        int activityIntensityType;
        ReadRecordsResponse readRecordsResponse;
        Iterator it2;
        int i2;
        int i3;
        Instant startTime2;
        ZoneOffset startZoneOffset2;
        Instant endTime2;
        ZoneOffset endZoneOffset2;
        Metadata metadata2;
        int mindfulnessSessionType;
        CharSequence title;
        CharSequence notes;
        Instant startTime3;
        ZoneOffset startZoneOffset3;
        Instant endTime3;
        ZoneOffset endZoneOffset3;
        Metadata metadata3;
        int measurementLocation;
        List deltas;
        Temperature baseline;
        c8o0 c8o0Var;
        Object fzj0Var;
        double inCelsius;
        Instant time;
        TemperatureDelta delta;
        double inCelsius2;
        Instant startTime4;
        ZoneOffset startZoneOffset4;
        Instant endTime4;
        ZoneOffset endZoneOffset4;
        Metadata metadata4;
        boolean hasExplicitTime;
        int exerciseType;
        String completedExerciseSessionId;
        List blocks;
        CharSequence title2;
        CharSequence notes2;
        int repetitions;
        CharSequence description;
        Iterator it3;
        String str;
        List steps;
        CharSequence description2;
        int exerciseType2;
        int exerciseCategory;
        ExerciseCompletionGoal completionGoal;
        PlannedExerciseStep plannedExerciseStep;
        Instant instant;
        ZoneOffset zoneOffset;
        f4q f4qVar;
        Energy activeCalories;
        double inCalories;
        Energy totalCalories;
        double inCalories2;
        int repetitions2;
        Duration duration;
        int steps2;
        Length distance;
        Duration duration2;
        List performanceGoals;
        Iterator it4;
        Iterator it5;
        f4q f4qVar2;
        Instant instant2;
        ZoneOffset zoneOffset2;
        h4q h4qVar;
        int rpe;
        Mass mass;
        int minBpm;
        int maxBpm;
        double minRpm;
        double maxRpm;
        Velocity minSpeed;
        double inMetersPerSecond;
        Velocity maxSpeed;
        double inMetersPerSecond2;
        Power minPower;
        double inWatts;
        Power maxPower;
        double inWatts2;
        Length distance2;
        Object qkx0Var;
        Instant startTime5;
        ZoneOffset startZoneOffset5;
        Instant endTime5;
        ZoneOffset endZoneOffset5;
        long count;
        Metadata metadata5;
        Instant time2;
        ZoneOffset zoneOffset3;
        Mass weight;
        Metadata metadata6;
        Instant time3;
        ZoneOffset zoneOffset4;
        double vo2MillilitersPerMinuteKilogram;
        int measurementMethod;
        Metadata metadata7;
        Object zcp0Var;
        Instant startTime6;
        ZoneOffset startZoneOffset6;
        Instant endTime6;
        ZoneOffset endZoneOffset6;
        Energy energy;
        double inCalories3;
        Metadata metadata8;
        Instant startTime7;
        ZoneOffset startZoneOffset7;
        Instant endTime7;
        ZoneOffset endZoneOffset7;
        long count2;
        Metadata metadata9;
        Instant startTime8;
        ZoneOffset startZoneOffset8;
        Instant endTime8;
        ZoneOffset endZoneOffset8;
        List samples;
        Metadata metadata10;
        Instant time4;
        double rate;
        Instant startTime9;
        ZoneOffset startZoneOffset9;
        Instant endTime9;
        ZoneOffset endZoneOffset9;
        List samples2;
        Metadata metadata11;
        Object gkk0Var;
        Instant time5;
        Velocity speed;
        double inMetersPerSecond3;
        Instant startTime10;
        ZoneOffset startZoneOffset10;
        Instant endTime10;
        ZoneOffset endZoneOffset10;
        Metadata metadata12;
        CharSequence title3;
        CharSequence notes3;
        List stages;
        Instant startTime11;
        Instant endTime11;
        int type;
        Instant time6;
        ZoneOffset zoneOffset5;
        int protectionUsed;
        Metadata metadata13;
        Instant time7;
        ZoneOffset zoneOffset6;
        long beatsPerMinute;
        Metadata metadata14;
        Instant time8;
        ZoneOffset zoneOffset7;
        double rate2;
        Metadata metadata15;
        Instant startTime12;
        ZoneOffset startZoneOffset11;
        Instant endTime12;
        ZoneOffset endZoneOffset11;
        List samples3;
        Metadata metadata16;
        Instant time9;
        Power power;
        double inWatts3;
        Instant time10;
        ZoneOffset zoneOffset8;
        Percentage percentage;
        double value;
        Metadata metadata17;
        Instant time11;
        ZoneOffset zoneOffset9;
        int result;
        Metadata metadata18;
        Instant startTime13;
        ZoneOffset startZoneOffset12;
        Instant endTime13;
        ZoneOffset endZoneOffset12;
        String mealName;
        int mealType;
        Metadata metadata19;
        Mass biotin;
        Mass caffeine;
        Mass calcium;
        Energy energy2;
        jlp jlpVar;
        Energy energyFromFat;
        jlp jlpVar2;
        Mass chloride;
        Mass cholesterol;
        Mass chromium;
        Mass copper;
        Mass dietaryFiber;
        Mass folate;
        Mass folicAcid;
        Mass iodine;
        Mass iron;
        Mass magnesium;
        Mass manganese;
        Mass molybdenum;
        Mass monounsaturatedFat;
        Mass niacin;
        Mass pantothenicAcid;
        Mass phosphorus;
        Mass polyunsaturatedFat;
        Mass potassium;
        Mass protein;
        Mass riboflavin;
        Mass saturatedFat;
        Mass selenium;
        Mass sodium;
        Mass sugar;
        Mass thiamin;
        Mass totalCarbohydrate;
        Mass totalFat;
        Mass transFat;
        Mass unsaturatedFat;
        Mass vitaminA;
        Mass vitaminB12;
        Mass vitaminB6;
        Mass vitaminC;
        Mass vitaminD;
        Mass vitaminE;
        Mass vitaminK;
        Mass zinc;
        double inCalories4;
        jlp jlpVar3;
        double inCalories5;
        double inCalories6;
        jlp jlpVar4;
        double inCalories7;
        Instant startTime14;
        ZoneOffset startZoneOffset13;
        Instant endTime14;
        ZoneOffset endZoneOffset13;
        Metadata metadata20;
        Instant time12;
        ZoneOffset zoneOffset10;
        int flow;
        Metadata metadata21;
        Instant time13;
        ZoneOffset zoneOffset11;
        Mass mass2;
        Metadata metadata22;
        Instant time14;
        ZoneOffset zoneOffset12;
        Metadata metadata23;
        Instant startTime15;
        ZoneOffset startZoneOffset14;
        Instant endTime15;
        ZoneOffset endZoneOffset14;
        Volume volume;
        double inLiters;
        Metadata metadata24;
        Instant time15;
        ZoneOffset zoneOffset13;
        Length height;
        Metadata metadata25;
        Instant time16;
        ZoneOffset zoneOffset14;
        double heartRateVariabilityMillis;
        Metadata metadata26;
        Instant startTime16;
        ZoneOffset startZoneOffset15;
        Instant endTime16;
        ZoneOffset endZoneOffset15;
        List samples4;
        Metadata metadata27;
        Instant time17;
        long beatsPerMinute2;
        Instant startTime17;
        ZoneOffset startZoneOffset16;
        Instant endTime17;
        ZoneOffset endZoneOffset16;
        double floors;
        Metadata metadata28;
        Instant startTime18;
        ZoneOffset startZoneOffset17;
        Instant endTime18;
        ZoneOffset endZoneOffset17;
        int exerciseType3;
        CharSequence title4;
        CharSequence notes4;
        List laps;
        List segments;
        Metadata metadata29;
        ExerciseRoute route;
        boolean hasRoute;
        k4q aVar;
        String str2;
        String plannedExerciseSessionId;
        List routeLocations;
        Instant time18;
        double latitude;
        double longitude;
        Length horizontalAccuracy;
        Length verticalAccuracy;
        Length altitude;
        Instant startTime19;
        Instant endTime19;
        int segmentType;
        int repetitionsCount;
        Instant startTime20;
        Instant endTime20;
        Length length;
        Instant startTime21;
        ZoneOffset startZoneOffset18;
        Instant endTime21;
        ZoneOffset endZoneOffset18;
        Length elevation;
        Metadata metadata30;
        Instant startTime22;
        ZoneOffset startZoneOffset19;
        Instant endTime22;
        ZoneOffset endZoneOffset19;
        Length distance3;
        Metadata metadata31;
        Instant startTime23;
        ZoneOffset startZoneOffset20;
        Instant endTime23;
        ZoneOffset endZoneOffset20;
        List samples5;
        Metadata metadata32;
        Instant time19;
        double revolutionsPerMinute;
        Instant time20;
        ZoneOffset zoneOffset15;
        int appearance;
        int sensation;
        Metadata metadata33;
        Instant time21;
        ZoneOffset zoneOffset16;
        Mass mass3;
        Metadata metadata34;
        Instant time22;
        ZoneOffset zoneOffset17;
        Mass bodyWaterMass;
        Metadata metadata35;
        Instant time23;
        ZoneOffset zoneOffset18;
        Temperature temperature;
        double inCelsius3;
        int measurementLocation2;
        Metadata metadata36;
        Instant time24;
        ZoneOffset zoneOffset19;
        Percentage percentage2;
        double value2;
        Metadata metadata37;
        Instant time25;
        ZoneOffset zoneOffset20;
        Pressure systolic;
        double inMillimetersOfMercury;
        Pressure diastolic;
        double inMillimetersOfMercury2;
        int bodyPosition;
        int measurementLocation3;
        Metadata metadata38;
        Instant time26;
        ZoneOffset zoneOffset21;
        BloodGlucose level;
        double inMillimolesPerLiter;
        int specimenSource;
        int mealType2;
        int relationToMeal;
        Metadata metadata39;
        Instant time27;
        ZoneOffset zoneOffset22;
        Power basalMetabolicRate;
        double inWatts4;
        Metadata metadata40;
        Instant time28;
        ZoneOffset zoneOffset23;
        Temperature temperature2;
        double inCelsius4;
        int measurementLocation4;
        Metadata metadata41;
        Instant startTime24;
        ZoneOffset startZoneOffset21;
        Instant endTime24;
        ZoneOffset endZoneOffset21;
        Energy energy3;
        double inCalories8;
        Metadata metadata42;
        if (continuationImpl instanceof vzu) {
            vzuVar = (vzu) continuationImpl;
            int i4 = vzuVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                vzuVar.label = i4 - Integer.MIN_VALUE;
                Object obj = vzuVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = vzuVar.label;
                int i5 = 1;
                Object obj3 = null;
                if (i != 0) {
                    kotlin.a.a(obj);
                    j7f0Var.getClass();
                    izs wzuVar = new wzu(this, j7f0Var, null);
                    vzuVar.label = 1;
                    obj = f(wzuVar, vzuVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                ReadRecordsResponse b = r81.b(obj);
                records = b.getRecords();
                List list = records;
                int i6 = 10;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    Record c = t81.c(it.next());
                    if (v3r0.c() && qgf0.a(c)) {
                        ActivityIntensityRecord a2 = ggf0.a(c);
                        startTime = a2.getStartTime();
                        startZoneOffset = a2.getStartZoneOffset();
                        endTime = a2.getEndTime();
                        endZoneOffset = a2.getEndZoneOffset();
                        metadata = a2.getMetadata();
                        hi20 b2 = mi20.b(metadata);
                        activityIntensityType = a2.getActivityIntensityType();
                        r90Var = new r90(startTime, startZoneOffset, endTime, endZoneOffset, b2, activityIntensityType);
                    } else {
                        r90Var = obj3;
                    }
                    if (r90Var == null) {
                        if (!v3r0.b()) {
                            r90Var = obj3;
                        } else if (cgf0.a(c)) {
                            MindfulnessSessionRecord a3 = dgf0.a(c);
                            startTime2 = a3.getStartTime();
                            startZoneOffset2 = a3.getStartZoneOffset();
                            endTime2 = a3.getEndTime();
                            endZoneOffset2 = a3.getEndZoneOffset();
                            metadata2 = a3.getMetadata();
                            hi20 b3 = mi20.b(metadata2);
                            mindfulnessSessionType = a3.getMindfulnessSessionType();
                            Integer num = (Integer) v8x.K.get(Integer.valueOf(mindfulnessSessionType));
                            int intValue = num != null ? num.intValue() : 0;
                            title = a3.getTitle();
                            String valueOf = String.valueOf(title);
                            notes = a3.getNotes();
                            r90Var = new mo20(startTime2, startZoneOffset2, endTime2, endZoneOffset2, b3, intValue, valueOf, String.valueOf(notes));
                        } else {
                            r90Var = null;
                        }
                        if (r90Var == null) {
                            if (v3r0.a()) {
                                if (db1.b(c)) {
                                    PlannedExerciseSessionRecord a4 = ugf0.a(c);
                                    startTime4 = a4.getStartTime();
                                    startZoneOffset4 = a4.getStartZoneOffset();
                                    endTime4 = a4.getEndTime();
                                    endZoneOffset4 = a4.getEndZoneOffset();
                                    metadata4 = a4.getMetadata();
                                    hi20 b4 = mi20.b(metadata4);
                                    hasExplicitTime = a4.hasExplicitTime();
                                    exerciseType = a4.getExerciseType();
                                    Integer num2 = (Integer) v8x.f.get(Integer.valueOf(exerciseType));
                                    int intValue2 = num2 != null ? num2.intValue() : 0;
                                    completedExerciseSessionId = a4.getCompletedExerciseSessionId();
                                    blocks = a4.getBlocks();
                                    List list2 = blocks;
                                    ArrayList arrayList2 = new ArrayList(c5g.u(list2, i6));
                                    Iterator it6 = list2.iterator();
                                    while (it6.hasNext()) {
                                        PlannedExerciseBlock a5 = egf0.a(it6.next());
                                        repetitions = a5.getRepetitions();
                                        description = a5.getDescription();
                                        if (description != null) {
                                            String obj4 = description.toString();
                                            it3 = it6;
                                            str = obj4;
                                        } else {
                                            it3 = it6;
                                            str = null;
                                        }
                                        steps = a5.getSteps();
                                        List list3 = steps;
                                        ReadRecordsResponse readRecordsResponse2 = b;
                                        Iterator it7 = it;
                                        PlannedExerciseSessionRecord plannedExerciseSessionRecord = a4;
                                        ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
                                        Iterator it8 = list3.iterator();
                                        while (it8.hasNext()) {
                                            PlannedExerciseStep a6 = bgf0.a(it8.next());
                                            description2 = a6.getDescription();
                                            String obj5 = description2 != null ? description2.toString() : null;
                                            exerciseType2 = a6.getExerciseType();
                                            Iterator it9 = it8;
                                            Integer num3 = (Integer) v8x.H.get(Integer.valueOf(exerciseType2));
                                            int intValue3 = num3 != null ? num3.intValue() : 0;
                                            exerciseCategory = a6.getExerciseCategory();
                                            Integer num4 = (Integer) v8x.D.get(Integer.valueOf(exerciseCategory));
                                            int intValue4 = num4 != null ? num4.intValue() : 0;
                                            completionGoal = a6.getCompletionGoal();
                                            if (bb1.b(completionGoal)) {
                                                distance2 = ga1.b(completionGoal).getDistance();
                                                f4qVar = new f4q.c(u3q0.e(distance2));
                                                plannedExerciseStep = a6;
                                            } else if (pff0.c(completionGoal)) {
                                                distance = qff0.a(completionGoal).getDistance();
                                                plannedExerciseStep = a6;
                                                c2z e = u3q0.e(distance);
                                                duration2 = qff0.a(completionGoal).getDuration();
                                                f4qVar = new f4q.b(e, duration2);
                                            } else {
                                                plannedExerciseStep = a6;
                                                if (sff0.b(completionGoal)) {
                                                    steps2 = ta1.b(completionGoal).getSteps();
                                                    f4qVar = new f4q.g(steps2);
                                                } else if (w91.c(completionGoal)) {
                                                    duration = bff0.b(completionGoal).getDuration();
                                                    f4qVar = new f4q.d(duration);
                                                } else if (dff0.b(completionGoal)) {
                                                    repetitions2 = eff0.a(completionGoal).getRepetitions();
                                                    f4qVar = new f4q.f(repetitions2);
                                                } else {
                                                    if (gff0.a(completionGoal)) {
                                                        totalCalories = hff0.a(completionGoal).getTotalCalories();
                                                        jlp.a aVar2 = jlp.d;
                                                        instant = startTime4;
                                                        zoneOffset = startZoneOffset4;
                                                        inCalories2 = totalCalories.getInCalories();
                                                        aVar2.getClass();
                                                        f4qVar = new f4q.h(new jlp(inCalories2, jlp.b.CALORIES));
                                                    } else {
                                                        instant = startTime4;
                                                        zoneOffset = startZoneOffset4;
                                                        if (ha1.b(completionGoal)) {
                                                            activeCalories = kff0.a(completionGoal).getActiveCalories();
                                                            jlp.a aVar3 = jlp.d;
                                                            inCalories = activeCalories.getInCalories();
                                                            aVar3.getClass();
                                                            f4qVar = new f4q.a(new jlp(inCalories, jlp.b.CALORIES));
                                                        } else if (mff0.b(completionGoal)) {
                                                            f4qVar = f4q.i.a;
                                                        } else {
                                                            if (!nff0.b(completionGoal)) {
                                                                throw new IllegalArgumentException("Unsupported exercise completion goal " + completionGoal);
                                                            }
                                                            f4qVar = f4q.e.a;
                                                        }
                                                    }
                                                    performanceGoals = plannedExerciseStep.getPerformanceGoals();
                                                    List list4 = performanceGoals;
                                                    ArrayList arrayList4 = new ArrayList(c5g.u(list4, 10));
                                                    it4 = list4.iterator();
                                                    while (it4.hasNext()) {
                                                        ExercisePerformanceGoal b5 = eff0.b(it4.next());
                                                        if (fff0.b(b5)) {
                                                            minPower = nff0.a(b5).getMinPower();
                                                            swc0.a aVar4 = swc0.d;
                                                            inWatts = minPower.getInWatts();
                                                            aVar4.getClass();
                                                            it5 = it4;
                                                            swc0 a7 = swc0.a.a(inWatts);
                                                            maxPower = nff0.a(b5).getMaxPower();
                                                            inWatts2 = maxPower.getInWatts();
                                                            aVar4.getClass();
                                                            h4qVar = new h4q.d(a7, swc0.a.a(inWatts2));
                                                        } else {
                                                            it5 = it4;
                                                            if (xa1.b(b5)) {
                                                                minSpeed = zgf0.a(b5).getMinSpeed();
                                                                imr0.a aVar5 = imr0.d;
                                                                inMetersPerSecond = minSpeed.getInMetersPerSecond();
                                                                aVar5.getClass();
                                                                imr0 a8 = imr0.a.a(inMetersPerSecond);
                                                                maxSpeed = zgf0.a(b5).getMaxSpeed();
                                                                inMetersPerSecond2 = maxSpeed.getInMetersPerSecond();
                                                                aVar5.getClass();
                                                                h4qVar = new h4q.f(a8, imr0.a.a(inMetersPerSecond2));
                                                            } else {
                                                                if (gff0.b(b5)) {
                                                                    instant2 = endTime4;
                                                                    zoneOffset2 = endZoneOffset4;
                                                                    minRpm = hff0.b(b5).getMinRpm();
                                                                    f4qVar2 = f4qVar;
                                                                    maxRpm = hff0.b(b5).getMaxRpm();
                                                                    h4qVar = new h4q.b(minRpm, maxRpm);
                                                                } else {
                                                                    f4qVar2 = f4qVar;
                                                                    instant2 = endTime4;
                                                                    zoneOffset2 = endZoneOffset4;
                                                                    if (ha1.c(b5)) {
                                                                        minBpm = kff0.b(b5).getMinBpm();
                                                                        double d = minBpm;
                                                                        maxBpm = kff0.b(b5).getMaxBpm();
                                                                        h4qVar = new h4q.c(d, maxBpm);
                                                                    } else if (off0.b(b5)) {
                                                                        mass = pff0.b(b5).getMass();
                                                                        h4qVar = new h4q.h(u3q0.f(mass));
                                                                    } else if (pa1.c(b5)) {
                                                                        rpe = qa1.b(b5).getRpe();
                                                                        h4qVar = new h4q.e(rpe);
                                                                    } else if (ta1.c(b5)) {
                                                                        h4qVar = h4q.a.a;
                                                                    } else {
                                                                        if (!ua1.d(b5)) {
                                                                            throw new IllegalArgumentException("Unsupported exercise performance target " + b5);
                                                                        }
                                                                        h4qVar = h4q.g.a;
                                                                    }
                                                                }
                                                                arrayList4.add(h4qVar);
                                                                it4 = it5;
                                                                f4qVar = f4qVar2;
                                                                endTime4 = instant2;
                                                                endZoneOffset4 = zoneOffset2;
                                                            }
                                                        }
                                                        f4qVar2 = f4qVar;
                                                        instant2 = endTime4;
                                                        zoneOffset2 = endZoneOffset4;
                                                        arrayList4.add(h4qVar);
                                                        it4 = it5;
                                                        f4qVar = f4qVar2;
                                                        endTime4 = instant2;
                                                        endZoneOffset4 = zoneOffset2;
                                                    }
                                                    arrayList3.add(new dta0(intValue3, intValue4, f4qVar, arrayList4, obj5));
                                                    it8 = it9;
                                                    startTime4 = instant;
                                                    startZoneOffset4 = zoneOffset;
                                                }
                                            }
                                            instant = startTime4;
                                            zoneOffset = startZoneOffset4;
                                            performanceGoals = plannedExerciseStep.getPerformanceGoals();
                                            List list42 = performanceGoals;
                                            ArrayList arrayList42 = new ArrayList(c5g.u(list42, 10));
                                            it4 = list42.iterator();
                                            while (it4.hasNext()) {
                                            }
                                            arrayList3.add(new dta0(intValue3, intValue4, f4qVar, arrayList42, obj5));
                                            it8 = it9;
                                            startTime4 = instant;
                                            startZoneOffset4 = zoneOffset;
                                        }
                                        arrayList2.add(new bta0(str, arrayList3, repetitions));
                                        it6 = it3;
                                        a4 = plannedExerciseSessionRecord;
                                        b = readRecordsResponse2;
                                        it = it7;
                                    }
                                    readRecordsResponse = b;
                                    it2 = it;
                                    PlannedExerciseSessionRecord plannedExerciseSessionRecord2 = a4;
                                    Instant instant3 = startTime4;
                                    ZoneOffset zoneOffset24 = startZoneOffset4;
                                    Instant instant4 = endTime4;
                                    ZoneOffset zoneOffset25 = endZoneOffset4;
                                    title2 = plannedExerciseSessionRecord2.getTitle();
                                    String obj6 = title2 != null ? title2.toString() : null;
                                    notes2 = plannedExerciseSessionRecord2.getNotes();
                                    fzj0Var = new cta0(instant3, zoneOffset24, instant4, zoneOffset25, b4, hasExplicitTime, intValue2, completedExerciseSessionId, arrayList2, obj6, notes2 != null ? notes2.toString() : null);
                                } else {
                                    readRecordsResponse = b;
                                    it2 = it;
                                    if (zff0.c(c)) {
                                        SkinTemperatureRecord a9 = vgf0.a(c);
                                        startTime3 = a9.getStartTime();
                                        startZoneOffset3 = a9.getStartZoneOffset();
                                        endTime3 = a9.getEndTime();
                                        endZoneOffset3 = a9.getEndZoneOffset();
                                        metadata3 = a9.getMetadata();
                                        hi20 b6 = mi20.b(metadata3);
                                        measurementLocation = a9.getMeasurementLocation();
                                        Integer num5 = (Integer) v8x.x.get(Integer.valueOf(measurementLocation));
                                        int intValue5 = num5 != null ? num5.intValue() : 0;
                                        deltas = a9.getDeltas();
                                        List list5 = deltas;
                                        ArrayList arrayList5 = new ArrayList(c5g.u(list5, 10));
                                        Iterator it10 = list5.iterator();
                                        while (it10.hasNext()) {
                                            SkinTemperatureRecord.Delta b7 = agf0.b(it10.next());
                                            time = b7.getTime();
                                            delta = b7.getDelta();
                                            d8o0.a aVar6 = d8o0.d;
                                            inCelsius2 = delta.getInCelsius();
                                            aVar6.getClass();
                                            arrayList5.add(new fzj0.d(time, d8o0.a.a(inCelsius2)));
                                        }
                                        baseline = a9.getBaseline();
                                        if (baseline != null) {
                                            inCelsius = baseline.getInCelsius();
                                            c8o0Var = new c8o0(inCelsius, c8o0.a.CELSIUS);
                                        } else {
                                            c8o0Var = null;
                                        }
                                        fzj0Var = new fzj0(startTime3, startZoneOffset3, endTime3, endZoneOffset3, b6, arrayList5, c8o0Var, intValue5);
                                    }
                                }
                                r90Var = fzj0Var;
                                if (r90Var == null) {
                                    if (p92.k(c)) {
                                        ActiveCaloriesBurnedRecord b8 = x92.b(c);
                                        startTime24 = b8.getStartTime();
                                        startZoneOffset21 = b8.getStartZoneOffset();
                                        endTime24 = b8.getEndTime();
                                        endZoneOffset21 = b8.getEndZoneOffset();
                                        energy3 = b8.getEnergy();
                                        jlp.a aVar7 = jlp.d;
                                        inCalories8 = energy3.getInCalories();
                                        aVar7.getClass();
                                        jlp jlpVar5 = new jlp(inCalories8, jlp.b.CALORIES);
                                        metadata42 = b8.getMetadata();
                                        gkk0Var = new f80(startTime24, startZoneOffset21, endTime24, endZoneOffset21, jlpVar5, mi20.b(metadata42));
                                    } else if (j81.k(c)) {
                                        BasalBodyTemperatureRecord c2 = v81.c(c);
                                        time28 = c2.getTime();
                                        zoneOffset23 = c2.getZoneOffset();
                                        temperature2 = c2.getTemperature();
                                        inCelsius4 = temperature2.getInCelsius();
                                        c8o0 c8o0Var2 = new c8o0(inCelsius4, c8o0.a.CELSIUS);
                                        measurementLocation4 = c2.getMeasurementLocation();
                                        metadata41 = c2.getMetadata();
                                        gkk0Var = new e46(time28, zoneOffset23, mi20.b(metadata41), c8o0Var2, measurementLocation4);
                                    } else if (h91.l(c)) {
                                        BasalMetabolicRateRecord c3 = t91.c(c);
                                        time27 = c3.getTime();
                                        zoneOffset22 = c3.getZoneOffset();
                                        basalMetabolicRate = c3.getBasalMetabolicRate();
                                        swc0.a aVar8 = swc0.d;
                                        inWatts4 = basalMetabolicRate.getInWatts();
                                        aVar8.getClass();
                                        swc0 a10 = swc0.a.a(inWatts4);
                                        metadata40 = c3.getMetadata();
                                        r90Var = new f46(time27, zoneOffset22, a10, mi20.b(metadata40));
                                    } else if (e92.l(c)) {
                                        BloodGlucoseRecord c4 = na1.c(c);
                                        time26 = c4.getTime();
                                        zoneOffset21 = c4.getZoneOffset();
                                        level = c4.getLevel();
                                        LinkedHashMap linkedHashMap = eg7.d;
                                        inMillimolesPerLiter = level.getInMillimolesPerLiter();
                                        eg7 eg7Var = new eg7(inMillimolesPerLiter, eg7.a.MILLIMOLES_PER_LITER);
                                        specimenSource = c4.getSpecimenSource();
                                        Integer num6 = (Integer) v8x.z.get(Integer.valueOf(specimenSource));
                                        int intValue6 = num6 != null ? num6.intValue() : 0;
                                        mealType2 = c4.getMealType();
                                        Integer num7 = (Integer) v8x.h.get(Integer.valueOf(mealType2));
                                        int intValue7 = num7 != null ? num7.intValue() : 0;
                                        relationToMeal = c4.getRelationToMeal();
                                        Integer num8 = (Integer) v8x.B.get(Integer.valueOf(relationToMeal));
                                        int intValue8 = num8 != null ? num8.intValue() : 0;
                                        metadata39 = c4.getMetadata();
                                        gkk0Var = new fg7(time26, zoneOffset21, mi20.b(metadata39), eg7Var, intValue6, intValue7, intValue8);
                                    } else if (oa1.j(c)) {
                                        BloodPressureRecord b9 = g92.b(c);
                                        time25 = b9.getTime();
                                        zoneOffset20 = b9.getZoneOffset();
                                        systolic = b9.getSystolic();
                                        x2d0.a aVar9 = x2d0.c;
                                        inMillimetersOfMercury = systolic.getInMillimetersOfMercury();
                                        aVar9.getClass();
                                        x2d0 x2d0Var = new x2d0(inMillimetersOfMercury);
                                        diastolic = b9.getDiastolic();
                                        inMillimetersOfMercury2 = diastolic.getInMillimetersOfMercury();
                                        aVar9.getClass();
                                        x2d0 x2d0Var2 = new x2d0(inMillimetersOfMercury2);
                                        bodyPosition = b9.getBodyPosition();
                                        Integer num9 = (Integer) v8x.d.get(Integer.valueOf(bodyPosition));
                                        int intValue9 = num9 != null ? num9.intValue() : 0;
                                        measurementLocation3 = b9.getMeasurementLocation();
                                        Integer num10 = (Integer) v8x.p.get(Integer.valueOf(measurementLocation3));
                                        int intValue10 = num10 != null ? num10.intValue() : 0;
                                        metadata38 = b9.getMetadata();
                                        gkk0Var = new jg7(time25, zoneOffset20, mi20.b(metadata38), x2d0Var, x2d0Var2, intValue9, intValue10);
                                    } else if (eb1.j(c)) {
                                        BodyFatRecord e2 = fb1.e(c);
                                        time24 = e2.getTime();
                                        zoneOffset19 = e2.getZoneOffset();
                                        percentage2 = e2.getPercentage();
                                        value2 = percentage2.getValue();
                                        uv90 uv90Var = new uv90(value2);
                                        metadata37 = e2.getMetadata();
                                        r90Var = new oj7(time24, zoneOffset19, uv90Var, mi20.b(metadata37));
                                    } else if (gb1.k(c)) {
                                        BodyTemperatureRecord c5 = hb1.c(c);
                                        time23 = c5.getTime();
                                        zoneOffset18 = c5.getZoneOffset();
                                        temperature = c5.getTemperature();
                                        inCelsius3 = temperature.getInCelsius();
                                        c8o0 c8o0Var3 = new c8o0(inCelsius3, c8o0.a.CELSIUS);
                                        measurementLocation2 = c5.getMeasurementLocation();
                                        Integer num11 = (Integer) v8x.n.get(Integer.valueOf(measurementLocation2));
                                        int intValue11 = num11 != null ? num11.intValue() : 0;
                                        metadata36 = c5.getMetadata();
                                        gkk0Var = new uj7(time23, zoneOffset18, mi20.b(metadata36), c8o0Var3, intValue11);
                                    } else if (q92.l(c)) {
                                        BodyWaterMassRecord b10 = s92.b(c);
                                        time22 = b10.getTime();
                                        zoneOffset17 = b10.getZoneOffset();
                                        bodyWaterMass = b10.getBodyWaterMass();
                                        vi10 f = u3q0.f(bodyWaterMass);
                                        metadata35 = b10.getMetadata();
                                        r90Var = new vj7(time22, zoneOffset17, f, mi20.b(metadata35));
                                    } else if (t92.k(c)) {
                                        BoneMassRecord a11 = u92.a(c);
                                        time21 = a11.getTime();
                                        zoneOffset16 = a11.getZoneOffset();
                                        mass3 = a11.getMass();
                                        vi10 f2 = u3q0.f(mass3);
                                        metadata34 = a11.getMetadata();
                                        r90Var = new xj7(time21, zoneOffset16, f2, mi20.b(metadata34));
                                    } else if (v92.h(c)) {
                                        CervicalMucusRecord b11 = w92.b(c);
                                        time20 = b11.getTime();
                                        zoneOffset15 = b11.getZoneOffset();
                                        appearance = b11.getAppearance();
                                        Integer num12 = (Integer) v8x.b.get(Integer.valueOf(appearance));
                                        int intValue12 = num12 != null ? num12.intValue() : 0;
                                        sensation = b11.getSensation();
                                        Integer num13 = (Integer) v8x.t.get(Integer.valueOf(sensation));
                                        int intValue13 = num13 != null ? num13.intValue() : 0;
                                        metadata33 = b11.getMetadata();
                                        gkk0Var = new nqa(time20, zoneOffset15, mi20.b(metadata33), intValue12, intValue13);
                                    } else if (y92.h(c)) {
                                        CyclingPedalingCadenceRecord c6 = z71.c(c);
                                        startTime23 = c6.getStartTime();
                                        startZoneOffset20 = c6.getStartZoneOffset();
                                        endTime23 = c6.getEndTime();
                                        endZoneOffset20 = c6.getEndZoneOffset();
                                        samples5 = c6.getSamples();
                                        List list6 = samples5;
                                        ArrayList arrayList6 = new ArrayList(c5g.u(list6, 10));
                                        Iterator it11 = list6.iterator();
                                        while (it11.hasNext()) {
                                            CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample d2 = gb1.d(it11.next());
                                            time19 = d2.getTime();
                                            revolutionsPerMinute = d2.getRevolutionsPerMinute();
                                            arrayList6.add(new dqk.a(revolutionsPerMinute, time19));
                                        }
                                        List D0 = j5g.D0(new hj30(1), arrayList6);
                                        metadata32 = c6.getMetadata();
                                        gkk0Var = new dqk(startTime23, startZoneOffset20, endTime23, endZoneOffset20, D0, mi20.b(metadata32));
                                    } else if (z92.j(c)) {
                                        DistanceRecord c7 = b81.c(c);
                                        startTime22 = c7.getStartTime();
                                        startZoneOffset19 = c7.getStartZoneOffset();
                                        endTime22 = c7.getEndTime();
                                        endZoneOffset19 = c7.getEndZoneOffset();
                                        distance3 = c7.getDistance();
                                        c2z e3 = u3q0.e(distance3);
                                        metadata31 = c7.getMetadata();
                                        gkk0Var = new bhn(startTime22, startZoneOffset19, endTime22, endZoneOffset19, e3, mi20.b(metadata31));
                                    } else if (d81.o(c)) {
                                        ElevationGainedRecord c8 = e81.c(c);
                                        startTime21 = c8.getStartTime();
                                        startZoneOffset18 = c8.getStartZoneOffset();
                                        endTime21 = c8.getEndTime();
                                        endZoneOffset18 = c8.getEndZoneOffset();
                                        elevation = c8.getElevation();
                                        c2z e4 = u3q0.e(elevation);
                                        metadata30 = c8.getMetadata();
                                        gkk0Var = new cbp(startTime21, startZoneOffset18, endTime21, endZoneOffset18, e4, mi20.b(metadata30));
                                    } else if (f81.m(c)) {
                                        ExerciseSessionRecord c9 = g81.c(c);
                                        startTime18 = c9.getStartTime();
                                        startZoneOffset17 = c9.getStartZoneOffset();
                                        endTime18 = c9.getEndTime();
                                        endZoneOffset17 = c9.getEndZoneOffset();
                                        exerciseType3 = c9.getExerciseType();
                                        Integer num14 = (Integer) v8x.f.get(Integer.valueOf(exerciseType3));
                                        int intValue14 = num14 != null ? num14.intValue() : 0;
                                        title4 = c9.getTitle();
                                        String obj7 = title4 != null ? title4.toString() : null;
                                        notes4 = c9.getNotes();
                                        String obj8 = notes4 != null ? notes4.toString() : null;
                                        laps = c9.getLaps();
                                        List list7 = laps;
                                        ArrayList arrayList7 = new ArrayList(c5g.u(list7, 10));
                                        Iterator it12 = list7.iterator();
                                        while (it12.hasNext()) {
                                            ExerciseLap d3 = z91.d(it12.next());
                                            startTime20 = d3.getStartTime();
                                            endTime20 = d3.getEndTime();
                                            length = d3.getLength();
                                            arrayList7.add(new g4q(startTime20, endTime20, length != null ? u3q0.e(length) : null));
                                        }
                                        List D02 = j5g.D0(new ahf0(), arrayList7);
                                        segments = c9.getSegments();
                                        List list8 = segments;
                                        ArrayList arrayList8 = new ArrayList(c5g.u(list8, 10));
                                        Iterator it13 = list8.iterator();
                                        while (it13.hasNext()) {
                                            ExerciseSegment g = m91.g(it13.next());
                                            startTime19 = g.getStartTime();
                                            endTime19 = g.getEndTime();
                                            segmentType = g.getSegmentType();
                                            ExerciseSessionRecord exerciseSessionRecord = c9;
                                            Iterator it14 = it13;
                                            Integer num15 = (Integer) v8x.H.get(Integer.valueOf(segmentType));
                                            int intValue15 = num15 != null ? num15.intValue() : 0;
                                            repetitionsCount = g.getRepetitionsCount();
                                            arrayList8.add(new l4q(startTime19, endTime19, intValue15, repetitionsCount));
                                            c9 = exerciseSessionRecord;
                                            it13 = it14;
                                        }
                                        ExerciseSessionRecord exerciseSessionRecord2 = c9;
                                        List D03 = j5g.D0(new bhf0(), arrayList8);
                                        metadata29 = exerciseSessionRecord2.getMetadata();
                                        hi20 b12 = mi20.b(metadata29);
                                        route = exerciseSessionRecord2.getRoute();
                                        if (route != null) {
                                            routeLocations = route.getRouteLocations();
                                            List list9 = routeLocations;
                                            ArrayList arrayList9 = new ArrayList(c5g.u(list9, 10));
                                            Iterator it15 = list9.iterator();
                                            while (it15.hasNext()) {
                                                ExerciseRoute.Location c10 = vw6.c(it15.next());
                                                time18 = c10.getTime();
                                                latitude = c10.getLatitude();
                                                longitude = c10.getLongitude();
                                                horizontalAccuracy = c10.getHorizontalAccuracy();
                                                c2z e5 = horizontalAccuracy != null ? u3q0.e(horizontalAccuracy) : null;
                                                verticalAccuracy = c10.getVerticalAccuracy();
                                                c2z e6 = verticalAccuracy != null ? u3q0.e(verticalAccuracy) : null;
                                                altitude = c10.getAltitude();
                                                arrayList9.add(new i4q.a(time18, latitude, longitude, e5, e6, altitude != null ? u3q0.e(altitude) : null));
                                            }
                                            aVar = new k4q.b(new i4q(arrayList9));
                                        } else {
                                            hasRoute = exerciseSessionRecord2.hasRoute();
                                            aVar = hasRoute ? new k4q.a() : new k4q.c();
                                        }
                                        k4q k4qVar = aVar;
                                        if (v3r0.a()) {
                                            plannedExerciseSessionId = exerciseSessionRecord2.getPlannedExerciseSessionId();
                                            str2 = plannedExerciseSessionId;
                                        } else {
                                            str2 = null;
                                        }
                                        gkk0Var = new n4q(startTime18, startZoneOffset17, endTime18, endZoneOffset17, b12, intValue14, obj7, obj8, D03, D02, k4qVar, str2);
                                    } else if (h81.n(c)) {
                                        FloorsClimbedRecord c11 = i81.c(c);
                                        startTime17 = c11.getStartTime();
                                        startZoneOffset16 = c11.getStartZoneOffset();
                                        endTime17 = c11.getEndTime();
                                        endZoneOffset16 = c11.getEndZoneOffset();
                                        floors = c11.getFloors();
                                        metadata28 = c11.getMetadata();
                                        gkk0Var = new jsr(startTime17, startZoneOffset16, endTime17, endZoneOffset16, floors, mi20.b(metadata28));
                                    } else if (k81.l(c)) {
                                        HeartRateRecord d4 = l81.d(c);
                                        startTime16 = d4.getStartTime();
                                        startZoneOffset15 = d4.getStartZoneOffset();
                                        endTime16 = d4.getEndTime();
                                        endZoneOffset15 = d4.getEndZoneOffset();
                                        samples4 = d4.getSamples();
                                        List list10 = samples4;
                                        ArrayList arrayList10 = new ArrayList(c5g.u(list10, 10));
                                        Iterator it16 = list10.iterator();
                                        while (it16.hasNext()) {
                                            HeartRateRecord.HeartRateSample b13 = u92.b(it16.next());
                                            time17 = b13.getTime();
                                            beatsPerMinute2 = b13.getBeatsPerMinute();
                                            arrayList10.add(new k1v.a(time17, beatsPerMinute2));
                                        }
                                        List D04 = j5g.D0(new h0i(1), arrayList10);
                                        metadata27 = d4.getMetadata();
                                        gkk0Var = new k1v(startTime16, startZoneOffset15, endTime16, endZoneOffset15, D04, mi20.b(metadata27));
                                    } else if (vd2.l(c)) {
                                        HeartRateVariabilityRmssdRecord c12 = o81.c(c);
                                        time16 = c12.getTime();
                                        zoneOffset14 = c12.getZoneOffset();
                                        heartRateVariabilityMillis = c12.getHeartRateVariabilityMillis();
                                        metadata26 = c12.getMetadata();
                                        gkk0Var = new l1v(time16, zoneOffset14, heartRateVariabilityMillis, mi20.b(metadata26));
                                    } else if (p81.m(c)) {
                                        HeightRecord d5 = q81.d(c);
                                        time15 = d5.getTime();
                                        zoneOffset13 = d5.getZoneOffset();
                                        height = d5.getHeight();
                                        c2z e7 = u3q0.e(height);
                                        metadata25 = d5.getMetadata();
                                        r90Var = new x1v(time15, zoneOffset13, e7, mi20.b(metadata25));
                                    } else if (r81.k(c)) {
                                        HydrationRecord c13 = s81.c(c);
                                        startTime15 = c13.getStartTime();
                                        startZoneOffset14 = c13.getStartZoneOffset();
                                        endTime15 = c13.getEndTime();
                                        endZoneOffset14 = c13.getEndZoneOffset();
                                        volume = c13.getVolume();
                                        v6x0.a aVar10 = v6x0.d;
                                        inLiters = volume.getInLiters();
                                        aVar10.getClass();
                                        v6x0 v6x0Var = new v6x0(inLiters, v6x0.b.LITERS);
                                        metadata24 = c13.getMetadata();
                                        gkk0Var = new olv(startTime15, startZoneOffset14, endTime15, endZoneOffset14, v6x0Var, mi20.b(metadata24));
                                    } else if (t81.l(c)) {
                                        IntermenstrualBleedingRecord e8 = u81.e(c);
                                        time14 = e8.getTime();
                                        zoneOffset12 = e8.getZoneOffset();
                                        metadata23 = e8.getMetadata();
                                        r90Var = new nfx(time14, zoneOffset12, mi20.b(metadata23));
                                    } else if (w81.m(c)) {
                                        LeanBodyMassRecord e9 = x81.e(c);
                                        time13 = e9.getTime();
                                        zoneOffset11 = e9.getZoneOffset();
                                        mass2 = e9.getMass();
                                        vi10 f3 = u3q0.f(mass2);
                                        metadata22 = e9.getMetadata();
                                        r90Var = new bzy(time13, zoneOffset11, f3, mi20.b(metadata22));
                                    } else if (z81.l(c)) {
                                        MenstruationFlowRecord e10 = a91.e(c);
                                        time12 = e10.getTime();
                                        zoneOffset10 = e10.getZoneOffset();
                                        flow = e10.getFlow();
                                        Integer num16 = (Integer) v8x.l.get(Integer.valueOf(flow));
                                        int intValue16 = num16 != null ? num16.intValue() : 0;
                                        metadata21 = e10.getMetadata();
                                        gkk0Var = new i320(intValue16, time12, zoneOffset10, mi20.b(metadata21));
                                    } else if (b91.k(c)) {
                                        MenstruationPeriodRecord c14 = c91.c(c);
                                        startTime14 = c14.getStartTime();
                                        startZoneOffset13 = c14.getStartZoneOffset();
                                        endTime14 = c14.getEndTime();
                                        endZoneOffset13 = c14.getEndZoneOffset();
                                        metadata20 = c14.getMetadata();
                                        gkk0Var = new j320(startTime14, startZoneOffset13, endTime14, endZoneOffset13, mi20.b(metadata20));
                                    } else if (d91.k(c)) {
                                        NutritionRecord d6 = e91.d(c);
                                        startTime13 = d6.getStartTime();
                                        startZoneOffset12 = d6.getStartZoneOffset();
                                        endTime13 = d6.getEndTime();
                                        endZoneOffset12 = d6.getEndZoneOffset();
                                        mealName = d6.getMealName();
                                        mealType = d6.getMealType();
                                        Integer num17 = (Integer) v8x.h.get(Integer.valueOf(mealType));
                                        int intValue17 = num17 != null ? num17.intValue() : 0;
                                        metadata19 = d6.getMetadata();
                                        hi20 b14 = mi20.b(metadata19);
                                        biotin = d6.getBiotin();
                                        vi10 a12 = biotin != null ? u3q0.a(biotin) : null;
                                        caffeine = d6.getCaffeine();
                                        vi10 a13 = caffeine != null ? u3q0.a(caffeine) : null;
                                        calcium = d6.getCalcium();
                                        vi10 a14 = calcium != null ? u3q0.a(calcium) : null;
                                        energy2 = d6.getEnergy();
                                        if (energy2 != null) {
                                            inCalories6 = energy2.getInCalories();
                                            if (inCalories6 == Double.MIN_VALUE) {
                                                energy2 = null;
                                            }
                                            if (energy2 != null) {
                                                jlp.a aVar11 = jlp.d;
                                                inCalories7 = energy2.getInCalories();
                                                aVar11.getClass();
                                                jlpVar4 = new jlp(inCalories7, jlp.b.CALORIES);
                                            } else {
                                                jlpVar4 = null;
                                            }
                                            jlpVar = jlpVar4;
                                        } else {
                                            jlpVar = null;
                                        }
                                        energyFromFat = d6.getEnergyFromFat();
                                        if (energyFromFat != null) {
                                            inCalories4 = energyFromFat.getInCalories();
                                            if (inCalories4 == Double.MIN_VALUE) {
                                                energyFromFat = null;
                                            }
                                            if (energyFromFat != null) {
                                                jlp.a aVar12 = jlp.d;
                                                inCalories5 = energyFromFat.getInCalories();
                                                aVar12.getClass();
                                                jlpVar3 = new jlp(inCalories5, jlp.b.CALORIES);
                                            } else {
                                                jlpVar3 = null;
                                            }
                                            jlpVar2 = jlpVar3;
                                        } else {
                                            jlpVar2 = null;
                                        }
                                        chloride = d6.getChloride();
                                        vi10 a15 = chloride != null ? u3q0.a(chloride) : null;
                                        cholesterol = d6.getCholesterol();
                                        vi10 a16 = cholesterol != null ? u3q0.a(cholesterol) : null;
                                        chromium = d6.getChromium();
                                        vi10 a17 = chromium != null ? u3q0.a(chromium) : null;
                                        copper = d6.getCopper();
                                        vi10 a18 = copper != null ? u3q0.a(copper) : null;
                                        dietaryFiber = d6.getDietaryFiber();
                                        vi10 a19 = dietaryFiber != null ? u3q0.a(dietaryFiber) : null;
                                        folate = d6.getFolate();
                                        vi10 a20 = folate != null ? u3q0.a(folate) : null;
                                        folicAcid = d6.getFolicAcid();
                                        vi10 a21 = folicAcid != null ? u3q0.a(folicAcid) : null;
                                        iodine = d6.getIodine();
                                        vi10 a22 = iodine != null ? u3q0.a(iodine) : null;
                                        iron = d6.getIron();
                                        vi10 a23 = iron != null ? u3q0.a(iron) : null;
                                        magnesium = d6.getMagnesium();
                                        vi10 a24 = magnesium != null ? u3q0.a(magnesium) : null;
                                        manganese = d6.getManganese();
                                        vi10 a25 = manganese != null ? u3q0.a(manganese) : null;
                                        molybdenum = d6.getMolybdenum();
                                        vi10 a26 = molybdenum != null ? u3q0.a(molybdenum) : null;
                                        monounsaturatedFat = d6.getMonounsaturatedFat();
                                        vi10 a27 = monounsaturatedFat != null ? u3q0.a(monounsaturatedFat) : null;
                                        niacin = d6.getNiacin();
                                        vi10 a28 = niacin != null ? u3q0.a(niacin) : null;
                                        pantothenicAcid = d6.getPantothenicAcid();
                                        vi10 a29 = pantothenicAcid != null ? u3q0.a(pantothenicAcid) : null;
                                        phosphorus = d6.getPhosphorus();
                                        vi10 a30 = phosphorus != null ? u3q0.a(phosphorus) : null;
                                        polyunsaturatedFat = d6.getPolyunsaturatedFat();
                                        vi10 a31 = polyunsaturatedFat != null ? u3q0.a(polyunsaturatedFat) : null;
                                        potassium = d6.getPotassium();
                                        vi10 a32 = potassium != null ? u3q0.a(potassium) : null;
                                        protein = d6.getProtein();
                                        vi10 a33 = protein != null ? u3q0.a(protein) : null;
                                        riboflavin = d6.getRiboflavin();
                                        vi10 a34 = riboflavin != null ? u3q0.a(riboflavin) : null;
                                        saturatedFat = d6.getSaturatedFat();
                                        vi10 a35 = saturatedFat != null ? u3q0.a(saturatedFat) : null;
                                        selenium = d6.getSelenium();
                                        vi10 a36 = selenium != null ? u3q0.a(selenium) : null;
                                        sodium = d6.getSodium();
                                        vi10 a37 = sodium != null ? u3q0.a(sodium) : null;
                                        sugar = d6.getSugar();
                                        vi10 a38 = sugar != null ? u3q0.a(sugar) : null;
                                        thiamin = d6.getThiamin();
                                        vi10 a39 = thiamin != null ? u3q0.a(thiamin) : null;
                                        totalCarbohydrate = d6.getTotalCarbohydrate();
                                        vi10 a40 = totalCarbohydrate != null ? u3q0.a(totalCarbohydrate) : null;
                                        totalFat = d6.getTotalFat();
                                        vi10 a41 = totalFat != null ? u3q0.a(totalFat) : null;
                                        transFat = d6.getTransFat();
                                        vi10 a42 = transFat != null ? u3q0.a(transFat) : null;
                                        unsaturatedFat = d6.getUnsaturatedFat();
                                        vi10 a43 = unsaturatedFat != null ? u3q0.a(unsaturatedFat) : null;
                                        vitaminA = d6.getVitaminA();
                                        vi10 a44 = vitaminA != null ? u3q0.a(vitaminA) : null;
                                        vitaminB12 = d6.getVitaminB12();
                                        vi10 a45 = vitaminB12 != null ? u3q0.a(vitaminB12) : null;
                                        vitaminB6 = d6.getVitaminB6();
                                        vi10 a46 = vitaminB6 != null ? u3q0.a(vitaminB6) : null;
                                        vitaminC = d6.getVitaminC();
                                        vi10 a47 = vitaminC != null ? u3q0.a(vitaminC) : null;
                                        vitaminD = d6.getVitaminD();
                                        vi10 a48 = vitaminD != null ? u3q0.a(vitaminD) : null;
                                        vitaminE = d6.getVitaminE();
                                        vi10 a49 = vitaminE != null ? u3q0.a(vitaminE) : null;
                                        vitaminK = d6.getVitaminK();
                                        vi10 a50 = vitaminK != null ? u3q0.a(vitaminK) : null;
                                        zinc = d6.getZinc();
                                        r90Var = new yn70(startTime13, startZoneOffset12, endTime13, endZoneOffset12, b14, a12, a13, a14, jlpVar, jlpVar2, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, a30, a31, a32, a33, a34, a35, a36, a37, a38, a39, a40, a41, a42, a43, a44, a45, a46, a47, a48, a49, a50, zinc != null ? u3q0.a(zinc) : null, mealName, intValue17);
                                    } else if (f91.m(c)) {
                                        OvulationTestRecord c15 = g91.c(c);
                                        time11 = c15.getTime();
                                        zoneOffset9 = c15.getZoneOffset();
                                        result = c15.getResult();
                                        Integer num18 = (Integer) v8x.r.get(Integer.valueOf(result));
                                        int intValue18 = num18 != null ? num18.intValue() : 0;
                                        metadata18 = c15.getMetadata();
                                        r90Var = new i490(intValue18, time11, zoneOffset9, mi20.b(metadata18));
                                    } else if (i91.k(c)) {
                                        OxygenSaturationRecord c16 = tu5.c(c);
                                        time10 = c16.getTime();
                                        zoneOffset8 = c16.getZoneOffset();
                                        percentage = c16.getPercentage();
                                        value = percentage.getValue();
                                        uv90 uv90Var2 = new uv90(value);
                                        metadata17 = c16.getMetadata();
                                        r90Var = new f690(time10, zoneOffset8, uv90Var2, mi20.b(metadata17));
                                    } else if (l91.n(c)) {
                                        PowerRecord h = m91.h(c);
                                        startTime12 = h.getStartTime();
                                        startZoneOffset11 = h.getStartZoneOffset();
                                        endTime12 = h.getEndTime();
                                        endZoneOffset11 = h.getEndZoneOffset();
                                        samples3 = h.getSamples();
                                        List list11 = samples3;
                                        ArrayList arrayList11 = new ArrayList(c5g.u(list11, 10));
                                        Iterator it17 = list11.iterator();
                                        while (it17.hasNext()) {
                                            PowerRecord.PowerRecordSample g2 = x81.g(it17.next());
                                            time9 = g2.getTime();
                                            power = g2.getPower();
                                            swc0.a aVar13 = swc0.d;
                                            inWatts3 = power.getInWatts();
                                            aVar13.getClass();
                                            arrayList11.add(new vwc0.d(time9, swc0.a.a(inWatts3)));
                                        }
                                        List D05 = j5g.D0(new chf0(0), arrayList11);
                                        metadata16 = h.getMetadata();
                                        gkk0Var = new vwc0(startTime12, startZoneOffset11, endTime12, endZoneOffset11, D05, mi20.b(metadata16));
                                    } else if (n91.h(c)) {
                                        RespiratoryRateRecord d7 = o91.d(c);
                                        time8 = d7.getTime();
                                        zoneOffset7 = d7.getZoneOffset();
                                        rate2 = d7.getRate();
                                        metadata15 = d7.getMetadata();
                                        gkk0Var = new ibg0(time8, zoneOffset7, rate2, mi20.b(metadata15));
                                    } else if (p91.l(c)) {
                                        RestingHeartRateRecord e11 = q91.e(c);
                                        time7 = e11.getTime();
                                        zoneOffset6 = e11.getZoneOffset();
                                        beatsPerMinute = e11.getBeatsPerMinute();
                                        metadata14 = e11.getMetadata();
                                        gkk0Var = new vbg0(time7, zoneOffset6, beatsPerMinute, mi20.b(metadata14));
                                    } else if (r91.j(c)) {
                                        SexualActivityRecord d8 = s91.d(c);
                                        time6 = d8.getTime();
                                        zoneOffset5 = d8.getZoneOffset();
                                        protectionUsed = d8.getProtectionUsed();
                                        Integer num19 = (Integer) v8x.v.get(Integer.valueOf(protectionUsed));
                                        int intValue19 = num19 != null ? num19.intValue() : 0;
                                        metadata13 = d8.getMetadata();
                                        gkk0Var = new e4j0(intValue19, time6, zoneOffset5, mi20.b(metadata13));
                                    } else if (v91.l(c)) {
                                        SleepSessionRecord a51 = d92.a(c);
                                        startTime10 = a51.getStartTime();
                                        startZoneOffset10 = a51.getStartZoneOffset();
                                        endTime10 = a51.getEndTime();
                                        endZoneOffset10 = a51.getEndZoneOffset();
                                        metadata12 = a51.getMetadata();
                                        hi20 b15 = mi20.b(metadata12);
                                        title3 = a51.getTitle();
                                        String obj9 = title3 != null ? title3.toString() : null;
                                        notes3 = a51.getNotes();
                                        String obj10 = notes3 != null ? notes3.toString() : null;
                                        stages = a51.getStages();
                                        List list12 = stages;
                                        ArrayList arrayList12 = new ArrayList(c5g.u(list12, 10));
                                        Iterator it18 = list12.iterator();
                                        while (it18.hasNext()) {
                                            SleepSessionRecord.Stage c17 = f81.c(it18.next());
                                            startTime11 = c17.getStartTime();
                                            endTime11 = c17.getEndTime();
                                            type = c17.getType();
                                            Integer num20 = (Integer) v8x.F.get(Integer.valueOf(type));
                                            arrayList12.add(new uzj0.a(startTime11, endTime11, num20 != null ? num20.intValue() : 0));
                                        }
                                        r90Var = new uzj0(startTime10, startZoneOffset10, endTime10, endZoneOffset10, b15, obj9, obj10, j5g.D0(new nvu(1), arrayList12));
                                    } else if (x91.j(c)) {
                                        SpeedRecord c18 = y91.c(c);
                                        startTime9 = c18.getStartTime();
                                        startZoneOffset9 = c18.getStartZoneOffset();
                                        endTime9 = c18.getEndTime();
                                        endZoneOffset9 = c18.getEndZoneOffset();
                                        samples2 = c18.getSamples();
                                        List list13 = samples2;
                                        ArrayList arrayList13 = new ArrayList(c5g.u(list13, 10));
                                        Iterator it19 = list13.iterator();
                                        while (it19.hasNext()) {
                                            SpeedRecord.SpeedRecordSample d9 = la1.d(it19.next());
                                            time5 = d9.getTime();
                                            speed = d9.getSpeed();
                                            imr0.a aVar14 = imr0.d;
                                            inMetersPerSecond3 = speed.getInMetersPerSecond();
                                            aVar14.getClass();
                                            arrayList13.add(new gkk0.d(time5, imr0.a.a(inMetersPerSecond3)));
                                        }
                                        List D06 = j5g.D0(new bqz(1), arrayList13);
                                        metadata11 = c18.getMetadata();
                                        gkk0Var = new gkk0(startTime9, startZoneOffset9, endTime9, endZoneOffset9, D06, mi20.b(metadata11));
                                    } else {
                                        if (z91.l(c)) {
                                            StepsCadenceRecord f4 = aa1.f(c);
                                            startTime8 = f4.getStartTime();
                                            startZoneOffset8 = f4.getStartZoneOffset();
                                            endTime8 = f4.getEndTime();
                                            endZoneOffset8 = f4.getEndZoneOffset();
                                            samples = f4.getSamples();
                                            List list14 = samples;
                                            i2 = 10;
                                            ArrayList arrayList14 = new ArrayList(c5g.u(list14, 10));
                                            Iterator it20 = list14.iterator();
                                            while (it20.hasNext()) {
                                                StepsCadenceRecord.StepsCadenceRecordSample d10 = u91.d(it20.next());
                                                time4 = d10.getTime();
                                                rate = d10.getRate();
                                                arrayList14.add(new r0l0.a(rate, time4));
                                            }
                                            i3 = 1;
                                            List D07 = j5g.D0(new nj30(i3), arrayList14);
                                            metadata10 = f4.getMetadata();
                                            zcp0Var = new r0l0(startTime8, startZoneOffset8, endTime8, endZoneOffset8, D07, mi20.b(metadata10));
                                        } else {
                                            i2 = 10;
                                            i3 = 1;
                                            if (ba1.j(c)) {
                                                StepsRecord b16 = ca1.b(c);
                                                startTime7 = b16.getStartTime();
                                                startZoneOffset7 = b16.getStartZoneOffset();
                                                endTime7 = b16.getEndTime();
                                                endZoneOffset7 = b16.getEndZoneOffset();
                                                count2 = b16.getCount();
                                                metadata9 = b16.getMetadata();
                                                qkx0Var = new x0l0(startTime7, startZoneOffset7, endTime7, endZoneOffset7, count2, mi20.b(metadata9));
                                            } else if (da1.j(c)) {
                                                TotalCaloriesBurnedRecord d11 = ea1.d(c);
                                                startTime6 = d11.getStartTime();
                                                startZoneOffset6 = d11.getStartZoneOffset();
                                                endTime6 = d11.getEndTime();
                                                endZoneOffset6 = d11.getEndZoneOffset();
                                                energy = d11.getEnergy();
                                                jlp.a aVar15 = jlp.d;
                                                inCalories3 = energy.getInCalories();
                                                aVar15.getClass();
                                                jlp jlpVar6 = new jlp(inCalories3, jlp.b.CALORIES);
                                                metadata8 = d11.getMetadata();
                                                zcp0Var = new zcp0(startTime6, startZoneOffset6, endTime6, endZoneOffset6, jlpVar6, mi20.b(metadata8));
                                            } else if (f92.k(c)) {
                                                Vo2MaxRecord c19 = ia1.c(c);
                                                time3 = c19.getTime();
                                                zoneOffset4 = c19.getZoneOffset();
                                                vo2MillilitersPerMinuteKilogram = c19.getVo2MillilitersPerMinuteKilogram();
                                                measurementMethod = c19.getMeasurementMethod();
                                                Integer num21 = (Integer) v8x.j.get(Integer.valueOf(measurementMethod));
                                                int intValue20 = num21 != null ? num21.intValue() : 0;
                                                metadata7 = c19.getMetadata();
                                                qkx0Var = new qbw0(time3, zoneOffset4, mi20.b(metadata7), vo2MillilitersPerMinuteKilogram, intValue20);
                                            } else if (ja1.g(c)) {
                                                WeightRecord d12 = ka1.d(c);
                                                time2 = d12.getTime();
                                                zoneOffset3 = d12.getZoneOffset();
                                                weight = d12.getWeight();
                                                vi10 f5 = u3q0.f(weight);
                                                metadata6 = d12.getMetadata();
                                                r90Var = new jkx0(time2, zoneOffset3, f5, mi20.b(metadata6));
                                                arrayList.add(r90Var);
                                                i6 = i2;
                                                i5 = i3;
                                                b = readRecordsResponse;
                                                it = it2;
                                                obj3 = null;
                                            } else {
                                                if (!la1.i(c)) {
                                                    throw new IllegalArgumentException("Unsupported record " + c);
                                                }
                                                WheelchairPushesRecord f6 = ma1.f(c);
                                                startTime5 = f6.getStartTime();
                                                startZoneOffset5 = f6.getStartZoneOffset();
                                                endTime5 = f6.getEndTime();
                                                endZoneOffset5 = f6.getEndZoneOffset();
                                                count = f6.getCount();
                                                metadata5 = f6.getMetadata();
                                                qkx0Var = new qkx0(startTime5, startZoneOffset5, endTime5, endZoneOffset5, count, mi20.b(metadata5));
                                            }
                                            r90Var = qkx0Var;
                                            arrayList.add(r90Var);
                                            i6 = i2;
                                            i5 = i3;
                                            b = readRecordsResponse;
                                            it = it2;
                                            obj3 = null;
                                        }
                                        r90Var = zcp0Var;
                                        arrayList.add(r90Var);
                                        i6 = i2;
                                        i5 = i3;
                                        b = readRecordsResponse;
                                        it = it2;
                                        obj3 = null;
                                    }
                                    r90Var = gkk0Var;
                                }
                                i2 = 10;
                                i3 = 1;
                                arrayList.add(r90Var);
                                i6 = i2;
                                i5 = i3;
                                b = readRecordsResponse;
                                it = it2;
                                obj3 = null;
                            } else {
                                readRecordsResponse = b;
                                it2 = it;
                            }
                            r90Var = null;
                            if (r90Var == null) {
                            }
                            i2 = 10;
                            i3 = 1;
                            arrayList.add(r90Var);
                            i6 = i2;
                            i5 = i3;
                            b = readRecordsResponse;
                            it = it2;
                            obj3 = null;
                        }
                    }
                    readRecordsResponse = b;
                    it2 = it;
                    i2 = i6;
                    i3 = i5;
                    arrayList.add(r90Var);
                    i6 = i2;
                    i5 = i3;
                    b = readRecordsResponse;
                    it = it2;
                    obj3 = null;
                }
                nextPageToken = b.getNextPageToken();
                l = new Long(nextPageToken);
                if (l.longValue() == -1) {
                    l = null;
                }
                return new k7f0(l == null ? l.toString() : null, arrayList);
            }
        }
        vzuVar = new vzu(this, continuationImpl);
        Object obj11 = vzuVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vzuVar.label;
        int i52 = 1;
        Object obj32 = null;
        if (i != 0) {
        }
        ReadRecordsResponse b17 = r81.b(obj11);
        records = b17.getRecords();
        List list15 = records;
        int i62 = 10;
        ArrayList arrayList15 = new ArrayList(c5g.u(list15, 10));
        it = list15.iterator();
        while (it.hasNext()) {
        }
        nextPageToken = b17.getNextPageToken();
        l = new Long(nextPageToken);
        if (l.longValue() == -1) {
        }
        return new k7f0(l == null ? l.toString() : null, arrayList15);
    }

    @Override // xsna.sx90
    public final Object c(spj<? super Set<String>> spjVar) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        Context context = this.c;
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        of = PackageManager.PackageInfoFlags.of(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
        packageInfo = packageManager.getPackageInfo(packageName, of);
        SetBuilder setBuilder = new SetBuilder();
        String[] strArr = packageInfo.requestedPermissions;
        if (strArr == null) {
            strArr = new String[0];
        }
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (brm0.B(strArr[i], "android.permission.health.", false) && (packageInfo.requestedPermissionsFlags[i] & 2) > 0) {
                setBuilder.add(strArr[i]);
            }
        }
        return setBuilder.d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0058, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // xsna.czu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(t71 t71Var, ContinuationImpl continuationImpl) {
        rzu rzuVar;
        int i;
        Set S0;
        androidx.health.connect.client.aggregate.c cVar;
        Set set;
        if (continuationImpl instanceof rzu) {
            rzuVar = (rzu) continuationImpl;
            int i2 = rzuVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rzuVar.label = i2 - Integer.MIN_VALUE;
                Object obj = rzuVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rzuVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (t71Var.a.isEmpty()) {
                        throw new IllegalArgumentException("At least one of the aggregation types must be set");
                    }
                    rzuVar.L$0 = t71Var;
                    rzuVar.label = 1;
                    obj = kzu.c(this, t71Var, rzuVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        set = (Set) rzuVar.L$1;
                        cVar = (androidx.health.connect.client.aggregate.c) rzuVar.L$0;
                        kotlin.a.a(obj);
                        AggregateRecordsResponse a2 = v81.a(obj);
                        return qbg0.a(set, new r50(a2, 4), new yp1(a2, 10)).c(cVar);
                    }
                    t71Var = (t71) rzuVar.L$0;
                    kotlin.a.a(obj);
                }
                androidx.health.connect.client.aggregate.c cVar2 = (androidx.health.connect.client.aggregate.c) obj;
                Set<AggregateMetric<?>> set2 = t71Var.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : set2) {
                    if (y71.a((AggregateMetric) obj3)) {
                        arrayList.add(obj3);
                    }
                }
                S0 = j5g.S0(arrayList);
                if (!S0.isEmpty()) {
                    return cVar2;
                }
                izs szuVar = new szu(this, t71Var, null);
                rzuVar.L$0 = cVar2;
                rzuVar.L$1 = S0;
                rzuVar.label = 2;
                Object f = f(szuVar, rzuVar);
                if (f != obj2) {
                    cVar = cVar2;
                    obj = f;
                    set = S0;
                    AggregateRecordsResponse a22 = v81.a(obj);
                    return qbg0.a(set, new r50(a22, 4), new yp1(a22, 10)).c(cVar);
                }
                return obj2;
            }
        }
        rzuVar = new rzu(this, continuationImpl);
        Object obj4 = rzuVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rzuVar.label;
        if (i != 0) {
        }
        androidx.health.connect.client.aggregate.c cVar22 = (androidx.health.connect.client.aggregate.c) obj4;
        Set<AggregateMetric<?>> set22 = t71Var.a;
        ArrayList arrayList2 = new ArrayList();
        while (r2.hasNext()) {
        }
        S0 = j5g.S0(arrayList2);
        if (!S0.isEmpty()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(izs izsVar, ContinuationImpl continuationImpl) {
        xzu xzuVar;
        int i;
        int errorCode;
        String message;
        try {
            if (continuationImpl instanceof xzu) {
                xzuVar = (xzu) continuationImpl;
                int i2 = xzuVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    xzuVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = xzuVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = xzuVar.label;
                    if (i == 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return obj;
                    }
                    kotlin.a.a(obj);
                    xzuVar.label = 1;
                    Object invoke = izsVar.invoke(xzuVar);
                    return invoke == coroutineSingletons ? coroutineSingletons : invoke;
                }
            }
            if (i == 0) {
            }
        } catch (HealthConnectException e) {
            errorCode = e.getErrorCode();
            if (errorCode == 3) {
                throw new IllegalArgumentException(e);
            }
            if (errorCode == 4) {
                throw new IOException(e);
            }
            if (errorCode == 5) {
                throw new SecurityException(e);
            }
            if (errorCode != 6) {
                throw new IllegalStateException(e);
            }
            message = e.getMessage();
            throw new RemoteException(message);
        }
        xzuVar = new xzu(this, continuationImpl);
        Object obj2 = xzuVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = xzuVar.label;
    }

    @Override // xsna.czu
    public final sx90 e() {
        return this;
    }
}
