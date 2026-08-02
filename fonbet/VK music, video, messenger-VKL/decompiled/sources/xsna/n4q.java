package xsna;

import androidx.core.app.NotificationCompat;
import androidx.health.connect.client.aggregate.AggregateMetric;
import com.huawei.hms.hihealth.HiHealthActivities;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import xsna.i4q;
import xsna.k4q;

/* compiled from: ExerciseSessionRecord.kt */
/* loaded from: classes12.dex */
public final class n4q implements oox {
    public static final AggregateMetric<Duration> m = new AggregateMetric<>(androidx.health.connect.client.aggregate.b.b, "ActiveTime", AggregateMetric.AggregationType.TOTAL, "time");
    public static final Object n;
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final hi20 e;
    public final int f;
    public final String g;
    public final String h;
    public final List<l4q> i;
    public final List<g4q> j;
    public final k4q k;
    public final String l;

    /* compiled from: ExerciseSessionRecord.kt */
    public static final class a extends Lambda implements wzs<g4q, g4q, Integer> {
        public static final a i = new a(2);

        @Override // xsna.wzs
        public final Integer invoke(g4q g4qVar, g4q g4qVar2) {
            return Integer.valueOf(g4qVar.a.compareTo(g4qVar2.a));
        }
    }

    /* compiled from: ExerciseSessionRecord.kt */
    public static final class b extends Lambda implements wzs<l4q, l4q, Integer> {
        public static final b i = new b(2);

        @Override // xsna.wzs
        public final Integer invoke(l4q l4qVar, l4q l4qVar2) {
            return Integer.valueOf(l4qVar.a.compareTo(l4qVar2.a));
        }
    }

    static {
        Map k = pn00.k(new Pair("back_extension", 13), new Pair(HiHealthActivities.BADMINTON, 2), new Pair("barbell_shoulder_press", 70), new Pair(HiHealthActivities.BASEBALL, 4), new Pair(HiHealthActivities.BASKETBALL, 5), new Pair("bench_press", 70), new Pair("bench_sit_up", 13), new Pair("biking", 8), new Pair("biking_stationary", 9), new Pair("boot_camp", 10), new Pair(HiHealthActivities.BOXING, 11), new Pair("burpee", 13), new Pair(HiHealthActivities.CRICKET, 14), new Pair("crunch", 13), new Pair(HiHealthActivities.DANCING, 16), new Pair("deadlift", 70), new Pair("dumbbell_curl_left_arm", 70), new Pair("dumbbell_curl_right_arm", 70), new Pair("dumbbell_front_raise", 70), new Pair("dumbbell_lateral_raise", 70), new Pair("dumbbell_triceps_extension_left_arm", 70), new Pair("dumbbell_triceps_extension_right_arm", 70), new Pair("dumbbell_triceps_extension_two_arm", 70), new Pair(HiHealthActivities.ELLIPTICAL, 25), new Pair("exercise_class", 26), new Pair(HiHealthActivities.FENCING, 27), new Pair("football_american", 28), new Pair("football_australian", 29), new Pair("forward_twist", 13), new Pair("frisbee_disc", 31), new Pair("golf", 32), new Pair("guided_breathing", 33), new Pair(HiHealthActivities.GYMNASTICS, 34), new Pair(HiHealthActivities.HANDBALL, 35), new Pair(HiHealthActivities.HIKING, 37), new Pair(HiHealthActivities.ICE_HOCKEY, 38), new Pair(HiHealthActivities.ICE_SKATING, 39), new Pair("jumping_jack", 36), new Pair("jump_rope", 36), new Pair("lat_pull_down", 70), new Pair("lunge", 13), new Pair(HiHealthActivities.MARTIAL_ARTS, 44), new Pair("paddling", 46), new Pair("para_gliding", 47), new Pair(HiHealthActivities.PILATES, 48), new Pair("plank", 13), new Pair(HiHealthActivities.RACQUETBALL, 50), new Pair(HiHealthActivities.ROCK_CLIMBING, 51), new Pair("roller_hockey", 52), new Pair(HiHealthActivities.ROWING, 53), new Pair("rowing_machine", 54), new Pair(HiHealthActivities.RUGBY, 55), new Pair(HiHealthActivities.RUNNING, 56), new Pair("running_treadmill", 57), new Pair(HiHealthActivities.SAILING, 58), new Pair(HiHealthActivities.SCUBA_DIVING, 59), new Pair(HiHealthActivities.SKATING, 60), new Pair(HiHealthActivities.SKIING, 61), new Pair(HiHealthActivities.SNOWBOARDING, 62), new Pair(HiHealthActivities.SNOWSHOEING, 63), new Pair("soccer", 64), new Pair(HiHealthActivities.SOFTBALL, 65), new Pair(HiHealthActivities.SQUASH, 66), new Pair("squat", 13), new Pair(HiHealthActivities.STAIR_CLIMBING, 68), new Pair("stair_climbing_machine", 69), new Pair("stretching", 71), new Pair(HiHealthActivities.SURFING, 72), new Pair("swimming_open_water", 73), new Pair("swimming_pool", 74), new Pair(HiHealthActivities.TABLE_TENNIS, 75), new Pair(HiHealthActivities.TENNIS, 76), new Pair("upper_twist", 13), new Pair(HiHealthActivities.VOLLEYBALL, 78), new Pair(HiHealthActivities.WALKING, 79), new Pair(HiHealthActivities.WATER_POLO, 80), new Pair(HiHealthActivities.WEIGHTLIFTING, 81), new Pair(HiHealthActivities.WHEELCHAIR, 82), new Pair(NotificationCompat.CATEGORY_WORKOUT, 0), new Pair(HiHealthActivities.YOGA, 83), new Pair(HiHealthActivities.CALISTHENICS, 13), new Pair("high_intensity_interval_training", 36), new Pair(HiHealthActivities.STRENGTH_TRAINING, 70));
        n = k;
        Set<Map.Entry> entrySet = k.entrySet();
        int e = on00.e(c5g.u(entrySet, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Map.Entry entry : entrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (String) entry.getKey());
        }
    }

