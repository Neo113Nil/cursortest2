package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class l89 implements z880 {
    public final ArrayList a = new ArrayList();
    public final ArrayDeque b = new ArrayDeque();
    public boolean c;

    public static final class a implements x880 {
        @Override // defpackage.x880
        public final void n() {
        }

        @Override // defpackage.x880
        public final void o() {
        }
    }

    @Override // defpackage.z880
    public void a() {
        ArrayDeque arrayDeque = this.b;
        if (!arrayDeque.isEmpty() || this.c) {
            jst.e.w(new IllegalStateException("Try order taxi while taxi in other ordering process"));
        }
        arrayDeque.clear();
        this.c = true;
        b(0);
    }

    public final void b(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.a;
            if (i < arrayList.size()) {
                ArrayDeque arrayDeque = this.b;
                boolean isEmpty = arrayDeque.isEmpty();
                arrayDeque.add(Integer.valueOf(i));
                if (isEmpty) {
                    while (!arrayDeque.isEmpty()) {
                        Integer num = (Integer) arrayDeque.element();
                        k89 k89Var = new k89(this, num.intValue() + 1);
                        m89 m89Var = new m89();
                        m89Var.a = k89Var;
                        ((y880) arrayList.get(num.intValue())).a(m89Var);
                        arrayDeque.remove();
                    }
                    return;
                }
                return;
            }
        }
        jst.e.w(new IllegalStateException("Try to process invalid order chain element"));
    }
}
