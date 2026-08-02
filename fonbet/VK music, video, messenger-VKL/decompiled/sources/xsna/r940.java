package xsna;

/* compiled from: MusicAnalyticsDataSourceMeta.kt */
/* loaded from: classes3.dex */
public final class r940 {
    public final a a;

    /* compiled from: MusicAnalyticsDataSourceMeta.kt */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SizeMeta(sizeInKb=");
            sb.append(this.a);
            sb.append(", eventsAmount=");
            return vu5.b(sb, this.b, ')');
        }
    }

    public r940(a aVar) {
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r940) && epx.f(this.a, ((r940) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MusicAnalyticsDataSourceMeta(sizeMeta=" + this.a + ')';
    }
}
