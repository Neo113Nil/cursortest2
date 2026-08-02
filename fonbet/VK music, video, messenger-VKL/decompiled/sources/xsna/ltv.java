package xsna;

import com.vk.dto.stories.model.web.StoryBoxPrepared;
import com.vk.story.viewer.api.models.PreloadSource;
import java.util.ArrayList;

/* compiled from: IdeasStoryPatch.kt */
/* loaded from: classes6.dex */
public interface ltv extends xl50 {

    /* compiled from: IdeasStoryPatch.kt */
    public static final class a implements ltv {
        public final ArrayList b;

        public a(ArrayList arrayList) {
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b.equals(((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("ContentInitialized(pages="), this.b);
        }
    }

    /* compiled from: IdeasStoryPatch.kt */
    public static final class b implements ltv {
        public final int b;

        public b(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("MarkError(index="), this.b, ')');
        }
    }

    /* compiled from: IdeasStoryPatch.kt */
    public static final class c implements ltv {
        public final int b;

        public c(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("MarkLoading(index="), this.b, ')');
        }
    }

    /* compiled from: IdeasStoryPatch.kt */
    public static final class d implements ltv {
        public final int b;

        public d(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("MarkRendered(index="), this.b, ')');
        }
    }

    /* compiled from: IdeasStoryPatch.kt */
    public static final class e implements ltv {
        public final int b;
        public final StoryBoxPrepared c;

        public e(int i, StoryBoxPrepared storyBoxPrepared) {
            this.b = i;
            this.c = storyBoxPrepared;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.b == eVar.b && epx.f(this.c, eVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            return "MarkSuccess(index=" + this.b + ", prepared=" + this.c + ')';
        }
    }

    /* compiled from: IdeasStoryPatch.kt */
    public static final class f implements ltv {
        public final int b;

        public f(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.b == ((f) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("RemoveIdeaAtIndex(index="), this.b, ')');
        }
    }

    /* compiled from: IdeasStoryPatch.kt */
    public static final class g implements ltv {
        public final int b;

        public g(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.b == ((g) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ResetPageToIdle(index="), this.b, ')');
        }
    }

    /* compiled from: IdeasStoryPatch.kt */
    public static final class h implements ltv {
        public final boolean b;

        public h(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.b == ((h) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetBackGradientVisible(visible="), this.b, ')');
        }
    }

    /* compiled from: IdeasStoryPatch.kt */
    public static final class i implements ltv {
        public final boolean b;

        public i(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.b == ((i) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetBottomControlsVisible(visible="), this.b, ')');
        }
    }

    /* compiled from: IdeasStoryPatch.kt */
    public static final class j implements ltv {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            ((j) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(true);
        }

        public final String toString() {
            return "SetClosing(closing=true)";
        }
    }

    /* compiled from: IdeasStoryPatch.kt */
    public static final class k implements ltv {
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public k(boolean z, boolean z2, boolean z3) {
            this.b = z;
            this.c = z2;
            this.d = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.b == kVar.b && this.c == kVar.c && this.d == kVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetControls(visible=");
            sb.append(this.b);
            sb.append(", withDelay=");
            sb.append(this.c);
            sb.append(", excludeAnimation=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: IdeasStoryPatch.kt */
    public static final class l implements ltv {
        public final float b;

        public l(float f) {
            this.b = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && Float.compare(this.b, ((l) obj).b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b);
        }

        public final String toString() {
            return xq.c(')', this.b, new StringBuilder("SetDragScale(scale="));
        }
    }

    /* compiled from: IdeasStoryPatch.kt */
    public static final class m implements ltv {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            ((m) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "SetExternalLoaderVisible(visible=false)";
        }
    }

    /* compiled from: IdeasStoryPatch.kt */
    public static final class n implements ltv {
        public final boolean b;

        public n(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.b == ((n) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetPlaying(isPlaying="), this.b, ')');
        }
    }

    /* compiled from: IdeasStoryPatch.kt */
    public static final class o implements ltv {
        public final PreloadSource b;

        public o(PreloadSource preloadSource) {
            this.b = preloadSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.b == ((o) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SetPreloadSource(source=" + this.b + ')';
        }
    }

    /* compiled from: IdeasStoryPatch.kt */
    public static final class p implements ltv {
        public final boolean b;

        public p(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.b == ((p) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetSelectedInPager(selected="), this.b, ')');
        }
    }

    /* compiled from: IdeasStoryPatch.kt */
    public static final class q implements ltv {
        public final int b;

        public q(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && this.b == ((q) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("SwitchPage(newIndex="), this.b, ')');
        }
    }
}
