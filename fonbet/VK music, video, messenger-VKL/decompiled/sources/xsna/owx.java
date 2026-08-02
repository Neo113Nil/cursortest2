package xsna;

import kotlinx.coroutines.channels.BufferOverflow;
import xsna.mwx;
import xsna.nwx;

/* compiled from: IvmStore.kt */
/* loaded from: classes11.dex */
public abstract class owx<State extends nwx, Message, Patch extends mwx, Event> {
    public final z9 a;
    public final b8f0 b;
    public final caj0 c;
    public final z7f0 d;

    public owx(z9 z9Var) {
        this.a = z9Var;
        this.b = (b8f0) z9Var.b;
        caj0 b = lyd.b(0, 1, BufferOverflow.DROP_OLDEST, 1);
        this.c = b;
        this.d = rsr.e(b);
    }
}
