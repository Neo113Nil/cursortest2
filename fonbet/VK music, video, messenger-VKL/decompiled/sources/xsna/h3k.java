package xsna;

import org.json.JSONObject;

/* compiled from: CoverUploadEvents.kt */
/* loaded from: classes7.dex */
public abstract class h3k {
    public static final ysg0<h3k> a = new ysg0<>();

    /* compiled from: CoverUploadEvents.kt */
    public static final class a extends h3k {
        public final float b;

        public a(float f) {
            this.b = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.b, ((a) obj).b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b);
        }

        public final String toString() {
            return xq.c(')', this.b, new StringBuilder("ProgressUploadEvent(progress="));
        }
    }

    /* compiled from: CoverUploadEvents.kt */
    public static abstract class b extends h3k {

        /* compiled from: CoverUploadEvents.kt */
        public static final class a extends b {
            public static final a b = new a();
        }

        /* compiled from: CoverUploadEvents.kt */
        /* renamed from: xsna.h3k$b$b, reason: collision with other inner class name */
        public static final class C2970b extends b {
            public final JSONObject b;

            public C2970b(JSONObject jSONObject) {
                this.b = jSONObject;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2970b) && epx.f(this.b, ((C2970b) obj).b);
            }

            public final int hashCode() {
                JSONObject jSONObject = this.b;
                if (jSONObject == null) {
                    return 0;
                }
                return jSONObject.hashCode();
            }

            public final String toString() {
                return "CompleteUploadEvent(response=" + this.b + ')';
            }
        }

        /* compiled from: CoverUploadEvents.kt */
        public static final class c extends b {
            public static final c b = new c();
        }
    }
}
