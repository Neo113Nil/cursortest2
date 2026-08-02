package xsna;

/* compiled from: DialogsSearchViewAction.kt */
/* loaded from: classes18.dex */
public abstract class qvm implements kj50 {

    /* compiled from: DialogsSearchViewAction.kt */
    public static final class a extends qvm {
        public final long b;
        public final boolean c;

        public a(long j, boolean z) {
            this.b = j;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Long.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClickJoinButton(id=");
            sb.append(this.b);
            sb.append(", isRecommendation=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: DialogsSearchViewAction.kt */
    public static final class b extends qvm {
        public final long b;
        public final boolean c;

        public b(long j, boolean z) {
            this.b = j;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Long.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClickLeaveButton(id=");
            sb.append(this.b);
            sb.append(", isRecommendation=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }
}
