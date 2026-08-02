package xsna;

import xsna.hn50;
import xsna.lj50;
import xsna.lm50;
import xsna.on50;
import xsna.pk50;
import xsna.yl50;

/* compiled from: MviMiddlewareStoreGateway.kt */
/* loaded from: classes3.dex */
public interface sl50<State extends lm50, Action extends lj50, Id extends on50, Task extends hn50<Id>, Patch extends yl50, Event extends pk50> {
    State getCurrentState();
}
