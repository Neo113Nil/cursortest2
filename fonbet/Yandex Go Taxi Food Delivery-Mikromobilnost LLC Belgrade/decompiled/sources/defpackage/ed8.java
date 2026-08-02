package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.k;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ed8 {
    public final k a;
    public final Text b;
    public final rbv c;

    public ed8(k kVar, Text text, rbv rbvVar) {
        this.a = kVar;
        this.b = text;
        this.c = rbvVar;
    }

    public final Text a() {
        return this.b;
    }

    public final k b() {
        return this.a;
    }

    public final rbv c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed8)) {
            return false;
        }
        ed8 ed8Var = (ed8) obj;
        return this.a.equals(ed8Var.a) && this.b.equals(ed8Var.b) && this.c.equals(ed8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + n.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CardDeletionViewState(deletionProgressState=" + this.a + ", confirmationTitle=" + this.b + ", headerImageModel=" + this.c + Extension.C_BRAKE;
    }
}
