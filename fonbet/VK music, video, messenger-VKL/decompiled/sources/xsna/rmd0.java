package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ProductCardStoreRecipe.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class rmd0 implements omf0, g0t {
    public static final rmd0 b = new rmd0();

    public final boolean equals(Object obj) {
        if ((obj instanceof omf0) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(0, gmd0.class, "<init>", "<init>()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return new gmd0();
    }
}
