package defpackage;

import java.util.ArrayDeque;

/* loaded from: classes10.dex */
public final class j430 extends v9u {
    @Override // defpackage.v9u
    public final void e(Object obj, Object obj2) {
        k430 k430Var = (k430) obj;
        k430Var.getClass();
        ArrayDeque arrayDeque = k430.b;
        synchronized (arrayDeque) {
            arrayDeque.offer(k430Var);
        }
    }
}
