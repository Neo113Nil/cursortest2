package defpackage;

import java.util.LinkedHashMap;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class ewl implements bnr0 {
    public final LinkedHashMap a;

    public ewl(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    @Override // defpackage.bnr0
    public final bnr0 a(bnr0 bnr0Var) {
        if (!(bnr0Var instanceof ewl)) {
            return this;
        }
        return new ewl(b.n(this.a, ((ewl) bnr0Var).a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return ewl.class.equals(obj != null ? obj.getClass() : null) && this.a.equals(((ewl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DivkitTemplatesSharedData(templates=" + this.a + Extension.C_BRAKE;
    }
}
