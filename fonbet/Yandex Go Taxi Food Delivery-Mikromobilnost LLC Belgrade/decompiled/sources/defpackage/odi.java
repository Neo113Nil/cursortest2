package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes12.dex */
public final class odi {
    public final yth a;
    public final tt2 b;
    public ike c;
    public final ConcurrentHashMap d;
    public final n0 e;

    public odi(yth ythVar, tt2 tt2Var) {
        this.a = ythVar;
        this.b = tt2Var;
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.c = bvf0.a(o400.a);
        this.d = new ConcurrentHashMap();
        this.e = ffx.c(0, 1, BufferOverflow.DROP_OLDEST, 1);
    }
}
