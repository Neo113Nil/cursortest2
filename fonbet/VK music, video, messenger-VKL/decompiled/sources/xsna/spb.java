package xsna;

import com.vkontakte.android.R;

/* compiled from: ChatControlsAdapter.kt */
/* loaded from: classes2.dex */
public abstract class spb implements hfz {

    /* compiled from: ChatControlsAdapter.kt */
    public static final class a extends spb {
        public final int b;
        public final int c;
        public final int d;
        public int e;

        public a(int i, int i2, int i3, int i4) {
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
        }

        @Override // xsna.spb, xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(this.b);
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + shy.a(this.d, shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Popup(paramId=");
            sb.append(this.b);
            sb.append(", iconRes=");
            sb.append(this.c);
            sb.append(", titleRes=");
            sb.append(this.d);
            sb.append(", subTitleRes=");
            return vu5.b(sb, this.e, ')');
        }
    }

    /* compiled from: ChatControlsAdapter.kt */
    public static final class b extends spb {
        public final int b = 9;
        public boolean c = false;
        public final int d = R.drawable.vk_icon_pop_up_sticker_circle_fill_red_28;
        public final int e = R.string.vkim_popup_stickers_autoplay;
        public int f = R.string.vkim_popup_stickers_enabled;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f;
        }

        @Override // xsna.spb, xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(this.b);
        }

        public final int hashCode() {
            return Integer.hashCode(this.f) + shy.a(this.e, shy.a(this.d, qoy.b(Integer.hashCode(this.b) * 31, 31, this.c), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Switch(paramId=");
            sb.append(this.b);
            sb.append(", isChecked=");
            sb.append(this.c);
            sb.append(", iconRes=");
            sb.append(this.d);
            sb.append(", titleRes=");
            sb.append(this.e);
            sb.append(", subTitleRes=");
            return vu5.b(sb, this.f, ')');
        }
    }

    @Override // xsna.hfz
    public Number getItemId() {
        return 0;
    }
}
