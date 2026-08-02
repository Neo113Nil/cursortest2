package defpackage;

import com.ybsdk.core.utils.text.Text;

/* loaded from: classes2.dex */
public final class fu01 extends gu01 {
    public final Text a;
    public final ntz0 b;

    public fu01(Text.Empty empty, ntz0 ntz0Var) {
        this.a = empty;
        this.b = ntz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu01)) {
            return false;
        }
        fu01 fu01Var = (fu01) obj;
        return jl40.l(this.a, fu01Var.a) && this.b.equals(fu01Var.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + vfc.d(this.b.a, this.a.hashCode() * 961, 31);
    }

    public final String toString() {
        return "Default(title=" + this.a + ", subtitle=null, rightPart=" + this.b + ", animateChanges=true)";
    }
}
