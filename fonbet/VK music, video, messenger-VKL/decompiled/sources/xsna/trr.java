package xsna;

import com.vkontakte.android.R;

/* compiled from: FloatingButton.kt */
/* loaded from: classes16.dex */
public interface trr {

    /* compiled from: FloatingButton.kt */
    public static final class a implements trr {
        public final gko a;
        public final Integer b;
        public final ww c;

        public a() {
            throw null;
        }

        public a(gko gkoVar, ww wwVar) {
            Integer valueOf = Integer.valueOf(R.attr.vk_ui_icon_medium);
            this.a = gkoVar;
            this.b = valueOf;
            this.c = wwVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a.a) * 31;
            Integer num = this.b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 961;
            ww wwVar = this.c;
            return hashCode2 + (wwVar != null ? wwVar.hashCode() : 0);
        }

        public final String toString() {
            return "Icon(icon=" + this.a + ", iconTint=" + this.b + ", iconDescription=null, onClick=" + this.c + ')';
        }
    }
}
