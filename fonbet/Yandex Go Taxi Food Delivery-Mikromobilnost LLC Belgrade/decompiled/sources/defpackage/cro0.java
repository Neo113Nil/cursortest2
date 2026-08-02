package defpackage;

import java.util.List;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class cro0 implements dro0 {
    public final String a;
    public final List b;

    public cro0(String str, ListBuilder listBuilder) {
        this.a = str;
        this.b = listBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cro0)) {
            return false;
        }
        cro0 cro0Var = (cro0) obj;
        return jl40.l(this.a, cro0Var.a) && jl40.l(this.b, cro0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return nnm.h("Success(code=", this.a, ", contentItems=", Extension.C_BRAKE, this.b);
    }
}
