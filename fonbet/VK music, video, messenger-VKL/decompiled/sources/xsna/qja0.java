package xsna;

import com.vk.profile.design.compose.header.AuthorHeaderConfig;

/* compiled from: AuthorHeaderHeaderContent.kt */
/* loaded from: classes5.dex */
public final class qja0 {
    public final com.vk.profile.design.compose.header.a a;
    public final com.vk.profile.design.compose.header.b b;
    public final boolean c;
    public final AuthorHeaderConfig.Author.AuthorType d;
    public final boolean e;
    public final ja5 f;
    public final lja0 g;
    public final float h;

    public qja0(com.vk.profile.design.compose.header.a aVar, com.vk.profile.design.compose.header.b bVar, boolean z, AuthorHeaderConfig.Author.AuthorType authorType, boolean z2, ja5 ja5Var, lja0 lja0Var, float f) {
        this.a = aVar;
        this.b = bVar;
        this.c = z;
        this.d = authorType;
        this.e = z2;
        this.f = ja5Var;
        this.g = lja0Var;
        this.h = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qja0)) {
            return false;
        }
        qja0 qja0Var = (qja0) obj;
        return this.a.equals(qja0Var.a) && epx.f(this.b, qja0Var.b) && this.c == qja0Var.c && this.d == qja0Var.d && this.e == qja0Var.e && epx.f(this.f, qja0Var.f) && epx.f(this.g, qja0Var.g) && pco.b(this.h, qja0Var.h);
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + qoy.b((this.d.hashCode() + qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31, 31, this.e)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PictureContentParams(avatar=");
        sb.append(this.a);
        sb.append(", cover=");
        sb.append(this.b);
        sb.append(", isHeaderExpanded=");
        sb.append(this.c);
        sb.append(", authorType=");
        sb.append(this.d);
        sb.append(", isAdmin=");
        sb.append(this.e);
        sb.append(", mediaPagerState=");
        sb.append(this.f);
        sb.append(", pictureClickExcludedBounds=");
        sb.append(this.g);
        sb.append(", picturePaneHeightDp=");
        return ir.f(')', this.h, sb);
    }
}
