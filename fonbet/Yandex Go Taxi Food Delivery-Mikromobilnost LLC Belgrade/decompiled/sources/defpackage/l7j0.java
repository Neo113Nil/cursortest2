package defpackage;

import com.bumptech.glide.RequestManager;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class l7j0 implements z5e {
    public final b9j0 a;
    public final /* synthetic */ RequestManager b;

    public l7j0(RequestManager requestManager, b9j0 b9j0Var) {
        this.b = requestManager;
        this.a = b9j0Var;
    }

    @Override // defpackage.z5e
    public final void a(boolean z) {
        if (z) {
            synchronized (this.b) {
                b9j0 b9j0Var = this.a;
                Iterator it = pw21.i(b9j0Var.a).iterator();
                while (it.hasNext()) {
                    e5j0 e5j0Var = (e5j0) it.next();
                    if (!e5j0Var.b() && !e5j0Var.c()) {
                        e5j0Var.clear();
                        if (b9j0Var.c) {
                            b9j0Var.b.add(e5j0Var);
                        } else {
                            e5j0Var.j();
                        }
                    }
                }
            }
        }
    }
}
