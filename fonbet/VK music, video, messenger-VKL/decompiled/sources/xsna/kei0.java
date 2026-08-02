package xsna;

import com.vk.dto.common.Image;
import com.vk.ecomm.core.models.product.ProductPrice;
import com.vk.ecomm.products_selection.api.model.SelectionProductId;
import java.util.List;

/* compiled from: SelectionProduct.kt */
/* loaded from: classes18.dex */
public final class kei0 {
    public final SelectionProductId a;
    public final String b;
    public final ProductPrice c;
    public final c530 d;
    public final boolean e;
    public final Image f;
    public final List<Image> g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final String k;

    public kei0(SelectionProductId selectionProductId, String str, ProductPrice productPrice, c530 c530Var, boolean z, Image image, List<Image> list, boolean z2, boolean z3, String str2, String str3) {
        this.a = selectionProductId;
        this.b = str;
        this.c = productPrice;
        this.d = c530Var;
        this.e = z;
        this.f = image;
        this.g = list;
        this.h = z2;
        this.i = z3;
        this.j = str2;
        this.k = str3;
    }

    public static kei0 a(kei0 kei0Var, boolean z, int i) {
        SelectionProductId selectionProductId = kei0Var.a;
        String str = kei0Var.b;
        ProductPrice productPrice = kei0Var.c;
        c530 c530Var = kei0Var.d;
        boolean z2 = kei0Var.e;
        Image image = kei0Var.f;
        List<Image> list = kei0Var.g;
        if ((i & 128) != 0) {
            z = kei0Var.h;
        }
        return new kei0(selectionProductId, str, productPrice, c530Var, z2, image, list, z, kei0Var.i, kei0Var.j, kei0Var.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kei0)) {
            return false;
        }
        kei0 kei0Var = (kei0) obj;
        return epx.f(this.a, kei0Var.a) && epx.f(this.b, kei0Var.b) && epx.f(this.c, kei0Var.c) && epx.f(this.d, kei0Var.d) && this.e == kei0Var.e && epx.f(this.f, kei0Var.f) && epx.f(this.g, kei0Var.g) && this.h == kei0Var.h && this.i == kei0Var.i && epx.f(this.j, kei0Var.j) && epx.f(this.k, kei0Var.k);
    }

    public final int hashCode() {
        int b = qoy.b((this.d.hashCode() + ((this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e);
        Image image = this.f;
        int hashCode = (b + (image == null ? 0 : image.hashCode())) * 31;
        List<Image> list = this.g;
        int b2 = qoy.b(qoy.b((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.h), 31, this.i);
        String str = this.j;
        int hashCode2 = (b2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionProduct(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", price=");
        sb.append(this.c);
        sb.append(", moderationItem=");
        sb.append(this.d);
        sb.append(", isRejectInProgress=");
        sb.append(this.e);
        sb.append(", thumbImage=");
        sb.append(this.f);
        sb.append(", thumbImages=");
        sb.append(this.g);
        sb.append(", isFave=");
        sb.append(this.h);
        sb.append(", isAvailable=");
        sb.append(this.i);
        sb.append(", link=");
        sb.append(this.j);
        sb.append(", trackCode=");
        return ho8.a(sb, this.k, ')');
    }
}
