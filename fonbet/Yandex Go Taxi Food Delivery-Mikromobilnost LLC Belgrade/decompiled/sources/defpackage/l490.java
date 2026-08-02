package defpackage;

import java.security.cert.CertPathParameters;
import java.security.cert.PKIXParameters;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class l490 implements CertPathParameters {
    public final Set A;
    public final PKIXParameters a;
    public final Date b;
    public final List c;
    public final Map w;
    public final List x;
    public final Map y;
    public final boolean z;

    public l490(k490 k490Var) {
        this.a = k490Var.a;
        this.b = k490Var.c;
        this.c = Collections.unmodifiableList(k490Var.e);
        this.w = Collections.unmodifiableMap(new HashMap(k490Var.f));
        this.x = Collections.unmodifiableList(k490Var.g);
        this.y = Collections.unmodifiableMap(new HashMap(k490Var.h));
        this.z = k490Var.i;
        this.A = Collections.unmodifiableSet(k490Var.j);
    }

    public final Date a() {
        return new Date(this.b.getTime());
    }

    @Override // java.security.cert.CertPathParameters
    public final Object clone() {
        return this;
    }
}
