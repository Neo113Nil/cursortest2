package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;

/* loaded from: classes4.dex */
public final class lke extends mke {
    public final tls a;

    public lke(tls tlsVar) {
        this.a = tlsVar;
    }

    @Override // defpackage.mke
    public final KSerializer a(List list) {
        return (KSerializer) this.a.invoke(list);
    }

    public final tls b() {
        return this.a;
    }
}
