package xsna;

/* compiled from: ClipUploadSideEffectEvent.kt */
/* loaded from: classes17.dex */
public interface led {

    /* compiled from: ClipUploadSideEffectEvent.kt */
    public static final class a implements led {
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
            return ho8.a(new StringBuilder("RemovedAfter(draftId="), this.a, ')');
        }
    }

    /* compiled from: ClipUploadSideEffectEvent.kt */
    public static final class b implements led {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("RemovedInitial(draftId="), this.a, ')');
        }
    }

    /* compiled from: ClipUploadSideEffectEvent.kt */
    public static final class c implements led {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Returned(draftId="), this.a, ')');
        }
    }
}
