package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: ContactSyncEvents.kt */
/* loaded from: classes17.dex */
public final class fbj extends daj {
    public final ArrayList a;
    public final int b;

    public fbj(ArrayList arrayList, int i) {
        this.a = arrayList;
        this.b = i;
    }

    public final List<Long> a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbj)) {
            return false;
        }
        fbj fbjVar = (fbj) obj;
        return epx.f(this.a, fbjVar.a) && this.b == fbjVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactsImported(newSyncedContactIds=");
        sb.append(this.a);
        sb.append(", totalUploaded=");
        return vu5.b(sb, this.b, ')');
    }
}
