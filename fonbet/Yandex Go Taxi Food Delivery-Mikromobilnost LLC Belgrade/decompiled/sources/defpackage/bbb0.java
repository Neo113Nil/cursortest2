package defpackage;

import com.ybsdk.feature.pfm.internal.ui.viewitems.PfmFilterViewItem$Content$Mode;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class bbb0 extends dbb0 {
    public final boolean c;
    public final String d;
    public final rbv e;
    public final bdb0 f;
    public final PfmFilterViewItem$Content$Mode g;

    public bbb0(boolean z, String str, rbv rbvVar, bdb0 bdb0Var, PfmFilterViewItem$Content$Mode pfmFilterViewItem$Content$Mode) {
        super(str, 2);
        this.c = z;
        this.d = str;
        this.e = rbvVar;
        this.f = bdb0Var;
        this.g = pfmFilterViewItem$Content$Mode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbb0)) {
            return false;
        }
        bbb0 bbb0Var = (bbb0) obj;
        return this.c == bbb0Var.c && this.d.equals(bbb0Var.d) && jl40.l(this.e, bbb0Var.e) && this.f.equals(bbb0Var.f) && this.g == bbb0Var.g;
    }

    public final int hashCode() {
        int b = unr0.b(Boolean.hashCode(this.c) * 31, 31, this.d);
        rbv rbvVar = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((b + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = ly3.v("Content(selected=", ", pfmFilterId=", tab0.a(this.d), ", icon=", this.c);
        v.append(this.e);
        v.append(", title=");
        v.append(this.f);
        v.append(", mode=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
