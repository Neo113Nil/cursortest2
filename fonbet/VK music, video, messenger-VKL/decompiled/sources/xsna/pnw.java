package xsna;

import java.util.ArrayList;

/* compiled from: ReefState.kt */
/* loaded from: classes5.dex */
public final class pnw extends wof0 {
    public final ArrayList a;

    public pnw(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pnw) && epx.f(this.a, ((pnw) obj).a);
    }

    public final int hashCode() {
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    public final String toString() {
        return "ImagesLoadedState(list=" + this.a + ")";
    }
}
