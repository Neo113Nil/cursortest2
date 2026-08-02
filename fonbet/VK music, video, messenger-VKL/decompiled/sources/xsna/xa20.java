package xsna;

import java.util.ArrayList;

/* compiled from: MessageProductSnippetConfig.kt */
/* loaded from: classes18.dex */
public final class xa20 {
    public final ArrayList a;
    public final boolean b;
    public final xsd c;

    public xa20(ArrayList arrayList, boolean z, xsd xsdVar) {
        this.a = arrayList;
        this.b = z;
        this.c = xsdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa20)) {
            return false;
        }
        xa20 xa20Var = (xa20) obj;
        return this.a.equals(xa20Var.a) && this.b == xa20Var.b && this.c.equals(xa20Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "MessageProductSnippetConfig(productItems=" + this.a + ", isRestricted=" + this.b + ", onSnippetClick=" + this.c + ')';
    }
}
