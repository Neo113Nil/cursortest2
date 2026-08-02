package xsna;

import com.vk.core.compose.generated.VkColorToken;
import xsna.tfp0;

/* compiled from: TrackMenuViewState.kt */
/* loaded from: classes3.dex */
public interface uc50 {

    /* compiled from: TrackMenuViewState.kt */
    public static final class a implements uc50 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1258458474;
        }

        public final String toString() {
            return "DownloadTrack";
        }
    }

    /* compiled from: TrackMenuViewState.kt */
    public static final class c implements uc50 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -2023589544;
        }

        public final String toString() {
            return "Separator";
        }
    }

    /* compiled from: TrackMenuViewState.kt */
    public static final class d implements uc50 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -374733762;
        }

        public final String toString() {
            return "TrackMix";
        }
    }

    /* compiled from: TrackMenuViewState.kt */
    public static final class b implements uc50 {
        public final tfp0.b a;
        public final int b;
        public final int c;
        public final Integer d;
        public final VkColorToken e;

        public b(tfp0.b bVar, int i, int i2, Integer num, VkColorToken vkColorToken) {
            this.a = bVar;
            this.b = i;
            this.c = i2;
            this.d = num;
            this.e = vkColorToken;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && epx.f(this.d, bVar.d) && this.e == bVar.e;
        }

        public final int hashCode() {
            int a = shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31);
            Integer num = this.d;
            return this.e.hashCode() + ((a + (num == null ? 0 : num.hashCode())) * 31);
        }

        public final String toString() {
            return "Regular(action=" + this.a + ", iconRes=" + this.b + ", titleRes=" + this.c + ", contentDescriptionRes=" + this.d + ", iconTintToken=" + this.e + ')';
        }

        public /* synthetic */ b(tfp0.b bVar, int i, int i2, Integer num) {
            this(bVar, i, i2, num, VkColorToken.IconAccentThemed);
        }
    }
}
