package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ky3 implements oy3 {
    public final YbButtonViewGroup.b a;
    public final iy3 b;
    public final Text.Constant c;
    public final vrc d;
    public final stz0 e;
    public final ArrayList f;
    public final jy3 g;
    public final l24 h;
    public final tgq0 i;

    public ky3(YbButtonViewGroup.b bVar, iy3 iy3Var, Text.Constant constant, vrc vrcVar, stz0 stz0Var, ArrayList arrayList, jy3 jy3Var, l24 l24Var, tgq0 tgq0Var) {
        this.a = bVar;
        this.b = iy3Var;
        this.c = constant;
        this.d = vrcVar;
        this.e = stz0Var;
        this.f = arrayList;
        this.g = jy3Var;
        this.h = l24Var;
        this.i = tgq0Var;
    }

    public final YbButtonViewGroup.b a() {
        return this.a;
    }

    public final iy3 b() {
        return this.b;
    }

    public final List c() {
        return this.f;
    }

    public final vrc d() {
        return this.d;
    }

    public final tgq0 e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky3)) {
            return false;
        }
        ky3 ky3Var = (ky3) obj;
        return this.a.equals(ky3Var.a) && jl40.l(this.b, ky3Var.b) && this.c.equals(ky3Var.c) && jl40.l(this.d, ky3Var.d) && this.e.equals(ky3Var.e) && this.f.equals(ky3Var.f) && this.g.equals(ky3Var.g) && jl40.l(this.h, ky3Var.h) && this.i.equals(ky3Var.i);
    }

    public final jy3 f() {
        return this.g;
    }

    public final l24 g() {
        return this.h;
    }

    public final stz0 h() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        iy3 iy3Var = this.b;
        int d = xvz.d(this.c, (hashCode + (iy3Var == null ? 0 : iy3Var.hashCode())) * 31, 31);
        vrc vrcVar = this.d;
        int hashCode2 = (this.g.hashCode() + ly3.b((this.e.hashCode() + ((d + (vrcVar == null ? 0 : vrcVar.hashCode())) * 31)) * 31, 31, this.f)) * 31;
        l24 l24Var = this.h;
        return this.i.hashCode() + ((hashCode2 + (l24Var != null ? l24Var.hashCode() : 0)) * 31);
    }

    public final Text i() {
        return this.c;
    }

    public final String toString() {
        return "Content(buttons=" + this.a + ", divData=" + this.b + ", triviaText=" + this.c + ", instructions=" + this.d + ", toolbarState=" + this.e + ", frequencyOptions=" + this.f + ", sourceButtonState=" + this.g + ", summaryWidgetState=" + this.h + ", selectedFrequencyOption=" + this.i + Extension.C_BRAKE;
    }
}
