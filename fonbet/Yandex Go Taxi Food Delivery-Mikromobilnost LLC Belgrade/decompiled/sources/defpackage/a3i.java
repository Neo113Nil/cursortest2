package defpackage;

import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes12.dex */
public final /* synthetic */ class a3i implements jms {
    public final /* synthetic */ b3i a;

    public a3i(b3i b3iVar) {
        this.a = b3iVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a3i) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new AdaptedFunctionReference(0, this.a, b3i.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
