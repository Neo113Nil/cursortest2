package xsna;

import com.vkontakte.android.R;

/* compiled from: UIPlayerButtons.kt */
@ozl
/* loaded from: classes8.dex */
public interface xwp0 {

    /* compiled from: UIPlayerButtons.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            return sni0.a("FastSeekMode(isActive=", ", isUiVisible=", ", isUsedInCast=false)", this.a, this.b);
        }
    }

    /* compiled from: UIPlayerButtons.kt */
    public static final class b {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(R.drawable.one_video_icon_video_fill_none_24) + (Integer.hashCode(R.drawable.one_video_icon_video_fill_24) * 31);
        }

        public final String toString() {
            return "ResizeUiConfig(resizeInIconRes=2131235413, resizeOutIconRes=2131235414)";
        }
    }

    void setChromeCastActive(boolean z);

    void setFullScreenMode(boolean z);
}
