package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ImItemListMviStore.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class u6w implements omf0, g0t {
    public static final u6w b = new u6w();

    public final boolean equals(Object obj) {
        if ((obj instanceof omf0) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(0, n6w.class, "<init>", "<init>()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return new n6w();
    }
}
