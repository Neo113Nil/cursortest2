package defpackage;

import ru.yandex.taxi.linked_order.modals.info.LinkedOrderInfoModalView;

/* loaded from: classes14.dex */
public final class mny extends s45 {
    public final /* synthetic */ LinkedOrderInfoModalView a;
    public final /* synthetic */ wrr b;
    public final /* synthetic */ v51 c;

    public mny(LinkedOrderInfoModalView linkedOrderInfoModalView, wrr wrrVar, v51 v51Var) {
        this.a = linkedOrderInfoModalView;
        this.b = wrrVar;
        this.c = v51Var;
    }

    @Override // defpackage.s45
    public final void a(int i) {
    }

    @Override // defpackage.s45
    public final void b() {
    }

    @Override // defpackage.s45
    public final void c() {
        this.a.setSlideListener(null);
        ((a3v) this.b.y).Lc(LinkedOrderInfoModalView.class, null);
        this.c.accept(Boolean.FALSE);
    }
}
