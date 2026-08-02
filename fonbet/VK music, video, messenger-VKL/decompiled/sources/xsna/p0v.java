package xsna;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;

/* compiled from: HealthPermission.kt */
/* loaded from: classes12.dex */
public final class p0v {
    public static final Object a;
    public static final ListBuilder b;
    public static final ListBuilder c;

    /* compiled from: HealthPermission.kt */
    public static final class a {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        public static String a(rfc rfcVar) {
            ?? r0 = p0v.a;
            if (r0.get(rfcVar) != null) {
                return "android.permission.health.READ_" + ((String) r0.get(rfcVar));
            }
            throw new IllegalArgumentException("Given recordType is not valid : " + rfcVar + ".simpleName");
        }
    }

    static {
        Map k = pn00.k(new Pair(fpf0.a(f80.class), drm0.g0("android.permission.health.READ_ACTIVE_CALORIES_BURNED", "android.permission.health.READ_", "android.permission.health.READ_ACTIVE_CALORIES_BURNED")), new Pair(fpf0.a(e46.class), drm0.g0("android.permission.health.READ_BASAL_BODY_TEMPERATURE", "android.permission.health.READ_", "android.permission.health.READ_BASAL_BODY_TEMPERATURE")), new Pair(fpf0.a(f46.class), drm0.g0("android.permission.health.READ_BASAL_METABOLIC_RATE", "android.permission.health.READ_", "android.permission.health.READ_BASAL_METABOLIC_RATE")), new Pair(fpf0.a(fg7.class), drm0.g0("android.permission.health.READ_BLOOD_GLUCOSE", "android.permission.health.READ_", "android.permission.health.READ_BLOOD_GLUCOSE")), new Pair(fpf0.a(jg7.class), drm0.g0("android.permission.health.READ_BLOOD_PRESSURE", "android.permission.health.READ_", "android.permission.health.READ_BLOOD_PRESSURE")), new Pair(fpf0.a(oj7.class), drm0.g0("android.permission.health.READ_BODY_FAT", "android.permission.health.READ_", "android.permission.health.READ_BODY_FAT")), new Pair(fpf0.a(uj7.class), drm0.g0("android.permission.health.READ_BODY_TEMPERATURE", "android.permission.health.READ_", "android.permission.health.READ_BODY_TEMPERATURE")), new Pair(fpf0.a(vj7.class), drm0.g0("android.permission.health.READ_BODY_WATER_MASS", "android.permission.health.READ_", "android.permission.health.READ_BODY_WATER_MASS")), new Pair(fpf0.a(xj7.class), drm0.g0("android.permission.health.READ_BONE_MASS", "android.permission.health.READ_", "android.permission.health.READ_BONE_MASS")), new Pair(fpf0.a(nqa.class), drm0.g0("android.permission.health.READ_CERVICAL_MUCUS", "android.permission.health.READ_", "android.permission.health.READ_CERVICAL_MUCUS")), new Pair(fpf0.a(dqk.class), drm0.g0("android.permission.health.READ_EXERCISE", "android.permission.health.READ_", "android.permission.health.READ_EXERCISE")), new Pair(fpf0.a(bhn.class), drm0.g0("android.permission.health.READ_DISTANCE", "android.permission.health.READ_", "android.permission.health.READ_DISTANCE")), new Pair(fpf0.a(cbp.class), drm0.g0("android.permission.health.READ_ELEVATION_GAINED", "android.permission.health.READ_", "android.permission.health.READ_ELEVATION_GAINED")), new Pair(fpf0.a(n4q.class), drm0.g0("android.permission.health.READ_EXERCISE", "android.permission.health.READ_", "android.permission.health.READ_EXERCISE")), new Pair(fpf0.a(jsr.class), drm0.g0("android.permission.health.READ_FLOORS_CLIMBED", "android.permission.health.READ_", "android.permission.health.READ_FLOORS_CLIMBED")), new Pair(fpf0.a(k1v.class), drm0.g0("android.permission.health.READ_HEART_RATE", "android.permission.health.READ_", "android.permission.health.READ_HEART_RATE")), new Pair(fpf0.a(l1v.class), drm0.g0("android.permission.health.READ_HEART_RATE_VARIABILITY", "android.permission.health.READ_", "android.permission.health.READ_HEART_RATE_VARIABILITY")), new Pair(fpf0.a(x1v.class), drm0.g0("android.permission.health.READ_HEIGHT", "android.permission.health.READ_", "android.permission.health.READ_HEIGHT")), new Pair(fpf0.a(olv.class), drm0.g0("android.permission.health.READ_HYDRATION", "android.permission.health.READ_", "android.permission.health.READ_HYDRATION")), new Pair(fpf0.a(nfx.class), drm0.g0("android.permission.health.READ_INTERMENSTRUAL_BLEEDING", "android.permission.health.READ_", "android.permission.health.READ_INTERMENSTRUAL_BLEEDING")), new Pair(fpf0.a(bzy.class), drm0.g0("android.permission.health.READ_LEAN_BODY_MASS", "android.permission.health.READ_", "android.permission.health.READ_LEAN_BODY_MASS")), new Pair(fpf0.a(i320.class), drm0.g0("android.permission.health.READ_MENSTRUATION", "android.permission.health.READ_", "android.permission.health.READ_MENSTRUATION")), new Pair(fpf0.a(j320.class), drm0.g0("android.permission.health.READ_MENSTRUATION", "android.permission.health.READ_", "android.permission.health.READ_MENSTRUATION")), new Pair(fpf0.a(mo20.class), drm0.g0("android.permission.health.READ_MINDFULNESS", "android.permission.health.READ_", "android.permission.health.READ_MINDFULNESS")), new Pair(fpf0.a(yn70.class), drm0.g0("android.permission.health.READ_NUTRITION", "android.permission.health.READ_", "android.permission.health.READ_NUTRITION")), new Pair(fpf0.a(i490.class), drm0.g0("android.permission.health.READ_OVULATION_TEST", "android.permission.health.READ_", "android.permission.health.READ_OVULATION_TEST")), new Pair(fpf0.a(f690.class), drm0.g0("android.permission.health.READ_OXYGEN_SATURATION", "android.permission.health.READ_", "android.permission.health.READ_OXYGEN_SATURATION")), new Pair(fpf0.a(cta0.class), drm0.g0("android.permission.health.READ_PLANNED_EXERCISE", "android.permission.health.READ_", "android.permission.health.READ_PLANNED_EXERCISE")), new Pair(fpf0.a(vwc0.class), drm0.g0("android.permission.health.READ_POWER", "android.permission.health.READ_", "android.permission.health.READ_POWER")), new Pair(fpf0.a(ibg0.class), drm0.g0("android.permission.health.READ_RESPIRATORY_RATE", "android.permission.health.READ_", "android.permission.health.READ_RESPIRATORY_RATE")), new Pair(fpf0.a(vbg0.class), drm0.g0("android.permission.health.READ_RESTING_HEART_RATE", "android.permission.health.READ_", "android.permission.health.READ_RESTING_HEART_RATE")), new Pair(fpf0.a(e4j0.class), drm0.g0("android.permission.health.READ_SEXUAL_ACTIVITY", "android.permission.health.READ_", "android.permission.health.READ_SEXUAL_ACTIVITY")), new Pair(fpf0.a(uzj0.class), drm0.g0("android.permission.health.READ_SLEEP", "android.permission.health.READ_", "android.permission.health.READ_SLEEP")), new Pair(fpf0.a(gkk0.class), drm0.g0("android.permission.health.READ_SPEED", "android.permission.health.READ_", "android.permission.health.READ_SPEED")), new Pair(fpf0.a(fzj0.class), drm0.g0("android.permission.health.READ_SKIN_TEMPERATURE", "android.permission.health.READ_", "android.permission.health.READ_SKIN_TEMPERATURE")), new Pair(fpf0.a(r0l0.class), drm0.g0("android.permission.health.READ_STEPS", "android.permission.health.READ_", "android.permission.health.READ_STEPS")), new Pair(fpf0.a(x0l0.class), drm0.g0("android.permission.health.READ_STEPS", "android.permission.health.READ_", "android.permission.health.READ_STEPS")), new Pair(fpf0.a(zcp0.class), drm0.g0("android.permission.health.READ_TOTAL_CALORIES_BURNED", "android.permission.health.READ_", "android.permission.health.READ_TOTAL_CALORIES_BURNED")), new Pair(fpf0.a(qbw0.class), drm0.g0("android.permission.health.READ_VO2_MAX", "android.permission.health.READ_", "android.permission.health.READ_VO2_MAX")), new Pair(fpf0.a(jkx0.class), drm0.g0("android.permission.health.READ_WEIGHT", "android.permission.health.READ_", "android.permission.health.READ_WEIGHT")), new Pair(fpf0.a(qkx0.class), drm0.g0("android.permission.health.READ_WHEELCHAIR_PUSHES", "android.permission.health.READ_", "android.permission.health.READ_WHEELCHAIR_PUSHES")), new Pair(fpf0.a(r90.class), drm0.g0("android.permission.health.READ_ACTIVITY_INTENSITY", "android.permission.health.READ_", "android.permission.health.READ_ACTIVITY_INTENSITY")));
        a = k;
        ListBuilder e = e43.e();
        e.add("android.permission.health.WRITE_MEDICAL_DATA");
        e.add("android.permission.health.READ_MEDICAL_DATA_ALLERGIES_INTOLERANCES");
        e.add("android.permission.health.READ_MEDICAL_DATA_CONDITIONS");
        e.add("android.permission.health.READ_MEDICAL_DATA_LABORATORY_RESULTS");
        e.add("android.permission.health.READ_MEDICAL_DATA_MEDICATIONS");
        e.add("android.permission.health.READ_MEDICAL_DATA_PERSONAL_DETAILS");
        e.add("android.permission.health.READ_MEDICAL_DATA_PRACTITIONER_DETAILS");
        e.add("android.permission.health.READ_MEDICAL_DATA_PREGNANCY");
        e.add("android.permission.health.READ_MEDICAL_DATA_PROCEDURES");
        e.add("android.permission.health.READ_MEDICAL_DATA_SOCIAL_HISTORY");
        e.add("android.permission.health.READ_MEDICAL_DATA_VACCINES");
        e.add("android.permission.health.READ_MEDICAL_DATA_VISITS");
        e.add("android.permission.health.READ_MEDICAL_DATA_VITAL_SIGNS");
        b = e.g();
        ListBuilder e2 = e43.e();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : k.entrySet()) {
            g5g.y(e43.l("android.permission.health.WRITE_" + ((String) entry.getValue()), "android.permission.health.READ_" + ((String) entry.getValue())), arrayList);
        }
        e2.addAll(arrayList);
        e2.addAll(b);
        e2.add("android.permission.health.WRITE_EXERCISE_ROUTE");
        e2.add("android.permission.health.READ_HEALTH_DATA_IN_BACKGROUND");
        e2.add("android.permission.health.READ_HEALTH_DATA_HISTORY");
        e2.add("android.permission.health.READ_EXERCISE_ROUTES");
        c = e2.g();
    }
}
