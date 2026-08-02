package xsna;

import com.vkontakte.android.R;
import kotlin.Pair;

/* compiled from: ImageHalfTileResolverImpl.kt */
/* loaded from: classes6.dex */
public final class jjw {
    public static final int b = cn70.b(36);
    public final Object a = pn00.k(new Pair("play", new a(R.drawable.vk_icon_play_24)), new Pair("chevron_right", new a(R.drawable.vk_icon_chevron_right_24)));

    /* compiled from: ImageHalfTileResolverImpl.kt */
    public static final class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("IconPreset(resId="), this.a, ')');
        }
    }
}
