package defpackage;

import ru.yandex.taxi.design.ListGroupHeaderComponent;

/* loaded from: classes6.dex */
public final class e5q0 extends w95 {
    public final ListGroupHeaderComponent N;

    public e5q0(ListGroupHeaderComponent listGroupHeaderComponent) {
        super(listGroupHeaderComponent);
        this.N = listGroupHeaderComponent;
    }

    @Override // defpackage.w95
    public final void W(z5r0 z5r0Var) {
        x5r0 x5r0Var = (x5r0) z5r0Var;
        String str = x5r0Var.a;
        int i = (str == null || str.length() == 0) ? 8 : 0;
        ListGroupHeaderComponent listGroupHeaderComponent = this.N;
        listGroupHeaderComponent.setVisibility(i);
        listGroupHeaderComponent.setTitle(x5r0Var.a);
    }
}
