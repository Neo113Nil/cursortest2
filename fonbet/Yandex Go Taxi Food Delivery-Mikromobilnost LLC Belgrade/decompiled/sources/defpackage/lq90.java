package defpackage;

import ru.yandex.taxi.personalstate.api.interactor.SavePersonalStateNotifier$SavePersonalStateReason;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes6.dex */
public final class lq90 {
    public final SavePersonalStateNotifier$SavePersonalStateReason a;
    public final boolean b;
    public final pex0 c;
    public final SelectionOrigin d;

    public lq90(SavePersonalStateNotifier$SavePersonalStateReason savePersonalStateNotifier$SavePersonalStateReason, boolean z, pex0 pex0Var, SelectionOrigin selectionOrigin) {
        this.a = savePersonalStateNotifier$SavePersonalStateReason;
        this.b = z;
        this.c = pex0Var;
        this.d = selectionOrigin;
    }

    public final SavePersonalStateNotifier$SavePersonalStateReason a() {
        return this.a;
    }

    public final pex0 b() {
        return this.c;
    }

    public final SelectionOrigin c() {
        return this.d;
    }

    public final boolean d() {
        return this.b;
    }
}
