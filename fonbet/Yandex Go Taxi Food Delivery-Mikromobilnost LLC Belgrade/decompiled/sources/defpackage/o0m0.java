package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.personalstate.api.interactor.SavePersonalStateNotifier$SavePersonalStateReason;

/* loaded from: classes9.dex */
public final class o0m0 {
    public final n0 a = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public final void a(SavePersonalStateNotifier$SavePersonalStateReason savePersonalStateNotifier$SavePersonalStateReason) {
        this.a.g(savePersonalStateNotifier$SavePersonalStateReason);
    }
}
