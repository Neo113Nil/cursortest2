package xsna;

import com.vk.ads.easypromote.impl.domain.model.DurationOption;

/* compiled from: EasyPromotePatch.kt */
/* loaded from: classes14.dex */
public interface zvo extends xl50 {

    /* compiled from: EasyPromotePatch.kt */
    public static final class a implements zvo {
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
            return xq.c(')', this.b, new StringBuilder("BudgetChangedPatch(budgetRatio="));
        }
    }

    /* compiled from: EasyPromotePatch.kt */
    public static final class b implements zvo {
        public final DurationOption b;

        public b(DurationOption durationOption) {
            this.b = durationOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "DurationSelectionChangedPatch(durationOption=" + this.b + ')';
        }
    }

    /* compiled from: EasyPromotePatch.kt */
    public static final class c implements zvo {
        public final float b;
        public final awf c;
        public final int d;
        public final DurationOption e;
        public final String f;
        public final ymk g;

        public c(float f, awf awfVar, int i, DurationOption durationOption, String str, ymk ymkVar) {
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
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Float.compare(this.b, cVar.b) == 0 && this.c.equals(cVar.c) && this.d == cVar.d && this.e == cVar.e && epx.f(this.f, cVar.f) && this.g.equals(cVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + urd0.a((this.e.hashCode() + shy.a(this.d, (this.c.hashCode() + (Float.hashCode(this.b) * 31)) * 31, 31)) * 31, 31, this.f);
        }

        public final String toString() {
            return "InitialPatch(budgetRatio=" + this.b + ", budgetRange=" + this.c + ", budgetSteps=" + this.d + ", selectedDuration=" + this.e + ", formattedDueDate=" + this.f + ", customDateState=" + this.g + ')';
        }
    }

    /* compiled from: EasyPromotePatch.kt */
    public static final class d implements zvo {
    }
}
