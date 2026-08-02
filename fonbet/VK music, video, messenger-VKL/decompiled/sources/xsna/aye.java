package xsna;

import com.vk.clips.viewer.impl.grid.toolbar.profile.swap.models.CounterType;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.shortvideo.ClipsAuthor;

/* compiled from: ClipsProfileToolbarExternalEvent.kt */
/* loaded from: classes17.dex */
public interface aye {

    /* compiled from: ClipsProfileToolbarExternalEvent.kt */
    public static final class a implements aye {
        public final ClipGridParams.Data.Profile a;

        public a(ClipGridParams.Data.Profile profile) {
            this.a = profile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.b.hashCode();
        }

        public final String toString() {
            return "ActiveProfileChanged(user=" + this.a + ')';
        }
    }

    /* compiled from: ClipsProfileToolbarExternalEvent.kt */
    public static final class b implements aye {
        public static final b a = new b();
    }

    /* compiled from: ClipsProfileToolbarExternalEvent.kt */
    public static final class c implements aye {
        public final yxe a;

        public c(yxe yxeVar) {
            this.a = yxeVar;
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
            return "ButtonClicked(button=" + this.a + ')';
        }
    }

    /* compiled from: ClipsProfileToolbarExternalEvent.kt */
    public static final class d implements aye {
        public final ClipsAuthor a;
        public final CounterType b;

        public d(ClipsAuthor clipsAuthor, CounterType counterType) {
            this.a = clipsAuthor;
            this.b = counterType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CounterClicked(user=" + this.a + ", type=" + this.b + ')';
        }
    }

    /* compiled from: ClipsProfileToolbarExternalEvent.kt */
    public static final class e implements aye {
        public final String a;

        public e(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("DescriptionLinkClicked(clickWord="), this.a, ')');
        }
    }

    /* compiled from: ClipsProfileToolbarExternalEvent.kt */
    public static final class f implements aye {
        public final ClipsAuthor a;
        public final String b;
        public final boolean c;

        public f(ClipsAuthor clipsAuthor, String str, boolean z) {
            this.a = clipsAuthor;
            this.b = str;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b) && this.c == fVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenFullDescriptionClicked(user=");
            sb.append(this.a);
            sb.append(", currentDescription=");
            sb.append(this.b);
            sb.append(", isEditable=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsProfileToolbarExternalEvent.kt */
    public static final class g implements aye {
        public final ClipsAuthor a;

        public g(ClipsAuthor clipsAuthor) {
            this.a = clipsAuthor;
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
            return "OpenProfileRequested(user=" + this.a + ')';
        }
    }

    /* compiled from: ClipsProfileToolbarExternalEvent.kt */
    public static final class h implements aye {
        public final ClipsAuthor a;

        public h(ClipsAuthor clipsAuthor) {
            this.a = clipsAuthor;
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
            return "ShareClicked(user=" + this.a + ')';
        }
    }
}
