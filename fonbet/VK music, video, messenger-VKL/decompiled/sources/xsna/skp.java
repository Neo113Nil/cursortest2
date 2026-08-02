package xsna;

import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: ClipsPublishCellConfig.kt */
/* loaded from: classes17.dex */
public interface skp {

    /* compiled from: ClipsPublishCellConfig.kt */
    public static final class a implements skp {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -778598705;
        }

        public final String toString() {
            return "Chevron";
        }
    }

    /* compiled from: ClipsPublishCellConfig.kt */
    public static final class b implements skp {
        public final jai a;

        public b(jai jaiVar) {
            this.a = jaiVar;
        }
    }

    /* compiled from: ClipsPublishCellConfig.kt */
    public static final class c implements skp {
        public final tlo0.f a;

        public c(tlo0.f fVar) {
            this.a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            return this.a.equals(cVar.a);
        }

        public final int hashCode() {
            return Integer.hashCode(this.a.a) + (Integer.hashCode(R.drawable.vk_icon_info_circle_outline_20) * 31);
        }

        public final String toString() {
            return pr.b(new StringBuilder("CustomIcon(iconId=2131237480, description="), this.a, ')');
        }
    }

    /* compiled from: ClipsPublishCellConfig.kt */
    public static final class d implements skp {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1342922972;
        }

        public final String toString() {
            return "None";
        }
    }

    /* compiled from: ClipsPublishCellConfig.kt */
    public static final class e implements skp {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1953522320;
        }

        public final String toString() {
            return "Remove";
        }
    }

    /* compiled from: ClipsPublishCellConfig.kt */
    public static final class f implements skp {
        public final boolean a;

        public f(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Switch(isSelected="), this.a, ')');
        }
    }
}
