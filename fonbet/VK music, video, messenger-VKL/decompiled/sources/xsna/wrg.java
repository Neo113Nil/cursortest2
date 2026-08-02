package xsna;

import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;

/* compiled from: CommunityAppButtonItemModel.kt */
/* loaded from: classes5.dex */
public abstract class wrg extends s4h {
    public final String b;

    /* compiled from: CommunityAppButtonItemModel.kt */
    public static final class a extends wrg {
        public final String c;
        public final String d;
        public final UserId e;
        public final UserId f;

        public a(UserId userId, UserId userId2, String str, String str2) {
            super(str);
            this.c = str;
            this.d = str2;
            this.e = userId;
            this.f = userId2;
        }

        @Override // xsna.wrg
        public final String a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            int hashCode = this.c.hashCode() * 31;
            String str = this.d;
            return Long.hashCode(this.f.b) + bh10.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppButton(title=");
            sb.append(this.c);
            sb.append(", imageUrl=");
            sb.append(this.d);
            sb.append(", uid=");
            sb.append(this.e);
            sb.append(", appId=");
            return gp.b(sb, this.f, ')');
        }
    }

    /* compiled from: CommunityAppButtonItemModel.kt */
    public static final class b extends wrg {
        public final String c;
        public final String d;
        public final int e;

        public b(String str, String str2) {
            super(str);
            this.c = str;
            this.d = str2;
            this.e = R.drawable.vk_icon_message_text_outline_20;
        }

        @Override // xsna.wrg
        public final String a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && this.e == bVar.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + urd0.a(this.c.hashCode() * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SimpleButton(title=");
            sb.append(this.c);
            sb.append(", url=");
            sb.append(this.d);
            sb.append(", imageRes=");
            return vu5.b(sb, this.e, ')');
        }
    }

    public wrg(String str) {
        this.b = str;
    }

    public String a() {
        return this.b;
    }
}
