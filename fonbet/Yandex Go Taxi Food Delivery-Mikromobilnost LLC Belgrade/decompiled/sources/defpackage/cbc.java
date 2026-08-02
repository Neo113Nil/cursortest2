package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.ScenarioSelectorState;

/* loaded from: classes5.dex */
public final class cbc {
    public final ScenarioSelectorState a;
    public final qmm0 b;
    public final qmm0 c;

    public cbc(ScenarioSelectorState scenarioSelectorState, qmm0 qmm0Var, qmm0 qmm0Var2) {
        this.a = scenarioSelectorState;
        this.b = qmm0Var;
        this.c = qmm0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbc)) {
            return false;
        }
        cbc cbcVar = (cbc) obj;
        return this.a == cbcVar.a && jl40.l(this.b, cbcVar.b) && jl40.l(this.c, cbcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CollapsedStateConfig(initialState=" + this.a + ", collapseButton=" + this.b + ", expandButton=" + this.c + Extension.C_BRAKE;
    }
}
