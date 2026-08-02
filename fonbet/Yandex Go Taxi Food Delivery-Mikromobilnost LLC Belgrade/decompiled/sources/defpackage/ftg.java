package defpackage;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class ftg {
    public final dtg a;

    public ftg(dtg dtgVar) {
        this.a = dtgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ftg.class.equals(obj.getClass())) {
            return false;
        }
        dtg dtgVar = ((ftg) obj).a;
        String str = dtgVar.a;
        dtg dtgVar2 = this.a;
        return (str == null && dtgVar2.a == null) ? jl40.l(dtgVar.c, dtgVar2.c) : jl40.l(dtgVar2.a, str);
    }

    public final int hashCode() {
        dtg dtgVar = this.a;
        String str = dtgVar.a;
        return str == null ? Objects.hash(dtgVar.c) : Objects.hash(str);
    }
}
