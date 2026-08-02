package defpackage;

import com.yandex.go.tariffcard.ui.r0;
import com.yandex.go.taxi.summary.shared.expanded.repository.c;
import ru.yandex.taxi.design.DialogueComponent;
import ru.yandex.taxi.summary.promotions.interactor.a;
import ru.yandex.taxi.summary.promotions.repository.e;

/* loaded from: classes14.dex */
public final class ekx0 {
    public final cjw0 a;

    public ekx0(cjw0 cjw0Var) {
        this.a = cjw0Var;
    }

    public final r0 a(c cVar, DialogueComponent dialogueComponent, int i) {
        cjw0 cjw0Var = this.a;
        return new r0((tt2) ((xvf0) cjw0Var.a).get(), (a) ((t4v0) cjw0Var.b).get(), (e) ((xvf0) cjw0Var.c).get(), cVar, dialogueComponent, i);
    }
}
