package xsna;

import com.vk.dto.profile.Address;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.goh0;
import xsna.ynh0;

/* compiled from: SearchCommunitiesOnMapDetailsViewState.kt */
/* loaded from: classes5.dex */
public final class loh0 implements ao50 {
    public final fi50 a;
    public final fi50 b;

    /* compiled from: SearchCommunitiesOnMapDetailsViewState.kt */
    public static final class a {
        public final int a;
        public final ynh0 b;
        public final boolean c;
        public final Integer d;
        public final boolean e;

        public a(int i, ynh0 ynh0Var, Integer num, boolean z, int i2) {
            boolean z2 = (i2 & 4) == 0;
            num = (i2 & 8) != 0 ? null : num;
            z = (i2 & 16) != 0 ? false : z;
            this.a = i;
            this.b = ynh0Var;
            this.c = z2;
            this.d = num;
            this.e = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d) && this.e == aVar.e;
        }

        public final int hashCode() {
            int b = qoy.b((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c);
            Integer num = this.d;
            return Boolean.hashCode(this.e) + ((b + (num == null ? 0 : num.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ActionButton(textResId=");
            sb.append(this.a);
            sb.append(", action=");
            sb.append(this.b);
            sb.append(", isPrimary=");
            sb.append(this.c);
            sb.append(", counter=");
            sb.append(this.d);
            sb.append(", isInProgress=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }

    /* compiled from: SearchCommunitiesOnMapDetailsViewState.kt */
    public static final class b {
        public final List<a> a;
        public final boolean b;

        public b() {
            this(null, 3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BottomActionButtons(buttons=");
            sb.append(this.a);
            sb.append(", isShowOnMapButtonVisible=");
            return defpackage.q0.a(sb, this.b, ')');
        }

        public b(List list, int i) {
            this.a = (i & 1) != 0 ? EmptyList.b : list;
            this.b = true;
        }
    }

    /* compiled from: SearchCommunitiesOnMapDetailsViewState.kt */
    public interface c {

        /* compiled from: SearchCommunitiesOnMapDetailsViewState.kt */
        public static final class a implements c {
            public final int a;

            public a(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a == ((a) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Gradient(color="), this.a, ')');
            }
        }

        /* compiled from: SearchCommunitiesOnMapDetailsViewState.kt */
        public static final class b implements c {
            public final String a;

            public b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Url(url="), this.a, ')');
            }
        }
    }

    /* compiled from: SearchCommunitiesOnMapDetailsViewState.kt */
    public interface d {

        /* compiled from: SearchCommunitiesOnMapDetailsViewState.kt */
        public static final class a implements d {
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

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Address(address="), this.a, ')');
            }
        }

        /* compiled from: SearchCommunitiesOnMapDetailsViewState.kt */
        public static final class b implements d {
            public final int a;
            public final int b;
            public final List<String> c;
            public final boolean d;

            public b(int i, int i2, boolean z, List list) {
                this.a = i;
                this.b = i2;
                this.c = list;
                this.d = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && this.b == bVar.b && epx.f(this.c, bVar.c) && this.d == bVar.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + fw3.a(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Members(membersCount=");
                sb.append(this.a);
                sb.append(", friendsCount=");
                sb.append(this.b);
                sb.append(", friendsAvatarsUrls=");
                sb.append(this.c);
                sb.append(", isJoined=");
                return defpackage.q0.a(sb, this.d, ')');
            }
        }

        /* compiled from: SearchCommunitiesOnMapDetailsViewState.kt */
        public static final class c implements d {
            public static final c a = new c();
        }

        /* compiled from: SearchCommunitiesOnMapDetailsViewState.kt */
        /* renamed from: xsna.loh0$d$d, reason: collision with other inner class name */
        public static final class C3281d implements d {
            public final Address a;

            public C3281d(Address address) {
                this.a = address;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3281d) && epx.f(this.a, ((C3281d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "OpeningState(address=" + this.a + ')';
            }
        }
    }

    /* compiled from: SearchCommunitiesOnMapDetailsViewState.kt */
    public interface e<T extends goh0> extends fm50<T> {

        /* compiled from: SearchCommunitiesOnMapDetailsViewState.kt */
        public static final class a implements e<goh0.a> {
            public final yzt0<String> a;
            public final yzt0<String> b;
            public final yzt0<c> c;
            public final yzt0<String> d;
            public final yzt0<List<d>> e;
            public final yzt0<b> f;
            public final yzt0<f> g;

            public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7) {
                this.a = h0u0Var;
                this.b = h0u0Var2;
                this.c = h0u0Var3;
                this.d = h0u0Var4;
                this.e = h0u0Var5;
                this.f = h0u0Var6;
                this.g = h0u0Var7;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g);
            }

            public final int hashCode() {
                return this.g.hashCode() + sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Content(title=");
                sb.append(this.a);
                sb.append(", description=");
                sb.append(this.b);
                sb.append(", coverImage=");
                sb.append(this.c);
                sb.append(", avatarUrl=");
                sb.append(this.d);
                sb.append(", infoItems=");
                sb.append(this.e);
                sb.append(", bottomActionButtons=");
                sb.append(this.f);
                sb.append(", reviews=");
                return tr.c(sb, this.g, ')');
            }
        }

        /* compiled from: SearchCommunitiesOnMapDetailsViewState.kt */
        public static final class b implements e<goh0.b> {
            public static final b a = new b();
        }
    }

    /* compiled from: SearchCommunitiesOnMapDetailsViewState.kt */
    public static abstract class f {
        public final ynh0 a;

        /* compiled from: SearchCommunitiesOnMapDetailsViewState.kt */
        public static final class a extends f {
            public final String b;

            public a() {
                this(null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                String str = this.b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("AddReview(rating="), this.b, ')');
            }

            public a(String str) {
                super(ynh0.a.b);
                this.b = str;
            }
        }

        /* compiled from: SearchCommunitiesOnMapDetailsViewState.kt */
        public static final class b extends f {
            public static final b b = new b(ynh0.j.b);
        }

        /* compiled from: SearchCommunitiesOnMapDetailsViewState.kt */
        public static final class c extends f {
            public static final c b = new c(ynh0.j.b);
        }

        /* compiled from: SearchCommunitiesOnMapDetailsViewState.kt */
        public static final class d extends f {
            public final String b;
            public final int c;

            public d(String str, int i) {
                super(ynh0.j.b);
                this.b = str;
                this.c = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.b, dVar.b) && this.c == dVar.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Rating(rating=");
                sb.append(this.b);
                sb.append(", reviewsCount=");
                return vu5.b(sb, this.c, ')');
            }
        }

        /* compiled from: SearchCommunitiesOnMapDetailsViewState.kt */
        public static final class e extends f {
            public static final e b = new e(ynh0.j.b);
        }

        public f(ynh0 ynh0Var) {
            this.a = ynh0Var;
        }
    }

    public loh0(fi50 fi50Var, fi50 fi50Var2) {
        this.a = fi50Var;
        this.b = fi50Var2;
    }
}
