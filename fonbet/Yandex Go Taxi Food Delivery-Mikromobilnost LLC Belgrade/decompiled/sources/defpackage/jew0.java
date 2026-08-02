package defpackage;

import com.yandex.go.dto.response.q1;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class jew0 implements kew0 {
    public final z2f0 a;
    public final CharSequence b;
    public final q1 c;
    public final ArrayList d;
    public final ArrayList e;
    public final iew0 f;
    public final tdw0 g;
    public final boolean h;

    public jew0(z2f0 z2f0Var, CharSequence charSequence, q1 q1Var, ArrayList arrayList, ArrayList arrayList2, iew0 iew0Var, tdw0 tdw0Var, boolean z) {
        this.a = z2f0Var;
        this.b = charSequence;
        this.c = q1Var;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = iew0Var;
        this.g = tdw0Var;
        this.h = z;
    }

    @Override // defpackage.kew0
    public final boolean a() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jew0)) {
            return false;
        }
        jew0 jew0Var = (jew0) obj;
        return jl40.l(this.a, jew0Var.a) && jl40.l(this.b, jew0Var.b) && jl40.l(this.c, jew0Var.c) && this.d.equals(jew0Var.d) && this.e.equals(jew0Var.e) && jl40.l(this.f, jew0Var.f) && jl40.l(this.g, jew0Var.g) && this.h == jew0Var.h;
    }

    @Override // defpackage.kew0
    public final tdw0 getMode() {
        return this.g;
    }

    public final int hashCode() {
        z2f0 z2f0Var = this.a;
        int hashCode = (z2f0Var == null ? 0 : z2f0Var.hashCode()) * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        q1 q1Var = this.c;
        int b = ly3.b(ly3.b((hashCode2 + (q1Var == null ? 0 : q1Var.hashCode())) * 31, 31, this.d), 31, this.e);
        iew0 iew0Var = this.f;
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((b + (iew0Var != null ? iew0Var.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Visible(title=" + this.a + ", subtitle=" + ((Object) this.b) + ", action=" + this.c + ", leadButtons=" + this.d + ", trailButtons=" + this.e + ", collapsedButton=" + this.f + ", mode=" + this.g + ", isHapticEnabled=" + this.h + Extension.C_BRAKE;
    }
}
