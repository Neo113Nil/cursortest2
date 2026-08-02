package xsna;

import com.vkontakte.android.R;

/* compiled from: FloatingButton.kt */
/* loaded from: classes16.dex */
public interface rrr {

    /* compiled from: FloatingButton.kt */
    public static final class a implements rrr {
        public final gko a;

        public a(gko gkoVar) {
            this.a = gkoVar;
        }

        public final boolean equals(Object obj) {
            Object valueOf = Integer.valueOf(R.attr.vk_ui_icon_primary_invariably);
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a) && valueOf.equals(valueOf);
        }

        public final int hashCode() {
            return (Integer.valueOf(R.attr.vk_ui_icon_primary_invariably).hashCode() + (Integer.hashCode(this.a.a) * 31)) * 31;
        }

        public final String toString() {
            return "Icon(icon=" + this.a + ", iconTint=" + Integer.valueOf(R.attr.vk_ui_icon_primary_invariably) + ", iconDescription=null)";
        }
    }

    /* compiled from: FloatingButton.kt */
    public static final class b implements rrr {
        public final vrr a;

        public b(vrr vrrVar) {
            this.a = vrrVar;
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
            return "Picture(pictureParams=" + this.a + ')';
        }
    }
}
