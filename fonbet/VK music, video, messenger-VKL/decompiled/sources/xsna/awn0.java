package xsna;

import com.vk.tabbar.settings.impl.mvi.InteractSource;
import java.util.ArrayList;
import xsna.t0j0;
import xsna.y2j0;

/* compiled from: TabbarSettingsMvi.kt */
/* loaded from: classes6.dex */
public interface awn0 extends xl50 {

    /* compiled from: TabbarSettingsMvi.kt */
    public static final class a implements awn0 {
        public final String b;
        public final int c;
        public final int d;
        public final boolean e;
        public final ArrayList f;
        public final boolean g;
        public final ArrayList h;
        public final InteractSource i;

        public a(String str, int i, int i2, boolean z, ArrayList arrayList, boolean z2, ArrayList arrayList2, InteractSource interactSource) {
            this.b = str;
            this.c = i;
            this.d = i2;
            this.e = z;
            this.f = arrayList;
            this.g = z2;
            this.h = arrayList2;
            this.i = interactSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f.equals(aVar.f) && this.g == aVar.g && this.h.equals(aVar.h) && this.i == aVar.i;
        }

        public final int hashCode() {
            return this.i.hashCode() + qr.a(this.h, qoy.b(qr.a(this.f, qoy.b(shy.a(this.d, shy.a(this.c, this.b.hashCode() * 31, 31), 31), 31, this.e), 31), 31, this.g), 31);
        }

        public final String toString() {
            return "ChangedByUserInteraction(selectedId=" + this.b + ", animValue=" + this.c + ", bottomSelectedIndex=" + this.d + ", isTabbarChanged=" + this.e + ", items=" + this.f + ", isResetButtonEnabled=" + this.g + ", mainItems=" + this.h + ", interactSource=" + this.i + ')';
        }
    }

    /* compiled from: TabbarSettingsMvi.kt */
    public static final class b implements awn0 {
        public static final b b = new b();
    }

    /* compiled from: TabbarSettingsMvi.kt */
    public static final class c implements awn0 {
        public final y2j0.a b;
        public final t0j0.a c;

        public c(y2j0.a aVar, t0j0.a aVar2) {
            this.b = aVar;
            this.c = aVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b.equals(cVar.b) && this.c.equals(cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "Loaded(mainData=" + this.b + ", bottomData=" + this.c + ')';
        }
    }

    /* compiled from: TabbarSettingsMvi.kt */
    public static final class d implements awn0 {
        public final t0j0.a b;

        public d(t0j0.a aVar) {
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b.equals(((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Loading(bottomData=" + this.b + ')';
        }
    }

    /* compiled from: TabbarSettingsMvi.kt */
    public static final class e implements awn0 {
        public final boolean b;
        public final boolean c;

        public e(boolean z, boolean z2) {
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.b == eVar.b && this.c == eVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SaveProgressChanged(isInProgress=");
            sb.append(this.b);
            sb.append(", isResetButtonEnabled=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: TabbarSettingsMvi.kt */
    public static final class f implements awn0 {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 373562148;
        }

        public final String toString() {
            return "ShowModalGroupsSelection";
        }
    }
}
