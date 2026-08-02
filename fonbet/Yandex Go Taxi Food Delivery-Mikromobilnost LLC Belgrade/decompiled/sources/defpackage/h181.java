package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class h181 {
    public final List a;
    public final b971 b;
    public final fo81 c;
    public final o481 d;
    public final hr81 e;
    public final ru71 f;
    public final xx71 g;

    public h181(List list, b971 b971Var, fo81 fo81Var, o481 o481Var, hr81 hr81Var, ru71 ru71Var, xx71 xx71Var) {
        this.a = list;
        this.b = b971Var;
        this.c = fo81Var;
        this.d = o481Var;
        this.e = hr81Var;
        this.f = ru71Var;
        this.g = xx71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h181)) {
            return false;
        }
        h181 h181Var = (h181) obj;
        return this.a.equals(h181Var.a) && this.b.equals(h181Var.b) && this.c.equals(h181Var.c) && this.d.equals(h181Var.d) && this.e.equals(h181Var.e) && this.f.equals(h181Var.f) && this.g.equals(h181Var.g);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g.a) + ((this.f.hashCode() + ly3.b((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e.a)) * 31);
    }

    public final String toString() {
        return "DebugPanelFeedData(alertsData=" + this.a + ", appData=" + this.b + ", sdkIntegrationData=" + this.c + ", adNetworkSettingsData=" + this.d + ", adaptersData=" + this.e + ", consentsData=" + this.f + ", debugErrorIndicatorData=" + this.g + Extension.C_BRAKE;
    }
}
