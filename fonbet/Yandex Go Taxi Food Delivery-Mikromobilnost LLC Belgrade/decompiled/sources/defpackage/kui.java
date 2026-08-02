package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes12.dex */
public final /* synthetic */ class kui implements jms {
    public final /* synthetic */ lui a;

    public kui(lui luiVar) {
        this.a = luiVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kui) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.a, lui.class, "closeTracking", "closeTracking()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
