package xsna;

import com.vk.dto.common.Image;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.PrettyCardAttachment;

/* compiled from: PrettyCardHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class c3d0 {
    public final NewsEntry a;
    public final NewsEntry b;
    public final PrettyCardAttachment c;
    public final PrettyCardAttachment.Card d;
    public final Image e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final int k;

    public c3d0(NewsEntry newsEntry, NewsEntry newsEntry2, PrettyCardAttachment prettyCardAttachment, PrettyCardAttachment.Card card, Image image, String str, String str2, String str3, String str4, int i, int i2) {
        this.a = newsEntry;
        this.b = newsEntry2;
        this.c = prettyCardAttachment;
        this.d = card;
        this.e = image;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = i;
        this.k = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3d0)) {
            return false;
        }
        c3d0 c3d0Var = (c3d0) obj;
        return epx.f(this.a, c3d0Var.a) && epx.f(this.b, c3d0Var.b) && epx.f(this.c, c3d0Var.c) && epx.f(this.d, c3d0Var.d) && epx.f(this.e, c3d0Var.e) && epx.f(this.f, c3d0Var.f) && epx.f(this.g, c3d0Var.g) && epx.f(this.h, c3d0Var.h) && epx.f(this.i, c3d0Var.i) && this.j == c3d0Var.j && this.k == c3d0Var.k;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + e630.b(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        Image image = this.e;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        String str = this.f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        return Integer.hashCode(this.k) + shy.a(this.j, (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrettyCardHolderUiDto(entry=");
        sb.append(this.a);
        sb.append(", rootEntry=");
        sb.append(this.b);
        sb.append(", attachment=");
        sb.append(this.c);
        sb.append(", card=");
        sb.append(this.d);
        sb.append(", image=");
        sb.append(this.e);
        sb.append(", title=");
        sb.append(this.f);
        sb.append(", price=");
        sb.append(this.g);
        sb.append(", oldPrice=");
        sb.append(this.h);
        sb.append(", buttonTitle=");
        sb.append(this.i);
        sb.append(", adsButtonVisibility=");
        sb.append(this.j);
        sb.append(", seqId=");
        return vu5.b(sb, this.k, ')');
    }
}
