package defpackage;

import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.feedback.e;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.header.f;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.poll.c;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.rover.d;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.timeline.b;

/* loaded from: classes5.dex */
public final class gub implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final gbg c;

    public /* synthetic */ gub(gbg gbgVar, xvf0 xvf0Var, int i) {
        this.a = i;
        this.c = gbgVar;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        gbg gbgVar = this.c;
        switch (i) {
            case 0:
                return new fub((ptb) xvf0Var.get(), (dci) gbgVar.get());
            case 1:
                return new fub((e) xvf0Var.get(), (dci) gbgVar.get());
            case 2:
                return new fub((dci) gbgVar.get(), (f) xvf0Var.get());
            case 3:
                return new fub((qt90) xvf0Var.get(), (dci) gbgVar.get());
            case 4:
                return new fub((dci) gbgVar.get(), (c) xvf0Var.get());
            case 5:
                return new fub((d) xvf0Var.get(), (dci) gbgVar.get());
            default:
                return new fub((dci) gbgVar.get(), (b) xvf0Var.get());
        }
    }

    public /* synthetic */ gub(xvf0 xvf0Var, gbg gbgVar, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = gbgVar;
    }
}
