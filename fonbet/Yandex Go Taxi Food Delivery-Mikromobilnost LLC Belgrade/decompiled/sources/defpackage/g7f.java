package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class g7f {
    public final gtb1 a;
    public final Text b;
    public final int c;
    public final nwb0 d;
    public final nwb0 e;
    public final vju f;
    public final boolean g;
    public final yis h;

    public g7f(gtb1 gtb1Var, Text text, int i, nwb0 nwb0Var, nwb0 nwb0Var2, vju vjuVar, boolean z, yis yisVar) {
        this.a = gtb1Var;
        this.b = text;
        this.c = i;
        this.d = nwb0Var;
        this.e = nwb0Var2;
        this.f = vjuVar;
        this.g = z;
        this.h = yisVar;
    }

    public final yis a() {
        return this.h;
    }

    public final vju b() {
        return this.f;
    }

    public final int c() {
        return this.c;
    }

    public final nwb0 d() {
        return this.d;
    }

    public final nwb0 e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7f)) {
            return false;
        }
        g7f g7fVar = (g7f) obj;
        return jl40.l(this.a, g7fVar.a) && jl40.l(this.b, g7fVar.b) && this.c == g7fVar.c && this.d.equals(g7fVar.d) && this.e.equals(g7fVar.e) && this.f.equals(g7fVar.f) && this.g == g7fVar.g && this.h.equals(g7fVar.h);
    }

    public final gtb1 f() {
        return this.a;
    }

    public final boolean g() {
        return this.g;
    }

    public final Text h() {
        return this.b;
    }

    public final int hashCode() {
        return this.h.hashCode() + unr0.e((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + oyr.b(this.c, n.c(this.b, this.a.hashCode() * 31, 31), 31)) * 31)) * 31)) * 31, 31, this.g);
    }

    public final String toString() {
        return "CreatePinViewState(screenStateCreate=" + this.a + ", toolbarTitle=" + this.b + ", pageToOpen=" + this.c + ", pinInputFirst=" + this.d + ", pinInputSecond=" + this.e + ", hintState=" + this.f + ", shouldShowProgressBar=" + this.g + ", fullScreenError=" + this.h + Extension.C_BRAKE;
    }
}
