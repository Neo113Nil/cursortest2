package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class hf70 implements kf70 {
    public final ArrayList a;

    public hf70(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final Collection a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hf70) && this.a.equals(((hf70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g8e.q("Multiple(collection=", Extension.C_BRAKE, this.a);
    }
}
