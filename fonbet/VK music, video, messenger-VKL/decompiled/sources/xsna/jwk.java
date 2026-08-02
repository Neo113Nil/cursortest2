package xsna;

import java.util.ArrayList;

/* compiled from: DatabaseItems.kt */
/* loaded from: classes5.dex */
public final class jwk<Item> {
    public final int a;
    public final ArrayList b;

    public jwk(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwk)) {
            return false;
        }
        jwk jwkVar = (jwk) obj;
        return this.a == jwkVar.a && this.b.equals(jwkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DatabaseItems(totalCount=");
        sb.append(this.a);
        sb.append(", items=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
    }
}
