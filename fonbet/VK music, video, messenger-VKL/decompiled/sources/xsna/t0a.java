package xsna;

import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;

/* compiled from: CatalogAnalyticsEvent.kt */
/* loaded from: classes16.dex */
public interface t0a {

    /* compiled from: CatalogAnalyticsEvent.kt */
    public static final class a implements t0a {
        public final String a;
        public final String b;
        public final c c;
        public final d d;

        /* compiled from: CatalogAnalyticsEvent.kt */
        /* renamed from: xsna.t0a$a$a, reason: collision with other inner class name */
        public static final class C3709a implements c {
            public final String a;

            public C3709a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3709a) && epx.f(this.a, ((C3709a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("ClickSourcePayload(clickSource="), this.a, ')');
            }
        }

        /* compiled from: CatalogAnalyticsEvent.kt */
        public static final class b implements c {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -979941591;
            }

            public final String toString() {
                return "OpenAuthorCabinetPayload";
            }
        }

        /* compiled from: CatalogAnalyticsEvent.kt */
        public interface c {
        }

        /* compiled from: CatalogAnalyticsEvent.kt */
        public static final class d {
            public final MobileOfficialAppsSearchStat$TypeSearchClickItem.Action a;
            public final SchemeStat$EventItem.Type b;

            public d(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action, SchemeStat$EventItem.Type type) {
                this.a = action;
                this.b = type;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.a == dVar.a && this.b == dVar.b;
            }

            public final int hashCode() {
                return this.b.hashCode() + qoy.b(this.a.hashCode() * 31, 31, true);
            }

            public final String toString() {
                return "SearchEventPayload(action=" + this.a + ", actionDeepScreenChange=true, type=" + this.b + ')';
            }
        }

        public a() {
            this(null, null, null, null, 15);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            c cVar = this.c;
            int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            d dVar = this.d;
            return hashCode3 + (dVar != null ? dVar.hashCode() : 0);
        }

        public final String toString() {
            return "Click(trackCode=" + this.a + ", url=" + this.b + ", payload=" + this.c + ", searchEventPayload=" + this.d + ')';
        }

        public a(String str, String str2, c cVar, d dVar, int i) {
            str = (i & 1) != 0 ? null : str;
            str2 = (i & 2) != 0 ? null : str2;
            cVar = (i & 4) != 0 ? null : cVar;
            dVar = (i & 8) != 0 ? null : dVar;
            this.a = str;
            this.b = str2;
            this.c = cVar;
            this.d = dVar;
        }
    }
}
