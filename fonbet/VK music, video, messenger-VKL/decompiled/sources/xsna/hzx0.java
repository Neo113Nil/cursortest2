package xsna;

import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Field;
import com.google.android.gms.fitness.data.Value;
import com.vk.superapp.api.dto.vkworkout.WorkoutData;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: WorkoutDataParserGoogleFit.kt */
/* loaded from: classes11.dex */
public final class hzx0 {

    /* compiled from: WorkoutDataParserGoogleFit.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public final String a;
        public final WorkoutData.WorkoutType b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final boolean h;

        public a(String str, WorkoutData.WorkoutType workoutType, String str2, String str3, String str4, String str5, String str6, boolean z) {
            this.a = str;
            this.b = workoutType;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = z;
        }

        public final String a() {
            return this.f;
        }

        public final String b() {
            return this.d;
        }

        public final String c() {
            return this.a;
        }

        public final String d() {
            return this.g;
        }

        public final String e() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && this.h == aVar.h;
        }

        public final String f() {
            return this.e;
        }

        public final WorkoutData.WorkoutType g() {
            return this.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.h) + urd0.a(urd0.a(urd0.a(urd0.a(urd0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("WorkoutMetadata(id=");
            sb.append(this.a);
            sb.append(", type=");
            sb.append(this.b);
            sb.append(", subType=");
            sb.append(this.c);
            sb.append(", description=");
            sb.append(this.d);
            sb.append(", title=");
            sb.append(this.e);
            sb.append(", dataSource=");
            sb.append(this.f);
            sb.append(", source=");
            sb.append(this.g);
            sb.append(", isUserInput=");
            return defpackage.q0.a(sb, this.h, ')');
        }
    }

    public static boolean a(String str, WorkoutData.WorkoutType workoutType) {
        if (!drm0.D(str, workoutType.name(), true)) {
            List<String> h = workoutType.h();
            if ((h instanceof Collection) && h.isEmpty()) {
                return false;
            }
            Iterator<T> it = h.iterator();
            while (it.hasNext()) {
                if (epx.f((String) it.next(), str)) {
                }
            }
            return false;
        }
        return true;
    }

    public static Value b(Bucket bucket, DataType dataType, Field field) {
        Object obj;
        List<DataPoint> i;
        DataPoint dataPoint;
        Iterator<T> it = bucket.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((DataSet) obj).j(), dataType)) {
                break;
            }
        }
        DataSet dataSet = (DataSet) obj;
        if (dataSet == null || (i = dataSet.i()) == null || (dataPoint = (DataPoint) j5g.a0(i)) == null) {
            return null;
        }
        return dataPoint.j(field);
    }
}
