package xsna;

import java.util.AbstractList;

/* compiled from: Contact.kt */
/* loaded from: classes18.dex */
public final class t7j {
    public final String a;
    public final AbstractList b;

    public t7j(String str, AbstractList abstractList) {
        this.a = str;
        this.b = abstractList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7j)) {
            return false;
        }
        t7j t7jVar = (t7j) obj;
        return epx.f(this.a, t7jVar.a) && this.b.equals(t7jVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Contact(name=" + this.a + ", values=" + this.b + ')';
    }
}
