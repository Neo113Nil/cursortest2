package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.c;
import com.ybsdk.widgets.common.e;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class oj90 implements rj90 {
    public final ntz0 a;
    public final Text b;
    public final Text c;
    public final c d;

    public oj90(ntz0 ntz0Var, Text.Resource resource, Text.Resource resource2, c cVar) {
        this.a = ntz0Var;
        this.b = resource;
        this.c = resource2;
        this.d = cVar;
    }

    @Override // defpackage.rj90
    public final rtz0 a() {
        return this.a;
    }

    @Override // defpackage.rj90
    public final Text b() {
        return this.b;
    }

    @Override // defpackage.rj90
    public final Text c() {
        return this.c;
    }

    public final e d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj90)) {
            return false;
        }
        oj90 oj90Var = (oj90) obj;
        return this.a.equals(oj90Var.a) && jl40.l(this.b, oj90Var.b) && jl40.l(this.c, oj90Var.c) && this.d.equals(oj90Var.d);
    }

    public final int hashCode() {
        int d = vfc.d(this.a.a, Boolean.hashCode(false) * 31, 31);
        Text text = this.b;
        int hashCode = (d + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.c;
        return this.d.hashCode() + ((hashCode + (text2 != null ? text2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.rj90
    public final boolean isBackButtonVisible() {
        return false;
    }

    public final String toString() {
        return "Info(isBackButtonVisible=false, toolbarRightPart=" + this.a + ", toolbarTitle=" + this.b + ", toolbarSubtitle=" + this.c + ", fullscreenState=" + this.d + Extension.C_BRAKE;
    }
}
