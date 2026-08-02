package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class fmq0 implements kmq0 {
    public final puz0 a;

    public fmq0(puz0 puz0Var) {
        this.a = puz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fmq0) && jl40.l(this.a, ((fmq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TooltipContentAction(tooltipContentUiAction=" + this.a + Extension.C_BRAKE;
    }
}
