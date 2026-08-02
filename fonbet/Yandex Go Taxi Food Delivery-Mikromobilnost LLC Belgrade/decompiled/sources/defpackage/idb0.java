package defpackage;

import java.util.List;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class idb0 implements kdb0 {
    public final List a;

    public idb0(ListBuilder listBuilder) {
        this.a = listBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof idb0) && jl40.l(this.a, ((idb0) obj).a);
    }

    @Override // defpackage.kdb0
    public final List getItems() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("Content(items=", Extension.C_BRAKE, this.a);
    }
}
