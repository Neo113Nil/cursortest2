package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: TabbarSettingsMvi.kt */
/* loaded from: classes6.dex */
public interface jun0 extends kj50 {

    /* compiled from: TabbarSettingsMvi.kt */
    public static final class a implements jun0 {
        public final int b;

        public a(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("BottomTabbarItemClicked(index="), this.b, ')');
        }
    }

    /* compiled from: TabbarSettingsMvi.kt */
    public static final class b implements jun0 {
        public static final b b = new b();
    }

    /* compiled from: TabbarSettingsMvi.kt */
    public static final class c implements jun0 {
        public static final c b = new c();
    }

    /* compiled from: TabbarSettingsMvi.kt */
    public static final class d implements jun0 {
        public final String b;
        public final int c;

        public d(String str, int i) {
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
            StringBuilder sb = new StringBuilder("MainTabbarItemClicked(id=");
            sb.append(this.b);
            sb.append(", countManagedGroup=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: TabbarSettingsMvi.kt */
    public static final class e implements jun0 {
        public final String b;
        public final UserId c;

        public e(String str, UserId userId) {
            this.b = str;
            this.c = userId;
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
            return Long.hashCode(this.c.b) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MainTabbarItemGroupSelected(id=");
            sb.append(this.b);
            sb.append(", groupId=");
            return gp.b(sb, this.c, ')');
        }
    }

    /* compiled from: TabbarSettingsMvi.kt */
    public static final class f implements jun0 {
        public static final f b = new f();
    }

    /* compiled from: TabbarSettingsMvi.kt */
    public static final class g implements jun0 {
        public static final g b = new g();
    }
}
