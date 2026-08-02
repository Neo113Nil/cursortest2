package xsna;

import com.vk.dto.menu.SideMenuItem;
import com.vk.superapp.api.dto.account.ProfileNavigationInfo;
import com.vkontakte.android.R;

/* compiled from: MenuV3Item.kt */
/* loaded from: classes6.dex */
public abstract class p820 extends zif0 {

    /* compiled from: MenuV3Item.kt */
    public static final class a extends p820 {
        public final ProfileNavigationInfo a;

        public a(ProfileNavigationInfo profileNavigationInfo) {
            this.a = profileNavigationInfo;
        }

        @Override // xsna.p820
        public final String c() {
            return "vk_id";
        }

        @Override // xsna.p820
        public final int d() {
            return 0;
        }

        @Override // xsna.p820
        public final int e() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            aVar.getClass();
            return epx.f(this.a, aVar.a);
        }

        public final int hashCode() {
            int a = shy.a(0, Integer.hashCode(0) * 31, 31);
            ProfileNavigationInfo profileNavigationInfo = this.a;
            return a + (profileNavigationInfo != null ? profileNavigationInfo.hashCode() : 0);
        }

        public final String toString() {
            return "Profile(sectionIndex=0, indexInSection=0, navigationInfo=" + this.a + ')';
        }
    }

    /* compiled from: MenuV3Item.kt */
    public static final class b extends p820 {
        public final int a;
        public final int b;
        public final SideMenuItem c;

        public b(int i, int i2, SideMenuItem sideMenuItem) {
            this.a = i;
            this.b = i2;
            this.c = sideMenuItem;
        }

        @Override // xsna.p820
        public final String c() {
            return this.c.b;
        }

        @Override // xsna.p820
        public final int d() {
            return this.b;
        }

        @Override // xsna.p820
        public final int e() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            return "Side(sectionIndex=" + this.a + ", indexInSection=" + this.b + ", sideMenuItem=" + this.c + ')';
        }
    }

    /* compiled from: MenuV3Item.kt */
    public static final class c extends p820 {
        public final int a;
        public final int b;
        public final String c;

        public c(int i, int i2, String str) {
            this.a = i;
            this.b = i2;
            this.c = str;
        }

        @Override // xsna.p820
        public final String c() {
            return this.c;
        }

        @Override // xsna.p820
        public final int d() {
            return this.b;
        }

        @Override // xsna.p820
        public final int e() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + urd0.a(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Simple(sectionIndex=");
            sb.append(this.a);
            sb.append(", indexInSection=");
            sb.append(this.b);
            sb.append(", id=");
            return i5s.a(sb, this.c, ", isDotVisible=false)");
        }
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.item_super_app_menu_v3_item;
    }

    public abstract String c();

    public abstract int d();

    public abstract int e();
}
