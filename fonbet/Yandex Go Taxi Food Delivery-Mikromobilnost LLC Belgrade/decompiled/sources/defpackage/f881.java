package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class f881 implements te81 {
    public final List a;

    public f881() {
        this.a = EmptyList.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f881) && this.a.equals(((f881) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("Success(warnings=", Extension.C_BRAKE, this.a);
    }

    public f881(ArrayList arrayList) {
        this.a = arrayList;
    }
}
