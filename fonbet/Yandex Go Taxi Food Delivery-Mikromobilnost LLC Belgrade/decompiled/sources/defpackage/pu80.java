package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseTypeDto;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class pu80 implements pw80 {
    public static final ou80 Companion = new ou80();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new yi80(26)), null};
    public final String a;
    public final PurchaseTypeDto b;
    public final String c;

    public /* synthetic */ pu80(int i, String str, PurchaseTypeDto purchaseTypeDto, String str2) {
        if (6 != (i & 6)) {
            qje.Z(i, 6, nu80.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = purchaseTypeDto;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu80)) {
            return false;
        }
        pu80 pu80Var = (pu80) obj;
        return jl40.l(this.a, pu80Var.a) && this.b == pu80Var.b && jl40.l(this.c, pu80Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PurchaseButtonShown(trackId=");
        sb.append(this.a);
        sb.append(", purchaseType=");
        sb.append(this.b);
        sb.append(", productId=");
        return b64.p(sb, this.c, ')');
    }
}
