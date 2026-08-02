package xsna;

import xsna.tlo0;

/* compiled from: ClipsCoauthorsSelectorItemDetails.kt */
/* loaded from: classes16.dex */
public interface cnd {

    /* compiled from: ClipsCoauthorsSelectorItemDetails.kt */
    public static final class a implements cnd {
        public final tlo0.h a;

        public a(tlo0.h hVar) {
            this.a = hVar;
        }

        @Override // xsna.cnd
        public final tlo0 a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        public final String toString() {
            return jq.c(new StringBuilder("Enabled(details="), this.a, ')');
        }
    }

    /* compiled from: ClipsCoauthorsSelectorItemDetails.kt */
    public static final class b implements cnd {
        public final tlo0.f a;

        public b(tlo0.f fVar) {
            this.a = fVar;
        }

        @Override // xsna.cnd
        public final tlo0 a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return Integer.hashCode(this.a.a);
        }

        public final String toString() {
            return pr.b(new StringBuilder("Restricted(details="), this.a, ')');
        }
    }

    tlo0 a();
}
