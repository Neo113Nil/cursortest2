package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.screens.upgrade.domain.entities.SimpleIdFormFieldEntity;
import com.ybsdk.widgets.common.LoadableInput;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ma21 {
    public final SimpleIdFormFieldEntity a;
    public final Text.Resource b;
    public final Text c;
    public final String d;
    public final boolean e;
    public final LoadableInput.LoadingState f;
    public final boolean g;

    public ma21(SimpleIdFormFieldEntity simpleIdFormFieldEntity, Text.Resource resource, Text text, String str, boolean z, LoadableInput.LoadingState loadingState, boolean z2) {
        this.a = simpleIdFormFieldEntity;
        this.b = resource;
        this.c = text;
        this.d = str;
        this.e = z;
        this.f = loadingState;
        this.g = z2;
    }

    public final SimpleIdFormFieldEntity a() {
        return this.a;
    }

    public final Text b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma21)) {
            return false;
        }
        ma21 ma21Var = (ma21) obj;
        return this.a == ma21Var.a && this.b.equals(ma21Var.b) && jl40.l(this.c, ma21Var.c) && jl40.l(this.d, ma21Var.d) && this.e == ma21Var.e && this.f == ma21Var.f && this.g == ma21Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + unr0.e(unr0.b(n.c(this.c, uw51.b(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpgradeFormFieldViewState(field=");
        sb.append(this.a);
        sb.append(", labelText=");
        sb.append(this.b);
        sb.append(", helperText=");
        sb.append(this.c);
        sb.append(", inputText=");
        sb.append(this.d);
        sb.append(", hasError=");
        sb.append(this.e);
        sb.append(", loadingState=");
        sb.append(this.f);
        sb.append(", clickable=");
        return x4e.i(sb, this.g, Extension.C_BRAKE);
    }
}
