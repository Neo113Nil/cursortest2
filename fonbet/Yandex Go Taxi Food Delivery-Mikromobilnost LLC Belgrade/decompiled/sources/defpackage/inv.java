package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseStatusTypeDto;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseTypeDto;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class inv implements gov {
    public static final hnv Companion = new hnv();
    public static final i3y[] f;
    public final String a;
    public final PurchaseTypeDto b;
    public final PurchaseStatusTypeDto c;
    public final String d;
    public final String e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, a.b(lazyThreadSafetyMode, new smv(10)), a.b(lazyThreadSafetyMode, new smv(11)), null, null};
    }

    public /* synthetic */ inv(int i, String str, PurchaseTypeDto purchaseTypeDto, PurchaseStatusTypeDto purchaseStatusTypeDto, String str2, String str3) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, gnv.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = purchaseTypeDto;
        this.c = purchaseStatusTypeDto;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof inv)) {
            return false;
        }
        inv invVar = (inv) obj;
        return jl40.l(this.a, invVar.a) && this.b == invVar.b && this.c == invVar.c && jl40.l(this.d, invVar.d) && jl40.l(this.e, invVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PurchaseProductResult(trackId=");
        sb.append(this.a);
        sb.append(", purchaseType=");
        sb.append(this.b);
        sb.append(", status=");
        sb.append(this.c);
        sb.append(", errorType=");
        sb.append(this.d);
        sb.append(", errorMessage=");
        return b64.p(sb, this.e, ')');
    }

    public inv(String str, PurchaseTypeDto purchaseTypeDto, PurchaseStatusTypeDto purchaseStatusTypeDto, String str2) {
        this.a = str;
        this.b = purchaseTypeDto;
        this.c = purchaseStatusTypeDto;
        this.d = str2;
        this.e = null;
    }
}
