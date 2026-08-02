package defpackage;

import java.util.Iterator;

/* loaded from: classes7.dex */
public final class f081 extends x871 {
    public final /* synthetic */ int c = 1;
    public final Iterator w;
    public final /* synthetic */ Object x;

    public f081(s381 s381Var) {
        this.x = s381Var;
        this.w = s381Var.a.iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.x871
    public final Object a() {
        int i = this.c;
        Object obj = this.x;
        Iterator it = this.w;
        switch (i) {
            case 0:
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((s381) obj).b.contains(next)) {
                        break;
                    }
                }
                this.a = 3;
                break;
            default:
                while (it.hasNext()) {
                    Object next2 = it.next();
                    if (((ag71) obj).apply(next2)) {
                        break;
                    }
                }
                this.a = 3;
                break;
        }
        return null;
    }

    public f081(Iterator it, ag71 ag71Var) {
        this.w = it;
        this.x = ag71Var;
    }
}
