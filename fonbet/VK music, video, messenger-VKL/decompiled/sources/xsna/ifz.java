package xsna;

/* compiled from: ListItem.kt */
/* loaded from: classes7.dex */
public abstract class ifz {

    /* compiled from: ListItem.kt */
    public static final class a extends ifz {
        public final CharSequence a;

        public a(CharSequence charSequence) {
            this.a = charSequence;
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
            return thl0.a(new StringBuilder("Label(label="), this.a, ')');
        }
    }

    /* compiled from: ListItem.kt */
    public static final class b extends ifz {
        public static final b a = new b();
    }

    /* compiled from: ListItem.kt */
    public static final class c extends ifz {
        public final String a;
        public final sew0 b;
        public final CharSequence c;

        public c(String str, sew0 sew0Var, String str2) {
            this.a = str;
            this.b = sew0Var;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Spectator(id=");
            sb.append(this.a);
            sb.append(", avatar=");
            sb.append(this.b);
            sb.append(", name=");
            return thl0.a(sb, this.c, ')');
        }
    }

    /* compiled from: ListItem.kt */
    public static final class d extends ifz {
        public final int a;

        public d(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("SpectatorsCount(count="), this.a, ')');
        }
    }

    /* compiled from: ListItem.kt */
    public static final class e extends ifz {
        public final CharSequence a;
        public final CharSequence b;

        public e(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StatsCommon(key=");
            sb.append((Object) this.a);
            sb.append(", value=");
            return thl0.a(sb, this.b, ')');
        }
    }

    /* compiled from: ListItem.kt */
    public static final class f extends ifz {
        public final boolean a;
        public final long b;
        public final long c;

        public f(boolean z, long j, long j2) {
            this.a = z;
            this.b = j;
            this.c = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && this.b == fVar.b && this.c == fVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + bh10.a(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StatsElapsedTime(isOngoing=");
            sb.append(this.a);
            sb.append(", startTimeMs=");
            sb.append(this.b);
            sb.append(", durationMs=");
            return vu5.a(')', this.c, sb);
        }
    }
}
