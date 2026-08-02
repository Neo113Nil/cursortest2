package xsna;

import com.vk.core.compose.generated.VkColorToken;

/* compiled from: TopshelfCardConfig.kt */
/* loaded from: classes2.dex */
public final class kbp0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final frv0 f;
    public final frv0 g;
    public final frv0 h;
    public final VkColorToken i;
    public final VkColorToken j;
    public final boolean k;
    public final float l;

    public kbp0(float f, float f2, float f3, float f4, float f5, xa4 xa4Var, frv0 frv0Var, frv0 frv0Var2, frv0 frv0Var3, VkColorToken vkColorToken, VkColorToken vkColorToken2, boolean z, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = frv0Var;
        this.g = frv0Var2;
        this.h = frv0Var3;
        this.i = vkColorToken;
        this.j = vkColorToken2;
        this.k = z;
        this.l = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbp0)) {
            return false;
        }
        kbp0 kbp0Var = (kbp0) obj;
        return pco.b(this.a, kbp0Var.a) && pco.b(this.b, kbp0Var.b) && pco.b(this.c, kbp0Var.c) && pco.b(this.d, kbp0Var.d) && pco.b(this.e, kbp0Var.e) && epx.f(null, null) && this.f.equals(kbp0Var.f) && this.g.equals(kbp0Var.g) && this.h.equals(kbp0Var.h) && this.i == kbp0Var.i && this.j == kbp0Var.j && this.k == kbp0Var.k && Float.compare(this.l, kbp0Var.l) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.l) + qoy.b((this.j.hashCode() + ((this.i.hashCode() + bjl0.a(this.h, bjl0.a(this.g, bjl0.a(this.f, (io.reactivex.rxjava3.subjects.b.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31) + 0) * 31, 31), 31), 31)) * 31)) * 31, 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopshelfCardTextAppearance(titlePictureSize=");
        oq.f(this.a, ", titlePictureSpacing=", sb);
        oq.f(this.b, ", titleSubtitleSpacing=", sb);
        oq.f(this.c, ", subtitleMetaInfoSpacing=", sb);
        oq.f(this.d, ", metaInfoSpacing=", sb);
        oq.f(this.e, ", metaBadgeOverlay=", sb);
        sb.append((Object) null);
        sb.append(", titleStyle=");
        sb.append(this.f);
        sb.append(", subtitleStyle=");
        sb.append(this.g);
        sb.append(", metaStyle=");
        sb.append(this.h);
        sb.append(", textColor=");
        sb.append(this.i);
        sb.append(", secondaryTextColor=");
        sb.append(this.j);
        sb.append(", textFadeEnabled=");
        sb.append(this.k);
        sb.append(", secondaryTextAlpha=");
        return xq.c(')', this.l, sb);
    }
}
