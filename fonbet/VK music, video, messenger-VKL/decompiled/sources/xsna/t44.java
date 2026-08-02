package xsna;

/* compiled from: AttachedClipsAction.kt */
/* loaded from: classes7.dex */
public interface t44 extends lj50 {

    /* compiled from: AttachedClipsAction.kt */
    public static final class a implements t44 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1192854119;
        }

        public final String toString() {
            return "BackPress";
        }
    }

    /* compiled from: AttachedClipsAction.kt */
    public static final class b implements t44 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -470482770;
        }

        public final String toString() {
            return "ButtonAttachClick";
        }
    }

    /* compiled from: AttachedClipsAction.kt */
    public interface c extends t44 {

        /* compiled from: AttachedClipsAction.kt */
        public static final class a implements c {
            public final String b;

            public a(String str) {
                this.b = str;
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
                return ho8.a(new StringBuilder("Click(videoId="), this.b, ')');
            }
        }

        /* compiled from: AttachedClipsAction.kt */
        public static final class b implements c, uj50 {
            public final String b;
            public final boolean c;

            public b(String str, boolean z) {
                this.b = str;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && this.c == bVar.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SelectIconClick(videoId=");
                sb.append(this.b);
                sb.append(", newSelectedValue=");
                return defpackage.q0.a(sb, this.c, ')');
            }
        }

        /* compiled from: AttachedClipsAction.kt */
        /* renamed from: xsna.t44$c$c, reason: collision with other inner class name */
        public static final class C3716c implements c {
            public final String b;

            public C3716c(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3716c) && epx.f(this.b, ((C3716c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("VideoViewerActivityResult(videoId="), this.b, ')');
            }
        }
    }

    /* compiled from: AttachedClipsAction.kt */
    public interface d extends t44 {

        /* compiled from: AttachedClipsAction.kt */
        public static final class a implements d {
            public final String b;

            public a(String str) {
                this.b = str;
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
                return ho8.a(new StringBuilder("ButtonAttachClick(videoId="), this.b, ')');
            }
        }

        /* compiled from: AttachedClipsAction.kt */
        public static final class b implements d {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -604968737;
            }

            public final String toString() {
                return "ButtonCancelClick";
            }
        }

        /* compiled from: AttachedClipsAction.kt */
        public static final class c implements d {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 2137420429;
            }

            public final String toString() {
                return "Dismiss";
            }
        }
    }

    /* compiled from: AttachedClipsAction.kt */
    public interface e extends t44 {

        /* compiled from: AttachedClipsAction.kt */
        public static final class a implements e {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 459239979;
            }

            public final String toString() {
                return "ButtonCancelClick";
            }
        }

        /* compiled from: AttachedClipsAction.kt */
        public static final class b implements e {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 702933721;
            }

            public final String toString() {
                return "Dismiss";
            }
        }
    }

    /* compiled from: AttachedClipsAction.kt */
    public static final class f implements t44 {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -92389013;
        }

        public final String toString() {
            return "ClipsPaginationTriggerScroll";
        }
    }

    /* compiled from: AttachedClipsAction.kt */
    public interface g extends t44 {

        /* compiled from: AttachedClipsAction.kt */
        public static final class a implements g {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -364071179;
            }

            public final String toString() {
                return "ButtonCancelClick";
            }
        }

        /* compiled from: AttachedClipsAction.kt */
        public static final class b implements g {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1559725935;
            }

            public final String toString() {
                return "ButtonExitClick";
            }
        }

        /* compiled from: AttachedClipsAction.kt */
        public static final class c implements g {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 36881443;
            }

            public final String toString() {
                return "Dismiss";
            }
        }
    }

    /* compiled from: AttachedClipsAction.kt */
    public static final class h implements t44 {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 577405084;
        }

        public final String toString() {
            return "ScreenResume";
        }
    }

    /* compiled from: AttachedClipsAction.kt */
    public interface i extends t44 {

        /* compiled from: AttachedClipsAction.kt */
        public static final class a implements i {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 972846467;
            }

            public final String toString() {
                return "Dismissed";
            }
        }

        /* compiled from: AttachedClipsAction.kt */
        public static final class b implements i {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1869316987;
            }

            public final String toString() {
                return "MiddleButtonClick";
            }
        }
    }

    /* compiled from: AttachedClipsAction.kt */
    public static final class j implements t44 {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 2073885449;
        }

        public final String toString() {
            return "ToolbarBackClick";
        }
    }
}
