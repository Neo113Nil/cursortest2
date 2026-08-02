package xsna;

import com.vk.core.view.components.button.VkButton;
import xsna.tlo0;

/* compiled from: VkFeedCarouselCard.kt */
/* loaded from: classes18.dex */
public final class xtu0 {
    public final tlo0.h a;
    public final tbe0 b;
    public final boolean c;
    public final gko d;
    public final VkButton.Size e;
    public final VkButton.Mode f;
    public final VkButton.Appearance g;
    public final tlo0.h h;

    public xtu0() {
        throw null;
    }

    public xtu0(tlo0.h hVar, tbe0 tbe0Var, boolean z, gko gkoVar, VkButton.Size size, VkButton.Mode mode, VkButton.Appearance appearance, tlo0.h hVar2) {
        this.a = hVar;
        this.b = tbe0Var;
        this.c = z;
        this.d = gkoVar;
        this.e = size;
        this.f = mode;
        this.g = appearance;
        this.h = hVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtu0)) {
            return false;
        }
        xtu0 xtu0Var = (xtu0) obj;
        return epx.f(this.a, xtu0Var.a) && epx.f(this.b, xtu0Var.b) && this.c == xtu0Var.c && epx.f(this.d, xtu0Var.d) && this.e == xtu0Var.e && this.f == xtu0Var.f && this.g == xtu0Var.g && epx.f(this.h, xtu0Var.h);
    }

    public final int hashCode() {
        int b = qoy.b((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31, 31, this.c);
        gko gkoVar = this.d;
        int hashCode = (b + (gkoVar == null ? 0 : Integer.hashCode(gkoVar.a))) * 31;
        VkButton.Size size = this.e;
        int hashCode2 = (hashCode + (size == null ? 0 : size.hashCode())) * 31;
        VkButton.Mode mode = this.f;
        int hashCode3 = (hashCode2 + (mode == null ? 0 : mode.hashCode())) * 31;
        VkButton.Appearance appearance = this.g;
        int hashCode4 = (hashCode3 + (appearance == null ? 0 : appearance.hashCode())) * 31;
        tlo0.h hVar = this.h;
        return hashCode4 + (hVar != null ? hVar.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bottom(title=");
        sb.append(this.a);
        sb.append(", onClick=");
        sb.append(this.b);
        sb.append(", isLoading=");
        sb.append(this.c);
        sb.append(", trailingIcon=");
        sb.append(this.d);
        sb.append(", size=");
        sb.append(this.e);
        sb.append(", mode=");
        sb.append(this.f);
        sb.append(", appearance=");
        sb.append(this.g);
        sb.append(", contentDescription=");
        return jq.c(sb, this.h, ')');
    }
}
