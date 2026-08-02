package defpackage;

import kotlin.coroutines.Continuation;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class idi0 implements qjs0 {
    public final xis0 b;

    public idi0(xis0 xis0Var) {
        this.b = xis0Var;
    }

    @Override // defpackage.qjs0
    public final Object a(Continuation continuation) {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof idi0) && this.b.equals(((idi0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "RealSizeResolver(size=" + this.b + Extension.C_BRAKE;
    }
}
