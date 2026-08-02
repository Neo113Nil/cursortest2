package xsna;

/* compiled from: ContextMenuScreenContent.kt */
/* loaded from: classes18.dex */
public abstract class r0z {
    public final String a;
    public final int b;

    /* compiled from: ContextMenuScreenContent.kt */
    public static final class a extends r0z {
        public static final a c = new a("Action", 1);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1333252640;
        }

        public final String toString() {
            return "Action";
        }
    }

    /* compiled from: ContextMenuScreenContent.kt */
    public static final class b extends r0z {
        public static final b c = new b("Avatar", 1);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1316261629;
        }

        public final String toString() {
            return "Avatar";
        }
    }

    /* compiled from: ContextMenuScreenContent.kt */
    public static final class c extends r0z {
        public static final c c = new c("Action", 1);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1464393171;
        }

        public final String toString() {
            return "CheckedAction";
        }
    }

    /* compiled from: ContextMenuScreenContent.kt */
    public static final class d extends r0z {
        public static final d c = new d("", 0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 159996079;
        }

        public final String toString() {
            return "Divider";
        }
    }

    /* compiled from: ContextMenuScreenContent.kt */
    public static final class e extends r0z {
        public static final e c = new e("Title", 1);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1131572681;
        }

        public final String toString() {
            return "Header";
        }
    }

    /* compiled from: ContextMenuScreenContent.kt */
    public static final class f extends r0z {
        public static final f c = new f("Picture", 1);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -2092064108;
        }

        public final String toString() {
            return "Picture";
        }
    }

    /* compiled from: ContextMenuScreenContent.kt */
    public static final class g extends r0z {
        public static final g c = new g("Action", 1);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1518248673;
        }

        public final String toString() {
            return "RightIconAction";
        }
    }

    public r0z(String str, int i) {
        this.a = str;
        this.b = i;
    }
}
