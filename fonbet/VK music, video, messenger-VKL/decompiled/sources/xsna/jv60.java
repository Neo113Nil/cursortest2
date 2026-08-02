package xsna;

import com.vk.dto.newsfeed.SituationalSuggest;
import com.vk.newsfeed.api.data.NewsfeedList;

/* compiled from: NewsfeedPatch.kt */
/* loaded from: classes4.dex */
public interface jv60 extends yl50 {

    /* compiled from: NewsfeedPatch.kt */
    public interface a extends jv60 {

        /* compiled from: NewsfeedPatch.kt */
        /* renamed from: xsna.jv60$a$a, reason: collision with other inner class name */
        public static final class C3147a implements a {
            public final boolean a;

            public C3147a(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3147a) && this.a == ((C3147a) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("AppendFreshNewsChanged(append="), this.a, ')');
            }
        }

        /* compiled from: NewsfeedPatch.kt */
        public interface b extends a {

            /* compiled from: NewsfeedPatch.kt */
            /* renamed from: xsna.jv60$a$b$a, reason: collision with other inner class name */
            public static final class C3148a implements b {
                public static final C3148a a = new C3148a();
            }

            /* compiled from: NewsfeedPatch.kt */
            /* renamed from: xsna.jv60$a$b$b, reason: collision with other inner class name */
            public static final class C3149b implements b {
                public static final C3149b a = new C3149b();
            }
        }

        /* compiled from: NewsfeedPatch.kt */
        public static final class c implements a {
            public final int a;

            public c(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a == ((c) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("RemoveItem(listId="), this.a, ')');
            }
        }

        /* compiled from: NewsfeedPatch.kt */
        public static final class d implements a {
            public final int a;
            public final lu60 b;

            public d(int i, lu60 lu60Var) {
                this.a = i;
                this.b = lu60Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.a == dVar.a && epx.f(this.b, dVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                return "SavePage(listId=" + this.a + ", page=" + this.b + ')';
            }
        }

        /* compiled from: NewsfeedPatch.kt */
        public static final class e implements a {
            public final whs a;

            public e(whs whsVar) {
                this.a = whsVar;
            }
        }
    }

    /* compiled from: NewsfeedPatch.kt */
    public interface b extends jv60 {

        /* compiled from: NewsfeedPatch.kt */
        public static final class a implements b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -905880922;
            }

            public final String toString() {
                return "Clear";
            }
        }
    }

    /* compiled from: NewsfeedPatch.kt */
    public interface c extends jv60 {

        /* compiled from: NewsfeedPatch.kt */
        public static final class a implements c {
            public final NewsfeedList a;

            public a(NewsfeedList newsfeedList) {
                this.a = newsfeedList;
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
                return "ListChanged(list=" + this.a + ')';
            }
        }

        /* compiled from: NewsfeedPatch.kt */
        public static final class b implements c {
            public final String a;

            public b(String str) {
                this.a = str;
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
                return ho8.a(new StringBuilder("ListRefChanged(listRef="), this.a, ')');
            }
        }
    }

    /* compiled from: NewsfeedPatch.kt */
    public interface d extends jv60 {

        /* compiled from: NewsfeedPatch.kt */
        public static final class a implements d {
            public final SituationalSuggest a;

            public a(SituationalSuggest situationalSuggest) {
                this.a = situationalSuggest;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                SituationalSuggest situationalSuggest = this.a;
                if (situationalSuggest == null) {
                    return 0;
                }
                return situationalSuggest.hashCode();
            }

            public final String toString() {
                return "LoadedFromCache(situationalSuggest=" + this.a + ')';
            }
        }

        /* compiled from: NewsfeedPatch.kt */
        public static final class b implements d {
            public final SituationalSuggest a;

            public b(SituationalSuggest situationalSuggest) {
                this.a = situationalSuggest;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                SituationalSuggest situationalSuggest = this.a;
                if (situationalSuggest == null) {
                    return 0;
                }
                return situationalSuggest.hashCode();
            }

            public final String toString() {
                return "LoadedFromNetwork(situationalSuggest=" + this.a + ')';
            }
        }

        /* compiled from: NewsfeedPatch.kt */
        public static final class c implements d {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -685114863;
            }

            public final String toString() {
                return "Remove";
            }
        }
    }

    /* compiled from: NewsfeedPatch.kt */
    public interface e extends jv60 {

        /* compiled from: NewsfeedPatch.kt */
        public static final class a implements e {
            public final k070 a;

            public a(k070 k070Var) {
                this.a = k070Var;
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
                return "Loaded(stories=" + this.a + ')';
            }
        }
    }
}
