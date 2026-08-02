package xsna;

/* compiled from: ArchiveInfoSource.kt */
/* loaded from: classes18.dex */
public interface ei3 {

    /* compiled from: ArchiveInfoSource.kt */
    public static final class a {
        public final boolean a;
        public final int b;
        public final boolean c;

        public a(int i, boolean z, boolean z2) {
            this.a = z;
            this.b = i;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + shy.a(this.b, Boolean.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ArchiveInfo(isAvailable=");
            sb.append(this.a);
            sb.append(", unreadCount=");
            sb.append(this.b);
            sb.append(", hasMentions=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    io.reactivex.rxjava3.core.q<a> a();
}
