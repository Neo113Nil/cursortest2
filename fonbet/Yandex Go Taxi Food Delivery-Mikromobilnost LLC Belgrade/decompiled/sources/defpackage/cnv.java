package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$PurchaseProductClick$Type;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseTypeDto;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class cnv implements gov {
    public static final anv Companion = new anv();
    public static final i3y[] d;
    public final String a;
    public final PurchaseTypeDto b;
    public final InMessage$PurchaseProductClick$Type c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, a.b(lazyThreadSafetyMode, new smv(4)), a.b(lazyThreadSafetyMode, new smv(5))};
    }

    public /* synthetic */ cnv(int i, String str, PurchaseTypeDto purchaseTypeDto, InMessage$PurchaseProductClick$Type inMessage$PurchaseProductClick$Type) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, zmv.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = purchaseTypeDto;
        this.c = inMessage$PurchaseProductClick$Type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnv)) {
            return false;
        }
        cnv cnvVar = (cnv) obj;
        return jl40.l(this.a, cnvVar.a) && this.b == cnvVar.b && this.c == cnvVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "PurchaseProductClick(trackId=" + this.a + ", purchaseType=" + this.b + ", type=" + this.c + ')';
    }

    public cnv(String str, PurchaseTypeDto purchaseTypeDto, InMessage$PurchaseProductClick$Type inMessage$PurchaseProductClick$Type) {
        this.a = str;
        this.b = purchaseTypeDto;
        this.c = inMessage$PurchaseProductClick$Type;
    }
}
