package xsna;

import java.util.ArrayList;

/* compiled from: PickerUIModel.kt */
/* loaded from: classes5.dex */
public final class wia0<T> {
    public final ArrayList a;
    public final int b;
    public final boolean c;

    public wia0(ArrayList arrayList, int i, boolean z) {
        this.a = arrayList;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wia0)) {
            return false;
        }
        wia0 wia0Var = (wia0) obj;
        return this.a.equals(wia0Var.a) && this.b == wia0Var.b && this.c == wia0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PickerUIModel(listItem=");
        sb.append(this.a);
        sb.append(", totalCount=");
        sb.append(this.b);
        sb.append(", isReload=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
