package xsna;

import com.vkontakte.android.R;

/* compiled from: ClipsWrapperNavigationIcon.kt */
/* loaded from: classes17.dex */
public interface nsf {

    /* compiled from: ClipsWrapperNavigationIcon.kt */
    public static final class a implements nsf {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(R.drawable.vk_icon_arrow_left_outline_28);
        }

        public final String toString() {
            return "ResIcon(resId=2131236332)";
        }
    }

    /* compiled from: ClipsWrapperNavigationIcon.kt */
    public static final class b implements nsf {
        public final String a;
        public final boolean b;

        public b(String str, boolean z) {
            this.a = str;
            this.b = z;
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
            String str = this.a;
            return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UrlIcon(url=");
            sb.append(this.a);
            sb.append(", isNft=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }
}
