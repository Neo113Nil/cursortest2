package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class fur {
    public final List a;
    public final List b;
    public final List c;
    public final long d;

    public fur(eur eurVar) {
        this.a = Collections.unmodifiableList(eurVar.a);
        this.b = Collections.unmodifiableList(eurVar.b);
        this.c = Collections.unmodifiableList(eurVar.c);
        this.d = eurVar.d;
    }
}
