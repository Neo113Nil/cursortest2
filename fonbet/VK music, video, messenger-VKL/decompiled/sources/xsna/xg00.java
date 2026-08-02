package xsna;

import java.util.List;

/* compiled from: ManageCommunitiesNotificationsPatch.kt */
/* loaded from: classes5.dex */
public interface xg00 extends xl50 {

    /* compiled from: ManageCommunitiesNotificationsPatch.kt */
    public static final class a implements xg00 {
        public final List<pg00> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends pg00> list) {
            this.b = list;
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
            return ms9.a(')', new StringBuilder("ContentLoaded(items="), this.b);
        }
    }

    /* compiled from: ManageCommunitiesNotificationsPatch.kt */
    public static final class b implements xg00 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 695278927;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: ManageCommunitiesNotificationsPatch.kt */
    public static final class c implements xg00 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -36211005;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: ManageCommunitiesNotificationsPatch.kt */
    public static final class d implements xg00 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1455162304;
        }

        public final String toString() {
            return "Refreshing";
        }
    }
}
