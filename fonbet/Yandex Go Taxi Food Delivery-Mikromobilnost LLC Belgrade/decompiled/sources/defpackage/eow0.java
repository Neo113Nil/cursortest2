package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class eow0 {
    public final bww0 a;
    public final yvw0 b;
    public final iww0 c;

    public eow0(bww0 bww0Var, yvw0 yvw0Var, iww0 iww0Var) {
        this.a = bww0Var;
        this.b = yvw0Var;
        this.c = iww0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eow0)) {
            return false;
        }
        eow0 eow0Var = (eow0) obj;
        return this.a.equals(eow0Var.a) && this.b.equals(eow0Var.b) && this.c.equals(eow0Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SurgeBarUiState(surgeWidgetLeadUiState=" + this.a + ", surgeWidgetBodyUiState=" + this.b + ", surgeWidgetTrailUiState=" + this.c + Extension.C_BRAKE;
    }
}
