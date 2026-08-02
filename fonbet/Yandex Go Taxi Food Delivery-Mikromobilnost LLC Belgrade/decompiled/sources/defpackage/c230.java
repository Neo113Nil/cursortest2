package defpackage;

import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class c230 implements e230 {
    public static final /* synthetic */ int e = 0;
    public final boolean a;
    public final int b;
    public final sls c;
    public final i3y d;

    public /* synthetic */ c230(int i) {
        this((i & 2) == 0 ? 112 : 0, new sq20(24), (i & 1) == 0);
    }

    @Override // defpackage.e230
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.e230
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c230)) {
            return false;
        }
        c230 c230Var = (c230) obj;
        return this.a == c230Var.a && this.b == c230Var.b && jl40.l(this.c, c230Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return ly3.r(xvz.p("Standard(handleIme=", this.b, ", consume=", ", contentViewProvider=", this.a), this.c, Extension.C_BRAKE);
    }

    public c230(int i, sls slsVar, boolean z) {
        this.a = z;
        this.b = i;
        this.c = slsVar;
        this.d = a.a(new csz(6, this));
    }

    public c230() {
        this(7);
    }

    public c230(boolean z) {
        this(0, new um20(15), z);
    }
}
