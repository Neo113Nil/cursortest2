package xsna;

import java.util.List;
import org.json.JSONObject;

/* compiled from: LongPollResponseParser.kt */
/* loaded from: classes2.dex */
public interface r400 {

    /* compiled from: LongPollResponseParser.kt */
    public static final class a {
        public final a400 a;
        public final List<e900> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(a400 a400Var, List<? extends e900> list) {
            this.a = a400Var;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LongPollResponse(longPollCredentials=");
            sb.append(this.a);
            sb.append(", events=");
            return ms9.a(')', sb, this.b);
        }
    }

    a a(JSONObject jSONObject);
}
