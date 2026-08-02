package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class d1e {
    public final ArrayList a;

    public d1e(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1e) && this.a.equals(((d1e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return smw0.m(new StringBuilder("AttributedText(items="), this.a, ')');
    }
}
