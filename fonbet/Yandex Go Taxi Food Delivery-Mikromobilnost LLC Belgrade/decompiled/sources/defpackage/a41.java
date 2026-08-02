package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class a41 {
    public static final a41 h = new a41(new c7p(false, 2), new c7p(false, 2), new c7p(false, 2), new z2e(14, false, false, false), new q330(false, false, 2), new c7p(false, 2), new ymb0(14));
    public final c7p a;
    public final c7p b;
    public final c7p c;
    public final z2e d;
    public final q330 e;
    public final c7p f;
    public final ymb0 g;

    public /* synthetic */ a41(int i) {
        this(new c7p(false, 2), new c7p(false, 3), new c7p(false, 3), new z2e(15, false, false, false), new q330(true, false, 2), new c7p(false, 3), new ymb0(15));
    }

    public static a41 a(a41 a41Var, c7p c7pVar, c7p c7pVar2, c7p c7pVar3, z2e z2eVar, q330 q330Var, c7p c7pVar4, ymb0 ymb0Var, int i) {
        if ((i & 1) != 0) {
            c7pVar = a41Var.a;
        }
        c7p c7pVar5 = c7pVar;
        if ((i & 2) != 0) {
            c7pVar2 = a41Var.b;
        }
        c7p c7pVar6 = c7pVar2;
        if ((i & 4) != 0) {
            c7pVar3 = a41Var.c;
        }
        c7p c7pVar7 = c7pVar3;
        if ((i & 8) != 0) {
            z2eVar = a41Var.d;
        }
        z2e z2eVar2 = z2eVar;
        if ((i & 16) != 0) {
            q330Var = a41Var.e;
        }
        q330 q330Var2 = q330Var;
        if ((i & 32) != 0) {
            c7pVar4 = a41Var.f;
        }
        c7p c7pVar8 = c7pVar4;
        if ((i & 64) != 0) {
            ymb0Var = a41Var.g;
        }
        a41Var.getClass();
        return new a41(c7pVar5, c7pVar6, c7pVar7, z2eVar2, q330Var2, c7pVar8, ymb0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a41)) {
            return false;
        }
        a41 a41Var = (a41) obj;
        return jl40.l(this.a, a41Var.a) && jl40.l(this.b, a41Var.b) && jl40.l(this.c, a41Var.c) && jl40.l(this.d, a41Var.d) && jl40.l(this.e, a41Var.e) && jl40.l(this.f, a41Var.f) && jl40.l(this.g, a41Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AddressMapUiState(backButtonUiState=" + this.a + ", locationButtonUiState=" + this.b + ", panoramaButtonUiState=" + this.c + ", confirmButtonUiState=" + this.d + ", modalViewUiState=" + this.e + ", menuButtonUiState=" + this.f + ", pickupFromPhotoButtonUiState=" + this.g + Extension.C_BRAKE;
    }

    public a41(c7p c7pVar, c7p c7pVar2, c7p c7pVar3, z2e z2eVar, q330 q330Var, c7p c7pVar4, ymb0 ymb0Var) {
        this.a = c7pVar;
        this.b = c7pVar2;
        this.c = c7pVar3;
        this.d = z2eVar;
        this.e = q330Var;
        this.f = c7pVar4;
        this.g = ymb0Var;
    }

    public a41() {
        this(0);
    }
}
