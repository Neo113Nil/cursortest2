package xsna;

/* compiled from: SendStoryUsersListItem.kt */
/* loaded from: classes16.dex */
public abstract class uii0 implements hfz {

    /* compiled from: SendStoryUsersListItem.kt */
    public static final class a extends uii0 {
        public static final a b = new a();
    }

    /* compiled from: SendStoryUsersListItem.kt */
    public static final class b extends uii0 {
        public final s8m b;

        public b(s8m s8mVar) {
            this.b = s8mVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        @Override // xsna.uii0, xsna.hfz
        public final Number getItemId() {
            return Long.valueOf(this.b.a.b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "DialogItem(dialog=" + this.b + ')';
        }
    }

    /* compiled from: SendStoryUsersListItem.kt */
    public static final class c extends uii0 {
        public static final c b = new c();
    }

    /* compiled from: SendStoryUsersListItem.kt */
    public static final class d extends uii0 {
        public final String b;
        public final boolean c;

        public d(String str, boolean z) {
            this.b = str;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && this.c == dVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchItem(query=");
            sb.append(this.b);
            sb.append(", needClearInput=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    @Override // xsna.hfz
    public Number getItemId() {
        return 0;
    }
}
