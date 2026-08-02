package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class jw60 implements uv50, jms {
    public final /* synthetic */ wls a;

    public jw60(wls wlsVar) {
        this.a = wlsVar;
    }

    @Override // defpackage.uv50
    public final /* synthetic */ Object a(tv50 tv50Var, ContinuationImpl continuationImpl) {
        return this.a.invoke(tv50Var, continuationImpl);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof uv50) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
