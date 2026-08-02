package xsna;

import android.content.Context;

/* compiled from: MetadataBackendRegistry_Factory.java */
/* loaded from: classes.dex */
public final class ji20 implements xhq<ii20> {
    public final p6x b;
    public final jbk c;

    public ji20(p6x p6xVar, jbk jbkVar) {
        this.b = p6xVar;
        this.c = jbkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.e9e0
    public final Object get() {
        return new ii20((Context) this.b.b, (ibk) this.c.get());
    }
}
