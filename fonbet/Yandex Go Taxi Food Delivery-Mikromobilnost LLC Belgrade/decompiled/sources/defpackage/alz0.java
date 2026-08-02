package defpackage;

import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemWithBadgeComponent;
import ru.yandex.taxi.summary.requirements.list.recycler.l;
import ru.yandex.taxi.summary.requirements.list.recycler.m;
import ru.yandex.taxi.summary.requirements.list.recycler.o;
import ru.yandex.taxi.summary.requirements.list.recycler.p;

/* loaded from: classes6.dex */
public final /* synthetic */ class alz0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ pav b;
    public final /* synthetic */ k7x0 c;

    public /* synthetic */ alz0(pav pavVar, k7x0 k7x0Var, int i) {
        this.a = i;
        this.b = pavVar;
        this.c = k7x0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return new l((ListItemWithBadgeComponent) obj, this.b, this.c);
            case 1:
                return new m((ListItemWithBadgeComponent) obj, this.b, this.c);
            case 2:
                return new o((ListItemComponent) obj, this.b, this.c);
            default:
                return new p((ListItemComponent) obj, this.b, this.c);
        }
    }
}
