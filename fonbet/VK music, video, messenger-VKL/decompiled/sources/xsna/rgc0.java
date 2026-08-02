package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: PostingItemPresenterFactory.kt */
/* loaded from: classes3.dex */
public interface rgc0 {

    /* compiled from: PostingItemPresenterFactory.kt */
    public static final class a {
        public final sjg a;
        public final String b;
        public final fhc0 c;
        public final UserId d;

        public a(sjg sjgVar, String str, fhc0 fhc0Var, UserId userId) {
            this.a = sjgVar;
            this.b = str;
            this.c = fhc0Var;
            this.d = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            return Long.hashCode(this.d.b) + ((this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(feedView=");
            sb.append(this.a);
            sb.append(", navScreen=");
            sb.append(this.b);
            sb.append(", metricsCollector=");
            sb.append(this.c);
            sb.append(", ownerId=");
            return gp.b(sb, this.d, ')');
        }
    }

    sgc0 a(gzs gzsVar, a aVar, izs izsVar, wqf wqfVar, trf trfVar, wzs wzsVar);

    tgc0 b(qq40 qq40Var, a aVar, ape0 ape0Var, ktq0 ktq0Var);
}
