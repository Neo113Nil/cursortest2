package xsna;

import com.vk.dto.common.Image;
import com.vk.ecomm.categories.api.MarketBridgeCategory;

/* compiled from: MarketCategoryListItem.kt */
/* loaded from: classes18.dex */
public final class vv00 implements hfz {
    public final int b;
    public final String c;
    public final Image d;
    public final int e;
    public final boolean f;
    public final izs<vv00, s3q0> g;
    public final MarketBridgeCategory h;

    /* JADX WARN: Multi-variable type inference failed */
    public vv00(int i, String str, Image image, int i2, boolean z, izs<? super vv00, s3q0> izsVar, MarketBridgeCategory marketBridgeCategory) {
        this.b = i;
        this.c = str;
        this.d = image;
        this.e = i2;
        this.f = z;
        this.g = izsVar;
        this.h = marketBridgeCategory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv00)) {
            return false;
        }
        vv00 vv00Var = (vv00) obj;
        return this.b == vv00Var.b && epx.f(this.c, vv00Var.c) && epx.f(this.d, vv00Var.d) && this.e == vv00Var.e && this.f == vv00Var.f && epx.f(this.g, vv00Var.g) && epx.f(this.h, vv00Var.h);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b);
    }

    public final int hashCode() {
        int a = urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
        Image image = this.d;
        int b = qoy.b(shy.a(this.e, (a + (image == null ? 0 : image.hashCode())) * 31, 31), 31, this.f);
        izs<vv00, s3q0> izsVar = this.g;
        return this.h.hashCode() + ((b + (izsVar != null ? izsVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "MarketCategoryListItem(id=" + this.b + ", name=" + this.c + ", icon=" + this.d + ", depth=" + this.e + ", isPicked=" + this.f + ", onClickListener=" + this.g + ", originalCategory=" + this.h + ')';
    }
}
