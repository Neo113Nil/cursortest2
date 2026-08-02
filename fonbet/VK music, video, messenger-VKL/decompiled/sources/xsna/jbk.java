package xsna;

import android.content.Context;

/* compiled from: CreationContextFactory_Factory.java */
/* loaded from: classes.dex */
public final class jbk implements xhq<ibk> {
    public final p6x b;

    public jbk(p6x p6xVar) {
        this.b = p6xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.e9e0
    public final Object get() {
        return new ibk((Context) this.b.b, new prw(), new k0x(5));
    }
}
