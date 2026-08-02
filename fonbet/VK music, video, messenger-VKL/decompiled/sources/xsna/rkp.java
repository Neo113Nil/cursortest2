package xsna;

import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: ClipUploadItem.kt */
/* loaded from: classes17.dex */
public interface rkp {

    /* compiled from: ClipUploadItem.kt */
    public static final class a implements rkp {
        public final jai a;

        public a(jai jaiVar) {
            this.a = jaiVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ComposableWrapper(content=" + this.a + ')';
        }
    }

    /* compiled from: ClipUploadItem.kt */
    public static final class b implements rkp {
        public final tlo0.f a;

        public b(tlo0.f fVar) {
            this.a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            bVar.getClass();
            return this.a.equals(bVar.a);
        }

        public final int hashCode() {
            return Integer.hashCode(this.a.a) + (Integer.hashCode(R.drawable.vk_icon_info_circle_outline_20) * 31);
        }

        public final String toString() {
            return pr.b(new StringBuilder("CustomIcon(resId=2131237480, description="), this.a, ')');
        }
    }

    /* compiled from: ClipUploadItem.kt */
    public static final class c implements rkp {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 888950258;
        }

        public final String toString() {
            return "None";
        }
    }

    /* compiled from: ClipUploadItem.kt */
    public static final class d implements rkp {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -312028994;
        }

        public final String toString() {
            return "Remove";
        }
    }

    /* compiled from: ClipUploadItem.kt */
    public static final class e implements rkp {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -283439818;
        }

        public final String toString() {
            return "Select";
        }
    }

    /* compiled from: ClipUploadItem.kt */
    public static final class f implements rkp {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            ((f) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "Switch(isSelected=false)";
        }
    }
}
