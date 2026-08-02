package xsna;

import android.graphics.drawable.Drawable;
import com.vk.dto.common.im.ImageList;

/* compiled from: ChatProfileChatSettingsItem.kt */
/* loaded from: classes2.dex */
public abstract class vwb implements hfz {

    /* compiled from: ChatProfileChatSettingsItem.kt */
    public static final class a extends vwb {
        public final String b;
        public final String c;
        public final boolean d;
        public final boolean e;
        public final ImageList f;

        public a(String str, String str2, boolean z, boolean z2, ImageList imageList) {
            this.b = str;
            this.c = str2;
            this.d = z;
            this.e = z2;
            this.f = imageList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e && epx.f(this.f, aVar.f);
        }

        @Override // xsna.hfz
        public final /* bridge */ /* synthetic */ Number getItemId() {
            return -2147483647;
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
            ImageList imageList = this.f;
            return (b + (imageList == null ? 0 : imageList.b.hashCode())) * 31;
        }

        public final String toString() {
            return "ChannelSettingsItem(title=" + this.b + ", description=" + this.c + ", isMessagesAvailable=" + this.d + ", isEditEnabled=" + this.e + ", avatarImage=" + this.f + ", avatarPlaceholder=null)";
        }
    }

    /* compiled from: ChatProfileChatSettingsItem.kt */
    public static final class b extends vwb {
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public b(int i, int i2, int i3, int i4) {
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e;
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(this.b);
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + shy.a(this.d, shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChatControlItem(paramId=");
            sb.append(this.b);
            sb.append(", iconRes=");
            sb.append(this.c);
            sb.append(", titleRes=");
            sb.append(this.d);
            sb.append(", subTitleRes=");
            return vu5.b(sb, this.e, ')');
        }
    }

    /* compiled from: ChatProfileChatSettingsItem.kt */
    public static final class c extends vwb {
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final boolean f;

        public c(int i, int i2, int i3, int i4, boolean z) {
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f;
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(this.b);
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + shy.a(this.e, shy.a(this.d, shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChatControlSwitchItem(paramId=");
            sb.append(this.b);
            sb.append(", iconRes=");
            sb.append(this.c);
            sb.append(", titleRes=");
            sb.append(this.d);
            sb.append(", subTitleRes=");
            sb.append(this.e);
            sb.append(", isChecked=");
            return defpackage.q0.a(sb, this.f, ')');
        }
    }

    /* compiled from: ChatProfileChatSettingsItem.kt */
    public static final class d extends vwb {
        public final String b;
        public final boolean c = true;
        public final ImageList d;
        public final Drawable e;

        public d(String str, ImageList imageList, Drawable drawable) {
            this.b = str;
            this.d = imageList;
            this.e = drawable;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && this.c == dVar.c && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e);
        }

        @Override // xsna.hfz
        public final /* bridge */ /* synthetic */ Number getItemId() {
            return Integer.MIN_VALUE;
        }

        public final int hashCode() {
            int b = qoy.b(this.b.hashCode() * 31, 31, this.c);
            ImageList imageList = this.d;
            int hashCode = (b + (imageList == null ? 0 : imageList.b.hashCode())) * 31;
            Drawable drawable = this.e;
            return hashCode + (drawable != null ? drawable.hashCode() : 0);
        }

        public final String toString() {
            return "ChatTitleAndAvatarItem(title=" + this.b + ", isEditEnabled=" + this.c + ", avatarImage=" + this.d + ", avatarPlaceholder=" + this.e + ')';
        }
    }
}
