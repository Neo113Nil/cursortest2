package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class h1m implements i1m {
    public final ArrayList a;

    public h1m(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.i1m
    public final List a() {
        return this.a;
    }

    @Override // defpackage.i1m
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1m) && this.a.equals(((h1m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g8e.q("ByLabels(labels=", Extension.C_BRAKE, this.a);
    }
}
