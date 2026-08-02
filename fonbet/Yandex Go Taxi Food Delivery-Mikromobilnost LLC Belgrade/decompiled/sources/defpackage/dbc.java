package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.ScenarioSelectorState;

/* loaded from: classes5.dex */
public final class dbc {
    public final ScenarioSelectorState a;
    public final rmm0 b;
    public final rmm0 c;

    static {
        FormattedText formattedText = FormattedText.b;
    }

    public dbc(ScenarioSelectorState scenarioSelectorState, rmm0 rmm0Var, rmm0 rmm0Var2) {
        this.a = scenarioSelectorState;
        this.b = rmm0Var;
        this.c = rmm0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbc)) {
            return false;
        }
        dbc dbcVar = (dbc) obj;
        return this.a == dbcVar.a && this.b.equals(dbcVar.b) && this.c.equals(dbcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CollapsedStateConfigModel(initialState=" + this.a + ", collapseButton=" + this.b + ", expandButton=" + this.c + Extension.C_BRAKE;
    }
}
