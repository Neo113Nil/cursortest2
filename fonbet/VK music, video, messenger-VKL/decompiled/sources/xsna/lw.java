package xsna;

import com.vk.clips.design.view.component.button.ClipActionButton;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFileModeration;

/* compiled from: ActionButtonViewState.kt */
/* loaded from: classes17.dex */
public interface lw {

    /* compiled from: ActionButtonViewState.kt */
    public static final class a {
        public static final a c;
        public final cut0 a;
        public final cut0 b;

        static {
            hw.a.getClass();
            iw.a.getClass();
            c = new a(iw.b, iw.c);
        }

        public a(cut0 cut0Var, cut0 cut0Var2) {
            this.a = cut0Var;
            this.b = cut0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ColorState(backgroundColor=" + this.a + ", textColor=" + this.b + ')';
        }
    }

    /* compiled from: ActionButtonViewState.kt */
    public static final class b implements lw {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 86538708;
        }

        public final String toString() {
            return "Hidden";
        }
    }

    /* compiled from: ActionButtonViewState.kt */
    public interface c {

        /* compiled from: ActionButtonViewState.kt */
        public static final class a implements c {
            public final tlo0 a;

            public a(tlo0 tlo0Var) {
                this.a = tlo0Var;
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
                return bt.a(new StringBuilder("Text(textSource="), this.a, ')');
            }
        }

        /* compiled from: ActionButtonViewState.kt */
        public static final class b implements c {
            public final String a;
            public final uu b;

            public b(String str, uu uuVar) {
                this.a = str;
                this.b = uuVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "TextWithIcon(text=" + this.a + ", icon=" + this.b + ')';
            }
        }

        /* compiled from: ActionButtonViewState.kt */
        /* renamed from: xsna.lw$c$c, reason: collision with other inner class name */
        public static final class C3304c implements c {
            public final SdkActionLink a;
            public final boolean b;
            public final SdkVideoFileModeration c;

            public C3304c(SdkActionLink sdkActionLink, boolean z, SdkVideoFileModeration sdkVideoFileModeration) {
                this.a = sdkActionLink;
                this.b = z;
                this.c = sdkVideoFileModeration;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3304c)) {
                    return false;
                }
                C3304c c3304c = (C3304c) obj;
                return epx.f(this.a, c3304c.a) && this.b == c3304c.b && this.c == c3304c.c;
            }

            public final int hashCode() {
                SdkActionLink sdkActionLink = this.a;
                return this.c.hashCode() + qoy.b((sdkActionLink == null ? 0 : sdkActionLink.hashCode()) * 31, 31, this.b);
            }

            public final String toString() {
                return "UserLink(actionLink=" + this.a + ", isUserCanEditClipsUserLink=" + this.b + ", moderationStatus=" + this.c + ')';
            }
        }
    }

    /* compiled from: ActionButtonViewState.kt */
    public static final class d implements lw {
        public final c a;
        public final a b;
        public final ClipActionButton.Size c;

        public d(c cVar, a aVar, ClipActionButton.Size size) {
            this.a = cVar;
            this.b = aVar;
            this.c = size;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && this.c == dVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Visible(titleState=" + this.a + ", colorState=" + this.b + ", size=" + this.c + ')';
        }
    }
}
