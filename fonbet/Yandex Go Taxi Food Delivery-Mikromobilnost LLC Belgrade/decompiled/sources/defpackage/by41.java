package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class by41 extends n351 {
    public final ArrayList c;
    public final x2s d;
    public final String e;

    public by41(x2s x2sVar, String str, ArrayList arrayList) {
        super("picker", false, 14);
        this.c = arrayList;
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
        if (!(obj instanceof by41)) {
            return false;
        }
        by41 by41Var = (by41) obj;
        return this.c.equals(by41Var.c) && this.d.equals(by41Var.d) && jl40.l(this.e, by41Var.e);
    }

    public final int hashCode() {
        int a = tse0.a(this.d, this.c.hashCode() * 31, 31);
        String str = this.e;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WheelPickerModel(columns=");
        sb.append(this.c);
        sb.append(", onShownAnalyticsData=");
        sb.append(this.d);
        sb.append(", id=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
