package defpackage;

import com.yandex.go.superapp.discovery.map.impl.ui.search.f;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes14.dex */
public final /* synthetic */ class fxv0 implements jms {
    public final /* synthetic */ f a;

    public fxv0(f fVar) {
        this.a = fVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fxv0) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, f.class, "onNoItemsButtonItemClicked", "onNoItemsButtonItemClicked(Lcom/yandex/go/superapp/discovery/map/impl/ui/search/viewholder/SuperAppDiscoveryMapSearchActionType;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
