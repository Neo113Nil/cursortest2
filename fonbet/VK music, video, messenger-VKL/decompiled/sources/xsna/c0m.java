package xsna;

import com.ironsource.X3;
import org.json.JSONObject;

/* compiled from: DeprecatedAnalyticsStatsTrackEvents.kt */
@ozl
/* loaded from: classes15.dex */
public final class c0m extends rsg0<a> {

    /* compiled from: DeprecatedAnalyticsStatsTrackEvents.kt */
    public static final class a {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Result(ok="), this.a, ')');
        }
    }

    public c0m(String str) {
        super("stats.trackEvents");
        K("events", X3.j.d + str + ']');
        this.c = true;
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return new a(jSONObject.getInt("response") != 0);
    }
}
