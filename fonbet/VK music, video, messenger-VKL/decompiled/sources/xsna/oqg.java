package xsna;

/* compiled from: CommunityAddDescriptionSideEffect.kt */
/* loaded from: classes5.dex */
public interface oqg {

    /* compiled from: CommunityAddDescriptionSideEffect.kt */
    public static final class a implements oqg {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("SubmitChanges(description="), this.a, ')');
        }
    }
}
