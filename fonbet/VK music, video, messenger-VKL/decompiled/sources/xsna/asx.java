package xsna;

import java.util.List;

/* compiled from: InviteFriendsTabState.kt */
/* loaded from: classes14.dex */
public interface asx {

    /* compiled from: InviteFriendsTabState.kt */
    public static final class a implements asx {
        public final List<jis> a;
        public final String b;

        public a(List<jis> list, String str) {
            this.a = list;
            this.b = str;
        }

        public static a a(a aVar, List list) {
            String str = aVar.b;
            aVar.getClass();
            return new a(list, str);
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
            StringBuilder sb = new StringBuilder("Content(friends=");
            sb.append(this.a);
            sb.append(", nextFrom=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: InviteFriendsTabState.kt */
    public static final class b implements asx {
        public static final b a = new b();
    }

    /* compiled from: InviteFriendsTabState.kt */
    public static final class c implements asx {
        public static final c a = new c();
    }

    /* compiled from: InviteFriendsTabState.kt */
    public static final class d implements asx {
        public static final d a = new d();
    }
}
