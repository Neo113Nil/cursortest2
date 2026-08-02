package defpackage;

import com.yandex.go.taxi.order.details.v2.state.elements.companion_buffer_search.animation.a;

/* loaded from: classes14.dex */
public final class nck0 implements v7p {
    public final /* synthetic */ int a;
    public final s6g b;

    public /* synthetic */ nck0(s6g s6gVar, int i) {
        this.a = i;
        this.b = s6gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        s6g s6gVar = this.b;
        switch (i) {
            case 0:
                return new a((ytz) s6gVar.get());
            default:
                return new com.yandex.go.taxi.order.details.v2.state.elements.companion.animation.a((ytz) s6gVar.get());
        }
    }
}
