package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class mru implements pre {
    public final String a;
    public final ArrayList b;
    public final o690 c;
    public final int d;
    public final String e;
    public final Object f;

    public mru(String str, ArrayList arrayList, o690 o690Var, int i, String str2, Object obj) {
        this.a = str;
        this.b = arrayList;
        this.c = o690Var;
        this.d = i;
        this.e = str2;
        this.f = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mru)) {
            return false;
        }
        mru mruVar = (mru) obj;
        return jl40.l(this.a, mruVar.a) && this.b.equals(mruVar.b) && this.c.equals(mruVar.c) && this.d == mruVar.d && jl40.l(this.e, mruVar.e) && jl40.l(this.f, mruVar.f);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "horizontal-stack";
    }

    public final int hashCode() {
        int b = oyr.b(this.d, (this.c.hashCode() + ly3.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31);
        String str = this.e;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.f;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = x4e.m("HorizontalStackRemoteCoreWidget(id=", this.a, ", items=", ", horizontalPaddings=", this.b);
        m.append(this.c);
        m.append(", spacingWidth=");
        m.append(this.d);
        m.append(", metricaLabel=");
        return tse0.l(m, this.e, ", meta=", this.f, Extension.C_BRAKE);
    }
}
