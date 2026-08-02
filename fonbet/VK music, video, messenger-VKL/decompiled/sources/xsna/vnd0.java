package xsna;

import com.vk.dto.common.Image;
import com.vk.ecomm.design.compose.productattaches.ProductVideoAttach;

/* compiled from: ClipCarouselAttachUiDto.kt */
/* loaded from: classes18.dex */
public final class vnd0 implements omc {
    public final long a;
    public final ProductVideoAttach.StatusType b;
    public final Image c;
    public final String d;
    public final ProductVideoAttach.a e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final int j;
    public final String k;

    public vnd0(long j, ProductVideoAttach.StatusType statusType, Image image, String str, ProductVideoAttach.a aVar, String str2, boolean z, boolean z2, String str3, int i, String str4) {
        this.a = j;
        this.b = statusType;
        this.c = image;
        this.d = str;
        this.e = aVar;
        this.f = str2;
        this.g = z;
        this.h = z2;
        this.i = str3;
        this.j = i;
        this.k = str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj instanceof vnd0) {
                vnd0 vnd0Var = (vnd0) obj;
                if (this.a == vnd0Var.a && this.b == vnd0Var.b) {
                    Image image = vnd0Var.c;
                    Image image2 = this.c;
                    if (image2 == null) {
                        if (image == null) {
                            equals = true;
                            if (equals && epx.f(this.d, vnd0Var.d) && epx.f(this.e, vnd0Var.e) && epx.f(this.f, vnd0Var.f) && this.g == vnd0Var.g && this.h == vnd0Var.h && epx.f(this.i, vnd0Var.i) && this.j == vnd0Var.j && epx.f(this.k, vnd0Var.k)) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    } else {
                        if (image != null) {
                            equals = image2.equals(image);
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        Image image = this.c;
        int a = urd0.a((hashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.d);
        ProductVideoAttach.a aVar = this.e;
        int b = qoy.b(qoy.b(urd0.a((a + (aVar == null ? 0 : Integer.hashCode(aVar.a))) * 31, 31, this.f), 31, this.g), 31, this.h);
        String str = this.i;
        int a2 = shy.a(this.j, (b + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.k;
        return a2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductClipAttachUiDto(uid=");
        sb.append((Object) ("VideoAttachItemId(goodId=" + this.a + ')'));
        sb.append(", statusType=");
        sb.append(this.b);
        sb.append(", image=");
        Image image = this.c;
        sb.append((Object) (image == null ? "null" : ProductVideoAttach.b.a(image)));
        sb.append(", price=");
        sb.append(this.d);
        sb.append(", badge=");
        sb.append(this.e);
        sb.append(", name=");
        sb.append(this.f);
        sb.append(", isService=");
        sb.append(this.g);
        sb.append(", isDarkBackground=");
        sb.append(this.h);
        sb.append(", ratingText=");
        sb.append(this.i);
        sb.append(", marginStart=");
        sb.append(this.j);
        sb.append(", actionButtonTitle=");
        return ho8.a(sb, this.k, ')');
    }
}
