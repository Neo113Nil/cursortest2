package defpackage;

import java.util.Iterator;

/* loaded from: classes15.dex */
public class ohs0 extends zq60 {
    public final long x = Thread.currentThread().getId();
    public final sq60 y = new sq60(this);

    @Override // defpackage.zq60, java.lang.Iterable
    public final Iterator iterator() {
        z83.a(this.x, Thread.currentThread().getId(), "Iterator access from the thread that is different one at constructor");
        sq60 sq60Var = this.y;
        sq60Var.rewind();
        return sq60Var;
    }
}
