package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes14.dex */
public final /* synthetic */ class bg9 implements jms {
    public final /* synthetic */ wls a;

    public bg9(wls wlsVar) {
        this.a = wlsVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bg9) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(2, this.a, wls.class, "invoke", "invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
