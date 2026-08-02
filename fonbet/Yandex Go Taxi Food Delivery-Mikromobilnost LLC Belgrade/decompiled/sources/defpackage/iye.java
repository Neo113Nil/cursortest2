package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class iye extends n351 {
    public final ArrayList c;

    public iye(ArrayList arrayList) {
        super("cost-details-key", false, 14);
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iye) && this.c.equals(((iye) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return g8e.q("CostDetailsModel(details=", Extension.C_BRAKE, this.c);
    }
}
