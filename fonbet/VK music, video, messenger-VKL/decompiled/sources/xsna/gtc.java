package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ClipEditSdkMviStore.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class gtc implements omf0, g0t {
    public static final gtc b = new gtc();

    public final boolean equals(Object obj) {
        if ((obj instanceof omf0) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(0, atc.class, "<init>", "<init>()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return new atc();
    }
}
