package xsna;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedOpenAction;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.decoration.ClipsDecorationKey;
import com.vk.clips.sdk.shared.decoration.ClipsFeedDecorationPayload;
import com.vk.clips.viewer.impl.utils.performance.ClipsScreenPerformanceReporter;
import java.util.List;

/* compiled from: ClipsWrapperStatePatch.kt */
/* loaded from: classes17.dex */
public interface ttf extends xl50 {

    /* compiled from: ClipsWrapperStatePatch.kt */
    public static final class a implements ttf {
        public final a7j<ClipFeedOpenAction> b;

        public a(a7j<ClipFeedOpenAction> a7jVar) {
            this.b = a7jVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Action(openAction=" + this.b + ')';
        }
    }

    /* compiled from: ClipsWrapperStatePatch.kt */
    public interface b extends ttf {
    }

    /* compiled from: ClipsWrapperStatePatch.kt */
    public interface c extends ttf {

        /* compiled from: ClipsWrapperStatePatch.kt */
        public static final class a implements c {
            public final tqf b;

            public a(tqf tqfVar) {
                this.b = tqfVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Focused(focusedItem=" + this.b + ')';
            }
        }
    }

    /* compiled from: ClipsWrapperStatePatch.kt */
    public static final class d implements ttf {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return Float.compare(1.0f, 1.0f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(1.0f);
        }

        public final String toString() {
            return "HeaderAlpha(alpha=1.0)";
        }
    }

    /* compiled from: ClipsWrapperStatePatch.kt */
    public static final class e implements ttf {
        public final int b;

        public e(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.b == ((e) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("HeaderScroll(currentPos="), this.b, ')');
        }
    }

    /* compiled from: ClipsWrapperStatePatch.kt */
    public static final class f implements ttf {
        public final List<ClipFeedTab> b;
        public final int c;
        public final kwc d;
        public final a7j<ClipFeedOpenAction> e;
        public final ClipsScreenPerformanceReporter f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final boolean j;
        public final boolean k;
        public final ClipsDecorationKey l;
        public final ClipsFeedDecorationPayload m;
        public final boolean n;

        public f() {
            throw null;
        }

        public f(List list, int i, kwc kwcVar, a7j a7jVar, ClipsScreenPerformanceReporter clipsScreenPerformanceReporter, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ClipsDecorationKey clipsDecorationKey, ClipsFeedDecorationPayload clipsFeedDecorationPayload, boolean z6) {
            this.b = list;
            this.c = i;
            this.d = kwcVar;
            this.e = a7jVar;
            this.f = clipsScreenPerformanceReporter;
            this.g = z;
            this.h = z2;
            this.i = z3;
            this.j = z4;
            this.k = z5;
            this.l = clipsDecorationKey;
            this.m = clipsFeedDecorationPayload;
            this.n = z6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.b, fVar.b) && this.c == fVar.c && epx.f(this.d, fVar.d) && epx.f(this.e, fVar.e) && epx.f(this.f, fVar.f) && this.g == fVar.g && this.h == fVar.h && this.i == fVar.i && this.j == fVar.j && this.k == fVar.k && epx.f(this.l, fVar.l) && epx.f(this.m, fVar.m) && this.n == fVar.n;
        }

