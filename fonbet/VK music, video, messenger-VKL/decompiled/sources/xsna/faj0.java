package xsna;

import kotlinx.coroutines.channels.BufferOverflow;
import xsna.pk50;

/* compiled from: MviEvents.kt */
/* loaded from: classes3.dex */
public final class faj0<Event extends pk50> {
    public final yvj a;
    public final caj0 b = lyd.b(0, 1, BufferOverflow.DROP_OLDEST, 1);

    public faj0(yvj yvjVar) {
        this.a = yvjVar;
    }

    public final wic a(izs izsVar) {
        return new wic(myc0.h(this.a, null, null, new eaj0(this, izsVar, null), 3));
    }
}
