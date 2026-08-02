package xsna;

import xsna.tlo0;

/* compiled from: QuestionListItems.kt */
/* loaded from: classes16.dex */
public final class k3x implements hfz {
    public final tlo0.h b;
    public final int c;

    public k3x(tlo0.h hVar, int i) {
        this.b = hVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3x)) {
            return false;
        }
        k3x k3xVar = (k3x) obj;
        return this.b.equals(k3xVar.b) && this.c == k3xVar.c;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InputTextQuestion(limitText=");
        sb.append(this.b);
        sb.append(", textLimit=");
        return vu5.b(sb, this.c, ')');
    }
}
