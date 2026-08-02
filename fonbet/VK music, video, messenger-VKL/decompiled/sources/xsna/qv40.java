package xsna;

import xsna.ydl0;

/* compiled from: MusicPlayerAdvertisingMviPatch.kt */
/* loaded from: classes3.dex */
public interface qv40 extends xl50 {

    /* compiled from: MusicPlayerAdvertisingMviPatch.kt */
    public static final class a implements qv40 {
        public final ydl0 b;
        public final ydl0.b.AbstractC4094b.a c;

        public a(ydl0 ydl0Var, ydl0.b.AbstractC4094b.a aVar) {
            this.b = ydl0Var;
            this.c = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b.equals(aVar.b) && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.a.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "BannerLoaded(stickyBannerAd=" + this.b + ", stickyBannerData=" + this.c + ')';
        }
    }

    /* compiled from: MusicPlayerAdvertisingMviPatch.kt */
    public static final class b implements qv40 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1109855275;
        }

        public final String toString() {
            return "CloseBanner";
        }
    }

    /* compiled from: MusicPlayerAdvertisingMviPatch.kt */
    public static final class c implements qv40 {
        public final boolean b;

        public c(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ConfigurationChanged(isVertical="), this.b, ')');
        }
    }

    /* compiled from: MusicPlayerAdvertisingMviPatch.kt */
    public static final class d implements qv40 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1985465667;
        }

        public final String toString() {
            return "NoAd";
        }
    }

    /* compiled from: MusicPlayerAdvertisingMviPatch.kt */
    public static final class e implements qv40 {
        public final boolean b;

        public e(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.b == ((e) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("OnParentStateChanged(parentIsVisible="), this.b, ')');
        }
    }
}
