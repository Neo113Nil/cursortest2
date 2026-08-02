package xsna;

import xsna.lj50;
import xsna.lm50;
import xsna.pk50;

/* compiled from: MviStore.kt */
/* loaded from: classes3.dex */
public interface mm50<State extends lm50, Action extends lj50, Event extends pk50> extends uic {
    uic G(izs<? super State, s3q0> izsVar);

    uic R(izs<? super Event, s3q0> izsVar);

    void b(Action action);

    State getCurrentState();
}
