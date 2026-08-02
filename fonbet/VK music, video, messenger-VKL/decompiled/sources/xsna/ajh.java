package xsna;

import android.graphics.Rect;

/* compiled from: CommunityProfileContentInfoItemSideEffect.kt */
/* loaded from: classes5.dex */
public interface ajh {

    /* compiled from: CommunityProfileContentInfoItemSideEffect.kt */
    public static final class a implements ajh {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1331088946;
        }

        public final String toString() {
            return "ConfigurationChanged";
        }
    }

    /* compiled from: CommunityProfileContentInfoItemSideEffect.kt */
    public static final class b implements ajh {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ContainerScrolled(dy="), this.a, ')');
        }
    }

    /* compiled from: CommunityProfileContentInfoItemSideEffect.kt */
    public static final class c implements ajh {
        public final Rect a;

        public c(Rect rect) {
            this.a = rect;
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
            return yq.c(new StringBuilder("InsetsChanged(newInsets="), this.a, ')');
        }
    }
}
