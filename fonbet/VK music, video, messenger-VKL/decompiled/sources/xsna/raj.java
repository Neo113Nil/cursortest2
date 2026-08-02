package xsna;

import java.util.ArrayList;

/* compiled from: Contacts.kt */
/* loaded from: classes5.dex */
public final class raj {
    public final String a;
    public final ArrayList b;

    public raj(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof raj)) {
            return false;
        }
        raj rajVar = (raj) obj;
        return this.a.equals(rajVar.a) && this.b.equals(rajVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Contacts(userId=");
        sb.append(this.a);
        sb.append(", contacts=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
    }
}
