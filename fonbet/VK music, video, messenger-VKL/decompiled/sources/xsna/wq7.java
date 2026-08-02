package xsna;

import java.util.ArrayList;

/* compiled from: BookingMasterResponse.kt */
/* loaded from: classes18.dex */
public final class wq7 {
    public final ArrayList a;

    public wq7(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wq7) && this.a.equals(((wq7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("BookingMasterResponse(masters="), this.a);
    }
}
