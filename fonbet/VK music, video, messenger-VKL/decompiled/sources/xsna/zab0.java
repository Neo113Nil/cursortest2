package xsna;

import com.vk.core.compose.generated.VkColorToken;
import xsna.vab0;

/* compiled from: PlaylistMenuViewState.kt */
/* loaded from: classes3.dex */
public interface zab0 {

    /* compiled from: PlaylistMenuViewState.kt */
    public static final class a implements zab0 {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Mix(titleRes="), this.a, ')');
        }
    }

    /* compiled from: PlaylistMenuViewState.kt */
    public static final class b implements zab0 {
        public final vab0.b a;
        public final int b;
        public final int c;
        public final VkColorToken d;

        public b(vab0.b bVar, int i, int i2, VkColorToken vkColorToken) {
            this.a = bVar;
            this.b = i;
            this.c = i2;
            this.d = vkColorToken;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            return "Regular(action=" + this.a + ", iconRes=" + this.b + ", titleRes=" + this.c + ", iconTintToken=" + this.d + ')';
        }

        public /* synthetic */ b(vab0.b bVar, int i, int i2) {
            this(bVar, i, i2, VkColorToken.IconAccentThemed);
        }
    }
}
