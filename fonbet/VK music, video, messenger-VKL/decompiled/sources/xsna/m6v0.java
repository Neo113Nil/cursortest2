package xsna;

/* compiled from: VkNetworkAssetResource.kt */
/* loaded from: classes15.dex */
public interface m6v0 {

    /* compiled from: VkNetworkAssetResource.kt */
    public static final class a implements m6v0 {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
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
            StringBuilder sb = new StringBuilder("Image(id=");
            sb.append(this.a);
            sb.append(", url=");
            return ho8.a(sb, this.b, ')');
        }
    }
}
