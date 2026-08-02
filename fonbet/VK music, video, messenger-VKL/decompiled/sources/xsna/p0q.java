package xsna;

import android.content.Context;

/* compiled from: EventStoreModule_PackageNameFactory.java */
/* loaded from: classes.dex */
public final class p0q implements xhq<String> {
    public final e9e0<Context> b;

    public p0q(e9e0<Context> e9e0Var) {
        this.b = e9e0Var;
    }

    @Override // xsna.e9e0
    public final Object get() {
        String packageName = this.b.get().getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
