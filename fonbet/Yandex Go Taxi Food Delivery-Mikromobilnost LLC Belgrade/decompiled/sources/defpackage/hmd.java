package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class hmd {
    public final String a;
    public final ArrayList b;

    public hmd(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmd)) {
            return false;
        }
        hmd hmdVar = (hmd) obj;
        return this.a.equals(hmdVar.a) && this.b.equals(hmdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Group(groupTitle=");
        sb.append(this.a);
        sb.append(", groupButtons=");
        return smw0.m(sb, this.b, ')');
    }
}
