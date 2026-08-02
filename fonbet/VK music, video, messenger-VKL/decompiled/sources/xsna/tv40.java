package xsna;

import xsna.ydl0;

/* compiled from: MusicPlayerAdvertisingState.kt */
/* loaded from: classes3.dex */
public abstract class tv40 implements km50 {
    public boolean b = true;
    public boolean c = true;

    /* compiled from: MusicPlayerAdvertisingState.kt */
    public static final class a extends tv40 {
        public final ydl0 d;
        public final ydl0.b.AbstractC4094b.a e;

        public a(ydl0 ydl0Var, ydl0.b.AbstractC4094b.a aVar) {
            this.d = ydl0Var;
            this.e = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            return this.e.a.hashCode() + (this.d.hashCode() * 31);
        }

        public final String toString() {
            return "Content(stickyBannerAd=" + this.d + ", stickyBannerData=" + this.e + ')';
        }
    }

    /* compiled from: MusicPlayerAdvertisingState.kt */
    public static final class b extends tv40 {
        public static final b d = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1852384957;
        }

        public final String toString() {
            return "Empty";
        }
    }
}
