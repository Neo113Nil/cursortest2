package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ckp0 extends n351 {
    public final List c;
    public final x2s d;
    public final String e;

    public ckp0(List list, x2s x2sVar, String str) {
        super("scrollable-items", false, 14);
        this.c = list;
        this.d = x2sVar;
        this.e = str;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckp0)) {
            return false;
        }
        ckp0 ckp0Var = (ckp0) obj;
        return jl40.l(this.c, ckp0Var.c) && this.d.equals(ckp0Var.d) && jl40.l(this.e, ckp0Var.e);
    }

    public final int hashCode() {
        int a = tse0.a(this.d, this.c.hashCode() * 31, 31);
        String str = this.e;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollableItemsModel(items=");
        sb.append(this.c);
        sb.append(", onShownAnalyticsData=");
        sb.append(this.d);
        sb.append(", id=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
