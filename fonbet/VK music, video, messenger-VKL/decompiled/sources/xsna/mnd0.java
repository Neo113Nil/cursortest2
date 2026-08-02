package xsna;

import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: ProductCardViewStatesMerger.kt */
/* loaded from: classes18.dex */
public final class mnd0 {
    public final androidx.lifecycle.j a;
    public final caj0 b;
    public final caj0 c;

    public mnd0(androidx.lifecycle.j jVar) {
        this.a = jVar;
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        this.b = lyd.a(0, 0, bufferOverflow);
        this.c = lyd.a(0, 0, bufferOverflow);
    }
}
