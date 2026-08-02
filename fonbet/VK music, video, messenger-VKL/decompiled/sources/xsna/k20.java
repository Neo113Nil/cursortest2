package xsna;

import com.vk.dto.common.Image;
import com.vk.ecomm.design.view.productattaches.large.SnippetLiveStatus;

/* compiled from: ClipCarouselAttachUiDto.kt */
/* loaded from: classes18.dex */
public final class k20 implements omc {
    public final String a;
    public final String b;
    public final String c;
    public final Image d;
    public final String e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final SnippetLiveStatus i;

    public k20(String str, String str2, String str3, Image image, String str4, int i, boolean z, boolean z2, SnippetLiveStatus snippetLiveStatus) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = image;
        this.e = str4;
        this.f = i;
        this.g = z;
        this.h = z2;
        this.i = snippetLiveStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k20)) {
            return false;
        }
        k20 k20Var = (k20) obj;
        return epx.f(this.a, k20Var.a) && epx.f(this.b, k20Var.b) && epx.f(this.c, k20Var.c) && epx.f(this.d, k20Var.d) && epx.f(this.e, k20Var.e) && this.f == k20Var.f && this.g == k20Var.g && this.h == k20Var.h && this.i == k20Var.i;
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Image image = this.d;
        int hashCode = (a + (image == null ? 0 : image.hashCode())) * 31;
        String str = this.e;
        int b = qoy.b(qoy.b(shy.a(this.f, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.g), 31, this.h);
        SnippetLiveStatus snippetLiveStatus = this.i;
        return b + (snippetLiveStatus != null ? snippetLiveStatus.hashCode() : 0);
    }

    public final String toString() {
        return "ActionLinkSnippetClipAttachUiDto(snippetId=" + this.a + ", title=" + this.b + ", description=" + this.c + ", image=" + this.d + ", openTitle=" + this.e + ", marginStart=" + this.f + ", isDarkBackground=" + this.g + ", isCompactCarousel=" + this.h + ", liveStatus=" + this.i + ')';
    }
}
