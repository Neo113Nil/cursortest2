package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes14.dex */
public final class a380 {
    public zzs a;
    public boolean b;
    public int c;
    public float d;
    public final n0 e = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public final void a() {
        this.e.g(new z280(this.a, this.b, this.c, this.d));
    }
}
