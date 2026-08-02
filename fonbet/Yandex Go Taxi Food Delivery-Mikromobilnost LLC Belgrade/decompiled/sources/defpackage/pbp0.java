package defpackage;

import java.util.List;

/* loaded from: classes13.dex */
public final class pbp0 implements thw0 {
    public final thw0 a;
    public final thw0 b;
    public final Object c = new Object();
    public volatile List w;

    public pbp0(thw0 thw0Var, thw0 thw0Var2) {
        this.a = thw0Var;
        this.b = thw0Var2;
    }

    @Override // defpackage.thw0
    public final Object get() {
        List list;
        List list2 = this.w;
        if (list2 != null) {
            return list2;
        }
        synchronized (this.c) {
            try {
                list = this.w;
                if (list == null) {
                    list = (List) this.a.get();
                    if (!list.isEmpty()) {
                        for (int i = 1; i < list.size(); i++) {
                            qbp0 qbp0Var = (qbp0) list.get(i - 1);
                            qbp0 qbp0Var2 = (qbp0) list.get(i);
                            if (qbp0Var.a < qbp0Var2.a && qbp0Var.b >= qbp0Var2.b) {
                            }
                        }
                        this.w = list;
                    }
                    list = (List) this.b.get();
                    this.w = list;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return list;
    }
}
