package xsna;

import com.vk.avatar.api.border.AvatarBorderType;

/* compiled from: VKAvatarConfig.kt */
/* loaded from: classes15.dex */
public final class u9r0 {
    public final int a;
    public final l9r0 b;
    public final AvatarBorderType c;
    public final cq5 d;
    public final w9r0 e;

    public u9r0(int i, l9r0 l9r0Var, AvatarBorderType avatarBorderType, cq5 cq5Var, w9r0 w9r0Var) {
        this.a = i;
        this.b = l9r0Var;
        this.c = avatarBorderType;
        this.d = cq5Var;
        this.e = w9r0Var;
    }

    public static u9r0 a(u9r0 u9r0Var, cq5 cq5Var) {
        return new u9r0(u9r0Var.a, u9r0Var.b, u9r0Var.c, cq5Var, u9r0Var.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9r0)) {
            return false;
        }
        u9r0 u9r0Var = (u9r0) obj;
        return this.a == u9r0Var.a && epx.f(this.b, u9r0Var.b) && this.c == u9r0Var.c && epx.f(this.d, u9r0Var.d) && epx.f(this.e, u9r0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31)) * 31;
        w9r0 w9r0Var = this.e;
        return hashCode + (w9r0Var == null ? 0 : w9r0Var.hashCode());
    }

    public final String toString() {
        return "VKAvatarConfig(size=" + this.a + ", borderConfig=" + this.b + ", type=" + this.c + ", state=" + this.d + ", cutout=" + this.e + ')';
    }
}
