package xsna;

import android.view.View;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;

/* compiled from: ItemDecorationCommand.kt */
/* loaded from: classes4.dex */
public abstract class hux {

    /* compiled from: ItemDecorationCommand.kt */
    public static abstract class a extends hux {

        /* compiled from: ItemDecorationCommand.kt */
        /* renamed from: xsna.hux$a$a, reason: collision with other inner class name */
        public static final class C3023a extends a {
            public static final C3023a a = new C3023a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3023a);
            }

            public final int hashCode() {
                return -1265300370;
            }

            public final String toString() {
                return "Disable";
            }
        }

        /* compiled from: ItemDecorationCommand.kt */
        public static final class b extends a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -839388355;
            }

            public final String toString() {
                return "Enable";
            }
        }

        /* compiled from: ItemDecorationCommand.kt */
        public static final class c extends a {
            public final View a;

            public c(View view) {
                this.a = view;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                View view = this.a;
                if (view == null) {
                    return 0;
                }
                return view.hashCode();
            }

            public final String toString() {
                return br.b(new StringBuilder("SetOptionsHighlight(anchor="), this.a, ')');
            }
        }
    }

    /* compiled from: ItemDecorationCommand.kt */
    public static abstract class b extends hux {

        /* compiled from: ItemDecorationCommand.kt */
        public static final class a extends b {
            public final NewsEntry a;
            public final String b;

            public a(String str, NewsEntry newsEntry) {
                this.a = newsEntry;
                this.b = str;
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
                int hashCode = this.a.hashCode() * 31;
                String str = this.b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Like(entry=");
                sb.append(this.a);
                sb.append(", ref=");
                return ho8.a(sb, this.b, ')');
            }
        }
    }

    /* compiled from: ItemDecorationCommand.kt */
    public static abstract class c extends hux {

        /* compiled from: ItemDecorationCommand.kt */
        public static final class a extends c {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 2075661246;
            }

            public final String toString() {
                return "CommunityWall";
            }
        }

        /* compiled from: ItemDecorationCommand.kt */
        public static final class b extends c {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 446008294;
            }

            public final String toString() {
                return "DiscoverMedia";
            }
        }

        /* compiled from: ItemDecorationCommand.kt */
        /* renamed from: xsna.hux$c$c, reason: collision with other inner class name */
        public static final class C3024c extends c {
            public static final C3024c a = new C3024c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3024c);
            }

            public final int hashCode() {
                return -1972275501;
            }

            public final String toString() {
                return "Feed";
            }
        }

        /* compiled from: ItemDecorationCommand.kt */
        public static final class d extends c {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1971772673;
            }

            public final String toString() {
                return "Wall";
            }
        }
    }

    /* compiled from: ItemDecorationCommand.kt */
    public static abstract class d extends hux {

        /* compiled from: ItemDecorationCommand.kt */
        public static final class a extends d {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1442678462;
            }

            public final String toString() {
                return "ClearUiComponentsRenderer";
            }
        }

        /* compiled from: ItemDecorationCommand.kt */
        public static final class b extends d {
            public final List<qyp0> a;

            /* JADX WARN: Multi-variable type inference failed */
            public b(List<? extends qyp0> list) {
                this.a = list;
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
                return ms9.a(')', new StringBuilder("SetComponents(componentsData="), this.a);
            }
        }
    }

    /* compiled from: ItemDecorationCommand.kt */
    public static abstract class e extends hux {

        /* compiled from: ItemDecorationCommand.kt */
        public static final class a extends e {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 56280265;
            }

            public final String toString() {
                return "Clear";
            }
        }
    }

    /* compiled from: ItemDecorationCommand.kt */
    public static abstract class f extends hux {

        /* compiled from: ItemDecorationCommand.kt */
        public static final class a extends f {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1362046561;
            }

            public final String toString() {
                return "DiscoverMedia";
            }
        }

        /* compiled from: ItemDecorationCommand.kt */
        public static final class b extends f {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1527567110;
            }

            public final String toString() {
                return "Feed";
            }
        }

        /* compiled from: ItemDecorationCommand.kt */
        public static final class c extends f {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1527064282;
            }

            public final String toString() {
                return "Wall";
            }
        }
    }
}
