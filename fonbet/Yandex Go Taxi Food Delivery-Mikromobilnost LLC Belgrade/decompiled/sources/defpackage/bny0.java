package defpackage;

import kotlin.jvm.internal.PropertyReference0Impl;

/* loaded from: classes10.dex */
public final /* synthetic */ class bny0 implements jms {
    public final /* synthetic */ PropertyReference0Impl a;

    public bny0(PropertyReference0Impl propertyReference0Impl) {
        this.a = propertyReference0Impl;
    }

    public final float a() {
        return ((Number) this.a.get()).floatValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bny0) {
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
