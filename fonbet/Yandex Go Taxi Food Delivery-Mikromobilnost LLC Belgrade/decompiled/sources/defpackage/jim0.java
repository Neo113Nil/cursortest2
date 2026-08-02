package defpackage;

import com.ybsdk.core.utils.text.Text;

/* loaded from: classes3.dex */
public final class jim0 implements nim0 {
    public final Text.Resource a;
    public final String b;

    public jim0(Text.Resource resource, String str) {
        this.a = resource;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final Text b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jim0)) {
            return false;
        }
        jim0 jim0Var = (jim0) obj;
        return this.a.equals(jim0Var.a) && this.b.equals(jim0Var.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "CustomError(text=" + this.a + ", filterText=" + this.b + ", isPrimaryButtonVisible=false)";
    }
}
