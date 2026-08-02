package xsna;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* compiled from: RecordsTypeNameMap.kt */
/* loaded from: classes12.dex */
public final class whf0 {
    public static final Object a;
    public static final LinkedHashMap b;

    static {
        Map k = pn00.k(new Pair("ActiveCaloriesBurned", fpf0.a(f80.class)), new Pair("ActivityIntensity", fpf0.a(r90.class)), new Pair("ActivitySession", fpf0.a(n4q.class)), new Pair("BasalBodyTemperature", fpf0.a(e46.class)), new Pair("BasalMetabolicRate", fpf0.a(f46.class)), new Pair("BloodGlucose", fpf0.a(fg7.class)), new Pair("BloodPressure", fpf0.a(jg7.class)), new Pair("BodyFat", fpf0.a(oj7.class)), new Pair("BodyTemperature", fpf0.a(uj7.class)), new Pair("BodyWaterMass", fpf0.a(vj7.class)), new Pair("BoneMass", fpf0.a(xj7.class)), new Pair("CervicalMucus", fpf0.a(nqa.class)), new Pair("CyclingPedalingCadenceSeries", fpf0.a(dqk.class)), new Pair("Distance", fpf0.a(bhn.class)), new Pair("ElevationGained", fpf0.a(cbp.class)), new Pair("FloorsClimbed", fpf0.a(jsr.class)), new Pair("HeartRateSeries", fpf0.a(k1v.class)), new Pair("HeartRateVariabilityRmssd", fpf0.a(l1v.class)), new Pair("Height", fpf0.a(x1v.class)), new Pair("Hydration", fpf0.a(olv.class)), new Pair("LeanBodyMass", fpf0.a(bzy.class)), new Pair("Menstruation", fpf0.a(i320.class)), new Pair("MenstruationPeriod", fpf0.a(j320.class)), new Pair("MindfulnessSession", fpf0.a(mo20.class)), new Pair("Nutrition", fpf0.a(yn70.class)), new Pair("OvulationTest", fpf0.a(i490.class)), new Pair("OxygenSaturation", fpf0.a(f690.class)), new Pair("PowerSeries", fpf0.a(vwc0.class)), new Pair("RespiratoryRate", fpf0.a(ibg0.class)), new Pair("RestingHeartRate", fpf0.a(vbg0.class)), new Pair("SexualActivity", fpf0.a(e4j0.class)), new Pair("SkinTemperature", fpf0.a(fzj0.class)), new Pair("SleepSession", fpf0.a(uzj0.class)), new Pair("SpeedSeries", fpf0.a(gkk0.class)), new Pair("IntermenstrualBleeding", fpf0.a(nfx.class)), new Pair("Steps", fpf0.a(x0l0.class)), new Pair("StepsCadenceSeries", fpf0.a(r0l0.class)), new Pair("TotalCaloriesBurned", fpf0.a(zcp0.class)), new Pair("Vo2Max", fpf0.a(qbw0.class)), new Pair("WheelchairPushes", fpf0.a(qkx0.class)), new Pair("Weight", fpf0.a(jkx0.class)));
        a = k;
        Set<Map.Entry> entrySet = k.entrySet();
        int e = on00.e(c5g.u(entrySet, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Map.Entry entry : entrySet) {
            Pair pair = new Pair(entry.getValue(), entry.getKey());
            linkedHashMap.put(pair.i(), pair.j());
        }
        b = linkedHashMap;
    }
}
