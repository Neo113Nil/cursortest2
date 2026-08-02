package defpackage;

import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes5.dex */
public final class o5i implements y3i {
    public final /* synthetic */ PointType a;
    public final /* synthetic */ q5i b;
    public final /* synthetic */ jo0 c;

    public o5i(PointType pointType, q5i q5iVar, jo0 jo0Var) {
        this.a = pointType;
        this.b = q5iVar;
        this.c = jo0Var;
    }

    @Override // defpackage.y3i, defpackage.sy60
    public final void a() {
        this.b.c(this.a, this.c);
    }

    @Override // defpackage.y3i
    public final void q() {
        int i = n5i.a[this.a.ordinal()];
        jo0 jo0Var = this.c;
        if (i == 1) {
            this.b.c(PointType.DESTINATION, jo0Var);
        } else if (i == 2) {
            jo0Var.invoke();
        } else {
            w511.b();
        }
    }
}
