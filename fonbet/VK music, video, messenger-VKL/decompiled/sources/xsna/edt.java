package xsna;

import com.vk.games.model.GamesCatalogScreenTab;
import java.util.ArrayList;
import xsna.udt;

/* compiled from: GamesCatalogPatch.kt */
/* loaded from: classes17.dex */
public interface edt extends xl50 {

    /* compiled from: GamesCatalogPatch.kt */
    public static final class a implements edt {
        public final long b;

        public a(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return vu5.a(')', this.b, new StringBuilder("DeleteGameFromMyGames(appId="));
        }
    }

    /* compiled from: GamesCatalogPatch.kt */
    public static final class b implements edt {
        public final int b;

        public b(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("DeleteNotification(requestId="), this.b, ')');
        }
    }

    /* compiled from: GamesCatalogPatch.kt */
    public static final class c implements edt {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1139361915;
        }

        public final String toString() {
            return "HideNotificationButton";
        }
    }

    /* compiled from: GamesCatalogPatch.kt */
    public static final class d implements edt {
        public final GamesCatalogScreenTab b;

        public d(GamesCatalogScreenTab gamesCatalogScreenTab) {
            this.b = gamesCatalogScreenTab;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SetActiveTab(activeTab=" + this.b + ')';
        }
    }

    /* compiled from: GamesCatalogPatch.kt */
    public static final class e implements edt {
        public final String b;
        public final boolean c;
        public final boolean d;

        public e(String str, boolean z, boolean z2) {
            this.b = str;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.b, eVar.b) && this.c == eVar.c && this.d == eVar.d;
        }

        public final int hashCode() {
            String str = this.b;
            return Boolean.hashCode(this.d) + qoy.b((str == null ? 0 : str.hashCode()) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetupState(avatarUrl=");
            sb.append(this.b);
            sb.append(", isAvatarVisible=");
            sb.append(this.c);
            sb.append(", isBackButtonVisible=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: GamesCatalogPatch.kt */
    public static abstract class f implements edt {
        public final GamesCatalogScreenTab b;

        /* compiled from: GamesCatalogPatch.kt */
        public static final class a extends f {
            public final boolean c;

            public a(GamesCatalogScreenTab gamesCatalogScreenTab, boolean z) {
                super(gamesCatalogScreenTab);
                this.c = z;
            }
        }

        /* compiled from: GamesCatalogPatch.kt */
        public static final class b extends f {
        }

        /* compiled from: GamesCatalogPatch.kt */
        public static final class c extends f {
        }

        /* compiled from: GamesCatalogPatch.kt */
        public static final class d extends f {
        }

        /* compiled from: GamesCatalogPatch.kt */
        public static final class e extends f {
            public final boolean c;
            public final zbt d;
            public final ArrayList e;
            public final int f;
            public final int g;

            public e(boolean z, zbt zbtVar, ArrayList arrayList, int i, int i2, GamesCatalogScreenTab gamesCatalogScreenTab) {
                super(gamesCatalogScreenTab);
                this.c = z;
                this.d = zbtVar;
                this.e = arrayList;
                this.f = i;
                this.g = i2;
            }
        }

        /* compiled from: GamesCatalogPatch.kt */
        /* renamed from: xsna.edt$f$f, reason: collision with other inner class name */
        public static final class C2795f extends f {
            public final udt.c c;

            public C2795f(udt.c cVar, GamesCatalogScreenTab gamesCatalogScreenTab) {
                super(gamesCatalogScreenTab);
                this.c = cVar;
            }
        }

        /* compiled from: GamesCatalogPatch.kt */
        public static final class g extends f {
            public final boolean c;

            public g(GamesCatalogScreenTab gamesCatalogScreenTab, boolean z) {
                super(gamesCatalogScreenTab);
                this.c = z;
            }
        }

        /* compiled from: GamesCatalogPatch.kt */
        public static final class h extends f {
        }

        /* compiled from: GamesCatalogPatch.kt */
        public static final class i extends f {
            public final ArrayList c;
            public final int d;
            public final int e;

            public i(ArrayList arrayList, int i, int i2, GamesCatalogScreenTab gamesCatalogScreenTab) {
                super(gamesCatalogScreenTab);
                this.c = arrayList;
                this.d = i;
                this.e = i2;
            }
        }

        public f(GamesCatalogScreenTab gamesCatalogScreenTab) {
            this.b = gamesCatalogScreenTab;
        }
    }

    /* compiled from: GamesCatalogPatch.kt */
    public static final class g implements edt {
        public final long b;
        public final String c;

        public g(long j, String str) {
            this.b = j;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.b == gVar.b && epx.f(this.c, gVar.c);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.b) * 31;
            String str = this.c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateGameNotificationBadge(appId=");
            sb.append(this.b);
            sb.append(", newNotificationBadgeType=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: GamesCatalogPatch.kt */
    public static final class h implements edt {
        public final String b;
        public final boolean c;
        public final boolean d;

        public h(String str, boolean z, boolean z2) {
            this.b = str;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.b, hVar.b) && this.c == hVar.c && this.d == hVar.d;
        }

        public final int hashCode() {
            String str = this.b;
            return Boolean.hashCode(this.d) + qoy.b((str == null ? 0 : str.hashCode()) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateToolbarInfo(avatarUrl=");
            sb.append(this.b);
            sb.append(", isNeedToShow=");
            sb.append(this.c);
            sb.append(", isCanGoBack=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }
}
