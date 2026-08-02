package xsna;

import com.vk.im.engine.models.InfoBar;

/* compiled from: ListHeaderSupplier.kt */
/* loaded from: classes18.dex */
public interface bfz {

    /* compiled from: ListHeaderSupplier.kt */
    public static abstract class a {

        /* compiled from: ListHeaderSupplier.kt */
        /* renamed from: xsna.bfz$a$a, reason: collision with other inner class name */
        public static final class C2608a extends h {
            public final l7p b;

            public C2608a(l7p l7pVar) {
                super(2);
                this.b = l7pVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2608a) && epx.f(this.b, ((C2608a) obj).b);
            }

            public final int hashCode() {
                this.b.getClass();
                throw null;
            }

            public final String toString() {
                return "EduSwitchAccount(eduSwitchAccountInfo=" + this.b + ')';
            }
        }

        /* compiled from: ListHeaderSupplier.kt */
        public static final class b extends a {
            public static final b a = new b();
        }

        /* compiled from: ListHeaderSupplier.kt */
        public static final class c extends h {
            public final InfoBar b;

            public c(InfoBar infoBar) {
                super(3);
                this.b = infoBar;
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
                return "FriendsBirthday(infoBar=" + this.b + ')';
            }
        }

        /* compiled from: ListHeaderSupplier.kt */
        public static final class d extends h {
            public final InfoBar b;

            public d(InfoBar infoBar) {
                super(3);
                this.b = infoBar;
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
                return "HolidaysBanner(infoBar=" + this.b + ')';
            }
        }

        /* compiled from: ListHeaderSupplier.kt */
        public static final class e extends h {
            public final InfoBar b;

            public e(InfoBar infoBar) {
                super(3);
                this.b = infoBar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Info(infoBar=" + this.b + ')';
            }
        }

        /* compiled from: ListHeaderSupplier.kt */
        public static final class f extends h {
            public final InfoBar b;

            public f(InfoBar infoBar) {
                super(3);
                this.b = infoBar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "MaxAd(infoBar=" + this.b + ')';
            }
        }

        /* compiled from: ListHeaderSupplier.kt */
        public static final class g extends h {
            public final InfoBar b;

            public g(InfoBar infoBar) {
                super(1);
                this.b = infoBar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Middle(infoBar=" + this.b + ')';
            }
        }

        /* compiled from: ListHeaderSupplier.kt */
        public static abstract class h extends a {
            public final int a;

            public h(int i) {
                this.a = i;
            }
        }
    }

    io.reactivex.rxjava3.core.q<a> a();
}
