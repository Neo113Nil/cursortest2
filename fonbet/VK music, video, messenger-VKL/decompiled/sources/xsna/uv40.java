package xsna;

import xsna.ydl0;

/* compiled from: MusicPlayerAdvertisingViewState.kt */
/* loaded from: classes3.dex */
public final class uv40 implements ao50 {
    public final fi50 a;

    /* compiled from: MusicPlayerAdvertisingViewState.kt */
    public interface a {

        /* compiled from: MusicPlayerAdvertisingViewState.kt */
        /* renamed from: xsna.uv40$a$a, reason: collision with other inner class name */
        public static final class C3835a implements a {
            public final ydl0 a;
            public final ydl0.b b;
            public final boolean c;

            public C3835a(ydl0 ydl0Var, ydl0.b bVar, boolean z) {
                this.a = ydl0Var;
                this.b = bVar;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3835a)) {
                    return false;
                }
                C3835a c3835a = (C3835a) obj;
                return epx.f(this.a, c3835a.a) && epx.f(this.b, c3835a.b) && this.c == c3835a.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Banner(stickyBannerAd=");
                sb.append(this.a);
                sb.append(", stickyBannerData=");
                sb.append(this.b);
                sb.append(", isVisible=");
                return defpackage.q0.a(sb, this.c, ')');
            }
        }

        /* compiled from: MusicPlayerAdvertisingViewState.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -900626757;
            }

            public final String toString() {
                return "Empty";
            }
        }
    }

    /* compiled from: MusicPlayerAdvertisingViewState.kt */
    public static final class b implements fm50<tv40> {
        public final yzt0<a> a;

        public b(h0u0 h0u0Var) {
            this.a = h0u0Var;
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
            return tr.c(new StringBuilder("Content(adData="), this.a, ')');
        }
    }

    public uv40(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
