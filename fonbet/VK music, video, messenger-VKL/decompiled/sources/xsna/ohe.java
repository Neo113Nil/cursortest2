package xsna;

import java.util.ArrayList;
import java.util.List;
import xsna.jge;

/* compiled from: ClipsInterestsRemoteState.kt */
/* loaded from: classes16.dex */
public final class ohe {
    public final List<jge.a> a;
    public final ArrayList b;

    public ohe(ArrayList arrayList, List list) {
        this.a = list;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohe)) {
            return false;
        }
        ohe oheVar = (ohe) obj;
        return epx.f(this.a, oheVar.a) && this.b.equals(oheVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsInterestsRemoteState(all=");
        sb.append(this.a);
        sb.append(", selectedIds=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
    }
}
