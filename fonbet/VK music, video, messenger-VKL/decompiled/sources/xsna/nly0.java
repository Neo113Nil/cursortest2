package xsna;

import java.nio.ByteBuffer;
import java.util.function.BiFunction;
import one.video.calls.sdk_private.aG;
import one.video.calls.sdk_private.aP;
import one.video.calls.sdk_private.bF;
import one.video.calls.sdk_private.bI;
import one.video.calls.sdk_private.bJ;

/* compiled from: PacketParser.java */
/* loaded from: classes8.dex */
public abstract class nly0 {
    public final sby0 a;
    public final lgy0 b;
    public final int c;
    public final bF.b d;
    public final sp e;
    public final bI f;
    public final long[] g = new long[aG.values().length];
    public final BiFunction<ByteBuffer, Exception, Boolean> h;

    public nly0(sby0 sby0Var, lgy0 lgy0Var, int i, bF.b bVar, egy0 egy0Var, bI bIVar, sp spVar) {
        this.a = sby0Var;
        this.b = lgy0Var;
        this.c = i;
        this.d = bVar;
        this.h = egy0Var;
        this.f = bIVar;
        this.e = spVar;
    }

    public abstract nby0 a(tly0 tly0Var) throws aP, one.video.calls.sdk_private.bz, bJ;
}
