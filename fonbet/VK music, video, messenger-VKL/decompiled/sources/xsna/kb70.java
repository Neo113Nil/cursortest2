package xsna;

import java.util.List;
import xsna.i870;
import xsna.tlo0;

/* compiled from: NotificationListItem.kt */
/* loaded from: classes4.dex */
public interface kb70 {

    /* compiled from: NotificationListItem.kt */
    public static final class a implements kb70 {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        @Override // xsna.kb70
        public final String getKey() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Divider(key="), this.a, ')');
        }
    }

    /* compiled from: NotificationListItem.kt */
    public static final class b implements kb70 {
        public final tlo0.f a;
        public final String b;

        public b(tlo0.f fVar) {
            this.a = fVar;
            this.b = String.valueOf(Integer.hashCode(fVar.a));
        }

        @Override // xsna.kb70
        public final String getKey() {
            return this.b;
        }
    }

    /* compiled from: NotificationListItem.kt */
    public static final class c implements kb70 {
        public final tlo0 a;
        public final tlo0 b;
        public final w770 c;
        public final int d;

        public c(tlo0 tlo0Var, tlo0 tlo0Var2, w770 w770Var, int i) {
            this.a = tlo0Var;
            this.b = tlo0Var2;
            this.c = w770Var;
            this.d = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && this.d == cVar.d;
        }

        @Override // xsna.kb70
        public final String getKey() {
            return "FriendRequest";
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + ((this.c.hashCode() + com.vk.movika.sdk.base.model.history.b.a(this.a.hashCode() * 31, 31, this.b)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FriendRequest(title=");
            sb.append(this.a);
            sb.append(", subtitle=");
            sb.append(this.b);
            sb.append(", avatar=");
            sb.append(this.c);
            sb.append(", newRequestsCount=");
            return vu5.b(sb, this.d, ')');
        }
    }

    /* compiled from: NotificationListItem.kt */
    public static final class d implements kb70 {
        public final String a;
        public final int b;
        public final snv c;
        public final String d;
        public final w770 e;
        public final s8u0 f;
        public final s8u0 g;
        public final List<de70> h;
        public final String i;
        public final com.vk.notifications.core.item.a j;
        public final i870 k;
        public final r970 l;

        public /* synthetic */ d(String str, int i, snv snvVar, String str2, w770 w770Var, s8u0 s8u0Var, s8u0 s8u0Var2, List list, String str3, com.vk.notifications.core.item.a aVar, i870.a aVar2, int i2) {
            this(str, i, snvVar, (i2 & 8) != 0 ? null : str2, w770Var, s8u0Var, s8u0Var2, (List<de70>) list, (i2 & 256) != 0 ? null : str3, aVar, (i2 & 1024) != 0 ? null : aVar2, (r970) null);
        }

        public static d a(d dVar, List list, i870 i870Var, r970 r970Var, int i) {
            String str = dVar.a;
            int i2 = dVar.b;
            snv snvVar = dVar.c;
            String str2 = dVar.d;
            w770 w770Var = dVar.e;
            s8u0 s8u0Var = dVar.f;
            s8u0 s8u0Var2 = dVar.g;
            if ((i & 128) != 0) {
                list = dVar.h;
            }
            List list2 = list;
            String str3 = dVar.i;
            com.vk.notifications.core.item.a aVar = dVar.j;
            i870 i870Var2 = (i & 1024) != 0 ? dVar.k : i870Var;
            r970 r970Var2 = (i & 2048) != 0 ? dVar.l : r970Var;
            dVar.getClass();
            return new d(str, i2, snvVar, str2, w770Var, s8u0Var, s8u0Var2, (List<de70>) list2, str3, aVar, i870Var2, r970Var2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e) && epx.f(this.f, dVar.f) && epx.f(this.g, dVar.g) && epx.f(this.h, dVar.h) && epx.f(this.i, dVar.i) && epx.f(this.j, dVar.j) && epx.f(this.k, dVar.k) && epx.f(this.l, dVar.l);
        }

        @Override // xsna.kb70
        public final String getKey() {
            return this.a;
        }

        public final int hashCode() {
            int a = shy.a(this.b, this.a.hashCode() * 31, 31);
            snv snvVar = this.c;
            int hashCode = (a + (snvVar == null ? 0 : snvVar.hashCode())) * 31;
            String str = this.d;
            int hashCode2 = (this.f.hashCode() + ((this.e.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
            s8u0 s8u0Var = this.g;
            int hashCode3 = (hashCode2 + (s8u0Var == null ? 0 : s8u0Var.hashCode())) * 31;
            List<de70> list = this.h;
            int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            String str2 = this.i;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            com.vk.notifications.core.item.a aVar = this.j;
            int hashCode6 = (hashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            i870 i870Var = this.k;
            int hashCode7 = (hashCode6 + (i870Var == null ? 0 : i870Var.hashCode())) * 31;
            r970 r970Var = this.l;
            return hashCode7 + (r970Var != null ? r970Var.hashCode() : 0);
        }

        public final String toString() {
            return "Notification(id=" + this.a + ", date=" + this.b + ", action=" + this.c + ", time=" + this.d + ", avatar=" + this.e + ", titleAnnotated=" + this.f + ", subtitleAnnotated=" + this.g + ", menuActionOptions=" + this.h + ", textContent=" + this.i + ", attachment=" + this.j + ", buttons=" + this.k + ", disabledState=" + this.l + ')';
        }

        public d(String str, int i, snv snvVar, String str2, w770 w770Var, s8u0 s8u0Var, s8u0 s8u0Var2, List<de70> list, String str3, com.vk.notifications.core.item.a aVar, i870 i870Var, r970 r970Var) {
            this.a = str;
            this.b = i;
            this.c = snvVar;
            this.d = str2;
            this.e = w770Var;
            this.f = s8u0Var;
            this.g = s8u0Var2;
            this.h = list;
            this.i = str3;
            this.j = aVar;
            this.k = i870Var;
            this.l = r970Var;
        }
    }

    /* compiled from: NotificationListItem.kt */
    public static final class e implements kb70 {
        public final tlo0 a;
        public final String b;

        public e(tlo0 tlo0Var) {
            this.a = tlo0Var;
            this.b = String.valueOf(tlo0Var.hashCode());
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        @Override // xsna.kb70
        public final String getKey() {
            return this.b;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return bt.a(new StringBuilder("Title(title="), this.a, ')');
        }
    }

    String getKey();
}
