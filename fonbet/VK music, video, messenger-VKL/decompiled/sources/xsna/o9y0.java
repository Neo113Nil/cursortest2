package xsna;

import org.json.JSONObject;

/* compiled from: SensorData.kt */
/* loaded from: classes2.dex */
public abstract class o9y0 {

    /* compiled from: SensorData.kt */
    public static final class a extends o9y0 {
        public static final C3444a e = new C3444a();
        public final float a;
        public final float b;
        public final float c;
        public final String d = "accelerometer";

        /* compiled from: SensorData.kt */
        /* renamed from: xsna.o9y0$a$a, reason: collision with other inner class name */
        public static final class C3444a {
        }

        public a(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        @Override // xsna.o9y0
        public final String a() {
            return this.d;
        }

        @Override // xsna.o9y0
        public final JSONObject b() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("x", Float.valueOf(this.a));
            jSONObject.put("y", Float.valueOf(this.b));
            jSONObject.put("z", Float.valueOf(this.c));
            return jSONObject;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.c, aVar.c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.c) + io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("a(b=");
            sb.append(this.a);
            sb.append(", c=");
            sb.append(this.b);
            sb.append(", d=");
            return xq.c(')', this.c, sb);
        }
    }

    /* compiled from: SensorData.kt */
    public static final class b extends o9y0 {
        public static final a e = new a();
        public final float a;
        public final float b;
        public final float c;
        public final String d = "gyroscope";

        /* compiled from: SensorData.kt */
        public static final class a {
        }

        public b(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        @Override // xsna.o9y0
        public final String a() {
            return this.d;
        }

        @Override // xsna.o9y0
        public final JSONObject b() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("x", Float.valueOf(this.a));
            jSONObject.put("y", Float.valueOf(this.b));
            jSONObject.put("z", Float.valueOf(this.c));
            return jSONObject;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Float.compare(this.a, bVar.a) == 0 && Float.compare(this.b, bVar.b) == 0 && Float.compare(this.c, bVar.c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.c) + io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("b(b=");
            sb.append(this.a);
            sb.append(", c=");
            sb.append(this.b);
            sb.append(", d=");
            return xq.c(')', this.c, sb);
        }
    }

    /* compiled from: SensorData.kt */
    public static final class c extends o9y0 {
        public static final a e = new a();
        public final float a;
        public final float b;
        public final float c;
        public final String d = "motion";

        /* compiled from: SensorData.kt */
        public static final class a {
        }

        public c(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        @Override // xsna.o9y0
        public final String a() {
            return this.d;
        }

        @Override // xsna.o9y0
        public final JSONObject b() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("alpha", Float.valueOf(this.a));
            jSONObject.put("beta", Float.valueOf(this.b));
            jSONObject.put("gamma", Float.valueOf(this.c));
            return jSONObject;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Float.compare(this.a, cVar.a) == 0 && Float.compare(this.b, cVar.b) == 0 && Float.compare(this.c, cVar.c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.c) + io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("c(a=");
            sb.append(this.a);
            sb.append(", b=");
            sb.append(this.b);
            sb.append(", c=");
            return xq.c(')', this.c, sb);
        }
    }

    public abstract String a();

    public abstract JSONObject b();
}
