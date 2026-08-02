package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.requirements.models.net.RequirementsParam;

@gsq0
/* loaded from: classes9.dex */
public final class ip40 {
    public static final fp40 Companion = new fp40();
    public static final i3y[] e;
    public final Set a;
    public final RequirementsParam b;
    public final List c;
    public final boolean d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{a.b(lazyThreadSafetyMode, new d540(3)), a.b(lazyThreadSafetyMode, new d540(4)), a.b(lazyThreadSafetyMode, new d540(5)), null};
    }

    public /* synthetic */ ip40(int i, Set set, RequirementsParam requirementsParam, List list, boolean z) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, cp40.a.getDescriptor());
            throw null;
        }
        this.a = set;
        this.b = requirementsParam;
        this.c = list;
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip40)) {
            return false;
        }
        ip40 ip40Var = (ip40) obj;
        return jl40.l(this.a, ip40Var.a) && jl40.l(this.b, ip40Var.b) && jl40.l(this.c, ip40Var.c) && this.d == ip40Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        RequirementsParam requirementsParam = this.b;
        return Boolean.hashCode(this.d) + unr0.c((hashCode + (requirementsParam == null ? 0 : requirementsParam.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return "MulticlassOptions(selectedClasses=" + this.a + ", requirements=" + this.b + ", verticalMulticlassesSelections=" + this.c + ", selected=" + this.d + Extension.C_BRAKE;
    }

    public ip40(Set set, RequirementsParam requirementsParam, ArrayList arrayList, boolean z) {
        this.a = set;
        this.b = requirementsParam;
        this.c = arrayList;
        this.d = z;
    }
}
