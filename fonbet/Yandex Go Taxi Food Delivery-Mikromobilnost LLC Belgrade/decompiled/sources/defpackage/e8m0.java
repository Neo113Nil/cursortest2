package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class e8m0 implements qas0 {
    public final Text.Resource a;
    public final Text.Resource b;
    public final rbv c;
    public final YbButtonView.a d;
    public final YbButtonView.a e;
    public final boolean f;

    public e8m0(Text.Resource resource, Text.Resource resource2, rbv rbvVar, YbButtonView.a aVar, YbButtonView.a aVar2, boolean z) {
        this.a = resource;
        this.b = resource2;
        this.c = rbvVar;
        this.d = aVar;
        this.e = aVar2;
        this.f = z;
    }

    public final YbButtonView.a a() {
        return this.d;
    }

    public final YbButtonView.a b() {
        return this.e;
    }

    public final boolean c() {
        return this.f;
    }

    public final rbv d() {
        return this.c;
    }

    public final Text e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8m0)) {
            return false;
        }
        e8m0 e8m0Var = (e8m0) obj;
        return this.a.equals(e8m0Var.a) && this.b.equals(e8m0Var.b) && this.c.equals(e8m0Var.c) && this.d.equals(e8m0Var.d) && this.e.equals(e8m0Var.e) && this.f == e8m0Var.f;
    }

    public final Text f() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ly3.c(this.c, uw51.b(this.b, this.a.hashCode() * 31, 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ShowUnlock(title=" + this.a + ", subtitle=" + this.b + ", image=" + this.c + ", buttonPrimaryState=" + this.d + ", buttonSecondaryState=" + this.e + ", errorOccurred=" + this.f + Extension.C_BRAKE;
    }
}
