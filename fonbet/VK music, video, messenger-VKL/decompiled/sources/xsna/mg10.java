package xsna;

/* compiled from: MaskCatalogEvent.kt */
/* loaded from: classes18.dex */
public abstract class mg10 {

    /* compiled from: MaskCatalogEvent.kt */
    public static final class a extends mg10 {
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
            return ho8.a(new StringBuilder("ApplyMaskEvent(maskId="), this.a, ')');
        }
    }

    /* compiled from: MaskCatalogEvent.kt */
    public static final class b extends mg10 {
        public final String a;
        public final boolean b;

        public b(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MaskFavoriteUpdateEvent(maskId=");
            sb.append(this.a);
            sb.append(", isFavorite=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }
}
