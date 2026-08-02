package xsna;

/* compiled from: ListHashtagAdapterItem.kt */
/* loaded from: classes16.dex */
public interface zez {

    /* compiled from: ListHashtagAdapterItem.kt */
    public static final class a implements zez {
        public final String a;
        public final boolean b;

        public a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HashtagItem(hashtag=");
            sb.append(this.a);
            sb.append(", isTrend=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: ListHashtagAdapterItem.kt */
    public static final class b implements zez {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -2086597075;
        }

        public final String toString() {
            return "SeparatorItem";
        }
    }
}
