package xsna;

import java.util.ArrayList;

/* compiled from: VideoPickerViewState.kt */
/* loaded from: classes4.dex */
public final class e3t0<T> {
    public final ArrayList a;
    public final int b;
    public final boolean c;

    public e3t0(ArrayList arrayList, int i, boolean z) {
        this.a = arrayList;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3t0)) {
            return false;
        }
        e3t0 e3t0Var = (e3t0) obj;
        return this.a.equals(e3t0Var.a) && this.b == e3t0Var.b && this.c == e3t0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoPickerUiModel(listItem=");
        sb.append(this.a);
        sb.append(", totalCount=");
        sb.append(this.b);
        sb.append(", isReload=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
