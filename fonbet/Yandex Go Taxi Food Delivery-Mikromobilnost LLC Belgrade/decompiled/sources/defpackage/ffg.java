package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ffg {
    public final ArrayList a;

    public ffg(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ffg) && this.a.equals(((ffg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return smw0.m(new StringBuilder("DarkPopupConfigurationFragment(popups="), this.a, ')');
    }
}
