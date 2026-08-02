package xsna;

import java.util.ArrayList;

/* compiled from: GeocoderResult.kt */
/* loaded from: classes18.dex */
public final class qnt {
    public final ArrayList a;

    public qnt(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qnt) && this.a.equals(((qnt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("GeocoderResult(addresses="), this.a);
    }
}
