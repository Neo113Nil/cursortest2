package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class dkp0 implements pre {
    public final String a;
    public final ArrayList b;
    public final x2s c;

    public dkp0(x2s x2sVar, String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        this.c = x2sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkp0)) {
            return false;
        }
        dkp0 dkp0Var = (dkp0) obj;
        return jl40.l(this.a, dkp0Var.a) && this.b.equals(dkp0Var.b) && this.c.equals(dkp0Var.c);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "scrollable-items";
    }

    public final int hashCode() {
        return this.c.hashCode() + ly3.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder m = x4e.m("ScrollableItemsRemoteCoreWidget(id=", this.a, ", items=", ", analyticsData=", this.b);
        m.append(this.c);
        m.append(Extension.C_BRAKE);
        return m.toString();
    }
}
