package defpackage;

import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.g;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gtw {
    public final ahq0 a;
    public final g b;
    public final stz0 c;
    public final YbButtonView.a d;

    public gtw(ahq0 ahq0Var, g gVar, stz0 stz0Var, YbButtonView.a aVar) {
        this.a = ahq0Var;
        this.b = gVar;
        this.c = stz0Var;
        this.d = aVar;
    }

    public final YbButtonView.a a() {
        return this.d;
    }

    public final ahq0 b() {
        return this.a;
    }

    public final g c() {
        return this.b;
    }

    public final stz0 d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtw)) {
            return false;
        }
        gtw gtwVar = (gtw) obj;
        return this.a.equals(gtwVar.a) && this.b.equals(gtwVar.b) && this.c.equals(gtwVar.c) && this.d.equals(gtwVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "InternetPaymentFormInputSuccessViewState(formViewState=" + this.a + ", inputViewState=" + this.b + ", toolbarViewState=" + this.c + ", buttonViewState=" + this.d + Extension.C_BRAKE;
    }
}
