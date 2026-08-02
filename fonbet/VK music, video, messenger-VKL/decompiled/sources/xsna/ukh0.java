package xsna;

import java.util.ArrayList;

/* compiled from: SdkStatPixelList.kt */
/* loaded from: classes17.dex */
public final class ukh0 {
    public final ArrayList a;

    public ukh0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ukh0) && this.a.equals(((ukh0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("SdkStatPixelList(list="), this.a);
    }
}
