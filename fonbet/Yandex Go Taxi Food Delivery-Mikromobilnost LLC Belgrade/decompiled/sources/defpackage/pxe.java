package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.costcenters.selection.b;

/* loaded from: classes5.dex */
public final /* synthetic */ class pxe implements jms {
    public final /* synthetic */ b a;

    public pxe(b bVar) {
        this.a = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pxe) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, b.class, "costCenterSelected", "costCenterSelected(Lru/yandex/taxi/costcenters/selection/CostCenterSelectionItem;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
