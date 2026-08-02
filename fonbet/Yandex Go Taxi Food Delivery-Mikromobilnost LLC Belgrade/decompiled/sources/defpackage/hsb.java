package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.a;

/* loaded from: classes12.dex */
public final class hsb {
    public final a a;
    public final di9 b;

    public hsb() {
        a a = sb2.a(1, BufferOverflow.DROP_OLDEST, null, 4);
        this.a = a;
        this.b = new di9(a);
    }
}
