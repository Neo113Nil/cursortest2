package xsna;

import com.vk.core.serialize.Serializer;

/* compiled from: AdsPixel.kt */
/* loaded from: classes6.dex */
public abstract class i11 {

    /* compiled from: AdsPixel.kt */
    public static final class a extends i11 {
        public final Object a;

        public a(Serializer.StreamParcelableAdapter streamParcelableAdapter) {
            this.a = streamParcelableAdapter;
        }

        @Override // xsna.i11
        public final Object a() {
            return this.a;
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
            return k73.c(new StringBuilder("Error(original="), this.a, ')');
        }
    }

    /* compiled from: AdsPixel.kt */
    public static final class b extends i11 {
        public final Object a;

        public b(Serializer.StreamParcelableAdapter streamParcelableAdapter) {
            this.a = streamParcelableAdapter;
        }

        @Override // xsna.i11
        public final Object a() {
            return this.a;
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
            return k73.c(new StringBuilder("FullscreenOff(original="), this.a, ')');
        }
    }

    /* compiled from: AdsPixel.kt */
    public static final class c extends i11 {
        public final Object a;

        public c(Serializer.StreamParcelableAdapter streamParcelableAdapter) {
            this.a = streamParcelableAdapter;
        }

        @Override // xsna.i11
        public final Object a() {
            return this.a;
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
            return k73.c(new StringBuilder("FullscreenOn(original="), this.a, ')');
        }
    }

    /* compiled from: AdsPixel.kt */
    public static abstract class d extends i11 {

        /* compiled from: AdsPixel.kt */
        public static final class a extends d {
            public final int a;
            public final boolean b;
            public final Object c;

            public a(int i, boolean z, Serializer.StreamParcelableAdapter streamParcelableAdapter) {
                this.a = i;
                this.b = z;
                this.c = streamParcelableAdapter;
            }

            @Override // xsna.i11
            public final Object a() {
                return this.c;
            }

            @Override // xsna.i11.d
            public final int b() {
                return this.a;
            }

            @Override // xsna.i11.d
            public final boolean c() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + qoy.b(Integer.hashCode(this.a) * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ReachedUrl(time=");
                sb.append(this.a);
                sb.append(", isTimeInPercents=");
                sb.append(this.b);
                sb.append(", original=");
                return k73.c(sb, this.c, ')');
            }
        }

        /* compiled from: AdsPixel.kt */
        public static final class b extends d {
            public final int a;
            public final int b;
            public final Object c;
            public final Long d;

            public b(int i, int i2, Object obj, Long l) {
                this.a = i;
                this.b = i2;
                this.c = obj;
                this.d = l;
            }

            @Override // xsna.i11
            public final Object a() {
                return this.c;
            }

            @Override // xsna.i11.d
            public final int b() {
                return this.a;
            }

            @Override // xsna.i11.d
            public final boolean c() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && this.b == bVar.b && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
            }

            public final int hashCode() {
                int a = vul0.a(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
                Long l = this.d;
                return a + (l == null ? 0 : l.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ReachedViewabilityMrcUrl(time=");
                sb.append(this.a);
                sb.append(", viewabilityPercent=");
                sb.append(this.b);
                sb.append(", original=");
                sb.append(this.c);
                sb.append(", position=");
                return iq.b(sb, this.d, ')');
            }
        }

        /* compiled from: AdsPixel.kt */
        public static final class c extends d {
            public final int a;
            public final boolean b;
            public final int c;
            public final boolean d;
            public final Serializer.StreamParcelableAdapter e;

            public c(int i, boolean z, int i2, boolean z2, Serializer.StreamParcelableAdapter streamParcelableAdapter) {
                this.a = i;
                this.b = z;
                this.c = i2;
                this.d = z2;
                this.e = streamParcelableAdapter;
            }

            @Override // xsna.i11
            public final Object a() {
                return this.e;
            }

            @Override // xsna.i11.d
            public final int b() {
                return this.a;
            }

            @Override // xsna.i11.d
            public final boolean c() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && epx.f(this.e, cVar.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + qoy.b(shy.a(this.c, qoy.b(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d);
            }

            public final String toString() {
                return "ReachedViewabilityOvvUrl(time=" + this.a + ", isTimeInPercents=" + this.b + ", viewabilityPercent=" + this.c + ", ovv=" + this.d + ", original=" + this.e + ')';
            }
        }

        public abstract int b();

        public abstract boolean c();
    }

    /* compiled from: AdsPixel.kt */
    public static final class e extends i11 {
        public final Object a;

        public e(Serializer.StreamParcelableAdapter streamParcelableAdapter) {
            this.a = streamParcelableAdapter;
        }

        @Override // xsna.i11
        public final Object a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return k73.c(new StringBuilder("PlayheadPaused(original="), this.a, ')');
        }
    }

    /* compiled from: AdsPixel.kt */
    public static final class f extends i11 {
        public final Object a;

        public f(Serializer.StreamParcelableAdapter streamParcelableAdapter) {
            this.a = streamParcelableAdapter;
        }

        @Override // xsna.i11
        public final Object a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return k73.c(new StringBuilder("PlayheadResumed(original="), this.a, ')');
        }
    }

    /* compiled from: AdsPixel.kt */
    public static final class g extends i11 {
        public final Object a;

        public g(Serializer.StreamParcelableAdapter streamParcelableAdapter) {
            this.a = streamParcelableAdapter;
        }

        @Override // xsna.i11
        public final Object a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return k73.c(new StringBuilder("VolumeOff(original="), this.a, ')');
        }
    }

    /* compiled from: AdsPixel.kt */
    public static final class h extends i11 {
        public final Object a;

        public h(Serializer.StreamParcelableAdapter streamParcelableAdapter) {
            this.a = streamParcelableAdapter;
        }

        @Override // xsna.i11
        public final Object a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return k73.c(new StringBuilder("VolumeOn(original="), this.a, ')');
        }
    }

    public abstract Object a();
}
