package xsna;

/* compiled from: FolderNameUpdateLpEvent.kt */
/* loaded from: classes2.dex */
public final class czr implements e900 {
    public final int a;
    public final String b;

    public czr(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czr)) {
            return false;
        }
        czr czrVar = (czr) obj;
        return this.a == czrVar.a && epx.f(this.b, czrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FolderNameUpdateLpEvent(id=");
        sb.append(this.a);
        sb.append(", name=");
        return ho8.a(sb, this.b, ')');
    }
}
