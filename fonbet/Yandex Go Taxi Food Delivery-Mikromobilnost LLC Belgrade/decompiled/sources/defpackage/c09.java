package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.order.map.controller.a;

/* loaded from: classes14.dex */
public abstract class c09 extends ad5 {
    public final n0 A;
    public pzt0 B;
    public pzt0 C;
    public final a x;
    public final a09 y;
    public final jse z;

    public c09(a aVar, a09 a09Var, tt2 tt2Var) {
        super(xz8.class);
        this.x = aVar;
        this.y = a09Var;
        tt2Var.getClass();
        this.z = uyj.a.P(1);
        this.A = ffx.b(1, 0, BufferOverflow.DROP_OLDEST);
    }
}
