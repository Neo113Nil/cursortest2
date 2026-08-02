package xsna;

import com.vk.ads.easypromote.impl.domain.model.DurationOption;
import com.vk.ads.easypromote.impl.domain.model.FaqSource;

/* compiled from: EasyPromoteAction.kt */
/* loaded from: classes14.dex */
public interface uvo extends kj50 {

    /* compiled from: EasyPromoteAction.kt */
    public static final class a implements uvo {
        public final DurationOption b;
        public final int c;
        public final Long d;

        public a(DurationOption durationOption, int i, Long l) {
            this.b = durationOption;
            this.c = i;
            this.d = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int a = shy.a(this.c, this.b.hashCode() * 31, 31);
            Long l = this.d;
            return a + (l == null ? 0 : l.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AcceptSettings(durationOption=");
            sb.append(this.b);
            sb.append(", budgetRub=");
            sb.append(this.c);
            sb.append(", customDate=");
            return iq.b(sb, this.d, ')');
        }
    }

    /* compiled from: EasyPromoteAction.kt */
    public static final class b implements uvo {
        public final float b;

        public b(float f) {
            this.b = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.b, ((b) obj).b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b);
        }

        public final String toString() {
            return xq.c(')', this.b, new StringBuilder("ChangeBudget(budgetRatio="));
        }
    }

    /* compiled from: EasyPromoteAction.kt */
    public static final class c implements uvo {
        public final DurationOption b;

        public c(DurationOption durationOption) {
            this.b = durationOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ChangeDurationSelection(durationOption=" + this.b + ')';
        }
    }

    /* compiled from: EasyPromoteAction.kt */
    public static final class d implements uvo {
        public final float b;
        public final awf c;
        public final int d;
        public final DurationOption e;
        public final String f;
        public final ymk g;

        public d(float f, awf awfVar, int i, DurationOption durationOption, String str, ymk ymkVar) {
            this.b = f;
            this.c = awfVar;
            this.d = i;
            this.e = durationOption;
            this.f = str;
            this.g = ymkVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Float.compare(this.b, dVar.b) == 0 && this.c.equals(dVar.c) && this.d == dVar.d && this.e == dVar.e && epx.f(this.f, dVar.f) && this.g.equals(dVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + urd0.a((this.e.hashCode() + shy.a(this.d, (this.c.hashCode() + (Float.hashCode(this.b) * 31)) * 31, 31)) * 31, 31, this.f);
        }

        public final String toString() {
            return "Init(budgetRatio=" + this.b + ", budgetRange=" + this.c + ", budgetSteps=" + this.d + ", selectedDuration=" + this.e + ", formattedDueDate=" + this.f + ", customDateState=" + this.g + ')';
        }
    }

    /* compiled from: EasyPromoteAction.kt */
    public static final class e implements uvo {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -155302783;
        }

        public final String toString() {
            return "NavigateUp";
        }
    }

    /* compiled from: EasyPromoteAction.kt */
    public static final class f implements uvo {
        public final FaqSource b;

        public f(FaqSource faqSource) {
            this.b = faqSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.b == ((f) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OpenFaq(faqSource=" + this.b + ')';
        }
    }
}
