package xsna;

import com.vk.avatar.api.border.AvatarBorderType;

/* compiled from: VkFeedAvatarStateUiModel.kt */
/* loaded from: classes18.dex */
public final class vtu0 {
    public final String a;
    public final AvatarBorderType b;
    public final boolean c;
    public final o9r0 d;
    public final int e;
    public final boolean f;

    public vtu0(String str, AvatarBorderType avatarBorderType, boolean z, o9r0 o9r0Var, int i, boolean z2) {
        this.a = str;
        this.b = avatarBorderType;
        this.c = z;
        this.d = o9r0Var;
        this.e = i;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vtu0)) {
            return false;
        }
        vtu0 vtu0Var = (vtu0) obj;
        return epx.f(this.a, vtu0Var.a) && this.b == vtu0Var.b && this.c == vtu0Var.c && epx.f(this.d, vtu0Var.d) && this.e == vtu0Var.e && this.f == vtu0Var.f;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.f) + shy.a(this.e, (this.d.hashCode() + qoy.b((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.c)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkFeedAvatarStateUiModel(url=");
        sb.append(this.a);
        sb.append(", avatarBorderType=");
        sb.append(this.b);
        sb.append(", isStoryBorderVisible=");
        sb.append(this.c);
        sb.append(", borderParams=");
        sb.append(this.d);
        sb.append(", fixedSize=");
        sb.append(this.e);
        sb.append(", hasLiveBadge=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
