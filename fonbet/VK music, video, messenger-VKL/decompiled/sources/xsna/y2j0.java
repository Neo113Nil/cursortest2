package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: TabbarSettingsMvi.kt */
/* loaded from: classes6.dex */
public interface y2j0 {

    /* compiled from: TabbarSettingsMvi.kt */
    public static final class a implements y2j0 {
        public final boolean a;
        public final String b;
        public final int c;
        public final List<xvn0> d;
        public final int e;
        public final boolean f;
        public final List<sh00> g;

        public a(boolean z, String str, int i, List<xvn0> list, int i2, boolean z2, List<sh00> list2) {
            this.a = z;
            this.b = str;
            this.c = i;
            this.d = list;
            this.e = i2;
            this.f = z2;
            this.g = list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a a(a aVar, boolean z, String str, int i, ArrayList arrayList, int i2, boolean z2, int i3) {
            if ((i3 & 1) != 0) {
                z = aVar.a;
            }
            boolean z3 = z;
            if ((i3 & 2) != 0) {
                str = aVar.b;
            }
            String str2 = str;
            if ((i3 & 4) != 0) {
                i = aVar.c;
            }
            int i4 = i;
            List list = arrayList;
            if ((i3 & 8) != 0) {
                list = aVar.d;
            }
            List list2 = list;
            if ((i3 & 16) != 0) {
                i2 = aVar.e;
            }
            int i5 = i2;
            if ((i3 & 32) != 0) {
                z2 = aVar.f;
            }
            List<sh00> list3 = aVar.g;
            aVar.getClass();
            return new a(z3, str2, i4, list2, i5, z2, list3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f && epx.f(this.g, aVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + qoy.b(shy.a(this.e, fw3.a(shy.a(this.c, urd0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31), 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(isLoaderVisible=");
            sb.append(this.a);
            sb.append(", selectedId=");
            sb.append(this.b);
            sb.append(", animValue=");
            sb.append(this.c);
            sb.append(", items=");
            sb.append(this.d);
            sb.append(", bottomSelectedIndex=");
            sb.append(this.e);
            sb.append(", isTabbarChanged=");
            sb.append(this.f);
            sb.append(", managedGroups=");
            return ms9.a(')', sb, this.g);
        }
    }

    /* compiled from: TabbarSettingsMvi.kt */
    public static final class b implements y2j0 {
        public static final b a = new b();
    }

    /* compiled from: TabbarSettingsMvi.kt */
    public static final class c implements y2j0 {
        public static final c a = new c();
    }
}
