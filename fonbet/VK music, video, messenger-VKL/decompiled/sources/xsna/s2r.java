package xsna;

import org.json.JSONObject;

/* compiled from: FeedPreloading.kt */
/* loaded from: classes18.dex */
public final class s2r implements bxx {
    public final c b;
    public final b c;

    /* compiled from: FeedPreloading.kt */
    public static final class a {
        public static s2r a() {
            return new s2r(new c(false, false), new b(false));
        }

        public static s2r b(JSONObject jSONObject) {
            JSONObject optJSONObject;
            JSONObject optJSONObject2;
            JSONObject optJSONObject3;
            JSONObject optJSONObject4 = jSONObject.optJSONObject("breaking_news");
            boolean z = false;
            c cVar = new c((optJSONObject4 == null || (optJSONObject3 = optJSONObject4.optJSONObject("on_app_start")) == null) ? false : optJSONObject3.optBoolean("enabled", false), (optJSONObject4 == null || (optJSONObject2 = optJSONObject4.optJSONObject("on_neighbour_tab")) == null) ? false : optJSONObject2.optBoolean("enabled", false));
            JSONObject optJSONObject5 = jSONObject.optJSONObject("media_discover");
            if (optJSONObject5 != null && (optJSONObject = optJSONObject5.optJSONObject("on_app_start")) != null) {
                z = optJSONObject.optBoolean("enabled", false);
            }
            return new s2r(cVar, new b(z));
        }
    }

    /* compiled from: FeedPreloading.kt */
    public static final class b implements bxx {
        public final boolean b;

        public b(boolean z) {
            this.b = z;
        }

        public final boolean a() {
            return this.b;
        }

        @Override // xsna.bxx
        public final JSONObject e5() {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("enabled", this.b);
            s3q0 s3q0Var = s3q0.a;
            jSONObject.put("on_app_start", jSONObject2);
            return jSONObject;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Discover(onAppStart="), this.b, ')');
        }
    }

    /* compiled from: FeedPreloading.kt */
    public static final class c implements bxx {
        public final boolean b;
        public final boolean c;

        public c(boolean z, boolean z2) {
            this.b = z;
            this.c = z2;
        }

        public final boolean a() {
            return this.b;
        }

        @Override // xsna.bxx
        public final JSONObject e5() {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("enabled", this.b);
            s3q0 s3q0Var = s3q0.a;
            jSONObject.put("on_app_start", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("enabled", this.c);
            jSONObject.put("on_neighbour_tab", jSONObject3);
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
            return this.b == cVar.b && this.c == cVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("News(onAppStart=");
            sb.append(this.b);
            sb.append(", onNeighborTab=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    public s2r(c cVar, b bVar) {
        this.b = cVar;
        this.c = bVar;
    }

    public final b a() {
        return this.c;
    }

    public final c b() {
        return this.b;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("breaking_news", this.b.e5());
        jSONObject.put("media_discover", this.c.e5());
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2r)) {
            return false;
        }
        s2r s2rVar = (s2r) obj;
        return epx.f(this.b, s2rVar.b) && epx.f(this.c, s2rVar.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c.b) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "FeedPreloading(news=" + this.b + ", discover=" + this.c + ')';
    }
}
