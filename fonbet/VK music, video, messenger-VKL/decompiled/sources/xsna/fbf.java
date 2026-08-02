package xsna;

import xsna.lbf;

/* compiled from: ClipsUploadAction.kt */
/* loaded from: classes17.dex */
public final class fbf implements lbf.c {
    public final int b;
    public final int c;

    public fbf(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbf)) {
            return false;
        }
        fbf fbfVar = (fbf) obj;
        return this.b == fbfVar.b && this.c == fbfVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsApplied(durationDays=");
        sb.append(this.b);
        sb.append(", budgetRub=");
        return vu5.b(sb, this.c, ')');
    }
}
