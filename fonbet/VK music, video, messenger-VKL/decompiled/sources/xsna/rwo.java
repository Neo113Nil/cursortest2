package xsna;

import com.vk.ads.easypromote.impl.domain.model.FaqSource;

/* compiled from: EasyPromoteState.kt */
/* loaded from: classes14.dex */
public interface rwo extends km50 {

    /* compiled from: EasyPromoteState.kt */
    public static final class a implements rwo {
        public final ul8 b;
        public final ioo c;
        public final boolean d;
        public final ymk e;
        public final boolean f;
        public final FaqSource g;

        public /* synthetic */ a(ul8 ul8Var, ioo iooVar, ymk ymkVar) {
            this(ul8Var, iooVar, true, ymkVar, false, null);
        }

        public static a a(a aVar, ul8 ul8Var, ioo iooVar, boolean z, int i) {
            if ((i & 1) != 0) {
                ul8Var = aVar.b;
            }
            ul8 ul8Var2 = ul8Var;
            if ((i & 2) != 0) {
                iooVar = aVar.c;
            }
            ioo iooVar2 = iooVar;
            if ((i & 4) != 0) {
                z = aVar.d;
            }
            boolean z2 = z;
            ymk ymkVar = aVar.e;
            boolean z3 = (i & 16) != 0 ? aVar.f : true;
            FaqSource faqSource = (i & 32) != 0 ? aVar.g : null;
            aVar.getClass();
            return new a(ul8Var2, iooVar2, z2, ymkVar, z3, faqSource);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && epx.f(this.e, aVar.e) && this.f == aVar.f && this.g == aVar.g;
        }

        public final int hashCode() {
            int b = qoy.b((this.e.hashCode() + qoy.b((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d)) * 31, 31, this.f);
            FaqSource faqSource = this.g;
            return b + (faqSource == null ? 0 : faqSource.hashCode());
        }

        public final String toString() {
            return "Main(budgetState=" + this.b + ", durationState=" + this.c + ", buttonEnabled=" + this.d + ", customDateState=" + this.e + ", showFaq=" + this.f + ", faqSource=" + this.g + ')';
        }

        public a(ul8 ul8Var, ioo iooVar, boolean z, ymk ymkVar, boolean z2, FaqSource faqSource) {
            this.b = ul8Var;
            this.c = iooVar;
            this.d = z;
            this.e = ymkVar;
            this.f = z2;
            this.g = faqSource;
        }
    }
}
