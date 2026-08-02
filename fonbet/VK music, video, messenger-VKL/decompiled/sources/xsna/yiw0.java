package xsna;

import com.vk.voip.ui.calls.presentation.feature.handler.VoipCallServiceBannerHandler;
import com.vk.voip.ui.calls.presentation.model.list.FriendItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: VoipCallServiceState.kt */
/* loaded from: classes7.dex */
public interface yiw0 extends km50 {

    /* compiled from: VoipCallServiceState.kt */
    public static final class a implements yiw0 {
        public final boolean b;
        public final boolean c;

        public a(boolean z, boolean z2) {
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Empty(fromSearch=");
            sb.append(this.b);
            sb.append(", isContactsSyncShowEnabled=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: VoipCallServiceState.kt */
    public static final class b implements yiw0 {
        public final String b;
        public final Throwable c;

        public b(String str, Throwable th) {
            this.b = str;
            this.c = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            String str = this.b;
            return this.c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Error(searchQuery=");
            sb.append(this.b);
            sb.append(", throwable=");
            return oq.c(sb, this.c, ')');
        }
    }

    /* compiled from: VoipCallServiceState.kt */
    public static final class c implements yiw0 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1410303091;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: VoipCallServiceState.kt */
    public static final class d implements yiw0 {
        public final VoipCallServiceBannerHandler.a b;
        public final List<FriendItem> c;
        public final List<FriendItem> d;
        public final int e;

        public d(VoipCallServiceBannerHandler.a aVar, List<FriendItem> list, List<FriendItem> list2, int i) {
            this.b = aVar;
            this.c = list;
            this.d = list2;
            this.e = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d) && this.e == dVar.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + fw3.a(fw3.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Ready(banner=");
            sb.append(this.b);
            sb.append(", importantFriends=");
            sb.append(this.c);
            sb.append(", allFriends=");
            sb.append(this.d);
            sb.append(", allFriendsCount=");
            return vu5.b(sb, this.e, ')');
        }
    }

    /* compiled from: VoipCallServiceState.kt */
    public static final class e implements yiw0 {
        public final a b;
        public final b c;

        /* compiled from: VoipCallServiceState.kt */
        public interface a {

            /* compiled from: VoipCallServiceState.kt */
            /* renamed from: xsna.yiw0$e$a$a, reason: collision with other inner class name */
            public static final class C4103a implements a {
                public static final C4103a a = new C4103a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C4103a);
                }

                public final int hashCode() {
                    return 640250604;
                }

                public final String toString() {
                    return "Loading";
                }
            }

            /* compiled from: VoipCallServiceState.kt */
            public static final class b implements a {
                public final ArrayList a;
                public final boolean b;

                public b(ArrayList arrayList, boolean z) {
                    this.a = arrayList;
                    this.b = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return this.a.equals(bVar.a) && this.b == bVar.b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Ready(itemList=");
                    sb.append(this.a);
                    sb.append(", isContactsSyncShowEnabled=");
                    return defpackage.q0.a(sb, this.b, ')');
                }
            }
        }

        /* compiled from: VoipCallServiceState.kt */
        public interface b {

            /* compiled from: VoipCallServiceState.kt */
            public static final class a implements b {
                public static final a a = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return -1506055288;
                }

                public final String toString() {
                    return "Loading";
                }
            }

            /* compiled from: VoipCallServiceState.kt */
            /* renamed from: xsna.yiw0$e$b$b, reason: collision with other inner class name */
            public static final class C4104b implements b {
                public final String a;
                public final String b;
                public final List<low0> c;
                public final boolean d;

                public C4104b(String str, String str2, boolean z, List list) {
                    this.a = str;
                    this.b = str2;
                    this.c = list;
                    this.d = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C4104b)) {
                        return false;
                    }
                    C4104b c4104b = (C4104b) obj;
                    return epx.f(this.a, c4104b.a) && epx.f(this.b, c4104b.b) && epx.f(this.c, c4104b.c) && this.d == c4104b.d;
                }

                public final int hashCode() {
                    String str = this.a;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.b;
                    return Boolean.hashCode(this.d) + fw3.a((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Ready(idSection=");
                    sb.append(this.a);
                    sb.append(", nextSection=");
                    sb.append(this.b);
                    sb.append(", itemList=");
                    sb.append(this.c);
                    sb.append(", isLoadPagination=");
                    return defpackage.q0.a(sb, this.d, ')');
                }
            }
        }

        public e(a aVar, b bVar) {
            this.b = aVar;
            this.c = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "Search(friends=" + this.b + ", global=" + this.c + ')';
        }
    }

    /* compiled from: VoipCallServiceState.kt */
    public interface f extends yiw0 {

        /* compiled from: VoipCallServiceState.kt */
        public static final class a implements f {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -2086243682;
            }

            public final String toString() {
                return "Loading";
            }
        }

        /* compiled from: VoipCallServiceState.kt */
        public static final class b implements f {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                ((b) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "Ready(search=null)";
            }
        }
    }
}