    /* JADX WARN: Type inference failed for: r6v24, types: [java.lang.Object, java.util.Map] */
    public n4q(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, hi20 hi20Var, int i, String str, String str2, List<l4q> list, List<g4q> list2, k4q k4qVar, String str3) {
        boolean contains;
        this.a = instant;
        this.b = zoneOffset;
        this.c = instant2;
        this.d = zoneOffset2;
        this.e = hi20Var;
        this.f = i;
        this.g = str;
        this.h = str2;
        this.i = list;
        this.j = list2;
        this.k = k4qVar;
        this.l = str3;
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("startTime must be before endTime.");
        }
        if (!list.isEmpty()) {
            final b bVar = b.i;
            List<l4q> D0 = j5g.D0(new Comparator() { // from class: xsna.m4q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((Number) wzs.this.invoke(obj, obj2)).intValue();
                }
            }, list);
            int h = e43.h(D0);
            int i2 = 0;
            while (i2 < h) {
                Instant instant3 = ((l4q) D0.get(i2)).b;
                i2++;
                if (instant3.isAfter(((l4q) D0.get(i2)).a)) {
                    throw new IllegalArgumentException("segments can not overlap.");
                }
            }
            if (((l4q) j5g.Y(D0)).a.isBefore(this.a)) {
                throw new IllegalArgumentException("segments can not be out of parent time range.");
            }
            if (((l4q) j5g.i0(D0)).b.isAfter(this.c)) {
                throw new IllegalArgumentException("segments can not be out of parent time range.");
            }
            for (l4q l4qVar : D0) {
                Set<Integer> set = l4q.e;
                int i3 = l4qVar.c;
                int i4 = this.f;
                if (l4q.e.contains(Integer.valueOf(i4)) || l4q.f.contains(Integer.valueOf(i3))) {
                    contains = true;
                } else {
                    Set set2 = (Set) l4q.i.get(Integer.valueOf(i4));
                    contains = set2 != null ? set2.contains(Integer.valueOf(i3)) : false;
                }
                if (!contains) {
                    throw new IllegalArgumentException("segmentType and sessionType is not compatible.");
                }
            }
        }
        if (!this.j.isEmpty()) {
            List D02 = j5g.D0(new w6i(a.i, r2), this.j);
            int h2 = e43.h(D02);
            int i5 = 0;
            while (i5 < h2) {
                Instant instant4 = ((g4q) D02.get(i5)).b;
                i5++;
                if (instant4.isAfter(((g4q) D02.get(i5)).a)) {
                    throw new IllegalArgumentException("laps can not overlap.");
                }
            }
            if (((g4q) j5g.Y(D02)).a.isBefore(this.a)) {
                throw new IllegalArgumentException("laps can not be out of parent time range.");
            }
            if (((g4q) j5g.i0(D02)).b.isAfter(this.c)) {
                throw new IllegalArgumentException("laps can not be out of parent time range.");
            }
        }
        k4q k4qVar2 = this.k;
        if (!(k4qVar2 instanceof k4q.b) || ((k4q.b) k4qVar2).a.a.isEmpty()) {
            return;
        }
        ArrayList arrayList = ((k4q.b) this.k).a.a;
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            Instant instant5 = ((i4q.a) next).a;
            do {
                Object next2 = it.next();
                Instant instant6 = ((i4q.a) next2).a;
                if (instant5.compareTo(instant6) > 0) {
                    next = next2;
                    instant5 = instant6;
                }
            } while (it.hasNext());
        }
        Instant instant7 = ((i4q.a) next).a;
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next3 = it2.next();
        if (it2.hasNext()) {
            Instant instant8 = ((i4q.a) next3).a;
            do {
                Object next4 = it2.next();
                Instant instant9 = ((i4q.a) next4).a;
                if (instant8.compareTo(instant9) < 0) {
                    next3 = next4;
                    instant8 = instant9;
                }
            } while (it2.hasNext());
        }
        if (((instant7.isBefore(this.a) || !((i4q.a) next3).a.isBefore(this.c)) ? 0 : 1) == 0) {
            throw new IllegalArgumentException("route can not be out of parent time range.");
        }
    }

    @Override // xsna.oox
    public final Instant a() {
        return this.a;
    }

    @Override // xsna.oox
    public final Instant b() {
        return this.c;
    }

    @Override // xsna.oox
    public final ZoneOffset c() {
        return this.d;
    }

    @Override // xsna.oox
    public final ZoneOffset d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4q)) {
            return false;
        }
        n4q n4qVar = (n4q) obj;
        return this.f == n4qVar.f && epx.f(this.g, n4qVar.g) && epx.f(this.h, n4qVar.h) && epx.f(this.a, n4qVar.a) && epx.f(this.b, n4qVar.b) && epx.f(this.c, n4qVar.c) && epx.f(this.d, n4qVar.d) && epx.f(this.e, n4qVar.e) && epx.f(this.i, n4qVar.i) && epx.f(this.j, n4qVar.j) && epx.f(this.k, n4qVar.k);
    }

    public final int f() {
        return this.f;
    }

    public final String g() {
        return this.h;
    }

    @Override // xsna.zef0
    public final hi20 getMetadata() {
        return this.e;
    }

    public final String h() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f) * 31;
        String str = this.g;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.h;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        ZoneOffset zoneOffset = this.b;
        int c = w11.c(this.c, (hashCode3 + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.d;
        return this.k.hashCode() + ((this.e.hashCode() + ((c + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "ExerciseSessionRecord(startTime=" + this.a + ", startZoneOffset=" + this.b + ", endTime=" + this.c + ", endZoneOffset=" + this.d + ", exerciseType=" + this.f + ", title=" + this.g + ", notes=" + this.h + ", metadata=" + this.e + ", segments=" + this.i + ", laps=" + this.j + ", exerciseRouteResult=" + this.k + ')';
    }
}
