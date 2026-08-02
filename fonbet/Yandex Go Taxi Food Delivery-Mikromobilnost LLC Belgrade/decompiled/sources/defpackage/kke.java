package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;

/* loaded from: classes9.dex */
public final class kke extends mke {
    public final KSerializer a;

    public kke(KSerializer kSerializer) {
        this.a = kSerializer;
    }

    @Override // defpackage.mke
    public final KSerializer a(List list) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kke) && jl40.l(((kke) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
