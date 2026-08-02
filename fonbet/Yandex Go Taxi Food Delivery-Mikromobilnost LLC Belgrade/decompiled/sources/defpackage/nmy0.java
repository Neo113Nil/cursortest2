package defpackage;

import kotlin.jvm.internal.PropertyReference0Impl;

/* loaded from: classes10.dex */
public final /* synthetic */ class nmy0 implements xfc, jms {
    public final /* synthetic */ PropertyReference0Impl a;

    public nmy0(PropertyReference0Impl propertyReference0Impl) {
        this.a = propertyReference0Impl;
    }

    @Override // defpackage.xfc
    public final long a() {
        return ((ldc) this.a.get()).a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof xfc) && (obj instanceof jms)) {
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
