package xsna;

import com.vk.im.engine.models.SearchMode;
import java.util.List;

/* compiled from: DialogsToolbarNavigationEvent.kt */
/* loaded from: classes18.dex */
public abstract class kwm implements vl50 {

    /* compiled from: DialogsToolbarNavigationEvent.kt */
    public static final class a extends kwm {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1745317048;
        }

        public final String toString() {
            return "ArchiveNavigationEvent";
        }
    }

    /* compiled from: DialogsToolbarNavigationEvent.kt */
    public static final class b extends kwm {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -958848846;
        }

        public final String toString() {
            return "BusinessNotificationsNavigationEvent";
        }
    }

    /* compiled from: DialogsToolbarNavigationEvent.kt */
    public static final class c extends kwm {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1364743043;
        }

        public final String toString() {
            return "GoBackNavigationEvent";
        }
    }

    /* compiled from: DialogsToolbarNavigationEvent.kt */
    public static final class d extends kwm {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1078897358;
        }

        public final String toString() {
            return "LeftIconNavigationEvent";
        }
    }

    /* compiled from: DialogsToolbarNavigationEvent.kt */
    public static final class e extends kwm {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -673357348;
        }

        public final String toString() {
            return "NewCallNavigationEvent";
        }
    }

    /* compiled from: DialogsToolbarNavigationEvent.kt */
    public static final class f extends kwm {
        public final sr5 a;

        public f(sr5 sr5Var) {
            this.a = sr5Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            sr5 sr5Var = this.a;
            if (sr5Var == null) {
                return 0;
            }
            return sr5Var.hashCode();
        }

        public final String toString() {
            return "OpenProfileNavigationEvent(avatarInfo=" + this.a + ')';
        }
    }

    /* compiled from: DialogsToolbarNavigationEvent.kt */
    public static final class g extends kwm {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 553633069;
        }

        public final String toString() {
            return "OpenSchedulerMiniAppEvent";
        }
    }

    /* compiled from: DialogsToolbarNavigationEvent.kt */
    public static final class h extends kwm {
        public final SearchMode a;

        public h(SearchMode searchMode) {
            this.a = searchMode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.a == ((h) obj).a;
        }

        public final int hashCode() {
            SearchMode searchMode = this.a;
            if (searchMode == null) {
                return 0;
            }
            return searchMode.hashCode();
        }

        public final String toString() {
            return "SearchNavigationEvent(searchMode=" + this.a + ')';
        }
    }

    /* compiled from: DialogsToolbarNavigationEvent.kt */
    public static final class i extends kwm {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 228138305;
        }

        public final String toString() {
            return "SwitchAccountNavigationEvent";
        }
    }

    /* compiled from: DialogsToolbarNavigationEvent.kt */
    public static final class j extends kwm {
        public final List<? extends Integer> a;

        public j() {
            throw null;
        }

        public j(List list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.a, ((j) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "TagsFilteredEvent(filter=" + ((Object) x1o0.t(this.a)) + ')';
        }
    }
}
