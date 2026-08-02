package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class dwt0 {
    public final Text a;
    public final Text b;
    public final vrc c;
    public final YbButtonViewGroup.b d;

    public dwt0(Text text, Text text2, vrc vrcVar, YbButtonViewGroup.b bVar) {
        this.a = text;
        this.b = text2;
        this.c = vrcVar;
        this.d = bVar;
    }

    public final YbButtonViewGroup.b a() {
        return this.d;
    }

    public final vrc b() {
        return this.c;
    }

    public final Text c() {
        return this.b;
    }

    public final Text d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwt0)) {
            return false;
        }
        dwt0 dwt0Var = (dwt0) obj;
        return this.a.equals(dwt0Var.a) && this.b.equals(dwt0Var.b) && this.c.equals(dwt0Var.c) && this.d.equals(dwt0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + n.c(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder p = n.p("SpoilerOnboardingViewState(title=", this.a, ", subtitle=", this.b, ", onboardingVideoState=");
        p.append(this.c);
        p.append(", buttonViewGroup=");
        p.append(this.d);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }
}
