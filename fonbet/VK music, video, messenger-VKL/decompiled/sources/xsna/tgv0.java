package xsna;

import android.text.TextUtils;
import com.vk.core.view.components.userstack.VkUserStack;
import java.util.List;

/* compiled from: VkRichCell.kt */
/* loaded from: classes17.dex */
public interface tgv0 {

    /* compiled from: VkRichCell.kt */
    public static final class a implements tgv0 {
        public final List<ayv0> a;
        public final Integer b;
        public final tlo0 c;
        public final int d;
        public final TextUtils.TruncateAt e;
        public final VkUserStack.Size f;
        public final VkUserStack.AvatarsPosition g;

        public a() {
            throw null;
        }

        public a(List list, Integer num, tlo0 tlo0Var, VkUserStack.Size size, VkUserStack.AvatarsPosition avatarsPosition, int i) {
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            num = (i & 2) != 0 ? null : num;
            tlo0Var = (i & 4) != 0 ? null : tlo0Var;
            int i2 = (i & 8) != 0 ? Integer.MAX_VALUE : 1;
            truncateAt = (i & 16) != 0 ? null : truncateAt;
            size = (i & 32) != 0 ? VkUserStack.Size.Medium : size;
            avatarsPosition = (i & 64) != 0 ? VkUserStack.AvatarsPosition.Left : avatarsPosition;
            this.a = list;
            this.b = num;
            this.c = tlo0Var;
            this.d = i2;
            this.e = truncateAt;
            this.f = size;
            this.g = avatarsPosition;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            tlo0 tlo0Var = this.c;
            int a = shy.a(this.d, (hashCode2 + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31, 31);
            TextUtils.TruncateAt truncateAt = this.e;
            return this.g.hashCode() + ((this.f.hashCode() + ((a + (truncateAt != null ? truncateAt.hashCode() : 0)) * 31)) * 31);
        }

        public final String toString() {
            return "UserStack(avatars=" + this.a + ", count=" + this.b + ", text=" + this.c + ", maxLines=" + this.d + ", overflow=" + this.e + ", size=" + this.f + ", avatarsPosition=" + this.g + ')';
        }
    }
}