        public final int hashCode() {
            int a = shy.a(this.c, this.b.hashCode() * 31, 31);
            kwc kwcVar = this.d;
            int hashCode = (a + (kwcVar == null ? 0 : kwcVar.hashCode())) * 961;
            a7j<ClipFeedOpenAction> a7jVar = this.e;
            int hashCode2 = (hashCode + (a7jVar == null ? 0 : a7jVar.hashCode())) * 31;
            ClipsScreenPerformanceReporter clipsScreenPerformanceReporter = this.f;
            int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((hashCode2 + (clipsScreenPerformanceReporter == null ? 0 : clipsScreenPerformanceReporter.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
            ClipsDecorationKey clipsDecorationKey = this.l;
            return Boolean.hashCode(this.n) + ((this.m.hashCode() + ((b + (clipsDecorationKey != null ? clipsDecorationKey.hashCode() : 0)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Init(tabs=");
            sb.append(this.b);
            sb.append(", activeTabIndex=");
            sb.append(this.c);
            sb.append(", initialData=");
            sb.append(this.d);
            sb.append(", commentIdForReply=null, openAction=");
            sb.append(this.e);
            sb.append(", performanceReporter=");
            sb.append(this.f);
            sb.append(", isMoreButtonAvailable=");
            sb.append(this.g);
            sb.append(", selfProfileButtonAvailable=");
            sb.append(this.h);
            sb.append(", hasBackButtonInNavigationMenu=");
            sb.append(this.i);
            sb.append(", canGoBack=");
            sb.append(this.j);
            sb.append(", isNoBottomNavigation=");
            sb.append(this.k);
            sb.append(", decorationKey=");
            sb.append(this.l);
            sb.append(", decorationPayload=");
            sb.append(this.m);
            sb.append(", isSkeleton=");
            return defpackage.q0.a(sb, this.n, ')');
        }
    }

    /* compiled from: ClipsWrapperStatePatch.kt */
    public static final class g implements ttf {
        public static final g b = new g();
    }

    /* compiled from: ClipsWrapperStatePatch.kt */
    public interface h extends ttf {

        /* compiled from: ClipsWrapperStatePatch.kt */
        public static final class a implements h {
            public final psf b;

            public a(psf psfVar) {
                this.b = psfVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Show(onboarding=" + this.b + ')';
            }
        }
    }

    /* compiled from: ClipsWrapperStatePatch.kt */
    public interface i extends ttf {

        /* compiled from: ClipsWrapperStatePatch.kt */
        public static final class a implements i {
            public final int b;

            public a(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b == ((a) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("ActiveTabIndex(index="), this.b, ')');
            }
        }

        /* compiled from: ClipsWrapperStatePatch.kt */
        public static final class b implements i {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 830894381;
            }

            public final String toString() {
                return "HideSkeleton";
            }
        }

        /* compiled from: ClipsWrapperStatePatch.kt */
        public static final class c implements i {
            public final List<ClipFeedTab> b;

            /* JADX WARN: Multi-variable type inference failed */
            public c(List<? extends ClipFeedTab> list) {
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("Reorder(tabs="), this.b);
            }
        }

        /* compiled from: ClipsWrapperStatePatch.kt */
        public static final class d implements i {
            public final List<ClipFeedTab> b;

            /* JADX WARN: Multi-variable type inference failed */
            public d(List<? extends ClipFeedTab> list) {
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("Show(tabs="), this.b);
            }
        }
    }

    /* compiled from: ClipsWrapperStatePatch.kt */
    public interface j extends ttf {

        /* compiled from: ClipsWrapperStatePatch.kt */
        public static final class a implements j {
            public final CharSequence b;

            public a(CharSequence charSequence) {
                this.b = charSequence;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                CharSequence charSequence = this.b;
                if (charSequence == null) {
                    return 0;
                }
                return charSequence.hashCode();
            }

            public final String toString() {
                return thl0.a(new StringBuilder("SubTitle(value="), this.b, ')');
            }
        }

        /* compiled from: ClipsWrapperStatePatch.kt */
        public static final class b implements j {
            public final tlo0 b;

            public b(tlo0 tlo0Var) {
                this.b = tlo0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return bt.a(new StringBuilder("Title(value="), this.b, ')');
            }
        }
    }

    /* compiled from: ClipsWrapperStatePatch.kt */
    public interface k extends ttf {

        /* compiled from: ClipsWrapperStatePatch.kt */
        public static final class a implements k {
            public static final a b = new a();
        }

        /* compiled from: ClipsWrapperStatePatch.kt */
        public static final class b implements k {
            public final iuf b;

            public b(iuf iufVar) {
                this.b = iufVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Show(tooltip=" + this.b + ')';
            }
        }
    }

    /* compiled from: ClipsWrapperStatePatch.kt */
    public static final class l implements ttf {
        public final boolean b;

        public l(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.b == ((l) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("UiVisibility(isVisibile="), this.b, ')');
        }
    }
}
