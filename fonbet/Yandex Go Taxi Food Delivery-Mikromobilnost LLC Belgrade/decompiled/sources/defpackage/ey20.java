package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ey20 {
    public final tdu a;
    public final List b;
    public final List c;
    public final py6 d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, kotlin.collections.EmptyList] */
    public ey20(tdu tduVar, ArrayList arrayList, py6 py6Var, int i) {
        tduVar = (i & 1) != 0 ? new tdu(null, null, null, null, 15) : tduVar;
        int i2 = i & 2;
        ?? r1 = EmptyList.a;
        arrayList = i2 != 0 ? r1 : arrayList;
        py6Var = (i & 8) != 0 ? null : py6Var;
        this.a = tduVar;
        this.b = arrayList;
        this.c = r1;
        this.d = py6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey20)) {
            return false;
        }
        ey20 ey20Var = (ey20) obj;
        return jl40.l(this.a, ey20Var.a) && jl40.l(this.b, ey20Var.b) && jl40.l(this.c, ey20Var.c) && jl40.l(this.d, ey20Var.d);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        py6 py6Var = this.d;
        return c + (py6Var == null ? 0 : py6Var.hashCode());
    }

    public final String toString() {
        return "ModalContentUiState(header=" + this.a + ", items=" + this.b + ", keys=" + this.c + ", button=" + this.d + Extension.C_BRAKE;
    }

    public ey20() {
        this(null, null, null, 15);
    }
}
