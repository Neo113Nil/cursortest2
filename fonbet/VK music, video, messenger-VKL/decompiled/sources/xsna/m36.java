package xsna;

/* compiled from: ClipsPublishBannerConfig.kt */
/* loaded from: classes17.dex */
public interface m36 {

    /* compiled from: ClipsPublishBannerConfig.kt */
    @vby
    public static final class a implements m36 {
        public final int a;

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.a == ((a) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return uqi.a("Custom(id=", this.a, ')');
        }
    }
}
