package xsna;

import com.vk.profile.design.compose.user.ViewType;
import com.vkontakte.android.R;

/* compiled from: UserProfileFriendsBlockDataHelper.kt */
/* loaded from: classes5.dex */
public final class upq0 {

    /* compiled from: UserProfileFriendsBlockDataHelper.kt */
    public static final class a {
        public final s8u0 a;
        public final s8u0 b;
        public final Integer c;
        public final ViewType d;
        public final boolean e;

        public a(s8u0 s8u0Var, s8u0 s8u0Var2, ViewType viewType, boolean z, int i) {
            Integer valueOf = Integer.valueOf(R.drawable.vk_icon_user_add_outline_24);
            s8u0Var2 = (i & 2) != 0 ? null : s8u0Var2;
            valueOf = (i & 4) != 0 ? null : valueOf;
            viewType = (i & 8) != 0 ? ViewType.ONE_LINE : viewType;
            z = (i & 16) != 0 ? true : z;
            this.a = s8u0Var;
            this.b = s8u0Var2;
            this.c = valueOf;
            this.d = viewType;
            this.e = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            s8u0 s8u0Var = this.b;
            int hashCode2 = (hashCode + (s8u0Var == null ? 0 : s8u0Var.hashCode())) * 31;
            Integer num = this.c;
            return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FriendsBlockData(firstLineText=");
            sb.append(this.a);
            sb.append(", secondLineText=");
            sb.append(this.b);
            sb.append(", icon=");
            sb.append(this.c);
            sb.append(", paddingBetweenText=");
            sb.append(this.d);
            sb.append(", clickable=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }
}
