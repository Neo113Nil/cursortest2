package defpackage;

import java.util.function.Consumer;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class ktj0 extends ntj0 {
    public final Object b;

    public ktj0(Object obj) {
        this.b = obj;
    }

    @Override // defpackage.ntj0
    public final ntj0 a(Consumer consumer) {
        consumer.accept(this.b);
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ktj0) && jl40.l(this.b, ((ktj0) obj).b);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return qv10.p("Complete(data=", Extension.C_BRAKE, this.b);
    }
}
