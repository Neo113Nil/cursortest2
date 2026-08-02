package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.preorder.source.SourcePointFragment;

/* loaded from: classes6.dex */
public final /* synthetic */ class kft0 implements jms {
    public final /* synthetic */ SourcePointFragment a;

    public kft0(SourcePointFragment sourcePointFragment) {
        this.a = sourcePointFragment;
    }

    public final void a(boolean z) {
        this.a.handleScreenOverlapChanges(z);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof kft0) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, SourcePointFragment.class, "handleScreenOverlapChanges", "handleScreenOverlapChanges(Z)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
