package defpackage;

import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class jro {
    public final String a;
    public final String b;
    public final ArrayList c;

    public jro(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jro)) {
            return false;
        }
        jro jroVar = (jro) obj;
        return this.a.equals(jroVar.a) && this.b.equals(jroVar.b) && this.c.equals(jroVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Experiments(testIds=");
        sb.append(this.a);
        sb.append(", triggeredTestIds=");
        sb.append(this.b);
        sb.append(", triggeredExperimentSet=");
        return smw0.m(sb, this.c, ')');
    }
}
