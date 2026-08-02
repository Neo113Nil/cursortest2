package xsna;

import java.util.ArrayList;

/* compiled from: VoipCallServicePatch.kt */
/* loaded from: classes7.dex */
public final class iiw0 implements niw0 {
    public final ArrayList b;
    public final boolean c;

    public iiw0(ArrayList arrayList, boolean z) {
        this.b = arrayList;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iiw0)) {
            return false;
        }
        iiw0 iiw0Var = (iiw0) obj;
        return this.b.equals(iiw0Var.b) && this.c == iiw0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(itemList=");
        sb.append(this.b);
        sb.append(", isContactsSync=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
