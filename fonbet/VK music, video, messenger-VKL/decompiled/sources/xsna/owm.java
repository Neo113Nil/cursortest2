package xsna;

import java.util.List;

/* compiled from: DialogsToolbarViewAction.kt */
/* loaded from: classes18.dex */
public abstract class owm implements kj50 {

    /* compiled from: DialogsToolbarViewAction.kt */
    public static final class a extends owm {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1882574627;
        }

        public final String toString() {
            return "ArchiveClickAction";
        }
    }

    /* compiled from: DialogsToolbarViewAction.kt */
    public static final class b extends owm {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1691456815;
        }

        public final String toString() {
            return "AvatarIconClick";
        }
    }

    /* compiled from: DialogsToolbarViewAction.kt */
    public static final class c extends owm {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1173512339;
        }

        public final String toString() {
            return "AvatarIconLongClick";
        }
    }

    /* compiled from: DialogsToolbarViewAction.kt */
    public static final class d extends owm {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1233371750;
        }

        public final String toString() {
            return "BackClick";
        }
    }

    /* compiled from: DialogsToolbarViewAction.kt */
    public static final class e extends owm {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -977909027;
        }

        public final String toString() {
            return "BusinessNotificationsClickAction";
        }
    }

    /* compiled from: DialogsToolbarViewAction.kt */
    public static final class f extends owm {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1157024279;
        }

        public final String toString() {
            return "LeftIconClickAction";
        }
    }

    /* compiled from: DialogsToolbarViewAction.kt */
    public static final class g extends owm {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -881068473;
        }

        public final String toString() {
            return "NewCallClickAction";
        }
    }

    /* compiled from: DialogsToolbarViewAction.kt */
    public static final class h extends owm {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 432319776;
        }

        public final String toString() {
            return "OpenSchedulerMiniApp";
        }
    }

    /* compiled from: DialogsToolbarViewAction.kt */
    public static final class i extends owm {
        public static final i b = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 395984591;
        }

        public final String toString() {
            return "SearchClickAction";
        }
    }

    /* compiled from: DialogsToolbarViewAction.kt */
    public static final class j extends owm {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1437944318;
        }

        public final String toString() {
            return "TagsClickAction";
        }
    }

    /* compiled from: DialogsToolbarViewAction.kt */
    public static final class k extends owm {
        public static final k b = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -1010632759;
        }

        public final String toString() {
            return "TagsMenuHidden";
        }
    }

    /* compiled from: DialogsToolbarViewAction.kt */
    public static final class l extends owm {
        public final List<? extends Integer> b;

        public l() {
            throw null;
        }

        public l(List list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && epx.f(this.b, ((l) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "TagsSelectedAction(filter=" + ((Object) x1o0.t(this.b)) + ')';
        }
    }
}
