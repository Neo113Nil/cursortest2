package xsna;

import com.vkontakte.android.R;

/* compiled from: ChannelStateDataSource.kt */
/* loaded from: classes16.dex */
public abstract class ycb {

    /* compiled from: ChannelStateDataSource.kt */
    public static final class a extends ycb {
        public final int a = R.string.vkim_channels_closed_message;
        public final int b = R.string.vkim_channels_closed_title;
        public final int c = R.drawable.vk_icon_sunglasses_circle_fill_gray_28;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChannelClosed(message=");
            sb.append(this.a);
            sb.append(", titleRes=");
            sb.append(this.b);
            sb.append(", icon=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: ChannelStateDataSource.kt */
    public static final class b extends ycb {
        public final int a = R.string.vkim_channels_private_message;
        public final int b = R.string.vkim_channels_private_title;
        public final int c = R.drawable.vk_icon_sunglasses_circle_fill_gray_28;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChannelPrivate(message=");
            sb.append(this.a);
            sb.append(", titleRes=");
            sb.append(this.b);
            sb.append(", icon=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: ChannelStateDataSource.kt */
    public static final class c extends ycb {
        public final String a;
        public final int b = R.string.vkim_channels_deactivated_title;
        public final int c = R.drawable.vk_icon_avatar_placeholder_sad_persik_alt_150;

        public c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Deactivated(message=");
            sb.append(this.a);
            sb.append(", titleRes=");
            sb.append(this.b);
            sb.append(", icon=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: ChannelStateDataSource.kt */
    public static final class d extends ycb {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1908746985;
        }

        public final String toString() {
            return "Empty";
        }
    }
}
